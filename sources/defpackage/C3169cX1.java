package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3169cX1 implements InterfaceC5046lD1 {
    public static final String i = AS0.d("SystemJobScheduler");
    public final Context d;
    public final JobScheduler e;
    public final C4736jk2 g;
    public final C2960bX1 h;

    public C3169cX1(@NonNull Context context, @NonNull C4736jk2 c4736jk2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C2960bX1 c2960bX1 = new C2960bX1(context);
        this.d = context;
        this.g = c4736jk2;
        this.e = jobScheduler;
        this.h = c2960bX1;
    }

    public static void a(@NonNull JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            AS0.c().b(i, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public static ArrayList d(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AS0.c().b(i, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static C3429dk2 f(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C3429dk2(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.InterfaceC5046lD1
    public final boolean b() {
        return true;
    }

    @Override // defpackage.InterfaceC5046lD1
    public final void c(@NonNull String str) {
        ArrayList arrayList;
        Context context = this.d;
        JobScheduler jobScheduler = this.e;
        ArrayList<JobInfo> arrayListD = d(context, jobScheduler);
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListD) {
                C3429dk2 c3429dk2F = f(jobInfo);
                if (c3429dk2F != null && str.equals(c3429dk2F.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.g.c.r().e(str);
    }

    @Override // defpackage.InterfaceC5046lD1
    public final void e(@NonNull Bk2... bk2Arr) {
        int iIntValue;
        C4736jk2 c4736jk2 = this.g;
        WorkDatabase workDatabase = c4736jk2.c;
        final C7292vv0 c7292vv0 = new C7292vv0(workDatabase);
        for (Bk2 bk2 : bk2Arr) {
            workDatabase.c();
            try {
                Bk2 bk2O = workDatabase.u().o(bk2.a);
                String str = i;
                String str2 = bk2.a;
                if (bk2O == null) {
                    AS0.c().e(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.n();
                } else if (bk2O.b != EnumC3638ek2.d) {
                    AS0.c().e(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.n();
                } else {
                    C3429dk2 generationalId = ED.i(bk2);
                    UW1 uw1B = workDatabase.r().b(generationalId);
                    if (uw1B != null) {
                        iIntValue = uw1B.c;
                    } else {
                        c4736jk2.b.getClass();
                        final int i2 = c4736jk2.b.g;
                        Object objM = c7292vv0.a.m(new Callable() { // from class: uv0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C7292vv0 this$0 = c7292vv0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                WorkDatabase workDatabase2 = this$0.a;
                                Long lA = workDatabase2.q().a("next_job_scheduler_id");
                                int i3 = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                workDatabase2.q().b(new C5562ng1("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i2) {
                                    this$0.a.q().b(new C5562ng1("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i3 = iLongValue;
                                }
                                return Integer.valueOf(i3);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(objM, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objM).intValue();
                    }
                    if (uw1B == null) {
                        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
                        c4736jk2.c.r().d(new UW1(generationalId.a, generationalId.b, iIntValue));
                    }
                    g(bk2, iIntValue);
                    workDatabase.n();
                }
                workDatabase.j();
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
    }

    public final void g(@NonNull Bk2 bk2, int i2) {
        int i3;
        long j;
        JobScheduler jobScheduler = this.e;
        String str = i;
        C2960bX1 c2960bX1 = this.h;
        c2960bX1.getClass();
        VK vk = bk2.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = bk2.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", bk2.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", bk2.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i2, c2960bX1.a).setRequiresCharging(vk.b);
        boolean z = vk.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        int i4 = Build.VERSION.SDK_INT;
        EnumC4593j41 enumC4593j41 = vk.a;
        if (i4 < 30 || enumC4593j41 != EnumC4593j41.j) {
            int iOrdinal = enumC4593j41.ordinal();
            if (iOrdinal == 0) {
                i3 = 0;
            } else if (iOrdinal != 1) {
                i3 = 2;
                if (iOrdinal != 2) {
                    i3 = 3;
                    if (iOrdinal != 3) {
                        i3 = 4;
                        if (iOrdinal != 4 || i4 < 26) {
                            AS0 as0C = AS0.c();
                            enumC4593j41.toString();
                            as0C.getClass();
                            i3 = 1;
                        }
                    }
                }
            } else {
                i3 = 1;
            }
            extras.setRequiredNetworkType(i3);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z) {
            extras.setBackoffCriteria(bk2.m, bk2.l == EnumC1544Mp.e ? 0 : 1);
        }
        long j2 = 0;
        long jMax = Math.max(bk2.a() - System.currentTimeMillis(), 0L);
        if (i4 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!bk2.q) {
            extras.setImportantWhileForeground(true);
        }
        Set<VK.a> set = vk.h;
        if (set.isEmpty()) {
            j = 0;
        } else {
            for (VK.a aVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.a, aVar.b ? 1 : 0));
                j2 = j2;
            }
            j = j2;
            extras.setTriggerContentUpdateDelay(vk.f);
            extras.setTriggerContentMaxDelay(vk.g);
        }
        extras.setPersisted(false);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            extras.setRequiresBatteryNotLow(vk.d);
            extras.setRequiresStorageNotLow(vk.e);
        }
        boolean z2 = bk2.k > 0;
        boolean z3 = jMax > j;
        if (i5 >= 31 && bk2.q && !z2 && !z3) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        AS0.c().getClass();
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                AS0.c().e(str, "Unable to schedule work ID " + str2);
                if (bk2.q && bk2.r == EnumC7428wa1.d) {
                    bk2.q = false;
                    AS0.c().getClass();
                    g(bk2, i2);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListD = d(this.d, jobScheduler);
            int size = arrayListD != null ? arrayListD.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            C4736jk2 c4736jk2 = this.g;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(c4736jk2.c.u().i().size()), Integer.valueOf(c4736jk2.b.h));
            AS0.c().a(str, str3);
            IllegalStateException illegalStateException = new IllegalStateException(str3, e);
            c4736jk2.b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            AS0.c().b(str, "Unable to schedule " + bk2, th);
        }
    }
}

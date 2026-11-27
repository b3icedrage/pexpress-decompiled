package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4736jk2 extends AbstractC4477ik2 {
    public static C4736jk2 k;
    public static C4736jk2 l;
    public static final Object m;
    public final Context a;
    public final androidx.work.a b;
    public final WorkDatabase c;
    public final C4946kk2 d;
    public final List<InterfaceC5046lD1> e;
    public final C0743Ch1 f;
    public final C0584Ag1 g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final Q02 j;

    /* JADX INFO: renamed from: jk2$a */
    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static {
        AS0.d("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public C4736jk2(@NonNull Context context, @NonNull androidx.work.a aVar, @NonNull C4946kk2 c4946kk2) {
        QA1.a aVarA;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        TH1 executor = c4946kk2.a;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(executor, "queryExecutor");
        if (z) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            aVarA = new QA1.a(context2, WorkDatabase.class, null);
            aVarA.j = true;
        } else {
            aVarA = C3481e1.a(context2, WorkDatabase.class, "androidx.work.workdb");
            aVarA.i = new C5959pa2(context2);
        }
        Intrinsics.checkNotNullParameter(executor, "executor");
        aVarA.g = executor;
        C5677oD callback = C5677oD.a;
        Intrinsics.checkNotNullParameter(callback, "callback");
        aVarA.d.add(callback);
        aVarA.a(C5420n01.c);
        aVarA.a(new C2260Vs1(context2, 2, 3));
        aVarA.a(C5630o01.c);
        aVarA.a(C5840p01.c);
        aVarA.a(new C2260Vs1(context2, 5, 6));
        aVarA.a(C6050q01.c);
        aVarA.a(C6259r01.c);
        aVarA.a(C6469s01.c);
        aVarA.a(new C5156lk2(context2));
        aVarA.a(new C2260Vs1(context2, 10, 11));
        aVarA.a(C4787k01.d);
        aVarA.a(C4997l01.c);
        aVarA.a(C5210m01.c);
        aVarA.l = false;
        aVarA.m = true;
        WorkDatabase workDatabase = (WorkDatabase) aVarA.b();
        Context applicationContext = context.getApplicationContext();
        AS0.a aVar2 = new AS0.a(aVar.f);
        synchronized (AS0.a) {
            AS0.b = aVar2;
        }
        Q02 q02 = new Q02(applicationContext, c4946kk2);
        this.j = q02;
        int i = C6308rD1.a;
        C3169cX1 c3169cX1 = new C3169cX1(applicationContext, this);
        C3811fb1.a(applicationContext, SystemJobService.class, true);
        AS0.c().getClass();
        List<InterfaceC5046lD1> listAsList = Arrays.asList(c3169cX1, new C2241Vm0(applicationContext, aVar, q02, this));
        C0743Ch1 c0743Ch1 = new C0743Ch1(context, aVar, c4946kk2, workDatabase, listAsList);
        Context applicationContext2 = context.getApplicationContext();
        this.a = applicationContext2;
        this.b = aVar;
        this.d = c4946kk2;
        this.c = workDatabase;
        this.e = listAsList;
        this.f = c0743Ch1;
        this.g = new C0584Ag1(workDatabase);
        this.h = false;
        if (a.a(applicationContext2)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.a(new ForceStopRunnable(applicationContext2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static C4736jk2 b(@NonNull Context context) {
        C4736jk2 c4736jk2B;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        c4736jk2B = k;
                        if (c4736jk2B == null) {
                            c4736jk2B = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c4736jk2B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c4736jk2B == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof androidx.work.a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            c(applicationContext, ((androidx.work.a.b) applicationContext).a());
            c4736jk2B = b(applicationContext);
        }
        return c4736jk2B;
    }

    public static void c(@NonNull Context context, @NonNull androidx.work.a aVar) {
        synchronized (m) {
            try {
                C4736jk2 c4736jk2 = k;
                if (c4736jk2 != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c4736jk2 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new C4736jk2(applicationContext, aVar, new C4946kk2(aVar.b));
                    }
                    k = l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC4477ik2
    @NonNull
    public final P91 a(@NonNull String str, @NonNull EnumC5957pa0 enumC5957pa0, @NonNull List<K91> list) {
        return new Vj2(this, str, enumC5957pa0, list).w();
    }

    public final void d() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList arrayListD;
        WorkDatabase workDatabase = this.c;
        Context context = this.a;
        String str = C3169cX1.i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListD = C3169cX1.d(context, jobScheduler)) != null && !arrayListD.isEmpty()) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                C3169cX1.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        workDatabase.u().u();
        C6308rD1.a(this.b, workDatabase, this.e);
    }

    public final void f(@NonNull C6135qP1 c6135qP1, WorkerParameters.a aVar) {
        C4946kk2 c4946kk2 = this.d;
        RunnableC6554sP1 runnableC6554sP1 = new RunnableC6554sP1();
        runnableC6554sP1.d = this;
        runnableC6554sP1.e = c6135qP1;
        runnableC6554sP1.g = aVar;
        c4946kk2.a(runnableC6554sP1);
    }
}

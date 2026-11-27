package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import defpackage.AS0;
import defpackage.Bk2;
import defpackage.C0584Ag1;
import defpackage.C0587Ah1;
import defpackage.C3169cX1;
import defpackage.C3429dk2;
import defpackage.C4722jh0;
import defpackage.C4736jk2;
import defpackage.C5027l8;
import defpackage.C5562ng1;
import defpackage.C6308rD1;
import defpackage.Ck2;
import defpackage.EnumC3638ek2;
import defpackage.InterfaceC6418rk2;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    public static final String i = AS0.d("ForceStopRunnable");
    public static final long j = TimeUnit.DAYS.toMillis(3650);
    public final Context d;
    public final C4736jk2 e;
    public final C0584Ag1 g;
    public int h = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            AS0.d("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AS0.c().getClass();
            ForceStopRunnable.b(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull C4736jk2 c4736jk2) {
        this.d = context.getApplicationContext();
        this.e = c4736jk2;
        this.g = c4736jk2.g;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
        long jCurrentTimeMillis = System.currentTimeMillis() + j;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d6  */
    public final void a() {
        boolean z;
        C0584Ag1 c0584Ag1 = this.g;
        String str = C3169cX1.i;
        Context context = this.d;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListD = C3169cX1.d(context, jobScheduler);
        C4736jk2 c4736jk2 = this.e;
        ArrayList arrayListA = c4736jk2.c.r().a();
        HashSet hashSet = new HashSet(arrayListD != null ? arrayListD.size() : 0);
        if (arrayListD != null && !arrayListD.isEmpty()) {
            for (JobInfo jobInfo : arrayListD) {
                C3429dk2 c3429dk2F = C3169cX1.f(jobInfo);
                if (c3429dk2F != null) {
                    hashSet.add(c3429dk2F.a);
                } else {
                    C3169cX1.a(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = arrayListA.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    AS0.c().getClass();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            WorkDatabase workDatabase = c4736jk2.c;
            workDatabase.c();
            try {
                Ck2 ck2U = workDatabase.u();
                Iterator it2 = arrayListA.iterator();
                while (it2.hasNext()) {
                    ck2U.d((String) it2.next(), -1L);
                }
                workDatabase.n();
                workDatabase.j();
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
        WorkDatabase workDatabase2 = c4736jk2.c;
        Ck2 ck2U2 = workDatabase2.u();
        InterfaceC6418rk2 interfaceC6418rk2T = workDatabase2.t();
        workDatabase2.c();
        try {
            ArrayList<Bk2> arrayListK = ck2U2.k();
            boolean zIsEmpty = arrayListK.isEmpty();
            if (!zIsEmpty) {
                for (Bk2 bk2 : arrayListK) {
                    ck2U2.h(EnumC3638ek2.d, bk2.a);
                    ck2U2.d(bk2.a, -1L);
                }
            }
            interfaceC6418rk2T.c();
            workDatabase2.n();
            workDatabase2.j();
            boolean z2 = !zIsEmpty || z;
            Long lA = c4736jk2.g.a.q().a("reschedule_needed");
            if (lA != null && lA.longValue() == 1) {
                AS0.c().getClass();
                c4736jk2.e();
                C0584Ag1 c0584Ag2 = c4736jk2.g;
                c0584Ag2.getClass();
                Intrinsics.checkNotNullParameter("reschedule_needed", "key");
                c0584Ag2.a.q().b(new C5562ng1("reschedule_needed", 0L));
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i2 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                if (i2 < 30) {
                    if (broadcast == null) {
                        b(context);
                        AS0.c().getClass();
                        c4736jk2.e();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c0584Ag1.getClass();
                        c0584Ag1.a.q().b(new C5562ng1("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                        return;
                    }
                    if (z2) {
                        AS0.c().getClass();
                        C6308rD1.a(c4736jk2.b, c4736jk2.c, c4736jk2.e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = c0584Ag1.a.q().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo applicationExitInfoA = C4722jh0.a(historicalProcessExitReasons.get(i4));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jLongValue) {
                            AS0.c().getClass();
                            c4736jk2.e();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            c0584Ag1.getClass();
                            c0584Ag1.a.q().b(new C5562ng1("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                            return;
                        }
                    }
                }
                if (z2) {
                    AS0.c().getClass();
                    C6308rD1.a(c4736jk2.b, c4736jk2.c, c4736jk2.e);
                }
            } catch (IllegalArgumentException e) {
                e = e;
                if (((AS0.a) AS0.c()).c <= 5) {
                    b0.f(i, "Ignoring exception", e);
                }
            } catch (SecurityException e2) {
                e = e2;
                if (((AS0.a) AS0.c()).c <= 5) {
                    b0.f(i, "Ignoring exception", e);
                }
            }
        } catch (Throwable th2) {
            workDatabase2.j();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        String str = i;
        C4736jk2 c4736jk2 = this.e;
        try {
            a aVar = c4736jk2.b;
            aVar.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.d;
            if (zIsEmpty) {
                AS0.c().getClass();
                zA = true;
            } else {
                zA = C0587Ah1.a(context, aVar);
                AS0.c().getClass();
            }
            if (!zA) {
                c4736jk2.d();
                return;
            }
            while (true) {
                try {
                    C5027l8.u(context);
                    AS0.c().getClass();
                    try {
                        a();
                        c4736jk2.d();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        int i2 = this.h + 1;
                        this.h = i2;
                        if (i2 >= 3) {
                            AS0.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            c4736jk2.b.getClass();
                            throw illegalStateException;
                        }
                        AS0.c().getClass();
                        try {
                            Thread.sleep(((long) this.h) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    AS0.c().a(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    c4736jk2.b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            c4736jk2.d();
            throw th;
        }
    }
}

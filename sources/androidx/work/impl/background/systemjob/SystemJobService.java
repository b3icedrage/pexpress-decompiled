package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import defpackage.AS0;
import defpackage.C0743Ch1;
import defpackage.C3429dk2;
import defpackage.C4736jk2;
import defpackage.C6135qP1;
import defpackage.C6344rP1;
import defpackage.JQ1;
import defpackage.R90;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements R90 {
    public static final String h = AS0.d("SystemJobService");
    public C4736jk2 d;
    public final HashMap e = new HashMap();
    public final C6344rP1 g = new C6344rP1();

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static C3429dk2 b(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C3429dk2(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.R90
    public final void a(@NonNull C3429dk2 c3429dk2, boolean z) {
        JobParameters jobParameters;
        AS0.c().getClass();
        synchronized (this.e) {
            jobParameters = (JobParameters) this.e.remove(c3429dk2);
        }
        this.g.b(c3429dk2);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C4736jk2 c4736jk2B = C4736jk2.b(getApplicationContext());
            this.d = c4736jk2B;
            c4736jk2B.f.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            AS0.c().e(h, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C4736jk2 c4736jk2 = this.d;
        if (c4736jk2 != null) {
            c4736jk2.f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        if (this.d == null) {
            AS0.c().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        C3429dk2 c3429dk2B = b(jobParameters);
        if (c3429dk2B == null) {
            AS0.c().a(h, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.e) {
            try {
                if (this.e.containsKey(c3429dk2B)) {
                    AS0 as0C = AS0.c();
                    c3429dk2B.toString();
                    as0C.getClass();
                    return false;
                }
                AS0 as0C2 = AS0.c();
                c3429dk2B.toString();
                as0C2.getClass();
                this.e.put(c3429dk2B, jobParameters);
                int i = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.a = Arrays.asList(a.a(jobParameters));
                }
                if (i >= 28) {
                    aVar.c = b.a(jobParameters);
                }
                this.d.f(this.g.d(c3429dk2B), aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        boolean zContains;
        if (this.d == null) {
            AS0.c().getClass();
            return true;
        }
        C3429dk2 c3429dk2B = b(jobParameters);
        if (c3429dk2B == null) {
            AS0.c().a(h, "WorkSpec id not found!");
            return false;
        }
        AS0 as0C = AS0.c();
        c3429dk2B.toString();
        as0C.getClass();
        synchronized (this.e) {
            this.e.remove(c3429dk2B);
        }
        C6135qP1 c6135qP1B = this.g.b(c3429dk2B);
        if (c6135qP1B != null) {
            C4736jk2 c4736jk2 = this.d;
            c4736jk2.d.a(new JQ1(c4736jk2, c6135qP1B, false));
        }
        C0743Ch1 c0743Ch1 = this.d.f;
        String str = c3429dk2B.a;
        synchronized (c0743Ch1.p) {
            zContains = c0743Ch1.n.contains(str);
        }
        return !zContains;
    }
}

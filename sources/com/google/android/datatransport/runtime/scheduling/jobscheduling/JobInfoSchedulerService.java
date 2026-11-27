package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.C1778Po;
import defpackage.C3081c52;
import defpackage.C7456wh1;
import defpackage.C7639xa2;
import defpackage.EnumC6825th1;
import defpackage.RunnableC3117cG0;
import defpackage.RunnableC5749oa2;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int d = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C3081c52.b(getApplicationContext());
        if (string == null) {
            throw new NullPointerException("Null backendName");
        }
        EnumC6825th1 enumC6825th1B = C7456wh1.b(i);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        C7639xa2 c7639xa2 = C3081c52.a().d;
        C1778Po c1778Po = new C1778Po(string, bArrDecode, enumC6825th1B);
        RunnableC3117cG0 runnableC3117cG0 = new RunnableC3117cG0(0, this, jobParameters);
        c7639xa2.getClass();
        c7639xa2.e.execute(new RunnableC5749oa2(c7639xa2, c1778Po, i2, runnableC3117cG0));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

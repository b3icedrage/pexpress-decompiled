package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: bG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2908bG0 implements Ak2 {
    public final Context a;
    public final T80 b;
    public final AbstractC5259mD1 c;

    public C2908bG0(Context context, T80 t80, AbstractC5259mD1 abstractC5259mD1) {
        this.a = context;
        this.b = t80;
        this.c = abstractC5259mD1;
    }

    @Override // defpackage.Ak2
    public final void a(V42 v42, int i) {
        b(v42, i, false);
    }

    @Override // defpackage.Ak2
    public final void b(V42 v42, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(v42.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C7456wh1.a(v42.c())).array());
        if (v42.b() != null) {
            adler32.update(v42.b());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    OS0.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", v42);
                    return;
                }
            }
        }
        long jJ0 = this.b.j0(v42);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        EnumC6825th1 enumC6825th1C = v42.c();
        AbstractC5259mD1 abstractC5259mD1 = this.c;
        builder.setMinimumLatency(abstractC5259mD1.b(enumC6825th1C, jJ0, i));
        Set<AbstractC5259mD1.b> setB = abstractC5259mD1.c().get(enumC6825th1C).b();
        if (setB.contains(AbstractC5259mD1.b.d)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(AbstractC5259mD1.b.g)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(AbstractC5259mD1.b.e)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", v42.a());
        persistableBundle.putInt("priority", C7456wh1.a(v42.c()));
        if (v42.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(v42.b(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {v42, Integer.valueOf(value), Long.valueOf(abstractC5259mD1.b(v42.c(), jJ0, i)), Long.valueOf(jJ0), Integer.valueOf(i)};
        if (Log.isLoggable(OS0.c("JobInfoScheduler"), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }
}

package defpackage;

import android.content.Context;
import com.appsflyer.internal.AFi1bSDK;

/* JADX INFO: renamed from: dX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3377dX implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC3377dX(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Runnable runnable = (Runnable) this.e;
                ScheduledFutureC4006gX.a aVar = (ScheduledFutureC4006gX.a) this.g;
                try {
                    runnable.run();
                    ScheduledFutureC4006gX scheduledFutureC4006gX = ScheduledFutureC4006gX.this;
                    scheduledFutureC4006gX.getClass();
                    if (AbstractC2853b1.j.b(scheduledFutureC4006gX, null, AbstractC2853b1.k)) {
                        AbstractC2853b1.i(scheduledFutureC4006gX);
                    }
                } catch (Exception e) {
                    aVar.a(e);
                    return;
                }
                break;
            case 1:
                AFi1bSDK.AFKeystoreWrapper((AFi1bSDK) this.e, (Context) this.g);
                break;
            default:
                try {
                    ((RunnableC3446dq) this.e).run();
                } catch (Throwable th) {
                    ((C2688aH1) this.g).getLogger().d(NG1.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th);
                }
                break;
        }
    }
}

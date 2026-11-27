package defpackage;

import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.EnvelopeFileObserverIntegration;
import io.sentry.util.C4527a;

/* JADX INFO: renamed from: Ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC1212Ii implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ RunnableC1212Ii(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.g = obj;
        this.h = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC1368Ki.m8decorViewReady$lambda1((ViewTreeObserverOnGlobalLayoutListenerC1368Ki) this.g, (Runnable) this.e, (ViewTreeObserverOnGlobalLayoutListenerC1368Ki) this.h);
                return;
            case 1:
                ScheduledExecutorServiceC3796fX scheduledExecutorServiceC3796fX = (ScheduledExecutorServiceC3796fX) this.g;
                scheduledExecutorServiceC3796fX.d.execute(new RunnableC3377dX(0, (Runnable) this.e, (ScheduledFutureC4006gX.a) this.h));
                return;
            case 2:
                ((ActivityLifecycleIntegration) this.g).getClass();
                ActivityLifecycleIntegration.f((InterfaceC2347Wu0) this.h, (InterfaceC2347Wu0) this.e);
                return;
            default:
                C2688aH1 c2688aH1 = (C2688aH1) this.h;
                String str = (String) this.e;
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.g;
                C4527a.C0404a c0404aA = envelopeFileObserverIntegration.h.a();
                try {
                    if (!envelopeFileObserverIntegration.g) {
                        envelopeFileObserverIntegration.c(c2688aH1, str);
                        break;
                    }
                    c0404aA.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c0404aA.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ RunnableC1212Ii(Object obj, Runnable runnable, Object obj2, int i) {
        this.d = i;
        this.g = obj;
        this.e = runnable;
        this.h = obj2;
    }
}

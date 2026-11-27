package defpackage;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.android.core.AppState;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.anr.e;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: h80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4140h80 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC4140h80(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((InterfaceC5871p80) ((Map.Entry) this.e).getKey()).a((Y70) this.g);
                break;
            case 1:
                ((InterfaceC1405Ku0) this.g).a(((RD1) this.e).p().getShutdownTimeoutMillis());
                break;
            case 2:
                ((AppState) this.e).getClass();
                AppState.LifecycleObserver lifecycleObserver = (AppState.LifecycleObserver) this.g;
                if (lifecycleObserver != null) {
                    ProcessLifecycleOwner.m.j.c(lifecycleObserver);
                }
                break;
            default:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.e;
                e eVar = (e) this.g;
                anrProfilingIntegration.getClass();
                if (eVar != null) {
                    try {
                        eVar.close();
                    } catch (IOException unused) {
                        anrProfilingIntegration.m.a(NG1.WARNING, "Failed to close AnrProfileManager", new Object[0]);
                    }
                    break;
                }
                break;
        }
    }
}

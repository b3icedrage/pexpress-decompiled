package defpackage;

import android.view.Window;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFe1ySDK;
import io.sentry.android.core.internal.util.t;
import io.sentry.android.core.internal.util.u;
import io.sentry.android.core.internal.util.v;
import io.sentry.cache.m;
import io.sentry.protocol.F;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class W10 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ W10(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AI1 stateContext = (AI1) this.e;
                Intrinsics.checkNotNullParameter(stateContext, "$stateContext");
                X10 this$0 = (X10) this.g;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                stateContext.c(C6954uJ.class);
                this$0.d.a(AbstractC4645jK.b.a);
                this$0.b.d();
                break;
            case 1:
                ((C0743Ch1) this.e).a((C3429dk2) this.g, false);
                break;
            case 2:
                C2872b52 c2872b52 = (C2872b52) this.e;
                c2872b52.getClass();
                C2981bd1 c2981bd1 = (C2981bd1) this.g;
                c2872b52.d(c2981bd1.a, c2981bd1.b);
                break;
            case 3:
                AFe1wSDK.unregisterClient((AFe1wSDK) this.e, (AFe1ySDK) this.g);
                break;
            case 4:
                Window window = (Window) this.g;
                v vVar = (v) this.e;
                vVar.getClass();
                try {
                    if (vVar.e.remove(window)) {
                        u uVar = vVar.l;
                        t tVar = vVar.m;
                        uVar.getClass();
                        if (tVar != null) {
                            window.removeOnFrameMetricsAvailableListener(tVar);
                        }
                    }
                } catch (Throwable th) {
                    vVar.g.d(NG1.ERROR, "Failed to remove frameMetricsAvailableListener", th);
                    return;
                }
                break;
            default:
                m mVar = (m) this.e;
                F f = (F) this.g;
                if (f != null) {
                    mVar.f(f, "user.json");
                } else {
                    mVar.a("user.json");
                }
                break;
        }
    }
}

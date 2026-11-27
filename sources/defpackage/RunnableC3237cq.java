package defpackage;

import android.os.Handler;
import com.appsflyer.AFLogger;
import com.appsflyer.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3237cq implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC3237cq(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ViewOnTouchListenerC3656eq.setParams$lambda$1((ViewOnTouchListenerC3656eq) this.e);
                break;
            case 1:
                C8062zb1 this$0 = (C8062zb1) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Handler handler = this$0.f;
                RunnableC7221vb1 runnableC7221vb1 = this$0.g;
                handler.removeCallbacks(runnableC7221vb1);
                int i = this$0.h + 1;
                this$0.h = i;
                if (i != 30) {
                    this$0.f.postDelayed(runnableC7221vb1, 500L);
                } else {
                    runnableC7221vb1.run();
                }
                break;
            default:
                AFLogger.unregisterClient((e) this.e);
                break;
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import com.appsflyer.internal.AFi1gSDK;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FR implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ FR(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                GR gr = (GR) this.e;
                Process.setThreadPriority(gr.g);
                StrictMode.ThreadPolicy threadPolicy = gr.h;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.g).run();
                break;
            case 1:
                OP1 this$0 = (OP1) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ML0 handler = (ML0) this.g;
                Intrinsics.checkNotNullParameter(handler, "$handler");
                this$0.O(handler);
                break;
            default:
                ((AFi1gSDK) this.e).registerClient((Context) this.g);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FR(OP1 op1, Function1 function1) {
        this.d = 1;
        this.e = op1;
        this.g = (ML0) function1;
    }
}

package defpackage;

import android.widget.ImageView;
import com.appsflyer.internal.AFe1fSDK;
import com.appsflyer.sdk_base.referrer.Referrer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6836tk0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC6836tk0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                OP1 this$0 = (OP1) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FR runnable = (FR) this.g;
                Intrinsics.checkNotNullParameter(runnable, "$runnable");
                this$0.b.execute(runnable);
                break;
            case 1:
                C3435dm0.b((ImageView) this.e, (String) this.g);
                break;
            case 2:
                ZY0 zy0 = (ZY0) this.e;
                C6589sb c6589sbB = zy0.b((QZ1) this.g);
                if (c6589sbB != null) {
                    zy0.b.add(c6589sbB);
                }
                break;
            default:
                AFe1fSDK.unregisterClient((Referrer) this.e, (AFe1fSDK) this.g);
                break;
        }
    }
}

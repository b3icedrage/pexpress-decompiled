package defpackage;

import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class O8 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ O8(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.g;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                S8 this$0 = (S8) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C7129v8 agent = (C7129v8) obj;
                Intrinsics.checkNotNullParameter(agent, "$agent");
                this$0.g.p().b(new XT(Long.parseLong(agent.a), agent.c, agent.d, agent.e));
                break;
            case 1:
                ((WebView) obj2).loadUrl(((InterfaceC2205Va0.f) obj).a);
                break;
            default:
                AbstractC6626sk0 this$1 = (AbstractC6626sk0) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                AbstractC6626sk0.a doAfter = (AbstractC6626sk0.a) obj;
                Intrinsics.checkNotNullParameter(doAfter, "$doAfter");
                try {
                    this$1.b();
                } catch (Exception e) {
                    C4201hS c4201hS = C6104qF0.a;
                    C6104qF0.c("Notification channel creation error", e);
                }
                this$1.b.b().execute(new P8(1, this$1, doAfter));
                break;
        }
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7221vb1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC7221vb1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                C8062zb1 this$0 = (C8062zb1) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P(new C0803Db1(this$0.h == 30, this$0));
                break;
            default:
                ((C4484im1) this.e).q();
                break;
        }
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Er1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0929Er1 implements InterfaceC4819k81<C3457dt1<Boolean>> {
    public final /* synthetic */ EY0 a;

    public C0929Er1(EY0 ey0) {
        this.a = ey0;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(C3457dt1<Boolean> c3457dt1) {
        C5818ot1 c5818ot1 = new C5818ot1(c3457dt1);
        C0695Br1 consumer = new C0695Br1(1);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        c5818ot1.b = consumer;
        EY0 ey0 = this.a;
        C0773Cr1 consumer2 = new C0773Cr1(ey0, this);
        Intrinsics.checkNotNullParameter(consumer2, "consumer");
        c5818ot1.e = consumer2;
        C0851Dr1 consumer3 = new C0851Dr1(ey0, this);
        Intrinsics.checkNotNullParameter(consumer3, "consumer");
        c5818ot1.d = consumer3;
        c5818ot1.a();
    }
}

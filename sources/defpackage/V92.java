package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class V92 implements InterfaceC4819k81<C3457dt1<Object>> {
    public final /* synthetic */ EY0 a;

    public V92(EY0 ey0) {
        this.a = ey0;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(C3457dt1<Object> c3457dt1) {
        C5818ot1 c5818ot1 = new C5818ot1(c3457dt1);
        S92 consumer = new S92(1);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        c5818ot1.b = consumer;
        EY0 ey0 = this.a;
        T92 consumer2 = new T92(ey0, this);
        Intrinsics.checkNotNullParameter(consumer2, "consumer");
        c5818ot1.e = consumer2;
        U92 consumer3 = new U92(ey0, this);
        Intrinsics.checkNotNullParameter(consumer3, "consumer");
        c5818ot1.d = consumer3;
        c5818ot1.a();
    }
}

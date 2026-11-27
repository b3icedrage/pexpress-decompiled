package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: aR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2717aR0 implements InterfaceC4819k81<C3457dt1<Object>> {
    public final /* synthetic */ ML0 a;
    public final /* synthetic */ EY0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2717aR0(EY0 ey0, Function1 function1) {
        this.a = (ML0) function1;
        this.b = ey0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // defpackage.InterfaceC4819k81
    public final void d(C3457dt1<Object> c3457dt1) {
        C3457dt1<Object> c3457dt2 = c3457dt1;
        C5818ot1 c5818ot1 = new C5818ot1(c3457dt2);
        this.a.invoke(c5818ot1);
        C5818ot1 c5818ot2 = new C5818ot1(c3457dt2);
        EY0 ey0 = this.b;
        YQ0 consumer = new YQ0(0, ey0, this);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        c5818ot2.e = consumer;
        ZQ0 consumer2 = new ZQ0(0, ey0, this);
        Intrinsics.checkNotNullParameter(consumer2, "consumer");
        c5818ot2.d = consumer2;
        c5818ot2.a();
        c5818ot1.a();
    }
}

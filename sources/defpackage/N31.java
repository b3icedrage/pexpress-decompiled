package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class N31 implements InterfaceC5331mb0<WM.a> {
    public final InterfaceC1454Lk1 a;

    public N31(C5208m0 c5208m0, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.a = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C3903g11 moshi = (C3903g11) this.a.get();
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        if (moshi == null) {
            throw new NullPointerException("moshi == null");
        }
        C4113h11 c4113h11 = new C4113h11(moshi);
        Intrinsics.checkNotNullExpressionValue(c4113h11, "create(moshi)");
        return c4113h11;
    }
}

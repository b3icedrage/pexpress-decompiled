package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Q31 implements InterfaceC5331mb0<C4705jd.a> {
    public final InterfaceC1454Lk1 a;

    public Q31(C5208m0 c5208m0, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.a = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C3903g11 moshi = (C3903g11) this.a.get();
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new C4915kd(moshi);
    }
}

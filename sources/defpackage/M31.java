package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class M31 implements InterfaceC5331mb0<InterfaceC1179Hx.a> {
    public final InterfaceC1454Lk1 a;
    public final Q31 b;

    public M31(C5208m0 c5208m0, InterfaceC1454Lk1 interfaceC1454Lk1, Q31 q31) {
        this.a = interfaceC1454Lk1;
        this.b = q31;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        InterfaceC5889pD1 schedulers = (InterfaceC5889pD1) this.a.get();
        C4705jd.a responseFactory = (C4705jd.a) this.b.get();
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(responseFactory, "responseFactory");
        return new XQ0(schedulers, responseFactory);
    }
}

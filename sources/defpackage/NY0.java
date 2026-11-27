package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class NY0 implements Function0 {
    public final OY0 d;
    public final C3637ek1 e;
    public final C2850b00 g;

    public NY0(OY0 oy0, C3637ek1 c3637ek1, C2850b00 c2850b00) {
        this.d = oy0;
        this.e = c3637ek1;
        this.g = c2850b00;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OY0 oy0 = this.d;
        AbstractC6208qk1 abstractC6208qk1A = oy0.a(oy0.a.c);
        Intrinsics.checkNotNull(abstractC6208qk1A);
        InterfaceC0882Ec<InterfaceC1583Nc, CK<?>> interfaceC0882Ec = oy0.a.a.e;
        AbstractC4649jL0 abstractC4649jL0N = this.g.n();
        Intrinsics.checkNotNullExpressionValue(abstractC4649jL0N, "getReturnType(...)");
        return interfaceC0882Ec.d(abstractC6208qk1A, this.e, abstractC4649jL0N);
    }
}

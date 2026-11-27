package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MO0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object g;
    public final Object h;

    public /* synthetic */ MO0(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                QO0 qo0 = (QO0) this.e;
                C2720aS0 c2720aS0 = qo0.b.a.a;
                NO0 no0 = new NO0(qo0, (InterfaceC6520sE0) this.g, (C3027bp1) this.h);
                c2720aS0.getClass();
                return new C2720aS0.f(c2720aS0, no0);
            default:
                OY0 oy0 = (OY0) this.e;
                AbstractC6208qk1 abstractC6208qk1A = oy0.a(oy0.a.c);
                Intrinsics.checkNotNull(abstractC6208qk1A);
                InterfaceC0882Ec<InterfaceC1583Nc, CK<?>> interfaceC0882Ec = oy0.a.a.e;
                AbstractC4649jL0 abstractC4649jL0N = ((C2850b00) this.h).n();
                Intrinsics.checkNotNullExpressionValue(abstractC4649jL0N, "getReturnType(...)");
                return interfaceC0882Ec.a(abstractC6208qk1A, (C3637ek1) this.g, abstractC4649jL0N);
        }
    }
}

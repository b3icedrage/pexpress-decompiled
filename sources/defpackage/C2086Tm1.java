package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Tm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2086Tm1 extends T62 {

    @NotNull
    public static final VE0 d;

    @NotNull
    public static final VE0 e;

    @NotNull
    public final Cm2 b;

    @NotNull
    public final M62 c;

    static {
        EnumC2880b72 enumC2880b72 = EnumC2880b72.e;
        d = C3686f.q(enumC2880b72, false, null, 5).c(YE0.g);
        e = C3686f.q(enumC2880b72, false, null, 5).c(YE0.e);
    }

    public C2086Tm1() {
        Cm2 cm2 = new Cm2();
        this.b = cm2;
        this.c = new M62(cm2);
    }

    @Override // defpackage.T62
    public final N62 e(AbstractC4649jL0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new P62(i(key, new VE0(EnumC2880b72.e, false, false, null, 62)));
    }

    public final Pair<AbstractC5706oM1, Boolean> h(AbstractC5706oM1 abstractC5706oM1, FC fc, VE0 ve0) {
        if (abstractC5706oM1.V0().b().isEmpty()) {
            return new Pair<>(abstractC5706oM1, Boolean.FALSE);
        }
        if (RK0.y(abstractC5706oM1)) {
            N62 n62 = abstractC5706oM1.T0().get(0);
            EnumC3610ed2 enumC3610ed2B = n62.b();
            AbstractC4649jL0 type = n62.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return new Pair<>(C5492nL0.c(abstractC5706oM1.U0(), abstractC5706oM1.V0(), VE.c(new P62(i(type, ve0), enumC3610ed2B)), abstractC5706oM1.W0(), null), Boolean.FALSE);
        }
        if (C3686f.n(abstractC5706oM1)) {
            return new Pair<>(R70.c(Q70.ERROR_RAW_TYPE, abstractC5706oM1.V0().toString()), Boolean.FALSE);
        }
        QY0 qy0H0 = fc.h0(this);
        Intrinsics.checkNotNullExpressionValue(qy0H0, "getMemberScope(...)");
        C5655o62 c5655o62U0 = abstractC5706oM1.U0();
        InterfaceC6494s62 interfaceC6494s62P = fc.p();
        Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P, "getTypeConstructor(...)");
        List<H62> listB = fc.p().b();
        Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
        ArrayList arrayList = new ArrayList(XE.m(listB, 10));
        for (H62 h62 : listB) {
            Intrinsics.checkNotNull(h62);
            M62 m62 = this.c;
            arrayList.add(this.b.f(h62, ve0, m62, m62.b(h62, ve0)));
        }
        return new Pair<>(C5492nL0.e(c5655o62U0, interfaceC6494s62P, arrayList, abstractC5706oM1.W0(), qy0H0, new DK(fc, this, abstractC5706oM1, ve0)), Boolean.TRUE);
    }

    public final AbstractC4649jL0 i(AbstractC4649jL0 abstractC4649jL0, VE0 ve0) {
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        if (interfaceC5044lDC instanceof H62) {
            ve0.getClass();
            return i(this.c.b((H62) interfaceC5044lDC, VE0.a(ve0, null, true, null, null, 59)), ve0);
        }
        if (!(interfaceC5044lDC instanceof FC)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC5044lDC).toString());
        }
        InterfaceC5044lD interfaceC5044lDC2 = C6621sj.q(abstractC4649jL0).V0().c();
        if (interfaceC5044lDC2 instanceof FC) {
            Pair<AbstractC5706oM1, Boolean> pairH = h(C6621sj.m(abstractC4649jL0), (FC) interfaceC5044lDC, d);
            AbstractC5706oM1 abstractC5706oM1 = pairH.d;
            boolean zBooleanValue = pairH.e.booleanValue();
            Pair<AbstractC5706oM1, Boolean> pairH2 = h(C6621sj.q(abstractC4649jL0), (FC) interfaceC5044lDC2, e);
            AbstractC5706oM1 abstractC5706oM2 = pairH2.d;
            return (zBooleanValue || pairH2.e.booleanValue()) ? new C2242Vm1(abstractC5706oM1, abstractC5706oM2) : C5492nL0.a(abstractC5706oM1, abstractC5706oM2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC5044lDC2 + "\" while for lower it's \"" + interfaceC5044lDC + '\"').toString());
    }
}

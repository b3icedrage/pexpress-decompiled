package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3533eF0 {

    @NotNull
    public final LO0 a;

    @NotNull
    public final L62 b;

    @NotNull
    public final Cm2 c;

    @NotNull
    public final M62 d;

    public C3533eF0(@NotNull LO0 c, @NotNull L62 typeParameterResolver) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        this.a = c;
        this.b = typeParameterResolver;
        Cm2 cm2 = new Cm2();
        this.c = cm2;
        this.d = new M62(cm2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:105:0x0200  */
    /* JADX WARN: Code duplicated, block: B:107:0x0210  */
    /* JADX WARN: Code duplicated, block: B:108:0x0217  */
    /* JADX WARN: Code duplicated, block: B:112:0x0253  */
    /* JADX WARN: Code duplicated, block: B:114:0x0263  */
    /* JADX WARN: Code duplicated, block: B:117:0x0276 A[LOOP:1: B:115:0x0270->B:117:0x0276, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x029c  */
    /* JADX WARN: Code duplicated, block: B:122:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:134:0x0303  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e1  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0161, code lost:
    
        if (r3 != null) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v8, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [oM1] */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [s62] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC5706oM1 a(defpackage.InterfaceC4370iE0 r20, defpackage.VE0 r21, defpackage.AbstractC5706oM1 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3533eF0.a(iE0, VE0, oM1):oM1");
    }

    public final InterfaceC6494s62 b(InterfaceC4370iE0 interfaceC4370iE0) {
        interfaceC4370iE0.A();
        throw null;
    }

    @NotNull
    public final P92 c(@NotNull ZD0 arrayType, @NotNull VE0 attr, boolean z) {
        Intrinsics.checkNotNullParameter(arrayType, "arrayType");
        Intrinsics.checkNotNullParameter(attr, "attr");
        TE0 te0K = arrayType.K();
        GE0 ge0 = te0K instanceof GE0 ? (GE0) te0K : null;
        EnumC6405rh1 type = ge0 != null ? ge0.getType() : null;
        LO0 lo0 = this.a;
        C6970uO0 c6970uO0 = new C6970uO0(lo0, arrayType, true);
        boolean z2 = attr.d;
        KE0 ke0 = lo0.a;
        if (type != null) {
            AbstractC5706oM1 abstractC5706oM1Q = ke0.o.h.q(type);
            Intrinsics.checkNotNull(abstractC5706oM1Q);
            AbstractC4649jL0 abstractC4649jL0U = C0564Aa.u(abstractC5706oM1Q, new DH(abstractC5706oM1Q.k(), c6970uO0));
            Intrinsics.c(abstractC4649jL0U, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            AbstractC5706oM1 abstractC5706oM1 = (AbstractC5706oM1) abstractC4649jL0U;
            return z2 ? abstractC5706oM1 : C5492nL0.a(abstractC5706oM1, abstractC5706oM1.Z0(true));
        }
        AbstractC4649jL0 abstractC4649jL0D = d(te0K, C3686f.q(EnumC2880b72.e, z2, null, 6));
        if (z2) {
            AbstractC5706oM1 abstractC5706oM1H = ke0.o.h.h(z ? EnumC3610ed2.OUT_VARIANCE : EnumC3610ed2.INVARIANT, abstractC4649jL0D, c6970uO0);
            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1H, "getArrayType(...)");
            return abstractC5706oM1H;
        }
        AbstractC5706oM1 abstractC5706oM1H2 = ke0.o.h.h(EnumC3610ed2.INVARIANT, abstractC4649jL0D, c6970uO0);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1H2, "getArrayType(...)");
        return C5492nL0.a(abstractC5706oM1H2, ke0.o.h.h(EnumC3610ed2.OUT_VARIANCE, abstractC4649jL0D, c6970uO0).Z0(true));
    }

    @NotNull
    public final AbstractC4649jL0 d(@Nullable TE0 te0, @NotNull VE0 attr) {
        AbstractC4649jL0 abstractC4649jL0D;
        Intrinsics.checkNotNullParameter(attr, "attr");
        boolean z = te0 instanceof GE0;
        LO0 lo0 = this.a;
        if (z) {
            EnumC6405rh1 type = ((GE0) te0).getType();
            AbstractC5706oM1 abstractC5706oM1S = type != null ? lo0.a.o.h.s(type) : lo0.a.o.h.w();
            Intrinsics.checkNotNull(abstractC5706oM1S);
            return abstractC5706oM1S;
        }
        boolean z2 = false;
        if (te0 instanceof InterfaceC4370iE0) {
            InterfaceC4370iE0 interfaceC4370iE0 = (InterfaceC4370iE0) te0;
            if (!attr.d) {
                if (attr.a != EnumC2880b72.d) {
                    z2 = true;
                }
            }
            boolean z3 = interfaceC4370iE0.z();
            if (!z3 && !z2) {
                AbstractC5706oM1 abstractC5706oM1A = a(interfaceC4370iE0, attr, null);
                return abstractC5706oM1A != null ? abstractC5706oM1A : R70.c(Q70.UNRESOLVED_JAVA_CLASS, interfaceC4370iE0.q());
            }
            AbstractC5706oM1 abstractC5706oM1A2 = a(interfaceC4370iE0, attr.c(YE0.g), null);
            if (abstractC5706oM1A2 == null) {
                return R70.c(Q70.UNRESOLVED_JAVA_CLASS, interfaceC4370iE0.q());
            }
            AbstractC5706oM1 abstractC5706oM1A3 = a(interfaceC4370iE0, attr.c(YE0.e), abstractC5706oM1A2);
            if (abstractC5706oM1A3 == null) {
                return R70.c(Q70.UNRESOLVED_JAVA_CLASS, interfaceC4370iE0.q());
            }
            return z3 ? new C2242Vm1(abstractC5706oM1A2, abstractC5706oM1A3) : C5492nL0.a(abstractC5706oM1A2, abstractC5706oM1A3);
        }
        if (te0 instanceof ZD0) {
            return c((ZD0) te0, attr, false);
        }
        if (te0 instanceof InterfaceC5051lF0) {
            AbstractC1235Ip1 abstractC1235Ip1X = ((InterfaceC5051lF0) te0).x();
            if (abstractC1235Ip1X != null && (abstractC4649jL0D = d(abstractC1235Ip1X, attr)) != null) {
                return abstractC4649jL0D;
            }
            AbstractC5706oM1 abstractC5706oM1M = lo0.a.o.h.m();
            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1M, "getDefaultBound(...)");
            return abstractC5706oM1M;
        }
        if (te0 == null) {
            AbstractC5706oM1 abstractC5706oM1M2 = lo0.a.o.h.m();
            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1M2, "getDefaultBound(...)");
            return abstractC5706oM1M2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + te0);
    }
}

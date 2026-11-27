package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class M62 {

    @NotNull
    public final Cm2 a;

    @NotNull
    public final KW1 b;

    @NotNull
    public final C2720aS0.k c;

    public static final class a {

        @NotNull
        public final H62 a;

        @NotNull
        public final VE0 b;

        public a(@NotNull H62 typeParameter, @NotNull VE0 typeAttr) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            this.a = typeParameter;
            this.b = typeAttr;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(aVar.a, this.a) && Intrinsics.a(aVar.b, this.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode();
            return this.b.hashCode() + (iHashCode * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
        }
    }

    public M62(Cm2 projectionComputer) {
        LL options = new LL(15);
        Intrinsics.checkNotNullParameter(projectionComputer, "projectionComputer");
        Intrinsics.checkNotNullParameter(options, "options");
        this.a = projectionComputer;
        C2720aS0 c2720aS0 = new C2720aS0("Type parameter upper bound erasure results");
        int i = 3;
        this.b = XO0.b(new C4850kI0(this, i));
        C2720aS0.k kVarE = c2720aS0.e(new C4321i1(this, i));
        Intrinsics.checkNotNullExpressionValue(kVarE, "createMemoizedFunction(...)");
        this.c = kVarE;
    }

    public final P92 a(VE0 ve0) {
        P92 p92V;
        AbstractC5706oM1 abstractC5706oM1 = ve0.f;
        return (abstractC5706oM1 == null || (p92V = C0564Aa.v(abstractC5706oM1)) == null) ? (O70) this.b.getValue() : p92V;
    }

    @NotNull
    public final AbstractC4649jL0 b(@NotNull H62 typeParameter, @NotNull VE0 typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Object objInvoke = this.c.invoke(new a(typeParameter, typeAttr));
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (AbstractC4649jL0) objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc  */
    public final C3337dJ1 c(X62 substitutor, List list, VE0 ve0) {
        P92 p92D;
        C3337dJ1 c3337dJ1 = new C3337dJ1();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) it.next();
            InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
            if (interfaceC5044lDC instanceof FC) {
                Set<H62> setB = ve0.b();
                Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
                Intrinsics.checkNotNullParameter(substitutor, "substitutor");
                P92 p92Y0 = abstractC4649jL0.Y0();
                if (p92Y0 instanceof AbstractC2299We0) {
                    AbstractC2299We0 abstractC2299We0 = (AbstractC2299We0) p92Y0;
                    AbstractC5706oM1 abstractC5706oM1D = abstractC2299We0.e;
                    if (!abstractC5706oM1D.V0().b().isEmpty() && abstractC5706oM1D.V0().c() != null) {
                        List<H62> listB = abstractC5706oM1D.V0().b();
                        Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
                        ArrayList arrayList = new ArrayList(XE.m(listB, 10));
                        for (H62 h62 : listB) {
                            N62 c4662jP1 = (N62) CollectionsKt.H(h62.l(), abstractC4649jL0.T0());
                            boolean z = setB != null && setB.contains(h62);
                            if (c4662jP1 == null || z) {
                                c4662jP1 = new C4662jP1(h62);
                            } else {
                                T62 t62G = substitutor.g();
                                AbstractC4649jL0 type = c4662jP1.getType();
                                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                                if (t62G.e(type) == null) {
                                    c4662jP1 = new C4662jP1(h62);
                                }
                            }
                            arrayList.add(c4662jP1);
                        }
                        abstractC5706oM1D = V62.d(abstractC5706oM1D, arrayList, null, 2);
                    }
                    AbstractC5706oM1 abstractC5706oM1D2 = abstractC2299We0.g;
                    if (!abstractC5706oM1D2.V0().b().isEmpty() && abstractC5706oM1D2.V0().c() != null) {
                        List<H62> listB2 = abstractC5706oM1D2.V0().b();
                        Intrinsics.checkNotNullExpressionValue(listB2, "getParameters(...)");
                        ArrayList arrayList2 = new ArrayList(XE.m(listB2, 10));
                        for (H62 h63 : listB2) {
                            N62 c4662jP2 = (N62) CollectionsKt.H(h63.l(), abstractC4649jL0.T0());
                            boolean z2 = setB != null && setB.contains(h63);
                            if (c4662jP2 == null || z2) {
                                c4662jP2 = new C4662jP1(h63);
                            } else {
                                T62 t62G2 = substitutor.g();
                                AbstractC4649jL0 type2 = c4662jP2.getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                if (t62G2.e(type2) == null) {
                                    c4662jP2 = new C4662jP1(h63);
                                }
                            }
                            arrayList2.add(c4662jP2);
                        }
                        abstractC5706oM1D2 = V62.d(abstractC5706oM1D2, arrayList2, null, 2);
                    }
                    p92D = C5492nL0.a(abstractC5706oM1D, abstractC5706oM1D2);
                } else {
                    if (!(p92Y0 instanceof AbstractC5706oM1)) {
                        throw new C6489s51();
                    }
                    AbstractC5706oM1 abstractC5706oM1 = (AbstractC5706oM1) p92Y0;
                    if (abstractC5706oM1.V0().b().isEmpty() || abstractC5706oM1.V0().c() == null) {
                        p92D = abstractC5706oM1;
                    } else {
                        List<H62> listB3 = abstractC5706oM1.V0().b();
                        Intrinsics.checkNotNullExpressionValue(listB3, "getParameters(...)");
                        ArrayList arrayList3 = new ArrayList(XE.m(listB3, 10));
                        for (H62 h64 : listB3) {
                            N62 c4662jP3 = (N62) CollectionsKt.H(h64.l(), abstractC4649jL0.T0());
                            boolean z3 = setB != null && setB.contains(h64);
                            if (c4662jP3 == null || z3) {
                                c4662jP3 = new C4662jP1(h64);
                            } else {
                                T62 t62G3 = substitutor.g();
                                AbstractC4649jL0 type3 = c4662jP3.getType();
                                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                if (t62G3.e(type3) == null) {
                                    c4662jP3 = new C4662jP1(h64);
                                }
                            }
                            arrayList3.add(c4662jP3);
                        }
                        p92D = V62.d(abstractC5706oM1, arrayList3, null, 2);
                    }
                }
                AbstractC4649jL0 abstractC4649jL0H = substitutor.h(C6621sj.h(p92D, p92Y0), EnumC3610ed2.OUT_VARIANCE);
                Intrinsics.checkNotNullExpressionValue(abstractC4649jL0H, "safeSubstitute(...)");
                c3337dJ1.add(abstractC4649jL0H);
            } else if (interfaceC5044lDC instanceof H62) {
                Set<H62> setB2 = ve0.b();
                if (setB2 == null || !setB2.contains(interfaceC5044lDC)) {
                    List<AbstractC4649jL0> upperBounds = ((H62) interfaceC5044lDC).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                    c3337dJ1.addAll(c(substitutor, upperBounds, ve0));
                } else {
                    c3337dJ1.add(a(ve0));
                }
            }
        }
        return C5487nJ1.a(c3337dJ1);
    }
}

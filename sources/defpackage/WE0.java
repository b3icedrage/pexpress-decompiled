package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class WE0 {

    public static final class a {

        @Nullable
        public final P92 a;
        public final int b;

        public a(@Nullable P92 p92, int i) {
            this.a = p92;
            this.b = i;
        }
    }

    public static final class b {

        @Nullable
        public final AbstractC5706oM1 a;
        public final int b;
        public final boolean c;

        public b(@Nullable AbstractC5706oM1 abstractC5706oM1, int i, boolean z) {
            this.a = abstractC5706oM1;
            this.b = i;
            this.c = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    public static b a(AbstractC5706oM1 abstractC5706oM1, C4111h1 c4111h1, int i, EnumC6284r62 enumC6284r62, boolean z, boolean z2) {
        FC fcC;
        Boolean bool;
        InterfaceC6494s62 interfaceC6494s62V0;
        a aVar;
        InterfaceC4812k62 interfaceC4812k62K;
        C4111h1 c4111h2 = c4111h1;
        ?? r4 = 0;
        Intrinsics.checkNotNullParameter(enumC6284r62, "<this>");
        EnumC6284r62 enumC6284r63 = EnumC6284r62.g;
        boolean z3 = enumC6284r62 != enumC6284r63;
        boolean z4 = (z2 && z) ? false : true;
        P92 p92 = null;
        if (!z3 && abstractC5706oM1.T0().isEmpty()) {
            return new b(null, 1, false);
        }
        InterfaceC5044lD interfaceC5044lDC = abstractC5706oM1.V0().c();
        if (interfaceC5044lDC == null) {
            return new b(null, 1, false);
        }
        C2905bF0 c2905bF0 = (C2905bF0) c4111h2.invoke(Integer.valueOf(i));
        C2878b70 c2878b70 = C7965z62.a;
        Intrinsics.checkNotNullParameter(enumC6284r62, "<this>");
        if (enumC6284r62 == enumC6284r63 || !(interfaceC5044lDC instanceof FC)) {
            fcC = null;
        } else if (c2905bF0.b == S11.d && enumC6284r62 == EnumC6284r62.d) {
            FC mutable = (FC) interfaceC5044lDC;
            Intrinsics.checkNotNullParameter(mutable, "mutable");
            String str = RE0.a;
            C1836Qh0 c1836Qh0G = C4432iZ.g(mutable);
            HashMap<C1836Qh0, C1758Ph0> map = RE0.j;
            if (map.containsKey(c1836Qh0G)) {
                Intrinsics.checkNotNullParameter(mutable, "mutable");
                C1758Ph0 c1758Ph0 = map.get(C4432iZ.g(mutable));
                if (c1758Ph0 == null) {
                    throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
                }
                fcC = C4900kZ.e(mutable).i(c1758Ph0);
                Intrinsics.checkNotNullExpressionValue(fcC, "getBuiltInClassByFqName(...)");
            } else if (c2905bF0.b == S11.e) {
                fcC = null;
            } else {
                fcC = null;
            }
        } else if (c2905bF0.b == S11.e || enumC6284r62 != EnumC6284r62.e) {
            fcC = null;
        } else {
            FC readOnly = (FC) interfaceC5044lDC;
            Intrinsics.checkNotNullParameter(readOnly, "readOnly");
            String str2 = RE0.a;
            if (RE0.k.containsKey(C4432iZ.g(readOnly))) {
                fcC = C6772tS0.c(readOnly);
            } else {
                fcC = null;
            }
        }
        Intrinsics.checkNotNullParameter(enumC6284r62, "<this>");
        if (enumC6284r62 == enumC6284r63) {
            bool = null;
        } else {
            EnumC5238m71 enumC5238m71 = c2905bF0.a;
            int i2 = enumC5238m71 == null ? -1 : C7965z62.a.a[enumC5238m71.ordinal()];
            if (i2 == 1) {
                bool = Boolean.TRUE;
            } else if (i2 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (fcC == null || (interfaceC6494s62V0 = fcC.p()) == null) {
            interfaceC6494s62V0 = abstractC5706oM1.V0();
        }
        int i3 = i + 1;
        List<N62> listT0 = abstractC5706oM1.T0();
        List<H62> listB = interfaceC6494s62V0.b();
        Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
        Iterator<T> it = listT0.iterator();
        Iterator<T> it2 = listB.iterator();
        ArrayList arrayList = new ArrayList(Math.min(XE.m(listT0, 10), XE.m(listB, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            H62 h62 = (H62) it2.next();
            N62 n62 = (N62) next;
            if (!z4) {
                aVar = new a(p92, r4);
            } else if (!n62.c()) {
                aVar = b(n62.getType().Y0(), c4111h2, i3, z2);
            } else if (((C2905bF0) c4111h2.invoke(Integer.valueOf(i3))).a == EnumC5238m71.d) {
                P92 p92Y0 = n62.getType().Y0();
                aVar = new a(C5492nL0.a(C6621sj.m(p92Y0).Z0(r4), C6621sj.q(p92Y0).Z0(true)), 1);
            } else {
                aVar = new a(null, 1);
            }
            i3 += aVar.b;
            P92 p93 = aVar.a;
            if (p93 != null) {
                EnumC3610ed2 enumC3610ed2B = n62.b();
                Intrinsics.checkNotNullExpressionValue(enumC3610ed2B, "getProjectionKind(...)");
                interfaceC4812k62K = C0564Aa.f(p93, enumC3610ed2B, h62);
            } else if (fcC == null || n62.c()) {
                interfaceC4812k62K = fcC != null ? C3089c72.k(h62) : null;
            } else {
                AbstractC4649jL0 type = n62.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                EnumC3610ed2 enumC3610ed2B2 = n62.b();
                Intrinsics.checkNotNullExpressionValue(enumC3610ed2B2, "getProjectionKind(...)");
                interfaceC4812k62K = C0564Aa.f(type, enumC3610ed2B2, h62);
            }
            arrayList.add(interfaceC4812k62K);
            c4111h2 = c4111h1;
            r4 = 0;
            p92 = null;
        }
        int i4 = i3 - i;
        if (fcC == null && bool == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((N62) it3.next()) == null);
            }
            return new b(null, i4, false);
        }
        InterfaceC2396Xc interfaceC2396XcK = abstractC5706oM1.k();
        C2878b70 c2878b71 = C7965z62.b;
        if (fcC == null) {
            c2878b71 = null;
        }
        C2878b70 c2878b72 = C7965z62.a;
        if (bool == null) {
            c2878b72 = null;
        }
        InterfaceC2396Xc[] elements = {interfaceC2396XcK, c2878b71, c2878b72};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListO = C1526Mj.o(elements);
        int size = arrayListO.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected");
        }
        C5655o62 c5655o62P = C1952Ru.p(size != 1 ? new DH((List<? extends InterfaceC2396Xc>) CollectionsKt.e0(arrayListO)) : (InterfaceC2396Xc) CollectionsKt.U(arrayListO));
        List<N62> listT1 = abstractC5706oM1.T0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = listT1.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(XE.m(arrayList, 10), XE.m(listT1, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            N62 n63 = (N62) it5.next();
            N62 n64 = (N62) next2;
            if (n64 != null) {
                n63 = n64;
            }
            arrayList2.add(n63);
        }
        AbstractC5706oM1 abstractC5706oM1C = C5492nL0.c(c5655o62P, interfaceC6494s62V0, arrayList2, bool != null ? bool.booleanValue() : abstractC5706oM1.W0(), null);
        if (c2905bF0.c) {
            abstractC5706oM1C = new K51(abstractC5706oM1C);
        }
        return new b(abstractC5706oM1C, i4, bool != null && c2905bF0.d);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    public static a b(P92 p92, C4111h1 c4111h1, int i, boolean z) {
        P92 p93;
        P92 p92R = null;
        if (C3686f.n(p92)) {
            return new a(null, 1);
        }
        if (!(p92 instanceof AbstractC2299We0)) {
            if (!(p92 instanceof AbstractC5706oM1)) {
                throw new C6489s51();
            }
            b bVarA = a((AbstractC5706oM1) p92, c4111h1, i, EnumC6284r62.g, false, z);
            boolean z2 = bVarA.c;
            P92 p92R2 = bVarA.a;
            if (z2) {
                p92R2 = C6621sj.r(p92, p92R2);
            }
            return new a(p92R2, bVarA.b);
        }
        boolean z3 = p92 instanceof C2242Vm1;
        AbstractC2299We0 abstractC2299We0 = (AbstractC2299We0) p92;
        b bVarA2 = a(abstractC2299We0.e, c4111h1, i, EnumC6284r62.d, z3, z);
        b bVarA3 = a(abstractC2299We0.g, c4111h1, i, EnumC6284r62.e, z3, z);
        AbstractC5706oM1 abstractC5706oM1 = bVarA2.a;
        AbstractC5706oM1 abstractC5706oM2 = bVarA3.a;
        if (abstractC5706oM1 != null || abstractC5706oM2 != null) {
            if (bVarA2.c || bVarA3.c) {
                if (abstractC5706oM2 == null) {
                    Intrinsics.checkNotNull(abstractC5706oM1);
                    p93 = abstractC5706oM1;
                } else {
                    P92 p92A = C5492nL0.a(abstractC5706oM1 == null ? abstractC5706oM2 : abstractC5706oM1, abstractC5706oM2);
                    if (p92A == null) {
                        Intrinsics.checkNotNull(abstractC5706oM1);
                        p93 = abstractC5706oM1;
                    } else {
                        p93 = p92A;
                    }
                }
                p92R = C6621sj.r(p92, p93);
            } else {
                AbstractC5706oM1 abstractC5706oM3 = abstractC2299We0.g;
                AbstractC5706oM1 abstractC5706oM4 = abstractC2299We0.e;
                AbstractC5706oM1 abstractC5706oM5 = abstractC5706oM1;
                if (z3) {
                    AbstractC5706oM1 abstractC5706oM6 = abstractC5706oM1;
                    if (abstractC5706oM1 == null) {
                        abstractC5706oM6 = abstractC5706oM4;
                    }
                    if (abstractC5706oM2 == null) {
                        abstractC5706oM2 = abstractC5706oM3;
                    }
                    p92R = new C2242Vm1(abstractC5706oM6, abstractC5706oM2);
                } else {
                    if (abstractC5706oM1 == null) {
                        abstractC5706oM5 = abstractC5706oM4;
                    }
                    if (abstractC5706oM2 == null) {
                        abstractC5706oM2 = abstractC5706oM3;
                    }
                    p92R = C5492nL0.a(abstractC5706oM5, abstractC5706oM2);
                }
            }
        }
        return new a(p92R, bVarA2.b);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Xy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2462Xy {
    @NotNull
    public static final C2492Yi<AbstractC4649jL0> a(@NotNull AbstractC4649jL0 type) {
        C4344i62 c4344i62;
        Object objB;
        C4344i62 c4344i63;
        Intrinsics.checkNotNullParameter(type, "type");
        if (C6621sj.j(type)) {
            C2492Yi<AbstractC4649jL0> c2492YiA = a(C6621sj.m(type));
            C2492Yi<AbstractC4649jL0> c2492YiA2 = a(C6621sj.q(type));
            return new C2492Yi<>(C6621sj.h(C5492nL0.a(C6621sj.m(c2492YiA.a), C6621sj.q(c2492YiA2.a)), type), C6621sj.h(C5492nL0.a(C6621sj.m(c2492YiA.b), C6621sj.q(c2492YiA2.b)), type));
        }
        InterfaceC6494s62 interfaceC6494s62V0 = type.V0();
        Intrinsics.checkNotNullParameter(type, "<this>");
        boolean z = true;
        if (type.V0() instanceof InterfaceC2540Yy) {
            Intrinsics.c(interfaceC6494s62V0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            N62 n62F = ((InterfaceC2540Yy) interfaceC6494s62V0).f();
            AbstractC4649jL0 type2 = n62F.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            AbstractC4649jL0 abstractC4649jL0I = C3089c72.i(type2, type.W0());
            Intrinsics.checkNotNullExpressionValue(abstractC4649jL0I, "makeNullableIfNeeded(...)");
            int iOrdinal = n62F.b().ordinal();
            if (iOrdinal == 1) {
                return new C2492Yi<>(abstractC4649jL0I, C0564Aa.l(type).o());
            }
            if (iOrdinal != 2) {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + n62F);
            }
            AbstractC5706oM1 abstractC5706oM1N = C0564Aa.l(type).n();
            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1N, "getNothingType(...)");
            AbstractC4649jL0 abstractC4649jL0I2 = C3089c72.i(abstractC5706oM1N, type.W0());
            Intrinsics.checkNotNullExpressionValue(abstractC4649jL0I2, "makeNullableIfNeeded(...)");
            return new C2492Yi<>(abstractC4649jL0I2, abstractC4649jL0I);
        }
        if (type.T0().isEmpty() || type.T0().size() != interfaceC6494s62V0.b().size()) {
            return new C2492Yi<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<N62> listT0 = type.T0();
        List<H62> listB = interfaceC6494s62V0.b();
        Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
        for (Pair pair : CollectionsKt.j0(listT0, listB)) {
            N62 n62 = (N62) pair.d;
            H62 h62 = (H62) pair.e;
            Intrinsics.checkNotNull(h62);
            EnumC3610ed2 enumC3610ed2S = h62.S();
            if (enumC3610ed2S == null) {
                X62.a(35);
                throw null;
            }
            if (n62 == null) {
                X62.a(36);
                throw null;
            }
            X62 x62 = X62.b;
            int iOrdinal2 = (n62.c() ? EnumC3610ed2.OUT_VARIANCE : X62.b(enumC3610ed2S, n62.b())).ordinal();
            if (iOrdinal2 == 0) {
                AbstractC4649jL0 type3 = n62.getType();
                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                AbstractC4649jL0 type4 = n62.getType();
                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                c4344i63 = new C4344i62(h62, type3, type4);
            } else if (iOrdinal2 == 1) {
                AbstractC4649jL0 type5 = n62.getType();
                Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                AbstractC5706oM1 abstractC5706oM1O = C4900kZ.e(h62).o();
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1O, "getNullableAnyType(...)");
                c4344i63 = new C4344i62(h62, type5, abstractC5706oM1O);
            } else {
                if (iOrdinal2 != 2) {
                    throw new C6489s51();
                }
                AbstractC5706oM1 abstractC5706oM1N2 = C4900kZ.e(h62).n();
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1N2, "getNothingType(...)");
                AbstractC4649jL0 type6 = n62.getType();
                Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                c4344i63 = new C4344i62(h62, abstractC5706oM1N2, type6);
            }
            if (n62.c()) {
                arrayList.add(c4344i63);
                arrayList2.add(c4344i63);
            } else {
                C2492Yi<AbstractC4649jL0> c2492YiA3 = a(c4344i63.b);
                AbstractC4649jL0 abstractC4649jL0 = c2492YiA3.a;
                AbstractC4649jL0 abstractC4649jL1 = c2492YiA3.b;
                C2492Yi<AbstractC4649jL0> c2492YiA4 = a(c4344i63.c);
                AbstractC4649jL0 abstractC4649jL2 = c2492YiA4.a;
                AbstractC4649jL0 abstractC4649jL3 = c2492YiA4.b;
                H62 h63 = c4344i63.a;
                C4344i62 c4344i64 = new C4344i62(h63, abstractC4649jL1, abstractC4649jL2);
                C4344i62 c4344i65 = new C4344i62(h63, abstractC4649jL0, abstractC4649jL3);
                arrayList.add(c4344i64);
                arrayList2.add(c4344i65);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            c4344i62 = (C4344i62) it.next();
            c4344i62.getClass();
        } while (InterfaceC4859kL0.a.d(c4344i62.b, c4344i62.c));
        if (z) {
            objB = C0564Aa.l(type).n();
            Intrinsics.checkNotNullExpressionValue(objB, "getNothingType(...)");
        } else {
            objB = b(type, arrayList);
        }
        return new C2492Yi<>(objB, b(type, arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    public static final AbstractC4649jL0 b(AbstractC4649jL0 abstractC4649jL0, ArrayList arrayList) {
        P62 p62;
        abstractC4649jL0.T0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4344i62 c4344i62 = (C4344i62) it.next();
            c4344i62.getClass();
            C7115v41 c7115v41 = InterfaceC4859kL0.a;
            AbstractC4649jL0 abstractC4649jL1 = c4344i62.b;
            AbstractC4649jL0 abstractC4649jL2 = c4344i62.c;
            c7115v41.d(abstractC4649jL1, abstractC4649jL2);
            if (Intrinsics.a(abstractC4649jL1, abstractC4649jL2)) {
                p62 = new P62(abstractC4649jL1);
            } else {
                H62 h62 = c4344i62.a;
                EnumC3610ed2 enumC3610ed2S = h62.S();
                EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.IN_VARIANCE;
                if (enumC3610ed2S == enumC3610ed2) {
                    p62 = new P62(abstractC4649jL1);
                } else if (RK0.E(abstractC4649jL1) && h62.S() != enumC3610ed2) {
                    EnumC3610ed2 enumC3610ed3 = EnumC3610ed2.OUT_VARIANCE;
                    if (enumC3610ed3 == h62.S()) {
                        enumC3610ed3 = EnumC3610ed2.INVARIANT;
                    }
                    p62 = new P62(abstractC4649jL2, enumC3610ed3);
                } else {
                    if (abstractC4649jL2 == null) {
                        RK0.a(141);
                        throw null;
                    }
                    if (RK0.x(abstractC4649jL2) && abstractC4649jL2.W0()) {
                        if (enumC3610ed2 == h62.S()) {
                            enumC3610ed2 = EnumC3610ed2.INVARIANT;
                        }
                        p62 = new P62(abstractC4649jL1, enumC3610ed2);
                    } else {
                        EnumC3610ed2 enumC3610ed4 = EnumC3610ed2.OUT_VARIANCE;
                        if (enumC3610ed4 == h62.S()) {
                            enumC3610ed4 = EnumC3610ed2.INVARIANT;
                        }
                        p62 = new P62(abstractC4649jL2, enumC3610ed4);
                    }
                }
            }
            arrayList2.add(p62);
        }
        return V62.c(abstractC4649jL0, arrayList2, null, 6);
    }
}

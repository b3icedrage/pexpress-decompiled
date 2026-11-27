package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5712oO1 {
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    @Nullable
    public static final String a(@NotNull InterfaceC2076Tj0 callableMemberDescriptor) {
        InterfaceC1490Lx interfaceC1490LxK;
        C5638o21 c5638o21;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC1490Lx interfaceC1490LxB = RK0.z(callableMemberDescriptor) ? b(callableMemberDescriptor) : null;
        if (interfaceC1490LxB != null && (interfaceC1490LxK = C4900kZ.k(interfaceC1490LxB)) != null) {
            if (interfaceC1490LxK instanceof InterfaceC0671Bj1) {
                Intrinsics.checkNotNullParameter(interfaceC1490LxK, "<this>");
                RK0.z(interfaceC1490LxK);
                InterfaceC1490Lx interfaceC1490LxB2 = C4900kZ.b(C4900kZ.k(interfaceC1490LxK), C3736fD.e);
                if (interfaceC1490LxB2 != null && (c5638o21 = (C5638o21) C1251Iv.a.get(C4900kZ.g(interfaceC1490LxB2))) != null) {
                    return c5638o21.e();
                }
            } else if (interfaceC1490LxK instanceof InterfaceC3765fM1) {
                int i = C0861Dv.l;
                InterfaceC3765fM1 functionDescriptor = (InterfaceC3765fM1) interfaceC1490LxK;
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                LinkedHashMap linkedHashMap = C6132qO1.i;
                String strB = C3689f01.b(functionDescriptor);
                C5638o21 c5638o22 = strB == null ? null : (C5638o21) linkedHashMap.get(strB);
                if (c5638o22 != null) {
                    return c5638o22.e();
                }
            }
        }
        return null;
    }

    @Nullable
    public static final <T extends InterfaceC1490Lx> T b(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        if (!C6132qO1.j.contains(t.getName()) && !C1251Iv.d.contains(C4900kZ.k(t).getName())) {
            return null;
        }
        if ((t instanceof InterfaceC0671Bj1) || (t instanceof InterfaceC7043uj1)) {
            return (T) C4900kZ.b(t, MY.g);
        }
        if (t instanceof InterfaceC3765fM1) {
            return (T) C4900kZ.b(t, NY.g);
        }
        return null;
    }

    @Nullable
    public static final <T extends InterfaceC1490Lx> T c(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        T t2 = (T) b(t);
        if (t2 != null) {
            return t2;
        }
        int i = C1095Gv.l;
        C5638o21 name = t.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (C1095Gv.b(name)) {
            return (T) C4900kZ.b(t, OY.g);
        }
        return null;
    }

    public static final boolean d(@NotNull FC fc, @NotNull InterfaceC1490Lx specialCallableDescriptor) {
        Intrinsics.checkNotNullParameter(fc, "<this>");
        Intrinsics.checkNotNullParameter(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC4675jU interfaceC4675jUE = specialCallableDescriptor.e();
        Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC5706oM1 supertype = ((FC) interfaceC4675jUE).y();
        Intrinsics.checkNotNullExpressionValue(supertype, "getDefaultType(...)");
        for (FC fcJ = C4432iZ.j(fc); fcJ != null; fcJ = C4432iZ.j(fcJ)) {
            if (!(fcJ instanceof InterfaceC3530eE0)) {
                AbstractC5706oM1 subtype = fcJ.y();
                P92 p92H = null;
                if (subtype == null) {
                    C3043bv.a(0);
                    throw null;
                }
                if (supertype == null) {
                    C3043bv.a(1);
                    throw null;
                }
                C0648Bc typeCheckingProcedureCallbacks = new C0648Bc();
                Intrinsics.checkNotNullParameter(subtype, "subtype");
                Intrinsics.checkNotNullParameter(supertype, "supertype");
                Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(new NU1(subtype, null));
                InterfaceC6494s62 interfaceC6494s62V0 = supertype.V0();
                while (!arrayDeque.isEmpty()) {
                    NU1 nu1 = (NU1) arrayDeque.poll();
                    AbstractC4649jL0 abstractC4649jL0H = nu1.a;
                    InterfaceC6494s62 interfaceC6494s62V1 = abstractC4649jL0H.V0();
                    if (interfaceC6494s62V1 == null) {
                        C0648Bc.a(3);
                        throw null;
                    }
                    if (interfaceC6494s62V0 == null) {
                        C0648Bc.a(4);
                        throw null;
                    }
                    if (interfaceC6494s62V1.equals(interfaceC6494s62V0)) {
                        boolean zW0 = abstractC4649jL0H.W0();
                        for (NU1 nu2 = nu1.b; nu2 != null; nu2 = nu2.b) {
                            AbstractC4649jL0 kotlinType = nu2.a;
                            List<N62> listT0 = kotlinType.T0();
                            if (listT0 != null && listT0.isEmpty()) {
                                AbstractC7124v62.a aVar = AbstractC7124v62.b;
                                Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                                abstractC4649jL0H = aVar.a(kotlinType.V0(), kotlinType.T0()).c().h(abstractC4649jL0H, EnumC3610ed2.INVARIANT);
                                Intrinsics.checkNotNull(abstractC4649jL0H);
                                break;
                            }
                            Iterator<T> it = listT0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    AbstractC7124v62.a aVar2 = AbstractC7124v62.b;
                                    Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                                    abstractC4649jL0H = aVar2.a(kotlinType.V0(), kotlinType.T0()).c().h(abstractC4649jL0H, EnumC3610ed2.INVARIANT);
                                    Intrinsics.checkNotNull(abstractC4649jL0H);
                                    break;
                                }
                                EnumC3610ed2 enumC3610ed2B = ((N62) it.next()).b();
                                EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
                                if (enumC3610ed2B != enumC3610ed2) {
                                    AbstractC7124v62.a aVar3 = AbstractC7124v62.b;
                                    Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                                    AbstractC4649jL0 abstractC4649jL0H2 = LE.m(aVar3.a(kotlinType.V0(), kotlinType.T0())).c().h(abstractC4649jL0H, enumC3610ed2);
                                    Intrinsics.checkNotNullExpressionValue(abstractC4649jL0H2, "safeSubstitute(...)");
                                    abstractC4649jL0H = C2462Xy.a(abstractC4649jL0H2).b;
                                    break;
                                }
                            }
                            zW0 = zW0 || kotlinType.W0();
                        }
                        InterfaceC6494s62 interfaceC6494s62V2 = abstractC4649jL0H.V0();
                        if (interfaceC6494s62V2 == null) {
                            C0648Bc.a(3);
                            throw null;
                        }
                        if (interfaceC6494s62V2.equals(interfaceC6494s62V0)) {
                            p92H = C3089c72.h(abstractC4649jL0H, zW0);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + Ic2.a(interfaceC6494s62V2) + ", \n\nsupertype: " + Ic2.a(interfaceC6494s62V0) + " \n" + interfaceC6494s62V2.equals(interfaceC6494s62V0));
                    }
                    for (AbstractC4649jL0 abstractC4649jL0 : interfaceC6494s62V1.a()) {
                        Intrinsics.checkNotNull(abstractC4649jL0);
                        arrayDeque.add(new NU1(abstractC4649jL0, nu1));
                    }
                }
                if (p92H != null) {
                    return !RK0.z(fcJ);
                }
            }
        }
        return false;
    }
}

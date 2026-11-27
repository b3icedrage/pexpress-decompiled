package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FO0 extends QO0 {
    public static final /* synthetic */ int v = 0;

    @NotNull
    public final FC n;

    @NotNull
    public final InterfaceC2902bE0 o;
    public final boolean p;

    @NotNull
    public final I51<List<InterfaceC7984zC>> q;

    @NotNull
    public final I51<Set<C5638o21>> r;

    @NotNull
    public final I51<Set<C5638o21>> s;

    @NotNull
    public final I51<Map<C5638o21, InterfaceC6520sE0>> t;

    @NotNull
    public final VY0<C5638o21, FC> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FO0(@NotNull LO0 c, @NotNull FC ownerDescriptor, @NotNull InterfaceC2902bE0 jClass, boolean z, @Nullable FO0 fo0) {
        super(fo0, c);
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.n = ownerDescriptor;
        this.o = jClass;
        this.p = z;
        C2720aS0 c2720aS0 = c.a.a;
        C7391wO0 c7391wO0 = new C7391wO0(this, c);
        c2720aS0.getClass();
        this.q = new C2720aS0.h(c2720aS0, c7391wO0);
        YZ yz = new YZ(this, 3);
        c2720aS0.getClass();
        this.r = new C2720aS0.h(c2720aS0, yz);
        C7601xO0 c7601xO0 = new C7601xO0(this, c);
        c2720aS0.getClass();
        this.s = new C2720aS0.h(c2720aS0, c7601xO0);
        TI0 ti0 = new TI0(this, 2);
        c2720aS0.getClass();
        this.t = new C2720aS0.h(c2720aS0, ti0);
        this.u = c2720aS0.f(new C7811yO0(this, c));
    }

    public static InterfaceC3765fM1 A(InterfaceC3765fM1 interfaceC3765fM1, InterfaceC2076Tj0 interfaceC2076Tj0, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return interfaceC3765fM1;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            InterfaceC3765fM1 interfaceC3765fM2 = (InterfaceC3765fM1) it.next();
            if (!Intrinsics.a(interfaceC3765fM1, interfaceC3765fM2) && interfaceC3765fM2.l0() == null && D(interfaceC3765fM2, interfaceC2076Tj0)) {
                InterfaceC2076Tj0 interfaceC2076Tj0Build = interfaceC3765fM1.K0().o().build();
                Intrinsics.checkNotNull(interfaceC2076Tj0Build);
                return (InterfaceC3765fM1) interfaceC2076Tj0Build;
            }
        }
        return interfaceC3765fM1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    public static InterfaceC3765fM1 B(InterfaceC3765fM1 interfaceC3765fM1) {
        C1758Ph0 c1758Ph0G;
        C1836Qh0 c1836Qh0H;
        List<Xc2> listJ = interfaceC3765fM1.j();
        Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
        Xc2 xc2 = (Xc2) CollectionsKt.N(listJ);
        if (xc2 != null) {
            InterfaceC5044lD interfaceC5044lDC = xc2.getType().V0().c();
            if (interfaceC5044lDC == null || (c1836Qh0H = C4900kZ.h(interfaceC5044lDC)) == null) {
                c1758Ph0G = null;
            } else {
                if (!c1836Qh0H.d()) {
                    c1836Qh0H = null;
                }
                if (c1836Qh0H != null) {
                    c1758Ph0G = c1836Qh0H.g();
                } else {
                    c1758Ph0G = null;
                }
            }
            if (!Intrinsics.a(c1758Ph0G, C4194hP1.g)) {
                xc2 = null;
            }
            if (xc2 != null) {
                InterfaceC2076Tj0.a<? extends InterfaceC2076Tj0> aVarK0 = interfaceC3765fM1.K0();
                List<Xc2> listJ2 = interfaceC3765fM1.j();
                Intrinsics.checkNotNullExpressionValue(listJ2, "getValueParameters(...)");
                InterfaceC3765fM1 interfaceC3765fM2 = (InterfaceC3765fM1) aVarK0.b(CollectionsKt.B(listJ2)).n(xc2.getType().T0().get(0).getType()).build();
                C3975gM1 c3975gM1 = (C3975gM1) interfaceC3765fM2;
                if (c3975gM1 != null) {
                    c3975gM1.z = true;
                }
                return interfaceC3765fM2;
            }
        }
        return null;
    }

    public static boolean D(InterfaceC2076Tj0 interfaceC2076Tj0, InterfaceC2076Tj0 interfaceC2076Tj1) {
        C1346Ka1.b.a aVarB = C1346Ka1.e.n(interfaceC2076Tj1, interfaceC2076Tj0, true).b();
        Intrinsics.checkNotNullExpressionValue(aVarB, "getResult(...)");
        return aVarB == C1346Ka1.b.a.d && !C7150vE0.a.a(interfaceC2076Tj1, interfaceC2076Tj0);
    }

    public static boolean E(InterfaceC3765fM1 interfaceC3765fM1, InterfaceC3765fM1 interfaceC3765fM2) {
        int i = C0861Dv.l;
        Intrinsics.checkNotNullParameter(interfaceC3765fM1, "<this>");
        InterfaceC3765fM1 interfaceC3765fM1U0 = interfaceC3765fM2;
        if (Intrinsics.a(interfaceC3765fM1.getName().e(), "removeAt")) {
            interfaceC3765fM1U0 = interfaceC3765fM2;
            if (Intrinsics.a(C3689f01.b(interfaceC3765fM1), C6132qO1.g.e)) {
                interfaceC3765fM1U0 = interfaceC3765fM2.U0();
            }
        }
        Intrinsics.checkNotNull(interfaceC3765fM1U0);
        return D(interfaceC3765fM1U0, interfaceC3765fM1);
    }

    public static InterfaceC3765fM1 F(InterfaceC0671Bj1 interfaceC0671Bj1, String str, Function1 function1) {
        InterfaceC3765fM1 interfaceC3765fM1;
        C5638o21 c5638o21K = C5638o21.k(str);
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(c5638o21K)).iterator();
        do {
            interfaceC3765fM1 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC3765fM1 interfaceC3765fM2 = (InterfaceC3765fM1) it.next();
            if (interfaceC3765fM2.j().size() == 0) {
                C7115v41 c7115v41 = InterfaceC4859kL0.a;
                AbstractC4649jL0 abstractC4649jL0N = interfaceC3765fM2.n();
                if (abstractC4649jL0N == null ? false : c7115v41.d(abstractC4649jL0N, interfaceC0671Bj1.getType())) {
                    interfaceC3765fM1 = interfaceC3765fM2;
                }
            }
        } while (interfaceC3765fM1 == null);
        return interfaceC3765fM1;
    }

    public static InterfaceC3765fM1 H(InterfaceC0671Bj1 interfaceC0671Bj1, Function1 function1) {
        InterfaceC3765fM1 interfaceC3765fM1;
        AbstractC4649jL0 abstractC4649jL0N;
        String strE = interfaceC0671Bj1.getName().e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        C5638o21 c5638o21K = C5638o21.k(C3123cI0.b(strE));
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(c5638o21K)).iterator();
        do {
            interfaceC3765fM1 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC3765fM1 interfaceC3765fM2 = (InterfaceC3765fM1) it.next();
            if (interfaceC3765fM2.j().size() == 1 && (abstractC4649jL0N = interfaceC3765fM2.n()) != null) {
                C5638o21 c5638o21 = RK0.e;
                if (RK0.D(abstractC4649jL0N, C4194hP1.a.d)) {
                    C7115v41 c7115v41 = InterfaceC4859kL0.a;
                    List<Xc2> listJ = interfaceC3765fM2.j();
                    Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                    if (c7115v41.c(((Xc2) CollectionsKt.U(listJ)).getType(), interfaceC0671Bj1.getType())) {
                        interfaceC3765fM1 = interfaceC3765fM2;
                    }
                }
            }
        } while (interfaceC3765fM1 == null);
        return interfaceC3765fM1;
    }

    public static boolean K(InterfaceC3765fM1 interfaceC3765fM1, InterfaceC2076Tj0 interfaceC2076Tj0) {
        String strA = C3689f01.a(interfaceC3765fM1, 2);
        InterfaceC2076Tj0 interfaceC2076Tj0U0 = interfaceC2076Tj0.U0();
        Intrinsics.checkNotNullExpressionValue(interfaceC2076Tj0U0, "getOriginal(...)");
        return Intrinsics.a(strA, C3689f01.a(interfaceC2076Tj0U0, 2)) && !D(interfaceC3765fM1, interfaceC2076Tj0);
    }

    public final boolean C(InterfaceC0671Bj1 interfaceC0671Bj1, Function1<? super C5638o21, ? extends Collection<? extends InterfaceC3765fM1>> function1) {
        if (LL.h(interfaceC0671Bj1)) {
            return false;
        }
        InterfaceC3765fM1 interfaceC3765fM1G = G(interfaceC0671Bj1, function1);
        InterfaceC3765fM1 interfaceC3765fM1H = H(interfaceC0671Bj1, function1);
        if (interfaceC3765fM1G == null) {
            return false;
        }
        if (interfaceC0671Bj1.p0()) {
            return interfaceC3765fM1H != null && interfaceC3765fM1H.q() == interfaceC3765fM1G.q();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final InterfaceC3765fM1 G(InterfaceC0671Bj1 interfaceC0671Bj1, Function1<? super C5638o21, ? extends Collection<? extends InterfaceC3765fM1>> function1) {
        C5638o21 c5638o21;
        C0983Fj1 c0983Fj1F = interfaceC0671Bj1.f();
        String strE = null;
        InterfaceC0905Ej1 interfaceC0905Ej1 = c0983Fj1F != null ? (InterfaceC0905Ej1) C5712oO1.b(c0983Fj1F) : null;
        if (interfaceC0905Ej1 != null) {
            Intrinsics.checkNotNullParameter(interfaceC0905Ej1, "<this>");
            RK0.z(interfaceC0905Ej1);
            InterfaceC1490Lx interfaceC1490LxB = C4900kZ.b(C4900kZ.k(interfaceC0905Ej1), C3736fD.e);
            if (interfaceC1490LxB != null && (c5638o21 = (C5638o21) C1251Iv.a.get(C4900kZ.g(interfaceC1490LxB))) != null) {
                strE = c5638o21.e();
            }
        }
        if (strE != null && !C5712oO1.d(this.n, interfaceC0905Ej1)) {
            return F(interfaceC0671Bj1, strE, function1);
        }
        String strE2 = interfaceC0671Bj1.getName().e();
        Intrinsics.checkNotNullExpressionValue(strE2, "asString(...)");
        return F(interfaceC0671Bj1, C3123cI0.a(strE2), function1);
    }

    public final LinkedHashSet I(C5638o21 c5638o21) {
        Collection<AbstractC4649jL0> collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionZ.iterator();
        while (it.hasNext()) {
            C2904bF.o(linkedHashSet, ((AbstractC4649jL0) it.next()).v().d(c5638o21, S41.i));
        }
        return linkedHashSet;
    }

    public final Set<InterfaceC0671Bj1> J(C5638o21 c5638o21) {
        Collection<AbstractC4649jL0> collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionB = ((AbstractC4649jL0) it.next()).v().b(c5638o21, S41.i);
            ArrayList arrayList2 = new ArrayList(XE.m(collectionB, 10));
            Iterator it2 = collectionB.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC0671Bj1) it2.next());
            }
            C2904bF.o(arrayList, arrayList2);
        }
        return CollectionsKt.h0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:1: B:55:0x014a->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[LOOP:3: B:73:0x01a3->B:109:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:60:0x015e  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ec A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0106 A[SYNTHETIC] */
    public final boolean L(InterfaceC3765fM1 interfaceC3765fM1) {
        Collection collectionG;
        C5638o21 c5638o21;
        C5638o21 name;
        InterfaceC3765fM1 interfaceC3765fM1B;
        LinkedHashSet<InterfaceC3765fM1> linkedHashSetI;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        InterfaceC2076Tj0 interfaceC2076Tj0A;
        ArrayList arrayList2;
        InterfaceC3765fM1 interfaceC3765fM2;
        Iterator it3;
        InterfaceC3765fM1 interfaceC3765fM3;
        C5638o21 methodName = interfaceC3765fM1.getName();
        Intrinsics.checkNotNullExpressionValue(methodName, "getName(...)");
        Intrinsics.checkNotNullParameter(methodName, "name");
        String name2 = methodName.e();
        Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
        C1758Ph0 c1758Ph0 = C3123cI0.a;
        Intrinsics.checkNotNullParameter(name2, "name");
        if (d.o(name2, "get", false) || d.o(name2, "is", false)) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            C5638o21 c5638o21E = C3043bv.e(methodName, "get", null, 12);
            if (c5638o21E == null) {
                c5638o21E = C3043bv.e(methodName, "is", null, 8);
            }
            collectionG = WE.g(c5638o21E);
        } else {
            Intrinsics.checkNotNullParameter(name2, "name");
            if (d.o(name2, "set", false)) {
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                C5638o21 c5638o21E2 = C3043bv.e(methodName, "set", null, 4);
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                C5638o21[] elements = {c5638o21E2, C3043bv.e(methodName, "set", "is", 4)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                collectionG = C1526Mj.o(elements);
            } else {
                Object obj = C1251Iv.a;
                Intrinsics.checkNotNullParameter(methodName, "name1");
                collectionG = (List) C1251Iv.b.get(methodName);
                if (collectionG == null) {
                    collectionG = C5653o60.d;
                }
            }
        }
        if (collectionG != null && collectionG.isEmpty()) {
            ArrayList arrayList3 = C6132qO1.a;
            C5638o21 name3 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
            Intrinsics.checkNotNullParameter(name3, "name");
            c5638o21 = (C5638o21) C6132qO1.k.get(name3);
            if (c5638o21 == null) {
                int i = C1095Gv.l;
                name = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (!C1095Gv.b(name)) {
                    interfaceC3765fM1B = B(interfaceC3765fM1);
                    if (interfaceC3765fM1B == null) {
                        return true;
                    }
                    C5638o21 name4 = interfaceC3765fM1.getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
                    linkedHashSetI = I(name4);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    for (InterfaceC3765fM1 interfaceC3765fM4 : linkedHashSetI) {
                        if (interfaceC3765fM4.z()) {
                        }
                    }
                    return true;
                }
                C5638o21 name5 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
                LinkedHashSet linkedHashSetI2 = I(name5);
                arrayList = new ArrayList();
                it = linkedHashSetI2.iterator();
                while (it.hasNext()) {
                    interfaceC2076Tj0A = C1095Gv.a((InterfaceC3765fM1) it.next());
                    if (interfaceC2076Tj0A != null) {
                        arrayList.add(interfaceC2076Tj0A);
                    }
                }
                if (arrayList.isEmpty()) {
                    interfaceC3765fM1B = B(interfaceC3765fM1);
                    if (interfaceC3765fM1B == null) {
                        return true;
                    }
                    C5638o21 name6 = interfaceC3765fM1.getName();
                    Intrinsics.checkNotNullExpressionValue(name6, "getName(...)");
                    linkedHashSetI = I(name6);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (interfaceC3765fM4.z()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(interfaceC3765fM1, (InterfaceC2076Tj0) it2.next())) {
                    }
                }
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name7 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name7, "getName(...)");
                linkedHashSetI = I(name7);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetI3 = I(c5638o21);
            arrayList2 = new ArrayList();
            for (Object obj2 : linkedHashSetI3) {
                interfaceC3765fM3 = (InterfaceC3765fM1) obj2;
                Intrinsics.checkNotNullParameter(interfaceC3765fM3, "<this>");
                if (C5712oO1.b(interfaceC3765fM3) != null) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                int i2 = C1095Gv.l;
                name = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (!C1095Gv.b(name)) {
                    interfaceC3765fM1B = B(interfaceC3765fM1);
                    if (interfaceC3765fM1B == null) {
                        return true;
                    }
                    C5638o21 name8 = interfaceC3765fM1.getName();
                    Intrinsics.checkNotNullExpressionValue(name8, "getName(...)");
                    linkedHashSetI = I(name8);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (interfaceC3765fM4.z()) {
                        }
                    }
                    return true;
                }
                C5638o21 name9 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name9, "getName(...)");
                LinkedHashSet linkedHashSetI4 = I(name9);
                arrayList = new ArrayList();
                it = linkedHashSetI4.iterator();
                while (it.hasNext()) {
                    interfaceC2076Tj0A = C1095Gv.a((InterfaceC3765fM1) it.next());
                    if (interfaceC2076Tj0A != null) {
                        arrayList.add(interfaceC2076Tj0A);
                    }
                }
                if (arrayList.isEmpty()) {
                    interfaceC3765fM1B = B(interfaceC3765fM1);
                    if (interfaceC3765fM1B == null) {
                        return true;
                    }
                    C5638o21 name10 = interfaceC3765fM1.getName();
                    Intrinsics.checkNotNullExpressionValue(name10, "getName(...)");
                    linkedHashSetI = I(name10);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (interfaceC3765fM4.z()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(interfaceC3765fM1, (InterfaceC2076Tj0) it2.next())) {
                    }
                }
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name11 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name11, "getName(...)");
                linkedHashSetI = I(name11);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            InterfaceC2076Tj0.a<? extends InterfaceC2076Tj0> aVarK0 = interfaceC3765fM1.K0();
            aVarK0.p(c5638o21);
            aVarK0.r();
            aVarK0.e();
            InterfaceC2076Tj0 interfaceC2076Tj0Build = aVarK0.build();
            Intrinsics.checkNotNull(interfaceC2076Tj0Build);
            interfaceC3765fM2 = (InterfaceC3765fM1) interfaceC2076Tj0Build;
            if (arrayList2.isEmpty()) {
                int i3 = C1095Gv.l;
                name = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (!C1095Gv.b(name)) {
                    interfaceC3765fM1B = B(interfaceC3765fM1);
                    if (interfaceC3765fM1B == null) {
                        return true;
                    }
                    C5638o21 name12 = interfaceC3765fM1.getName();
                    Intrinsics.checkNotNullExpressionValue(name12, "getName(...)");
                    linkedHashSetI = I(name12);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (interfaceC3765fM4.z()) {
                        }
                    }
                    return true;
                }
                C5638o21 name13 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name13, "getName(...)");
                LinkedHashSet linkedHashSetI5 = I(name13);
                arrayList = new ArrayList();
                it = linkedHashSetI5.iterator();
                while (it.hasNext()) {
                    interfaceC2076Tj0A = C1095Gv.a((InterfaceC3765fM1) it.next());
                    if (interfaceC2076Tj0A != null) {
                        arrayList.add(interfaceC2076Tj0A);
                    }
                }
                if (arrayList.isEmpty()) {
                    interfaceC3765fM1B = B(interfaceC3765fM1);
                    if (interfaceC3765fM1B == null) {
                        return true;
                    }
                    C5638o21 name14 = interfaceC3765fM1.getName();
                    Intrinsics.checkNotNullExpressionValue(name14, "getName(...)");
                    linkedHashSetI = I(name14);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (interfaceC3765fM4.z()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(interfaceC3765fM1, (InterfaceC2076Tj0) it2.next())) {
                    }
                }
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name15 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name15, "getName(...)");
                linkedHashSetI = I(name15);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (E((InterfaceC3765fM1) it3.next(), interfaceC3765fM2)) {
                }
            }
            int i4 = C1095Gv.l;
            name = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!C1095Gv.b(name)) {
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name16 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name16, "getName(...)");
                linkedHashSetI = I(name16);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            C5638o21 name17 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name17, "getName(...)");
            LinkedHashSet linkedHashSetI6 = I(name17);
            arrayList = new ArrayList();
            it = linkedHashSetI6.iterator();
            while (it.hasNext()) {
                interfaceC2076Tj0A = C1095Gv.a((InterfaceC3765fM1) it.next());
                if (interfaceC2076Tj0A != null) {
                    arrayList.add(interfaceC2076Tj0A);
                }
            }
            if (arrayList.isEmpty()) {
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name18 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name18, "getName(...)");
                linkedHashSetI = I(name18);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(interfaceC3765fM1, (InterfaceC2076Tj0) it2.next())) {
                }
            }
            interfaceC3765fM1B = B(interfaceC3765fM1);
            if (interfaceC3765fM1B == null) {
                return true;
            }
            C5638o21 name19 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name19, "getName(...)");
            linkedHashSetI = I(name19);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (interfaceC3765fM4.z()) {
                }
            }
            return true;
        }
        Iterator it4 = collectionG.iterator();
        while (it4.hasNext()) {
            Set<InterfaceC0671Bj1> setJ = J((C5638o21) it4.next());
            if (setJ == null || !setJ.isEmpty()) {
                for (InterfaceC0671Bj1 interfaceC0671Bj1 : setJ) {
                    if (C(interfaceC0671Bj1, new AO0(interfaceC3765fM1, this))) {
                        if (!interfaceC0671Bj1.p0()) {
                            String name20 = interfaceC3765fM1.getName().e();
                            Intrinsics.checkNotNullExpressionValue(name20, "asString(...)");
                            Intrinsics.checkNotNullParameter(name20, "name");
                            if (!d.o(name20, "set", false)) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = C6132qO1.a;
        C5638o21 name21 = interfaceC3765fM1.getName();
        Intrinsics.checkNotNullExpressionValue(name21, "getName(...)");
        Intrinsics.checkNotNullParameter(name21, "name");
        c5638o21 = (C5638o21) C6132qO1.k.get(name21);
        if (c5638o21 == null) {
            int i5 = C1095Gv.l;
            name = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!C1095Gv.b(name)) {
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name110 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name110, "getName(...)");
                linkedHashSetI = I(name110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z() || !D(interfaceC3765fM1B, interfaceC3765fM4)) {
                    }
                }
                return true;
            }
            C5638o21 name111 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name111, "getName(...)");
            LinkedHashSet linkedHashSetI7 = I(name111);
            arrayList = new ArrayList();
            it = linkedHashSetI7.iterator();
            while (it.hasNext()) {
                interfaceC2076Tj0A = C1095Gv.a((InterfaceC3765fM1) it.next());
                if (interfaceC2076Tj0A != null) {
                    arrayList.add(interfaceC2076Tj0A);
                }
            }
            if (arrayList.isEmpty()) {
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name112 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name112, "getName(...)");
                linkedHashSetI = I(name112);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(interfaceC3765fM1, (InterfaceC2076Tj0) it2.next())) {
                }
            }
            interfaceC3765fM1B = B(interfaceC3765fM1);
            if (interfaceC3765fM1B == null) {
                return true;
            }
            C5638o21 name113 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name113, "getName(...)");
            linkedHashSetI = I(name113);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (interfaceC3765fM4.z()) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetI8 = I(c5638o21);
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            interfaceC3765fM3 = (InterfaceC3765fM1) obj2;
            Intrinsics.checkNotNullParameter(interfaceC3765fM3, "<this>");
            if (C5712oO1.b(interfaceC3765fM3) != null) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            int i6 = C1095Gv.l;
            name = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!C1095Gv.b(name)) {
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name114 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name114, "getName(...)");
                linkedHashSetI = I(name114);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            C5638o21 name115 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name115, "getName(...)");
            LinkedHashSet linkedHashSetI9 = I(name115);
            arrayList = new ArrayList();
            it = linkedHashSetI9.iterator();
            while (it.hasNext()) {
                interfaceC2076Tj0A = C1095Gv.a((InterfaceC3765fM1) it.next());
                if (interfaceC2076Tj0A != null) {
                    arrayList.add(interfaceC2076Tj0A);
                }
            }
            if (arrayList.isEmpty()) {
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name116 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name116, "getName(...)");
                linkedHashSetI = I(name116);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(interfaceC3765fM1, (InterfaceC2076Tj0) it2.next())) {
                }
            }
            interfaceC3765fM1B = B(interfaceC3765fM1);
            if (interfaceC3765fM1B == null) {
                return true;
            }
            C5638o21 name117 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name117, "getName(...)");
            linkedHashSetI = I(name117);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (interfaceC3765fM4.z()) {
                }
            }
            return true;
        }
        InterfaceC2076Tj0.a<? extends InterfaceC2076Tj0> aVarK1 = interfaceC3765fM1.K0();
        aVarK1.p(c5638o21);
        aVarK1.r();
        aVarK1.e();
        InterfaceC2076Tj0 interfaceC2076Tj0Build2 = aVarK1.build();
        Intrinsics.checkNotNull(interfaceC2076Tj0Build2);
        interfaceC3765fM2 = (InterfaceC3765fM1) interfaceC2076Tj0Build2;
        if (arrayList2.isEmpty()) {
            int i7 = C1095Gv.l;
            name = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!C1095Gv.b(name)) {
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name118 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name118, "getName(...)");
                linkedHashSetI = I(name118);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            C5638o21 name119 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name119, "getName(...)");
            LinkedHashSet linkedHashSetI10 = I(name119);
            arrayList = new ArrayList();
            it = linkedHashSetI10.iterator();
            while (it.hasNext()) {
                interfaceC2076Tj0A = C1095Gv.a((InterfaceC3765fM1) it.next());
                if (interfaceC2076Tj0A != null) {
                    arrayList.add(interfaceC2076Tj0A);
                }
            }
            if (arrayList.isEmpty()) {
                interfaceC3765fM1B = B(interfaceC3765fM1);
                if (interfaceC3765fM1B == null) {
                    return true;
                }
                C5638o21 name1110 = interfaceC3765fM1.getName();
                Intrinsics.checkNotNullExpressionValue(name1110, "getName(...)");
                linkedHashSetI = I(name1110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (interfaceC3765fM4.z()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(interfaceC3765fM1, (InterfaceC2076Tj0) it2.next())) {
                }
            }
            interfaceC3765fM1B = B(interfaceC3765fM1);
            if (interfaceC3765fM1B == null) {
                return true;
            }
            C5638o21 name1111 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name1111, "getName(...)");
            linkedHashSetI = I(name1111);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (interfaceC3765fM4.z()) {
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (E((InterfaceC3765fM1) it3.next(), interfaceC3765fM2)) {
            }
        }
        int i8 = C1095Gv.l;
        name = interfaceC3765fM1.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!C1095Gv.b(name)) {
            interfaceC3765fM1B = B(interfaceC3765fM1);
            if (interfaceC3765fM1B == null) {
                return true;
            }
            C5638o21 name1112 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name1112, "getName(...)");
            linkedHashSetI = I(name1112);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (interfaceC3765fM4.z()) {
                }
            }
            return true;
        }
        C5638o21 name1113 = interfaceC3765fM1.getName();
        Intrinsics.checkNotNullExpressionValue(name1113, "getName(...)");
        LinkedHashSet linkedHashSetI11 = I(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetI11.iterator();
        while (it.hasNext()) {
            interfaceC2076Tj0A = C1095Gv.a((InterfaceC3765fM1) it.next());
            if (interfaceC2076Tj0A != null) {
                arrayList.add(interfaceC2076Tj0A);
            }
        }
        if (arrayList.isEmpty()) {
            interfaceC3765fM1B = B(interfaceC3765fM1);
            if (interfaceC3765fM1B == null) {
                return true;
            }
            C5638o21 name1114 = interfaceC3765fM1.getName();
            Intrinsics.checkNotNullExpressionValue(name1114, "getName(...)");
            linkedHashSetI = I(name1114);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (interfaceC3765fM4.z()) {
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (K(interfaceC3765fM1, (InterfaceC2076Tj0) it2.next())) {
            }
        }
        interfaceC3765fM1B = B(interfaceC3765fM1);
        if (interfaceC3765fM1B == null) {
            return true;
        }
        C5638o21 name1115 = interfaceC3765fM1.getName();
        Intrinsics.checkNotNullExpressionValue(name1115, "getName(...)");
        linkedHashSetI = I(name1115);
        if (linkedHashSetI.isEmpty()) {
            return true;
        }
        while (r13.hasNext()) {
            if (interfaceC3765fM4.z()) {
            }
        }
        return true;
        return false;
    }

    public final void M(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        KE0 ke0 = this.b.a;
        C5208m0.m(ke0.n, location, this.n, name);
    }

    public final ArrayList N(C5638o21 c5638o21) {
        Collection<InterfaceC7991zE0> collectionC = this.e.invoke().c(c5638o21);
        ArrayList arrayList = new ArrayList(XE.m(collectionC, 10));
        Iterator<T> it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(t((InterfaceC7991zE0) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(C5638o21 c5638o21) {
        LinkedHashSet linkedHashSetI = I(c5638o21);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            InterfaceC3765fM1 interfaceC3765fM1 = (InterfaceC3765fM1) obj;
            Intrinsics.checkNotNullParameter(interfaceC3765fM1, "<this>");
            if (C5712oO1.b(interfaceC3765fM1) == null && C1095Gv.a(interfaceC3765fM1) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.QO0, defpackage.RY0, defpackage.QY0
    @NotNull
    public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        M(name, location);
        return super.b(name, location);
    }

    @Override // defpackage.QO0, defpackage.RY0, defpackage.QY0
    @NotNull
    public final Collection<InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        M(name, location);
        return super.d(name, location);
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    @Nullable
    public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        VY0<C5638o21, FC> vy0;
        FC fcInvoke;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        M(name, location);
        FO0 fo0 = this.c;
        return (fo0 == null || (vy0 = fo0.u) == null || (fcInvoke = vy0.invoke(name)) == null) ? this.u.invoke(name) : fcInvoke;
    }

    @Override // defpackage.QO0
    @NotNull
    public final Set h(@NotNull LY kindFilter, @Nullable QY qy) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return C5907pJ1.d(this.r.invoke(), this.t.invoke().keySet());
    }

    @Override // defpackage.QO0
    public final Set i(LY kindFilter, QY qy) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        FC fc = this.n;
        Collection<AbstractC4649jL0> collectionA = fc.p().a();
        Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            C2904bF.o(linkedHashSet, ((AbstractC4649jL0) it.next()).v().a());
        }
        I51<InterfaceC6148qU> i51 = this.e;
        linkedHashSet.addAll(i51.invoke().a());
        linkedHashSet.addAll(i51.invoke().e());
        linkedHashSet.addAll(h(kindFilter, qy));
        LO0 lo0 = this.b;
        linkedHashSet.addAll(lo0.a.x.c(fc, lo0));
        return linkedHashSet;
    }

    @Override // defpackage.QO0
    public final void j(@NotNull C5638o21 name, @NotNull ArrayList result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        boolean zV = this.o.v();
        FC fc = this.n;
        LO0 lo0 = this.b;
        if (zV) {
            I51<InterfaceC6148qU> i51 = this.e;
            if (i51.invoke().b(name) != null) {
                if (result.isEmpty()) {
                    IE0 ie0B = i51.invoke().b(name);
                    Intrinsics.checkNotNull(ie0B);
                    C6970uO0 c6970uO0H = C3043bv.h(lo0, ie0B);
                    C5638o21 name2 = ie0B.getName();
                    KE0 ke0 = lo0.a;
                    AE0 ae0J1 = AE0.j1(fc, c6970uO0H, name2, ke0.j.a(ie0B), true);
                    Intrinsics.checkNotNullExpressionValue(ae0J1, "createJavaMethod(...)");
                    VE0 ve0Q = C3686f.q(EnumC2880b72.e, false, null, 6);
                    AbstractC4649jL0 abstractC4649jL0D = lo0.e.d(ie0B.getType(), ve0Q);
                    InterfaceC1076Go1 interfaceC1076Go1P = p();
                    C5653o60 c5653o60 = C5653o60.d;
                    C01.d.getClass();
                    ae0J1.i1(null, interfaceC1076Go1P, c5653o60, c5653o60, c5653o60, abstractC4649jL0D, C01.h, C5323mZ.e, null);
                    ae0J1.I = 1;
                    ke0.g.getClass();
                    result.add(ae0J1);
                } else {
                    Iterator it = result.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC3765fM1) it.next()).j().isEmpty()) {
                        }
                    }
                    IE0 ie0B2 = i51.invoke().b(name);
                    Intrinsics.checkNotNull(ie0B2);
                    C6970uO0 c6970uO0H2 = C3043bv.h(lo0, ie0B2);
                    C5638o21 name3 = ie0B2.getName();
                    KE0 ke1 = lo0.a;
                    AE0 ae0J2 = AE0.j1(fc, c6970uO0H2, name3, ke1.j.a(ie0B2), true);
                    Intrinsics.checkNotNullExpressionValue(ae0J2, "createJavaMethod(...)");
                    VE0 ve0Q2 = C3686f.q(EnumC2880b72.e, false, null, 6);
                    AbstractC4649jL0 abstractC4649jL0D2 = lo0.e.d(ie0B2.getType(), ve0Q2);
                    InterfaceC1076Go1 interfaceC1076Go1P2 = p();
                    C5653o60 c5653o61 = C5653o60.d;
                    C01.d.getClass();
                    ae0J2.i1(null, interfaceC1076Go1P2, c5653o61, c5653o61, c5653o61, abstractC4649jL0D2, C01.h, C5323mZ.e, null);
                    ae0J2.I = 1;
                    ke1.g.getClass();
                    result.add(ae0J2);
                }
            }
        }
        lo0.a.x.h(fc, name, result, lo0);
    }

    @Override // defpackage.QO0
    public final InterfaceC6148qU k() {
        return new EC(this.o, C8021zO0.e);
    }

    @Override // defpackage.QO0
    public final void m(@NotNull LinkedHashSet result, @NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        LinkedHashSet linkedHashSetI = I(name);
        ArrayList arrayList = C6132qO1.a;
        Intrinsics.checkNotNullParameter(name, "<this>");
        if (!C6132qO1.j.contains(name) && !C1095Gv.b(name)) {
            if (!linkedHashSetI.isEmpty()) {
                Iterator it = linkedHashSetI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((InterfaceC2076Tj0) it.next()).z()) {
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI) {
                if (L((InterfaceC3765fM1) obj)) {
                    arrayList2.add(obj);
                }
            }
            w(result, name, arrayList2, false);
            return;
        }
        C3768fN1 c3768fN1 = new C3768fN1();
        LinkedHashSet linkedHashSetQ = UE.q(name, linkedHashSetI, C5653o60.d, this.n, G70.c, this.b.a.u.e);
        Intrinsics.checkNotNullExpressionValue(linkedHashSetQ, "resolveOverridesForNonStaticMembers(...)");
        x(name, result, linkedHashSetQ, result, new DO0(1, this));
        x(name, result, linkedHashSetQ, c3768fN1, new EO0(1, this));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((InterfaceC3765fM1) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(result, name, CollectionsKt.Q(arrayList3, c3768fN1), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0, types: [FO0, QO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Collection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Set] */
    @Override // defpackage.QO0
    public final void n(@NotNull C5638o21 name, @NotNull ArrayList result) {
        ?? linkedHashSet;
        InterfaceC7991zE0 typeParameterOwner;
        int i = 0;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zS = this.o.s();
        LO0 lo0 = this.b;
        if (zS && (typeParameterOwner = (InterfaceC7991zE0) CollectionsKt.V(this.e.invoke().c(name))) != null) {
            C01.a aVar = C01.d;
            HE0 containingDeclaration = HE0.b1(this.n, C3043bv.h(lo0, typeParameterOwner), Hc2.a(typeParameterOwner.d()), false, typeParameterOwner.getName(), lo0.a.j.a(typeParameterOwner), false);
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "create(...)");
            C0983Fj1 c0983Fj1C = JY.c(containingDeclaration, InterfaceC2396Xc.a.a);
            Intrinsics.checkNotNullExpressionValue(c0983Fj1C, "createDefaultGetter(...)");
            containingDeclaration.Y0(c0983Fj1C, null, null, null);
            Intrinsics.checkNotNullParameter(lo0, "<this>");
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
            AbstractC4649jL0 abstractC4649jL0L = QO0.l(typeParameterOwner, new LO0(lo0.a, new WO0(lo0, containingDeclaration, typeParameterOwner, 0), lo0.c));
            C5653o60 c5653o60 = C5653o60.d;
            containingDeclaration.a1(abstractC4649jL0L, c5653o60, p(), null, c5653o60);
            c0983Fj1C.q = abstractC4649jL0L;
            result.add(containingDeclaration);
        }
        Set<InterfaceC0671Bj1> setJ = J(name);
        if (setJ.isEmpty()) {
            return;
        }
        C3768fN1 elements = new C3768fN1();
        C3768fN1 c3768fN1 = new C3768fN1();
        y(setJ, result, elements, new BO0(this, i));
        Intrinsics.checkNotNullParameter(setJ, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        if (elements.isEmpty()) {
            linkedHashSet = CollectionsKt.h0(setJ);
        } else if (elements instanceof Set) {
            linkedHashSet = new LinkedHashSet();
            for (Object obj : setJ) {
                if (!elements.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
        } else {
            linkedHashSet = new LinkedHashSet(setJ);
            linkedHashSet.removeAll(elements);
        }
        y(linkedHashSet, c3768fN1, null, new CO0(this, i));
        LinkedHashSet linkedHashSetD = C5907pJ1.d(setJ, c3768fN1);
        KE0 ke0 = lo0.a;
        LinkedHashSet linkedHashSetQ = UE.q(name, linkedHashSetD, result, this.n, ke0.f, ke0.u.e);
        Intrinsics.checkNotNullExpressionValue(linkedHashSetQ, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(linkedHashSetQ);
    }

    @Override // defpackage.QO0
    @NotNull
    public final Set o(@NotNull LY kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (this.o.s()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.e.invoke().f());
        Collection<AbstractC4649jL0> collectionA = this.n.p().a();
        Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            C2904bF.o(linkedHashSet, ((AbstractC4649jL0) it.next()).v().c());
        }
        return linkedHashSet;
    }

    @Override // defpackage.QO0
    @Nullable
    public final InterfaceC1076Go1 p() {
        FC fc = this.n;
        if (fc != null) {
            int i = C4432iZ.a;
            return fc.S0();
        }
        C4432iZ.a(0);
        throw null;
    }

    @Override // defpackage.QO0
    public final InterfaceC4675jU q() {
        return this.n;
    }

    @Override // defpackage.QO0
    public final boolean r(@NotNull AE0 ae0) {
        Intrinsics.checkNotNullParameter(ae0, "<this>");
        if (this.o.s()) {
            return false;
        }
        return L(ae0);
    }

    @Override // defpackage.QO0
    @NotNull
    public final QO0.a s(@NotNull InterfaceC7991zE0 method, @NotNull ArrayList methodTypeParameters, @NotNull AbstractC4649jL0 returnType, @NotNull List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        this.b.a.e.getClass();
        if (method == null) {
            SL1.a.a(0);
            throw null;
        }
        if (this.n == null) {
            SL1.a.a(1);
            throw null;
        }
        if (returnType == null) {
            SL1.a.a(2);
            throw null;
        }
        if (valueParameters == null) {
            SL1.a.a(3);
            throw null;
        }
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(new SL1.b(returnType, valueParameters, methodTypeParameters), "resolvePropagatedSignature(...)");
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        Intrinsics.checkNotNullExpressionValue(methodTypeParameters, "getTypeParameters(...)");
        if (list != null) {
            Intrinsics.checkNotNullExpressionValue(list, "getErrors(...)");
            return new QO0.a(returnType, valueParameters, methodTypeParameters, list);
        }
        SL1.b.a(7);
        throw null;
    }

    @Override // defpackage.QO0
    @NotNull
    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public final void v(ArrayList arrayList, C3111cE0 c3111cE0, int i, InterfaceC7991zE0 interfaceC7991zE0, AbstractC4649jL0 abstractC4649jL0, AbstractC4649jL0 abstractC4649jL1) {
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        C5638o21 name = interfaceC7991zE0.getName();
        if (abstractC4649jL0 == null) {
            C3089c72.a(2);
            throw null;
        }
        P92 p92H = C3089c72.h(abstractC4649jL0, false);
        Intrinsics.checkNotNullExpressionValue(p92H, "makeNotNullable(...)");
        arrayList.add(new Yc2(c3111cE0, null, i, c0193a, name, p92H, interfaceC7991zE0.L(), false, false, abstractC4649jL1 != null ? C3089c72.h(abstractC4649jL1, false) : null, this.b.a.j.a(interfaceC7991zE0)));
    }

    public final void w(LinkedHashSet linkedHashSet, C5638o21 c5638o21, ArrayList arrayList, boolean z) {
        KE0 ke0 = this.b.a;
        LinkedHashSet<InterfaceC3765fM1> linkedHashSetQ = UE.q(c5638o21, arrayList, linkedHashSet, this.n, ke0.f, ke0.u.e);
        Intrinsics.checkNotNullExpressionValue(linkedHashSetQ, "resolveOverridesForNonStaticMembers(...)");
        if (!z) {
            linkedHashSet.addAll(linkedHashSetQ);
            return;
        }
        ArrayList arrayListQ = CollectionsKt.Q(linkedHashSet, linkedHashSetQ);
        ArrayList arrayList2 = new ArrayList(XE.m(linkedHashSetQ, 10));
        for (InterfaceC3765fM1 interfaceC3765fM1A : linkedHashSetQ) {
            InterfaceC3765fM1 interfaceC3765fM1 = (InterfaceC3765fM1) C5712oO1.c(interfaceC3765fM1A);
            if (interfaceC3765fM1 == null) {
                Intrinsics.checkNotNull(interfaceC3765fM1A);
            } else {
                Intrinsics.checkNotNull(interfaceC3765fM1A);
                interfaceC3765fM1A = A(interfaceC3765fM1A, interfaceC3765fM1, arrayListQ);
            }
            arrayList2.add(interfaceC3765fM1A);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006c  */
    public final void x(C5638o21 c5638o21, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, Function1 function1) {
        InterfaceC3765fM1 interfaceC3765fM1A;
        Object next;
        InterfaceC3765fM1 interfaceC3765fM1;
        InterfaceC3765fM1 interfaceC3765fM1A2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            InterfaceC3765fM1 interfaceC3765fM2 = (InterfaceC3765fM1) it.next();
            InterfaceC3765fM1 interfaceC3765fM3 = (InterfaceC3765fM1) C5712oO1.b(interfaceC3765fM2);
            InterfaceC3765fM1 interfaceC3765fM4 = null;
            if (interfaceC3765fM3 != null) {
                String strA = C5712oO1.a(interfaceC3765fM3);
                Intrinsics.checkNotNull(strA);
                C5638o21 c5638o21K = C5638o21.k(strA);
                Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
                Iterator it2 = ((Collection) function1.invoke(c5638o21K)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        interfaceC3765fM1A = null;
                        break;
                    }
                    InterfaceC2076Tj0.a<? extends InterfaceC2076Tj0> aVarK0 = ((InterfaceC3765fM1) it2.next()).K0();
                    aVarK0.p(c5638o21);
                    aVarK0.r();
                    aVarK0.e();
                    InterfaceC2076Tj0 interfaceC2076Tj0Build = aVarK0.build();
                    Intrinsics.checkNotNull(interfaceC2076Tj0Build);
                    InterfaceC3765fM1 interfaceC3765fM5 = (InterfaceC3765fM1) interfaceC2076Tj0Build;
                    if (E(interfaceC3765fM3, interfaceC3765fM5)) {
                        interfaceC3765fM1A = A(interfaceC3765fM5, interfaceC3765fM3, linkedHashSet);
                        break;
                    }
                }
            } else {
                interfaceC3765fM1A = null;
                break;
            }
            UE.b(abstractSet, interfaceC3765fM1A);
            InterfaceC2076Tj0 interfaceC2076Tj0A = C1095Gv.a(interfaceC3765fM2);
            if (interfaceC2076Tj0A == null) {
                interfaceC3765fM1A2 = null;
            } else {
                C5638o21 name = interfaceC2076Tj0A.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Iterator it3 = ((Iterable) function1.invoke(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!K((InterfaceC3765fM1) next, interfaceC2076Tj0A));
                InterfaceC3765fM1 interfaceC3765fM6 = (InterfaceC3765fM1) next;
                if (interfaceC3765fM6 != null) {
                    InterfaceC2076Tj0.a<? extends InterfaceC2076Tj0> aVarK1 = interfaceC3765fM6.K0();
                    List<Xc2> listJ = interfaceC2076Tj0A.j();
                    Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                    ArrayList arrayList = new ArrayList(XE.m(listJ, 10));
                    Iterator<T> it4 = listJ.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((Xc2) it4.next()).getType());
                    }
                    List<Xc2> listJ2 = interfaceC3765fM6.j();
                    Intrinsics.checkNotNullExpressionValue(listJ2, "getValueParameters(...)");
                    aVarK1.b(C1874Qu.g(arrayList, listJ2, interfaceC2076Tj0A));
                    aVarK1.r();
                    aVarK1.e();
                    aVarK1.h();
                    interfaceC3765fM1 = (InterfaceC3765fM1) aVarK1.build();
                } else {
                    interfaceC3765fM1 = null;
                }
                if (interfaceC3765fM1 == null) {
                    interfaceC3765fM1A2 = null;
                } else {
                    if (!L(interfaceC3765fM1)) {
                        interfaceC3765fM1 = null;
                    }
                    if (interfaceC3765fM1 != null) {
                        interfaceC3765fM1A2 = A(interfaceC3765fM1, interfaceC2076Tj0A, linkedHashSet);
                    } else {
                        interfaceC3765fM1A2 = null;
                    }
                }
            }
            UE.b(abstractSet, interfaceC3765fM1A2);
            if (interfaceC3765fM2.z()) {
                C5638o21 name2 = interfaceC3765fM2.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                Iterator it5 = ((Iterable) function1.invoke(name2)).iterator();
                while (it5.hasNext()) {
                    InterfaceC3765fM1 interfaceC3765fM1B = B((InterfaceC3765fM1) it5.next());
                    if (interfaceC3765fM1B == null || !D(interfaceC3765fM1B, interfaceC3765fM2)) {
                        interfaceC3765fM1B = null;
                    }
                    if (interfaceC3765fM1B != null) {
                        interfaceC3765fM4 = interfaceC3765fM1B;
                        break;
                    }
                }
            }
            UE.b(abstractSet, interfaceC3765fM4);
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, C3768fN1 c3768fN1, Function1 function1) {
        InterfaceC3765fM1 interfaceC3765fM1H;
        C1687Oj1 c1687Oj1J;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC0671Bj1 interfaceC0671Bj1 = (InterfaceC0671Bj1) it.next();
            C6940uE0 c6940uE0 = null;
            if (C(interfaceC0671Bj1, function1)) {
                InterfaceC3765fM1 interfaceC3765fM1G = G(interfaceC0671Bj1, function1);
                Intrinsics.checkNotNull(interfaceC3765fM1G);
                if (interfaceC0671Bj1.p0()) {
                    interfaceC3765fM1H = H(interfaceC0671Bj1, function1);
                    Intrinsics.checkNotNull(interfaceC3765fM1H);
                } else {
                    interfaceC3765fM1H = null;
                }
                if (interfaceC3765fM1H != null) {
                    interfaceC3765fM1H.q();
                    interfaceC3765fM1G.q();
                }
                C6940uE0 c6940uE1 = new C6940uE0(this.n, interfaceC3765fM1G, interfaceC3765fM1H, interfaceC0671Bj1);
                AbstractC4649jL0 abstractC4649jL0N = interfaceC3765fM1G.n();
                Intrinsics.checkNotNull(abstractC4649jL0N);
                C5653o60 c5653o60 = C5653o60.d;
                c6940uE1.a1(abstractC4649jL0N, c5653o60, p(), null, c5653o60);
                C0983Fj1 c0983Fj1I = JY.i(c6940uE1, interfaceC3765fM1G.k(), false, interfaceC3765fM1G.i());
                c0983Fj1I.p = interfaceC3765fM1G;
                c0983Fj1I.X0(c6940uE1.getType());
                Intrinsics.checkNotNullExpressionValue(c0983Fj1I, "apply(...)");
                if (interfaceC3765fM1H != null) {
                    List<Xc2> listJ = interfaceC3765fM1H.j();
                    Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                    Xc2 xc2 = (Xc2) CollectionsKt.firstOrNull(listJ);
                    if (xc2 == null) {
                        throw new AssertionError("No parameter found for " + interfaceC3765fM1H);
                    }
                    c1687Oj1J = JY.j(c6940uE1, interfaceC3765fM1H.k(), xc2.k(), false, interfaceC3765fM1H.d(), interfaceC3765fM1H.i());
                    c1687Oj1J.p = interfaceC3765fM1H;
                } else {
                    c1687Oj1J = null;
                }
                c6940uE1.Y0(c0983Fj1I, c1687Oj1J, null, null);
                c6940uE0 = c6940uE1;
            }
            if (c6940uE0 != null) {
                abstractCollection.add(c6940uE0);
                if (c3768fN1 != null) {
                    c3768fN1.add(interfaceC0671Bj1);
                    return;
                }
                return;
            }
        }
    }

    public final Collection<AbstractC4649jL0> z() {
        boolean z = this.p;
        FC fc = this.n;
        if (!z) {
            return this.b.a.u.c.z(fc);
        }
        Collection<AbstractC4649jL0> collectionA = fc.p().a();
        Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
        return collectionA;
    }
}

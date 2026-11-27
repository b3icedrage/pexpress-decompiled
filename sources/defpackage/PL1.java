package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PL1 {
    public final AbstractC4649jL0 a(InterfaceC2678aE0 interfaceC2678aE0, InterfaceC1335Jx interfaceC1335Jx, boolean z, LO0 lo0, EnumC1976Sc enumC1976Sc, C7755y62 c7755y62, boolean z2, Function1 function1) {
        RL1 rl1 = new RL1(interfaceC1335Jx, z, lo0, enumC1976Sc, false);
        AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) function1.invoke(interfaceC2678aE0);
        Collection<? extends InterfaceC1490Lx> collectionU = interfaceC2678aE0.u();
        Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC1490Lx> collection = collectionU;
        ArrayList arrayList = new ArrayList(XE.m(collection, 10));
        for (InterfaceC1490Lx interfaceC1490Lx : collection) {
            Intrinsics.checkNotNull(interfaceC1490Lx);
            arrayList.add((AbstractC4649jL0) function1.invoke(interfaceC1490Lx));
        }
        return b(rl1, abstractC4649jL0, arrayList, c7755y62, z2);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:114:0x0210  */
    /* JADX WARN: Code duplicated, block: B:119:0x0223  */
    /* JADX WARN: Code duplicated, block: B:123:0x022f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0237  */
    /* JADX WARN: Code duplicated, block: B:129:0x023f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0245  */
    /* JADX WARN: Code duplicated, block: B:133:0x024e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0251  */
    /* JADX WARN: Code duplicated, block: B:136:0x0256  */
    /* JADX WARN: Code duplicated, block: B:139:0x025a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x0264  */
    /* JADX WARN: Code duplicated, block: B:142:0x0267  */
    /* JADX WARN: Code duplicated, block: B:144:0x026a  */
    /* JADX WARN: Code duplicated, block: B:145:0x026d  */
    /* JADX WARN: Code duplicated, block: B:154:0x027e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0295  */
    /* JADX WARN: Code duplicated, block: B:164:0x0299 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x029c  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:178:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:216:0x034b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0214 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x0196  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [m71] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kE0] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [m71] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r5v12, types: [Tc] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [m71] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v41, types: [S11] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    public final AbstractC4649jL0 b(RL1 rl1, AbstractC4649jL0 abstractC4649jL0, List<? extends AbstractC4649jL0> overrides, C7755y62 c7755y62, boolean z) {
        int size;
        boolean z2;
        InterfaceC5702oL0 interfaceC5702oL0;
        Iterable iterableK;
        int i;
        Iterable annotations;
        H62 h62Q;
        ArrayList arrayList;
        EnumC1976Sc enumC1976Sc;
        ArrayList arrayList2;
        EnumC1976Sc enumC1976Sc2;
        boolean z3;
        Iterable iterableK2;
        Iterator it;
        LO0 lo0;
        S11 s11;
        ?? r5;
        boolean z4;
        C2054Tc c2054TcE;
        C3901g1 forceWarning;
        Iterator it2;
        C5448n71 c5448n71;
        boolean z5;
        C5448n71 c5448n72;
        EnumC1976Sc enumC1976Sc3;
        C3114cF0 c3114cF0;
        ?? r1;
        C5448n71 c5448n71B;
        C5448n71 c5448n71A;
        Object obj;
        boolean z6;
        C5448n71 c5448n71B2;
        C2905bF0 c2905bF0;
        ?? r2;
        boolean z7;
        boolean z8;
        EnumC5238m71 enumC5238m71;
        EnumC5238m71 enumC5238m72;
        EnumC5238m71 enumC5238m73;
        EnumC5238m71 enumC5238m74;
        boolean z9;
        Object next;
        C5448n71 c5448n71H;
        InterfaceC1583Nc interfaceC1583NcJ;
        EnumC2599Zr1 enumC2599Zr1I;
        C5448n71 c5448n71H2;
        boolean z10;
        C5448n71 c5448n71A2;
        C1758Ph0 c1758Ph0D;
        S11 s12;
        InterfaceC6494s62 interfaceC6494s62X;
        EnumC5238m71 enumC5238m75;
        boolean z11;
        Object c2905bF1;
        InterfaceC5702oL0 interfaceC5702oL1;
        ?? C;
        boolean z12;
        EnumC3718f72 enumC3718f72C;
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        ArrayList arrayListD = rl1.d(abstractC4649jL0);
        ArrayList arrayList3 = new ArrayList(XE.m(overrides, 10));
        Iterator it3 = overrides.iterator();
        while (it3.hasNext()) {
            arrayList3.add(rl1.d((InterfaceC5702oL0) it3.next()));
        }
        LO0 lo1 = rl1.c;
        boolean z13 = rl1.b;
        if (!z13 || overrides.isEmpty()) {
            size = arrayListD.size();
            break;
        }
        Iterator it4 = overrides.iterator();
        while (true) {
            if (!it4.hasNext()) {
                size = arrayListD.size();
                break;
            }
            InterfaceC5702oL0 other = (InterfaceC5702oL0) it4.next();
            Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
            Intrinsics.checkNotNullParameter(other, "other");
            if (!lo1.a.u.c(abstractC4649jL0, (AbstractC4649jL0) other)) {
                size = 1;
                break;
            }
        }
        C2905bF0[] c2905bF0Arr = new C2905bF0[size];
        int i2 = 0;
        while (i2 < size) {
            AbstractC4579j1.a aVar = (AbstractC4579j1.a) arrayListD.get(i2);
            InterfaceC5702oL0 interfaceC5702oL2 = aVar.a;
            C3136cM1 c3136cM1 = C3136cM1.a;
            InterfaceC5095lU interfaceC5095lU = rl1.a;
            J62 receiver = aVar.c;
            if (interfaceC5702oL2 != null) {
                if (receiver == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                interfaceC5702oL0 = aVar.a;
                if (interfaceC5702oL0 != null) {
                    Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
                    iterableK = ((AbstractC4649jL0) interfaceC5702oL0).k();
                } else {
                    iterableK = C5653o60.d;
                }
                i = size;
                annotations = iterableK;
                if (interfaceC5702oL0 != null || (interfaceC6494s62X = c3136cM1.X(interfaceC5702oL0)) == null) {
                    h62Q = null;
                } else {
                    h62Q = InterfaceC4366iD.a.q(interfaceC6494s62X);
                }
                arrayList = arrayListD;
                enumC1976Sc = EnumC1976Sc.TYPE_PARAMETER_BOUNDS;
                arrayList2 = arrayList3;
                enumC1976Sc2 = rl1.d;
                if (enumC1976Sc2 == enumC1976Sc) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (!z3) {
                        lo1.a.t.getClass();
                    }
                    if (interfaceC5095lU != null || (iterableK2 = interfaceC5095lU.k()) == null) {
                        iterableK2 = C5653o60.d;
                    }
                    annotations = CollectionsKt.O(iterableK2, annotations);
                }
                C2054Tc c2054TcE2 = rl1.e();
                c2054TcE2.getClass();
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                it = annotations.iterator();
                lo0 = lo1;
                s11 = null;
                r5 = c2054TcE2;
                while (true) {
                    if (it.hasNext()) {
                        z4 = z13;
                        break;
                    }
                    z4 = z13;
                    c1758Ph0D = r5.d(it.next());
                    ?? r26 = r5;
                    if (CollectionsKt.z(C3542eI0.n, c1758Ph0D)) {
                        s12 = S11.d;
                    } else {
                        if (CollectionsKt.z(C3542eI0.o, c1758Ph0D)) {
                            s12 = S11.e;
                        } else {
                            continue;
                        }
                        z13 = z4;
                        r5 = r26;
                    }
                    if (s11 == null && s11 != s12) {
                        s11 = null;
                        break;
                    }
                    s11 = s12;
                    z13 = z4;
                    r5 = r26;
                }
                c2054TcE = rl1.e();
                forceWarning = new C3901g1(rl1, aVar);
                c2054TcE.getClass();
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                Intrinsics.checkNotNullParameter(forceWarning, "forceWarning");
                it2 = annotations.iterator();
                c5448n71 = null;
                while (true) {
                    if (it2.hasNext()) {
                        z5 = z2;
                        c5448n72 = null;
                        break;
                    }
                    Iterator it5 = it2;
                    next = it5.next();
                    z5 = z2;
                    c5448n71H = c2054TcE.h(((Boolean) forceWarning.invoke(next)).booleanValue(), next);
                    if (c5448n71H != null) {
                        c5448n71A2 = c5448n71H;
                    } else {
                        interfaceC1583NcJ = c2054TcE.j(next);
                        if (interfaceC1583NcJ != null) {
                            enumC2599Zr1I = c2054TcE.i(next);
                            if (enumC2599Zr1I == null) {
                                enumC2599Zr1I = c2054TcE.a.a.a;
                            }
                            enumC2599Zr1I.getClass();
                            if (enumC2599Zr1I == EnumC2599Zr1.IGNORE) {
                                c5448n71A2 = null;
                            } else {
                                c5448n71H2 = c2054TcE.h(((Boolean) forceWarning.invoke(interfaceC1583NcJ)).booleanValue(), interfaceC1583NcJ);
                                if (c5448n71H2 != null) {
                                    if (enumC2599Zr1I == EnumC2599Zr1.WARN) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    c2054TcE = c2054TcE;
                                    c5448n72 = null;
                                    c5448n71A2 = C5448n71.a(c5448n71H2, null, z10, 1);
                                } else {
                                    c2054TcE = c2054TcE;
                                    c5448n72 = null;
                                    c5448n71A2 = null;
                                }
                            }
                        } else {
                            c2054TcE = c2054TcE;
                            c5448n72 = null;
                            c5448n71A2 = null;
                        }
                        if (c5448n71 != null) {
                            c5448n71 = c5448n71A2;
                        } else if (c5448n71A2 != null && !c5448n71A2.equals(c5448n71)) {
                            boolean z14 = c5448n71.b;
                            boolean z15 = c5448n71A2.b;
                            if (!z15 || z14) {
                                if (z15 || !z14) {
                                    c5448n71 = c5448n72;
                                    break;
                                }
                                c5448n71 = c5448n71A2;
                            }
                        }
                        c2054TcE = c2054TcE;
                        it2 = it5;
                        z2 = z5;
                    }
                    c5448n72 = null;
                    if (c5448n71 != null) {
                        c5448n71 = c5448n71A2;
                    } else if (c5448n71A2 != null) {
                        continue;
                    }
                    c2054TcE = c2054TcE;
                    it2 = it5;
                    z2 = z5;
                }
                if (c5448n71 != null) {
                    enumC5238m73 = EnumC5238m71.g;
                    enumC5238m74 = c5448n71.a;
                    if (enumC5238m74 == enumC5238m73 || h62Q == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    c2905bF0 = new C2905bF0(enumC5238m74, s11, z9, c5448n71.b);
                } else {
                    if (!z5 || z3) {
                        enumC1976Sc3 = enumC1976Sc2;
                    } else {
                        enumC1976Sc3 = EnumC1976Sc.TYPE_USE;
                    }
                    c3114cF0 = aVar.b;
                    if (c3114cF0 != null) {
                        r1 = c3114cF0.a.get(enumC1976Sc3);
                    } else {
                        r1 = c5448n72;
                    }
                    if (h62Q != null) {
                        c5448n71B = rl1.b(h62Q);
                    } else {
                        c5448n71B = c5448n72;
                    }
                    if (c5448n71B != null) {
                        c5448n71A = C5448n71.a(c5448n71B, EnumC5238m71.g, false, 2);
                    } else if (r1 != 0) {
                        c5448n71A = r1.a;
                    } else {
                        c5448n71A = c5448n72;
                    }
                    if (c5448n71B != null) {
                        obj = c5448n71B.a;
                    } else {
                        obj = c5448n72;
                    }
                    if (obj == EnumC5238m71.g && (h62Q == null || r1 == 0 || !r1.c)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (receiver != null || (c5448n71B2 = rl1.b(receiver)) == null) {
                        c5448n71B2 = c5448n72;
                    } else if (c5448n71B2.a == EnumC5238m71.e) {
                        c5448n71B2 = C5448n71.a(c5448n71B2, EnumC5238m71.d, false, 2);
                    }
                    if (c5448n71B2 != null) {
                        if (c5448n71A == null) {
                            c5448n71A = c5448n71B2;
                        } else {
                            boolean z16 = c5448n71A.b;
                            z8 = c5448n71B2.b;
                            if (z8 || z16) {
                                if (z8 && z16) {
                                    c5448n71A = c5448n71B2;
                                } else {
                                    enumC5238m71 = c5448n71B2.a;
                                    enumC5238m72 = c5448n71A.a;
                                    if (enumC5238m71.compareTo(enumC5238m72) >= 0 && enumC5238m71.compareTo(enumC5238m72) > 0) {
                                        c5448n71A = c5448n71B2;
                                    }
                                }
                            }
                        }
                    }
                    if (c5448n71A != null) {
                        r2 = c5448n71A.a;
                    } else {
                        r2 = c5448n72;
                    }
                    if (c5448n71A == null && c5448n71A.b) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    c2905bF0 = new C2905bF0(r2, s11, z6, z7);
                }
            } else {
                if (receiver != null) {
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    if (!(receiver instanceof H62)) {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(receiver);
                        sb.append(", ");
                        throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
                    }
                    EnumC3610ed2 enumC3610ed2S = ((H62) receiver).S();
                    Intrinsics.checkNotNullExpressionValue(enumC3610ed2S, "getVariance(...)");
                    enumC3718f72C = C4994l.c(enumC3610ed2S);
                } else {
                    enumC3718f72C = null;
                }
                if (enumC3718f72C == EnumC3718f72.IN) {
                    c2905bF0 = C2905bF0.e;
                    i = size;
                    arrayList = arrayListD;
                    arrayList2 = arrayList3;
                    lo0 = lo1;
                    z4 = z13;
                    c5448n72 = null;
                } else {
                    if (receiver == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    interfaceC5702oL0 = aVar.a;
                    if (interfaceC5702oL0 != null) {
                        Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
                        iterableK = ((AbstractC4649jL0) interfaceC5702oL0).k();
                    } else {
                        iterableK = C5653o60.d;
                    }
                    i = size;
                    annotations = iterableK;
                    if (interfaceC5702oL0 != null) {
                        h62Q = null;
                    } else {
                        h62Q = null;
                    }
                    arrayList = arrayListD;
                    enumC1976Sc = EnumC1976Sc.TYPE_PARAMETER_BOUNDS;
                    arrayList2 = arrayList3;
                    enumC1976Sc2 = rl1.d;
                    if (enumC1976Sc2 == enumC1976Sc) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                        if (!z3) {
                            lo1.a.t.getClass();
                        }
                        if (interfaceC5095lU != null) {
                            iterableK2 = C5653o60.d;
                        } else {
                            iterableK2 = C5653o60.d;
                        }
                        annotations = CollectionsKt.O(iterableK2, annotations);
                    }
                    C2054Tc c2054TcE3 = rl1.e();
                    c2054TcE3.getClass();
                    Intrinsics.checkNotNullParameter(annotations, "annotations");
                    it = annotations.iterator();
                    lo0 = lo1;
                    s11 = null;
                    r5 = c2054TcE3;
                    while (true) {
                        if (it.hasNext()) {
                            z4 = z13;
                            break;
                        }
                        z4 = z13;
                        c1758Ph0D = r5.d(it.next());
                        ?? r27 = r5;
                        if (CollectionsKt.z(C3542eI0.n, c1758Ph0D)) {
                            s12 = S11.d;
                        } else {
                            if (CollectionsKt.z(C3542eI0.o, c1758Ph0D)) {
                                s12 = S11.e;
                            } else {
                                continue;
                            }
                            z13 = z4;
                            r5 = r27;
                        }
                        if (s11 == null) {
                        }
                        s11 = s12;
                        z13 = z4;
                        r5 = r27;
                    }
                    c2054TcE = rl1.e();
                    forceWarning = new C3901g1(rl1, aVar);
                    c2054TcE.getClass();
                    Intrinsics.checkNotNullParameter(annotations, "annotations");
                    Intrinsics.checkNotNullParameter(forceWarning, "forceWarning");
                    it2 = annotations.iterator();
                    c5448n71 = null;
                    while (true) {
                        if (it2.hasNext()) {
                            z5 = z2;
                            c5448n72 = null;
                            break;
                        }
                        Iterator it6 = it2;
                        next = it6.next();
                        z5 = z2;
                        c5448n71H = c2054TcE.h(((Boolean) forceWarning.invoke(next)).booleanValue(), next);
                        if (c5448n71H != null) {
                            c5448n71A2 = c5448n71H;
                        } else {
                            interfaceC1583NcJ = c2054TcE.j(next);
                            if (interfaceC1583NcJ != null) {
                                enumC2599Zr1I = c2054TcE.i(next);
                                if (enumC2599Zr1I == null) {
                                    enumC2599Zr1I = c2054TcE.a.a.a;
                                }
                                enumC2599Zr1I.getClass();
                                if (enumC2599Zr1I == EnumC2599Zr1.IGNORE) {
                                    c5448n71A2 = null;
                                } else {
                                    c5448n71H2 = c2054TcE.h(((Boolean) forceWarning.invoke(interfaceC1583NcJ)).booleanValue(), interfaceC1583NcJ);
                                    if (c5448n71H2 != null) {
                                        if (enumC2599Zr1I == EnumC2599Zr1.WARN) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        c2054TcE = c2054TcE;
                                        c5448n72 = null;
                                        c5448n71A2 = C5448n71.a(c5448n71H2, null, z10, 1);
                                    } else {
                                        c2054TcE = c2054TcE;
                                        c5448n72 = null;
                                        c5448n71A2 = null;
                                    }
                                }
                            } else {
                                c2054TcE = c2054TcE;
                                c5448n72 = null;
                                c5448n71A2 = null;
                            }
                            if (c5448n71 != null) {
                                c5448n71 = c5448n71A2;
                            } else if (c5448n71A2 != null) {
                                continue;
                            }
                            c2054TcE = c2054TcE;
                            it2 = it6;
                            z2 = z5;
                        }
                        c5448n72 = null;
                        if (c5448n71 != null) {
                            c5448n71 = c5448n71A2;
                        } else if (c5448n71A2 != null) {
                            continue;
                        }
                        c2054TcE = c2054TcE;
                        it2 = it6;
                        z2 = z5;
                    }
                    if (c5448n71 != null) {
                        enumC5238m73 = EnumC5238m71.g;
                        enumC5238m74 = c5448n71.a;
                        if (enumC5238m74 == enumC5238m73) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        c2905bF0 = new C2905bF0(enumC5238m74, s11, z9, c5448n71.b);
                    } else {
                        if (z5) {
                            enumC1976Sc3 = enumC1976Sc2;
                        } else {
                            enumC1976Sc3 = enumC1976Sc2;
                        }
                        c3114cF0 = aVar.b;
                        if (c3114cF0 != null) {
                            r1 = c3114cF0.a.get(enumC1976Sc3);
                        } else {
                            r1 = c5448n72;
                        }
                        if (h62Q != null) {
                            c5448n71B = rl1.b(h62Q);
                        } else {
                            c5448n71B = c5448n72;
                        }
                        if (c5448n71B != null) {
                            c5448n71A = C5448n71.a(c5448n71B, EnumC5238m71.g, false, 2);
                        } else if (r1 != 0) {
                            c5448n71A = r1.a;
                        } else {
                            c5448n71A = c5448n72;
                        }
                        if (c5448n71B != null) {
                            obj = c5448n71B.a;
                        } else {
                            obj = c5448n72;
                        }
                        if (obj == EnumC5238m71.g) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (receiver != null) {
                            c5448n71B2 = c5448n72;
                        } else {
                            c5448n71B2 = c5448n72;
                        }
                        if (c5448n71B2 != null) {
                            if (c5448n71A == null) {
                                c5448n71A = c5448n71B2;
                            } else {
                                boolean z17 = c5448n71A.b;
                                z8 = c5448n71B2.b;
                                if (z8) {
                                    if (z8) {
                                        enumC5238m71 = c5448n71B2.a;
                                        enumC5238m72 = c5448n71A.a;
                                        if (enumC5238m71.compareTo(enumC5238m72) >= 0) {
                                            c5448n71A = c5448n71B2;
                                        }
                                    } else {
                                        enumC5238m71 = c5448n71B2.a;
                                        enumC5238m72 = c5448n71A.a;
                                        if (enumC5238m71.compareTo(enumC5238m72) >= 0) {
                                            c5448n71A = c5448n71B2;
                                        }
                                    }
                                } else if (z8) {
                                    enumC5238m71 = c5448n71B2.a;
                                    enumC5238m72 = c5448n71A.a;
                                    if (enumC5238m71.compareTo(enumC5238m72) >= 0) {
                                        c5448n71A = c5448n71B2;
                                    }
                                } else {
                                    enumC5238m71 = c5448n71B2.a;
                                    enumC5238m72 = c5448n71A.a;
                                    if (enumC5238m71.compareTo(enumC5238m72) >= 0) {
                                        c5448n71A = c5448n71B2;
                                    }
                                }
                            }
                        }
                        if (c5448n71A != null) {
                            r2 = c5448n71A.a;
                        } else {
                            r2 = c5448n72;
                        }
                        if (c5448n71A == null) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        c2905bF0 = new C2905bF0(r2, s11, z6, z7);
                    }
                }
            }
            ArrayList<C2905bF0> superQualifiers = new ArrayList();
            Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                AbstractC4579j1.a aVar2 = (AbstractC4579j1.a) CollectionsKt.H(i2, (List) it7.next());
                if (aVar2 == null || (interfaceC5702oL1 = aVar2.a) == null) {
                    c2905bF1 = c5448n72;
                } else {
                    EnumC5238m71 enumC5238m71C = AbstractC4579j1.c(interfaceC5702oL1);
                    if (enumC5238m71C == null) {
                        Intrinsics.checkNotNullParameter(interfaceC5702oL1, "<this>");
                        AbstractC4649jL0 abstractC4649jL0E = C6621sj.e((AbstractC4649jL0) interfaceC5702oL1);
                        C = abstractC4649jL0E != null ? AbstractC4579j1.c(abstractC4649jL0E) : c5448n72;
                    } else {
                        C = enumC5238m71C;
                    }
                    String str = RE0.a;
                    ?? r8 = RE0.k.containsKey(rl1.f(c3136cM1.r(interfaceC5702oL1))) ? S11.d : RE0.j.containsKey(rl1.f(c3136cM1.I(interfaceC5702oL1))) ? S11.e : c5448n72;
                    if (c3136cM1.z(interfaceC5702oL1)) {
                        z12 = true;
                    } else {
                        Intrinsics.checkNotNullParameter(interfaceC5702oL1, "<this>");
                        if (((AbstractC4649jL0) interfaceC5702oL1).Y0() instanceof K51) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    c2905bF1 = new C2905bF0(C, r8, z12, C != enumC5238m71C);
                }
                if (c2905bF1 != null) {
                    superQualifiers.add(c2905bF1);
                }
            }
            boolean z18 = i2 == 0 && z4;
            boolean z19 = i2 == 0 && (interfaceC5095lU instanceof Xc2) && ((Xc2) interfaceC5095lU).q0() != null;
            Intrinsics.checkNotNullParameter(c2905bF0, "<this>");
            Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
            ArrayList arrayList4 = new ArrayList();
            for (C2905bF0 c2905bF2 : superQualifiers) {
                Object obj2 = c2905bF2.d ? c5448n72 : c2905bF2.a;
                if (obj2 != null) {
                    arrayList4.add(obj2);
                }
            }
            Set setH0 = CollectionsKt.h0(arrayList4);
            EnumC5238m71 enumC5238m76 = c2905bF0.a;
            ?? r9 = c2905bF0.d ? c5448n72 : enumC5238m76;
            EnumC5238m71 enumC5238m77 = EnumC5238m71.d;
            if (r9 != enumC5238m77) {
                enumC5238m77 = (EnumC5238m71) C4466ii.B(setH0, EnumC5238m71.g, EnumC5238m71.e, r9, z18);
            }
            if (enumC5238m77 == null) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it8 = superQualifiers.iterator();
                while (it8.hasNext()) {
                    EnumC5238m71 enumC5238m78 = ((C2905bF0) it8.next()).a;
                    if (enumC5238m78 != null) {
                        arrayList5.add(enumC5238m78);
                    }
                }
                Set setH1 = CollectionsKt.h0(arrayList5);
                enumC5238m75 = EnumC5238m71.d;
                if (enumC5238m76 != enumC5238m75) {
                    enumC5238m75 = (EnumC5238m71) C4466ii.B(setH1, EnumC5238m71.g, EnumC5238m71.e, enumC5238m76, z18);
                }
            } else {
                enumC5238m75 = enumC5238m77;
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it9 = superQualifiers.iterator();
            while (it9.hasNext()) {
                S11 s13 = ((C2905bF0) it9.next()).b;
                if (s13 != null) {
                    arrayList6.add(s13);
                }
            }
            S11 s14 = (S11) C4466ii.B(CollectionsKt.h0(arrayList6), S11.e, S11.d, c2905bF0.b, z18);
            ?? r15 = (enumC5238m75 == null || z || (z19 && enumC5238m75 == EnumC5238m71.e)) ? c5448n72 : enumC5238m75;
            if (r15 != EnumC5238m71.g) {
                z11 = false;
            } else {
                if (!c2905bF0.c) {
                    if (!superQualifiers.isEmpty()) {
                        Iterator it10 = superQualifiers.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                if (((C2905bF0) it10.next()).c) {
                                }
                            }
                        }
                    }
                    z11 = false;
                }
                z11 = true;
            }
            c2905bF0Arr[i2] = new C2905bF0(r15, s14, z11, (r15 == 0 || enumC5238m77 == enumC5238m75) ? false : true);
            i2++;
            arrayListD = arrayList;
            size = i;
            arrayList3 = arrayList2;
            lo1 = lo0;
            z13 = z4;
        }
        C4111h1 qualifiers = new C4111h1(c7755y62, c2905bF0Arr);
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return WE0.b(abstractC4649jL0.Y0(), qualifiers, 0, rl1.e).a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01da  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:113:0x0215  */
    /* JADX WARN: Code duplicated, block: B:114:0x0219  */
    /* JADX WARN: Code duplicated, block: B:120:0x0226  */
    /* JADX WARN: Code duplicated, block: B:122:0x022b  */
    /* JADX WARN: Code duplicated, block: B:123:0x022f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0251  */
    /* JADX WARN: Code duplicated, block: B:131:0x0262  */
    /* JADX WARN: Code duplicated, block: B:133:0x0266  */
    /* JADX WARN: Code duplicated, block: B:138:0x0278  */
    /* JADX WARN: Code duplicated, block: B:141:0x0282  */
    /* JADX WARN: Code duplicated, block: B:146:0x029a  */
    /* JADX WARN: Code duplicated, block: B:147:0x029d  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:168:0x02db  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:173:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:177:0x0303  */
    /* JADX WARN: Code duplicated, block: B:179:0x030b  */
    /* JADX WARN: Code duplicated, block: B:181:0x030f  */
    /* JADX WARN: Code duplicated, block: B:186:0x032d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[LOOP:4: B:139:0x027c->B:209:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c1  */
    @NotNull
    public final ArrayList c(@NotNull LO0 c, @NotNull Collection platformSignatures) {
        InterfaceC2396Xc interfaceC2396XcK;
        InterfaceC1335Jx interfaceC1335Jx;
        AbstractC4649jL0 type;
        C4929kg1 c4929kg1;
        boolean z;
        String str;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        InterfaceC0671Bj1 interfaceC0671Bj1;
        EnumC1976Sc enumC1976Sc;
        C7755y62 c7755y62;
        InterfaceC2678aE0 interfaceC2678aE0;
        AbstractC4649jL0 abstractC4649jL0A;
        AbstractC4649jL0 abstractC4649jL0N;
        OL1 ol1;
        boolean z2;
        Pair pair;
        ArrayList arrayList3;
        int i;
        int i2;
        int i3;
        AbstractC4649jL0 type2;
        InterfaceC1076Go1 interfaceC1076Go1R0;
        InterfaceC1076Go1 interfaceC1076Go1R1;
        boolean zC;
        List<Xc2> listJ;
        Iterator<T> it;
        AbstractC4649jL0 type3;
        boolean z3;
        AbstractC4649jL0 type4;
        C7755y62 c7755y63;
        LO0 lo0;
        LO0 lo0G;
        List<C7755y62> list;
        LO0 lo0G2;
        C0983Fj1 c0983Fj1;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<InterfaceC1490Lx> collection = platformSignatures;
        int i4 = 10;
        ArrayList arrayList4 = new ArrayList(XE.m(collection, 10));
        for (InterfaceC1490Lx memberDescriptor : collection) {
            if (memberDescriptor instanceof InterfaceC2678aE0) {
                boolean z4 = true;
                if (memberDescriptor.h() == InterfaceC1490Lx.a.e && memberDescriptor.U0().u().size() == 1) {
                    i = i4;
                } else {
                    InterfaceC5044lD interfaceC5044lDP = C0957Fb.p(memberDescriptor);
                    if (interfaceC5044lDP == null) {
                        interfaceC2396XcK = memberDescriptor.k();
                    } else {
                        C7180vO0 c7180vO0 = interfaceC5044lDP instanceof C7180vO0 ? (C7180vO0) interfaceC5044lDP : null;
                        List list2 = c7180vO0 != null ? (List) c7180vO0.o.getValue() : null;
                        if (list2 == null || list2.isEmpty()) {
                            interfaceC2396XcK = memberDescriptor.k();
                        } else {
                            ArrayList arrayList5 = new ArrayList(XE.m(list2, i4));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(new C6550sO0((QD0) it2.next(), c, true));
                            }
                            ArrayList annotations = CollectionsKt.O(memberDescriptor.k(), arrayList5);
                            Intrinsics.checkNotNullParameter(annotations, "annotations");
                            interfaceC2396XcK = annotations.isEmpty() ? InterfaceC2396Xc.a.a : new C2552Zc(annotations);
                        }
                    }
                    LO0 lo0G3 = C2432Xo.g(c, interfaceC2396XcK);
                    if (!(memberDescriptor instanceof HE0) || (c0983Fj1 = ((C0749Cj1) memberDescriptor).A) == null || c0983Fj1.i) {
                        interfaceC1335Jx = memberDescriptor;
                    } else {
                        Intrinsics.checkNotNull(c0983Fj1);
                        interfaceC1335Jx = c0983Fj1;
                    }
                    if (memberDescriptor.r0() != null) {
                        InterfaceC2076Tj0 interfaceC2076Tj0 = interfaceC1335Jx instanceof InterfaceC2076Tj0 ? (InterfaceC2076Tj0) interfaceC1335Jx : null;
                        InterfaceC1335Jx interfaceC1335Jx2 = interfaceC2076Tj0 != null ? (Xc2) interfaceC2076Tj0.T(AE0.K) : null;
                        type = a((InterfaceC2678aE0) memberDescriptor, interfaceC1335Jx2, false, (interfaceC1335Jx2 == null || (lo0G2 = C2432Xo.g(lo0G3, interfaceC1335Jx2.k())) == null) ? lo0G3 : lo0G2, EnumC1976Sc.VALUE_PARAMETER, null, false, C4154hC0.h);
                    } else {
                        type = null;
                    }
                    AE0 ae0 = memberDescriptor instanceof AE0 ? (AE0) memberDescriptor : null;
                    if (ae0 != null) {
                        InterfaceC4675jU interfaceC4675jUE = ae0.e();
                        Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String strH = Nm2.h((FC) interfaceC4675jUE, C3689f01.a(ae0, 3));
                        if (strH == null || (c4929kg1 = (C4929kg1) C4719jg1.d.get(strH)) == null) {
                            c4929kg1 = null;
                        } else {
                            String str3 = c4929kg1.c;
                            if (str3 != null && !d.o(str3, "2.", false)) {
                                throw new IllegalStateException("Check failed.");
                            }
                            if (str3 != null) {
                                c4929kg1 = c4929kg1.d;
                            }
                        }
                    } else {
                        c4929kg1 = null;
                    }
                    if (c4929kg1 != null) {
                        c4929kg1.b.size();
                        ((AE0) memberDescriptor).j().size();
                    }
                    XE0 javaTypeEnhancementState = c.a.v;
                    Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
                    javaTypeEnhancementState.getClass();
                    if (XE0.a.m.invoke(DE0.a) == EnumC2599Zr1.STRICT) {
                        Intrinsics.checkNotNullParameter(memberDescriptor, "memberDescriptor");
                        if ((memberDescriptor instanceof InterfaceC2076Tj0) && Intrinsics.a(memberDescriptor.T(AE0.L), Boolean.TRUE)) {
                            z = true;
                        }
                        List<Xc2> listJ2 = interfaceC1335Jx.j();
                        str = "getValueParameters(...)";
                        Intrinsics.checkNotNullExpressionValue(listJ2, "getValueParameters(...)");
                        arrayList = new ArrayList(XE.m(listJ2, i4));
                        for (Xc2 xc2 : listJ2) {
                            if (c4929kg1 != null || (list = c4929kg1.b) == null) {
                                c7755y63 = null;
                            } else {
                                c7755y63 = (C7755y62) CollectionsKt.H(xc2.l(), list);
                            }
                            Function1 c4364iC0 = new C4364iC0(xc2, 2);
                            ArrayList arrayList6 = arrayList;
                            InterfaceC2678aE0 interfaceC2678aE1 = (InterfaceC2678aE0) memberDescriptor;
                            if (xc2 != null || (lo0G = C2432Xo.g(lo0G3, xc2.k())) == null) {
                                lo0 = lo0G3;
                            } else {
                                lo0 = lo0G;
                            }
                            arrayList6.add(a(interfaceC2678aE1, xc2, false, lo0, EnumC1976Sc.VALUE_PARAMETER, c7755y63, z, c4364iC0));
                            str = str;
                            arrayList = arrayList6;
                        }
                        str2 = str;
                        arrayList2 = arrayList;
                        if (memberDescriptor instanceof InterfaceC0671Bj1) {
                            interfaceC0671Bj1 = (InterfaceC0671Bj1) memberDescriptor;
                        } else {
                            interfaceC0671Bj1 = null;
                        }
                        if (interfaceC0671Bj1 == null && LL.h(interfaceC0671Bj1)) {
                            enumC1976Sc = EnumC1976Sc.FIELD;
                        } else {
                            enumC1976Sc = EnumC1976Sc.METHOD_RETURN_TYPE;
                        }
                        EnumC1976Sc enumC1976Sc2 = enumC1976Sc;
                        if (c4929kg1 != null) {
                            c7755y62 = c4929kg1.a;
                        } else {
                            c7755y62 = null;
                        }
                        interfaceC2678aE0 = (InterfaceC2678aE0) memberDescriptor;
                        abstractC4649jL0A = a(interfaceC2678aE0, interfaceC1335Jx, true, lo0G3, enumC1976Sc2, c7755y62, false, C3846fk0.g);
                        abstractC4649jL0N = memberDescriptor.n();
                        Intrinsics.checkNotNull(abstractC4649jL0N);
                        ol1 = OL1.d;
                        if (C3089c72.c(abstractC4649jL0N, ol1, null)) {
                            z2 = true;
                        } else {
                            interfaceC1076Go1R1 = memberDescriptor.r0();
                            if (interfaceC1076Go1R1 != null || (type4 = interfaceC1076Go1R1.getType()) == null) {
                                zC = false;
                            } else {
                                zC = C3089c72.c(type4, ol1, null);
                            }
                            if (zC) {
                                z2 = true;
                            } else {
                                listJ = memberDescriptor.j();
                                Intrinsics.checkNotNullExpressionValue(listJ, str2);
                                if (listJ == null && listJ.isEmpty()) {
                                    z3 = false;
                                    break;
                                }
                                it = listJ.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    }
                                    type3 = ((Xc2) it.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                    if (C3089c72.c(type3, ol1, null)) {
                                        z3 = true;
                                        break;
                                    }
                                }
                                if (z3) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                        }
                        if (z2) {
                            pair = new Pair(EY.a, new C7840yY(interfaceC2678aE0));
                        } else {
                            pair = null;
                        }
                        if (type == null || abstractC4649jL0A != null) {
                            InterfaceC2678aE0 interfaceC2678aE2 = (InterfaceC2678aE0) memberDescriptor;
                            if (type == null) {
                                interfaceC1076Go1R0 = memberDescriptor.r0();
                                if (interfaceC1076Go1R0 != null) {
                                    type = interfaceC1076Go1R0.getType();
                                } else {
                                    type = null;
                                }
                            }
                            i = 10;
                            arrayList3 = new ArrayList(XE.m(arrayList2, 10));
                            i2 = 0;
                            for (Object obj : arrayList2) {
                                i3 = i2 + 1;
                                if (i2 >= 0) {
                                    WE.l();
                                    throw null;
                                }
                                type2 = (AbstractC4649jL0) obj;
                                if (type2 == null) {
                                    type2 = memberDescriptor.j().get(i2).getType();
                                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                }
                                arrayList3.add(type2);
                                i2 = i3;
                            }
                            if (abstractC4649jL0A == null) {
                                abstractC4649jL0A = memberDescriptor.n();
                                Intrinsics.checkNotNull(abstractC4649jL0A);
                            }
                            memberDescriptor = interfaceC2678aE2.R0(type, arrayList3, abstractC4649jL0A, pair);
                        } else {
                            if (arrayList2.isEmpty()) {
                                z4 = false;
                                break;
                            }
                            Iterator it3 = arrayList2.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    z4 = false;
                                    break;
                                }
                            } while (!(((AbstractC4649jL0) it3.next()) != null));
                            if (z4 || pair != null) {
                                InterfaceC2678aE0 interfaceC2678aE3 = (InterfaceC2678aE0) memberDescriptor;
                                if (type == null) {
                                    interfaceC1076Go1R0 = memberDescriptor.r0();
                                    if (interfaceC1076Go1R0 != null) {
                                        type = interfaceC1076Go1R0.getType();
                                    } else {
                                        type = null;
                                    }
                                }
                                i = 10;
                                arrayList3 = new ArrayList(XE.m(arrayList2, 10));
                                i2 = 0;
                                while (r6.hasNext()) {
                                    i3 = i2 + 1;
                                    if (i2 >= 0) {
                                        WE.l();
                                        throw null;
                                    }
                                    type2 = (AbstractC4649jL0) obj;
                                    if (type2 == null) {
                                        type2 = memberDescriptor.j().get(i2).getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                    }
                                    arrayList3.add(type2);
                                    i2 = i3;
                                }
                                if (abstractC4649jL0A == null) {
                                    abstractC4649jL0A = memberDescriptor.n();
                                    Intrinsics.checkNotNull(abstractC4649jL0A);
                                }
                                memberDescriptor = interfaceC2678aE3.R0(type, arrayList3, abstractC4649jL0A, pair);
                            } else {
                                i = 10;
                            }
                        }
                    } else {
                        lo0G3.a.t.getClass();
                    }
                    z = false;
                    List<Xc2> listJ3 = interfaceC1335Jx.j();
                    str = "getValueParameters(...)";
                    Intrinsics.checkNotNullExpressionValue(listJ3, "getValueParameters(...)");
                    arrayList = new ArrayList(XE.m(listJ3, i4));
                    while (r11.hasNext()) {
                        if (c4929kg1 != null) {
                            c7755y63 = null;
                        } else {
                            c7755y63 = null;
                        }
                        Function1 c4364iC1 = new C4364iC0(xc2, 2);
                        ArrayList arrayList7 = arrayList;
                        InterfaceC2678aE0 interfaceC2678aE4 = (InterfaceC2678aE0) memberDescriptor;
                        if (xc2 != null) {
                            lo0 = lo0G3;
                        } else {
                            lo0 = lo0G3;
                        }
                        arrayList7.add(a(interfaceC2678aE4, xc2, false, lo0, EnumC1976Sc.VALUE_PARAMETER, c7755y63, z, c4364iC1));
                        str = str;
                        arrayList = arrayList7;
                    }
                    str2 = str;
                    arrayList2 = arrayList;
                    if (memberDescriptor instanceof InterfaceC0671Bj1) {
                        interfaceC0671Bj1 = (InterfaceC0671Bj1) memberDescriptor;
                    } else {
                        interfaceC0671Bj1 = null;
                    }
                    if (interfaceC0671Bj1 == null) {
                        enumC1976Sc = EnumC1976Sc.METHOD_RETURN_TYPE;
                    } else {
                        enumC1976Sc = EnumC1976Sc.METHOD_RETURN_TYPE;
                    }
                    EnumC1976Sc enumC1976Sc3 = enumC1976Sc;
                    if (c4929kg1 != null) {
                        c7755y62 = c4929kg1.a;
                    } else {
                        c7755y62 = null;
                    }
                    interfaceC2678aE0 = (InterfaceC2678aE0) memberDescriptor;
                    abstractC4649jL0A = a(interfaceC2678aE0, interfaceC1335Jx, true, lo0G3, enumC1976Sc3, c7755y62, false, C3846fk0.g);
                    abstractC4649jL0N = memberDescriptor.n();
                    Intrinsics.checkNotNull(abstractC4649jL0N);
                    ol1 = OL1.d;
                    if (C3089c72.c(abstractC4649jL0N, ol1, null)) {
                        z2 = true;
                    } else {
                        interfaceC1076Go1R1 = memberDescriptor.r0();
                        if (interfaceC1076Go1R1 != null) {
                            zC = false;
                        } else {
                            zC = false;
                        }
                        if (zC) {
                            listJ = memberDescriptor.j();
                            Intrinsics.checkNotNullExpressionValue(listJ, str2);
                            if (listJ == null) {
                                it = listJ.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    }
                                    type3 = ((Xc2) it.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                    if (C3089c72.c(type3, ol1, null)) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            } else {
                                it = listJ.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    }
                                    type3 = ((Xc2) it.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                    if (C3089c72.c(type3, ol1, null)) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            if (z3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        pair = new Pair(EY.a, new C7840yY(interfaceC2678aE0));
                    } else {
                        pair = null;
                    }
                    if (type == null) {
                        InterfaceC2678aE0 interfaceC2678aE5 = (InterfaceC2678aE0) memberDescriptor;
                        if (type == null) {
                            interfaceC1076Go1R0 = memberDescriptor.r0();
                            if (interfaceC1076Go1R0 != null) {
                                type = interfaceC1076Go1R0.getType();
                            } else {
                                type = null;
                            }
                        }
                        i = 10;
                        arrayList3 = new ArrayList(XE.m(arrayList2, 10));
                        i2 = 0;
                        while (r6.hasNext()) {
                            i3 = i2 + 1;
                            if (i2 >= 0) {
                                WE.l();
                                throw null;
                            }
                            type2 = (AbstractC4649jL0) obj;
                            if (type2 == null) {
                                type2 = memberDescriptor.j().get(i2).getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            }
                            arrayList3.add(type2);
                            i2 = i3;
                        }
                        if (abstractC4649jL0A == null) {
                            abstractC4649jL0A = memberDescriptor.n();
                            Intrinsics.checkNotNull(abstractC4649jL0A);
                        }
                        memberDescriptor = interfaceC2678aE5.R0(type, arrayList3, abstractC4649jL0A, pair);
                    } else {
                        InterfaceC2678aE0 interfaceC2678aE6 = (InterfaceC2678aE0) memberDescriptor;
                        if (type == null) {
                            interfaceC1076Go1R0 = memberDescriptor.r0();
                            if (interfaceC1076Go1R0 != null) {
                                type = interfaceC1076Go1R0.getType();
                            } else {
                                type = null;
                            }
                        }
                        i = 10;
                        arrayList3 = new ArrayList(XE.m(arrayList2, 10));
                        i2 = 0;
                        while (r6.hasNext()) {
                            i3 = i2 + 1;
                            if (i2 >= 0) {
                                WE.l();
                                throw null;
                            }
                            type2 = (AbstractC4649jL0) obj;
                            if (type2 == null) {
                                type2 = memberDescriptor.j().get(i2).getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            }
                            arrayList3.add(type2);
                            i2 = i3;
                        }
                        if (abstractC4649jL0A == null) {
                            abstractC4649jL0A = memberDescriptor.n();
                            Intrinsics.checkNotNull(abstractC4649jL0A);
                        }
                        memberDescriptor = interfaceC2678aE6.R0(type, arrayList3, abstractC4649jL0A, pair);
                    }
                }
            } else {
                i = i4;
            }
            arrayList4.add(memberDescriptor);
            i4 = i;
        }
        return arrayList4;
    }
}

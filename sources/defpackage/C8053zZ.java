package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8053zZ implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C8053zZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v19, types: [o60] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Ka1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? arrayList;
        C1059Gj c1059GjA;
        Class<?> enclosingClass;
        C6384rc0 c6384rc0;
        boolean zP;
        boolean z = false;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                FZ sealedClass = (FZ) obj;
                sealedClass.getClass();
                C01 c01 = C01.g;
                C01 c02 = sealedClass.m;
                if (c02 != c01) {
                    return C5653o60.d;
                }
                List<Integer> list = sealedClass.i.y;
                Intrinsics.checkNotNull(list);
                if (list.isEmpty()) {
                    Intrinsics.checkNotNullParameter(sealedClass, "sealedClass");
                    if (c02 != c01) {
                        return C5653o60.d;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    InterfaceC4675jU interfaceC4675jU = sealedClass.u;
                    if (interfaceC4675jU instanceof InterfaceC2392Xa1) {
                        BD.w(sealedClass, linkedHashSet, ((InterfaceC2392Xa1) interfaceC4675jU).v(), false);
                    }
                    QY0 qy0E0 = sealedClass.E0();
                    Intrinsics.checkNotNullExpressionValue(qy0E0, "getUnsubstitutedInnerClassesScope(...)");
                    BD.w(sealedClass, linkedHashSet, qy0E0, true);
                    return CollectionsKt.Z(linkedHashSet, new AD());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Integer num : list) {
                    C6582sZ c6582sZ = sealedClass.p;
                    C6163qZ c6163qZ = c6582sZ.a;
                    Intrinsics.checkNotNull(num);
                    FC fcB = c6163qZ.b(C6267r21.a(c6582sZ.b, num.intValue()));
                    if (fcB != null) {
                        arrayList2.add(fcB);
                    }
                }
                return arrayList2;
            case 1:
                AbstractC1770Pl0 abstractC1770Pl0 = (AbstractC1770Pl0) obj;
                List<InterfaceC2076Tj0> listH = abstractC1770Pl0.h();
                ArrayList arrayList3 = new ArrayList(3);
                Collection<AbstractC4649jL0> collectionA = abstractC1770Pl0.b.p().a();
                Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
                ArrayList arrayList4 = new ArrayList();
                Iterator it = collectionA.iterator();
                while (it.hasNext()) {
                    C2904bF.o(arrayList4, InterfaceC2602Zs1.a.a(((AbstractC4649jL0) it.next()).v(), null, 3));
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList4) {
                    if (obj2 instanceof InterfaceC1490Lx) {
                        arrayList5.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList5) {
                    C5638o21 name = ((InterfaceC1490Lx) obj3).getName();
                    Object arrayList6 = linkedHashMap.get(name);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap.put(name, arrayList6);
                    }
                    ((List) arrayList6).add(obj3);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
                    C5638o21 c5638o21 = (C5638o21) key;
                    List list2 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((InterfaceC1490Lx) obj4) instanceof InterfaceC2076Tj0);
                        Object arrayList7 = linkedHashMap2.get(boolValueOf);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList7);
                        }
                        ((List) arrayList7).add(obj4);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list3 = (List) entry2.getValue();
                        ?? r7 = C1346Ka1.e;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj5 : listH) {
                                if (Intrinsics.a(((InterfaceC2076Tj0) obj5).getName(), c5638o21)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = C5653o60.d;
                        }
                        r7.h(c5638o21, list3, arrayList, abstractC1770Pl0.b, new C1692Ol0(arrayList3, abstractC1770Pl0));
                    }
                }
                return CollectionsKt.Q(listH, UE.f(arrayList3));
            case 2:
                RD0 rd0 = ((QE0) obj).d;
                if (rd0 instanceof YD0) {
                    Object obj6 = XD0.a;
                    c1059GjA = XD0.a(((YD0) rd0).e());
                } else if (rd0 instanceof InterfaceC6310rE0) {
                    Object obj7 = XD0.a;
                    c1059GjA = XD0.a(VE.c(rd0));
                } else {
                    c1059GjA = null;
                }
                Map mapB = c1059GjA != null ? OW0.b(new Pair(VD0.b, c1059GjA)) : null;
                return mapB == null ? PW0.c() : mapB;
            case 3:
                C3545eJ0 c3545eJ0 = (C3545eJ0) obj;
                if (c3545eJ0.e.isAnonymousClass()) {
                    return null;
                }
                QC qcZ = c3545eJ0.z();
                if (qcZ.c) {
                    return null;
                }
                return qcZ.a().b();
            case 4:
                QC qc = DB1.a;
                OJ0 oj0 = (OJ0) obj;
                EI0 ei0B = DB1.b(oj0.o());
                if (!(ei0B instanceof EI0.c)) {
                    if (ei0B instanceof EI0.a) {
                        return ((EI0.a) ei0B).a;
                    }
                    if ((ei0B instanceof EI0.b) || (ei0B instanceof EI0.d)) {
                        return null;
                    }
                    throw new C6489s51();
                }
                EI0.c cVar = (EI0.c) ei0B;
                C1578Na0 c1578Na0 = GI0.a;
                C3637ek1 c3637ek1 = cVar.b;
                AbstractC7583xI0.a aVarB = GI0.b(c3637ek1, cVar.d, cVar.e, true);
                if (aVarB == null) {
                    return null;
                }
                C2850b00 c2850b00 = cVar.a;
                if (c2850b00 == null) {
                    C5743oZ.a(0);
                    throw null;
                }
                if (c2850b00.h() != InterfaceC1490Lx.a.e) {
                    InterfaceC4675jU interfaceC4675jUE = c2850b00.e();
                    if (interfaceC4675jUE == null) {
                        C5743oZ.a(1);
                        throw null;
                    }
                    if (C4432iZ.l(interfaceC4675jUE)) {
                        InterfaceC4675jU interfaceC4675jUE2 = interfaceC4675jUE.e();
                        if (C4432iZ.n(interfaceC4675jUE2, SC.d) || C4432iZ.n(interfaceC4675jUE2, SC.g)) {
                            C7996zG c7996zG = C7996zG.a;
                            if (!C5207m.j((FC) interfaceC4675jUE)) {
                                z = true;
                            } else if (C4432iZ.l(c2850b00.e())) {
                                c6384rc0 = c2850b00.C;
                                if (c6384rc0 == null && c6384rc0.k().P(C3123cI0.a)) {
                                    zP = true;
                                } else {
                                    zP = c2850b00.k().P(C3123cI0.a);
                                }
                                if (zP) {
                                    z = true;
                                }
                            }
                        } else if (C4432iZ.l(c2850b00.e())) {
                            c6384rc0 = c2850b00.C;
                            if (c6384rc0 == null) {
                                zP = c2850b00.k().P(C3123cI0.a);
                            } else {
                                zP = c2850b00.k().P(C3123cI0.a);
                            }
                            if (zP) {
                                z = true;
                            }
                        }
                    } else if (C4432iZ.l(c2850b00.e())) {
                        c6384rc0 = c2850b00.C;
                        if (c6384rc0 == null) {
                            zP = c2850b00.k().P(C3123cI0.a);
                        } else {
                            zP = c2850b00.k().P(C3123cI0.a);
                        }
                        if (zP) {
                            z = true;
                        }
                    }
                }
                AbstractC5906pJ0 abstractC5906pJ0 = oj0.i;
                if (z || GI0.d(c3637ek1)) {
                    enclosingClass = abstractC5906pJ0.h().getEnclosingClass();
                } else {
                    InterfaceC4675jU interfaceC4675jUE3 = c2850b00.e();
                    enclosingClass = interfaceC4675jUE3 instanceof FC ? C7437wc2.k((FC) interfaceC4675jUE3) : abstractC5906pJ0.h();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(aVarB.a);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            default:
                MU1 mu1 = (MU1) obj;
                return mu1.i(InterfaceC2602Zs1.a.a(mu1.b, null, 3));
        }
    }
}

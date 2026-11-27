package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AZ implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ AZ(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [JZ, Zj0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List<hk1>] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object c6928uA0;
        InterfaceC6126qM1 interfaceC6126qM1;
        ?? arrayList;
        switch (this.d) {
            case 0:
                FZ fz = (FZ) this.e;
                if (!fz.m() && !fz.s()) {
                    return null;
                }
                C6582sZ c6582sZ = fz.p;
                InterfaceC5848p21 nameResolver = c6582sZ.b;
                ?? typeDeserializer = new JZ(1, c6582sZ.h);
                KZ typeOfPublicProperty = new KZ(1, fz);
                C2077Tj1 c2077Tj1 = fz.i;
                Intrinsics.checkNotNullParameter(c2077Tj1, "<this>");
                Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
                C2656a72 typeTable = c6582sZ.d;
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
                Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
                if (c2077Tj1.D.size() > 0) {
                    List<Integer> list = c2077Tj1.D;
                    Intrinsics.checkNotNullExpressionValue(list, "getMultiFieldValueClassUnderlyingNameList(...)");
                    ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
                    for (Integer num : list) {
                        Intrinsics.checkNotNull(num);
                        arrayList2.add(C6267r21.b(nameResolver, num.intValue()));
                    }
                    Pair pair = new Pair(Integer.valueOf(c2077Tj1.G.size()), Integer.valueOf(c2077Tj1.F.size()));
                    if (pair.equals(new Pair(Integer.valueOf(arrayList2.size()), 0))) {
                        List<Integer> list2 = c2077Tj1.G;
                        Intrinsics.checkNotNullExpressionValue(list2, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
                        arrayList = new ArrayList(XE.m(list2, 10));
                        for (Integer num2 : list2) {
                            Intrinsics.checkNotNull(num2);
                            arrayList.add(typeTable.a(num2.intValue()));
                        }
                    } else {
                        if (!pair.equals(new Pair(0, Integer.valueOf(arrayList2.size())))) {
                            throw new IllegalStateException(("class " + C6267r21.b(nameResolver, c2077Tj1.i) + " has illegal multi-field value class representation").toString());
                        }
                        arrayList = c2077Tj1.F;
                    }
                    Intrinsics.checkNotNull(arrayList);
                    ArrayList arrayList3 = new ArrayList(XE.m(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(typeDeserializer.invoke(it.next()));
                    }
                    c6928uA0 = new H11(CollectionsKt.j0(arrayList2, arrayList3));
                } else if ((c2077Tj1.g & 8) == 8) {
                    C5638o21 c5638o21B = C6267r21.b(nameResolver, c2077Tj1.A);
                    Intrinsics.checkNotNullParameter(c2077Tj1, "<this>");
                    Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                    int i = c2077Tj1.g;
                    C4267hk1 c4267hk1A = (i & 16) == 16 ? c2077Tj1.B : (i & 32) == 32 ? typeTable.a(c2077Tj1.C) : null;
                    if ((c4267hk1A == null || (interfaceC6126qM1 = (InterfaceC6126qM1) typeDeserializer.invoke(c4267hk1A)) == null) && (interfaceC6126qM1 = (InterfaceC6126qM1) typeOfPublicProperty.invoke(c5638o21B)) == null) {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + C6267r21.b(nameResolver, c2077Tj1.i) + " with property " + c5638o21B).toString());
                    }
                    c6928uA0 = new C6928uA0(c5638o21B, interfaceC6126qM1);
                } else {
                    c6928uA0 = null;
                }
                if (c6928uA0 != null) {
                    return c6928uA0;
                }
                if (fz.j.a(1, 5, 1)) {
                    return null;
                }
                InterfaceC7984zC interfaceC7984zCX = fz.X();
                if (interfaceC7984zCX == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + fz).toString());
                }
                List<Xc2> listJ = interfaceC7984zCX.j();
                Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                C5638o21 name = ((Xc2) CollectionsKt.F(listJ)).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                AbstractC5706oM1 abstractC5706oM1U0 = fz.U0(name);
                if (abstractC5706oM1U0 != null) {
                    return new C6928uA0(name, abstractC5706oM1U0);
                }
                throw new IllegalStateException(("Value class has no underlying property: " + fz).toString());
            case 1:
                C3545eJ0 c3545eJ0 = (C3545eJ0) this.e;
                Collection<InterfaceC3550eL> collectionL = c3545eJ0.l();
                ArrayList arrayList4 = new ArrayList(XE.m(collectionL, 10));
                Iterator it2 = collectionL.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new C6535sJ0(c3545eJ0, (InterfaceC3550eL) it2.next()));
                }
                return arrayList4;
            case 2:
                OJ0 oj0 = (OJ0) this.e;
                AbstractC5906pJ0 abstractC5906pJ0 = oj0.i;
                abstractC5906pJ0.getClass();
                String name2 = oj0.j;
                Intrinsics.checkNotNullParameter(name2, "name");
                String signature = oj0.k;
                Intrinsics.checkNotNullParameter(signature, "signature");
                C6367rX0 match = AbstractC5906pJ0.d.c(signature);
                if (match != null) {
                    Intrinsics.checkNotNullParameter(match, "match");
                    String str = (String) ((C6367rX0.a) match.a()).get(1);
                    InterfaceC0671Bj1 interfaceC0671Bj1N = abstractC5906pJ0.n(Integer.parseInt(str));
                    if (interfaceC0671Bj1N != null) {
                        return interfaceC0671Bj1N;
                    }
                    StringBuilder sbB = C6495s7.b("Local property #", str, " not found in ");
                    sbB.append(abstractC5906pJ0.h());
                    throw new C3761fL0(sbB.toString());
                }
                C5638o21 c5638o21K = C5638o21.k(name2);
                Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
                Collection<InterfaceC0671Bj1> collectionQ = abstractC5906pJ0.q(c5638o21K);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : collectionQ) {
                    if (Intrinsics.a(DB1.b((InterfaceC0671Bj1) obj).a(), signature)) {
                        arrayList5.add(obj);
                    }
                }
                if (arrayList5.isEmpty()) {
                    StringBuilder sbA = C5896pG.a("Property '", name2, "' (JVM signature: ", signature, ") not resolved in ");
                    sbA.append(abstractC5906pJ0);
                    throw new C3761fL0(sbA.toString());
                }
                if (arrayList5.size() == 1) {
                    return (InterfaceC0671Bj1) CollectionsKt.U(arrayList5);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList5) {
                    AbstractC5533nZ abstractC5533nZD = ((InterfaceC0671Bj1) obj2).d();
                    Object arrayList6 = linkedHashMap.get(abstractC5533nZD);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap.put(abstractC5533nZD, arrayList6);
                    }
                    ((List) arrayList6).add(obj2);
                }
                C5696oJ0 comparator = new C5696oJ0();
                Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                Intrinsics.checkNotNullParameter(comparator, "comparator");
                TreeMap treeMap = new TreeMap(comparator);
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                List list3 = (List) CollectionsKt.K(collectionValues);
                if (list3.size() == 1) {
                    Intrinsics.checkNotNull(list3);
                    return (InterfaceC0671Bj1) CollectionsKt.F(list3);
                }
                C5638o21 c5638o21K2 = C5638o21.k(name2);
                Intrinsics.checkNotNullExpressionValue(c5638o21K2, "identifier(...)");
                String strJ = CollectionsKt.J(abstractC5906pJ0.q(c5638o21K2), "\n", null, null, WY.g, 30);
                StringBuilder sbA2 = C5896pG.a("Property '", name2, "' (JVM signature: ", signature, ") not resolved in ");
                sbA2.append(abstractC5906pJ0);
                sbA2.append(':');
                sbA2.append(strJ.length() == 0 ? " no members found" : "\n".concat(strJ));
                throw new C3761fL0(sbA2.toString());
            default:
                Function0<? extends List<? extends P92>> function0 = ((C5436n41) this.e).b;
                if (function0 != null) {
                    return function0.invoke();
                }
                return null;
        }
    }
}

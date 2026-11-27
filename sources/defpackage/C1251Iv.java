package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1251Iv {

    @NotNull
    public static final Object a;

    @NotNull
    public static final LinkedHashMap b;

    @NotNull
    public static final Set<C1758Ph0> c;

    @NotNull
    public static final Set<C5638o21> d;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    static {
        C1836Qh0 c1836Qh0 = C4194hP1.a.j;
        C1758Ph0 c1758Ph0G = c1836Qh0.b(C5638o21.k(AppMeasurementSdk.ConditionalUserProperty.NAME)).g();
        Intrinsics.checkNotNullExpressionValue(c1758Ph0G, "toSafe(...)");
        Pair pair = new Pair(c1758Ph0G, C4194hP1.d);
        C1758Ph0 c1758Ph0G2 = c1836Qh0.b(C5638o21.k("ordinal")).g();
        Intrinsics.checkNotNullExpressionValue(c1758Ph0G2, "toSafe(...)");
        Pair pair2 = new Pair(c1758Ph0G2, C5638o21.k("ordinal"));
        Pair pair3 = new Pair(U0.a(C4194hP1.a.C, "size"), C5638o21.k("size"));
        C1758Ph0 c1758Ph0 = C4194hP1.a.G;
        Pair pair4 = new Pair(U0.a(c1758Ph0, "size"), C5638o21.k("size"));
        C1758Ph0 c1758Ph0G3 = C4194hP1.a.e.b(C5638o21.k("length")).g();
        Intrinsics.checkNotNullExpressionValue(c1758Ph0G3, "toSafe(...)");
        Map mapE = PW0.e(pair, pair2, pair3, pair4, new Pair(c1758Ph0G3, C5638o21.k("length")), new Pair(U0.a(c1758Ph0, "keys"), C5638o21.k("keySet")), new Pair(U0.a(c1758Ph0, "values"), C5638o21.k("values")), new Pair(U0.a(c1758Ph0, "entries"), C5638o21.k("entrySet")));
        a = mapE;
        Set<Map.Entry> setEntrySet = mapE.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(XE.m(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((C1758Ph0) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair5 : arrayList) {
            C5638o21 c5638o21 = (C5638o21) pair5.e;
            Object arrayList2 = linkedHashMap.get(c5638o21);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c5638o21, arrayList2);
            }
            ((List) arrayList2).add((C5638o21) pair5.d);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(OW0.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            Intrinsics.checkNotNullParameter(iterable, "<this>");
            linkedHashMap2.put(key, CollectionsKt.e0(CollectionsKt.g0(iterable)));
        }
        b = linkedHashMap2;
        ?? r0 = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            String str = RE0.a;
            C1836Qh0 c1836Qh0I = ((C1758Ph0) entry3.getKey()).e().i();
            Intrinsics.checkNotNullExpressionValue(c1836Qh0I, "toUnsafe(...)");
            QC qcF = RE0.f(c1836Qh0I);
            Intrinsics.checkNotNull(qcF);
            linkedHashSet.add(qcF.a().c((C5638o21) entry3.getValue()));
        }
        Set<C1758Ph0> setKeySet = a.keySet();
        c = setKeySet;
        ArrayList arrayList3 = new ArrayList(XE.m(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C1758Ph0) it.next()).f());
        }
        d = CollectionsKt.h0(arrayList3);
    }
}

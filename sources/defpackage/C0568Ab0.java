package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ab0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0568Ab0 {

    @NotNull
    public static final LinkedHashMap a;

    @NotNull
    public static final Map<C1758Ph0, C1758Ph0> b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(C3355dP1.t, a("java.util.ArrayList", "java.util.LinkedList"));
        b(C3355dP1.u, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(C3355dP1.v, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C1758Ph0 topLevelFqName = new C1758Ph0("java.util.function.Function");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        C1758Ph0 c1758Ph0E = topLevelFqName.e();
        b(new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")), a("java.util.function.UnaryOperator"));
        C1758Ph0 topLevelFqName2 = new C1758Ph0("java.util.function.BiFunction");
        Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
        C1758Ph0 c1758Ph0E2 = topLevelFqName2.e();
        b(new QC(c1758Ph0E2, SI0.a(c1758Ph0E2, "parent(...)", topLevelFqName2, "shortName(...)")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((QC) entry.getKey()).a(), ((QC) entry.getValue()).a()));
        }
        b = PW0.j(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C1758Ph0 topLevelFqName = new C1758Ph0(str);
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            C1758Ph0 c1758Ph0E = topLevelFqName.e();
            arrayList.add(new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")));
        }
        return arrayList;
    }

    public static void b(QC qc, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, qc);
        }
    }
}

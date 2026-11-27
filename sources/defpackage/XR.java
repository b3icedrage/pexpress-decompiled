package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class XR {

    public static class a {
        public final UG<?> a;
        public final HashSet b = new HashSet();
        public final HashSet c = new HashSet();

        public a(UG<?> ug) {
            this.a = ug;
        }
    }

    public static class b {
        public final C7892yl1<?> a;
        public final boolean b;

        public b() {
            throw null;
        }

        public b(C7892yl1 c7892yl1, boolean z) {
            this.a = c7892yl1;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.a.equals(this.a) && bVar.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (a aVar : (Set) it2.next()) {
                        for (C6996uX c6996uX : aVar.a.c) {
                            if (c6996uX.c == 0) {
                                Set<a> set = (Set) map.get(new b(c6996uX.a, c6996uX.b == 2));
                                if (set != null) {
                                    for (a aVar2 : set) {
                                        aVar.b.add(aVar2);
                                        aVar2.c.add(aVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<a> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (a aVar3 : hashSet) {
                    if (aVar3.c.isEmpty()) {
                        hashSet2.add(aVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar4 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar4);
                    i++;
                    for (a aVar5 : aVar4.b) {
                        aVar5.c.remove(aVar4);
                        if (aVar5.c.isEmpty()) {
                            hashSet2.add(aVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (a aVar6 : hashSet) {
                    if (!aVar6.c.isEmpty() && !aVar6.b.isEmpty()) {
                        arrayList2.add(aVar6.a);
                    }
                }
                throw new C7417wX("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            UG ug = (UG) it.next();
            a aVar7 = new a(ug);
            Iterator it4 = ug.b.iterator();
            while (it4.hasNext()) {
                C7892yl1 c7892yl1 = (C7892yl1) it4.next();
                boolean z = ug.e == 0;
                b bVar = new b(c7892yl1, !z);
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new HashSet());
                }
                Set set2 = (Set) map.get(bVar);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + c7892yl1 + ".");
                }
                set2.add(aVar7);
            }
        }
    }
}

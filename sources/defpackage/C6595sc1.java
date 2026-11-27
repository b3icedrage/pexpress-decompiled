package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: sc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6595sc1 {
    public final ArrayList a;
    public final ArrayList b;
    public final C4913kc1 c;
    public final ArrayList d;

    /* JADX INFO: renamed from: sc1$a */
    public static class a {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public final LinkedHashSet d = N20.p;
    }

    public C6595sc1(a aVar) {
        ArrayList arrayList = aVar.a;
        LinkedHashSet linkedHashSet = aVar.d;
        LinkedHashSet linkedHashSet2 = N20.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(N20.q.get((Class) it.next()));
        }
        this.a = arrayList2;
        this.c = new C4913kc1();
        this.d = aVar.c;
        ArrayList arrayList3 = aVar.b;
        this.b = arrayList3;
        new C7348wA0(new C5473nF(arrayList3, Collections.EMPTY_MAP));
    }
}

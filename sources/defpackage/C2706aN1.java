package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: aN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2706aN1 extends C2930bN1<C0571Ac0.a<Object>, Object> {
    @Override // defpackage.C2930bN1
    public final void g() {
        if (!this.g) {
            for (int i = 0; i < this.d.size(); i++) {
                d(i).getKey().getClass();
            }
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0571Ac0.a) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        super.g();
    }

    @Override // defpackage.C2930bN1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}

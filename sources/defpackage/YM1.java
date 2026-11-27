package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class YM1 extends C3139cN1<Object, Object> {
    @Override // defpackage.C3139cN1
    public final void g() {
        if (!this.h) {
            for (int i = 0; i < this.e.size(); i++) {
                ((C0649Bc0.a) d(i).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = e().iterator();
            while (it.hasNext()) {
                ((C0649Bc0.a) it.next().getKey()).getClass();
            }
        }
        super.g();
    }

    @Override // defpackage.C3139cN1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((C0649Bc0.a) obj, obj2);
    }
}

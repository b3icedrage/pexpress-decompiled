package defpackage;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: renamed from: Ob0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1662Ob0<K, V> extends C3945gC1<K, V> {
    public final HashMap<K, C3945gC1.c<K, V>> i = new HashMap<>();

    @Override // defpackage.C3945gC1
    public final C3945gC1.c<K, V> a(K k) {
        return this.i.get(k);
    }

    @Override // defpackage.C3945gC1
    public final V b(@NonNull K k, @NonNull V v) {
        C3945gC1.c<K, V> cVarA = a(k);
        if (cVarA != null) {
            return cVarA.e;
        }
        HashMap<K, C3945gC1.c<K, V>> map = this.i;
        C3945gC1.c<K, V> cVar = new C3945gC1.c<>(k, v);
        this.h++;
        C3945gC1.c<K, V> cVar2 = this.e;
        if (cVar2 == null) {
            this.d = cVar;
            this.e = cVar;
        } else {
            cVar2.g = cVar;
            cVar.h = cVar2;
            this.e = cVar;
        }
        map.put(k, cVar);
        return null;
    }

    @Override // defpackage.C3945gC1
    public final V c(@NonNull K k) {
        V v = (V) super.c(k);
        this.i.remove(k);
        return v;
    }
}

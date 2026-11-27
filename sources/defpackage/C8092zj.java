package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8092zj<K, V> extends C2703aM1<K, V> implements Map<K, V> {
    public C7672xj l;

    public C8092zj() {
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.l == null) {
            this.l = new C7672xj(this);
        }
        C7672xj c7672xj = this.l;
        if (c7672xj.a == null) {
            c7672xj.a = new AbstractC6155qW0.b();
        }
        return c7672xj.a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.l == null) {
            this.l = new C7672xj(this);
        }
        C7672xj c7672xj = this.l;
        if (c7672xj.b == null) {
            c7672xj.b = new AbstractC6155qW0.c();
        }
        return c7672xj.b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        c(map.size() + this.g);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.l == null) {
            this.l = new C7672xj(this);
        }
        C7672xj c7672xj = this.l;
        if (c7672xj.c == null) {
            c7672xj.c = new AbstractC6155qW0.e();
        }
        return c7672xj.c;
    }

    public C8092zj(C8092zj c8092zj) {
        if (c8092zj != null) {
            j(c8092zj);
        }
    }
}

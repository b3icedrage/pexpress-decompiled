package defpackage;

/* JADX INFO: renamed from: sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6667sx<K, V> extends C8092zj<K, V> {
    public int m;

    @Override // defpackage.C2703aM1, java.util.Map
    public final void clear() {
        this.m = 0;
        super.clear();
    }

    @Override // defpackage.C2703aM1, java.util.Map
    public final int hashCode() {
        if (this.m == 0) {
            this.m = super.hashCode();
        }
        return this.m;
    }

    @Override // defpackage.C2703aM1
    public final void j(C8092zj c8092zj) {
        this.m = 0;
        super.j(c8092zj);
    }

    @Override // defpackage.C2703aM1
    public final V k(int i) {
        this.m = 0;
        return (V) super.k(i);
    }

    @Override // defpackage.C2703aM1
    public final V l(int i, V v) {
        this.m = 0;
        return (V) super.l(i, v);
    }

    @Override // defpackage.C2703aM1, java.util.Map
    public final V put(K k, V v) {
        this.m = 0;
        return (V) super.put(k, v);
    }
}

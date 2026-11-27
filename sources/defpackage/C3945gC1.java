package defpackage;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: gC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3945gC1<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> d;
    public c<K, V> e;
    public final WeakHashMap<f<K, V>, Boolean> g = new WeakHashMap<>();
    public int h = 0;

    /* JADX INFO: renamed from: gC1$a */
    public static class a<K, V> extends e<K, V> {
        @Override // defpackage.C3945gC1.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.h;
        }

        @Override // defpackage.C3945gC1.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.g;
        }
    }

    /* JADX INFO: renamed from: gC1$b */
    public static class b<K, V> extends e<K, V> {
        @Override // defpackage.C3945gC1.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.g;
        }

        @Override // defpackage.C3945gC1.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.h;
        }
    }

    /* JADX INFO: renamed from: gC1$c */
    public static class c<K, V> implements Map.Entry<K, V> {

        @NonNull
        public final K d;

        @NonNull
        public final V e;
        public c<K, V> g;
        public c<K, V> h;

        public c(@NonNull K k, @NonNull V v) {
            this.d = k;
            this.e = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.d.equals(cVar.d) && this.e.equals(cVar.e);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final K getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final V getValue() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.d.hashCode() ^ this.e.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.d + "=" + this.e;
        }
    }

    /* JADX INFO: renamed from: gC1$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> d;
        public boolean e = true;

        public d() {
        }

        @Override // defpackage.C3945gC1.f
        public final void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.d;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.h;
                this.d = cVar3;
                this.e = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.e) {
                return C3945gC1.this.d != null;
            }
            c<K, V> cVar = this.d;
            return (cVar == null || cVar.g == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.e) {
                this.e = false;
                this.d = C3945gC1.this.d;
            } else {
                c<K, V> cVar = this.d;
                this.d = cVar != null ? cVar.g : null;
            }
            return this.d;
        }
    }

    /* JADX INFO: renamed from: gC1$e */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> d;
        public c<K, V> e;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.d = cVar2;
            this.e = cVar;
        }

        @Override // defpackage.C3945gC1.f
        public final void a(@NonNull c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.d == cVar && cVar == this.e) {
                this.e = null;
                this.d = null;
            }
            c<K, V> cVar2 = this.d;
            if (cVar2 == cVar) {
                this.d = b(cVar2);
            }
            c<K, V> cVar3 = this.e;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.d;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.e = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.e;
            c<K, V> cVar2 = this.d;
            this.e = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* JADX INFO: renamed from: gC1$f */
    public static abstract class f<K, V> {
        public abstract void a(@NonNull c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.d;
        while (cVar != null && !cVar.d.equals(k)) {
            cVar = cVar.g;
        }
        return cVar;
    }

    public V b(@NonNull K k, @NonNull V v) {
        c<K, V> cVarA = a(k);
        if (cVarA != null) {
            return cVarA.e;
        }
        c<K, V> cVar = new c<>(k, v);
        this.h++;
        c<K, V> cVar2 = this.e;
        if (cVar2 == null) {
            this.d = cVar;
            this.e = cVar;
            return null;
        }
        cVar2.g = cVar;
        cVar.h = cVar2;
        this.e = cVar;
        return null;
    }

    public V c(@NonNull K k) {
        c<K, V> cVarA = a(k);
        if (cVarA == null) {
            return null;
        }
        this.h--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.g;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarA);
            }
        }
        c<K, V> cVar = cVarA.h;
        if (cVar != null) {
            cVar.g = cVarA.g;
        } else {
            this.d = cVarA.g;
        }
        c<K, V> cVar2 = cVarA.g;
        if (cVar2 != null) {
            cVar2.h = cVar;
        } else {
            this.e = cVar;
        }
        cVarA.g = null;
        cVarA.h = null;
        return cVarA.e;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3945gC1)) {
            return false;
        }
        C3945gC1 c3945gC1 = (C3945gC1) obj;
        if (this.h != c3945gC1.h) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c3945gC1.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    @NonNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.d, this.e);
        this.g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

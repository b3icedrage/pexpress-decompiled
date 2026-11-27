package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: dN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3349dN1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int j = 0;
    public final int d;
    public List<C3349dN1<K, V>.b> e = Collections.EMPTY_LIST;
    public Map<K, V> g = Collections.EMPTY_MAP;
    public boolean h;
    public volatile C3349dN1<K, V>.d i;

    /* JADX INFO: renamed from: dN1$a */
    public static class a {
        public static final C0339a a = new C0339a();
        public static final b b = new b();

        /* JADX INFO: renamed from: dN1$a$a, reason: collision with other inner class name */
        public static class C0339a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: dN1$a$b */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.a;
            }
        }
    }

    /* JADX INFO: renamed from: dN1$b */
    public class b implements Comparable<C3349dN1<K, V>.b>, Map.Entry<K, V> {
        public final K d;
        public V e;

        public b() {
            throw null;
        }

        public b(K k, V v) {
            this.d = k;
            this.e = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.d.compareTo(((b) obj).d);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k = this.d;
                    if (k == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = k.equals(key);
                    }
                    if (zEquals) {
                        V v = this.e;
                        Object value = entry.getValue();
                        if (v == null) {
                            zEquals2 = value == null;
                        } else {
                            zEquals2 = v.equals(value);
                        }
                        if (zEquals2) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.d;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.e;
            return (v != null ? v.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = C3349dN1.j;
            C3349dN1.this.c();
            V v2 = this.e;
            this.e = v;
            return v2;
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.d);
            String strValueOf2 = String.valueOf(this.e);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: dN1$c */
    public class c implements Iterator<Map.Entry<K, V>> {
        public int d = -1;
        public boolean e;
        public Iterator<Map.Entry<K, V>> g;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.g == null) {
                this.g = C3349dN1.this.g.entrySet().iterator();
            }
            return this.g;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d + 1 < C3349dN1.this.e.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.e = true;
            int i = this.d + 1;
            this.d = i;
            C3349dN1 c3349dN1 = C3349dN1.this;
            return i < c3349dN1.e.size() ? c3349dN1.e.get(this.d) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.e) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.e = false;
            int i = C3349dN1.j;
            C3349dN1 c3349dN1 = C3349dN1.this;
            c3349dN1.c();
            if (this.d >= c3349dN1.e.size()) {
                a().remove();
                return;
            }
            int i2 = this.d;
            this.d = i2 - 1;
            c3349dN1.g(i2);
        }
    }

    /* JADX INFO: renamed from: dN1$d */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C3349dN1.this.f((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C3349dN1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C3349dN1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C3349dN1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C3349dN1.this.size();
        }
    }

    public C3349dN1(int i) {
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int b(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.e.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.e.get(i3).d);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k.compareTo(this.e.get(i4).d);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.e.get(i3).d);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void c() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.e.isEmpty()) {
            this.e.clear();
        }
        if (this.g.isEmpty()) {
            return;
        }
        this.g.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.g.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.g.isEmpty() ? a.b : this.g.entrySet();
    }

    public final SortedMap<K, V> e() {
        c();
        if (this.g.isEmpty() && !(this.g instanceof TreeMap)) {
            this.g = new TreeMap();
        }
        return (SortedMap) this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.i == null) {
            this.i = new d();
        }
        return this.i;
    }

    public final V f(K k, V v) {
        c();
        int iB = b(k);
        if (iB >= 0) {
            return this.e.get(iB).setValue(v);
        }
        c();
        boolean zIsEmpty = this.e.isEmpty();
        int i = this.d;
        if (zIsEmpty && !(this.e instanceof ArrayList)) {
            this.e = new ArrayList(i);
        }
        int i2 = -(iB + 1);
        if (i2 >= i) {
            return e().put(k, v);
        }
        if (this.e.size() == i) {
            C3349dN1<K, V>.b bVarRemove = this.e.remove(i - 1);
            e().put(bVarRemove.d, bVarRemove.e);
        }
        this.e.add(i2, new b(k, v));
        return null;
    }

    public final V g(int i) {
        c();
        V v = this.e.remove(i).e;
        if (!this.g.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            List<C3349dN1<K, V>.b> list = this.e;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? this.e.get(iB).e : this.g.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        if (iB >= 0) {
            return g(iB);
        }
        if (this.g.isEmpty()) {
            return null;
        }
        return this.g.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.g.size() + this.e.size();
    }
}

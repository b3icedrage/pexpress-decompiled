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

/* JADX INFO: renamed from: cN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3139cN1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int k = 0;
    public final int d;
    public List<C3139cN1<K, V>.b> e = Collections.EMPTY_LIST;
    public Map<K, V> g;
    public boolean h;
    public volatile C3139cN1<K, V>.d i;
    public Map<K, V> j;

    /* JADX INFO: renamed from: cN1$a */
    public static class a {
        public static final C0262a a = new C0262a();
        public static final b b = new b();

        /* JADX INFO: renamed from: cN1$a$a, reason: collision with other inner class name */
        public static class C0262a implements Iterator<Object> {
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

        /* JADX INFO: renamed from: cN1$a$b */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.a;
            }
        }
    }

    /* JADX INFO: renamed from: cN1$b */
    public class b implements Map.Entry<K, V>, Comparable<C3139cN1<K, V>.b> {
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
            int i = C3139cN1.k;
            C3139cN1.this.c();
            V v2 = this.e;
            this.e = v;
            return v2;
        }

        public final String toString() {
            return this.d + "=" + this.e;
        }
    }

    /* JADX INFO: renamed from: cN1$c */
    public class c implements Iterator<Map.Entry<K, V>> {
        public int d = -1;
        public boolean e;
        public Iterator<Map.Entry<K, V>> g;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.g == null) {
                this.g = C3139cN1.this.g.entrySet().iterator();
            }
            return this.g;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.d + 1;
            C3139cN1 c3139cN1 = C3139cN1.this;
            return i < c3139cN1.e.size() || (!c3139cN1.g.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.e = true;
            int i = this.d + 1;
            this.d = i;
            C3139cN1 c3139cN1 = C3139cN1.this;
            return i < c3139cN1.e.size() ? c3139cN1.e.get(this.d) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.e) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.e = false;
            int i = C3139cN1.k;
            C3139cN1 c3139cN1 = C3139cN1.this;
            c3139cN1.c();
            if (this.d >= c3139cN1.e.size()) {
                a().remove();
                return;
            }
            int i2 = this.d;
            this.d = i2 - 1;
            c3139cN1.i(i2);
        }
    }

    /* JADX INFO: renamed from: cN1$d */
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
            C3139cN1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C3139cN1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C3139cN1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C3139cN1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C3139cN1.this.size();
        }
    }

    public C3139cN1(int i) {
        this.d = i;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.g = map;
        this.j = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int b(K k2) {
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
                iCompareTo = k2.compareTo(this.e.get(i3).d);
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
            int iCompareTo2 = k2.compareTo(this.e.get(i4).d);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k2.compareTo(this.e.get(i3).d);
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

    public final Map.Entry<K, V> d(int i) {
        return this.e.get(i);
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.g.isEmpty() ? a.b : this.g.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.i == null) {
            this.i = new d();
        }
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3139cN1)) {
            return super.equals(obj);
        }
        C3139cN1 c3139cN1 = (C3139cN1) obj;
        int size = size();
        if (size == c3139cN1.size()) {
            int size2 = this.e.size();
            if (size2 != c3139cN1.e.size()) {
                return ((AbstractSet) entrySet()).equals(c3139cN1.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (d(i).equals(c3139cN1.d(i))) {
                }
            }
            if (size2 != size) {
                return this.g.equals(c3139cN1.g);
            }
            return true;
        }
        return false;
    }

    public final SortedMap<K, V> f() {
        c();
        if (this.g.isEmpty() && !(this.g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.g = treeMap;
            this.j = treeMap.descendingMap();
        }
        return (SortedMap) this.g;
    }

    public void g() {
        if (this.h) {
            return;
        }
        this.g = this.g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.g);
        this.j = this.j.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.j);
        this.h = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? this.e.get(iB).e : this.g.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        c();
        int iB = b(k2);
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
            return f().put(k2, v);
        }
        if (this.e.size() == i) {
            C3139cN1<K, V>.b bVarRemove = this.e.remove(i - 1);
            f().put(bVarRemove.d, bVarRemove.e);
        }
        this.e.add(i2, new b(k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.e.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.e.get(i).hashCode();
        }
        return this.g.size() > 0 ? this.g.hashCode() + iHashCode : iHashCode;
    }

    public final V i(int i) {
        c();
        V v = this.e.remove(i).e;
        if (!this.g.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            List<C3139cN1<K, V>.b> list = this.e;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        if (iB >= 0) {
            return i(iB);
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

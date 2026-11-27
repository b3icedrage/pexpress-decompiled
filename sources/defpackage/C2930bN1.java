package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: bN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2930bN1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int j = 0;
    public List<C2930bN1<K, V>.a> d = Collections.EMPTY_LIST;
    public Map<K, V> e;
    public boolean g;
    public volatile C2930bN1<K, V>.c h;
    public Map<K, V> i;

    /* JADX INFO: renamed from: bN1$a */
    public class a implements Map.Entry<K, V>, Comparable<C2930bN1<K, V>.a> {
        public final K d;
        public V e;

        public a() {
            throw null;
        }

        public a(K k, V v) {
            this.d = k;
            this.e = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.d.compareTo(((a) obj).d);
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
            int i = C2930bN1.j;
            C2930bN1.this.c();
            V v2 = this.e;
            this.e = v;
            return v2;
        }

        public final String toString() {
            return this.d + "=" + this.e;
        }
    }

    /* JADX INFO: renamed from: bN1$b */
    public class b implements Iterator<Map.Entry<K, V>> {
        public int d = -1;
        public boolean e;
        public Iterator<Map.Entry<K, V>> g;

        public b() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.g == null) {
                this.g = C2930bN1.this.e.entrySet().iterator();
            }
            return this.g;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.d + 1;
            C2930bN1 c2930bN1 = C2930bN1.this;
            return i < c2930bN1.d.size() || (!c2930bN1.e.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.e = true;
            int i = this.d + 1;
            this.d = i;
            C2930bN1 c2930bN1 = C2930bN1.this;
            return i < c2930bN1.d.size() ? c2930bN1.d.get(this.d) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.e) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.e = false;
            int i = C2930bN1.j;
            C2930bN1 c2930bN1 = C2930bN1.this;
            c2930bN1.c();
            if (this.d >= c2930bN1.d.size()) {
                a().remove();
                return;
            }
            int i2 = this.d;
            this.d = i2 - 1;
            c2930bN1.i(i2);
        }
    }

    /* JADX INFO: renamed from: bN1$c */
    public class c extends AbstractSet<Map.Entry<K, V>> {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C2930bN1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C2930bN1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C2930bN1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C2930bN1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C2930bN1.this.size();
        }
    }

    public C2930bN1() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.e = map;
        this.i = map;
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
        int size = this.d.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.d.get(i3).d);
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
            int iCompareTo2 = k.compareTo(this.d.get(i4).d);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.d.get(i3).d);
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
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
        if (this.e.isEmpty()) {
            return;
        }
        this.e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.e.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i) {
        return this.d.get(i);
    }

    public final Set e() {
        return this.e.isEmpty() ? Collections.EMPTY_SET : this.e.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.h == null) {
            this.h = new c();
        }
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2930bN1)) {
            return super.equals(obj);
        }
        C2930bN1 c2930bN1 = (C2930bN1) obj;
        int size = size();
        if (size == c2930bN1.size()) {
            int size2 = this.d.size();
            if (size2 != c2930bN1.d.size()) {
                return ((AbstractSet) entrySet()).equals(c2930bN1.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (d(i).equals(c2930bN1.d(i))) {
                }
            }
            if (size2 != size) {
                return this.e.equals(c2930bN1.e);
            }
            return true;
        }
        return false;
    }

    public final SortedMap<K, V> f() {
        c();
        if (this.e.isEmpty() && !(this.e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.e = treeMap;
            this.i = treeMap.descendingMap();
        }
        return (SortedMap) this.e;
    }

    public void g() {
        if (this.g) {
            return;
        }
        this.e = this.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.e);
        this.i = this.i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.i);
        this.g = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? this.d.get(iB).e : this.e.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        c();
        int iB = b(k);
        if (iB >= 0) {
            return this.d.get(iB).setValue(v);
        }
        c();
        if (this.d.isEmpty() && !(this.d instanceof ArrayList)) {
            this.d = new ArrayList(16);
        }
        int i = -(iB + 1);
        if (i >= 16) {
            return f().put(k, v);
        }
        if (this.d.size() == 16) {
            C2930bN1<K, V>.a aVarRemove = this.d.remove(15);
            f().put(aVarRemove.d, aVarRemove.e);
        }
        this.d.add(i, new a(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.d.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.d.get(i).hashCode();
        }
        return this.e.size() > 0 ? this.e.hashCode() + iHashCode : iHashCode;
    }

    public final V i(int i) {
        c();
        V v = this.d.remove(i).e;
        if (!this.e.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            List<C2930bN1<K, V>.a> list = this.d;
            Map.Entry<K, V> next = it.next();
            list.add(new a(next.getKey(), next.getValue()));
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
        if (this.e.isEmpty()) {
            return null;
        }
        return this.e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e.size() + this.d.size();
    }
}

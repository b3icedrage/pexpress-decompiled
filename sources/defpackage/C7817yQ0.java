package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: yQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7817yQ0<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a m = new a();
    public final Comparator<? super K> d;
    public final boolean e;
    public e<K, V> g;
    public int h;
    public int i;
    public final e<K, V> j;
    public C7817yQ0<K, V>.b k;
    public C7817yQ0<K, V>.c l;

    /* JADX INFO: renamed from: yQ0$a */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: yQ0$b */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: yQ0$b$a */
        public class a extends C7817yQ0<K, V>.d<Map.Entry<K, V>> {
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C7817yQ0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            e eVarB;
            if (obj instanceof Map.Entry) {
                C7817yQ0 c7817yQ0 = C7817yQ0.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e eVar = null;
                if (key != null) {
                    try {
                        eVarB = c7817yQ0.b(false, key);
                    } catch (ClassCastException unused) {
                        eVarB = null;
                    }
                } else {
                    eVarB = null;
                }
                if (eVarB != null && Objects.equals(eVarB.l, entry.getValue())) {
                    eVar = eVarB;
                }
                if (eVar != null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e eVarB;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                C7817yQ0 c7817yQ0 = C7817yQ0.this;
                Object key = entry.getKey();
                e eVar = null;
                if (key != null) {
                    try {
                        eVarB = c7817yQ0.b(false, key);
                    } catch (ClassCastException unused) {
                        eVarB = null;
                    }
                } else {
                    eVarB = null;
                }
                if (eVarB != null && Objects.equals(eVarB.l, entry.getValue())) {
                    eVar = eVarB;
                }
                if (eVar != null) {
                    c7817yQ0.d(eVar, true);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C7817yQ0.this.h;
        }
    }

    /* JADX INFO: renamed from: yQ0$c */
    public final class c extends AbstractSet<K> {

        /* JADX INFO: renamed from: yQ0$c$a */
        public class a extends C7817yQ0<K, V>.d<K> {
            @Override // defpackage.C7817yQ0.d, java.util.Iterator
            public final K next() {
                return a().j;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C7817yQ0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return C7817yQ0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C7817yQ0 c7817yQ0 = C7817yQ0.this;
            e eVarB = null;
            if (obj != null) {
                try {
                    eVarB = c7817yQ0.b(false, obj);
                } catch (ClassCastException unused) {
                }
            }
            if (eVarB != null) {
                c7817yQ0.d(eVarB, true);
            }
            return eVarB != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C7817yQ0.this.h;
        }
    }

    /* JADX INFO: renamed from: yQ0$d */
    public abstract class d<T> implements Iterator<T> {
        public e<K, V> d;
        public e<K, V> e = null;
        public int g;

        public d() {
            this.d = C7817yQ0.this.j.h;
            this.g = C7817yQ0.this.i;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.d;
            C7817yQ0 c7817yQ0 = C7817yQ0.this;
            if (eVar == c7817yQ0.j) {
                throw new NoSuchElementException();
            }
            if (c7817yQ0.i != this.g) {
                throw new ConcurrentModificationException();
            }
            this.d = eVar.h;
            this.e = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != C7817yQ0.this.j;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.e;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            C7817yQ0 c7817yQ0 = C7817yQ0.this;
            c7817yQ0.d(eVar, true);
            this.e = null;
            this.g = c7817yQ0.i;
        }
    }

    public C7817yQ0() {
        this(true);
    }

    public final e b(boolean z, Object obj) {
        int iCompareTo;
        e<K, V> eVar;
        e<K, V> eVar2 = this.g;
        a aVar = m;
        Comparator<? super K> comparator = this.d;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) obj : null;
            while (true) {
                K k = eVar2.j;
                iCompareTo = comparable != null ? comparable.compareTo(k) : comparator.compare(obj, k);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.e : eVar2.g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z) {
            return null;
        }
        e<K, V> eVar5 = this.j;
        if (eVar4 != null) {
            eVar = new e<>(this.e, eVar4, obj, eVar5, eVar5.i);
            if (iCompareTo < 0) {
                eVar4.e = eVar;
            } else {
                eVar4.g = eVar;
            }
            c(eVar4, true);
        } else {
            if (comparator == aVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(this.e, eVar4, obj, eVar5, eVar5.i);
            this.g = eVar;
        }
        this.h++;
        this.i++;
        return eVar;
    }

    public final void c(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.e;
            e<K, V> eVar3 = eVar.g;
            int i = eVar2 != null ? eVar2.m : 0;
            int i2 = eVar3 != null ? eVar3.m : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e<K, V> eVar4 = eVar3.e;
                e<K, V> eVar5 = eVar3.g;
                int i4 = (eVar4 != null ? eVar4.m : 0) - (eVar5 != null ? eVar5.m : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    f(eVar);
                } else {
                    g(eVar3);
                    f(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e<K, V> eVar6 = eVar2.e;
                e<K, V> eVar7 = eVar2.g;
                int i5 = (eVar6 != null ? eVar6.m : 0) - (eVar7 != null ? eVar7.m : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    g(eVar);
                } else {
                    f(eVar2);
                    g(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.m = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.m = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.d;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.g = null;
        this.h = 0;
        this.i++;
        e<K, V> eVar = this.j;
        eVar.i = eVar;
        eVar.h = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e eVarB = null;
        if (obj != null) {
            try {
                eVarB = b(false, obj);
            } catch (ClassCastException unused) {
            }
        }
        return eVarB != null;
    }

    public final void d(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i;
        if (z) {
            e<K, V> eVar4 = eVar.i;
            eVar4.h = eVar.h;
            eVar.h.i = eVar4;
        }
        e<K, V> eVar5 = eVar.e;
        e<K, V> eVar6 = eVar.g;
        e<K, V> eVar7 = eVar.d;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                e(eVar, eVar5);
                eVar.e = null;
            } else if (eVar6 != null) {
                e(eVar, eVar6);
                eVar.g = null;
            } else {
                e(eVar, null);
            }
            c(eVar7, false);
            this.h--;
            this.i++;
            return;
        }
        if (eVar5.m > eVar6.m) {
            e<K, V> eVar8 = eVar5.g;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.g;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.e;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.e;
                }
            }
            eVar3 = eVar2;
        }
        d(eVar3, false);
        e<K, V> eVar11 = eVar.e;
        if (eVar11 != null) {
            i = eVar11.m;
            eVar3.e = eVar11;
            eVar11.d = eVar3;
            eVar.e = null;
        } else {
            i = 0;
        }
        e<K, V> eVar12 = eVar.g;
        if (eVar12 != null) {
            i2 = eVar12.m;
            eVar3.g = eVar12;
            eVar12.d = eVar3;
            eVar.g = null;
        }
        eVar3.m = Math.max(i, i2) + 1;
        e(eVar, eVar3);
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.d;
        eVar.d = null;
        if (eVar2 != null) {
            eVar2.d = eVar3;
        }
        if (eVar3 == null) {
            this.g = eVar2;
        } else if (eVar3.e == eVar) {
            eVar3.e = eVar2;
        } else {
            eVar3.g = eVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C7817yQ0<K, V>.b bVar = this.k;
        if (bVar != null) {
            return bVar;
        }
        C7817yQ0<K, V>.b bVar2 = new b();
        this.k = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.e;
        e<K, V> eVar3 = eVar.g;
        e<K, V> eVar4 = eVar3.e;
        e<K, V> eVar5 = eVar3.g;
        eVar.g = eVar4;
        if (eVar4 != null) {
            eVar4.d = eVar;
        }
        e(eVar, eVar3);
        eVar3.e = eVar;
        eVar.d = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.m : 0, eVar4 != null ? eVar4.m : 0) + 1;
        eVar.m = iMax;
        eVar3.m = Math.max(iMax, eVar5 != null ? eVar5.m : 0) + 1;
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.e;
        e<K, V> eVar3 = eVar.g;
        e<K, V> eVar4 = eVar2.e;
        e<K, V> eVar5 = eVar2.g;
        eVar.e = eVar5;
        if (eVar5 != null) {
            eVar5.d = eVar;
        }
        e(eVar, eVar2);
        eVar2.g = eVar;
        eVar.d = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.m : 0, eVar5 != null ? eVar5.m : 0) + 1;
        eVar.m = iMax;
        eVar2.m = Math.max(iMax, eVar4 != null ? eVar4.m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        e eVarB;
        if (obj != null) {
            try {
                eVarB = b(false, obj);
            } catch (ClassCastException unused) {
                eVarB = null;
            }
        } else {
            eVarB = null;
        }
        if (eVarB != null) {
            return eVarB.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C7817yQ0<K, V>.c cVar = this.l;
        if (cVar != null) {
            return cVar;
        }
        C7817yQ0<K, V>.c cVar2 = new c();
        this.l = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        if (v == null && !this.e) {
            throw new NullPointerException("value == null");
        }
        e eVarB = b(true, k);
        V v2 = eVarB.l;
        eVarB.l = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e<K, V> eVarB;
        if (obj != null) {
            try {
                eVarB = b(false, obj);
            } catch (ClassCastException unused) {
                eVarB = null;
            }
        } else {
            eVarB = null;
        }
        if (eVarB != null) {
            d(eVarB, true);
        }
        if (eVarB != null) {
            return eVarB.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h;
    }

    public C7817yQ0(boolean z) {
        a aVar = m;
        this.h = 0;
        this.i = 0;
        this.d = aVar;
        this.e = z;
        this.j = new e<>(z);
    }

    /* JADX INFO: renamed from: yQ0$e */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> d;
        public e<K, V> e;
        public e<K, V> g;
        public e<K, V> h;
        public e<K, V> i;
        public final K j;
        public final boolean k;
        public V l;
        public int m;

        public e(boolean z) {
            this.j = null;
            this.k = z;
            this.i = this;
            this.h = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.j;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.l;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.j;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.l;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.j;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.l;
            return (v != null ? v.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (v == null && !this.k) {
                throw new NullPointerException("value == null");
            }
            V v2 = this.l;
            this.l = v;
            return v2;
        }

        public final String toString() {
            return this.j + "=" + this.l;
        }

        public e(boolean z, e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.d = eVar;
            this.j = k;
            this.k = z;
            this.m = 1;
            this.h = eVar2;
            this.i = eVar3;
            eVar3.h = this;
            eVar2.i = this;
        }
    }
}

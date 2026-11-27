package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: wQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7397wQ0<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a m = new a();
    public C7397wQ0<K, V>.c k;
    public C7397wQ0<K, V>.d l;
    public int h = 0;
    public int i = 0;
    public final Comparator<? super K> d = m;
    public final f<K, V> g = new f<>();
    public f<K, V>[] e = new f[16];
    public int j = 12;

    /* JADX INFO: renamed from: wQ0$a */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: wQ0$b */
    public static final class b<K, V> {
        public f<K, V> a;
        public int b;
        public int c;
        public int d;

        public final void a(f<K, V> fVar) {
            fVar.g = null;
            fVar.d = null;
            fVar.e = null;
            fVar.m = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.c++;
                }
            }
            fVar.d = this.a;
            this.a = fVar;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            int i5 = this.b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.d = i3 + 2;
                this.b = i5 - 1;
                this.c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.d & i7) != i7) {
                    return;
                }
                int i8 = this.c;
                if (i8 == 0) {
                    f<K, V> fVar2 = this.a;
                    f<K, V> fVar3 = fVar2.d;
                    f<K, V> fVar4 = fVar3.d;
                    fVar3.d = fVar4.d;
                    this.a = fVar3;
                    fVar3.e = fVar4;
                    fVar3.g = fVar2;
                    fVar3.m = fVar2.m + 1;
                    fVar4.d = fVar3;
                    fVar2.d = fVar3;
                } else if (i8 == 1) {
                    f<K, V> fVar5 = this.a;
                    f<K, V> fVar6 = fVar5.d;
                    this.a = fVar6;
                    fVar6.g = fVar5;
                    fVar6.m = fVar5.m + 1;
                    fVar5.d = fVar6;
                    this.c = 0;
                } else if (i8 == 2) {
                    this.c = 0;
                }
                i6 *= 2;
            }
        }
    }

    /* JADX INFO: renamed from: wQ0$c */
    public final class c extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: wQ0$c$a */
        public class a extends C7397wQ0<K, V>.e<Map.Entry<K, V>> {
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C7397wQ0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            f fVarB;
            V v;
            Object value;
            if (obj instanceof Map.Entry) {
                C7397wQ0 c7397wQ0 = C7397wQ0.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                f fVar = null;
                if (key != null) {
                    try {
                        fVarB = c7397wQ0.b(false, key);
                    } catch (ClassCastException unused) {
                        fVarB = null;
                    }
                } else {
                    fVarB = null;
                }
                if (fVarB != null && ((v = fVarB.l) == (value = entry.getValue()) || (v != null && v.equals(value)))) {
                    fVar = fVarB;
                }
                if (fVar != null) {
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
            f fVarB;
            V v;
            Object value;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                C7397wQ0 c7397wQ0 = C7397wQ0.this;
                Object key = entry.getKey();
                f fVar = null;
                if (key != null) {
                    try {
                        fVarB = c7397wQ0.b(false, key);
                    } catch (ClassCastException unused) {
                        fVarB = null;
                    }
                } else {
                    fVarB = null;
                }
                if (fVarB != null && ((v = fVarB.l) == (value = entry.getValue()) || (v != null && v.equals(value)))) {
                    fVar = fVarB;
                }
                if (fVar != null) {
                    c7397wQ0.d(fVar, true);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C7397wQ0.this.h;
        }
    }

    /* JADX INFO: renamed from: wQ0$d */
    public final class d extends AbstractSet<K> {

        /* JADX INFO: renamed from: wQ0$d$a */
        public class a extends C7397wQ0<K, V>.e<K> {
            @Override // defpackage.C7397wQ0.e, java.util.Iterator
            public final K next() {
                return a().j;
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C7397wQ0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return C7397wQ0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C7397wQ0 c7397wQ0 = C7397wQ0.this;
            f fVarB = null;
            if (obj != null) {
                try {
                    fVarB = c7397wQ0.b(false, obj);
                } catch (ClassCastException unused) {
                }
            }
            if (fVarB != null) {
                c7397wQ0.d(fVarB, true);
            }
            return fVarB != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C7397wQ0.this.h;
        }
    }

    /* JADX INFO: renamed from: wQ0$e */
    public abstract class e<T> implements Iterator<T> {
        public f<K, V> d;
        public f<K, V> e = null;
        public int g;

        public e() {
            this.d = C7397wQ0.this.g.h;
            this.g = C7397wQ0.this.i;
        }

        public final f<K, V> a() {
            f<K, V> fVar = this.d;
            C7397wQ0 c7397wQ0 = C7397wQ0.this;
            if (fVar == c7397wQ0.g) {
                throw new NoSuchElementException();
            }
            if (c7397wQ0.i != this.g) {
                throw new ConcurrentModificationException();
            }
            this.d = fVar.h;
            this.e = fVar;
            return fVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != C7397wQ0.this.g;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            f<K, V> fVar = this.e;
            if (fVar == null) {
                throw new IllegalStateException();
            }
            C7397wQ0 c7397wQ0 = C7397wQ0.this;
            c7397wQ0.d(fVar, true);
            this.e = null;
            this.g = c7397wQ0.i;
        }
    }

    public final f b(boolean z, Object obj) {
        int iCompareTo;
        f<K, V> fVar;
        f<K, V> fVar2;
        f<K, V> fVar3;
        f<K, V> fVar4;
        f<K, V> fVar5;
        f<K, V> fVar6;
        f<K, V>[] fVarArr = this.e;
        int iHashCode = obj.hashCode();
        int i = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i2 = ((i >>> 7) ^ i) ^ (i >>> 4);
        boolean z2 = true;
        int length = i2 & (fVarArr.length - 1);
        f<K, V> fVar7 = fVarArr[length];
        a aVar = m;
        f<K, V> fVar8 = null;
        Comparator<? super K> comparator = this.d;
        if (fVar7 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) obj : null;
            while (true) {
                K k = fVar7.j;
                iCompareTo = comparable != null ? comparable.compareTo(k) : comparator.compare(obj, k);
                if (iCompareTo == 0) {
                    return fVar7;
                }
                f<K, V> fVar9 = iCompareTo < 0 ? fVar7.e : fVar7.g;
                if (fVar9 == null) {
                    break;
                }
                fVar7 = fVar9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        f<K, V> fVar10 = this.g;
        if (fVar7 != null) {
            f<K, V> fVar11 = fVar7;
            fVar = new f<>(fVar11, obj, i2, fVar10, fVar10.i);
            if (iCompareTo < 0) {
                fVar11.e = fVar;
            } else {
                fVar11.g = fVar;
            }
            c(fVar11, true);
        } else {
            if (comparator == aVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            fVar = new f<>(fVar7, obj, i2, fVar10, fVar10.i);
            fVarArr[length] = fVar;
        }
        int i3 = this.h;
        this.h = i3 + 1;
        if (i3 > this.j) {
            f<K, V>[] fVarArr2 = this.e;
            int length2 = fVarArr2.length;
            int i4 = length2 * 2;
            f<K, V>[] fVarArr3 = new f[i4];
            b bVar = new b();
            b bVar2 = new b();
            int i5 = 0;
            while (i5 < length2) {
                f<K, V> fVar12 = fVarArr2[i5];
                if (fVar12 == null) {
                    z2 = z2;
                    fVar3 = fVar8;
                } else {
                    f<K, V> fVar13 = fVar8;
                    for (f<K, V> fVar14 = fVar12; fVar14 != null; fVar14 = fVar14.e) {
                        fVar14.d = fVar13;
                        fVar13 = fVar14;
                    }
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (fVar13 != null) {
                            f<K, V> fVar15 = fVar13.d;
                            fVar13.d = fVar8;
                            f<K, V> fVar16 = fVar13.g;
                            while (true) {
                                f<K, V> fVar17 = fVar16;
                                fVar2 = fVar15;
                                fVar15 = fVar17;
                                if (fVar15 == null) {
                                    break;
                                }
                                fVar15.d = fVar2;
                                fVar16 = fVar15.e;
                            }
                        } else {
                            f<K, V> fVar18 = fVar13;
                            fVar13 = fVar8;
                            fVar2 = fVar18;
                        }
                        if (fVar13 == null) {
                            break;
                        }
                        if ((fVar13.k & length2) == 0) {
                            i6++;
                        } else {
                            i7++;
                        }
                        fVar13 = fVar2;
                        z2 = z2;
                        fVar8 = null;
                    }
                    bVar.b = ((Integer.highestOneBit(i6) * 2) - 1) - i6;
                    bVar.d = 0;
                    bVar.c = 0;
                    fVar3 = null;
                    bVar.a = null;
                    bVar2.b = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    bVar2.d = 0;
                    bVar2.c = 0;
                    bVar2.a = null;
                    f<K, V> fVar19 = null;
                    while (fVar12 != null) {
                        fVar12.d = fVar19;
                        f<K, V> fVar20 = fVar12;
                        fVar12 = fVar12.e;
                        fVar19 = fVar20;
                    }
                    while (true) {
                        if (fVar19 != null) {
                            f<K, V> fVar21 = fVar19.d;
                            fVar19.d = null;
                            f<K, V> fVar22 = fVar19.g;
                            while (true) {
                                f<K, V> fVar23 = fVar22;
                                fVar4 = fVar21;
                                fVar21 = fVar23;
                                if (fVar21 == null) {
                                    break;
                                }
                                fVar21.d = fVar4;
                                fVar22 = fVar21.e;
                            }
                        } else {
                            fVar4 = fVar19;
                            fVar19 = null;
                        }
                        if (fVar19 == null) {
                            break;
                        }
                        if ((fVar19.k & length2) == 0) {
                            bVar.a(fVar19);
                        } else {
                            bVar2.a(fVar19);
                        }
                        fVar19 = fVar4;
                    }
                    if (i6 > 0) {
                        fVar5 = bVar.a;
                        if (fVar5.d != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar5 = null;
                    }
                    fVarArr3[i5] = fVar5;
                    int i8 = i5 + length2;
                    if (i7 > 0) {
                        fVar6 = bVar2.a;
                        if (fVar6.d != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar6 = null;
                    }
                    fVarArr3[i8] = fVar6;
                }
                i5++;
                fVar8 = fVar3;
                z2 = z2;
            }
            this.e = fVarArr3;
            this.j = (i4 / 4) + (i4 / 2);
        }
        this.i++;
        return fVar;
    }

    public final void c(f<K, V> fVar, boolean z) {
        while (fVar != null) {
            f<K, V> fVar2 = fVar.e;
            f<K, V> fVar3 = fVar.g;
            int i = fVar2 != null ? fVar2.m : 0;
            int i2 = fVar3 != null ? fVar3.m : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                f<K, V> fVar4 = fVar3.e;
                f<K, V> fVar5 = fVar3.g;
                int i4 = (fVar4 != null ? fVar4.m : 0) - (fVar5 != null ? fVar5.m : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    g(fVar3);
                }
                f(fVar);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                f<K, V> fVar6 = fVar2.e;
                f<K, V> fVar7 = fVar2.g;
                int i5 = (fVar6 != null ? fVar6.m : 0) - (fVar7 != null ? fVar7.m : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    f(fVar2);
                }
                g(fVar);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                fVar.m = i + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.m = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.d;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.e, (Object) null);
        this.h = 0;
        this.i++;
        f<K, V> fVar = this.g;
        f<K, V> fVar2 = fVar.h;
        while (fVar2 != fVar) {
            f<K, V> fVar3 = fVar2.h;
            fVar2.i = null;
            fVar2.h = null;
            fVar2 = fVar3;
        }
        fVar.i = fVar;
        fVar.h = fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        f fVarB = null;
        if (obj != null) {
            try {
                fVarB = b(false, obj);
            } catch (ClassCastException unused) {
            }
        }
        return fVarB != null;
    }

    public final void d(f<K, V> fVar, boolean z) {
        f<K, V> fVar2;
        f<K, V> fVar3;
        int i;
        if (z) {
            f<K, V> fVar4 = fVar.i;
            fVar4.h = fVar.h;
            fVar.h.i = fVar4;
            fVar.i = null;
            fVar.h = null;
        }
        f<K, V> fVar5 = fVar.e;
        f<K, V> fVar6 = fVar.g;
        f<K, V> fVar7 = fVar.d;
        int i2 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                e(fVar, fVar5);
                fVar.e = null;
            } else if (fVar6 != null) {
                e(fVar, fVar6);
                fVar.g = null;
            } else {
                e(fVar, null);
            }
            c(fVar7, false);
            this.h--;
            this.i++;
            return;
        }
        if (fVar5.m > fVar6.m) {
            f<K, V> fVar8 = fVar5.g;
            while (true) {
                f<K, V> fVar9 = fVar8;
                fVar3 = fVar5;
                fVar5 = fVar9;
                if (fVar5 == null) {
                    break;
                } else {
                    fVar8 = fVar5.g;
                }
            }
        } else {
            f<K, V> fVar10 = fVar6.e;
            while (true) {
                fVar2 = fVar6;
                fVar6 = fVar10;
                if (fVar6 == null) {
                    break;
                } else {
                    fVar10 = fVar6.e;
                }
            }
            fVar3 = fVar2;
        }
        d(fVar3, false);
        f<K, V> fVar11 = fVar.e;
        if (fVar11 != null) {
            i = fVar11.m;
            fVar3.e = fVar11;
            fVar11.d = fVar3;
            fVar.e = null;
        } else {
            i = 0;
        }
        f<K, V> fVar12 = fVar.g;
        if (fVar12 != null) {
            i2 = fVar12.m;
            fVar3.g = fVar12;
            fVar12.d = fVar3;
            fVar.g = null;
        }
        fVar3.m = Math.max(i, i2) + 1;
        e(fVar, fVar3);
    }

    public final void e(f<K, V> fVar, f<K, V> fVar2) {
        f<K, V> fVar3 = fVar.d;
        fVar.d = null;
        if (fVar2 != null) {
            fVar2.d = fVar3;
        }
        if (fVar3 == null) {
            f<K, V>[] fVarArr = this.e;
            fVarArr[fVar.k & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.e == fVar) {
            fVar3.e = fVar2;
        } else {
            fVar3.g = fVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C7397wQ0<K, V>.c cVar = this.k;
        if (cVar != null) {
            return cVar;
        }
        C7397wQ0<K, V>.c cVar2 = new c();
        this.k = cVar2;
        return cVar2;
    }

    public final void f(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.e;
        f<K, V> fVar3 = fVar.g;
        f<K, V> fVar4 = fVar3.e;
        f<K, V> fVar5 = fVar3.g;
        fVar.g = fVar4;
        if (fVar4 != null) {
            fVar4.d = fVar;
        }
        e(fVar, fVar3);
        fVar3.e = fVar;
        fVar.d = fVar3;
        int iMax = Math.max(fVar2 != null ? fVar2.m : 0, fVar4 != null ? fVar4.m : 0) + 1;
        fVar.m = iMax;
        fVar3.m = Math.max(iMax, fVar5 != null ? fVar5.m : 0) + 1;
    }

    public final void g(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.e;
        f<K, V> fVar3 = fVar.g;
        f<K, V> fVar4 = fVar2.e;
        f<K, V> fVar5 = fVar2.g;
        fVar.e = fVar5;
        if (fVar5 != null) {
            fVar5.d = fVar;
        }
        e(fVar, fVar2);
        fVar2.g = fVar;
        fVar.d = fVar2;
        int iMax = Math.max(fVar3 != null ? fVar3.m : 0, fVar5 != null ? fVar5.m : 0) + 1;
        fVar.m = iMax;
        fVar2.m = Math.max(iMax, fVar4 != null ? fVar4.m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        f fVarB;
        if (obj != null) {
            try {
                fVarB = b(false, obj);
            } catch (ClassCastException unused) {
                fVarB = null;
            }
        } else {
            fVarB = null;
        }
        if (fVarB != null) {
            return fVarB.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C7397wQ0<K, V>.d dVar = this.l;
        if (dVar != null) {
            return dVar;
        }
        C7397wQ0<K, V>.d dVar2 = new d();
        this.l = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        f fVarB = b(true, k);
        V v2 = fVarB.l;
        fVarB.l = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        f<K, V> fVarB;
        if (obj != null) {
            try {
                fVarB = b(false, obj);
            } catch (ClassCastException unused) {
                fVarB = null;
            }
        } else {
            fVarB = null;
        }
        if (fVarB != null) {
            d(fVarB, true);
        }
        if (fVarB != null) {
            return fVarB.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h;
    }

    /* JADX INFO: renamed from: wQ0$f */
    public static final class f<K, V> implements Map.Entry<K, V> {
        public f<K, V> d;
        public f<K, V> e;
        public f<K, V> g;
        public f<K, V> h;
        public f<K, V> i;
        public final K j;
        public final int k;
        public V l;
        public int m;

        public f() {
            this.j = null;
            this.k = -1;
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
            V v2 = this.l;
            this.l = v;
            return v2;
        }

        public final String toString() {
            return this.j + "=" + this.l;
        }

        public f(f<K, V> fVar, K k, int i, f<K, V> fVar2, f<K, V> fVar3) {
            this.d = fVar;
            this.j = k;
            this.k = i;
            this.m = 1;
            this.h = fVar2;
            this.i = fVar3;
            fVar3.h = this;
            fVar2.i = this;
        }
    }
}

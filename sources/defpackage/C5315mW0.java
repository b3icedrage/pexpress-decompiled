package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \b*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\t\n\u000b\f\r\u000eB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"LmW0;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "r", R51.PUSH_ADDITIONAL_DATA_KEY, "d", "e", "f", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C5315mW0<K, V> implements Map<K, V>, Serializable, InterfaceC7376wJ0 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final C5315mW0 s;

    @NotNull
    public K[] d;

    @Nullable
    public V[] e;

    @NotNull
    public int[] g;

    @NotNull
    public int[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    @Nullable
    public C5735oW0<K> n;

    @Nullable
    public C5945pW0<V> o;

    @Nullable
    public C5525nW0<K, V> p;
    public boolean q;

    /* JADX INFO: renamed from: mW0$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mW0$b */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC6745tJ0 {
        @Override // java.util.Iterator
        public final Object next() {
            b();
            int i = this.e;
            C5315mW0<K, V> c5315mW0 = this.d;
            if (i >= c5315mW0.j) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.g = i;
            c cVar = new c(c5315mW0, i);
            c();
            return cVar;
        }
    }

    /* JADX INFO: renamed from: mW0$c */
    public static final class c<K, V> implements Map.Entry<K, V>, InterfaceC7376wJ0.a {

        @NotNull
        public final C5315mW0<K, V> d;
        public final int e;
        public final int g;

        public c(@NotNull C5315mW0<K, V> map, int i) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.d = map;
            this.e = i;
            this.g = map.l;
        }

        public final void b() {
            if (this.d.l != this.g) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.a(entry.getKey(), getKey()) && Intrinsics.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            b();
            return this.d.d[this.e];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            b();
            V[] vArr = this.d.e;
            Intrinsics.checkNotNull(vArr);
            return vArr[this.e];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            b();
            C5315mW0<K, V> c5315mW0 = this.d;
            c5315mW0.d();
            V[] vArr = c5315mW0.e;
            if (vArr == null) {
                int length = c5315mW0.d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                c5315mW0.e = vArr;
            }
            int i = this.e;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: mW0$d */
    public static class d<K, V> {

        @NotNull
        public final C5315mW0<K, V> d;
        public int e;
        public int g;
        public int h;

        public d(@NotNull C5315mW0<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.d = map;
            this.g = -1;
            this.h = map.l;
            c();
        }

        public final void b() {
            if (this.d.l != this.h) {
                throw new ConcurrentModificationException();
            }
        }

        public final void c() {
            while (true) {
                int i = this.e;
                C5315mW0<K, V> c5315mW0 = this.d;
                if (i >= c5315mW0.j || c5315mW0.g[i] >= 0) {
                    return;
                } else {
                    this.e = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.e < this.d.j;
        }

        public final void remove() {
            b();
            if (this.g == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            C5315mW0<K, V> c5315mW0 = this.d;
            c5315mW0.d();
            c5315mW0.m(this.g);
            this.g = -1;
            this.h = c5315mW0.l;
        }
    }

    /* JADX INFO: renamed from: mW0$e */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, InterfaceC6745tJ0 {
        @Override // java.util.Iterator
        public final K next() {
            b();
            int i = this.e;
            C5315mW0<K, V> c5315mW0 = this.d;
            if (i >= c5315mW0.j) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.g = i;
            K k = c5315mW0.d[i];
            c();
            return k;
        }
    }

    /* JADX INFO: renamed from: mW0$f */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, InterfaceC6745tJ0 {
        @Override // java.util.Iterator
        public final V next() {
            b();
            int i = this.e;
            C5315mW0<K, V> c5315mW0 = this.d;
            if (i >= c5315mW0.j) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.g = i;
            V[] vArr = c5315mW0.e;
            Intrinsics.checkNotNull(vArr);
            V v = vArr[this.g];
            c();
            return v;
        }
    }

    static {
        C5315mW0 c5315mW0 = new C5315mW0(0);
        c5315mW0.q = true;
        s = c5315mW0;
    }

    public C5315mW0() {
        this(8);
    }

    public final int b(K k) {
        d();
        while (true) {
            int iK = k(k);
            int i = this.i * 2;
            int length = this.h.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.h;
                int i3 = iArr[iK];
                if (i3 <= 0) {
                    int i4 = this.j;
                    K[] kArr = this.d;
                    if (i4 >= kArr.length) {
                        h(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.j = i5;
                    kArr[i4] = k;
                    this.g[i4] = iK;
                    iArr[iK] = i5;
                    this.m++;
                    this.l++;
                    if (i2 > this.i) {
                        this.i = i2;
                    }
                    return i4;
                }
                if (Intrinsics.a(this.d[i3 - 1], k)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    l(this.h.length * 2);
                    break;
                }
                iK = iK == 0 ? this.h.length - 1 : iK - 1;
            }
        }
    }

    @NotNull
    public final C5315mW0 c() {
        d();
        this.q = true;
        if (this.m > 0) {
            return this;
        }
        C5315mW0 c5315mW0 = s;
        Intrinsics.c(c5315mW0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c5315mW0;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.j - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.h[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        C1952Ru.o(this.d, 0, this.j);
        V[] vArr = this.e;
        if (vArr != null) {
            C1952Ru.o(vArr, 0, this.j);
        }
        this.m = 0;
        this.j = 0;
        this.l++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void d() {
        if (this.q) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z) {
        int i;
        V[] vArr = this.e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.j;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.g;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.d;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.h[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        C1952Ru.o(this.d, i3, i);
        if (vArr != null) {
            C1952Ru.o(vArr, i3, this.j);
        }
        this.j = i3;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C5525nW0<K, V> c5525nW0 = this.p;
        if (c5525nW0 != null) {
            return c5525nW0;
        }
        C5525nW0<K, V> c5525nW1 = new C5525nW0<>(this);
        this.p = c5525nW1;
        return c5525nW1;
    }

    @Override // java.util.Map
    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.m == map.size() && f(map.entrySet());
    }

    public final boolean f(@NotNull Collection<?> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int i = i(entry.getKey());
        if (i < 0) {
            return false;
        }
        V[] vArr = this.e;
        Intrinsics.checkNotNull(vArr);
        return Intrinsics.a(vArr[i], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public final V get(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        V[] vArr = this.e;
        Intrinsics.checkNotNull(vArr);
        return vArr[i];
    }

    public final void h(int i) {
        V[] vArr;
        K[] kArr = this.d;
        int length = kArr.length;
        int i2 = this.j;
        int i3 = length - i2;
        int i4 = i2 - this.m;
        if (i3 < i && i3 + i4 >= i && i4 >= kArr.length / 4) {
            e(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > kArr.length) {
            AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
            int length2 = kArr.length;
            aVar.getClass();
            int iE = AbstractC5838p0.Companion.e(length2, i5);
            K[] kArr2 = this.d;
            Intrinsics.checkNotNullParameter(kArr2, "<this>");
            K[] kArr3 = (K[]) Arrays.copyOf(kArr2, iE);
            Intrinsics.checkNotNullExpressionValue(kArr3, "copyOf(...)");
            this.d = kArr3;
            V[] vArr2 = this.e;
            if (vArr2 != null) {
                Intrinsics.checkNotNullParameter(vArr2, "<this>");
                vArr = (V[]) Arrays.copyOf(vArr2, iE);
                Intrinsics.checkNotNullExpressionValue(vArr, "copyOf(...)");
            } else {
                vArr = null;
            }
            this.e = vArr;
            int[] iArrCopyOf = Arrays.copyOf(this.g, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.g = iArrCopyOf;
            INSTANCE.getClass();
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.h.length) {
                l(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "map");
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i2 = bVar.e;
            C5315mW0<K, V> c5315mW0 = bVar.d;
            if (i2 >= c5315mW0.j) {
                throw new NoSuchElementException();
            }
            bVar.e = i2 + 1;
            bVar.g = i2;
            K k = c5315mW0.d[i2];
            int iHashCode = k != null ? k.hashCode() : 0;
            V[] vArr = c5315mW0.e;
            Intrinsics.checkNotNull(vArr);
            V v = vArr[bVar.g];
            int iHashCode2 = v != null ? v.hashCode() : 0;
            bVar.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(K k) {
        int iK = k(k);
        int i = this.i;
        while (true) {
            int i2 = this.h[iK];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.a(this.d[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iK = iK == 0 ? this.h.length - 1 : iK - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.m == 0;
    }

    public final int j(V v) {
        int i = this.j;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.g[i] >= 0) {
                V[] vArr = this.e;
                Intrinsics.checkNotNull(vArr);
                if (Intrinsics.a(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public final int k(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        C5735oW0<K> c5735oW0 = this.n;
        if (c5735oW0 != null) {
            return c5735oW0;
        }
        C5735oW0<K> c5735oW1 = new C5735oW0<>(this);
        this.n = c5735oW1;
        return c5735oW1;
    }

    public final void l(int i) {
        int[] iArr;
        this.l++;
        int i2 = 0;
        if (this.j > this.m) {
            e(false);
        }
        this.h = new int[i];
        INSTANCE.getClass();
        this.k = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.j) {
            int i3 = i2 + 1;
            int iK = k(this.d[i2]);
            int i4 = this.i;
            while (true) {
                iArr = this.h;
                if (iArr[iK] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iK = iK == 0 ? iArr.length - 1 : iK - 1;
            }
            iArr[iK] = i3;
            this.g[i2] = iK;
            i2 = i3;
        }
    }

    public final void m(int i) {
        K[] kArr = this.d;
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        kArr[i] = null;
        V[] vArr = this.e;
        if (vArr != null) {
            Intrinsics.checkNotNullParameter(vArr, "<this>");
            vArr[i] = null;
        }
        int length = this.g[i];
        int i2 = this.i * 2;
        int length2 = this.h.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.h.length - 1 : length - 1;
            i4++;
            if (i4 > this.i) {
                this.h[i5] = 0;
            } else {
                int[] iArr = this.h;
                int i6 = iArr[length];
                if (i6 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i6 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i7 = i6 - 1;
                        int iK = k(this.d[i7]) - length;
                        int[] iArr2 = this.h;
                        if ((iK & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i6;
                            this.g[i7] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.g[i] = -1;
            this.m--;
            this.l++;
        } while (i3 >= 0);
        this.h[i5] = -1;
        this.g[i] = -1;
        this.m--;
        this.l++;
    }

    @Override // java.util.Map
    @Nullable
    public final V put(K k, V v) {
        d();
        int iB = b(k);
        V[] vArr = this.e;
        if (vArr == null) {
            int length = this.d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            vArr = (V[]) new Object[length];
            this.e = vArr;
        }
        if (iB >= 0) {
            vArr[iB] = v;
            return null;
        }
        int i = (-iB) - 1;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        d();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        h(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iB = b(entry.getKey());
            V[] vArr = this.e;
            if (vArr == null) {
                int length = this.d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                this.e = vArr;
            }
            if (iB >= 0) {
                vArr[iB] = entry.getValue();
            } else {
                int i = (-iB) - 1;
                if (!Intrinsics.a(entry.getValue(), vArr[i])) {
                    vArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public final V remove(Object obj) {
        d();
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        V[] vArr = this.e;
        Intrinsics.checkNotNull(vArr);
        V v = vArr[i];
        m(i);
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.m;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.m * 3) + 2);
        sb.append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb, "sb");
            int i2 = bVar.e;
            C5315mW0<K, V> c5315mW0 = bVar.d;
            if (i2 >= c5315mW0.j) {
                throw new NoSuchElementException();
            }
            bVar.e = i2 + 1;
            bVar.g = i2;
            K k = c5315mW0.d[i2];
            if (k == c5315mW0) {
                sb.append("(this Map)");
            } else {
                sb.append(k);
            }
            sb.append('=');
            V[] vArr = c5315mW0.e;
            Intrinsics.checkNotNull(vArr);
            V v = vArr[bVar.g];
            if (v == c5315mW0) {
                sb.append("(this Map)");
            } else {
                sb.append(v);
            }
            bVar.c();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C5945pW0<V> c5945pW0 = this.o;
        if (c5945pW0 != null) {
            return c5945pW0;
        }
        C5945pW0<V> c5945pW1 = new C5945pW0<>(this);
        this.o = c5945pW1;
        return c5945pW1;
    }

    public C5315mW0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        INSTANCE.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.d = kArr;
        this.e = null;
        this.g = iArr;
        this.h = new int[iHighestOneBit];
        this.i = 2;
        this.j = 0;
        this.k = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}

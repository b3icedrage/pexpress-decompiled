package defpackage;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: zT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8036zT0 extends V0<Long> implements RandomAccess, InterfaceC5566nh1 {
    public long[] e;
    public int g;

    static {
        new C8036zT0(new long[0], 0).d = false;
    }

    public C8036zT0() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.g)) {
            StringBuilder sbC = C1332Jw.c(i, "Index:", ", Size:");
            sbC.append(this.g);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        long[] jArr = this.e;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C5807oq.a(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.e, i, jArr2, i + 1, this.g - i);
            this.e = jArr2;
        }
        this.e[i] = jLongValue;
        this.g++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.V0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = XB0.a;
        collection.getClass();
        if (!(collection instanceof C8036zT0)) {
            return super.addAll(collection);
        }
        C8036zT0 c8036zT0 = (C8036zT0) collection;
        int i = c8036zT0.g;
        if (i == 0) {
            return false;
        }
        int i2 = this.g;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.e;
        if (i3 > jArr.length) {
            this.e = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c8036zT0.e, 0, this.e, this.g, c8036zT0.g);
        this.g = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.g) {
            StringBuilder sbC = C1332Jw.c(i, "Index:", ", Size:");
            sbC.append(this.g);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8036zT0)) {
            return super.equals(obj);
        }
        C8036zT0 c8036zT0 = (C8036zT0) obj;
        if (this.g != c8036zT0.g) {
            return false;
        }
        long[] jArr = c8036zT0.e;
        for (int i = 0; i < this.g; i++) {
            if (this.e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return Long.valueOf(this.e[i]);
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.g; i++) {
            iB = (iB * 31) + XB0.b(this.e[i]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.e[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // XB0.c
    public final XB0.c l(int i) {
        if (i >= this.g) {
            return new C8036zT0(Arrays.copyOf(this.e, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        long[] jArr = this.e;
        long j = jArr[i];
        int i2 = this.g;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.g--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.e;
        System.arraycopy(jArr, i2, jArr, i, this.g - i2);
        this.g -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        b(i);
        long[] jArr = this.e;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }

    public C8036zT0(long[] jArr, int i) {
        this.e = jArr;
        this.g = i;
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        int i = this.g;
        long[] jArr = this.e;
        if (i == jArr.length) {
            long[] jArr2 = new long[C5807oq.a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.e = jArr2;
        }
        long[] jArr3 = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        jArr3[i2] = jLongValue;
        return true;
    }
}

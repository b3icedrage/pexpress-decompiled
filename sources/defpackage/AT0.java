package defpackage;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class AT0 extends W0<Long> implements RandomAccess, InterfaceC5776oh1 {
    public long[] e;
    public int g;

    static {
        new AT0(new long[0], 0, false);
    }

    public AT0() {
        this(new long[10], 0, true);
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

    @Override // defpackage.W0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = VB0.a;
        collection.getClass();
        if (!(collection instanceof AT0)) {
            return super.addAll(collection);
        }
        AT0 at0 = (AT0) collection;
        int i = at0.g;
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
        System.arraycopy(at0.e, 0, this.e, this.g, at0.g);
        this.g = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(long j) {
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
        jArr3[i2] = j;
    }

    public final void c(int i) {
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

    public final long d(int i) {
        c(i);
        return this.e[i];
    }

    @Override // defpackage.W0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AT0)) {
            return super.equals(obj);
        }
        AT0 at0 = (AT0) obj;
        if (this.g != at0.g) {
            return false;
        }
        long[] jArr = at0.e;
        for (int i = 0; i < this.g; i++) {
            if (this.e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(d(i));
    }

    @Override // defpackage.W0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.g; i++) {
            iB = (iB * 31) + VB0.b(this.e[i]);
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

    @Override // VB0.c
    public final VB0.c l(int i) {
        if (i >= this.g) {
            return new AT0(Arrays.copyOf(this.e, i), this.g, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.W0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
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
        c(i);
        long[] jArr = this.e;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }

    public AT0(long[] jArr, int i, boolean z) {
        super(z);
        this.e = jArr;
        this.g = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}

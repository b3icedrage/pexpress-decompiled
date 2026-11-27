package defpackage;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class V20 extends W0<Double> implements RandomAccess, InterfaceC5776oh1 {
    public double[] e;
    public int g;

    static {
        new V20(new double[0], 0, false);
    }

    public V20() {
        this(new double[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.g)) {
            StringBuilder sbC = C1332Jw.c(i, "Index:", ", Size:");
            sbC.append(this.g);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        double[] dArr = this.e;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C5807oq.a(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.e, i, dArr2, i + 1, this.g - i);
            this.e = dArr2;
        }
        this.e[i] = dDoubleValue;
        this.g++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.W0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = VB0.a;
        collection.getClass();
        if (!(collection instanceof V20)) {
            return super.addAll(collection);
        }
        V20 v20 = (V20) collection;
        int i = v20.g;
        if (i == 0) {
            return false;
        }
        int i2 = this.g;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.e;
        if (i3 > dArr.length) {
            this.e = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(v20.e, 0, this.e, this.g, v20.g);
        this.g = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(double d) {
        a();
        int i = this.g;
        double[] dArr = this.e;
        if (i == dArr.length) {
            double[] dArr2 = new double[C5807oq.a(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.e = dArr2;
        }
        double[] dArr3 = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        dArr3[i2] = d;
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

    @Override // defpackage.W0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V20)) {
            return super.equals(obj);
        }
        V20 v20 = (V20) obj;
        if (this.g != v20.g) {
            return false;
        }
        double[] dArr = v20.e;
        for (int i = 0; i < this.g; i++) {
            if (Double.doubleToLongBits(this.e[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Double.valueOf(this.e[i]);
    }

    @Override // defpackage.W0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.g; i++) {
            iB = (iB * 31) + VB0.b(Double.doubleToLongBits(this.e[i]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.e[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // VB0.c
    public final VB0.c l(int i) {
        if (i >= this.g) {
            return new V20(Arrays.copyOf(this.e, i), this.g, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.W0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        double[] dArr = this.e;
        double d = dArr[i];
        int i2 = this.g;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.g--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.e;
        System.arraycopy(dArr, i2, dArr, i, this.g - i2);
        this.g -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        c(i);
        double[] dArr = this.e;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }

    public V20(double[] dArr, int i, boolean z) {
        super(z);
        this.e = dArr;
        this.g = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}

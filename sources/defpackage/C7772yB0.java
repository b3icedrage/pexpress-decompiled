package defpackage;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: yB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7772yB0 extends V0<Integer> implements XB0.b, RandomAccess, InterfaceC5566nh1 {
    public static final C7772yB0 h;
    public int[] e;
    public int g;

    static {
        C7772yB0 c7772yB0 = new C7772yB0(new int[0], 0);
        h = c7772yB0;
        c7772yB0.d = false;
    }

    public C7772yB0() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.g)) {
            StringBuilder sbC = C1332Jw.c(i, "Index:", ", Size:");
            sbC.append(this.g);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        int[] iArr = this.e;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C5807oq.a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.e, i, iArr2, i + 1, this.g - i);
            this.e = iArr2;
        }
        this.e[i] = iIntValue;
        this.g++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.V0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        Charset charset = XB0.a;
        collection.getClass();
        if (!(collection instanceof C7772yB0)) {
            return super.addAll(collection);
        }
        C7772yB0 c7772yB0 = (C7772yB0) collection;
        int i = c7772yB0.g;
        if (i == 0) {
            return false;
        }
        int i2 = this.g;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.e;
        if (i3 > iArr.length) {
            this.e = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c7772yB0.e, 0, this.e, this.g, c7772yB0.g);
        this.g = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        a();
        int i2 = this.g;
        int[] iArr = this.e;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C5807oq.a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.e = iArr2;
        }
        int[] iArr3 = this.e;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr3[i3] = i;
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

    public final int d(int i) {
        c(i);
        return this.e[i];
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7772yB0)) {
            return super.equals(obj);
        }
        C7772yB0 c7772yB0 = (C7772yB0) obj;
        if (this.g != c7772yB0.g) {
            return false;
        }
        int[] iArr = c7772yB0.e;
        for (int i = 0; i < this.g; i++) {
            if (this.e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(d(i));
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.g; i2++) {
            i = (i * 31) + this.e[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.e[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // XB0.c
    public final XB0.c<Integer> l(int i) {
        if (i >= this.g) {
            return new C7772yB0(Arrays.copyOf(this.e, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        int[] iArr = this.e;
        int i2 = iArr[i];
        int i3 = this.g;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.g--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.e;
        System.arraycopy(iArr, i2, iArr, i, this.g - i2);
        this.g -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        c(i);
        int[] iArr = this.e;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }

    public C7772yB0(int[] iArr, int i) {
        this.e = iArr;
        this.g = i;
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}

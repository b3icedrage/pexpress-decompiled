package defpackage;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: At, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0621At extends W0<Boolean> implements RandomAccess, InterfaceC5776oh1 {
    public boolean[] e;
    public int g;

    static {
        new C0621At(new boolean[0], 0, false);
    }

    public C0621At() {
        this(new boolean[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.g)) {
            StringBuilder sbC = C1332Jw.c(i, "Index:", ", Size:");
            sbC.append(this.g);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        boolean[] zArr = this.e;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C5807oq.a(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.e, i, zArr2, i + 1, this.g - i);
            this.e = zArr2;
        }
        this.e[i] = zBooleanValue;
        this.g++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.W0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        Charset charset = VB0.a;
        collection.getClass();
        if (!(collection instanceof C0621At)) {
            return super.addAll(collection);
        }
        C0621At c0621At = (C0621At) collection;
        int i = c0621At.g;
        if (i == 0) {
            return false;
        }
        int i2 = this.g;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.e;
        if (i3 > zArr.length) {
            this.e = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c0621At.e, 0, this.e, this.g, c0621At.g);
        this.g = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z) {
        a();
        int i = this.g;
        boolean[] zArr = this.e;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C5807oq.a(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.e = zArr2;
        }
        boolean[] zArr3 = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        zArr3[i2] = z;
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
        if (!(obj instanceof C0621At)) {
            return super.equals(obj);
        }
        C0621At c0621At = (C0621At) obj;
        if (this.g != c0621At.g) {
            return false;
        }
        boolean[] zArr = c0621At.e;
        for (int i = 0; i < this.g; i++) {
            if (this.e[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return Boolean.valueOf(this.e[i]);
    }

    @Override // defpackage.W0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.g; i2++) {
            int i3 = i * 31;
            boolean z = this.e[i2];
            Charset charset = VB0.a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.e[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // VB0.c
    public final VB0.c l(int i) {
        if (i >= this.g) {
            return new C0621At(Arrays.copyOf(this.e, i), this.g, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.W0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        boolean[] zArr = this.e;
        boolean z = zArr[i];
        int i2 = this.g;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.g--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.e;
        System.arraycopy(zArr, i2, zArr, i, this.g - i2);
        this.g -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i);
        boolean[] zArr = this.e;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }

    public C0621At(boolean[] zArr, int i, boolean z) {
        super(z);
        this.e = zArr;
        this.g = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}

package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Dk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0830Dk1<E> extends W0<E> implements RandomAccess {
    public static final C0830Dk1<Object> h = new C0830Dk1<>(new Object[0], 0, false);
    public E[] e;
    public int g;

    public C0830Dk1(E[] eArr, int i, boolean z) {
        super(z);
        this.e = eArr;
        this.g = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        a();
        int i = this.g;
        E[] eArr = this.e;
        if (i == eArr.length) {
            this.e = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        eArr2[i2] = e;
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

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        b(i);
        return this.e[i];
    }

    @Override // VB0.c
    public final VB0.c l(int i) {
        if (i >= this.g) {
            return new C0830Dk1(Arrays.copyOf(this.e, i), this.g, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.W0, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        a();
        b(i);
        E[] eArr = this.e;
        E e = eArr[i];
        int i2 = this.g;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.g--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a();
        b(i);
        E[] eArr = this.e;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        a();
        if (i >= 0 && i <= (i2 = this.g)) {
            E[] eArr = this.e;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[C5807oq.a(i2, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.e, i, eArr2, i + 1, this.g - i);
                this.e = eArr2;
            }
            this.e[i] = e;
            this.g++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbC = C1332Jw.c(i, "Index:", ", Size:");
        sbC.append(this.g);
        throw new IndexOutOfBoundsException(sbC.toString());
    }
}

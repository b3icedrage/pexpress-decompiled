package defpackage;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: Ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0903Ej<E> implements Collection<E>, Set<E> {
    public static final int[] i = new int[0];
    public static final Object[] j = new Object[0];
    public static Object[] k;
    public static int l;
    public static Object[] m;
    public static int n;
    public int[] d;
    public Object[] e;
    public int g;
    public C0825Dj h;

    public C0903Ej() {
        this(0);
    }

    public static void b(int[] iArr, int i2, Object[] objArr) {
        if (iArr.length == 8) {
            synchronized (C0903Ej.class) {
                try {
                    if (n < 10) {
                        objArr[0] = m;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        m = objArr;
                        n++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0903Ej.class) {
                try {
                    if (l < 10) {
                        objArr[0] = k;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        k = objArr;
                        l++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (C0903Ej.class) {
                try {
                    Object[] objArr = m;
                    if (objArr != null) {
                        this.e = objArr;
                        m = (Object[]) objArr[0];
                        this.d = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        n--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 == 4) {
            synchronized (C0903Ej.class) {
                try {
                    Object[] objArr2 = k;
                    if (objArr2 != null) {
                        this.e = objArr2;
                        k = (Object[]) objArr2[0];
                        this.d = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        l--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.d = new int[i2];
        this.e = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i2;
        int iC;
        if (e == null) {
            iC = d();
            i2 = 0;
        } else {
            int iHashCode = e.hashCode();
            i2 = iHashCode;
            iC = c(iHashCode, e);
        }
        if (iC >= 0) {
            return false;
        }
        int i3 = ~iC;
        int i4 = this.g;
        int[] iArr = this.d;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.e;
            a(i5);
            int[] iArr2 = this.d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.e, 0, objArr.length);
            }
            b(iArr, this.g, objArr);
        }
        int i6 = this.g;
        if (i3 < i6) {
            int[] iArr3 = this.d;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.e;
            System.arraycopy(objArr2, i3, objArr2, i7, this.g - i3);
        }
        this.d[i3] = i2;
        this.e[i3] = e;
        this.g++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        int size = collection.size() + this.g;
        int[] iArr = this.d;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.e;
            a(size);
            int i2 = this.g;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.d, 0, i2);
                System.arraycopy(objArr, 0, this.e, 0, this.g);
            }
            b(iArr, this.g, objArr);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final int c(int i2, Object obj) {
        int i3 = this.g;
        if (i3 == 0) {
            return -1;
        }
        int iB = U0.b(i3, i2, this.d);
        if (iB < 0 || obj.equals(this.e[iB])) {
            return iB;
        }
        int i4 = iB + 1;
        while (i4 < i3 && this.d[i4] == i2) {
            if (obj.equals(this.e[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iB - 1; i5 >= 0 && this.d[i5] == i2; i5--) {
            if (obj.equals(this.e[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.g;
        if (i2 != 0) {
            b(this.d, i2, this.e);
            this.d = i;
            this.e = j;
            this.g = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? d() : c(obj.hashCode(), obj)) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.g;
        if (i2 == 0) {
            return -1;
        }
        int iB = U0.b(i2, 0, this.d);
        if (iB < 0 || this.e[iB] == null) {
            return iB;
        }
        int i3 = iB + 1;
        while (i3 < i2 && this.d[i3] == 0) {
            if (this.e[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iB - 1; i4 >= 0 && this.d[i4] == 0; i4--) {
            if (this.e[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void e(int i2) {
        Object[] objArr = this.e;
        Object obj = objArr[i2];
        int i3 = this.g;
        if (i3 <= 1) {
            b(this.d, i3, objArr);
            this.d = i;
            this.e = j;
            this.g = 0;
            return;
        }
        int[] iArr = this.d;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.g = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                Object[] objArr2 = this.e;
                System.arraycopy(objArr2, i5, objArr2, i2, this.g - i2);
            }
            this.e[this.g] = null;
            return;
        }
        a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.g--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.d, 0, i2);
            System.arraycopy(objArr, 0, this.e, 0, i2);
        }
        int i6 = this.g;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, this.d, i2, i6 - i2);
            System.arraycopy(objArr, i7, this.e, i2, this.g - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.g != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.g; i2++) {
                try {
                    if (!set.contains(this.e[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.d;
        int i2 = this.g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.g <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.h == null) {
            this.h = new C0825Dj(this);
        }
        C0825Dj c0825Dj = this.h;
        if (c0825Dj.b == null) {
            c0825Dj.b = new AbstractC6155qW0.c();
        }
        return (Iterator<E>) c0825Dj.b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iD = obj == null ? d() : c(obj.hashCode(), obj);
        if (iD < 0) {
            return false;
        }
        e(iD);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.g - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.e[i2])) {
                e(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public final Object[] toArray() {
        int i2 = this.g;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.e, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.e[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0903Ej(int i2) {
        if (i2 == 0) {
            this.d = i;
            this.e = j;
        } else {
            a(i2);
        }
        this.g = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public final <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.g) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.g));
        }
        System.arraycopy(this.e, 0, tArr, 0, this.g);
        int length = tArr.length;
        int i2 = this.g;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}

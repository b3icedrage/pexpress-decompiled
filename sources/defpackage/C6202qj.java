package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lqj;", "E", "LM0;", "<init>", "()V", "h", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C6202qj<E> extends M0<E> {

    @NotNull
    public static final Object[] i = new Object[0];
    public int d;

    @NotNull
    public Object[] e = i;
    public int g;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m();
        e(elements.size() + getE());
        d(j(getE() + this.d), elements);
        return true;
    }

    public final void addFirst(E e) {
        m();
        e(this.g + 1);
        int length = this.d;
        if (length == 0) {
            Object[] objArr = this.e;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length;
        }
        int i2 = length - 1;
        this.d = i2;
        this.e[i2] = e;
        this.g++;
    }

    public final void addLast(E e) {
        m();
        e(getE() + 1);
        this.e[j(getE() + this.d)] = e;
        this.g = getE() + 1;
    }

    @Override // defpackage.M0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getE() {
        return this.g;
    }

    @Override // defpackage.M0
    public final E c(int i2) {
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.g;
        aVar.getClass();
        AbstractC5838p0.Companion.b(i2, i3);
        if (i2 == WE.e(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        m();
        int iJ = j(this.d + i2);
        Object[] objArr = this.e;
        E e = (E) objArr[iJ];
        if (i2 < (this.g >> 1)) {
            int i4 = this.d;
            if (iJ >= i4) {
                C1371Kj.d(objArr, i4 + 1, objArr, i4, iJ);
            } else {
                C1371Kj.d(objArr, 1, objArr, 0, iJ);
                Object[] objArr2 = this.e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.d;
                C1371Kj.d(objArr2, i5 + 1, objArr2, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.e;
            int i6 = this.d;
            objArr3[i6] = null;
            this.d = f(i6);
        } else {
            int iJ2 = j(WE.e(this) + this.d);
            if (iJ <= iJ2) {
                Object[] objArr4 = this.e;
                C1371Kj.d(objArr4, iJ, objArr4, iJ + 1, iJ2 + 1);
            } else {
                Object[] objArr5 = this.e;
                C1371Kj.d(objArr5, iJ, objArr5, iJ + 1, objArr5.length);
                Object[] objArr6 = this.e;
                objArr6[objArr6.length - 1] = objArr6[0];
                C1371Kj.d(objArr6, 0, objArr6, 1, iJ2 + 1);
            }
            this.e[iJ2] = null;
        }
        this.g--;
        return e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            i(this.d, j(getE() + this.d));
        }
        this.d = 0;
        this.g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i2, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.e.length;
        while (i2 < length && it.hasNext()) {
            this.e[i2] = it.next();
            i2++;
        }
        int i3 = this.d;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.e[i4] = it.next();
        }
        this.g = collection.size() + this.g;
    }

    public final void e(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.e;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == i) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.e = new Object[i2];
            return;
        }
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int length = objArr.length;
        aVar.getClass();
        Object[] objArr2 = new Object[AbstractC5838p0.Companion.e(length, i2)];
        Object[] objArr3 = this.e;
        C1371Kj.d(objArr3, 0, objArr2, this.d, objArr3.length);
        Object[] objArr4 = this.e;
        int length2 = objArr4.length;
        int i3 = this.d;
        C1371Kj.d(objArr4, length2 - i3, objArr2, 0, i3);
        this.d = 0;
        this.e = objArr2;
    }

    public final int f(int i2) {
        Object[] objArr = this.e;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i2 == objArr.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.g;
        aVar.getClass();
        AbstractC5838p0.Companion.b(i2, i3);
        return (E) this.e[j(this.d + i2)];
    }

    public final int h(int i2) {
        return i2 < 0 ? i2 + this.e.length : i2;
    }

    public final void i(int i2, int i3) {
        if (i2 < i3) {
            C1371Kj.f(this.e, null, i2, i3);
            return;
        }
        Object[] objArr = this.e;
        C1371Kj.f(objArr, null, i2, objArr.length);
        C1371Kj.f(this.e, null, 0, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iJ = j(getE() + this.d);
        int length = this.d;
        if (length < iJ) {
            while (length < iJ) {
                if (Intrinsics.a(obj, this.e[length])) {
                    i2 = this.d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iJ) {
            return -1;
        }
        int length2 = this.e.length;
        while (length < length2) {
            if (Intrinsics.a(obj, this.e[length])) {
                i2 = this.d;
            } else {
                length++;
            }
        }
        for (int i3 = 0; i3 < iJ; i3++) {
            if (Intrinsics.a(obj, this.e[i3])) {
                length = i3 + this.e.length;
                i2 = this.d;
            }
        }
        return -1;
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getE() == 0;
    }

    public final int j(int i2) {
        Object[] objArr = this.e;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iJ = j(this.g + this.d);
        int i3 = this.d;
        if (i3 < iJ) {
            length = iJ - 1;
            if (i3 <= length) {
                while (!Intrinsics.a(obj, this.e[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.d;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iJ) {
            for (int i4 = iJ - 1; -1 < i4; i4--) {
                if (Intrinsics.a(obj, this.e[i4])) {
                    length = i4 + this.e.length;
                    i2 = this.d;
                    return length - i2;
                }
            }
            Object[] objArr = this.e;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length - 1;
            int i5 = this.d;
            if (i5 <= length) {
                while (!Intrinsics.a(obj, this.e[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i2 = this.d;
                return length - i2;
            }
        }
        return -1;
    }

    public final void m() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int iJ;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iJ2 = j(getE() + this.d);
            int i2 = this.d;
            if (i2 < iJ2) {
                iJ = i2;
                while (i2 < iJ2) {
                    Object obj = this.e[i2];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.e[iJ] = obj;
                        iJ++;
                    }
                    i2++;
                }
                C1371Kj.f(this.e, null, iJ, iJ2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.e;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.e[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iJ = j(i3);
                for (int i4 = 0; i4 < iJ2; i4++) {
                    Object[] objArr2 = this.e;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.e[iJ] = obj3;
                        iJ = f(iJ);
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.g = h(iJ - this.d);
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        Object[] objArr = this.e;
        int i2 = this.d;
        E e = (E) objArr[i2];
        objArr[i2] = null;
        this.d = f(i2);
        this.g = getE() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        int iJ = j(WE.e(this) + this.d);
        Object[] objArr = this.e;
        E e = (E) objArr[iJ];
        objArr[iJ] = null;
        this.g = getE() - 1;
        return e;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i4 = this.g;
        aVar.getClass();
        AbstractC5838p0.Companion.d(i2, i3, i4);
        int i5 = i3 - i2;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.g) {
            clear();
            return;
        }
        if (i5 == 1) {
            c(i2);
            return;
        }
        m();
        if (i2 < this.g - i3) {
            int iJ = j((i2 - 1) + this.d);
            int iJ2 = j((i3 - 1) + this.d);
            while (i2 > 0) {
                int i6 = iJ + 1;
                int iMin = Math.min(i2, Math.min(i6, iJ2 + 1));
                Object[] objArr = this.e;
                int i7 = iJ2 - iMin;
                int i8 = iJ - iMin;
                C1371Kj.d(objArr, i7 + 1, objArr, i8 + 1, i6);
                iJ = h(i8);
                iJ2 = h(i7);
                i2 -= iMin;
            }
            int iJ3 = j(this.d + i5);
            i(this.d, iJ3);
            this.d = iJ3;
        } else {
            int iJ4 = j(this.d + i3);
            int iJ5 = j(this.d + i2);
            int i9 = this.g;
            while (true) {
                i9 -= i3;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.e;
                i3 = Math.min(i9, Math.min(objArr2.length - iJ4, objArr2.length - iJ5));
                Object[] objArr3 = this.e;
                int i10 = iJ4 + i3;
                C1371Kj.d(objArr3, iJ5, objArr3, iJ4, i10);
                iJ4 = j(i10);
                iJ5 = j(iJ5 + i3);
            }
            int iJ6 = j(this.g + this.d);
            i(h(iJ6 - i5), iJ6);
        }
        this.g -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        int iJ;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iJ2 = j(getE() + this.d);
            int i2 = this.d;
            if (i2 < iJ2) {
                iJ = i2;
                while (i2 < iJ2) {
                    Object obj = this.e[i2];
                    if (elements.contains(obj)) {
                        this.e[iJ] = obj;
                        iJ++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                C1371Kj.f(this.e, null, iJ, iJ2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.e;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        this.e[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                iJ = j(i3);
                for (int i4 = 0; i4 < iJ2; i4++) {
                    Object[] objArr2 = this.e;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        this.e[iJ] = obj3;
                        iJ = f(iJ);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.g = h(iJ - this.d);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i2, E e) {
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.g;
        aVar.getClass();
        AbstractC5838p0.Companion.b(i2, i3);
        int iJ = j(this.d + i2);
        Object[] objArr = this.e;
        E e2 = (E) objArr[iJ];
        objArr[iJ] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final Object[] toArray() {
        return toArray(new Object[getE()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, E e) {
        int length;
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.g;
        aVar.getClass();
        AbstractC5838p0.Companion.c(i2, i3);
        if (i2 == this.g) {
            addLast(e);
            return;
        }
        if (i2 == 0) {
            addFirst(e);
            return;
        }
        m();
        e(this.g + 1);
        int iJ = j(this.d + i2);
        int i4 = this.g;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iJ == 0) {
                Object[] objArr = this.e;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                iJ = objArr.length;
            }
            int i5 = iJ - 1;
            int i6 = this.d;
            if (i6 == 0) {
                Object[] objArr2 = this.e;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.d;
            if (i5 >= i7) {
                Object[] objArr3 = this.e;
                objArr3[length] = objArr3[i7];
                C1371Kj.d(objArr3, i7, objArr3, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.e;
                C1371Kj.d(objArr4, i7 - 1, objArr4, i7, objArr4.length);
                Object[] objArr5 = this.e;
                objArr5[objArr5.length - 1] = objArr5[0];
                C1371Kj.d(objArr5, 0, objArr5, 1, i5 + 1);
            }
            this.e[i5] = e;
            this.d = length;
        } else {
            int iJ2 = j(i4 + this.d);
            if (iJ < iJ2) {
                Object[] objArr6 = this.e;
                C1371Kj.d(objArr6, iJ + 1, objArr6, iJ, iJ2);
            } else {
                Object[] objArr7 = this.e;
                C1371Kj.d(objArr7, 1, objArr7, 0, iJ2);
                Object[] objArr8 = this.e;
                objArr8[0] = objArr8[objArr8.length - 1];
                C1371Kj.d(objArr8, iJ + 1, objArr8, iJ, objArr8.length - 1);
            }
            this.e[iJ] = e;
        }
        this.g++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final <T> T[] toArray(@NotNull T[] reference) {
        Intrinsics.checkNotNullParameter(reference, "array");
        int length = reference.length;
        int i2 = this.g;
        if (length < i2) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i2);
            Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            reference = (T[]) ((Object[]) objNewInstance);
        }
        int iJ = j(this.g + this.d);
        int i3 = this.d;
        if (i3 < iJ) {
            C1371Kj.d(this.e, 0, reference, i3, iJ);
        } else if (!isEmpty()) {
            Object[] objArr = this.e;
            C1371Kj.d(objArr, 0, reference, this.d, objArr.length);
            Object[] objArr2 = this.e;
            C1371Kj.d(objArr2, objArr2.length - this.d, reference, 0, iJ);
        }
        int i4 = this.g;
        T[] array = reference;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i4 < reference.length) {
            reference[i4] = null;
        }
        return reference;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.g;
        aVar.getClass();
        AbstractC5838p0.Companion.c(i2, i3);
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == this.g) {
            return addAll(elements);
        }
        m();
        e(elements.size() + this.g);
        int iJ = j(this.g + this.d);
        int iJ2 = j(this.d + i2);
        int size = elements.size();
        if (i2 < ((this.g + 1) >> 1)) {
            int i4 = this.d;
            int length = i4 - size;
            if (iJ2 < i4) {
                Object[] objArr = this.e;
                C1371Kj.d(objArr, length, objArr, i4, objArr.length);
                if (size >= iJ2) {
                    Object[] objArr2 = this.e;
                    C1371Kj.d(objArr2, objArr2.length - size, objArr2, 0, iJ2);
                } else {
                    Object[] objArr3 = this.e;
                    C1371Kj.d(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.e;
                    C1371Kj.d(objArr4, 0, objArr4, size, iJ2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.e;
                C1371Kj.d(objArr5, length, objArr5, i4, iJ2);
            } else {
                Object[] objArr6 = this.e;
                length += objArr6.length;
                int i5 = iJ2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    C1371Kj.d(objArr6, length, objArr6, i4, iJ2);
                } else {
                    C1371Kj.d(objArr6, length, objArr6, i4, i4 + length2);
                    Object[] objArr7 = this.e;
                    C1371Kj.d(objArr7, 0, objArr7, this.d + length2, iJ2);
                }
            }
            this.d = length;
            d(h(iJ2 - size), elements);
            return true;
        }
        int i6 = iJ2 + size;
        if (iJ2 < iJ) {
            int i7 = size + iJ;
            Object[] objArr8 = this.e;
            if (i7 <= objArr8.length) {
                C1371Kj.d(objArr8, i6, objArr8, iJ2, iJ);
            } else if (i6 >= objArr8.length) {
                C1371Kj.d(objArr8, i6 - objArr8.length, objArr8, iJ2, iJ);
            } else {
                int length3 = iJ - (i7 - objArr8.length);
                C1371Kj.d(objArr8, 0, objArr8, length3, iJ);
                Object[] objArr9 = this.e;
                C1371Kj.d(objArr9, i6, objArr9, iJ2, length3);
            }
        } else {
            Object[] objArr10 = this.e;
            C1371Kj.d(objArr10, size, objArr10, 0, iJ);
            Object[] objArr11 = this.e;
            if (i6 >= objArr11.length) {
                C1371Kj.d(objArr11, i6 - objArr11.length, objArr11, iJ2, objArr11.length);
            } else {
                C1371Kj.d(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                Object[] objArr12 = this.e;
                C1371Kj.d(objArr12, i6, objArr12, iJ2, objArr12.length - size);
            }
        }
        d(iJ2, elements);
        return true;
    }
}

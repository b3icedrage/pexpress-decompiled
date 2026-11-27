package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003\t\n\u000b¨\u0006\f"}, d2 = {"LCQ0;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "LM0;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "h", "b", "c", R51.PUSH_ADDITIONAL_DATA_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CQ0<E> extends M0<E> implements List<E>, RandomAccess, Serializable {

    @NotNull
    private static final b h = new b(null);

    @NotNull
    public static final CQ0 i;

    @NotNull
    public E[] d;
    public int e;
    public boolean g;

    public static final class a<E> extends M0<E> implements RandomAccess, Serializable {

        @NotNull
        public E[] d;
        public final int e;
        public int g;

        @Nullable
        public final a<E> h;

        @NotNull
        public final CQ0<E> i;

        /* JADX INFO: renamed from: CQ0$a$a, reason: collision with other inner class name */
        public static final class C0010a<E> implements ListIterator<E>, InterfaceC6745tJ0 {

            @NotNull
            public final a<E> d;
            public int e;
            public int g;
            public int h;

            public C0010a(@NotNull a<E> list, int i) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.d = list;
                this.e = i;
                this.g = -1;
                this.h = ((AbstractList) list).modCount;
            }

            @Override // java.util.ListIterator
            public final void add(E e) {
                b();
                int i = this.e;
                this.e = i + 1;
                a<E> aVar = this.d;
                aVar.add(i, e);
                this.g = -1;
                this.h = ((AbstractList) aVar).modCount;
            }

            public final void b() {
                if (((AbstractList) this.d.i).modCount != this.h) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.e < this.d.g;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.e > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                b();
                int i = this.e;
                a<E> aVar = this.d;
                if (i >= aVar.g) {
                    throw new NoSuchElementException();
                }
                this.e = i + 1;
                this.g = i;
                return aVar.d[aVar.e + i];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.e;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                b();
                int i = this.e;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.e = i2;
                this.g = i2;
                a<E> aVar = this.d;
                return aVar.d[aVar.e + i2];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.e - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                b();
                int i = this.g;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                a<E> aVar = this.d;
                aVar.c(i);
                this.e = this.g;
                this.g = -1;
                this.h = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e) {
                b();
                int i = this.g;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.d.set(i, e);
            }
        }

        public a(@NotNull E[] backing, int i, int i2, @Nullable a<E> aVar, @NotNull CQ0<E> root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.d = backing;
            this.e = i;
            this.g = i2;
            this.h = aVar;
            this.i = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e) {
            i();
            h();
            f(this.e + this.g, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(@NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            i();
            h();
            int size = elements.size();
            e(this.e + this.g, elements, size);
            return size > 0;
        }

        @Override // defpackage.M0
        /* JADX INFO: renamed from: b */
        public final int getE() {
            h();
            return this.g;
        }

        @Override // defpackage.M0
        public final E c(int i) {
            i();
            h();
            AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
            int i2 = this.g;
            aVar.getClass();
            AbstractC5838p0.Companion.b(i, i2);
            return j(this.e + i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            i();
            h();
            m(this.e, this.g);
        }

        public final void e(int i, Collection<? extends E> collection, int i2) {
            ((AbstractList) this).modCount++;
            CQ0<E> cq0 = this.i;
            a<E> aVar = this.h;
            if (aVar != null) {
                aVar.e(i, collection, i2);
            } else {
                CQ0 cq1 = CQ0.i;
                cq0.e(i, collection, i2);
            }
            this.d = cq0.d;
            this.g += i2;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@Nullable Object obj) {
            h();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                return C1952Ru.f(this.d, this.e, this.g, (List) obj);
            }
            return false;
        }

        public final void f(int i, E e) {
            ((AbstractList) this).modCount++;
            CQ0<E> cq0 = this.i;
            a<E> aVar = this.h;
            if (aVar != null) {
                aVar.f(i, e);
            } else {
                CQ0 cq1 = CQ0.i;
                cq0.f(i, e);
            }
            this.d = cq0.d;
            this.g++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            h();
            AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
            int i2 = this.g;
            aVar.getClass();
            AbstractC5838p0.Companion.b(i, i2);
            return this.d[this.e + i];
        }

        public final void h() {
            if (((AbstractList) this.i).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            h();
            E[] eArr = this.d;
            int i = this.g;
            int iHashCode = 1;
            for (int i2 = 0; i2 < i; i2++) {
                E e = eArr[this.e + i2];
                iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
            }
            return iHashCode;
        }

        public final void i() {
            if (this.i.g) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            h();
            for (int i = 0; i < this.g; i++) {
                if (Intrinsics.a(this.d[this.e + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            h();
            return this.g == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final E j(int i) {
            E eJ;
            ((AbstractList) this).modCount++;
            a<E> aVar = this.h;
            if (aVar != null) {
                eJ = aVar.j(i);
            } else {
                CQ0 cq0 = CQ0.i;
                eJ = this.i.j(i);
            }
            this.g--;
            return eJ;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            h();
            for (int i = this.g - 1; i >= 0; i--) {
                if (Intrinsics.a(this.d[this.e + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public final void m(int i, int i2) {
            if (i2 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.h;
            if (aVar != null) {
                aVar.m(i, i2);
            } else {
                CQ0 cq0 = CQ0.i;
                this.i.m(i, i2);
            }
            this.g -= i2;
        }

        public final int n(int i, int i2, Collection<? extends E> collection, boolean z) {
            int iN;
            a<E> aVar = this.h;
            if (aVar != null) {
                iN = aVar.n(i, i2, collection, z);
            } else {
                CQ0 cq0 = CQ0.i;
                iN = this.i.n(i, i2, collection, z);
            }
            if (iN > 0) {
                ((AbstractList) this).modCount++;
            }
            this.g -= iN;
            return iN;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            i();
            h();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                c(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            i();
            h();
            return n(this.e, this.g, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            i();
            h();
            return n(this.e, this.g, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i, E e) {
            i();
            h();
            AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
            int i2 = this.g;
            aVar.getClass();
            AbstractC5838p0.Companion.b(i, i2);
            E[] eArr = this.d;
            int i3 = this.e + i;
            E e2 = eArr[i3];
            eArr[i3] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public final List<E> subList(int i, int i2) {
            AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
            int i3 = this.g;
            aVar.getClass();
            AbstractC5838p0.Companion.d(i, i2, i3);
            return new a(this.d, this.e + i, i2 - i, this, this.i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public final <T> T[] toArray(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            h();
            int length = array.length;
            int i = this.g;
            int i2 = this.e;
            if (length < i) {
                T[] tArr = (T[]) Arrays.copyOfRange(this.d, i2, i + i2, array.getClass());
                Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
                return tArr;
            }
            C1371Kj.d(this.d, 0, array, i2, i + i2);
            int i3 = this.g;
            Intrinsics.checkNotNullParameter(array, "array");
            if (i3 < array.length) {
                array[i3] = null;
            }
            return array;
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public final String toString() {
            h();
            return C1952Ru.g(this.d, this.e, this.g, this);
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public final ListIterator<E> listIterator(int i) {
            h();
            AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
            int i2 = this.g;
            aVar.getClass();
            AbstractC5838p0.Companion.c(i, i2);
            return new C0010a(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, E e) {
            i();
            h();
            AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
            int i2 = this.g;
            aVar.getClass();
            AbstractC5838p0.Companion.c(i, i2);
            f(this.e + i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, @NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            i();
            h();
            AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
            int i2 = this.g;
            aVar.getClass();
            AbstractC5838p0.Companion.c(i, i2);
            int size = elements.size();
            e(this.e + i, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public final Object[] toArray() {
            h();
            E[] eArr = this.d;
            int i = this.g;
            int i2 = this.e;
            return C1371Kj.e(eArr, i2, i + i2);
        }
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class c<E> implements ListIterator<E>, InterfaceC6745tJ0 {

        @NotNull
        public final CQ0<E> d;
        public int e;
        public int g;
        public int h;

        public c(@NotNull CQ0<E> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.d = list;
            this.e = i;
            this.g = -1;
            this.h = ((AbstractList) list).modCount;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            b();
            int i = this.e;
            this.e = i + 1;
            CQ0<E> cq0 = this.d;
            cq0.add(i, e);
            this.g = -1;
            this.h = ((AbstractList) cq0).modCount;
        }

        public final void b() {
            if (((AbstractList) this.d).modCount != this.h) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.e < this.d.e;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.e > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            b();
            int i = this.e;
            CQ0<E> cq0 = this.d;
            if (i >= cq0.e) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.g = i;
            return cq0.d[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.e;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            b();
            int i = this.e;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.e = i2;
            this.g = i2;
            return this.d.d[i2];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.e - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            b();
            int i = this.g;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            CQ0<E> cq0 = this.d;
            cq0.c(i);
            this.e = this.g;
            this.g = -1;
            this.h = ((AbstractList) cq0).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            b();
            int i = this.g;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.d.set(i, e);
        }
    }

    static {
        CQ0 cq0 = new CQ0(0);
        cq0.g = true;
        i = cq0;
    }

    public CQ0() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        h();
        int i2 = this.e;
        ((AbstractList) this).modCount++;
        i(i2, 1);
        this.d[i2] = e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h();
        int size = elements.size();
        e(this.e, elements, size);
        return size > 0;
    }

    @Override // defpackage.M0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // defpackage.M0
    public final E c(int i2) {
        h();
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.e;
        aVar.getClass();
        AbstractC5838p0.Companion.b(i2, i3);
        return j(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        m(0, this.e);
    }

    public final void e(int i2, Collection<? extends E> collection, int i3) {
        ((AbstractList) this).modCount++;
        i(i2, i3);
        Iterator<? extends E> it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.d[i2 + i4] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (C1952Ru.f(this.d, 0, this.e, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i2, E e) {
        ((AbstractList) this).modCount++;
        i(i2, 1);
        this.d[i2] = e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.e;
        aVar.getClass();
        AbstractC5838p0.Companion.b(i2, i3);
        return this.d[i2];
    }

    public final void h() {
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.d;
        int i2 = this.e;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            E e = eArr[i3];
            iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i2, int i3) {
        int i4 = this.e + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.d;
        if (i4 > eArr.length) {
            AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
            int length = eArr.length;
            aVar.getClass();
            int iE = AbstractC5838p0.Companion.e(length, i4);
            E[] eArr2 = this.d;
            Intrinsics.checkNotNullParameter(eArr2, "<this>");
            E[] eArr3 = (E[]) Arrays.copyOf(eArr2, iE);
            Intrinsics.checkNotNullExpressionValue(eArr3, "copyOf(...)");
            this.d = eArr3;
        }
        E[] eArr4 = this.d;
        C1371Kj.d(eArr4, i2 + i3, eArr4, i2, this.e);
        this.e += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.e; i2++) {
            if (Intrinsics.a(this.d[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final E j(int i2) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.d;
        E e = eArr[i2];
        C1371Kj.d(eArr, i2, eArr, i2 + 1, this.e);
        E[] eArr2 = this.d;
        int i3 = this.e - 1;
        Intrinsics.checkNotNullParameter(eArr2, "<this>");
        eArr2[i3] = null;
        this.e--;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.e - 1; i2 >= 0; i2--) {
            if (Intrinsics.a(this.d[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final void m(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.d;
        C1371Kj.d(eArr, i2, eArr, i2 + i3, this.e);
        E[] eArr2 = this.d;
        int i4 = this.e;
        C1952Ru.o(eArr2, i4 - i3, i4);
        this.e -= i3;
    }

    public final int n(int i2, int i3, Collection<? extends E> collection, boolean z) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.d[i6]) == z) {
                E[] eArr = this.d;
                i4++;
                eArr[i5 + i2] = eArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        E[] eArr2 = this.d;
        C1371Kj.d(eArr2, i2 + i5, eArr2, i3 + i2, this.e);
        E[] eArr3 = this.d;
        int i8 = this.e;
        C1952Ru.o(eArr3, i8 - i7, i8);
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.e -= i7;
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h();
        return n(0, this.e, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h();
        return n(0, this.e, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i2, E e) {
        h();
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.e;
        aVar.getClass();
        AbstractC5838p0.Companion.b(i2, i3);
        E[] eArr = this.d;
        E e2 = eArr[i2];
        eArr[i2] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final List<E> subList(int i2, int i3) {
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i4 = this.e;
        aVar.getClass();
        AbstractC5838p0.Companion.d(i2, i3, i4);
        return new a(this.d, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i2 = this.e;
        if (length < i2) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.d, 0, i2, array.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }
        C1371Kj.d(this.d, 0, array, 0, i2);
        int i3 = this.e;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public final String toString() {
        return C1952Ru.g(this.d, 0, this.e, this);
    }

    public /* synthetic */ CQ0(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i2);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator(int i2) {
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.e;
        aVar.getClass();
        AbstractC5838p0.Companion.c(i2, i3);
        return new c(this, i2);
    }

    public CQ0(int i2) {
        if (i2 >= 0) {
            this.d = (E[]) new Object[i2];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        h();
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.e;
        aVar.getClass();
        AbstractC5838p0.Companion.c(i2, i3);
        int size = elements.size();
        e(i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, E e) {
        h();
        AbstractC5838p0.Companion aVar = AbstractC5838p0.INSTANCE;
        int i3 = this.e;
        aVar.getClass();
        AbstractC5838p0.Companion.c(i2, i3);
        ((AbstractList) this).modCount++;
        i(i2, 1);
        this.d[i2] = e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final Object[] toArray() {
        return C1371Kj.e(this.d, 0, this.e);
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: j82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4610j82 implements Collection<C4352i82>, InterfaceC6745tJ0 {

    @NotNull
    public final short[] d;

    /* JADX INFO: renamed from: j82$a */
    public static final class a implements Iterator<C4352i82>, InterfaceC6745tJ0 {

        @NotNull
        public final short[] d;
        public int e;

        public a(@NotNull short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.d = array;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e < this.d.length;
        }

        @Override // java.util.Iterator
        public final C4352i82 next() {
            int i = this.e;
            short[] sArr = this.d;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.e));
            }
            this.e = i + 1;
            return new C4352i82(sArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C4352i82 c4352i82) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C4352i82> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C4352i82)) {
            return false;
        }
        return C1526Mj.n(this.d, ((C4352i82) obj).d);
    }

    @Override // java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof C4352i82) {
                if (C1526Mj.n(this.d, ((C4352i82) obj).d)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C4610j82) {
            return Intrinsics.a(this.d, ((C4610j82) obj).d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<C4352i82> iterator() {
        return new a(this.d);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C4466ii.F(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.d) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) C4466ii.G(this, array);
    }
}

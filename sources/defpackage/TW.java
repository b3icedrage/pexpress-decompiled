package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TW<From, To> implements Set<To>, DJ0 {

    @NotNull
    public final Set<From> d;

    @NotNull
    public final ML0 e;

    @NotNull
    public final ML0 g;
    public final int h;

    public static final class a implements Iterator<To>, InterfaceC6745tJ0 {

        @NotNull
        public final Iterator<From> d;
        public final /* synthetic */ TW<From, To> e;

        public a(TW<From, To> tw) {
            this.e = tw;
            this.d = tw.d.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ML0, kotlin.jvm.functions.Function1] */
        @Override // java.util.Iterator
        public final To next() {
            return (To) this.e.e.invoke(this.d.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.d.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TW(@NotNull Set<From> delegate, @NotNull Function1<? super From, ? extends To> convertTo, @NotNull Function1<? super To, ? extends From> convert) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(convertTo, "convertTo");
        Intrinsics.checkNotNullParameter(convert, "convert");
        this.d = delegate;
        this.e = (ML0) convertTo;
        this.g = (ML0) convert;
        this.h = delegate.size();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(To to) {
        return this.d.add((From) this.g.invoke(to));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(@NotNull Collection<? extends To> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.d.addAll(b(elements));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ML0, kotlin.jvm.functions.Function1] */
    @NotNull
    public final ArrayList b(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(XE.m(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.g.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ML0, kotlin.jvm.functions.Function1] */
    @NotNull
    public final ArrayList c(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(XE.m(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.e.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.contains(this.g.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.d.containsAll(b(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListC = c(this.d);
        return ((Set) obj).containsAll(arrayListC) && arrayListC.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<To> iterator() {
        return new a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.remove(this.g.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.d.removeAll(b(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.d.retainAll(b(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.h;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C4466ii.F(this);
    }

    @NotNull
    public final String toString() {
        return c(this.d).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) C4466ii.G(this, array);
    }
}

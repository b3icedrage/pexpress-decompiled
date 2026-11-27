package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: du1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3460du1<T> extends AbstractC5838p0<T> {

    @NotNull
    public final List<T> e;

    /* JADX INFO: renamed from: du1$a */
    public static final class a implements ListIterator<T>, InterfaceC6745tJ0 {
        public final ListIterator<T> d;
        public final /* synthetic */ C3460du1<T> e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(C3460du1<? extends T> c3460du1, int i) {
            this.e = c3460du1;
            this.d = c3460du1.e.listIterator(C3113cF.u(i, c3460du1));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.d.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.d.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return WE.e(this.e) - this.d.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.d.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return WE.e(this.e) - this.d.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3460du1(@NotNull List<? extends T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    @Override // defpackage.Y
    public final int b() {
        return this.e.size();
    }

    @Override // java.util.List
    public final T get(int i) {
        return this.e.get(C3113cF.t(i, this));
    }

    @Override // defpackage.AbstractC5838p0, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // defpackage.AbstractC5838p0, java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // defpackage.AbstractC5838p0, java.util.List
    @NotNull
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}

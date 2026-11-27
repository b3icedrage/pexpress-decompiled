package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3251cu1<T> extends M0<T> {

    @NotNull
    public final ArrayList d;

    /* JADX INFO: renamed from: cu1$a */
    public static final class a implements ListIterator<T>, InterfaceC6745tJ0 {
        public final ListIterator<T> d;
        public final /* synthetic */ C3251cu1<T> e;

        public a(C3251cu1<T> c3251cu1, int i) {
            this.e = c3251cu1;
            this.d = c3251cu1.d.listIterator(C3113cF.u(i, c3251cu1));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            ListIterator<T> listIterator = this.d;
            listIterator.add(t);
            listIterator.previous();
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
            this.d.remove();
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.d.set(t);
        }
    }

    public C3251cu1(@NotNull ArrayList delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.d.add(C3113cF.u(i, this), t);
    }

    @Override // defpackage.M0
    /* JADX INFO: renamed from: b */
    public final int getE() {
        return this.d.size();
    }

    @Override // defpackage.M0
    public final T c(int i) {
        return (T) this.d.remove(C3113cF.t(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.d.get(C3113cF.t(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return (T) this.d.set(C3113cF.t(i, this), t);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}

package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class Y82 extends AbstractList<String> implements InterfaceC3563eP0, RandomAccess {
    public final C3354dP0 d;

    public class a implements ListIterator<String> {
        public ListIterator<String> d;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.d.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.d.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.d.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.d.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.d.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {
        public Iterator<String> d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.d.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Y82(C3354dP0 c3354dP0) {
        this.d = c3354dP0;
    }

    @Override // defpackage.InterfaceC3563eP0
    public final void L0(AbstractC1646Nw abstractC1646Nw) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC3563eP0
    public final List<?> g() {
        return Collections.unmodifiableList(this.d.e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.d.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        b bVar = new b();
        bVar.d = this.d.iterator();
        return bVar;
    }

    @Override // defpackage.InterfaceC3563eP0
    public final Object k1(int i) {
        return this.d.e.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        a aVar = new a();
        aVar.d = this.d.listIterator(i);
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.InterfaceC3563eP0
    public final InterfaceC3563eP0 t() {
        return this;
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3049bx<E> implements List<E> {
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<E> e = new CopyOnWriteArrayList<>();
    public E[] g;
    public final E[] h;

    public C3049bx(E[] eArr) {
        this.h = eArr;
    }

    public final void a() {
        this.d.set(false);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e) {
        boolean zAdd = this.e.add(e);
        a();
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        boolean zAddAll = this.e.addAll(collection);
        a();
        return zAddAll;
    }

    public final void b() {
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.get()) {
            return;
        }
        this.g = (E[]) this.e.toArray(this.h);
        atomicBoolean.set(true);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.e.clear();
        a();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.e.containsAll(collection);
    }

    @Override // java.util.List
    public final E get(int i) {
        b();
        return this.g[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.e.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.e.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.e.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.e.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove = this.e.remove(obj);
        a();
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = this.e.removeAll(collection);
        a();
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = this.e.retainAll(collection);
        a();
        return zRetainAll;
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        E e2 = this.e.set(i, e);
        a();
        return e2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.e.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        return this.e.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        b();
        return this.g;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return this.e.listIterator(i);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        this.e.add(i, e);
        a();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        boolean zAddAll = this.e.addAll(i, collection);
        a();
        return zAddAll;
    }

    @Override // java.util.List
    public final E remove(int i) {
        E eRemove = this.e.remove(i);
        a();
        return eRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        b();
        return this.g;
    }
}

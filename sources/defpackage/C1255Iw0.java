package defpackage;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Iw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1255Iw0<E> implements List<E>, RandomAccess {
    public final List<E> d;

    public C1255Iw0(List<E> list) {
        this.d = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(@NonNull E e) {
        return this.d.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.d.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NonNull Collection<?> collection) {
        return this.d.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.d.equals(obj);
    }

    @Override // java.util.List
    @NonNull
    public final E get(int i) {
        return this.d.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NonNull
    public final Iterator<E> iterator() {
        return this.d.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.d.lastIndexOf(obj);
    }

    @Override // java.util.List
    @NonNull
    public final ListIterator<E> listIterator() {
        return this.d.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@NonNull Collection<?> collection) {
        return this.d.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@NonNull Collection<?> collection) {
        return this.d.retainAll(collection);
    }

    @Override // java.util.List
    @NonNull
    public final E set(int i, @NonNull E e) {
        return this.d.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.List
    @NonNull
    public final List<E> subList(int i, int i2) {
        return this.d.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.d.toArray();
    }

    @Override // java.util.List
    public final void add(int i, @NonNull E e) {
        this.d.add(i, e);
    }

    @Override // java.util.List
    public final boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.d.addAll(i, collection);
    }

    @Override // java.util.List
    @NonNull
    public final ListIterator<E> listIterator(int i) {
        return this.d.listIterator(i);
    }

    @Override // java.util.List
    public final E remove(int i) {
        return this.d.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.d.toArray(tArr);
    }
}

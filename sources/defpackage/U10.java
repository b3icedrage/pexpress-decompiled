package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class U10<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    public class a implements Iterator<E> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(@NotNull E e) {
        return false;
    }

    @Override // java.util.Queue
    @Nullable
    public final E element() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public final boolean offer(@NotNull E e) {
        return false;
    }

    @Override // java.util.Queue
    @Nullable
    public final E peek() {
        return null;
    }

    @Override // java.util.Queue
    @Nullable
    public final E poll() {
        return null;
    }

    @Override // java.util.Queue
    @NotNull
    public final E remove() {
        throw new NoSuchElementException("queue is disabled");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }
}

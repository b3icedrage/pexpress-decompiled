package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: io.sentry.cache.tape.a$a, reason: collision with other inner class name */
    public static final class C0392a<T> implements Iterator<T> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }
    }

    @Override // io.sentry.cache.tape.c
    public final void c(T t) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return new C0392a();
    }

    @Override // io.sentry.cache.tape.c
    public final void q(int i) {
    }

    @Override // io.sentry.cache.tape.c
    public final int size() {
        return 0;
    }
}

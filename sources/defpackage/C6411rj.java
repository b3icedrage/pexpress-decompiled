package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6411rj<T> implements Iterator<T>, InterfaceC6745tJ0 {

    @NotNull
    public final T[] d;
    public int e;

    public C6411rj(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.d = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.d;
            int i = this.e;
            this.e = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

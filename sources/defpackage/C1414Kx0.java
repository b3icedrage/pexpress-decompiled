package defpackage;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Kx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1414Kx0<T> implements Iterator<IndexedValue<? extends T>>, InterfaceC6745tJ0 {

    @NotNull
    public final Iterator<T> d;
    public int e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1414Kx0(@NotNull Iterator<? extends T> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.d = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        this.e = i + 1;
        if (i >= 0) {
            return new IndexedValue(i, this.d.next());
        }
        WE.l();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class C42<T, R> implements Sequence<R> {

    @NotNull
    public final Sequence<T> a;

    @NotNull
    public final Function1<T, R> b;

    public static final class a implements Iterator<R>, InterfaceC6745tJ0 {
        public final Iterator<T> d;
        public final /* synthetic */ C42<T, R> e;

        public a(C42<T, R> c42) {
            this.e = c42;
            this.d = c42.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.e.b.invoke(this.d.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C42(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.a = sequence;
        this.b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<R> iterator() {
        return new a(this);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ue0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2139Ue0<T, R, E> implements Sequence<E> {

    @NotNull
    public final Sequence<T> a;

    @NotNull
    public final Function1<T, R> b;

    @NotNull
    public final Function1<R, Iterator<E>> c;

    /* JADX INFO: renamed from: Ue0$a */
    public static final class a implements Iterator<E>, InterfaceC6745tJ0 {
        public final Iterator<T> d;
        public Iterator<? extends E> e;
        public int g;
        public final /* synthetic */ C2139Ue0<T, R, E> h;

        public a(C2139Ue0<T, R, E> c2139Ue0) {
            this.h = c2139Ue0;
            this.d = c2139Ue0.a.iterator();
        }

        public final boolean b() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.e;
            if (it2 != null && it2.hasNext()) {
                this.g = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.d;
                if (!it3.hasNext()) {
                    this.g = 2;
                    this.e = null;
                    return false;
                }
                T next = it3.next();
                C2139Ue0<T, R, E> c2139Ue0 = this.h;
                it = (Iterator) c2139Ue0.c.invoke(c2139Ue0.b.invoke(next));
            } while (!it.hasNext());
            this.e = it;
            this.g = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.g;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.g;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !b()) {
                throw new NoSuchElementException();
            }
            this.g = 0;
            Iterator<? extends E> it = this.e;
            Intrinsics.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2139Ue0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.a = sequence;
        this.b = transformer;
        this.c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<E> iterator() {
        return new a(this);
    }
}

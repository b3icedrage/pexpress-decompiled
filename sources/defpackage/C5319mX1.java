package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5319mX1<T> implements Sequence<T> {

    @NotNull
    public final Sequence<T> a;

    /* JADX INFO: renamed from: mX1$a */
    public static final class a implements Iterator<T>, InterfaceC6745tJ0 {
        public final Iterator<T> d;
        public int e = -1;
        public T g;
        public final /* synthetic */ C5319mX1<T> h;

        public a(C5319mX1<T> c5319mX1) {
            this.h = c5319mX1;
            this.d = c5319mX1.a.iterator();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            Iterator<T> it = this.d;
            if (it.hasNext()) {
                T next = it.next();
                this.h.getClass();
                InterfaceC4675jU it2 = (InterfaceC4675jU) next;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof InterfaceC1335Jx) {
                    this.e = 1;
                    this.g = next;
                    return;
                }
            }
            this.e = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.e == -1) {
                b();
            }
            return this.e == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.e == -1) {
                b();
            }
            if (this.e == 0) {
                throw new NoSuchElementException();
            }
            T t = this.g;
            this.g = null;
            this.e = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5319mX1(@NotNull Sequence sequence) {
        C2515Yp1 predicate = C2515Yp1.g;
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.a = sequence;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7439wd0<T> implements Sequence<T> {

    @NotNull
    public final Sequence<T> a;
    public final boolean b;

    @NotNull
    public final Function1<T, Boolean> c;

    /* JADX INFO: renamed from: wd0$a */
    public static final class a implements Iterator<T>, InterfaceC6745tJ0 {
        public final Iterator<T> d;
        public int e = -1;
        public T g;
        public final /* synthetic */ C7439wd0<T> h;

        public a(C7439wd0<T> c7439wd0) {
            this.h = c7439wd0;
            this.d = c7439wd0.a.iterator();
        }

        public final void b() {
            T next;
            C7439wd0<T> c7439wd0;
            do {
                Iterator<T> it = this.d;
                if (!it.hasNext()) {
                    this.e = 0;
                    return;
                } else {
                    next = it.next();
                    c7439wd0 = this.h;
                }
            } while (c7439wd0.c.invoke(next).booleanValue() != c7439wd0.b);
            this.g = next;
            this.e = 1;
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

    /* JADX WARN: Multi-variable type inference failed */
    public C7439wd0(@NotNull Sequence<? extends T> sequence, boolean z, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.a = sequence;
        this.b = z;
        this.c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

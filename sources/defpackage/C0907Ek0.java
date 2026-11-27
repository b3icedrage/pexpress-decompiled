package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ek0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0907Ek0<T> implements Sequence<T> {

    @NotNull
    public final Function0<T> a;

    @NotNull
    public final Function1<T, T> b;

    /* JADX INFO: renamed from: Ek0$a */
    public static final class a implements Iterator<T>, InterfaceC6745tJ0 {
        public T d;
        public int e = -2;
        public final /* synthetic */ C0907Ek0<T> g;

        public a(C0907Ek0<T> c0907Ek0) {
            this.g = c0907Ek0;
        }

        public final void b() {
            T tInvoke;
            int i = this.e;
            C0907Ek0<T> c0907Ek0 = this.g;
            if (i == -2) {
                tInvoke = c0907Ek0.a.invoke();
            } else {
                Function1<T, T> function1 = c0907Ek0.b;
                T t = this.d;
                Intrinsics.checkNotNull(t);
                tInvoke = function1.invoke(t);
            }
            this.d = tInvoke;
            this.e = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.e < 0) {
                b();
            }
            return this.e == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.e < 0) {
                b();
            }
            if (this.e == 0) {
                throw new NoSuchElementException();
            }
            T t = this.d;
            Intrinsics.c(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.e = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0907Ek0(@NotNull Function0<? extends T> getInitialValue, @NotNull Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.a = getInitialValue;
        this.b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: a40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2642a40<T> implements Sequence<T>, InterfaceC3494e40<T> {

    @NotNull
    public final Sequence<T> a;
    public final int b;

    /* JADX INFO: renamed from: a40$a */
    public static final class a implements Iterator<T>, InterfaceC6745tJ0 {
        public final Iterator<T> d;
        public int e;

        public a(C2642a40<T> c2642a40) {
            this.d = c2642a40.a.iterator();
            this.e = c2642a40.b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i = this.e;
                it = this.d;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.e--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i = this.e;
                it = this.d;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.e--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2642a40(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + JwtParser.SEPARATOR_CHAR).toString());
    }

    @Override // defpackage.InterfaceC3494e40
    @NotNull
    public final Sequence<T> a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new C2642a40(this, i) : new C2642a40(this.a, i2);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

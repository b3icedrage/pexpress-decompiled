package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: w91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7345w91<T> extends AbstractC7882yj<T> {

    @NotNull
    public final AbstractC5022l62 d;
    public final int e;

    /* JADX INFO: renamed from: w91$a */
    public static final class a implements Iterator<T>, InterfaceC6745tJ0 {
        public boolean d = true;
        public final /* synthetic */ C7345w91<T> e;

        public a(C7345w91<T> c7345w91) {
            this.e = c7345w91;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.d) {
                throw new NoSuchElementException();
            }
            this.d = false;
            return (T) this.e.d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7345w91(int i, @NotNull AbstractC5022l62 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d = value;
        this.e = i;
    }

    @Override // defpackage.AbstractC7882yj
    public final int b() {
        return 1;
    }

    @Override // defpackage.AbstractC7882yj
    public final void c(int i, @NotNull AbstractC5022l62 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // defpackage.AbstractC7882yj
    @Nullable
    public final T get(int i) {
        if (i == this.e) {
            return (T) this.d;
        }
        return null;
    }

    @Override // defpackage.AbstractC7882yj, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}

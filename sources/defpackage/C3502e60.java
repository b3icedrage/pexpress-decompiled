package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3502e60 extends AbstractC7882yj {

    @NotNull
    public static final C3502e60 d = new C3502e60();

    /* JADX INFO: renamed from: e60$a */
    public static final class a implements Iterator, InterfaceC6745tJ0 {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // defpackage.AbstractC7882yj
    public final int b() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7882yj
    public final void c(int i, AbstractC5022l62 abstractC5022l62) {
        Void value = (Void) abstractC5022l62;
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // defpackage.AbstractC7882yj
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return null;
    }

    @Override // defpackage.AbstractC7882yj, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return new a();
    }
}

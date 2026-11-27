package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5507nQ0 implements Sequence<String> {

    @NotNull
    public final BufferedReader a;

    /* JADX INFO: renamed from: nQ0$a */
    public static final class a implements Iterator<String>, InterfaceC6745tJ0 {
        public String d;
        public boolean e;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            if (this.d == null && !this.e) {
                String line = C5507nQ0.this.a.readLine();
                this.d = line;
                if (line == null) {
                    this.e = true;
                }
            }
            return this.d != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.d;
            this.d = null;
            Intrinsics.checkNotNull(str);
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5507nQ0(@NotNull BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.a = reader;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<String> iterator() {
        return new a();
    }
}

package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class IA0 implements UN1 {

    @NotNull
    public final InputStream d;

    @NotNull
    public final LZ1 e;

    public IA0(@NotNull InputStream input, @NotNull LZ1 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.d = input;
        this.e = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.UN1
    @NotNull
    public final LZ1 o() {
        return this.e;
    }

    @Override // defpackage.UN1
    public final long s0(@NotNull C1481Lu sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("byteCount < 0: ", j).toString());
        }
        try {
            this.e.f();
            C7782yE1 c7782yE1V0 = sink.V0(1);
            int i = this.d.read(c7782yE1V0.a, c7782yE1V0.c, (int) Math.min(j, 8192 - c7782yE1V0.c));
            if (i != -1) {
                c7782yE1V0.c += i;
                long j2 = i;
                sink.e += j2;
                return j2;
            }
            if (c7782yE1V0.b != c7782yE1V0.c) {
                return -1L;
            }
            sink.d = c7782yE1V0.a();
            AE1.a(c7782yE1V0);
            return -1L;
        } catch (AssertionError e) {
            if (Cm2.i(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @NotNull
    public final String toString() {
        return "source(" + this.d + ')';
    }
}

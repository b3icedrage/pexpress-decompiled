package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ia1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1190Ia1 implements KM1 {

    @NotNull
    public final OutputStream d;

    @NotNull
    public final LZ1 e;

    public C1190Ia1(@NotNull OutputStream out, @NotNull LZ1 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.d = out;
        this.e = timeout;
    }

    @Override // defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.KM1, java.io.Flushable
    public final void flush() throws IOException {
        this.d.flush();
    }

    @Override // defpackage.KM1
    public final void i1(@NotNull C1481Lu source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        C5417n.b(source.e, 0L, j);
        while (j > 0) {
            this.e.f();
            C7782yE1 c7782yE1 = source.d;
            Intrinsics.checkNotNull(c7782yE1);
            int iMin = (int) Math.min(j, c7782yE1.c - c7782yE1.b);
            this.d.write(c7782yE1.a, c7782yE1.b, iMin);
            int i = c7782yE1.b + iMin;
            c7782yE1.b = i;
            long j2 = iMin;
            j -= j2;
            source.e -= j2;
            if (i == c7782yE1.c) {
                source.d = c7782yE1.a();
                AE1.a(c7782yE1);
            }
        }
    }

    @Override // defpackage.KM1
    @NotNull
    public final LZ1 o() {
        return this.e;
    }

    @NotNull
    public final String toString() {
        return "sink(" + this.d + ')';
    }
}

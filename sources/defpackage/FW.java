package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FW implements KM1 {

    @NotNull
    public final C2814ao1 d;

    @NotNull
    public final Deflater e;
    public boolean g;

    public FW(@NotNull C1481Lu sink, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        C2814ao1 sink2 = Cm2.c(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.d = sink2;
        this.e = deflater;
    }

    public final void c(boolean z) throws IOException {
        C7782yE1 c7782yE1V0;
        int iDeflate;
        C2814ao1 c2814ao1 = this.d;
        C1481Lu c1481Lu = c2814ao1.e;
        while (true) {
            c7782yE1V0 = c1481Lu.V0(1);
            Deflater deflater = this.e;
            byte[] bArr = c7782yE1V0.a;
            if (z) {
                try {
                    int i = c7782yE1V0.c;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = c7782yE1V0.c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                c7782yE1V0.c += iDeflate;
                c1481Lu.e += (long) iDeflate;
                c2814ao1.c();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c7782yE1V0.b == c7782yE1V0.c) {
            c1481Lu.d = c7782yE1V0.a();
            AE1.a(c7782yE1V0);
        }
    }

    @Override // defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.e;
        if (this.g) {
            return;
        }
        deflater.finish();
        c(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.d.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.g = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.KM1, java.io.Flushable
    public final void flush() throws IOException {
        c(true);
        this.d.flush();
    }

    @Override // defpackage.KM1
    public final void i1(@NotNull C1481Lu source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        C5417n.b(source.e, 0L, j);
        while (j > 0) {
            C7782yE1 c7782yE1 = source.d;
            Intrinsics.checkNotNull(c7782yE1);
            int iMin = (int) Math.min(j, c7782yE1.c - c7782yE1.b);
            this.e.setInput(c7782yE1.a, c7782yE1.b, iMin);
            c(false);
            long j2 = iMin;
            source.e -= j2;
            int i = c7782yE1.b + iMin;
            c7782yE1.b = i;
            if (i == c7782yE1.c) {
                source.d = c7782yE1.a();
                AE1.a(c7782yE1);
            }
            j -= j2;
        }
    }

    @Override // defpackage.KM1
    @NotNull
    public final LZ1 o() {
        return this.d.d.o();
    }

    @NotNull
    public final String toString() {
        return "DeflaterSink(" + this.d + ')';
    }
}

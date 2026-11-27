package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Iz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264Iz0 implements UN1 {

    @NotNull
    public final C3024bo1 d;

    @NotNull
    public final Inflater e;
    public int g;
    public boolean h;

    public C1264Iz0(@NotNull C3024bo1 source, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.d = source;
        this.e = inflater;
    }

    public final long c(@NotNull C1481Lu sink, long j) {
        Inflater inflater = this.e;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("byteCount < 0: ", j).toString());
        }
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                C7782yE1 c7782yE1V0 = sink.V0(1);
                int iMin = (int) Math.min(j, 8192 - c7782yE1V0.c);
                boolean zNeedsInput = inflater.needsInput();
                C3024bo1 c3024bo1 = this.d;
                if (zNeedsInput && !c3024bo1.c()) {
                    C7782yE1 c7782yE1 = c3024bo1.e.d;
                    Intrinsics.checkNotNull(c7782yE1);
                    int i = c7782yE1.c;
                    int i2 = c7782yE1.b;
                    int i3 = i - i2;
                    this.g = i3;
                    inflater.setInput(c7782yE1.a, i2, i3);
                }
                int iInflate = inflater.inflate(c7782yE1V0.a, c7782yE1V0.c, iMin);
                int i4 = this.g;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.g -= remaining;
                    c3024bo1.r(remaining);
                }
                if (iInflate > 0) {
                    c7782yE1V0.c += iInflate;
                    long j2 = iInflate;
                    sink.e += j2;
                    return j2;
                }
                if (c7782yE1V0.b == c7782yE1V0.c) {
                    sink.d = c7782yE1V0.a();
                    AE1.a(c7782yE1V0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h) {
            return;
        }
        this.e.end();
        this.h = true;
        this.d.close();
    }

    @Override // defpackage.UN1
    @NotNull
    public final LZ1 o() {
        return this.d.d.o();
    }

    @Override // defpackage.UN1
    public final long s0(@NotNull C1481Lu sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jC = c(sink, j);
            if (jC > 0) {
                return jC;
            }
            Inflater inflater = this.e;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.d.c());
        throw new EOFException("source exhausted prematurely");
    }
}

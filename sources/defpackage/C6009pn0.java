package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6009pn0 implements UN1 {
    public byte d;

    @NotNull
    public final C3024bo1 e;

    @NotNull
    public final Inflater g;

    @NotNull
    public final C1264Iz0 h;

    @NotNull
    public final CRC32 i;

    public C6009pn0(@NotNull UN1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        C3024bo1 c3024bo1 = new C3024bo1(source);
        this.e = c3024bo1;
        Inflater inflater = new Inflater(true);
        this.g = inflater;
        this.h = new C1264Iz0(c3024bo1, inflater);
        this.i = new CRC32();
    }

    public static void c(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        throw new IOException(str2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.close();
    }

    public final void f(C1481Lu c1481Lu, long j, long j2) {
        C7782yE1 c7782yE1 = c1481Lu.d;
        Intrinsics.checkNotNull(c7782yE1);
        while (true) {
            int i = c7782yE1.c;
            int i2 = c7782yE1.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c7782yE1 = c7782yE1.f;
            Intrinsics.checkNotNull(c7782yE1);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c7782yE1.b) + j);
            int iMin = (int) Math.min(c7782yE1.c - i3, j2);
            this.i.update(c7782yE1.a, i3, iMin);
            j2 -= (long) iMin;
            c7782yE1 = c7782yE1.f;
            Intrinsics.checkNotNull(c7782yE1);
            j = 0;
        }
    }

    @Override // defpackage.UN1
    @NotNull
    public final LZ1 o() {
        return this.e.d.o();
    }

    @Override // defpackage.UN1
    public final long s0(@NotNull C1481Lu sink, long j) throws IOException {
        long j2;
        C1481Lu c1481Lu;
        long j3;
        C6009pn0 c6009pn0 = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = c6009pn0.d;
        CRC32 crc32 = c6009pn0.i;
        C3024bo1 c3024bo1 = c6009pn0.e;
        if (b == 0) {
            c3024bo1.C(10L);
            C1481Lu c1481Lu2 = c3024bo1.e;
            byte bV = c1481Lu2.v(3L);
            boolean z = ((bV >> 1) & 1) == 1;
            if (z) {
                c1481Lu = c1481Lu2;
                c6009pn0.f(c3024bo1.e, 0L, 10L);
            } else {
                c1481Lu = c1481Lu2;
            }
            c(8075, c3024bo1.v(), "ID1ID2");
            c3024bo1.r(8L);
            if (((bV >> 2) & 1) == 1) {
                c3024bo1.C(2L);
                if (z) {
                    j2 = -1;
                    j3 = 2;
                    f(c3024bo1.e, 0L, 2L);
                } else {
                    j3 = 2;
                    j2 = -1;
                }
                short sL0 = c1481Lu.L0();
                C1481Lu.b bVar = C5417n.a;
                long j4 = ((short) (((sL0 & 255) << 8) | ((sL0 & 65280) >>> 8))) & 65535;
                c3024bo1.C(j4);
                if (z) {
                    f(c3024bo1.e, 0L, j4);
                }
                c3024bo1.r(j4);
            } else {
                j3 = 2;
                j2 = -1;
            }
            if (((bV >> 3) & 1) == 1) {
                long jF = c3024bo1.f((byte) 0, 0L, Long.MAX_VALUE);
                if (jF == j2) {
                    throw new EOFException();
                }
                if (z) {
                    f(c3024bo1.e, 0L, jF + 1);
                }
                c3024bo1.r(jF + 1);
            }
            if (((bV >> 4) & 1) == 1) {
                long jF2 = c3024bo1.f((byte) 0, 0L, Long.MAX_VALUE);
                if (jF2 == j2) {
                    throw new EOFException();
                }
                if (z) {
                    c6009pn0 = this;
                    c6009pn0.f(c3024bo1.e, 0L, jF2 + 1);
                } else {
                    c6009pn0 = this;
                }
                c3024bo1.r(jF2 + 1);
            } else {
                c6009pn0 = this;
            }
            if (z) {
                c3024bo1.C(j3);
                short sL1 = c1481Lu.L0();
                C1481Lu.b bVar2 = C5417n.a;
                c((short) (((sL1 & 255) << 8) | ((sL1 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c6009pn0.d = (byte) 1;
        } else {
            j2 = -1;
        }
        if (c6009pn0.d == 1) {
            long j5 = sink.e;
            long jS0 = c6009pn0.h.s0(sink, j);
            if (jS0 != j2) {
                c6009pn0.f(sink, j5, jS0);
                return jS0;
            }
            c6009pn0.d = (byte) 2;
        }
        if (c6009pn0.d == 2) {
            c(c3024bo1.u(), (int) crc32.getValue(), "CRC");
            c(c3024bo1.u(), (int) c6009pn0.g.getBytesWritten(), "ISIZE");
            c6009pn0.d = (byte) 3;
            if (!c3024bo1.c()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return j2;
    }
}

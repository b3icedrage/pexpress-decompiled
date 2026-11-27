package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3024bo1 implements InterfaceC2833av {

    @NotNull
    public final UN1 d;

    @NotNull
    public final C1481Lu e;
    public boolean g;

    public C3024bo1(@NotNull UN1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.d = source;
        this.e = new C1481Lu();
    }

    @NotNull
    public final String A(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("limit < 0: ", j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jF = f((byte) 10, 0L, j2);
        C1481Lu c1481Lu = this.e;
        if (jF != -1) {
            return C3267d.b(c1481Lu, jF);
        }
        if (j2 < Long.MAX_VALUE && s(j2) && c1481Lu.v(j2 - 1) == 13 && s(j2 + 1) && c1481Lu.v(j2) == 10) {
            return C3267d.b(c1481Lu, j2);
        }
        C1481Lu c1481Lu2 = new C1481Lu();
        c1481Lu.p(c1481Lu2, 0L, Math.min(32, c1481Lu.e));
        throw new EOFException("\\n not found: limit=" + Math.min(c1481Lu.e, j) + " content=" + c1481Lu2.X(c1481Lu2.e).i() + (char) 8230);
    }

    public final void C(long j) throws EOFException {
        if (!s(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.InterfaceC2833av
    @NotNull
    public final String C0(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        UN1 un1 = this.d;
        C1481Lu c1481Lu = this.e;
        c1481Lu.l0(un1);
        return c1481Lu.C0(charset);
    }

    @Override // defpackage.InterfaceC2833av
    public final int J(@NotNull C4437ia1 options) throws EOFException {
        C1481Lu c1481Lu;
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        do {
            c1481Lu = this.e;
            int iC = C3267d.c(c1481Lu, options, true);
            if (iC != -2) {
                if (iC == -1) {
                    break;
                }
                c1481Lu.r(options.e[iC].f());
                return iC;
            }
        } while (this.d.s0(c1481Lu, 8192L) != -1);
        return -1;
    }

    @Override // defpackage.InterfaceC2833av
    public final boolean U(long j, @NotNull C1802Pw bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.d.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        if (length < 0) {
            return false;
        }
        byte[] bArr = bytes.d;
        if (bArr.length < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            long j2 = i;
            if (!s(1 + j2) || this.e.v(j2) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        C1481Lu c1481Lu = this.e;
        return c1481Lu.t() && this.d.s0(c1481Lu, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.close();
        this.e.g();
    }

    public final long f(byte b, long j, long j2) {
        C7782yE1 c7782yE1;
        long j3;
        long j4;
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (0 > j2) {
            throw new IllegalArgumentException(C6419rl.a("fromIndex=0 toIndex=", j2).toString());
        }
        while (jMax < j2) {
            C1481Lu c1481Lu = this.e;
            c1481Lu.getClass();
            long j5 = 0;
            if (0 > jMax || jMax > j2) {
                throw new IllegalArgumentException(("size=" + c1481Lu.e + " fromIndex=" + jMax + " toIndex=" + j2).toString());
            }
            long j6 = c1481Lu.e;
            long j7 = j2 > j6 ? j6 : j2;
            if (jMax == j7 || (c7782yE1 = c1481Lu.d) == null) {
                j3 = -1;
                j4 = -1;
                break;
            }
            if (j6 - jMax >= jMax) {
                j3 = -1;
                while (true) {
                    long j8 = ((long) (c7782yE1.c - c7782yE1.b)) + j5;
                    if (j8 > jMax) {
                        break;
                    }
                    c7782yE1 = c7782yE1.f;
                    Intrinsics.checkNotNull(c7782yE1);
                    j5 = j8;
                }
                long j9 = jMax;
                while (true) {
                    if (j5 >= j7) {
                        j4 = -1;
                        break;
                    }
                    byte[] bArr = c7782yE1.a;
                    long j10 = j9;
                    long j11 = j5;
                    int iMin = (int) Math.min(c7782yE1.c, (((long) c7782yE1.b) + j7) - j11);
                    for (int i = (int) ((((long) c7782yE1.b) + j10) - j11); i < iMin; i++) {
                        if (bArr[i] == b) {
                            j4 = ((long) (i - c7782yE1.b)) + j11;
                            break;
                        }
                    }
                    j9 = j11 + ((long) (c7782yE1.c - c7782yE1.b));
                    c7782yE1 = c7782yE1.f;
                    Intrinsics.checkNotNull(c7782yE1);
                    j5 = j9;
                }
            } else {
                while (j6 > jMax) {
                    c7782yE1 = c7782yE1.g;
                    Intrinsics.checkNotNull(c7782yE1);
                    j6 -= (long) (c7782yE1.c - c7782yE1.b);
                }
                long j12 = jMax;
                while (true) {
                    if (j6 >= j7) {
                        j3 = -1;
                        j4 = -1;
                        break;
                    }
                    byte[] bArr2 = c7782yE1.a;
                    j3 = -1;
                    int iMin2 = (int) Math.min(c7782yE1.c, (((long) c7782yE1.b) + j7) - j6);
                    int i2 = (int) ((((long) c7782yE1.b) + j12) - j6);
                    while (true) {
                        if (i2 >= iMin2) {
                            j12 = j6 + ((long) (c7782yE1.c - c7782yE1.b));
                            c7782yE1 = c7782yE1.f;
                            Intrinsics.checkNotNull(c7782yE1);
                            j6 = j12;
                        } else if (bArr2[i2] == b) {
                            j4 = ((long) (i2 - c7782yE1.b)) + j6;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            if (j4 != j3) {
                return j4;
            }
            C1481Lu c1481Lu2 = this.e;
            long j13 = c1481Lu2.e;
            if (j13 >= j2 || this.d.s0(c1481Lu2, 8192L) == j3) {
                return j3;
            }
            jMax = Math.max(jMax, j13);
        }
        return -1L;
    }

    public final byte g() throws EOFException {
        C(1L);
        return this.e.P();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.g;
    }

    @NotNull
    public final C1802Pw k(long j) throws EOFException {
        C(j);
        return this.e.X(j);
    }

    public final long l() throws EOFException {
        C1481Lu c1481Lu;
        long j;
        byte b;
        C(1L);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            boolean zS = s(j3);
            c1481Lu = this.e;
            if (!zS) {
                break;
            }
            byte bV = c1481Lu.v(j2);
            if ((bV < 48 || bV > 57) && !(j2 == 0 && bV == 45)) {
                if (j2 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bV, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            j2 = j3;
        }
        long j4 = 0;
        if (c1481Lu.e == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j5 = 0;
        long j6 = -7;
        boolean z2 = false;
        loop1: while (true) {
            C7782yE1 c7782yE1 = c1481Lu.d;
            Intrinsics.checkNotNull(c7782yE1);
            byte[] bArr = c7782yE1.a;
            int i2 = c7782yE1.b;
            int i3 = c7782yE1.c;
            while (true) {
                if (i2 >= i3) {
                    j = j4;
                    break;
                }
                b = bArr[i2];
                j = j4;
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j5 < -922337203685477580L || (j5 == -922337203685477580L && i4 < j6)) {
                        break loop1;
                    }
                    j5 = (j5 * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j6--;
                    z = true;
                }
                i2++;
                i++;
                j4 = j;
                z2 = z2;
            }
            if (i2 == i3) {
                c1481Lu.d = c7782yE1.a();
                AE1.a(c7782yE1);
            } else {
                c7782yE1.b = i2;
            }
            if (z2 || c1481Lu.d == null) {
                long j7 = c1481Lu.e - ((long) i);
                c1481Lu.e = j7;
                if (i >= (z ? 2 : 1)) {
                    return z ? j5 : -j5;
                }
                if (j7 == j) {
                    throw new EOFException();
                }
                StringBuilder sbB = K1.b(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbB.append(C5417n.c(c1481Lu.v(j)));
                throw new NumberFormatException(sbB.toString());
            }
            j4 = j;
        }
        C1481Lu c1481Lu2 = new C1481Lu();
        c1481Lu2.k1(j5);
        c1481Lu2.j1(b);
        if (!z) {
            c1481Lu2.P();
        }
        throw new NumberFormatException("Number too large: ".concat(c1481Lu2.Q0()));
    }

    @Override // defpackage.InterfaceC2833av
    public final long m0(@NotNull C1802Pw targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C1481Lu c1481Lu = this.e;
            long jC = c1481Lu.C(jMax, targetBytes);
            if (jC != -1) {
                return jC;
            }
            long j = c1481Lu.e;
            if (this.d.s0(c1481Lu, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // defpackage.InterfaceC2833av
    public final long m1(@NotNull C1802Pw bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C1481Lu c1481Lu = this.e;
            long jA = c1481Lu.A(jMax, bytes);
            if (jA != -1) {
                return jA;
            }
            long j = c1481Lu.e;
            if (this.d.s0(c1481Lu, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, (j - ((long) bytes.d.length)) + 1);
        }
    }

    @Override // defpackage.InterfaceC2833av, defpackage.InterfaceC2606Zu
    @NotNull
    public final C1481Lu n() {
        return this.e;
    }

    @Override // defpackage.UN1
    @NotNull
    public final LZ1 o() {
        return this.d.o();
    }

    public final void p(@NotNull C1481Lu sink, long j) {
        C1481Lu c1481Lu = this.e;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            C(j);
            c1481Lu.getClass();
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j2 = c1481Lu.e;
            if (j2 >= j) {
                sink.i1(c1481Lu, j);
            } else {
                sink.i1(c1481Lu, j2);
                throw new EOFException();
            }
        } catch (EOFException e) {
            sink.l0(c1481Lu);
            throw e;
        }
    }

    @Override // defpackage.InterfaceC2833av
    @NotNull
    public final C3024bo1 peek() {
        return Cm2.e(new C1744Pc1(this));
    }

    public final long q() throws EOFException {
        C1481Lu c1481Lu;
        int i;
        C(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            boolean zS = s(i3);
            c1481Lu = this.e;
            if (!zS) {
                break;
            }
            byte bV = c1481Lu.v(i2);
            if ((bV < 48 || bV > 57) && ((bV < 97 || bV > 102) && (bV < 65 || bV > 70))) {
                if (i2 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bV, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            i2 = i3;
        }
        if (c1481Lu.e == 0) {
            throw new EOFException();
        }
        int i4 = 0;
        boolean z = false;
        long j = 0;
        do {
            C7782yE1 c7782yE1 = c1481Lu.d;
            Intrinsics.checkNotNull(c7782yE1);
            byte[] bArr = c7782yE1.a;
            int i5 = c7782yE1.b;
            int i6 = c7782yE1.c;
            while (i5 < i6) {
                byte b = bArr[i5];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i4 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(C5417n.c(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C1481Lu c1481Lu2 = new C1481Lu();
                    c1481Lu2.s1(j);
                    c1481Lu2.j1(b);
                    throw new NumberFormatException("Number too large: ".concat(c1481Lu2.Q0()));
                }
                j = (j << 4) | ((long) i);
                i5++;
                i4++;
            }
            if (i5 == i6) {
                c1481Lu.d = c7782yE1.a();
                AE1.a(c7782yE1);
            } else {
                c7782yE1.b = i5;
            }
            if (z) {
                break;
            }
        } while (c1481Lu.d != null);
        c1481Lu.e -= (long) i4;
        return j;
    }

    @Override // defpackage.InterfaceC2833av
    public final void r(long j) throws EOFException {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C1481Lu c1481Lu = this.e;
            if (c1481Lu.e == 0 && this.d.s0(c1481Lu, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c1481Lu.e);
            c1481Lu.r(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.InterfaceC2833av
    @NotNull
    public final InputStream r1() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C1481Lu c1481Lu = this.e;
        if (c1481Lu.e == 0 && this.d.s0(c1481Lu, 8192L) == -1) {
            return -1;
        }
        return c1481Lu.read(sink);
    }

    @Override // defpackage.InterfaceC2833av
    public final boolean s(long j) {
        C1481Lu c1481Lu;
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("byteCount < 0: ", j).toString());
        }
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        do {
            c1481Lu = this.e;
            if (c1481Lu.e >= j) {
                return true;
            }
        } while (this.d.s0(c1481Lu, 8192L) != -1);
        return false;
    }

    @Override // defpackage.UN1
    public final long s0(@NotNull C1481Lu sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("byteCount < 0: ", j).toString());
        }
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        C1481Lu c1481Lu = this.e;
        if (c1481Lu.e == 0 && this.d.s0(c1481Lu, 8192L) == -1) {
            return -1L;
        }
        return c1481Lu.s0(sink, Math.min(j, c1481Lu.e));
    }

    public final int t() throws EOFException {
        C(4L);
        return this.e.K0();
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.d + ')';
    }

    public final int u() throws EOFException {
        C(4L);
        int iK0 = this.e.K0();
        C1481Lu.b bVar = C5417n.a;
        return ((iK0 & 255) << 24) | (((-16777216) & iK0) >>> 24) | ((16711680 & iK0) >>> 8) | ((65280 & iK0) << 8);
    }

    public final short v() throws EOFException {
        C(2L);
        return this.e.L0();
    }

    @Override // defpackage.InterfaceC2833av
    public final long z0(@NotNull KM1 sink) {
        C1481Lu c1481Lu;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (true) {
            UN1 un1 = this.d;
            c1481Lu = this.e;
            if (un1.s0(c1481Lu, 8192L) == -1) {
                break;
            }
            long jL = c1481Lu.l();
            if (jL > 0) {
                j += jL;
                sink.i1(c1481Lu, jL);
            }
        }
        long j2 = c1481Lu.e;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        sink.i1(c1481Lu, j2);
        return j3;
    }

    /* JADX INFO: renamed from: bo1$a */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            C3024bo1 c3024bo1 = C3024bo1.this;
            if (c3024bo1.g) {
                throw new IOException("closed");
            }
            return (int) Math.min(c3024bo1.e.e, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C3024bo1.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            C3024bo1 c3024bo1 = C3024bo1.this;
            if (c3024bo1.g) {
                throw new IOException("closed");
            }
            C1481Lu c1481Lu = c3024bo1.e;
            if (c1481Lu.e == 0 && c3024bo1.d.s0(c1481Lu, 8192L) == -1) {
                return -1;
            }
            return c1481Lu.P() & 255;
        }

        @NotNull
        public final String toString() {
            return C3024bo1.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] data, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            C3024bo1 c3024bo1 = C3024bo1.this;
            if (!c3024bo1.g) {
                C5417n.b(data.length, i, i2);
                C1481Lu c1481Lu = c3024bo1.e;
                if (c1481Lu.e == 0 && c3024bo1.d.s0(c1481Lu, 8192L) == -1) {
                    return -1;
                }
                return c1481Lu.G(data, i, i2);
            }
            throw new IOException("closed");
        }
    }
}

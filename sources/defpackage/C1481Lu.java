package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1481Lu implements InterfaceC2833av, InterfaceC2606Zu, Cloneable, ByteChannel {

    @Nullable
    public C7782yE1 d;
    public long e;

    /* JADX INFO: renamed from: Lu$b */
    public static final class b implements Closeable {

        @Nullable
        public C1481Lu d;
        public boolean e;

        @Nullable
        public C7782yE1 g;

        @Nullable
        public byte[] i;
        public long h = -1;
        public int j = -1;
        public int k = -1;

        public final void c(long j) {
            C1481Lu c1481Lu = this.d;
            if (c1481Lu == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.e) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = c1481Lu.e;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException(C6419rl.a("newSize < 0: ", j).toString());
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    C7782yE1 c7782yE1 = c1481Lu.d;
                    Intrinsics.checkNotNull(c7782yE1);
                    C7782yE1 c7782yE2 = c7782yE1.g;
                    Intrinsics.checkNotNull(c7782yE2);
                    int i = c7782yE2.c;
                    long j4 = i - c7782yE2.b;
                    if (j4 > j3) {
                        c7782yE2.c = i - ((int) j3);
                        break;
                    } else {
                        c1481Lu.d = c7782yE2.a();
                        AE1.a(c7782yE2);
                        j3 -= j4;
                    }
                }
                this.g = null;
                this.h = j;
                this.i = null;
                this.j = -1;
                this.k = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    C7782yE1 c7782yE1V0 = c1481Lu.V0(i2);
                    int iMin = (int) Math.min(j5, 8192 - c7782yE1V0.c);
                    int i3 = c7782yE1V0.c + iMin;
                    c7782yE1V0.c = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.g = c7782yE1V0;
                        this.h = j2;
                        this.i = c7782yE1V0.a;
                        this.j = i3 - iMin;
                        this.k = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            c1481Lu.e = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.d == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.d = null;
            this.g = null;
            this.h = -1L;
            this.i = null;
            this.j = -1;
            this.k = -1;
        }

        public final int f(long j) {
            C7782yE1 c7782yE1;
            C1481Lu c1481Lu = this.d;
            if (c1481Lu == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j >= -1) {
                long j2 = c1481Lu.e;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.g = null;
                        this.h = j;
                        this.i = null;
                        this.j = -1;
                        this.k = -1;
                        return -1;
                    }
                    C7782yE1 c7782yE2 = c1481Lu.d;
                    C7782yE1 c7782yE3 = this.g;
                    long j3 = 0;
                    if (c7782yE3 != null) {
                        long j4 = this.h;
                        int i = this.j;
                        Intrinsics.checkNotNull(c7782yE3);
                        long j5 = j4 - ((long) (i - c7782yE3.b));
                        if (j5 > j) {
                            c7782yE1 = c7782yE2;
                            c7782yE2 = this.g;
                            j2 = j5;
                        } else {
                            c7782yE1 = this.g;
                            j3 = j5;
                        }
                    } else {
                        c7782yE1 = c7782yE2;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            Intrinsics.checkNotNull(c7782yE1);
                            long j6 = ((long) (c7782yE1.c - c7782yE1.b)) + j3;
                            if (j < j6) {
                                break;
                            }
                            c7782yE1 = c7782yE1.f;
                            j3 = j6;
                        }
                    } else {
                        while (j2 > j) {
                            Intrinsics.checkNotNull(c7782yE2);
                            c7782yE2 = c7782yE2.g;
                            Intrinsics.checkNotNull(c7782yE2);
                            j2 -= (long) (c7782yE2.c - c7782yE2.b);
                        }
                        c7782yE1 = c7782yE2;
                        j3 = j2;
                    }
                    if (this.e) {
                        Intrinsics.checkNotNull(c7782yE1);
                        if (c7782yE1.d) {
                            byte[] bArr = c7782yE1.a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                            C7782yE1 c7782yE4 = new C7782yE1(bArrCopyOf, c7782yE1.b, c7782yE1.c, false, true);
                            if (c1481Lu.d == c7782yE1) {
                                c1481Lu.d = c7782yE4;
                            }
                            c7782yE1.b(c7782yE4);
                            C7782yE1 c7782yE5 = c7782yE4.g;
                            Intrinsics.checkNotNull(c7782yE5);
                            c7782yE5.a();
                            c7782yE1 = c7782yE4;
                        }
                    }
                    this.g = c7782yE1;
                    this.h = j;
                    Intrinsics.checkNotNull(c7782yE1);
                    this.i = c7782yE1.a;
                    int i2 = c7782yE1.b + ((int) (j - j3));
                    this.j = i2;
                    int i3 = c7782yE1.c;
                    this.k = i3;
                    return i3 - i2;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c1481Lu.e);
        }
    }

    public final long A(long j, @NotNull C1802Pw bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.d.length <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("fromIndex < 0: ", j).toString());
        }
        C7782yE1 c7782yE1 = this.d;
        if (c7782yE1 == null) {
            return -1L;
        }
        long j3 = this.e;
        long j4 = j3 - j;
        byte[] bArr = bytes.d;
        if (j4 < j) {
            while (j3 > j) {
                c7782yE1 = c7782yE1.g;
                Intrinsics.checkNotNull(c7782yE1);
                j3 -= (long) (c7782yE1.c - c7782yE1.b);
            }
            byte b2 = bArr[0];
            int length = bArr.length;
            long j5 = (this.e - ((long) length)) + 1;
            while (j3 < j5) {
                byte[] bArr2 = c7782yE1.a;
                int iMin = (int) Math.min(c7782yE1.c, (((long) c7782yE1.b) + j5) - j3);
                for (int i = (int) ((((long) c7782yE1.b) + j) - j3); i < iMin; i++) {
                    if (bArr2[i] == b2 && C3267d.a(c7782yE1, i + 1, bArr, length)) {
                        return ((long) (i - c7782yE1.b)) + j3;
                    }
                }
                j3 += (long) (c7782yE1.c - c7782yE1.b);
                c7782yE1 = c7782yE1.f;
                Intrinsics.checkNotNull(c7782yE1);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j6 = ((long) (c7782yE1.c - c7782yE1.b)) + j2;
            if (j6 > j) {
                break;
            }
            c7782yE1 = c7782yE1.f;
            Intrinsics.checkNotNull(c7782yE1);
            j2 = j6;
        }
        byte b3 = bArr[0];
        int length2 = bArr.length;
        long j7 = (this.e - ((long) length2)) + 1;
        while (j2 < j7) {
            byte[] bArr3 = c7782yE1.a;
            int iMin2 = (int) Math.min(c7782yE1.c, (((long) c7782yE1.b) + j7) - j2);
            for (int i2 = (int) ((((long) c7782yE1.b) + j) - j2); i2 < iMin2; i2++) {
                if (bArr3[i2] == b3 && C3267d.a(c7782yE1, i2 + 1, bArr, length2)) {
                    return ((long) (i2 - c7782yE1.b)) + j2;
                }
            }
            j2 += (long) (c7782yE1.c - c7782yE1.b);
            c7782yE1 = c7782yE1.f;
            Intrinsics.checkNotNull(c7782yE1);
            j = j2;
        }
        return -1L;
    }

    public final long C(long j, @NotNull C1802Pw targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("fromIndex < 0: ", j).toString());
        }
        C7782yE1 c7782yE1 = this.d;
        if (c7782yE1 == null) {
            return -1L;
        }
        long j3 = this.e;
        if (j3 - j < j) {
            while (j3 > j) {
                c7782yE1 = c7782yE1.g;
                Intrinsics.checkNotNull(c7782yE1);
                j3 -= (long) (c7782yE1.c - c7782yE1.b);
            }
            byte[] bArr = targetBytes.d;
            if (bArr.length == 2) {
                byte b2 = bArr[0];
                byte b3 = bArr[1];
                while (j3 < this.e) {
                    byte[] bArr2 = c7782yE1.a;
                    int i = c7782yE1.c;
                    for (int i2 = (int) ((((long) c7782yE1.b) + j) - j3); i2 < i; i2++) {
                        byte b4 = bArr2[i2];
                        if (b4 == b2 || b4 == b3) {
                            return ((long) (i2 - c7782yE1.b)) + j3;
                        }
                    }
                    j3 += (long) (c7782yE1.c - c7782yE1.b);
                    c7782yE1 = c7782yE1.f;
                    Intrinsics.checkNotNull(c7782yE1);
                    j = j3;
                }
                return -1L;
            }
            while (j3 < this.e) {
                byte[] bArr3 = c7782yE1.a;
                int i3 = c7782yE1.c;
                for (int i4 = (int) ((((long) c7782yE1.b) + j) - j3); i4 < i3; i4++) {
                    byte b5 = bArr3[i4];
                    for (byte b6 : bArr) {
                        if (b5 == b6) {
                            return ((long) (i4 - c7782yE1.b)) + j3;
                        }
                    }
                }
                j3 += (long) (c7782yE1.c - c7782yE1.b);
                c7782yE1 = c7782yE1.f;
                Intrinsics.checkNotNull(c7782yE1);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (c7782yE1.c - c7782yE1.b)) + j2;
            if (j4 > j) {
                break;
            }
            c7782yE1 = c7782yE1.f;
            Intrinsics.checkNotNull(c7782yE1);
            j2 = j4;
        }
        byte[] bArr4 = targetBytes.d;
        if (bArr4.length == 2) {
            byte b7 = bArr4[0];
            byte b8 = bArr4[1];
            while (j2 < this.e) {
                byte[] bArr5 = c7782yE1.a;
                int i5 = c7782yE1.c;
                for (int i6 = (int) ((((long) c7782yE1.b) + j) - j2); i6 < i5; i6++) {
                    byte b9 = bArr5[i6];
                    if (b9 == b7 || b9 == b8) {
                        return ((long) (i6 - c7782yE1.b)) + j2;
                    }
                }
                j2 += (long) (c7782yE1.c - c7782yE1.b);
                c7782yE1 = c7782yE1.f;
                Intrinsics.checkNotNull(c7782yE1);
                j = j2;
            }
            return -1L;
        }
        while (j2 < this.e) {
            byte[] bArr6 = c7782yE1.a;
            int i7 = c7782yE1.c;
            for (int i8 = (int) ((((long) c7782yE1.b) + j) - j2); i8 < i7; i8++) {
                byte b10 = bArr6[i8];
                for (byte b11 : bArr4) {
                    if (b10 == b11) {
                        return ((long) (i8 - c7782yE1.b)) + j2;
                    }
                }
            }
            j2 += (long) (c7782yE1.c - c7782yE1.b);
            c7782yE1 = c7782yE1.f;
            Intrinsics.checkNotNull(c7782yE1);
            j = j2;
        }
        return -1L;
    }

    @Override // defpackage.InterfaceC2833av
    @NotNull
    public final String C0(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return M0(this.e, charset);
    }

    public final int G(@NotNull byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C5417n.b(sink.length, i, i2);
        C7782yE1 c7782yE1 = this.d;
        if (c7782yE1 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c7782yE1.c - c7782yE1.b);
        int i3 = c7782yE1.b;
        C1371Kj.c(i, i3, i3 + iMin, c7782yE1.a, sink);
        int i4 = c7782yE1.b + iMin;
        c7782yE1.b = i4;
        this.e -= (long) iMin;
        if (i4 == c7782yE1.c) {
            this.d = c7782yE1.a();
            AE1.a(c7782yE1);
        }
        return iMin;
    }

    @Override // defpackage.InterfaceC2833av
    public final int J(@NotNull C4437ia1 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iC = C3267d.c(this, options, false);
        if (iC == -1) {
            return -1;
        }
        r(options.e[iC].f());
        return iC;
    }

    public final int K0() throws EOFException {
        if (this.e < 4) {
            throw new EOFException();
        }
        C7782yE1 c7782yE1 = this.d;
        Intrinsics.checkNotNull(c7782yE1);
        int i = c7782yE1.b;
        int i2 = c7782yE1.c;
        if (i2 - i < 4) {
            return ((P() & 255) << 24) | ((P() & 255) << 16) | ((P() & 255) << 8) | (P() & 255);
        }
        byte[] bArr = c7782yE1.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.e -= 4;
        if (i5 != i2) {
            c7782yE1.b = i5;
            return i6;
        }
        this.d = c7782yE1.a();
        AE1.a(c7782yE1);
        return i6;
    }

    @NotNull
    public final b L(@NotNull b unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = C3267d.a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        b bVar = C5417n.a;
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == C5417n.a) {
            unsafeCursor = new b();
        }
        if (unsafeCursor.d != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.d = this;
        unsafeCursor.e = true;
        return unsafeCursor;
    }

    public final short L0() throws EOFException {
        if (this.e < 2) {
            throw new EOFException();
        }
        C7782yE1 c7782yE1 = this.d;
        Intrinsics.checkNotNull(c7782yE1);
        int i = c7782yE1.b;
        int i2 = c7782yE1.c;
        if (i2 - i < 2) {
            return (short) (((P() & 255) << 8) | (P() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = c7782yE1.a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.e -= 2;
        if (i5 == i2) {
            this.d = c7782yE1.a();
            AE1.a(c7782yE1);
        } else {
            c7782yE1.b = i5;
        }
        return (short) i6;
    }

    @NotNull
    public final String M0(long j, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(C6419rl.a("byteCount: ", j).toString());
        }
        if (this.e < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C7782yE1 c7782yE1 = this.d;
        Intrinsics.checkNotNull(c7782yE1);
        int i = c7782yE1.b;
        if (((long) i) + j > c7782yE1.c) {
            return new String(W(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c7782yE1.a, i, i2, charset);
        int i3 = c7782yE1.b + i2;
        c7782yE1.b = i3;
        this.e -= j;
        if (i3 == c7782yE1.c) {
            this.d = c7782yE1.a();
            AE1.a(c7782yE1);
        }
        return str;
    }

    public final byte P() throws EOFException {
        if (this.e == 0) {
            throw new EOFException();
        }
        C7782yE1 c7782yE1 = this.d;
        Intrinsics.checkNotNull(c7782yE1);
        int i = c7782yE1.b;
        int i2 = c7782yE1.c;
        int i3 = i + 1;
        byte b2 = c7782yE1.a[i];
        this.e--;
        if (i3 != i2) {
            c7782yE1.b = i3;
            return b2;
        }
        this.d = c7782yE1.a();
        AE1.a(c7782yE1);
        return b2;
    }

    @NotNull
    public final String Q0() {
        return M0(this.e, Charsets.UTF_8);
    }

    public final int R0() {
        int i;
        int i2;
        int i3;
        if (this.e == 0) {
            throw new EOFException();
        }
        byte bV = v(0L);
        if ((bV & 128) == 0) {
            i = bV & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bV & 224) == 192) {
            i = bV & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bV & 240) == 224) {
            i = bV & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bV & 248) != 240) {
                r(1L);
                return 65533;
            }
            i = bV & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.e < j) {
            StringBuilder sbC = C1332Jw.c(i2, "size < ", ": ");
            sbC.append(this.e);
            sbC.append(" (to read code point prefixed 0x");
            sbC.append(C5417n.c(bV));
            sbC.append(')');
            throw new EOFException(sbC.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bV2 = v(j2);
            if ((bV2 & 192) != 128) {
                r(j2);
                return 65533;
            }
            i = (i << 6) | (bV2 & 63);
        }
        r(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @NotNull
    public final C1802Pw S0(int i) {
        if (i == 0) {
            return C1802Pw.h;
        }
        C5417n.b(this.e, 0L, i);
        C7782yE1 c7782yE1 = this.d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(c7782yE1);
            int i5 = c7782yE1.c;
            int i6 = c7782yE1.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c7782yE1 = c7782yE1.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C7782yE1 c7782yE2 = this.d;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(c7782yE2);
            bArr[i7] = c7782yE2.a;
            i2 += c7782yE2.c - c7782yE2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c7782yE2.b;
            c7782yE2.d = true;
            i7++;
            c7782yE2 = c7782yE2.f;
        }
        return new BE1(bArr, iArr);
    }

    @Override // defpackage.InterfaceC2833av
    public final boolean U(long j, @NotNull C1802Pw bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.d.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j >= 0 && length >= 0 && this.e - j >= length) {
            byte[] bArr = bytes.d;
            if (bArr.length >= length) {
                for (int i = 0; i < length; i++) {
                    if (v(((long) i) + j) == bArr[i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final C7782yE1 V0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C7782yE1 c7782yE1 = this.d;
        if (c7782yE1 == null) {
            C7782yE1 c7782yE1B = AE1.b();
            this.d = c7782yE1B;
            c7782yE1B.g = c7782yE1B;
            c7782yE1B.f = c7782yE1B;
            return c7782yE1B;
        }
        Intrinsics.checkNotNull(c7782yE1);
        C7782yE1 c7782yE2 = c7782yE1.g;
        Intrinsics.checkNotNull(c7782yE2);
        if (c7782yE2.c + i <= 8192 && c7782yE2.e) {
            return c7782yE2;
        }
        C7782yE1 c7782yE1B2 = AE1.b();
        c7782yE2.b(c7782yE1B2);
        return c7782yE1B2;
    }

    @NotNull
    public final byte[] W(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(C6419rl.a("byteCount: ", j).toString());
        }
        if (this.e < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        i0(bArr);
        return bArr;
    }

    @NotNull
    public final C1802Pw X(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(C6419rl.a("byteCount: ", j).toString());
        }
        if (this.e < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C1802Pw(W(j));
        }
        C1802Pw c1802PwS0 = S0((int) j);
        r(j);
        return c1802PwS0;
    }

    @Override // defpackage.InterfaceC2606Zu
    public final /* bridge */ /* synthetic */ InterfaceC2606Zu Y(int i) {
        j1(i);
        return this;
    }

    @NotNull
    public final void Y0(@NotNull C1802Pw byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.r(this, byteString.f());
    }

    @Override // defpackage.InterfaceC2606Zu
    public final /* bridge */ /* synthetic */ InterfaceC2606Zu Z0(byte[] bArr) {
        b1(bArr);
        return this;
    }

    @NotNull
    public final void b1(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        c1(source, 0, source.length);
    }

    @NotNull
    public final void c1(@NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        C5417n.b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C7782yE1 c7782yE1V0 = V0(1);
            int iMin = Math.min(i3 - i, 8192 - c7782yE1V0.c);
            int i4 = i + iMin;
            C1371Kj.c(c7782yE1V0.c, i, i4, source, c7782yE1V0.a);
            c7782yE1V0.c += iMin;
            i = i4;
        }
        this.e += j;
    }

    public final boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        boolean z2 = false;
        if (!(obj instanceof C1481Lu)) {
            return false;
        }
        long j = this.e;
        C1481Lu c1481Lu = (C1481Lu) obj;
        if (j != c1481Lu.e) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C7782yE1 c7782yE1 = this.d;
        Intrinsics.checkNotNull(c7782yE1);
        C7782yE1 c7782yE2 = c1481Lu.d;
        Intrinsics.checkNotNull(c7782yE2);
        int i = c7782yE1.b;
        int i2 = c7782yE2.b;
        long j2 = 0;
        while (j2 < this.e) {
            long jMin = Math.min(c7782yE1.c - i, c7782yE2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                boolean z3 = z;
                byte b2 = c7782yE1.a[i];
                int i4 = i2 + 1;
                boolean z4 = z2;
                if (b2 != c7782yE2.a[i2]) {
                    return z4;
                }
                j3++;
                i2 = i4;
                i = i3;
                z = z3;
                z2 = z4;
            }
            boolean z5 = z;
            boolean z6 = z2;
            if (i == c7782yE1.c) {
                C7782yE1 c7782yE3 = c7782yE1.f;
                Intrinsics.checkNotNull(c7782yE3);
                i = c7782yE3.b;
                c7782yE1 = c7782yE3;
            }
            if (i2 == c7782yE2.c) {
                c7782yE2 = c7782yE2.f;
                Intrinsics.checkNotNull(c7782yE2);
                i2 = c7782yE2.b;
            }
            j2 += jMin;
            z = z5;
            z2 = z6;
        }
        return z;
    }

    public final void g() throws EOFException {
        r(this.e);
    }

    public final int hashCode() {
        C7782yE1 c7782yE1 = this.d;
        if (c7782yE1 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c7782yE1.c;
            for (int i3 = c7782yE1.b; i3 < i2; i3++) {
                i = (i * 31) + c7782yE1.a[i3];
            }
            c7782yE1 = c7782yE1.f;
            Intrinsics.checkNotNull(c7782yE1);
        } while (c7782yE1 != this.d);
        return i;
    }

    public final void i0(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int iG = G(sink, i, sink.length - i);
            if (iG == -1) {
                throw new EOFException();
            }
            i += iG;
        }
    }

    @Override // defpackage.KM1
    public final void i1(@NotNull C1481Lu source, long j) {
        C7782yE1 c7782yE1;
        C7782yE1 c7782yE1B;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        C5417n.b(source.e, 0L, j);
        while (j > 0) {
            C7782yE1 c7782yE2 = source.d;
            Intrinsics.checkNotNull(c7782yE2);
            int i = c7782yE2.c;
            C7782yE1 c7782yE3 = source.d;
            Intrinsics.checkNotNull(c7782yE3);
            long j2 = i - c7782yE3.b;
            int i2 = 0;
            if (j < j2) {
                C7782yE1 c7782yE4 = this.d;
                if (c7782yE4 != null) {
                    Intrinsics.checkNotNull(c7782yE4);
                    c7782yE1 = c7782yE4.g;
                } else {
                    c7782yE1 = null;
                }
                if (c7782yE1 != null && c7782yE1.e) {
                    if ((((long) c7782yE1.c) + j) - ((long) (c7782yE1.d ? 0 : c7782yE1.b)) <= 8192) {
                        C7782yE1 c7782yE5 = source.d;
                        Intrinsics.checkNotNull(c7782yE5);
                        c7782yE5.d(c7782yE1, (int) j);
                        source.e -= j;
                        this.e += j;
                        return;
                    }
                }
                C7782yE1 c7782yE6 = source.d;
                Intrinsics.checkNotNull(c7782yE6);
                int i3 = (int) j;
                if (i3 <= 0) {
                    c7782yE6.getClass();
                } else if (i3 <= c7782yE6.c - c7782yE6.b) {
                    if (i3 >= 1024) {
                        c7782yE1B = c7782yE6.c();
                    } else {
                        c7782yE1B = AE1.b();
                        int i4 = c7782yE6.b;
                        C1371Kj.c(0, i4, i4 + i3, c7782yE6.a, c7782yE1B.a);
                    }
                    c7782yE1B.c = c7782yE1B.b + i3;
                    c7782yE6.b += i3;
                    C7782yE1 c7782yE7 = c7782yE6.g;
                    Intrinsics.checkNotNull(c7782yE7);
                    c7782yE7.b(c7782yE1B);
                    source.d = c7782yE1B;
                }
                throw new IllegalArgumentException("byteCount out of range");
            }
            C7782yE1 c7782yE8 = source.d;
            Intrinsics.checkNotNull(c7782yE8);
            long j3 = c7782yE8.c - c7782yE8.b;
            source.d = c7782yE8.a();
            C7782yE1 c7782yE9 = this.d;
            if (c7782yE9 == null) {
                this.d = c7782yE8;
                c7782yE8.g = c7782yE8;
                c7782yE8.f = c7782yE8;
            } else {
                Intrinsics.checkNotNull(c7782yE9);
                C7782yE1 c7782yE10 = c7782yE9.g;
                Intrinsics.checkNotNull(c7782yE10);
                c7782yE10.b(c7782yE8);
                C7782yE1 c7782yE11 = c7782yE8.g;
                if (c7782yE11 == c7782yE8) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.checkNotNull(c7782yE11);
                if (c7782yE11.e) {
                    int i5 = c7782yE8.c - c7782yE8.b;
                    C7782yE1 c7782yE12 = c7782yE8.g;
                    Intrinsics.checkNotNull(c7782yE12);
                    int i6 = 8192 - c7782yE12.c;
                    C7782yE1 c7782yE13 = c7782yE8.g;
                    Intrinsics.checkNotNull(c7782yE13);
                    if (!c7782yE13.d) {
                        C7782yE1 c7782yE14 = c7782yE8.g;
                        Intrinsics.checkNotNull(c7782yE14);
                        i2 = c7782yE14.b;
                    }
                    if (i5 <= i6 + i2) {
                        C7782yE1 c7782yE15 = c7782yE8.g;
                        Intrinsics.checkNotNull(c7782yE15);
                        c7782yE8.d(c7782yE15, i5);
                        c7782yE8.a();
                        AE1.a(c7782yE8);
                    }
                }
            }
            source.e -= j3;
            this.e += j3;
            j -= j3;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @NotNull
    public final void j1(int i) {
        C7782yE1 c7782yE1V0 = V0(1);
        int i2 = c7782yE1V0.c;
        c7782yE1V0.c = i2 + 1;
        c7782yE1V0.a[i2] = (byte) i;
        this.e++;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C1481Lu clone() {
        C1481Lu c1481Lu = new C1481Lu();
        if (this.e == 0) {
            return c1481Lu;
        }
        C7782yE1 c7782yE1 = this.d;
        Intrinsics.checkNotNull(c7782yE1);
        C7782yE1 c7782yE1C = c7782yE1.c();
        c1481Lu.d = c7782yE1C;
        c7782yE1C.g = c7782yE1C;
        c7782yE1C.f = c7782yE1C;
        for (C7782yE1 c7782yE2 = c7782yE1.f; c7782yE2 != c7782yE1; c7782yE2 = c7782yE2.f) {
            C7782yE1 c7782yE3 = c7782yE1C.g;
            Intrinsics.checkNotNull(c7782yE3);
            Intrinsics.checkNotNull(c7782yE2);
            c7782yE3.b(c7782yE2.c());
        }
        c1481Lu.e = this.e;
        return c1481Lu;
    }

    @NotNull
    public final void k1(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            j1(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                w1("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        C7782yE1 c7782yE1V0 = V0(i);
        int i2 = c7782yE1V0.c + i;
        while (true) {
            bArr = c7782yE1V0.a;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i2--;
            bArr[i2] = C3267d.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c7782yE1V0.c += i;
        this.e += (long) i;
    }

    public final long l() {
        long j = this.e;
        if (j == 0) {
            return 0L;
        }
        C7782yE1 c7782yE1 = this.d;
        Intrinsics.checkNotNull(c7782yE1);
        C7782yE1 c7782yE2 = c7782yE1.g;
        Intrinsics.checkNotNull(c7782yE2);
        int i = c7782yE2.c;
        return (i >= 8192 || !c7782yE2.e) ? j : j - ((long) (i - c7782yE2.b));
    }

    @Override // defpackage.InterfaceC2606Zu
    public final long l0(@NotNull UN1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long jS0 = source.s0(this, 8192L);
            if (jS0 == -1) {
                return j;
            }
            j += jS0;
        }
    }

    @Override // defpackage.InterfaceC2833av
    public final long m0(@NotNull C1802Pw targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return C(0L, targetBytes);
    }

    @Override // defpackage.InterfaceC2833av
    public final long m1(@NotNull C1802Pw bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return A(0L, bytes);
    }

    @Override // defpackage.UN1
    @NotNull
    public final LZ1 o() {
        return LZ1.d;
    }

    @Override // defpackage.InterfaceC2606Zu
    public final /* bridge */ /* synthetic */ InterfaceC2606Zu o1(long j) {
        k1(j);
        return this;
    }

    @NotNull
    public final void p(@NotNull C1481Lu out, long j, long j2) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j3 = j;
        C5417n.b(this.e, j3, j2);
        if (j2 == 0) {
            return;
        }
        out.e += j2;
        C7782yE1 c7782yE1 = this.d;
        while (true) {
            Intrinsics.checkNotNull(c7782yE1);
            long j4 = c7782yE1.c - c7782yE1.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c7782yE1 = c7782yE1.f;
        }
        C7782yE1 c7782yE2 = c7782yE1;
        long j5 = j2;
        while (j5 > 0) {
            Intrinsics.checkNotNull(c7782yE2);
            C7782yE1 c7782yE1C = c7782yE2.c();
            int i = c7782yE1C.b + ((int) j3);
            c7782yE1C.b = i;
            c7782yE1C.c = Math.min(i + ((int) j5), c7782yE1C.c);
            C7782yE1 c7782yE3 = out.d;
            if (c7782yE3 == null) {
                c7782yE1C.g = c7782yE1C;
                c7782yE1C.f = c7782yE1C;
                out.d = c7782yE1C;
            } else {
                Intrinsics.checkNotNull(c7782yE3);
                C7782yE1 c7782yE4 = c7782yE3.g;
                Intrinsics.checkNotNull(c7782yE4);
                c7782yE4.b(c7782yE1C);
            }
            j5 -= (long) (c7782yE1C.c - c7782yE1C.b);
            c7782yE2 = c7782yE2.f;
            j3 = 0;
        }
    }

    @Override // defpackage.InterfaceC2833av
    @NotNull
    public final C3024bo1 peek() {
        return Cm2.e(new C1744Pc1(this));
    }

    @Override // defpackage.InterfaceC2606Zu
    public final /* bridge */ /* synthetic */ InterfaceC2606Zu q1(C1802Pw c1802Pw) {
        Y0(c1802Pw);
        return this;
    }

    @Override // defpackage.InterfaceC2833av
    public final void r(long j) throws EOFException {
        while (j > 0) {
            C7782yE1 c7782yE1 = this.d;
            if (c7782yE1 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c7782yE1.c - c7782yE1.b);
            long j2 = iMin;
            this.e -= j2;
            j -= j2;
            int i = c7782yE1.b + iMin;
            c7782yE1.b = i;
            if (i == c7782yE1.c) {
                this.d = c7782yE1.a();
                AE1.a(c7782yE1);
            }
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
        C7782yE1 c7782yE1 = this.d;
        if (c7782yE1 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), c7782yE1.c - c7782yE1.b);
        sink.put(c7782yE1.a, c7782yE1.b, iMin);
        int i = c7782yE1.b + iMin;
        c7782yE1.b = i;
        this.e -= (long) iMin;
        if (i == c7782yE1.c) {
            this.d = c7782yE1.a();
            AE1.a(c7782yE1);
        }
        return iMin;
    }

    @Override // defpackage.InterfaceC2833av
    public final boolean s(long j) {
        return this.e >= j;
    }

    @Override // defpackage.UN1
    public final long s0(@NotNull C1481Lu sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(C6419rl.a("byteCount < 0: ", j).toString());
        }
        long j2 = this.e;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.i1(this, j);
        return j;
    }

    @NotNull
    public final void s1(long j) {
        if (j == 0) {
            j1(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C7782yE1 c7782yE1V0 = V0(i);
        int i2 = c7782yE1V0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            c7782yE1V0.a[i3] = C3267d.a[(int) (15 & j)];
            j >>>= 4;
        }
        c7782yE1V0.c += i;
        this.e += (long) i;
    }

    public final boolean t() {
        return this.e == 0;
    }

    @NotNull
    public final void t1(int i) {
        C7782yE1 c7782yE1V0 = V0(4);
        int i2 = c7782yE1V0.c;
        byte[] bArr = c7782yE1V0.a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c7782yE1V0.c = i2 + 4;
        this.e += 4;
    }

    @NotNull
    public final String toString() {
        long j = this.e;
        if (j <= 2147483647L) {
            return S0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.e).toString());
    }

    @NotNull
    public final void u1(int i) {
        C7782yE1 c7782yE1V0 = V0(2);
        int i2 = c7782yE1V0.c;
        byte[] bArr = c7782yE1V0.a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c7782yE1V0.c = i2 + 2;
        this.e += 2;
    }

    public final byte v(long j) {
        C5417n.b(this.e, j, 1L);
        C7782yE1 c7782yE1 = this.d;
        if (c7782yE1 == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j2 = this.e;
        if (j2 - j < j) {
            while (j2 > j) {
                c7782yE1 = c7782yE1.g;
                Intrinsics.checkNotNull(c7782yE1);
                j2 -= (long) (c7782yE1.c - c7782yE1.b);
            }
            Intrinsics.checkNotNull(c7782yE1);
            return c7782yE1.a[(int) ((((long) c7782yE1.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (c7782yE1.c - c7782yE1.b)) + j3;
            if (j4 > j) {
                Intrinsics.checkNotNull(c7782yE1);
                return c7782yE1.a[(int) ((((long) c7782yE1.b) + j) - j3)];
            }
            c7782yE1 = c7782yE1.f;
            Intrinsics.checkNotNull(c7782yE1);
            j3 = j4;
        }
    }

    @NotNull
    public final void v1(int i, int i2, @NotNull String string) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(EK.e(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C4564j.c(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > string.length()) {
            StringBuilder sbC = C1332Jw.c(i2, "endIndex > string.length: ", " > ");
            sbC.append(string.length());
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                C7782yE1 c7782yE1V0 = V0(1);
                int i3 = c7782yE1V0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = c7782yE1V0.a;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c7782yE1V0.c;
                int i6 = (i3 + i) - i5;
                c7782yE1V0.c = i5 + i6;
                this.e += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C7782yE1 c7782yE1V1 = V0(2);
                    int i7 = c7782yE1V1.c;
                    byte[] bArr2 = c7782yE1V1.a;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    c7782yE1V1.c = i7 + 2;
                    this.e += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C7782yE1 c7782yE1V2 = V0(3);
                    int i8 = c7782yE1V2.c;
                    byte[] bArr3 = c7782yE1V2.a;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    c7782yE1V2.c = i8 + 3;
                    this.e += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        j1(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C7782yE1 c7782yE1V3 = V0(4);
                        int i11 = c7782yE1V3.c;
                        byte[] bArr4 = c7782yE1V3.a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        c7782yE1V3.c = i11 + 4;
                        this.e += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC2606Zu
    public final /* bridge */ /* synthetic */ InterfaceC2606Zu w0(int i, byte[] bArr) {
        c1(bArr, 0, i);
        return this;
    }

    @NotNull
    public final void w1(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        v1(0, string.length(), string);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            C7782yE1 c7782yE1V0 = V0(1);
            int iMin = Math.min(i, 8192 - c7782yE1V0.c);
            source.get(c7782yE1V0.a, c7782yE1V0.c, iMin);
            i -= iMin;
            c7782yE1V0.c += iMin;
        }
        this.e += (long) iRemaining;
        return iRemaining;
    }

    @NotNull
    public final void x1(int i) {
        String strF;
        int i2 = 0;
        if (i < 128) {
            j1(i);
            return;
        }
        if (i < 2048) {
            C7782yE1 c7782yE1V0 = V0(2);
            int i3 = c7782yE1V0.c;
            byte[] bArr = c7782yE1V0.a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            c7782yE1V0.c = i3 + 2;
            this.e += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            j1(63);
            return;
        }
        if (i < 65536) {
            C7782yE1 c7782yE1V1 = V0(3);
            int i4 = c7782yE1V1.c;
            byte[] bArr2 = c7782yE1V1.a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr2[2 + i4] = (byte) ((i & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            c7782yE1V1.c = i4 + 3;
            this.e += 3;
            return;
        }
        if (i <= 1114111) {
            C7782yE1 c7782yE1V2 = V0(4);
            int i5 = c7782yE1V2.c;
            byte[] bArr3 = c7782yE1V2.a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr3[3 + i5] = (byte) ((i & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            c7782yE1V2.c = i5 + 4;
            this.e += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        b bVar = C5417n.a;
        if (i != 0) {
            char[] cArr = C3476e.d;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            strF = d.f(cArr2, i2, 8);
        } else {
            strF = "0";
        }
        sb.append(strF);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.InterfaceC2606Zu
    public final /* bridge */ /* synthetic */ InterfaceC2606Zu y0(String str) {
        w1(str);
        return this;
    }

    @Override // defpackage.InterfaceC2833av
    public final long z0(@NotNull KM1 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = this.e;
        if (j > 0) {
            sink.i1(this, j);
        }
        return j;
    }

    /* JADX INFO: renamed from: Lu$a */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(C1481Lu.this.e, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream
        public final int read() {
            C1481Lu c1481Lu = C1481Lu.this;
            if (c1481Lu.e > 0) {
                return c1481Lu.P() & 255;
            }
            return -1;
        }

        @NotNull
        public final String toString() {
            return C1481Lu.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] sink, int i, int i2) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C1481Lu.this.G(sink, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.KM1
    public final void close() {
    }

    @Override // defpackage.KM1, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.InterfaceC2833av, defpackage.InterfaceC2606Zu
    @NotNull
    public final C1481Lu n() {
        return this;
    }
}

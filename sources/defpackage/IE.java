package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class IE {
    public final byte[] a;
    public final int b;
    public int c = 0;
    public final OutputStream d;

    public static class a extends IOException {
    }

    public IE(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.a = bArr;
        this.b = bArr.length;
    }

    public static int a(int i, int i2) {
        return c(i2) + h(i);
    }

    public static int b(int i, int i2) {
        return c(i2) + h(i);
    }

    public static int c(int i) {
        if (i >= 0) {
            return f(i);
        }
        return 10;
    }

    public static int d(int i, HZ0 hz0) {
        return e(hz0) + h(i);
    }

    public static int e(HZ0 hz0) {
        int iA = hz0.a();
        return f(iA) + iA;
    }

    public static int f(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i) {
        return f(i << 3);
    }

    public static IE j(OutputStream outputStream, int i) {
        return new IE(outputStream, new byte[i]);
    }

    public final void i() throws IOException {
        if (this.d != null) {
            k();
        }
    }

    public final void k() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream == null) {
            throw new a("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write(this.a, 0, this.c);
        this.c = 0;
    }

    public final void l(int i, int i2) {
        x(i, 0);
        n(i2);
    }

    public final void m(int i, int i2) {
        x(i, 0);
        n(i2);
    }

    public final void n(int i) {
        if (i >= 0) {
            v(i);
        } else {
            w(i);
        }
    }

    public final void o(int i, HZ0 hz0) {
        x(i, 2);
        p(hz0);
    }

    public final void p(HZ0 hz0) {
        v(hz0.a());
        hz0.h(this);
    }

    public final void q(int i) throws IOException {
        byte b = (byte) i;
        if (this.c == this.b) {
            k();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        this.a[i2] = b;
    }

    public final void r(AbstractC1724Ow abstractC1724Ow) {
        int size = abstractC1724Ow.size();
        int i = this.c;
        int i2 = this.b;
        int i3 = i2 - i;
        byte[] bArr = this.a;
        if (i3 >= size) {
            abstractC1724Ow.c(0, bArr, i, size);
            this.c += size;
            return;
        }
        abstractC1724Ow.c(0, bArr, i, i3);
        int i4 = size - i3;
        this.c = i2;
        k();
        if (i4 <= i2) {
            abstractC1724Ow.c(i3, bArr, 0, i4);
            this.c = i4;
            return;
        }
        if (i3 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i3);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i4 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i4);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i5 = i3 + i4;
        if (i5 <= abstractC1724Ow.size()) {
            if (i4 > 0) {
                abstractC1724Ow.s(this.d, i3, i4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i5);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final void s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.c;
        int i2 = this.b;
        int i3 = i2 - i;
        byte[] bArr2 = this.a;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.c = i2;
        k();
        if (i4 > i2) {
            this.d.write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.c = i4;
        }
    }

    public final void t(int i) {
        q(i & 255);
        q((i >> 8) & 255);
        q((i >> 16) & 255);
        q((i >> 24) & 255);
    }

    public final void u(long j) {
        q(((int) j) & 255);
        q(((int) (j >> 8)) & 255);
        q(((int) (j >> 16)) & 255);
        q(((int) (j >> 24)) & 255);
        q(((int) (j >> 32)) & 255);
        q(((int) (j >> 40)) & 255);
        q(((int) (j >> 48)) & 255);
        q(((int) (j >> 56)) & 255);
    }

    public final void v(int i) {
        while ((i & (-128)) != 0) {
            q((i & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i >>>= 7;
        }
        q(i);
    }

    public final void w(long j) {
        while (((-128) & j) != 0) {
            q((((int) j) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j >>>= 7;
        }
        q((int) j);
    }

    public final void x(int i, int i2) {
        v((i << 3) | i2);
    }
}

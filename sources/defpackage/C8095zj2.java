package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: zj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8095zj2 {
    public final byte[] a;
    public int b;
    public final int c;

    public C8095zj2(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.b = 0;
        this.c = length;
    }

    public static void a(int i, int i2, int i3) throws IOException {
        String str;
        if (i2 == i3) {
            return;
        }
        StringBuilder sbC = C1332Jw.c(i, "Field ", ": expected ");
        String str2 = "varint";
        if (i2 == 0) {
            str = "varint";
        } else if (i2 == 1) {
            str = "fixed64";
        } else if (i2 != 2) {
            str = i2 != 5 ? "unknown" : "fixed32";
        } else {
            str = "length-delimited";
        }
        sbC.append(str);
        sbC.append(" (wire type ");
        sbC.append(i2);
        sbC.append(") but got ");
        if (i3 != 0) {
            if (i3 == 1) {
                str2 = "fixed64";
            } else if (i3 != 2) {
                str2 = i3 != 5 ? "unknown" : "fixed32";
            } else {
                str2 = "length-delimited";
            }
        }
        sbC.append(str2);
        sbC.append(" (wire type ");
        sbC.append(i3);
        sbC.append(")");
        throw new IOException(sbC.toString());
    }

    public final boolean b() {
        return g() != 0;
    }

    public final byte[] c() throws IOException {
        int iG = (int) g();
        if (iG < 0) {
            throw new IOException(EK.e(iG, "Negative length: "));
        }
        int i = this.b;
        if (this.c - i < iG) {
            throw new EOFException("Not enough bytes for length-delimited field");
        }
        byte[] bArr = new byte[iG];
        System.arraycopy(this.a, i, bArr, 0, iG);
        this.b += iG;
        return bArr;
    }

    public final C8095zj2 d() {
        return new C8095zj2(c());
    }

    public final String e() {
        return new String(c(), StandardCharsets.UTF_8);
    }

    public final int f() {
        if (this.b < this.c) {
            return (int) g();
        }
        return 0;
    }

    public final long g() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.b;
            if (i2 >= this.c) {
                throw new EOFException("Truncated varint");
            }
            this.b = i2 + 1;
            byte b = this.a[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new IOException("Malformed varint");
    }

    public final void h(int i) throws IOException {
        if (i == 0) {
            g();
            return;
        }
        int i2 = this.c;
        if (i == 1) {
            int i3 = this.b;
            if (i2 - i3 < 8) {
                throw new EOFException("Not enough bytes to skip fixed64");
            }
            this.b = i3 + 8;
            return;
        }
        if (i == 2) {
            int iG = (int) g();
            int i4 = this.b;
            if (i2 - i4 < iG) {
                throw new EOFException("Not enough bytes to skip length-delimited");
            }
            this.b = i4 + iG;
            return;
        }
        if (i != 5) {
            throw new IOException(EK.e(i, "Unknown wire type: "));
        }
        int i5 = this.b;
        if (i2 - i5 < 4) {
            throw new EOFException("Not enough bytes to skip fixed32");
        }
        this.b = i5 + 4;
    }
}

package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class GE extends G1 {
    public static final Logger f = Logger.getLogger(GE.class.getName());
    public static final boolean g = C4614j92.e;
    public KE e;

    public static abstract class a extends GE {
        public final byte[] h;
        public final int i;
        public int j;

        public a(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.h = bArr;
            this.i = bArr.length;
        }

        public final void c0(int i) {
            int i2 = this.j;
            int i3 = i2 + 1;
            this.j = i3;
            byte[] bArr = this.h;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.j = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.j = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.j = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        public final void d0(long j) {
            int i = this.j;
            int i2 = i + 1;
            this.j = i2;
            byte[] bArr = this.h;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.j = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.j = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.j = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.j = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.j = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.j = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.j = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void e0(int i, int i2) {
            f0((i << 3) | i2);
        }

        public final void f0(int i) {
            boolean z = GE.g;
            byte[] bArr = this.h;
            if (z) {
                while ((i & (-128)) != 0) {
                    int i2 = this.j;
                    this.j = i2 + 1;
                    C4614j92.j(bArr, i2, (byte) ((i | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                    i >>>= 7;
                }
                int i3 = this.j;
                this.j = i3 + 1;
                C4614j92.j(bArr, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                int i4 = this.j;
                this.j = i4 + 1;
                bArr[i4] = (byte) ((i | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                i >>>= 7;
            }
            int i5 = this.j;
            this.j = i5 + 1;
            bArr[i5] = (byte) i;
        }

        public final void g0(long j) {
            boolean z = GE.g;
            byte[] bArr = this.h;
            if (z) {
                while ((j & (-128)) != 0) {
                    int i = this.j;
                    this.j = i + 1;
                    C4614j92.j(bArr, i, (byte) ((((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                    j >>>= 7;
                }
                int i2 = this.j;
                this.j = i2 + 1;
                C4614j92.j(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i3 = this.j;
                this.j = i3 + 1;
                bArr[i3] = (byte) ((((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                j >>>= 7;
            }
            int i4 = this.j;
            this.j = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    public static class b extends GE {
        public final byte[] h;
        public final int i;
        public int j;

        public b(int i, byte[] bArr) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.h = bArr;
            this.j = 0;
            this.i = i;
        }

        @Override // defpackage.GE
        public final void G(byte b) throws c {
            try {
                byte[] bArr = this.h;
                int i = this.j;
                this.j = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        @Override // defpackage.GE
        public final void H(int i, boolean z) throws c {
            X(i, 0);
            G(z ? (byte) 1 : (byte) 0);
        }

        @Override // defpackage.GE
        public final void I(int i, byte[] bArr) throws c {
            Z(i);
            c0(bArr, 0, i);
        }

        @Override // defpackage.GE
        public final void J(int i, AbstractC1565Mw abstractC1565Mw) throws c {
            X(i, 2);
            K(abstractC1565Mw);
        }

        @Override // defpackage.GE
        public final void K(AbstractC1565Mw abstractC1565Mw) throws c {
            Z(abstractC1565Mw.size());
            abstractC1565Mw.i(this);
        }

        @Override // defpackage.GE
        public final void L(int i, int i2) throws c {
            X(i, 5);
            M(i2);
        }

        @Override // defpackage.GE
        public final void M(int i) throws c {
            try {
                byte[] bArr = this.h;
                int i2 = this.j;
                int i3 = i2 + 1;
                this.j = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.j = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.j = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.j = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        @Override // defpackage.GE
        public final void N(int i, long j) throws c {
            X(i, 1);
            O(j);
        }

        @Override // defpackage.GE
        public final void O(long j) throws c {
            try {
                byte[] bArr = this.h;
                int i = this.j;
                int i2 = i + 1;
                this.j = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.j = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.j = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.j = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.j = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.j = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.j = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.j = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        @Override // defpackage.GE
        public final void P(int i, int i2) throws c {
            X(i, 0);
            Q(i2);
        }

        @Override // defpackage.GE
        public final void Q(int i) throws c {
            if (i >= 0) {
                Z(i);
            } else {
                b0(i);
            }
        }

        @Override // defpackage.GE
        public final void R(int i, IZ0 iz0, InterfaceC7989zD1 interfaceC7989zD1) throws c {
            X(i, 2);
            Z(((F0) iz0).f(interfaceC7989zD1));
            interfaceC7989zD1.h(iz0, this.e);
        }

        @Override // defpackage.GE
        public final void S(IZ0 iz0) throws c {
            Z(iz0.a());
            iz0.b(this);
        }

        @Override // defpackage.GE
        public final void T(int i, IZ0 iz0) throws c {
            X(1, 3);
            Y(2, i);
            X(3, 2);
            S(iz0);
            X(1, 4);
        }

        @Override // defpackage.GE
        public final void U(int i, AbstractC1565Mw abstractC1565Mw) throws c {
            X(1, 3);
            Y(2, i);
            J(3, abstractC1565Mw);
            X(1, 4);
        }

        @Override // defpackage.GE
        public final void V(int i, String str) throws c {
            X(i, 2);
            W(str);
        }

        @Override // defpackage.GE
        public final void W(String str) throws c {
            int i = this.j;
            try {
                int iD = GE.D(str.length() * 3);
                int iD2 = GE.D(str.length());
                int i2 = this.i;
                byte[] bArr = this.h;
                if (iD2 != iD) {
                    Z(C5547nc2.a(str));
                    int i3 = this.j;
                    this.j = C5547nc2.a.b(str, bArr, i3, i2 - i3);
                    return;
                }
                int i4 = i + iD2;
                this.j = i4;
                int iB = C5547nc2.a.b(str, bArr, i4, i2 - i4);
                this.j = i;
                Z((iB - i) - iD2);
                this.j = iB;
            } catch (IndexOutOfBoundsException e) {
                throw new c(e);
            } catch (C5547nc2.d e2) {
                this.j = i;
                F(str, e2);
            }
        }

        @Override // defpackage.GE
        public final void X(int i, int i2) throws c {
            Z((i << 3) | i2);
        }

        @Override // defpackage.GE
        public final void Y(int i, int i2) throws c {
            X(i, 0);
            Z(i2);
        }

        @Override // defpackage.GE
        public final void Z(int i) throws c {
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.h;
                if (i2 == 0) {
                    int i3 = this.j;
                    this.j = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        int i4 = this.j;
                        this.j = i4 + 1;
                        bArr[i4] = (byte) ((i | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
                    }
                }
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        @Override // defpackage.GE
        public final void a0(int i, long j) throws c {
            X(i, 0);
            b0(j);
        }

        @Override // defpackage.GE
        public final void b0(long j) throws c {
            boolean z = GE.g;
            int i = this.i;
            byte[] bArr = this.h;
            if (z && i - this.j >= 10) {
                while ((j & (-128)) != 0) {
                    int i2 = this.j;
                    this.j = i2 + 1;
                    C4614j92.j(bArr, i2, (byte) ((((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                    j >>>= 7;
                }
                int i3 = this.j;
                this.j = i3 + 1;
                C4614j92.j(bArr, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i4 = this.j;
                    this.j = i4 + 1;
                    bArr[i4] = (byte) ((((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(i), 1), e);
                }
            }
            int i5 = this.j;
            this.j = i5 + 1;
            bArr[i5] = (byte) j;
        }

        public final void c0(byte[] bArr, int i, int i2) throws c {
            try {
                System.arraycopy(bArr, i, this.h, this.j, i2);
                this.j += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), Integer.valueOf(i2)), e);
            }
        }

        @Override // defpackage.G1
        public final void v(byte[] bArr, int i, int i2) throws c {
            c0(bArr, i, i2);
        }
    }

    public static class c extends IOException {
        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public static final class d extends a {
        public final C6922u82 k;

        public d(C6922u82 c6922u82, int i) {
            super(i);
            this.k = c6922u82;
        }

        @Override // defpackage.GE
        public final void G(byte b) throws IOException {
            if (this.j == this.i) {
                h0();
            }
            int i = this.j;
            this.j = i + 1;
            this.h[i] = b;
        }

        @Override // defpackage.GE
        public final void H(int i, boolean z) throws IOException {
            i0(11);
            e0(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.j;
            this.j = i2 + 1;
            this.h[i2] = b;
        }

        @Override // defpackage.GE
        public final void I(int i, byte[] bArr) throws IOException {
            Z(i);
            j0(bArr, 0, i);
        }

        @Override // defpackage.GE
        public final void J(int i, AbstractC1565Mw abstractC1565Mw) throws IOException {
            X(i, 2);
            K(abstractC1565Mw);
        }

        @Override // defpackage.GE
        public final void K(AbstractC1565Mw abstractC1565Mw) throws IOException {
            Z(abstractC1565Mw.size());
            abstractC1565Mw.i(this);
        }

        @Override // defpackage.GE
        public final void L(int i, int i2) throws IOException {
            i0(14);
            e0(i, 5);
            c0(i2);
        }

        @Override // defpackage.GE
        public final void M(int i) throws IOException {
            i0(4);
            c0(i);
        }

        @Override // defpackage.GE
        public final void N(int i, long j) throws IOException {
            i0(18);
            e0(i, 1);
            d0(j);
        }

        @Override // defpackage.GE
        public final void O(long j) throws IOException {
            i0(8);
            d0(j);
        }

        @Override // defpackage.GE
        public final void P(int i, int i2) throws IOException {
            i0(20);
            e0(i, 0);
            if (i2 >= 0) {
                f0(i2);
            } else {
                g0(i2);
            }
        }

        @Override // defpackage.GE
        public final void Q(int i) throws IOException {
            if (i >= 0) {
                Z(i);
            } else {
                b0(i);
            }
        }

        @Override // defpackage.GE
        public final void R(int i, IZ0 iz0, InterfaceC7989zD1 interfaceC7989zD1) throws IOException {
            X(i, 2);
            Z(((F0) iz0).f(interfaceC7989zD1));
            interfaceC7989zD1.h(iz0, this.e);
        }

        @Override // defpackage.GE
        public final void S(IZ0 iz0) throws IOException {
            Z(iz0.a());
            iz0.b(this);
        }

        @Override // defpackage.GE
        public final void T(int i, IZ0 iz0) throws IOException {
            X(1, 3);
            Y(2, i);
            X(3, 2);
            S(iz0);
            X(1, 4);
        }

        @Override // defpackage.GE
        public final void U(int i, AbstractC1565Mw abstractC1565Mw) throws IOException {
            X(1, 3);
            Y(2, i);
            J(3, abstractC1565Mw);
            X(1, 4);
        }

        @Override // defpackage.GE
        public final void V(int i, String str) throws IOException {
            X(i, 2);
            W(str);
        }

        @Override // defpackage.GE
        public final void W(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iD = GE.D(length);
                int i = iD + length;
                int i2 = this.i;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iB = C5547nc2.a.b(str, bArr, 0, length);
                    Z(iB);
                    j0(bArr, 0, iB);
                    return;
                }
                if (i > i2 - this.j) {
                    h0();
                }
                int iD2 = GE.D(str.length());
                int i3 = this.j;
                byte[] bArr2 = this.h;
                try {
                    if (iD2 == iD) {
                        int i4 = i3 + iD2;
                        this.j = i4;
                        int iB2 = C5547nc2.a.b(str, bArr2, i4, i2 - i4);
                        this.j = i3;
                        f0((iB2 - i3) - iD2);
                        this.j = iB2;
                    } else {
                        int iA = C5547nc2.a(str);
                        f0(iA);
                        this.j = C5547nc2.a.b(str, bArr2, this.j, iA);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new c(e);
                } catch (C5547nc2.d e2) {
                    this.j = i3;
                    throw e2;
                }
            } catch (C5547nc2.d e3) {
                F(str, e3);
            }
        }

        @Override // defpackage.GE
        public final void X(int i, int i2) throws IOException {
            Z((i << 3) | i2);
        }

        @Override // defpackage.GE
        public final void Y(int i, int i2) throws IOException {
            i0(20);
            e0(i, 0);
            f0(i2);
        }

        @Override // defpackage.GE
        public final void Z(int i) throws IOException {
            i0(5);
            f0(i);
        }

        @Override // defpackage.GE
        public final void a0(int i, long j) throws IOException {
            i0(20);
            e0(i, 0);
            g0(j);
        }

        @Override // defpackage.GE
        public final void b0(long j) throws IOException {
            i0(10);
            g0(j);
        }

        public final void h0() throws IOException {
            this.k.write(this.h, 0, this.j);
            this.j = 0;
        }

        public final void i0(int i) throws IOException {
            if (this.i - this.j < i) {
                h0();
            }
        }

        public final void j0(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.j;
            int i4 = this.i;
            int i5 = i4 - i3;
            byte[] bArr2 = this.h;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.j += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.j = i4;
            h0();
            if (i7 > i4) {
                this.k.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.j = i7;
            }
        }

        @Override // defpackage.G1
        public final void v(byte[] bArr, int i, int i2) throws IOException {
            j0(bArr, i, i2);
        }
    }

    public static int A(long j) {
        return E((j >> 63) ^ (j << 1));
    }

    public static int B(String str) {
        int length;
        try {
            length = C5547nc2.a(str);
        } catch (C5547nc2.d unused) {
            length = str.getBytes(VB0.a).length;
        }
        return D(length) + length;
    }

    public static int C(int i) {
        return D(i << 3);
    }

    public static int D(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int E(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int w(int i, AbstractC1565Mw abstractC1565Mw) {
        return x(abstractC1565Mw) + C(i);
    }

    public static int x(AbstractC1565Mw abstractC1565Mw) {
        int size = abstractC1565Mw.size();
        return D(size) + size;
    }

    public static int y(C5921pO0 c5921pO0) {
        int iA;
        if (c5921pO0.b != null) {
            iA = c5921pO0.b.size();
        } else {
            iA = c5921pO0.a != null ? c5921pO0.a.a() : 0;
        }
        return D(iA) + iA;
    }

    public static int z(int i) {
        return D((i >> 31) ^ (i << 1));
    }

    public final void F(String str, C5547nc2.d dVar) throws c {
        f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(VB0.a);
        try {
            Z(bytes.length);
            v(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new c(e);
        }
    }

    public abstract void G(byte b2);

    public abstract void H(int i, boolean z);

    public abstract void I(int i, byte[] bArr);

    public abstract void J(int i, AbstractC1565Mw abstractC1565Mw);

    public abstract void K(AbstractC1565Mw abstractC1565Mw);

    public abstract void L(int i, int i2);

    public abstract void M(int i);

    public abstract void N(int i, long j);

    public abstract void O(long j);

    public abstract void P(int i, int i2);

    public abstract void Q(int i);

    public abstract void R(int i, IZ0 iz0, InterfaceC7989zD1 interfaceC7989zD1);

    public abstract void S(IZ0 iz0);

    public abstract void T(int i, IZ0 iz0);

    public abstract void U(int i, AbstractC1565Mw abstractC1565Mw);

    public abstract void V(int i, String str);

    public abstract void W(String str);

    public abstract void X(int i, int i2);

    public abstract void Y(int i, int i2);

    public abstract void Z(int i);

    public abstract void a0(int i, long j);

    public abstract void b0(long j);
}

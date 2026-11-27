package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class HE extends G1 {
    public static final Logger f = Logger.getLogger(HE.class.getName());
    public static final boolean g = C4356i92.e;
    public JE e;

    public static class a extends HE {
        public final byte[] h;
        public final int i;
        public int j;

        public a(int i, byte[] bArr) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.h = bArr;
            this.j = 0;
            this.i = i;
        }

        public final int I() {
            return this.i - this.j;
        }

        public final void J(byte b) {
            try {
                byte[] bArr = this.h;
                int i = this.j;
                this.j = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        public final void K(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.h, this.j, i2);
                this.j += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), Integer.valueOf(i2)), e);
            }
        }

        public final void L(int i, boolean z) {
            X(i, 0);
            J(z ? (byte) 1 : (byte) 0);
        }

        public final void M(int i, AbstractC1646Nw abstractC1646Nw) {
            X(i, 2);
            N(abstractC1646Nw);
        }

        public final void N(AbstractC1646Nw abstractC1646Nw) {
            Z(abstractC1646Nw.size());
            abstractC1646Nw.i(this);
        }

        public final void O(int i, int i2) {
            X(i, 5);
            P(i2);
        }

        public final void P(int i) {
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        public final void Q(int i, long j) {
            X(i, 1);
            R(j);
        }

        public final void R(long j) {
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
            }
        }

        public final void S(int i, int i2) {
            X(i, 0);
            T(i2);
        }

        public final void T(int i) {
            if (i >= 0) {
                Z(i);
            } else {
                b0(i);
            }
        }

        public final void U(GZ0 gz0) {
            Z(gz0.a());
            gz0.l(this);
        }

        public final void V(int i, String str) {
            X(i, 2);
            W(str);
        }

        public final void W(String str) {
            int i = this.j;
            try {
                int iG = HE.G(str.length() * 3);
                int iG2 = HE.G(str.length());
                byte[] bArr = this.h;
                if (iG2 != iG) {
                    Z(C5757oc2.b(str));
                    this.j = C5757oc2.a.a(str, bArr, this.j, I());
                    return;
                }
                int i2 = i + iG2;
                this.j = i2;
                int iA = C5757oc2.a.a(str, bArr, i2, I());
                this.j = i;
                Z((iA - i) - iG2);
                this.j = iA;
            } catch (IndexOutOfBoundsException e) {
                throw new b(e);
            } catch (C5757oc2.c e2) {
                this.j = i;
                HE.f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                byte[] bytes = str.getBytes(XB0.a);
                try {
                    Z(bytes.length);
                    K(bytes, 0, bytes.length);
                } catch (b e3) {
                    throw e3;
                } catch (IndexOutOfBoundsException e4) {
                    throw new b(e4);
                }
            }
        }

        public final void X(int i, int i2) {
            Z((i << 3) | i2);
        }

        public final void Y(int i, int i2) {
            X(i, 0);
            Z(i2);
        }

        public final void Z(int i) {
            boolean z = HE.g;
            byte[] bArr = this.h;
            if (!z || C1970Sa.a() || I() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        int i2 = this.j;
                        this.j = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
                    }
                }
                int i3 = this.j;
                this.j = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                int i4 = this.j;
                this.j = i4 + 1;
                C4356i92.k(bArr, i4, (byte) i);
                return;
            }
            int i5 = this.j;
            this.j = i5 + 1;
            C4356i92.k(bArr, i5, (byte) (i | UserVerificationMethods.USER_VERIFY_PATTERN));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                int i7 = this.j;
                this.j = i7 + 1;
                C4356i92.k(bArr, i7, (byte) i6);
                return;
            }
            int i8 = this.j;
            this.j = i8 + 1;
            C4356i92.k(bArr, i8, (byte) (i6 | UserVerificationMethods.USER_VERIFY_PATTERN));
            int i9 = i >>> 14;
            if ((i9 & (-128)) == 0) {
                int i10 = this.j;
                this.j = i10 + 1;
                C4356i92.k(bArr, i10, (byte) i9);
                return;
            }
            int i11 = this.j;
            this.j = i11 + 1;
            C4356i92.k(bArr, i11, (byte) (i9 | UserVerificationMethods.USER_VERIFY_PATTERN));
            int i12 = i >>> 21;
            if ((i12 & (-128)) == 0) {
                int i13 = this.j;
                this.j = i13 + 1;
                C4356i92.k(bArr, i13, (byte) i12);
            } else {
                int i14 = this.j;
                this.j = i14 + 1;
                C4356i92.k(bArr, i14, (byte) (i12 | UserVerificationMethods.USER_VERIFY_PATTERN));
                int i15 = this.j;
                this.j = i15 + 1;
                C4356i92.k(bArr, i15, (byte) (i >>> 28));
            }
        }

        public final void a0(int i, long j) {
            X(i, 0);
            b0(j);
        }

        public final void b0(long j) {
            boolean z = HE.g;
            byte[] bArr = this.h;
            if (z && I() >= 10) {
                while ((j & (-128)) != 0) {
                    int i = this.j;
                    this.j = i + 1;
                    C4356i92.k(bArr, i, (byte) ((((int) j) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j >>>= 7;
                }
                int i2 = this.j;
                this.j = i2 + 1;
                C4356i92.k(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i3 = this.j;
                    this.j = i3 + 1;
                    bArr[i3] = (byte) ((((int) j) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.i), 1), e);
                }
            }
            int i4 = this.j;
            this.j = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    public static class b extends IOException {
        public b(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public b(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    @Deprecated
    public static int A(int i, GZ0 gz0, InterfaceC7779yD1 interfaceC7779yD1) {
        int iE = E(i) * 2;
        G0 g0 = (G0) gz0;
        int iF = g0.f();
        if (iF == -1) {
            iF = interfaceC7779yD1.g(g0);
            g0.o(iF);
        }
        return iF + iE;
    }

    public static int B(int i) {
        if (i >= 0) {
            return G(i);
        }
        return 10;
    }

    public static int C(C5501nO0 c5501nO0) {
        int iA;
        if (c5501nO0.b != null) {
            iA = c5501nO0.b.size();
        } else {
            iA = c5501nO0.a != null ? c5501nO0.a.a() : 0;
        }
        return G(iA) + iA;
    }

    public static int D(String str) {
        int length;
        try {
            length = C5757oc2.b(str);
        } catch (C5757oc2.c unused) {
            length = str.getBytes(XB0.a).length;
        }
        return G(length) + length;
    }

    public static int E(int i) {
        return G(i << 3);
    }

    public static int F(int i, int i2) {
        return G(i2) + E(i);
    }

    public static int G(int i) {
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

    public static int H(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int w(int i, AbstractC1646Nw abstractC1646Nw) {
        return x(abstractC1646Nw) + E(i);
    }

    public static int x(AbstractC1646Nw abstractC1646Nw) {
        int size = abstractC1646Nw.size();
        return G(size) + size;
    }

    public static int y(int i) {
        return E(i) + 4;
    }

    public static int z(int i) {
        return E(i) + 8;
    }
}

package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import javax.annotation.Nullable;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class SH0 extends AbstractC8000zH0 {
    public static final C1802Pw o;
    public static final C1802Pw p;
    public static final C1802Pw q;
    public static final C1802Pw r;
    public static final C1802Pw s;
    public final InterfaceC2833av i;
    public final C1481Lu j;
    public int k = 0;
    public long l;
    public int m;

    @Nullable
    public String n;

    static {
        C1802Pw c1802Pw = C1802Pw.h;
        o = C1802Pw.a.c("'\\");
        p = C1802Pw.a.c("\"\\");
        q = C1802Pw.a.c("{}[]:, \n\t\r\f/\\;#=");
        r = C1802Pw.a.c("\n\r");
        s = C1802Pw.a.c("*/");
    }

    public SH0(InterfaceC2833av interfaceC2833av) {
        this.i = interfaceC2833av;
        this.j = interfaceC2833av.n();
        p(6);
    }

    public final void A() throws WG0 {
        v("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // defpackage.AbstractC8000zH0
    public final String B() throws WG0, EOFException {
        String strM0;
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 10) {
            strM0 = X();
        } else if (iC == 9) {
            strM0 = W(p);
        } else if (iC == 8) {
            strM0 = W(o);
        } else if (iC == 11) {
            strM0 = this.n;
            this.n = null;
        } else if (iC == 16) {
            strM0 = Long.toString(this.l);
        } else {
            if (iC != 17) {
                throw new EG0("Expected a string but was " + k() + " at path " + c());
            }
            long j = this.m;
            C1481Lu c1481Lu = this.j;
            c1481Lu.getClass();
            strM0 = c1481Lu.M0(j, Charsets.UTF_8);
        }
        this.k = 0;
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return strM0;
    }

    @Override // defpackage.AbstractC8000zH0
    public final void B0() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC != 2) {
            throw new EG0("Expected END_OBJECT but was " + k() + " at path " + c());
        }
        int i = this.d;
        int i2 = i - 1;
        this.d = i2;
        this.g[i2] = null;
        int[] iArr = this.h;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.k = 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0152  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e0 A[DONT_INVERT, PHI: r3
      0x01e0: PHI (r3v9 int) = (r3v8 int), (r3v12 int) binds: [B:141:0x01b8, B:147:0x01c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:169:0x0200  */
    /* JADX WARN: Code duplicated, block: B:171:0x0204  */
    /* JADX WARN: Code duplicated, block: B:174:0x0209  */
    /* JADX WARN: Code duplicated, block: B:179:0x0216 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:180:0x0217  */
    /* JADX WARN: Code duplicated, block: B:182:0x0223  */
    /* JADX WARN: Code duplicated, block: B:184:0x022b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0248  */
    /* JADX WARN: Code duplicated, block: B:203:0x025c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0267  */
    /* JADX WARN: Code duplicated, block: B:245:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    public final int C() throws WG0, EOFException {
        int i;
        int iP;
        int i2;
        int i3;
        String str;
        String str2;
        long j;
        char cV;
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        long j3;
        int i8;
        int i9;
        byte bV;
        int i10;
        int[] iArr = this.e;
        int i11 = 1;
        int i12 = this.d - 1;
        int i13 = iArr[i12];
        InterfaceC2833av interfaceC2833av = this.i;
        long j4 = 0;
        C1481Lu c1481Lu = this.j;
        if (i13 == 1) {
            iArr[i12] = 2;
        } else if (i13 == 2) {
            int iP2 = P(true);
            c1481Lu.P();
            if (iP2 != 44) {
                if (iP2 != 59) {
                    if (iP2 == 93) {
                        this.k = 4;
                        return 4;
                    }
                    v("Unterminated array");
                    throw null;
                }
                A();
            }
        } else {
            if (i13 == 3 || i13 == 5) {
                iArr[i12] = 4;
                if (i13 == 5) {
                    int iP3 = P(true);
                    c1481Lu.P();
                    if (iP3 != 44) {
                        if (iP3 != 59) {
                            if (iP3 == 125) {
                                this.k = 2;
                                return 2;
                            }
                            v("Unterminated object");
                            throw null;
                        }
                        A();
                    }
                }
                int iP4 = P(true);
                if (iP4 == 34) {
                    c1481Lu.P();
                    this.k = 13;
                    return 13;
                }
                if (iP4 == 39) {
                    c1481Lu.P();
                    A();
                    this.k = 12;
                    return 12;
                }
                if (iP4 != 125) {
                    A();
                    if (L((char) iP4)) {
                        this.k = 14;
                        return 14;
                    }
                    v("Expected name");
                    throw null;
                }
                if (i13 == 5) {
                    v("Expected name");
                    throw null;
                }
                c1481Lu.P();
                this.k = 2;
                return 2;
            }
            if (i13 != 4) {
                if (i13 == 6) {
                    iArr[i12] = 7;
                } else if (i13 == 7) {
                    i = 0;
                    if (P(false) == -1) {
                        this.k = 18;
                        return 18;
                    }
                    A();
                } else {
                    i = 0;
                    if (i13 == 9) {
                        throw null;
                    }
                    if (i13 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iP = P(true);
                if (iP != 34) {
                    c1481Lu.P();
                    this.k = 9;
                    return 9;
                }
                if (iP != 39) {
                    A();
                    c1481Lu.P();
                    this.k = 8;
                    return 8;
                }
                if (iP != 44 || iP == 59) {
                    i2 = 1;
                } else {
                    if (iP == 91) {
                        c1481Lu.P();
                        this.k = 3;
                        return 3;
                    }
                    if (iP != 93) {
                        if (iP == 123) {
                            c1481Lu.P();
                            this.k = 1;
                            return 1;
                        }
                        byte bV2 = c1481Lu.v(0L);
                        if (bV2 == 116 || bV2 == 84) {
                            i3 = 5;
                            str2 = "true";
                            str = "TRUE";
                        } else {
                            if (bV2 != 102 && bV2 != 70) {
                                if (bV2 == 110 || bV2 == 78) {
                                    i3 = 7;
                                    str2 = "null";
                                    str = "NULL";
                                } else {
                                    i3 = i;
                                    j = 0;
                                }
                                if (i3 != 0) {
                                    return i3;
                                }
                                i4 = i;
                                i5 = i4;
                                int i14 = i5;
                                i6 = 1;
                                j2 = j;
                                while (true) {
                                    i7 = i5 + 1;
                                    j3 = j2;
                                    if (interfaceC2833av.s(i7)) {
                                        bV = c1481Lu.v(i5);
                                        if (bV != 43) {
                                            if (bV != 69 || bV == 101) {
                                                if (i4 != 2 || i4 == 4) {
                                                    i4 = 5;
                                                    i5 = i7;
                                                    j2 = j3;
                                                    i11 = 1;
                                                } else {
                                                    i9 = i;
                                                }
                                            } else if (bV == 45) {
                                                i10 = 6;
                                                if (i4 == 0) {
                                                    i4 = 1;
                                                    i14 = 1;
                                                } else {
                                                    if (i4 != 5) {
                                                        i9 = i;
                                                    }
                                                    i4 = i10;
                                                }
                                                i5 = i7;
                                                j2 = j3;
                                                i11 = 1;
                                            } else if (bV != 46) {
                                                if (bV >= 48 && bV <= 57) {
                                                    if (i4 == i11 || i4 == 0) {
                                                        j3 = -(bV - 48);
                                                        i4 = 2;
                                                    } else if (i4 == 2) {
                                                        if (j3 != j) {
                                                            long j5 = (10 * j3) - ((long) (bV - 48));
                                                            i6 &= (j3 > -922337203685477580L || (j3 == -922337203685477580L && j5 < j3)) ? 1 : i;
                                                            j3 = j5;
                                                        }
                                                    } else if (i4 == 3) {
                                                        i4 = 4;
                                                    } else if (i4 == 5 || i4 == 6) {
                                                        i4 = 7;
                                                    }
                                                    i5 = i7;
                                                    j2 = j3;
                                                    i11 = 1;
                                                } else if (!L(bV)) {
                                                }
                                                i9 = i;
                                            } else if (i4 == 2) {
                                                i4 = 3;
                                                i5 = i7;
                                                j2 = j3;
                                                i11 = 1;
                                            } else {
                                                i9 = i;
                                            }
                                            if (i9 != 0) {
                                                return i9;
                                            }
                                            if (L(c1481Lu.v(j))) {
                                                v("Expected value");
                                                throw null;
                                            }
                                            A();
                                            this.k = 10;
                                            return 10;
                                        }
                                        i10 = 6;
                                        if (i4 != 5) {
                                            i9 = i;
                                            if (i9 != 0) {
                                                return i9;
                                            }
                                            if (L(c1481Lu.v(j))) {
                                                v("Expected value");
                                                throw null;
                                            }
                                            A();
                                            this.k = 10;
                                            return 10;
                                        }
                                        i4 = i10;
                                        i5 = i7;
                                        j2 = j3;
                                        i11 = 1;
                                    }
                                    i8 = 2;
                                    if (i4 != 2) {
                                        if (i4 != i8 || i4 == 4 || i4 == 7) {
                                            this.m = i5;
                                            i9 = 17;
                                            this.k = 17;
                                        } else {
                                            i9 = i;
                                        }
                                    } else if (i6 != 0 || ((j3 == Long.MIN_VALUE && i14 == 0) || (j3 == j && i14 != 0))) {
                                        i8 = 2;
                                        if (i4 != i8) {
                                        }
                                        this.m = i5;
                                        i9 = 17;
                                        this.k = 17;
                                    } else {
                                        this.l = i14 != 0 ? j3 : -j3;
                                        c1481Lu.r(i5);
                                        i9 = 16;
                                        this.k = 16;
                                    }
                                    if (i9 != 0) {
                                        return i9;
                                    }
                                    if (L(c1481Lu.v(j))) {
                                        v("Expected value");
                                        throw null;
                                    }
                                    A();
                                    this.k = 10;
                                    return 10;
                                }
                            }
                            i3 = 6;
                            str2 = "false";
                            str = "FALSE";
                        }
                        int length = str2.length();
                        int i15 = 1;
                        while (true) {
                            if (i15 >= length) {
                                j = j4;
                                if (!interfaceC2833av.s(length + 1) || !L(c1481Lu.v(length))) {
                                    c1481Lu.r(length);
                                    this.k = i3;
                                    break;
                                }
                            } else {
                                int i16 = i15 + 1;
                                j = j4;
                                if (interfaceC2833av.s(i16) && ((cV = c1481Lu.v(i15)) == str2.charAt(i15) || cV == str.charAt(i15))) {
                                    i15 = i16;
                                    j4 = j;
                                }
                            }
                            i3 = i;
                            break;
                        }
                        if (i3 != 0) {
                            return i3;
                        }
                        i4 = i;
                        i5 = i4;
                        int i17 = i5;
                        i6 = 1;
                        j2 = j;
                        while (true) {
                            i7 = i5 + 1;
                            j3 = j2;
                            if (interfaceC2833av.s(i7)) {
                                bV = c1481Lu.v(i5);
                                if (bV != 43) {
                                    if (bV != 69) {
                                        if (i4 != 2) {
                                        }
                                        i4 = 5;
                                        i5 = i7;
                                        j2 = j3;
                                        i11 = 1;
                                    } else {
                                        if (i4 != 2) {
                                        }
                                        i4 = 5;
                                        i5 = i7;
                                        j2 = j3;
                                        i11 = 1;
                                    }
                                    if (i9 != 0) {
                                        return i9;
                                    }
                                    if (L(c1481Lu.v(j))) {
                                        v("Expected value");
                                        throw null;
                                    }
                                    A();
                                    this.k = 10;
                                    return 10;
                                }
                                i10 = 6;
                                if (i4 != 5) {
                                    i9 = i;
                                    if (i9 != 0) {
                                        return i9;
                                    }
                                    if (L(c1481Lu.v(j))) {
                                        v("Expected value");
                                        throw null;
                                    }
                                    A();
                                    this.k = 10;
                                    return 10;
                                }
                                i4 = i10;
                                i5 = i7;
                                j2 = j3;
                                i11 = 1;
                            }
                            i8 = 2;
                            if (i4 != 2) {
                                if (i4 != i8) {
                                }
                                this.m = i5;
                                i9 = 17;
                                this.k = 17;
                            } else {
                                if (i6 != 0) {
                                }
                                i8 = 2;
                                if (i4 != i8) {
                                }
                                this.m = i5;
                                i9 = 17;
                                this.k = 17;
                            }
                            if (i9 != 0) {
                                return i9;
                            }
                            if (L(c1481Lu.v(j))) {
                                v("Expected value");
                                throw null;
                            }
                            A();
                            this.k = 10;
                            return 10;
                        }
                    }
                    i2 = 1;
                    if (i13 == 1) {
                        c1481Lu.P();
                        this.k = 4;
                        return 4;
                    }
                }
                if (i13 == i2 && i13 != 2) {
                    v("Unexpected value");
                    throw null;
                }
                A();
                this.k = 7;
                return 7;
            }
            iArr[i12] = 5;
            int iP5 = P(true);
            c1481Lu.P();
            if (iP5 != 58) {
                if (iP5 != 61) {
                    v("Expected ':'");
                    throw null;
                }
                A();
                if (interfaceC2833av.s(1L) && c1481Lu.v(0L) == 62) {
                    c1481Lu.P();
                }
            }
        }
        i = 0;
        iP = P(true);
        if (iP != 34) {
            c1481Lu.P();
            this.k = 9;
            return 9;
        }
        if (iP != 39) {
            A();
            c1481Lu.P();
            this.k = 8;
            return 8;
        }
        if (iP != 44) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (i13 == i2) {
        }
        A();
        this.k = 7;
        return 7;
    }

    public final int D(String str, AbstractC8000zH0.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.k = 0;
                this.g[this.d - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC8000zH0
    public final int E0() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 16) {
            long j = this.l;
            int i = (int) j;
            if (j == i) {
                this.k = 0;
                int[] iArr = this.h;
                int i2 = this.d - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new EG0("Expected an int but was " + this.l + " at path " + c());
        }
        if (iC == 17) {
            long j2 = this.m;
            C1481Lu c1481Lu = this.j;
            c1481Lu.getClass();
            this.n = c1481Lu.M0(j2, Charsets.UTF_8);
        } else if (iC == 9 || iC == 8) {
            String strW = iC == 9 ? W(p) : W(o);
            this.n = strW;
            try {
                int i3 = Integer.parseInt(strW);
                this.k = 0;
                int[] iArr2 = this.h;
                int i4 = this.d - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iC != 11) {
            throw new EG0("Expected an int but was " + k() + " at path " + c());
        }
        this.k = 11;
        try {
            double d = Double.parseDouble(this.n);
            int i5 = (int) d;
            if (i5 != d) {
                throw new EG0("Expected an int but was " + this.n + " at path " + c());
            }
            this.n = null;
            this.k = 0;
            int[] iArr3 = this.h;
            int i6 = this.d - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new EG0("Expected an int but was " + this.n + " at path " + c());
        }
    }

    public final int G(String str, AbstractC8000zH0.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.k = 0;
                int[] iArr = this.h;
                int i2 = this.d - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC8000zH0
    public final void I() throws WG0, EOFException {
        int i = 0;
        do {
            int iC = this.k;
            if (iC == 0) {
                iC = C();
            }
            if (iC == 3) {
                p(1);
            } else {
                if (iC == 1) {
                    p(3);
                } else if (iC == 4) {
                    i--;
                    if (i < 0) {
                        throw new EG0("Expected a value but was " + k() + " at path " + c());
                    }
                    this.d--;
                } else if (iC == 2) {
                    i--;
                    if (i < 0) {
                        throw new EG0("Expected a value but was " + k() + " at path " + c());
                    }
                    this.d--;
                } else {
                    C1481Lu c1481Lu = this.j;
                    if (iC == 14 || iC == 10) {
                        long jM0 = this.i.m0(q);
                        if (jM0 == -1) {
                            jM0 = c1481Lu.e;
                        }
                        c1481Lu.r(jM0);
                    } else if (iC == 9 || iC == 13) {
                        i0(p);
                    } else if (iC == 8 || iC == 12) {
                        i0(o);
                    } else if (iC == 17) {
                        c1481Lu.r(this.m);
                    } else if (iC == 18) {
                        throw new EG0("Expected a value but was " + k() + " at path " + c());
                    }
                }
                this.k = 0;
            }
            i++;
            this.k = 0;
        } while (i != 0);
        int[] iArr = this.h;
        int i2 = this.d - 1;
        iArr[i2] = iArr[i2] + 1;
        this.g[i2] = "null";
    }

    public final boolean L(int i) throws WG0 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A();
        return false;
    }

    public final int P(boolean z) throws WG0, EOFException {
        InterfaceC2833av interfaceC2833av;
        long j;
        C1481Lu c1481Lu;
        byte bV;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                interfaceC2833av = this.i;
                if (!interfaceC2833av.s(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                j = i;
                c1481Lu = this.j;
                bV = c1481Lu.v(j);
                if (bV == 10 || bV == 32 || bV == 13 || bV == 9) {
                    i = i2;
                }
            }
            c1481Lu.r(j);
            C1802Pw c1802Pw = r;
            if (bV == 47) {
                if (interfaceC2833av.s(2L)) {
                    A();
                    byte bV2 = c1481Lu.v(1L);
                    if (bV2 == 42) {
                        c1481Lu.P();
                        c1481Lu.P();
                        C1802Pw c1802Pw2 = s;
                        long jM1 = interfaceC2833av.m1(c1802Pw2);
                        boolean z2 = jM1 != -1;
                        c1481Lu.r(z2 ? jM1 + ((long) c1802Pw2.d.length) : c1481Lu.e);
                        if (!z2) {
                            v("Unterminated comment");
                            throw null;
                        }
                    } else if (bV2 == 47) {
                        c1481Lu.P();
                        c1481Lu.P();
                        long jM0 = interfaceC2833av.m0(c1802Pw);
                        c1481Lu.r(jM0 != -1 ? jM0 + 1 : c1481Lu.e);
                    }
                }
                return bV;
            }
            if (bV != 35) {
                return bV;
            }
            A();
            long jM2 = interfaceC2833av.m0(c1802Pw);
            c1481Lu.r(jM2 != -1 ? jM2 + 1 : c1481Lu.e);
        }
    }

    public final String W(C1802Pw c1802Pw) throws WG0, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jM0 = this.i.m0(c1802Pw);
            if (jM0 == -1) {
                v("Unterminated string");
                throw null;
            }
            C1481Lu c1481Lu = this.j;
            if (c1481Lu.v(jM0) != 92) {
                if (sb == null) {
                    String strM0 = c1481Lu.M0(jM0, Charsets.UTF_8);
                    c1481Lu.P();
                    return strM0;
                }
                sb.append(c1481Lu.M0(jM0, Charsets.UTF_8));
                c1481Lu.P();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c1481Lu.M0(jM0, Charsets.UTF_8));
            c1481Lu.P();
            sb.append(Z());
        }
    }

    public final String X() {
        long jM0 = this.i.m0(q);
        C1481Lu c1481Lu = this.j;
        if (jM0 == -1) {
            return c1481Lu.Q0();
        }
        c1481Lu.getClass();
        return c1481Lu.M0(jM0, Charsets.UTF_8);
    }

    @Override // defpackage.AbstractC8000zH0
    public final void X0() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 1) {
            p(3);
            this.k = 0;
        } else {
            throw new EG0("Expected BEGIN_OBJECT but was " + k() + " at path " + c());
        }
    }

    public final char Z() throws WG0, EOFException {
        int i;
        InterfaceC2833av interfaceC2833av = this.i;
        if (!interfaceC2833av.s(1L)) {
            v("Unterminated escape sequence");
            throw null;
        }
        C1481Lu c1481Lu = this.j;
        byte bP = c1481Lu.P();
        if (bP == 10 || bP == 34 || bP == 39 || bP == 47 || bP == 92) {
            return (char) bP;
        }
        if (bP == 98) {
            return '\b';
        }
        if (bP == 102) {
            return '\f';
        }
        if (bP == 110) {
            return '\n';
        }
        if (bP == 114) {
            return '\r';
        }
        if (bP == 116) {
            return '\t';
        }
        if (bP != 117) {
            v("Invalid escape sequence: \\" + ((char) bP));
            throw null;
        }
        if (!interfaceC2833av.s(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + c());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bV = c1481Lu.v(i2);
            char c2 = (char) (c << 4);
            if (bV >= 48 && bV <= 57) {
                i = bV - 48;
            } else if (bV >= 97 && bV <= 102) {
                i = bV - 87;
            } else {
                if (bV < 65 || bV > 70) {
                    v("\\u".concat(c1481Lu.M0(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = bV - 55;
            }
            c = (char) (i + c2);
        }
        c1481Lu.r(4L);
        return c;
    }

    @Override // defpackage.AbstractC8000zH0
    public final long a1() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 16) {
            this.k = 0;
            int[] iArr = this.h;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return this.l;
        }
        if (iC == 17) {
            long j = this.m;
            C1481Lu c1481Lu = this.j;
            c1481Lu.getClass();
            this.n = c1481Lu.M0(j, Charsets.UTF_8);
        } else if (iC == 9 || iC == 8) {
            String strW = iC == 9 ? W(p) : W(o);
            this.n = strW;
            try {
                long j2 = Long.parseLong(strW);
                this.k = 0;
                int[] iArr2 = this.h;
                int i2 = this.d - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        } else if (iC != 11) {
            throw new EG0("Expected a long but was " + k() + " at path " + c());
        }
        this.k = 11;
        try {
            long jLongValueExact = new BigDecimal(this.n).longValueExact();
            this.n = null;
            this.k = 0;
            int[] iArr3 = this.h;
            int i3 = this.d - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new EG0("Expected a long but was " + this.n + " at path " + c());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.k = 0;
        this.e[0] = 8;
        this.d = 1;
        this.j.g();
        this.i.close();
    }

    @Override // defpackage.AbstractC8000zH0
    public final double d0() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 16) {
            this.k = 0;
            int[] iArr = this.h;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return this.l;
        }
        if (iC == 17) {
            long j = this.m;
            C1481Lu c1481Lu = this.j;
            c1481Lu.getClass();
            this.n = c1481Lu.M0(j, Charsets.UTF_8);
        } else if (iC == 9) {
            this.n = W(p);
        } else if (iC == 8) {
            this.n = W(o);
        } else if (iC == 10) {
            this.n = X();
        } else if (iC != 11) {
            throw new EG0("Expected a double but was " + k() + " at path " + c());
        }
        this.k = 11;
        try {
            double d = Double.parseDouble(this.n);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new WG0("JSON forbids NaN and infinities: " + d + " at path " + c());
            }
            this.n = null;
            this.k = 0;
            int[] iArr2 = this.h;
            int i2 = this.d - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new EG0("Expected a double but was " + this.n + " at path " + c());
        }
    }

    @Override // defpackage.AbstractC8000zH0
    public final boolean f() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 5) {
            this.k = 0;
            int[] iArr = this.h;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iC == 6) {
            this.k = 0;
            int[] iArr2 = this.h;
            int i2 = this.d - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new EG0("Expected a boolean but was " + k() + " at path " + c());
    }

    @Override // defpackage.AbstractC8000zH0
    @Nullable
    public final void g() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 7) {
            this.k = 0;
            int[] iArr = this.h;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new EG0("Expected null but was " + k() + " at path " + c());
    }

    @Override // defpackage.AbstractC8000zH0
    public final void h1() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC != 4) {
            throw new EG0("Expected END_ARRAY but was " + k() + " at path " + c());
        }
        int i = this.d;
        this.d = i - 1;
        int[] iArr = this.h;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.k = 0;
    }

    @Override // defpackage.AbstractC8000zH0
    public final boolean hasNext() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        return (iC == 2 || iC == 4 || iC == 18) ? false : true;
    }

    public final void i0(C1802Pw c1802Pw) throws WG0, EOFException {
        while (true) {
            long jM0 = this.i.m0(c1802Pw);
            if (jM0 == -1) {
                v("Unterminated string");
                throw null;
            }
            C1481Lu c1481Lu = this.j;
            if (c1481Lu.v(jM0) != 92) {
                c1481Lu.r(jM0 + 1);
                return;
            } else {
                c1481Lu.r(jM0 + 1);
                Z();
            }
        }
    }

    @Override // defpackage.AbstractC8000zH0
    public final AbstractC8000zH0.b k() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        switch (iC) {
            case 1:
                return AbstractC8000zH0.b.g;
            case 2:
                return AbstractC8000zH0.b.h;
            case 3:
                return AbstractC8000zH0.b.d;
            case 4:
                return AbstractC8000zH0.b.e;
            case 5:
            case 6:
                return AbstractC8000zH0.b.l;
            case 7:
                return AbstractC8000zH0.b.m;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC8000zH0.b.j;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                return AbstractC8000zH0.b.i;
            case 16:
            case 17:
                return AbstractC8000zH0.b.k;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return AbstractC8000zH0.b.n;
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.AbstractC8000zH0
    public final void l() {
        if (hasNext()) {
            this.n = x0();
            this.k = 11;
        }
    }

    @Override // defpackage.AbstractC8000zH0
    public final void l1() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 3) {
            p(1);
            this.h[this.d - 1] = 0;
            this.k = 0;
        } else {
            throw new EG0("Expected BEGIN_ARRAY but was " + k() + " at path " + c());
        }
    }

    @Override // defpackage.AbstractC8000zH0
    public final int q(AbstractC8000zH0.a aVar) throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC < 12 || iC > 15) {
            return -1;
        }
        if (iC == 15) {
            return D(this.n, aVar);
        }
        int iJ = this.i.J(aVar.b);
        if (iJ != -1) {
            this.k = 0;
            this.g[this.d - 1] = aVar.a[iJ];
            return iJ;
        }
        String str = this.g[this.d - 1];
        String strX0 = x0();
        int iD = D(strX0, aVar);
        if (iD == -1) {
            this.k = 15;
            this.n = strX0;
            this.g[this.d - 1] = str;
        }
        return iD;
    }

    @Override // defpackage.AbstractC8000zH0
    public final int t(AbstractC8000zH0.a aVar) throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC < 8 || iC > 11) {
            return -1;
        }
        if (iC == 11) {
            return G(this.n, aVar);
        }
        int iJ = this.i.J(aVar.b);
        if (iJ != -1) {
            this.k = 0;
            int[] iArr = this.h;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return iJ;
        }
        String strB = B();
        int iG = G(strB, aVar);
        if (iG == -1) {
            this.k = 11;
            this.n = strB;
            int[] iArr2 = this.h;
            int i2 = this.d - 1;
            iArr2[i2] = iArr2[i2] - 1;
        }
        return iG;
    }

    public final String toString() {
        return "JsonReader(" + this.i + ")";
    }

    @Override // defpackage.AbstractC8000zH0
    public final void u() throws WG0, EOFException {
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 14) {
            long jM0 = this.i.m0(q);
            C1481Lu c1481Lu = this.j;
            if (jM0 == -1) {
                jM0 = c1481Lu.e;
            }
            c1481Lu.r(jM0);
        } else if (iC == 13) {
            i0(p);
        } else if (iC == 12) {
            i0(o);
        } else if (iC != 15) {
            throw new EG0("Expected a name but was " + k() + " at path " + c());
        }
        this.k = 0;
        this.g[this.d - 1] = "null";
    }

    public final String x0() throws WG0, EOFException {
        String strW;
        int iC = this.k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 14) {
            strW = X();
        } else if (iC == 13) {
            strW = W(p);
        } else if (iC == 12) {
            strW = W(o);
        } else {
            if (iC != 15) {
                throw new EG0("Expected a name but was " + k() + " at path " + c());
            }
            strW = this.n;
            this.n = null;
        }
        this.k = 0;
        this.g[this.d - 1] = strW;
        return strW;
    }
}

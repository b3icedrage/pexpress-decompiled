package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.io.EOFException;
import java.io.IOException;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public final class TH0 extends AbstractC7580xH0 {
    public static final C1802Pw p;
    public static final C1802Pw q;
    public static final C1802Pw r;
    public final C3024bo1 j;
    public final C1481Lu k;
    public int l;
    public long m;
    public int n;
    public String o;

    static {
        C1802Pw c1802Pw = C1802Pw.h;
        p = C1802Pw.a.c("'\\");
        q = C1802Pw.a.c("\"\\");
        r = C1802Pw.a.c("{}[]:, \n\t\r\f/\\;#=");
        C1802Pw.a.c("\n\r");
        C1802Pw.a.c("*/");
    }

    public TH0(C3024bo1 c3024bo1) {
        this.e = new int[32];
        this.g = new String[32];
        this.h = new int[32];
        this.l = 0;
        this.j = c3024bo1;
        this.k = c3024bo1.e;
        k(6);
    }

    public final boolean A(int i) throws YG0 {
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
        t();
        throw null;
    }

    @Override // defpackage.AbstractC7580xH0
    public final String B() throws YG0, EOFException {
        String strM0;
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 10) {
            strM0 = G();
        } else if (iU == 9) {
            strM0 = D(q);
        } else if (iU == 8) {
            strM0 = D(p);
        } else if (iU == 11) {
            strM0 = this.o;
            this.o = null;
        } else if (iU == 16) {
            strM0 = Long.toString(this.m);
        } else {
            if (iU != 17) {
                throw new FG0("Expected a string but was " + g() + " at path " + c());
            }
            long j = this.n;
            C1481Lu c1481Lu = this.k;
            c1481Lu.getClass();
            strM0 = c1481Lu.M0(j, Charsets.UTF_8);
        }
        this.l = 0;
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return strM0;
    }

    @Override // defpackage.AbstractC7580xH0
    public final void B0() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 2) {
            throw new FG0("Expected END_OBJECT but was " + g() + " at path " + c());
        }
        int i = this.d;
        int i2 = i - 1;
        this.d = i2;
        this.g[i2] = null;
        int[] iArr = this.h;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.l = 0;
    }

    public final int C(boolean z) throws YG0, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            C3024bo1 c3024bo1 = this.j;
            if (!c3024bo1.s(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C1481Lu c1481Lu = this.k;
            byte bV = c1481Lu.v(j);
            if (bV != 10 && bV != 32 && bV != 13 && bV != 9) {
                c1481Lu.r(j);
                if (bV == 47) {
                    if (c3024bo1.s(2L)) {
                        t();
                        throw null;
                    }
                } else if (bV == 35) {
                    t();
                    throw null;
                }
                return bV;
            }
            i = i2;
        }
    }

    public final String D(C1802Pw c1802Pw) throws YG0, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jM0 = this.j.m0(c1802Pw);
            if (jM0 == -1) {
                q("Unterminated string");
                throw null;
            }
            C1481Lu c1481Lu = this.k;
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
            sb.append(L());
        }
    }

    @Override // defpackage.AbstractC7580xH0
    public final int E0() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 16) {
            long j = this.m;
            int i = (int) j;
            if (j == i) {
                this.l = 0;
                int[] iArr = this.h;
                int i2 = this.d - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new FG0("Expected an int but was " + this.m + " at path " + c());
        }
        if (iU == 17) {
            long j2 = this.n;
            C1481Lu c1481Lu = this.k;
            c1481Lu.getClass();
            this.o = c1481Lu.M0(j2, Charsets.UTF_8);
        } else if (iU == 9 || iU == 8) {
            String strD = iU == 9 ? D(q) : D(p);
            this.o = strD;
            try {
                int i3 = Integer.parseInt(strD);
                this.l = 0;
                int[] iArr2 = this.h;
                int i4 = this.d - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iU != 11) {
            throw new FG0("Expected an int but was " + g() + " at path " + c());
        }
        this.l = 11;
        try {
            double d = Double.parseDouble(this.o);
            int i5 = (int) d;
            if (i5 != d) {
                throw new FG0("Expected an int but was " + this.o + " at path " + c());
            }
            this.o = null;
            this.l = 0;
            int[] iArr3 = this.h;
            int i6 = this.d - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new FG0("Expected an int but was " + this.o + " at path " + c());
        }
    }

    public final String G() {
        long jM0 = this.j.m0(r);
        C1481Lu c1481Lu = this.k;
        if (jM0 == -1) {
            return c1481Lu.Q0();
        }
        c1481Lu.getClass();
        return c1481Lu.M0(jM0, Charsets.UTF_8);
    }

    @Override // defpackage.AbstractC7580xH0
    public final void I() throws YG0, EOFException {
        int i = 0;
        do {
            int iU = this.l;
            if (iU == 0) {
                iU = u();
            }
            if (iU == 3) {
                k(1);
            } else {
                if (iU == 1) {
                    k(3);
                } else if (iU == 4) {
                    i--;
                    if (i < 0) {
                        throw new FG0("Expected a value but was " + g() + " at path " + c());
                    }
                    this.d--;
                } else if (iU == 2) {
                    i--;
                    if (i < 0) {
                        throw new FG0("Expected a value but was " + g() + " at path " + c());
                    }
                    this.d--;
                } else {
                    C1481Lu c1481Lu = this.k;
                    if (iU == 14 || iU == 10) {
                        long jM0 = this.j.m0(r);
                        if (jM0 == -1) {
                            jM0 = c1481Lu.e;
                        }
                        c1481Lu.r(jM0);
                    } else if (iU == 9 || iU == 13) {
                        P(q);
                    } else if (iU == 8 || iU == 12) {
                        P(p);
                    } else if (iU == 17) {
                        c1481Lu.r(this.n);
                    } else if (iU == 18) {
                        throw new FG0("Expected a value but was " + g() + " at path " + c());
                    }
                }
                this.l = 0;
            }
            i++;
            this.l = 0;
        } while (i != 0);
        int[] iArr = this.h;
        int i2 = this.d - 1;
        iArr[i2] = iArr[i2] + 1;
        this.g[i2] = "null";
    }

    public final char L() throws YG0, EOFException {
        int i;
        C3024bo1 c3024bo1 = this.j;
        if (!c3024bo1.s(1L)) {
            q("Unterminated escape sequence");
            throw null;
        }
        C1481Lu c1481Lu = this.k;
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
            q("Invalid escape sequence: \\" + ((char) bP));
            throw null;
        }
        if (!c3024bo1.s(4L)) {
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
                    q("\\u".concat(c1481Lu.M0(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = bV - 55;
            }
            c = (char) (i + c2);
        }
        c1481Lu.r(4L);
        return c;
    }

    public final void P(C1802Pw c1802Pw) throws YG0, EOFException {
        while (true) {
            long jM0 = this.j.m0(c1802Pw);
            if (jM0 == -1) {
                q("Unterminated string");
                throw null;
            }
            C1481Lu c1481Lu = this.k;
            if (c1481Lu.v(jM0) != 92) {
                c1481Lu.r(jM0 + 1);
                return;
            } else {
                c1481Lu.r(jM0 + 1);
                L();
            }
        }
    }

    @Override // defpackage.AbstractC7580xH0
    public final void X0() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 1) {
            k(3);
            this.l = 0;
        } else {
            throw new FG0("Expected BEGIN_OBJECT but was " + g() + " at path " + c());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.l = 0;
        this.e[0] = 8;
        this.d = 1;
        this.k.g();
        this.j.close();
    }

    @Override // defpackage.AbstractC7580xH0
    public final double d0() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 16) {
            this.l = 0;
            int[] iArr = this.h;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return this.m;
        }
        if (iU == 17) {
            long j = this.n;
            C1481Lu c1481Lu = this.k;
            c1481Lu.getClass();
            this.o = c1481Lu.M0(j, Charsets.UTF_8);
        } else if (iU == 9) {
            this.o = D(q);
        } else if (iU == 8) {
            this.o = D(p);
        } else if (iU == 10) {
            this.o = G();
        } else if (iU != 11) {
            throw new FG0("Expected a double but was " + g() + " at path " + c());
        }
        this.l = 11;
        try {
            double d = Double.parseDouble(this.o);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new YG0("JSON forbids NaN and infinities: " + d + " at path " + c());
            }
            this.o = null;
            this.l = 0;
            int[] iArr2 = this.h;
            int i2 = this.d - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new FG0("Expected a double but was " + this.o + " at path " + c());
        }
    }

    @Override // defpackage.AbstractC7580xH0
    public final boolean f() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 5) {
            this.l = 0;
            int[] iArr = this.h;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iU == 6) {
            this.l = 0;
            int[] iArr2 = this.h;
            int i2 = this.d - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new FG0("Expected a boolean but was " + g() + " at path " + c());
    }

    @Override // defpackage.AbstractC7580xH0
    public final AbstractC7580xH0.b g() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        switch (iU) {
            case 1:
                return AbstractC7580xH0.b.g;
            case 2:
                return AbstractC7580xH0.b.h;
            case 3:
                return AbstractC7580xH0.b.d;
            case 4:
                return AbstractC7580xH0.b.e;
            case 5:
            case 6:
                return AbstractC7580xH0.b.l;
            case 7:
                return AbstractC7580xH0.b.m;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC7580xH0.b.j;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                return AbstractC7580xH0.b.i;
            case 16:
            case 17:
                return AbstractC7580xH0.b.k;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return AbstractC7580xH0.b.n;
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.AbstractC7580xH0
    public final void h1() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 4) {
            throw new FG0("Expected END_ARRAY but was " + g() + " at path " + c());
        }
        int i = this.d;
        this.d = i - 1;
        int[] iArr = this.h;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.l = 0;
    }

    @Override // defpackage.AbstractC7580xH0
    public final boolean hasNext() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        return (iU == 2 || iU == 4 || iU == 18) ? false : true;
    }

    @Override // defpackage.AbstractC7580xH0
    public final int l(AbstractC7580xH0.a aVar) throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU < 12 || iU > 15) {
            return -1;
        }
        if (iU == 15) {
            return v(this.o, aVar);
        }
        int iJ = this.j.J(aVar.b);
        if (iJ != -1) {
            this.l = 0;
            this.g[this.d - 1] = aVar.a[iJ];
            return iJ;
        }
        String str = this.g[this.d - 1];
        String strX0 = x0();
        int iV = v(strX0, aVar);
        if (iV == -1) {
            this.l = 15;
            this.o = strX0;
            this.g[this.d - 1] = str;
        }
        return iV;
    }

    @Override // defpackage.AbstractC7580xH0
    public final void l1() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 3) {
            k(1);
            this.h[this.d - 1] = 0;
            this.l = 0;
        } else {
            throw new FG0("Expected BEGIN_ARRAY but was " + g() + " at path " + c());
        }
    }

    @Override // defpackage.AbstractC7580xH0
    public final void p() throws YG0, EOFException {
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 14) {
            long jM0 = this.j.m0(r);
            C1481Lu c1481Lu = this.k;
            if (jM0 == -1) {
                jM0 = c1481Lu.e;
            }
            c1481Lu.r(jM0);
        } else if (iU == 13) {
            P(q);
        } else if (iU == 12) {
            P(p);
        } else if (iU != 15) {
            throw new FG0("Expected a name but was " + g() + " at path " + c());
        }
        this.l = 0;
        this.g[this.d - 1] = "null";
    }

    public final void t() throws YG0 {
        q("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String toString() {
        return "JsonReader(" + this.j + ")";
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:177:0x0200  */
    /* JADX WARN: Code duplicated, block: B:230:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    public final int u() throws YG0, EOFException {
        int i;
        String str;
        String str2;
        long j;
        char cV;
        char c;
        int i2;
        int i3;
        int i4;
        byte bV;
        char c2;
        int[] iArr = this.e;
        int i5 = this.d - 1;
        int i6 = iArr[i5];
        C1481Lu c1481Lu = this.k;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int iC = C(true);
            c1481Lu.P();
            if (iC != 44) {
                if (iC == 59) {
                    t();
                    throw null;
                }
                if (iC == 93) {
                    this.l = 4;
                    return 4;
                }
                q("Unterminated array");
                throw null;
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5) {
                    int iC2 = C(true);
                    c1481Lu.P();
                    if (iC2 != 44) {
                        if (iC2 == 59) {
                            t();
                            throw null;
                        }
                        if (iC2 == 125) {
                            this.l = 2;
                            return 2;
                        }
                        q("Unterminated object");
                        throw null;
                    }
                }
                int iC3 = C(true);
                if (iC3 == 34) {
                    c1481Lu.P();
                    this.l = 13;
                    return 13;
                }
                if (iC3 == 39) {
                    c1481Lu.P();
                    t();
                    throw null;
                }
                if (iC3 != 125) {
                    t();
                    throw null;
                }
                if (i6 == 5) {
                    q("Expected name");
                    throw null;
                }
                c1481Lu.P();
                this.l = 2;
                return 2;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int iC4 = C(true);
                c1481Lu.P();
                if (iC4 != 58) {
                    if (iC4 != 61) {
                        q("Expected ':'");
                        throw null;
                    }
                    t();
                    throw null;
                }
            } else if (i6 == 6) {
                iArr[i5] = 7;
            } else {
                if (i6 == 7) {
                    if (C(false) == -1) {
                        this.l = 18;
                        return 18;
                    }
                    t();
                    throw null;
                }
                if (i6 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iC5 = C(true);
        if (iC5 == 34) {
            c1481Lu.P();
            this.l = 9;
            return 9;
        }
        if (iC5 == 39) {
            t();
            throw null;
        }
        if (iC5 != 44 && iC5 != 59) {
            if (iC5 == 91) {
                c1481Lu.P();
                this.l = 3;
                return 3;
            }
            if (iC5 != 93) {
                if (iC5 == 123) {
                    c1481Lu.P();
                    this.l = 1;
                    return 1;
                }
                byte bV2 = c1481Lu.v(0L);
                C3024bo1 c3024bo1 = this.j;
                if (bV2 == 116 || bV2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bV2 != 102 && bV2 != 70) {
                        if (bV2 == 110 || bV2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                            i = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        boolean z = true;
                        long j2 = j;
                        c = 0;
                        i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            i3 = i2 + 1;
                            if (c3024bo1.s(i3)) {
                                bV = c1481Lu.v(i2);
                                if (bV != 43) {
                                    if (bV != 69 || bV == 101) {
                                        c2 = 6;
                                        if (c != 2 || c == 4) {
                                            c = 5;
                                            i2 = i3;
                                        } else {
                                            i4 = 0;
                                        }
                                    } else if (bV == 45) {
                                        c2 = 6;
                                        if (c == 0) {
                                            c = 1;
                                            z2 = true;
                                        } else {
                                            if (c != 5) {
                                                i4 = 0;
                                            }
                                            c = c2;
                                        }
                                        i2 = i3;
                                    } else if (bV != 46) {
                                        if (bV >= 48 && bV <= 57) {
                                            if (c == 1 || c == 0) {
                                                c2 = 6;
                                                j2 = -(bV - 48);
                                                c = 2;
                                            } else {
                                                if (c == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bV - 48));
                                                        z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                                        j2 = j3;
                                                    }
                                                } else if (c == 3) {
                                                    c = 4;
                                                } else {
                                                    c2 = 6;
                                                    if (c == 5 || c == 6) {
                                                        c = 7;
                                                    }
                                                }
                                                c2 = 6;
                                                i2 = i3;
                                            }
                                            i2 = i3;
                                        } else if (!A(bV)) {
                                        }
                                        i4 = 0;
                                    } else {
                                        c2 = 6;
                                        if (c == 2) {
                                            c = 3;
                                            i2 = i3;
                                        } else {
                                            i4 = 0;
                                        }
                                    }
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (A(c1481Lu.v(j))) {
                                        t();
                                        throw null;
                                    }
                                    q("Expected value");
                                    throw null;
                                }
                                c2 = 6;
                                if (c != 5) {
                                    i4 = 0;
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (A(c1481Lu.v(j))) {
                                        q("Expected value");
                                        throw null;
                                    }
                                    t();
                                    throw null;
                                }
                                c = c2;
                                i2 = i3;
                            }
                            if (c != 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != j || !z2))) {
                                if (!z2) {
                                    j2 = -j2;
                                }
                                this.m = j2;
                                c1481Lu.r(i2);
                                i4 = 16;
                                this.l = 16;
                            } else if (c != 2 || c == 4 || c == 7) {
                                this.n = i2;
                                i4 = 17;
                                this.l = 17;
                            } else {
                                i4 = 0;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (A(c1481Lu.v(j))) {
                                q("Expected value");
                                throw null;
                            }
                            t();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i7 = 1;
                while (true) {
                    if (i7 >= length) {
                        if (!c3024bo1.s(length + 1) || !A(c1481Lu.v(length))) {
                            c1481Lu.r(length);
                            this.l = i;
                            break;
                        }
                    } else {
                        int i8 = i7 + 1;
                        if (c3024bo1.s(i8) && ((cV = c1481Lu.v(i7)) == str2.charAt(i7) || cV == str.charAt(i7))) {
                            i7 = i8;
                        }
                    }
                    i = 0;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                boolean z3 = true;
                long j4 = j;
                c = 0;
                i2 = 0;
                boolean z4 = false;
                while (true) {
                    i3 = i2 + 1;
                    if (c3024bo1.s(i3)) {
                        bV = c1481Lu.v(i2);
                        if (bV != 43) {
                            if (bV != 69) {
                                c2 = 6;
                                if (c != 2) {
                                }
                                c = 5;
                                i2 = i3;
                            } else {
                                c2 = 6;
                                if (c != 2) {
                                }
                                c = 5;
                                i2 = i3;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (A(c1481Lu.v(j))) {
                                q("Expected value");
                                throw null;
                            }
                            t();
                            throw null;
                        }
                        c2 = 6;
                        if (c != 5) {
                            i4 = 0;
                            if (i4 != 0) {
                                return i4;
                            }
                            if (A(c1481Lu.v(j))) {
                                q("Expected value");
                                throw null;
                            }
                            t();
                            throw null;
                        }
                        c = c2;
                        i2 = i3;
                    }
                    if (c != 2) {
                        if (c != 2) {
                        }
                        this.n = i2;
                        i4 = 17;
                        this.l = 17;
                    } else {
                        if (c != 2) {
                        }
                        this.n = i2;
                        i4 = 17;
                        this.l = 17;
                    }
                    if (i4 != 0) {
                        return i4;
                    }
                    if (A(c1481Lu.v(j))) {
                        q("Expected value");
                        throw null;
                    }
                    t();
                    throw null;
                }
            }
            if (i6 == 1) {
                c1481Lu.P();
                this.l = 4;
                return 4;
            }
        }
        if (i6 == 1 || i6 == 2) {
            t();
            throw null;
        }
        q("Unexpected value");
        throw null;
    }

    public final int v(String str, AbstractC7580xH0.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.l = 0;
                this.g[this.d - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final String x0() throws YG0, EOFException {
        String strD;
        int iU = this.l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 14) {
            strD = G();
        } else if (iU == 13) {
            strD = D(q);
        } else if (iU == 12) {
            strD = D(p);
        } else {
            if (iU != 15) {
                throw new FG0("Expected a name but was " + g() + " at path " + c());
            }
            strD = this.o;
        }
        this.l = 0;
        this.g[this.d - 1] = strD;
        return strD;
    }
}

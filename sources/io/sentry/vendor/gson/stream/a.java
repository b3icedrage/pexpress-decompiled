package io.sentry.vendor.gson.stream;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C1039Gc0;
import defpackage.V31;
import defpackage.YG0;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {
    public final Reader d;
    public long m;
    public int n;
    public String o;
    public int[] p;
    public String[] r;
    public int[] s;
    public boolean e = false;
    public final char[] g = new char[UserVerificationMethods.USER_VERIFY_ALL];
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int q = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.p = iArr;
        iArr[0] = 6;
        this.r = new String[32];
        this.s = new int[32];
        this.d = reader;
    }

    public final void A(int i) {
        int i2 = this.q;
        int[] iArr = this.p;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.p = Arrays.copyOf(iArr, i3);
            this.s = Arrays.copyOf(this.s, i3);
            this.r = (String[]) Arrays.copyOf(this.r, i3);
        }
        int[] iArr2 = this.p;
        int i4 = this.q;
        this.q = i4 + 1;
        iArr2[i4] = i;
    }

    public final String B() throws IOException {
        String str;
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 10) {
            str = v();
        } else if (iF == 8) {
            str = u('\'');
        } else if (iF == 9) {
            str = u('\"');
        } else if (iF == 11) {
            str = this.o;
            this.o = null;
        } else if (iF == 15) {
            str = Long.toString(this.m);
        } else {
            if (iF != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + l());
            }
            str = new String(this.g, this.h, this.n);
            this.h += this.n;
        }
        this.l = 0;
        int[] iArr = this.s;
        int i = this.q - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final void B0() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + l());
        }
        int i = this.q;
        int i2 = i - 1;
        this.q = i2;
        this.r[i2] = null;
        int[] iArr = this.s;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.l = 0;
    }

    public final char C() throws YG0 {
        int i;
        if (this.h == this.i && !g(1)) {
            L("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.h;
        int i3 = i2 + 1;
        this.h = i3;
        char[] cArr = this.g;
        char c = cArr[i2];
        if (c == '\n') {
            this.j++;
            this.k = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            L("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.i && !g(4)) {
            L("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.h;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = cArr[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.h, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.h += 4;
        return c2;
    }

    public final void D(char c) throws YG0 {
        do {
            int i = this.h;
            int i2 = this.i;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.g[i];
                if (c2 == c) {
                    this.h = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.h = i3;
                    C();
                    i = this.h;
                    i2 = this.i;
                } else {
                    if (c2 == '\n') {
                        this.j++;
                        this.k = i3;
                    }
                    i = i3;
                }
            }
            this.h = i;
        } while (g(1));
        L("Unterminated string");
        throw null;
    }

    public final int E0() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            long j = this.m;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.m + l());
            }
            this.l = 0;
            int[] iArr = this.s;
            int i2 = this.q - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iF == 16) {
            this.o = new String(this.g, this.h, this.n);
            this.h += this.n;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + l());
            }
            if (iF == 10) {
                this.o = v();
            } else {
                this.o = u(iF == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.o);
                this.l = 0;
                int[] iArr2 = this.s;
                int i4 = this.q - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.l = 11;
        double d = Double.parseDouble(this.o);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.o + l());
        }
        this.o = null;
        this.l = 0;
        int[] iArr3 = this.s;
        int i6 = this.q - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public final void G() {
        char c;
        do {
            if (this.h >= this.i && !g(1)) {
                return;
            }
            int i = this.h;
            int i2 = i + 1;
            this.h = i2;
            c = this.g[i];
            if (c == '\n') {
                this.j++;
                this.k = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void L(String str) throws YG0 {
        StringBuilder sbF = C1039Gc0.f(str);
        sbF.append(l());
        throw new YG0(sbF.toString());
    }

    public final void X0() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 1) {
            A(3);
            this.l = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + l());
        }
    }

    public final long a1() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.l = 0;
            int[] iArr = this.s;
            int i = this.q - 1;
            iArr[i] = iArr[i] + 1;
            return this.m;
        }
        if (iF == 16) {
            this.o = new String(this.g, this.h, this.n);
            this.h += this.n;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + l());
            }
            if (iF == 10) {
                this.o = v();
            } else {
                this.o = u(iF == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.o);
                this.l = 0;
                int[] iArr2 = this.s;
                int i2 = this.q - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.l = 11;
        double d = Double.parseDouble(this.o);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.o + l());
        }
        this.o = null;
        this.l = 0;
        int[] iArr3 = this.s;
        int i3 = this.q - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public final void c() throws YG0 {
        if (this.e) {
            return;
        }
        L("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.l = 0;
        this.p[0] = 8;
        this.q = 1;
        this.d.close();
    }

    public final double d0() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.l = 0;
            int[] iArr = this.s;
            int i = this.q - 1;
            iArr[i] = iArr[i] + 1;
            return this.m;
        }
        if (iF == 16) {
            this.o = new String(this.g, this.h, this.n);
            this.h += this.n;
        } else if (iF == 8 || iF == 9) {
            this.o = u(iF == 8 ? '\'' : '\"');
        } else if (iF == 10) {
            this.o = v();
        } else if (iF != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + l());
        }
        this.l = 11;
        double d = Double.parseDouble(this.o);
        if (!this.e && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new YG0("JSON forbids NaN and infinities: " + d + l());
        }
        this.o = null;
        this.l = 0;
        int[] iArr2 = this.s;
        int i2 = this.q - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017e  */
    /* JADX WARN: Code duplicated, block: B:119:0x018d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a6 A[PHI: r2 r4
      0x01a6: PHI (r2v44 int) = (r2v43 int), (r2v46 int) binds: [B:118:0x018b, B:126:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x018b, B:126:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:171:0x021a  */
    /* JADX WARN: Code duplicated, block: B:172:0x021c  */
    /* JADX WARN: Code duplicated, block: B:184:0x023d A[DONT_INVERT, PHI: r10
      0x023d: PHI (r10v27 int) = (r10v26 int), (r10v29 int) binds: [B:170:0x0218, B:176:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x023f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0262  */
    /* JADX WARN: Code duplicated, block: B:200:0x0268  */
    /* JADX WARN: Code duplicated, block: B:203:0x026d  */
    /* JADX WARN: Code duplicated, block: B:208:0x027c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x027d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0287  */
    /* JADX WARN: Code duplicated, block: B:213:0x028d  */
    /* JADX WARN: Code duplicated, block: B:223:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:232:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:275:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    public final int f() throws IOException {
        int iQ;
        int i;
        int iQ2;
        int i2;
        String str;
        String str2;
        int i3;
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        char c2;
        long j;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr = this.p;
        int i12 = 1;
        int i13 = this.q - 1;
        int i14 = iArr[i13];
        char[] cArr = this.g;
        if (i14 == 1) {
            iArr[i13] = 2;
        } else if (i14 == 2) {
            int iQ3 = q(true);
            if (iQ3 != 44) {
                if (iQ3 != 59) {
                    if (iQ3 == 93) {
                        this.l = 4;
                        return 4;
                    }
                    L("Unterminated array");
                    throw null;
                }
                c();
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13] = 4;
                if (i14 == 5 && (iQ = q(true)) != 44) {
                    if (iQ != 59) {
                        if (iQ == 125) {
                            this.l = 2;
                            return 2;
                        }
                        L("Unterminated object");
                        throw null;
                    }
                    c();
                }
                int iQ4 = q(true);
                if (iQ4 == 34) {
                    this.l = 13;
                    return 13;
                }
                if (iQ4 == 39) {
                    c();
                    this.l = 12;
                    return 12;
                }
                if (iQ4 == 125) {
                    if (i14 != 5) {
                        this.l = 2;
                        return 2;
                    }
                    L("Expected name");
                    throw null;
                }
                c();
                this.h--;
                if (k((char) iQ4)) {
                    this.l = 14;
                    return 14;
                }
                L("Expected name");
                throw null;
            }
            if (i14 != 4) {
                if (i14 == 6) {
                    if (this.e) {
                        q(true);
                        int i15 = this.h;
                        int i16 = i15 - 1;
                        this.h = i16;
                        if ((i15 + 4 <= this.i || g(5)) && cArr[i16] == ')' && cArr[i15] == ']' && cArr[i15 + 1] == '}' && cArr[i15 + 2] == '\'' && cArr[i15 + 3] == '\n') {
                            this.h += 5;
                        }
                    }
                    this.p[this.q - 1] = 7;
                } else if (i14 == 7) {
                    i = 0;
                    if (q(false) == -1) {
                        this.l = 17;
                        return 17;
                    }
                    c();
                    this.h--;
                } else {
                    i = 0;
                    if (i14 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iQ2 = q(true);
                if (iQ2 != 34) {
                    this.l = 9;
                    return 9;
                }
                if (iQ2 != 39) {
                    c();
                    this.l = 8;
                    return 8;
                }
                if (iQ2 != 44 || iQ2 == 59) {
                    i2 = 1;
                } else {
                    if (iQ2 == 91) {
                        this.l = 3;
                        return 3;
                    }
                    if (iQ2 != 93) {
                        if (iQ2 == 123) {
                            this.l = 1;
                            return 1;
                        }
                        int i17 = this.h - 1;
                        this.h = i17;
                        char c3 = cArr[i17];
                        if (c3 == 't' || c3 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i3 = 5;
                        } else {
                            if (c3 != 'f' && c3 != 'F') {
                                if (c3 != 'n' && c3 != 'N') {
                                    i3 = i;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i3 = 7;
                                if (i3 != 0) {
                                    return i3;
                                }
                                i4 = this.h;
                                i5 = this.i;
                                i6 = i;
                                i7 = i6;
                                int i18 = i7;
                                z = true;
                                long j2 = 0;
                                while (true) {
                                    if (i4 + i7 != i5) {
                                        c2 = cArr[i4 + i7];
                                        j = 0;
                                        if (c2 != '+') {
                                            if (c2 != 'E' || c2 == 'e') {
                                                i8 = i5;
                                                if (i6 != 2 || i6 == 4) {
                                                    i6 = 5;
                                                    i7++;
                                                    i5 = i8;
                                                    i12 = 1;
                                                }
                                            } else if (c2 == '-') {
                                                i8 = i5;
                                                i9 = 6;
                                                if (i6 == 0) {
                                                    i6 = 1;
                                                    i18 = 1;
                                                } else {
                                                    if (i6 != 5) {
                                                    }
                                                    i6 = i9;
                                                }
                                                i7++;
                                                i5 = i8;
                                                i12 = 1;
                                            } else if (c2 == '.') {
                                                i8 = i5;
                                                if (i6 == 2) {
                                                    i6 = 3;
                                                    i7++;
                                                    i5 = i8;
                                                    i12 = 1;
                                                }
                                            } else if (c2 >= '0' && c2 <= '9') {
                                                if (i6 == i12 || i6 == 0) {
                                                    i8 = i5;
                                                    j2 = -(c2 - '0');
                                                    i6 = 2;
                                                } else if (i6 != 2) {
                                                    i8 = i5;
                                                    if (i6 == 3) {
                                                        i6 = 4;
                                                    } else if (i6 == 5 || i6 == 6) {
                                                        i6 = 7;
                                                    }
                                                } else if (j2 != 0) {
                                                    i8 = i5;
                                                    long j3 = (10 * j2) - ((long) (c2 - '0'));
                                                    z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                                    j2 = j3;
                                                }
                                                i7++;
                                                i5 = i8;
                                                i12 = 1;
                                            } else if (!k(c2)) {
                                                i11 = 2;
                                                if (i6 != 2) {
                                                    if (i6 != i11 || i6 == 4 || i6 == 7) {
                                                        this.n = i7;
                                                        i10 = 16;
                                                        this.l = 16;
                                                    }
                                                } else if (z || ((j2 == Long.MIN_VALUE && i18 == 0) || (j2 == j && i18 != 0))) {
                                                    i11 = 2;
                                                    if (i6 != i11) {
                                                    }
                                                    this.n = i7;
                                                    i10 = 16;
                                                    this.l = 16;
                                                } else {
                                                    if (i18 == 0) {
                                                        j2 = -j2;
                                                    }
                                                    this.m = j2;
                                                    this.h += i7;
                                                    i10 = 15;
                                                    this.l = 15;
                                                }
                                            }
                                            if (i10 != 0) {
                                                return i10;
                                            }
                                            if (k(cArr[this.h])) {
                                                L("Expected value");
                                                throw null;
                                            }
                                            c();
                                            this.l = 10;
                                            return 10;
                                        }
                                        i8 = i5;
                                        i9 = 6;
                                        if (i6 != 5) {
                                        }
                                        i6 = i9;
                                        i7++;
                                        i5 = i8;
                                        i12 = 1;
                                    } else if (i7 != cArr.length) {
                                        if (g(i7 + 1)) {
                                            int i19 = this.h;
                                            i5 = this.i;
                                            i4 = i19;
                                            c2 = cArr[i4 + i7];
                                            j = 0;
                                            if (c2 != '+') {
                                                if (c2 != 'E') {
                                                    i8 = i5;
                                                    if (i6 != 2) {
                                                    }
                                                    i6 = 5;
                                                    i7++;
                                                    i5 = i8;
                                                    i12 = 1;
                                                } else {
                                                    i8 = i5;
                                                    if (i6 != 2) {
                                                    }
                                                    i6 = 5;
                                                    i7++;
                                                    i5 = i8;
                                                    i12 = 1;
                                                }
                                                if (i10 != 0) {
                                                    return i10;
                                                }
                                                if (k(cArr[this.h])) {
                                                    L("Expected value");
                                                    throw null;
                                                }
                                                c();
                                                this.l = 10;
                                                return 10;
                                            }
                                            i8 = i5;
                                            i9 = 6;
                                            if (i6 != 5) {
                                            }
                                            i6 = i9;
                                            i7++;
                                            i5 = i8;
                                            i12 = 1;
                                        } else {
                                            j = 0;
                                        }
                                        i11 = 2;
                                        if (i6 != 2) {
                                            if (i6 != i11) {
                                            }
                                            this.n = i7;
                                            i10 = 16;
                                            this.l = 16;
                                        } else {
                                            if (z) {
                                            }
                                            i11 = 2;
                                            if (i6 != i11) {
                                            }
                                            this.n = i7;
                                            i10 = 16;
                                            this.l = 16;
                                        }
                                        if (i10 != 0) {
                                            return i10;
                                        }
                                        if (k(cArr[this.h])) {
                                            L("Expected value");
                                            throw null;
                                        }
                                        c();
                                        this.l = 10;
                                        return 10;
                                    }
                                    i10 = 0;
                                    if (i10 != 0) {
                                        return i10;
                                    }
                                    if (k(cArr[this.h])) {
                                        L("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.l = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i3 = 6;
                        }
                        int length = str.length();
                        int i20 = 1;
                        while (true) {
                            if (i20 >= length) {
                                if ((this.h + length >= this.i && !g(length + 1)) || !k(cArr[this.h + length])) {
                                    this.h += length;
                                    this.l = i3;
                                    break;
                                }
                                break;
                            }
                            if ((this.h + i20 < this.i || g(i20 + 1)) && ((c = cArr[this.h + i20]) == str.charAt(i20) || c == str2.charAt(i20))) {
                                i20++;
                            }
                            i3 = i;
                            break;
                        }
                        if (i3 != 0) {
                            return i3;
                        }
                        i4 = this.h;
                        i5 = this.i;
                        i6 = i;
                        i7 = i6;
                        int i110 = i7;
                        z = true;
                        long j4 = 0;
                        while (true) {
                            if (i4 + i7 != i5) {
                                c2 = cArr[i4 + i7];
                                j = 0;
                                if (c2 != '+') {
                                    if (c2 != 'E') {
                                        i8 = i5;
                                        if (i6 != 2) {
                                        }
                                        i6 = 5;
                                        i7++;
                                        i5 = i8;
                                        i12 = 1;
                                    } else {
                                        i8 = i5;
                                        if (i6 != 2) {
                                        }
                                        i6 = 5;
                                        i7++;
                                        i5 = i8;
                                        i12 = 1;
                                    }
                                    if (i10 != 0) {
                                        return i10;
                                    }
                                    if (k(cArr[this.h])) {
                                        L("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.l = 10;
                                    return 10;
                                }
                                i8 = i5;
                                i9 = 6;
                                if (i6 != 5) {
                                }
                                i6 = i9;
                                i7++;
                                i5 = i8;
                                i12 = 1;
                            } else if (i7 != cArr.length) {
                                if (g(i7 + 1)) {
                                    j = 0;
                                } else {
                                    int i111 = this.h;
                                    i5 = this.i;
                                    i4 = i111;
                                    c2 = cArr[i4 + i7];
                                    j = 0;
                                    if (c2 != '+') {
                                        if (c2 != 'E') {
                                            i8 = i5;
                                            if (i6 != 2) {
                                            }
                                            i6 = 5;
                                            i7++;
                                            i5 = i8;
                                            i12 = 1;
                                        } else {
                                            i8 = i5;
                                            if (i6 != 2) {
                                            }
                                            i6 = 5;
                                            i7++;
                                            i5 = i8;
                                            i12 = 1;
                                        }
                                        if (i10 != 0) {
                                            return i10;
                                        }
                                        if (k(cArr[this.h])) {
                                            L("Expected value");
                                            throw null;
                                        }
                                        c();
                                        this.l = 10;
                                        return 10;
                                    }
                                    i8 = i5;
                                    i9 = 6;
                                    if (i6 != 5) {
                                    }
                                    i6 = i9;
                                    i7++;
                                    i5 = i8;
                                    i12 = 1;
                                }
                                i11 = 2;
                                if (i6 != 2) {
                                    if (i6 != i11) {
                                    }
                                    this.n = i7;
                                    i10 = 16;
                                    this.l = 16;
                                } else {
                                    if (z) {
                                    }
                                    i11 = 2;
                                    if (i6 != i11) {
                                    }
                                    this.n = i7;
                                    i10 = 16;
                                    this.l = 16;
                                }
                                if (i10 != 0) {
                                    return i10;
                                }
                                if (k(cArr[this.h])) {
                                    L("Expected value");
                                    throw null;
                                }
                                c();
                                this.l = 10;
                                return 10;
                            }
                            i10 = 0;
                            if (i10 != 0) {
                                return i10;
                            }
                            if (k(cArr[this.h])) {
                                L("Expected value");
                                throw null;
                            }
                            c();
                            this.l = 10;
                            return 10;
                        }
                    }
                    i2 = 1;
                    if (i14 == 1) {
                        this.l = 4;
                        return 4;
                    }
                }
                if (i14 == i2 && i14 != 2) {
                    L("Unexpected value");
                    throw null;
                }
                c();
                this.h -= i2;
                this.l = 7;
                return 7;
            }
            iArr[i13] = 5;
            int iQ5 = q(true);
            if (iQ5 != 58) {
                if (iQ5 != 61) {
                    L("Expected ':'");
                    throw null;
                }
                c();
                if (this.h < this.i || g(1)) {
                    int i21 = this.h;
                    if (cArr[i21] == '>') {
                        this.h = i21 + 1;
                    }
                }
            }
        }
        i = 0;
        iQ2 = q(true);
        if (iQ2 != 34) {
            this.l = 9;
            return 9;
        }
        if (iQ2 != 39) {
            c();
            this.l = 8;
            return 8;
        }
        if (iQ2 != 44) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (i14 == i2) {
        }
        c();
        this.h -= i2;
        this.l = 7;
        return 7;
    }

    public final boolean g(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.k;
        int i5 = this.h;
        this.k = i4 - i5;
        int i6 = this.i;
        char[] cArr = this.g;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.i = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.i = 0;
        }
        this.h = 0;
        do {
            int i8 = this.i;
            int i9 = this.d.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.i + i9;
            this.i = i2;
            if (this.j == 0 && (i3 = this.k) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.h++;
                this.k = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final void h1() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + l());
        }
        int i = this.q;
        this.q = i - 1;
        int[] iArr = this.s;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.l = 0;
    }

    public final boolean hasNext() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        return (iF == 2 || iF == 4) ? false : true;
    }

    public final boolean k(char c) throws YG0 {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    public final String l() {
        int i = this.j + 1;
        int i2 = (this.h - this.k) + 1;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i3 = this.q;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.p[i4];
            if (i5 == 1 || i5 == 2) {
                sb2.append('[');
                sb2.append(this.s[i4]);
                sb2.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb2.append(JwtParser.SEPARATOR_CHAR);
                String str = this.r[i4];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public final void l1() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 3) {
            A(1);
            this.s[this.q - 1] = 0;
            this.l = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + l());
        }
    }

    public final boolean p() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 5) {
            this.l = 0;
            int[] iArr = this.s;
            int i = this.q - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iF != 6) {
            throw new IllegalStateException("Expected a boolean but was " + peek() + l());
        }
        this.l = 0;
        int[] iArr2 = this.s;
        int i2 = this.q - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final b peek() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        switch (iF) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int q(boolean z) throws IOException {
        int i = this.h;
        int i2 = this.i;
        while (true) {
            if (i == i2) {
                this.h = i;
                if (!g(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + l());
                }
                i = this.h;
                i2 = this.i;
            }
            int i3 = i + 1;
            char[] cArr = this.g;
            char c = cArr[i];
            if (c == '\n') {
                this.j++;
                this.k = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.h = i3;
                    if (i3 == i2) {
                        this.h = i;
                        boolean zG = g(2);
                        this.h++;
                        if (!zG) {
                        }
                        return c;
                    }
                    c();
                    int i4 = this.h;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.h = i4 + 1;
                        while (true) {
                            if (this.h + 2 > this.i && !g(2)) {
                                L("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.h;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 2) {
                                        i = this.h + 2;
                                        i2 = this.i;
                                        break;
                                    }
                                    if (cArr[this.h + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.j++;
                                this.k = i5 + 1;
                            }
                            this.h++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.h = i4 + 1;
                        G();
                        i = this.h;
                        i2 = this.i;
                    }
                } else {
                    if (c != '#') {
                        this.h = i3;
                        return c;
                    }
                    this.h = i3;
                    c();
                    G();
                    i = this.h;
                    i2 = this.i;
                }
            }
            i = i3;
        }
    }

    public final void t() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 7) {
            throw new IllegalStateException("Expected null but was " + peek() + l());
        }
        this.l = 0;
        int[] iArr = this.s;
        int i = this.q - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final String toString() {
        return a.class.getSimpleName() + l();
    }

    public final String u(char c) throws YG0 {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.h;
            int i3 = this.i;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.g;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (c2 == c) {
                            this.h = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.h = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(C());
                            i2 = this.h;
                            i3 = this.i;
                        } else {
                            if (c2 == '\n') {
                                this.j++;
                                this.k = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.h = i2;
        } while (g(1));
        L("Unterminated string");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String v() throws YG0 {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.h;
                int i4 = i3 + i2;
                int i5 = this.i;
                char[] cArr = this.g;
                if (i4 < i5) {
                    char c = cArr[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.h, i2);
                    this.h += i2;
                    if (!g(1)) {
                    }
                } else if (!g(i2 + 1)) {
                    i = i2;
                }
                if (sb == null) {
                    string = new String(cArr, this.h, i);
                } else {
                    sb.append(cArr, this.h, i);
                    string = sb.toString();
                }
                this.h += i;
                return string;
            }
        }
    }

    public final String x0() throws IOException {
        String strU;
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            strU = v();
        } else if (iF == 12) {
            strU = u('\'');
        } else {
            if (iF != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + l());
            }
            strU = u('\"');
        }
        this.l = 0;
        this.r[this.q - 1] = strU;
        return strU;
    }
}

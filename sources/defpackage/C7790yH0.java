package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: yH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7790yH0 implements Closeable {
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

    /* JADX INFO: renamed from: yH0$a */
    public class a extends G1 {
    }

    static {
        G1.d = new a();
    }

    public C7790yH0(Reader reader) {
        int[] iArr = new int[32];
        this.p = iArr;
        iArr[0] = 6;
        this.r = new String[32];
        this.s = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.d = reader;
    }

    public void A() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 7) {
            throw new IllegalStateException("Expected null but was " + G() + t());
        }
        this.l = 0;
        int[] iArr = this.s;
        int i = this.q - 1;
        iArr[i] = iArr[i] + 1;
    }

    public String B() throws IOException {
        String str;
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 10) {
            str = D();
        } else if (iF == 8) {
            str = C('\'');
        } else if (iF == 9) {
            str = C('\"');
        } else if (iF == 11) {
            str = this.o;
            this.o = null;
        } else if (iF == 15) {
            str = Long.toString(this.m);
        } else {
            if (iF != 16) {
                throw new IllegalStateException("Expected a string but was " + G() + t());
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

    public void B0() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + G() + t());
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

    public final String C(char c) throws C3584eW0 {
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
                            sb.append(P());
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
        i0("Unterminated string");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String D() throws C3584eW0 {
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

    public int E0() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            long j = this.m;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.m + t());
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
                throw new IllegalStateException("Expected an int but was " + G() + t());
            }
            if (iF == 10) {
                this.o = D();
            } else {
                this.o = C(iF == 8 ? '\'' : '\"');
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
            throw new NumberFormatException("Expected an int but was " + this.o + t());
        }
        this.o = null;
        this.l = 0;
        int[] iArr3 = this.s;
        int i6 = this.q - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public JH0 G() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        switch (iF) {
            case 1:
                return JH0.g;
            case 2:
                return JH0.h;
            case 3:
                return JH0.d;
            case 4:
                return JH0.e;
            case 5:
            case 6:
                return JH0.l;
            case 7:
                return JH0.m;
            case 8:
            case 9:
            case 10:
            case 11:
                return JH0.j;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
                return JH0.i;
            case 15:
            case 16:
                return JH0.k;
            case 17:
                return JH0.n;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void I() throws IOException {
        int i = 0;
        do {
            int iF = this.l;
            if (iF == 0) {
                iF = f();
            }
            switch (iF) {
                case 1:
                    L(3);
                    i++;
                    this.l = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.r[this.q - 1] = null;
                    }
                    this.q--;
                    i--;
                    this.l = 0;
                    break;
                case 3:
                    L(1);
                    i++;
                    this.l = 0;
                    break;
                case 4:
                    this.q--;
                    i--;
                    this.l = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.l = 0;
                    break;
                case 8:
                    W('\'');
                    this.l = 0;
                    break;
                case 9:
                    W('\"');
                    this.l = 0;
                    break;
                case 10:
                    Z();
                    this.l = 0;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    W('\'');
                    if (i == 0) {
                        this.r[this.q - 1] = "<skipped>";
                    }
                    this.l = 0;
                    break;
                case 13:
                    W('\"');
                    if (i == 0) {
                        this.r[this.q - 1] = "<skipped>";
                    }
                    this.l = 0;
                    break;
                case 14:
                    Z();
                    if (i == 0) {
                        this.r[this.q - 1] = "<skipped>";
                    }
                    this.l = 0;
                    break;
                case 16:
                    this.h += this.n;
                    this.l = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.s;
        int i2 = this.q - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final void L(int i) {
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

    public final char P() throws C3584eW0 {
        int i;
        if (this.h == this.i && !g(1)) {
            i0("Unterminated escape sequence");
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
            i0("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.i && !g(4)) {
            i0("Unterminated escape sequence");
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

    public final void W(char c) throws C3584eW0 {
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
                    P();
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
        i0("Unterminated string");
        throw null;
    }

    public final void X() {
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

    public void X0() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 1) {
            L(3);
            this.l = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + G() + t());
        }
    }

    public final void Z() throws C3584eW0 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.h;
                if (i2 + i < this.i) {
                    char c = this.g[i2 + i];
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
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        c();
                    }
                    this.h += i;
                    return;
                }
                this.h = i2 + i;
            }
        } while (g(1));
    }

    public long a1() throws IOException {
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
                throw new IllegalStateException("Expected a long but was " + G() + t());
            }
            if (iF == 10) {
                this.o = D();
            } else {
                this.o = C(iF == 8 ? '\'' : '\"');
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
            throw new NumberFormatException("Expected a long but was " + this.o + t());
        }
        this.o = null;
        this.l = 0;
        int[] iArr3 = this.s;
        int i3 = this.q - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public final void c() throws C3584eW0 {
        if (this.e) {
            return;
        }
        i0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.l = 0;
        this.p[0] = 8;
        this.q = 1;
        this.d.close();
    }

    public double d0() throws IOException {
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
            this.o = C(iF == 8 ? '\'' : '\"');
        } else if (iF == 10) {
            this.o = D();
        } else if (iF != 11) {
            throw new IllegalStateException("Expected a double but was " + G() + t());
        }
        this.l = 11;
        double d = Double.parseDouble(this.o);
        if (!this.e && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new C3584eW0("JSON forbids NaN and infinities: " + d + t());
        }
        this.o = null;
        this.l = 0;
        int[] iArr2 = this.s;
        int i2 = this.q - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:115:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x0180  */
    /* JADX WARN: Code duplicated, block: B:119:0x0192  */
    /* JADX WARN: Code duplicated, block: B:122:0x0198  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9 A[PHI: r4 r15
      0x01a9: PHI (r4v10 int) = (r4v9 int), (r4v15 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0214  */
    /* JADX WARN: Code duplicated, block: B:169:0x0216  */
    /* JADX WARN: Code duplicated, block: B:181:0x0237 A[DONT_INVERT, PHI: r8
      0x0237: PHI (r8v19 int) = (r8v18 int), (r8v20 int) binds: [B:167:0x0212, B:173:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0239  */
    /* JADX WARN: Code duplicated, block: B:195:0x0256  */
    /* JADX WARN: Code duplicated, block: B:197:0x0259  */
    /* JADX WARN: Code duplicated, block: B:200:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x0267 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:205:0x0268  */
    /* JADX WARN: Code duplicated, block: B:207:0x0272  */
    /* JADX WARN: Code duplicated, block: B:209:0x0278  */
    /* JADX WARN: Code duplicated, block: B:211:0x027e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x0283  */
    /* JADX WARN: Code duplicated, block: B:216:0x0287  */
    /* JADX WARN: Code duplicated, block: B:226:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:228:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:269:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    public final int f() throws IOException {
        int iV;
        int i;
        int iV2;
        char c;
        String str;
        String str2;
        int i2;
        int length;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        char c3;
        int i8;
        int i9;
        int[] iArr = this.p;
        int i10 = this.q - 1;
        int i11 = iArr[i10];
        char[] cArr = this.g;
        if (i11 == 1) {
            iArr[i10] = 2;
        } else if (i11 == 2) {
            int iV3 = v(true);
            if (iV3 != 44) {
                if (iV3 != 59) {
                    if (iV3 == 93) {
                        this.l = 4;
                        return 4;
                    }
                    i0("Unterminated array");
                    throw null;
                }
                c();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10] = 4;
                if (i11 == 5 && (iV = v(true)) != 44) {
                    if (iV != 59) {
                        if (iV == 125) {
                            this.l = 2;
                            return 2;
                        }
                        i0("Unterminated object");
                        throw null;
                    }
                    c();
                }
                int iV4 = v(true);
                if (iV4 == 34) {
                    this.l = 13;
                    return 13;
                }
                if (iV4 == 39) {
                    c();
                    this.l = 12;
                    return 12;
                }
                if (iV4 == 125) {
                    if (i11 != 5) {
                        this.l = 2;
                        return 2;
                    }
                    i0("Expected name");
                    throw null;
                }
                c();
                this.h--;
                if (q((char) iV4)) {
                    this.l = 14;
                    return 14;
                }
                i0("Expected name");
                throw null;
            }
            if (i11 != 4) {
                if (i11 == 6) {
                    if (this.e) {
                        v(true);
                        int i12 = this.h;
                        this.h = i12 - 1;
                        if (i12 + 4 <= this.i || g(5)) {
                            int i13 = this.h;
                            if (cArr[i13] == ')' && cArr[i13 + 1] == ']' && cArr[i13 + 2] == '}' && cArr[i13 + 3] == '\'' && cArr[i13 + 4] == '\n') {
                                this.h = i13 + 5;
                            }
                        }
                    }
                    this.p[this.q - 1] = 7;
                } else if (i11 == 7) {
                    i = 0;
                    if (v(false) == -1) {
                        this.l = 17;
                        return 17;
                    }
                    c();
                    this.h--;
                } else {
                    i = 0;
                    if (i11 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iV2 = v(true);
                if (iV2 != 34) {
                    this.l = 9;
                    return 9;
                }
                if (iV2 != 39) {
                    c();
                    this.l = 8;
                    return 8;
                }
                if (iV2 != 44 && iV2 != 59) {
                    if (iV2 != 91) {
                        this.l = 3;
                        return 3;
                    }
                    if (iV2 != 93) {
                        if (iV2 != 123) {
                            this.l = 1;
                            return 1;
                        }
                        int i14 = this.h - 1;
                        this.h = i14;
                        c = cArr[i14];
                        if (c != 't' || c == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i2 = 5;
                        } else {
                            if (c != 'f' && c != 'F') {
                                if (c != 'n' && c != 'N') {
                                    i2 = i;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i2 = 7;
                                if (i2 != 0) {
                                    return i2;
                                }
                                int i15 = this.h;
                                i4 = this.i;
                                i5 = i;
                                i6 = i5;
                                int i16 = i6;
                                i7 = i15;
                                z = true;
                                long j = 0;
                                while (true) {
                                    if (i7 + i6 != i4) {
                                        c3 = cArr[i7 + i6];
                                        if (c3 != '+') {
                                            if (c3 != 'E' || c3 == 'e') {
                                                if (i5 != 2 || i5 == 4) {
                                                    i5 = 5;
                                                    i6++;
                                                }
                                            } else if (c3 == '-') {
                                                if (i5 == 0) {
                                                    i5 = 1;
                                                    i16 = 1;
                                                } else {
                                                    if (i5 != 5) {
                                                    }
                                                    i5 = 6;
                                                }
                                                i6++;
                                            } else if (c3 != '.') {
                                                if (c3 >= '0' && c3 <= '9') {
                                                    if (i5 == 1 || i5 == 0) {
                                                        j = -(c3 - '0');
                                                        i5 = 2;
                                                    } else if (i5 == 2) {
                                                        if (j != 0) {
                                                            long j2 = (10 * j) - ((long) (c3 - '0'));
                                                            z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                            j = j2;
                                                        }
                                                    } else if (i5 == 3) {
                                                        i5 = 4;
                                                    } else if (i5 == 5 || i5 == 6) {
                                                        i5 = 7;
                                                    }
                                                    i6++;
                                                } else if (!q(c3)) {
                                                    i9 = 2;
                                                    if (i5 != 2) {
                                                        if (i5 != i9 || i5 == 4 || i5 == 7) {
                                                            this.n = i6;
                                                            i8 = 16;
                                                            this.l = 16;
                                                        }
                                                    } else if (z || ((j == Long.MIN_VALUE && i16 == 0) || (j == 0 && i16 != 0))) {
                                                        i9 = 2;
                                                        if (i5 != i9) {
                                                        }
                                                        this.n = i6;
                                                        i8 = 16;
                                                        this.l = 16;
                                                    } else {
                                                        if (i16 == 0) {
                                                            j = -j;
                                                        }
                                                        this.m = j;
                                                        this.h += i6;
                                                        i8 = 15;
                                                        this.l = 15;
                                                    }
                                                }
                                            } else if (i5 == 2) {
                                                i5 = 3;
                                                i6++;
                                            }
                                            if (i8 != 0) {
                                                return i8;
                                            }
                                            if (q(cArr[this.h])) {
                                                i0("Expected value");
                                                throw null;
                                            }
                                            c();
                                            this.l = 10;
                                            return 10;
                                        }
                                        if (i5 != 5) {
                                        }
                                        i5 = 6;
                                        i6++;
                                    } else if (i6 != cArr.length) {
                                        if (g(i6 + 1)) {
                                            i7 = this.h;
                                            i4 = this.i;
                                            c3 = cArr[i7 + i6];
                                            if (c3 != '+') {
                                                if (c3 != 'E') {
                                                    if (i5 != 2) {
                                                    }
                                                    i5 = 5;
                                                    i6++;
                                                } else {
                                                    if (i5 != 2) {
                                                    }
                                                    i5 = 5;
                                                    i6++;
                                                }
                                                if (i8 != 0) {
                                                    return i8;
                                                }
                                                if (q(cArr[this.h])) {
                                                    i0("Expected value");
                                                    throw null;
                                                }
                                                c();
                                                this.l = 10;
                                                return 10;
                                            }
                                            if (i5 != 5) {
                                            }
                                            i5 = 6;
                                            i6++;
                                        }
                                        i9 = 2;
                                        if (i5 != 2) {
                                            if (i5 != i9) {
                                            }
                                            this.n = i6;
                                            i8 = 16;
                                            this.l = 16;
                                        } else {
                                            if (z) {
                                            }
                                            i9 = 2;
                                            if (i5 != i9) {
                                            }
                                            this.n = i6;
                                            i8 = 16;
                                            this.l = 16;
                                        }
                                        if (i8 != 0) {
                                            return i8;
                                        }
                                        if (q(cArr[this.h])) {
                                            i0("Expected value");
                                            throw null;
                                        }
                                        c();
                                        this.l = 10;
                                        return 10;
                                    }
                                    i8 = 0;
                                    if (i8 != 0) {
                                        return i8;
                                    }
                                    if (q(cArr[this.h])) {
                                        i0("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.l = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i2 = 6;
                        }
                        length = str.length();
                        i3 = 1;
                        while (true) {
                            if (i3 >= length) {
                                if ((this.h + length < this.i && !g(length + 1)) || !q(cArr[this.h + length])) {
                                    this.h += length;
                                    this.l = i2;
                                    break;
                                }
                                break;
                            }
                            if ((this.h + i3 >= this.i || g(i3 + 1)) && ((c2 = cArr[this.h + i3]) == str.charAt(i3) || c2 == str2.charAt(i3))) {
                            }
                            i2 = i;
                            break;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        int i17 = this.h;
                        i4 = this.i;
                        i5 = i;
                        i6 = i5;
                        int i18 = i6;
                        i7 = i17;
                        z = true;
                        long j3 = 0;
                        while (true) {
                            if (i7 + i6 != i4) {
                                c3 = cArr[i7 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (i5 != 2) {
                                        }
                                        i5 = 5;
                                        i6++;
                                    } else {
                                        if (i5 != 2) {
                                        }
                                        i5 = 5;
                                        i6++;
                                    }
                                    if (i8 != 0) {
                                        return i8;
                                    }
                                    if (q(cArr[this.h])) {
                                        i0("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.l = 10;
                                    return 10;
                                }
                                if (i5 != 5) {
                                }
                                i5 = 6;
                                i6++;
                            } else if (i6 != cArr.length) {
                                if (g(i6 + 1)) {
                                    i7 = this.h;
                                    i4 = this.i;
                                    c3 = cArr[i7 + i6];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (i5 != 2) {
                                            }
                                            i5 = 5;
                                            i6++;
                                        } else {
                                            if (i5 != 2) {
                                            }
                                            i5 = 5;
                                            i6++;
                                        }
                                        if (i8 != 0) {
                                            return i8;
                                        }
                                        if (q(cArr[this.h])) {
                                            i0("Expected value");
                                            throw null;
                                        }
                                        c();
                                        this.l = 10;
                                        return 10;
                                    }
                                    if (i5 != 5) {
                                    }
                                    i5 = 6;
                                    i6++;
                                }
                                i9 = 2;
                                if (i5 != 2) {
                                    if (i5 != i9) {
                                    }
                                    this.n = i6;
                                    i8 = 16;
                                    this.l = 16;
                                } else {
                                    if (z) {
                                    }
                                    i9 = 2;
                                    if (i5 != i9) {
                                    }
                                    this.n = i6;
                                    i8 = 16;
                                    this.l = 16;
                                }
                                if (i8 != 0) {
                                    return i8;
                                }
                                if (q(cArr[this.h])) {
                                    i0("Expected value");
                                    throw null;
                                }
                                c();
                                this.l = 10;
                                return 10;
                            }
                            i8 = 0;
                            if (i8 != 0) {
                                return i8;
                            }
                            if (q(cArr[this.h])) {
                                i0("Expected value");
                                throw null;
                            }
                            c();
                            this.l = 10;
                            return 10;
                        }
                    }
                    if (i11 == 1) {
                        this.l = 4;
                        return 4;
                    }
                }
                if (i11 == 1 && i11 != 2) {
                    i0("Unexpected value");
                    throw null;
                }
                c();
                this.h--;
                this.l = 7;
                return 7;
            }
            iArr[i10] = 5;
            int iV5 = v(true);
            if (iV5 != 58) {
                if (iV5 != 61) {
                    i0("Expected ':'");
                    throw null;
                }
                c();
                if (this.h < this.i || g(1)) {
                    int i19 = this.h;
                    if (cArr[i19] == '>') {
                        this.h = i19 + 1;
                    }
                }
            }
        }
        i = 0;
        iV2 = v(true);
        if (iV2 != 34) {
            this.l = 9;
            return 9;
        }
        if (iV2 != 39) {
            c();
            this.l = 8;
            return 8;
        }
        if (iV2 != 44) {
            if (iV2 != 91) {
                this.l = 3;
                return 3;
            }
            if (iV2 != 93) {
                if (iV2 != 123) {
                    this.l = 1;
                    return 1;
                }
                int i110 = this.h - 1;
                this.h = i110;
                c = cArr[i110];
                if (c != 't') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                    length = str.length();
                    i3 = 1;
                    while (true) {
                        if (i3 >= length) {
                            if (this.h + length < this.i) {
                            }
                            this.h += length;
                            this.l = i2;
                            break;
                        }
                        i3 = this.h + i3 >= this.i ? i3 + 1 : i3 + 1;
                    }
                    if (i2 != 0) {
                        return i2;
                    }
                    int i111 = this.h;
                    i4 = this.i;
                    i5 = i;
                    i6 = i5;
                    int i112 = i6;
                    i7 = i111;
                    z = true;
                    long j4 = 0;
                    while (true) {
                        if (i7 + i6 != i4) {
                            c3 = cArr[i7 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (i5 != 2) {
                                    }
                                    i5 = 5;
                                    i6++;
                                } else {
                                    if (i5 != 2) {
                                    }
                                    i5 = 5;
                                    i6++;
                                }
                                if (i8 != 0) {
                                    return i8;
                                }
                                if (q(cArr[this.h])) {
                                    i0("Expected value");
                                    throw null;
                                }
                                c();
                                this.l = 10;
                                return 10;
                            }
                            if (i5 != 5) {
                            }
                            i5 = 6;
                            i6++;
                        } else if (i6 != cArr.length) {
                            if (g(i6 + 1)) {
                                i7 = this.h;
                                i4 = this.i;
                                c3 = cArr[i7 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (i5 != 2) {
                                        }
                                        i5 = 5;
                                        i6++;
                                    } else {
                                        if (i5 != 2) {
                                        }
                                        i5 = 5;
                                        i6++;
                                    }
                                    if (i8 != 0) {
                                        return i8;
                                    }
                                    if (q(cArr[this.h])) {
                                        i0("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.l = 10;
                                    return 10;
                                }
                                if (i5 != 5) {
                                }
                                i5 = 6;
                                i6++;
                            }
                            i9 = 2;
                            if (i5 != 2) {
                                if (i5 != i9) {
                                }
                                this.n = i6;
                                i8 = 16;
                                this.l = 16;
                            } else {
                                if (z) {
                                }
                                i9 = 2;
                                if (i5 != i9) {
                                }
                                this.n = i6;
                                i8 = 16;
                                this.l = 16;
                            }
                            if (i8 != 0) {
                                return i8;
                            }
                            if (q(cArr[this.h])) {
                                i0("Expected value");
                                throw null;
                            }
                            c();
                            this.l = 10;
                            return 10;
                        }
                        i8 = 0;
                        if (i8 != 0) {
                            return i8;
                        }
                        if (q(cArr[this.h])) {
                            i0("Expected value");
                            throw null;
                        }
                        c();
                        this.l = 10;
                        return 10;
                    }
                }
                str = "true";
                str2 = "TRUE";
                i2 = 5;
                length = str.length();
                i3 = 1;
                while (true) {
                    if (i3 >= length) {
                        if (this.h + length < this.i) {
                        }
                        this.h += length;
                        this.l = i2;
                        break;
                    }
                    if (this.h + i3 >= this.i) {
                    }
                }
                if (i2 != 0) {
                    return i2;
                }
                int i113 = this.h;
                i4 = this.i;
                i5 = i;
                i6 = i5;
                int i114 = i6;
                i7 = i113;
                z = true;
                long j5 = 0;
                while (true) {
                    if (i7 + i6 != i4) {
                        c3 = cArr[i7 + i6];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (i5 != 2) {
                                }
                                i5 = 5;
                                i6++;
                            } else {
                                if (i5 != 2) {
                                }
                                i5 = 5;
                                i6++;
                            }
                            if (i8 != 0) {
                                return i8;
                            }
                            if (q(cArr[this.h])) {
                                i0("Expected value");
                                throw null;
                            }
                            c();
                            this.l = 10;
                            return 10;
                        }
                        if (i5 != 5) {
                        }
                        i5 = 6;
                        i6++;
                    } else if (i6 != cArr.length) {
                        if (g(i6 + 1)) {
                            i7 = this.h;
                            i4 = this.i;
                            c3 = cArr[i7 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (i5 != 2) {
                                    }
                                    i5 = 5;
                                    i6++;
                                } else {
                                    if (i5 != 2) {
                                    }
                                    i5 = 5;
                                    i6++;
                                }
                                if (i8 != 0) {
                                    return i8;
                                }
                                if (q(cArr[this.h])) {
                                    i0("Expected value");
                                    throw null;
                                }
                                c();
                                this.l = 10;
                                return 10;
                            }
                            if (i5 != 5) {
                            }
                            i5 = 6;
                            i6++;
                        }
                        i9 = 2;
                        if (i5 != 2) {
                            if (i5 != i9) {
                            }
                            this.n = i6;
                            i8 = 16;
                            this.l = 16;
                        } else {
                            if (z) {
                            }
                            i9 = 2;
                            if (i5 != i9) {
                            }
                            this.n = i6;
                            i8 = 16;
                            this.l = 16;
                        }
                        if (i8 != 0) {
                            return i8;
                        }
                        if (q(cArr[this.h])) {
                            i0("Expected value");
                            throw null;
                        }
                        c();
                        this.l = 10;
                        return 10;
                    }
                    i8 = 0;
                    if (i8 != 0) {
                        return i8;
                    }
                    if (q(cArr[this.h])) {
                        i0("Expected value");
                        throw null;
                    }
                    c();
                    this.l = 10;
                    return 10;
                }
                i2 = i;
                if (i2 != 0) {
                    return i2;
                }
                int i115 = this.h;
                i4 = this.i;
                i5 = i;
                i6 = i5;
                int i116 = i6;
                i7 = i115;
                z = true;
                long j6 = 0;
                while (true) {
                    if (i7 + i6 != i4) {
                        c3 = cArr[i7 + i6];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (i5 != 2) {
                                }
                                i5 = 5;
                                i6++;
                            } else {
                                if (i5 != 2) {
                                }
                                i5 = 5;
                                i6++;
                            }
                            if (i8 != 0) {
                                return i8;
                            }
                            if (q(cArr[this.h])) {
                                i0("Expected value");
                                throw null;
                            }
                            c();
                            this.l = 10;
                            return 10;
                        }
                        if (i5 != 5) {
                        }
                        i5 = 6;
                        i6++;
                    } else if (i6 != cArr.length) {
                        if (g(i6 + 1)) {
                            i7 = this.h;
                            i4 = this.i;
                            c3 = cArr[i7 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (i5 != 2) {
                                    }
                                    i5 = 5;
                                    i6++;
                                } else {
                                    if (i5 != 2) {
                                    }
                                    i5 = 5;
                                    i6++;
                                }
                                if (i8 != 0) {
                                    return i8;
                                }
                                if (q(cArr[this.h])) {
                                    i0("Expected value");
                                    throw null;
                                }
                                c();
                                this.l = 10;
                                return 10;
                            }
                            if (i5 != 5) {
                            }
                            i5 = 6;
                            i6++;
                        }
                        i9 = 2;
                        if (i5 != 2) {
                            if (i5 != i9) {
                            }
                            this.n = i6;
                            i8 = 16;
                            this.l = 16;
                        } else {
                            if (z) {
                            }
                            i9 = 2;
                            if (i5 != i9) {
                            }
                            this.n = i6;
                            i8 = 16;
                            this.l = 16;
                        }
                        if (i8 != 0) {
                            return i8;
                        }
                        if (q(cArr[this.h])) {
                            i0("Expected value");
                            throw null;
                        }
                        c();
                        this.l = 10;
                        return 10;
                    }
                    i8 = 0;
                    if (i8 != 0) {
                        return i8;
                    }
                    if (q(cArr[this.h])) {
                        i0("Expected value");
                        throw null;
                    }
                    c();
                    this.l = 10;
                    return 10;
                }
            }
            if (i11 == 1) {
                this.l = 4;
                return 4;
            }
        }
        if (i11 == 1) {
        }
        c();
        this.h--;
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

    public void h1() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + G() + t());
        }
        int i = this.q;
        this.q = i - 1;
        int[] iArr = this.s;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.l = 0;
    }

    public boolean hasNext() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        return (iF == 2 || iF == 4 || iF == 17) ? false : true;
    }

    public final void i0(String str) throws C3584eW0 {
        StringBuilder sbF = C1039Gc0.f(str);
        sbF.append(t());
        throw new C3584eW0(sbF.toString());
    }

    public String k() {
        return l(false);
    }

    public final String l(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.q;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.p[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.s[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = this.r[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public void l1() throws IOException {
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 3) {
            L(1);
            this.s[this.q - 1] = 0;
            this.l = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + G() + t());
        }
    }

    public String p() {
        return l(true);
    }

    public final boolean q(char c) throws C3584eW0 {
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

    final String t() {
        return " at line " + (this.j + 1) + " column " + ((this.h - this.k) + 1) + " path " + k();
    }

    public String toString() {
        return getClass().getSimpleName() + t();
    }

    public boolean u() throws IOException {
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
            throw new IllegalStateException("Expected a boolean but was " + G() + t());
        }
        this.l = 0;
        int[] iArr2 = this.s;
        int i2 = this.q - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final int v(boolean z) throws IOException {
        int i = this.h;
        int i2 = this.i;
        while (true) {
            if (i == i2) {
                this.h = i;
                if (!g(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + t());
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
                                i0("Unterminated comment");
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
                        X();
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
                    X();
                    i = this.h;
                    i2 = this.i;
                }
            }
            i = i3;
        }
    }

    public String x0() throws IOException {
        String strC;
        int iF = this.l;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            strC = D();
        } else if (iF == 12) {
            strC = C('\'');
        } else {
            if (iF != 13) {
                throw new IllegalStateException("Expected a name but was " + G() + t());
            }
            strC = C('\"');
        }
        this.l = 0;
        this.r[this.q - 1] = strC;
        return strC;
    }
}

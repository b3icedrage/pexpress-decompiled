package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4995l0 {
    public int a;

    @NotNull
    public final C6739tH0 b;

    @Nullable
    public String c;

    @NotNull
    public final StringBuilder d;

    public AbstractC4995l0() {
        C6739tH0 c6739tH0 = new C6739tH0();
        c6739tH0.a = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        c6739tH0.b = iArr;
        c6739tH0.c = -1;
        this.b = c6739tH0;
        this.d = new StringBuilder();
    }

    public static /* synthetic */ void r(AbstractC4995l0 abstractC4995l0, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = abstractC4995l0.a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        abstractC4995l0.q(i, str, str2);
        throw null;
    }

    @NotNull
    public String A(int i, int i2) {
        return u().subSequence(i, i2).toString();
    }

    public abstract boolean B();

    public final void C(char c) {
        int i = this.a;
        if (i > 0 && c == '\"') {
            try {
                this.a = i - 1;
                String strL = l();
                this.a = i;
                if (Intrinsics.a(strL, "null")) {
                    q(this.a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.a = i;
                throw th;
            }
        }
        s(C5208m0.e(c), true);
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.d.append((char) (t(i + 3, charSequence) + (t(i, charSequence) << 12) + (t(i + 1, charSequence) << 8) + (t(i + 2, charSequence) << 4)));
            return i2;
        }
        this.a = i;
        o();
        if (this.a + 4 < charSequence.length()) {
            return a(this.a, charSequence);
        }
        r(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i, int i2) {
        this.d.append(u(), i, i2);
    }

    public abstract boolean c();

    public final void d(int i, String str) {
        if (u().length() - i < str.length()) {
            r(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (u().charAt(i + i2) | ' ')) {
                r(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.a = str.length() + i;
    }

    @NotNull
    public abstract String e();

    public abstract byte f();

    public final byte g(byte b) {
        byte bF = f();
        if (bF == b) {
            return bF;
        }
        s(b, true);
        throw null;
    }

    public void h(char c) {
        o();
        CharSequence charSequenceU = u();
        int i = this.a;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.a = iY;
                C(c);
                throw null;
            }
            int i2 = iY + 1;
            char cCharAt = charSequenceU.charAt(iY);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i2;
                if (cCharAt == c) {
                    return;
                }
                C(c);
                throw null;
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final long i() {
        boolean z;
        boolean z2;
        double dPow;
        int iY = y(z());
        ?? r6 = 0;
        if (iY >= u().length() || iY == -1) {
            r(this, "EOF", 0, null, 6);
            throw null;
        }
        if (u().charAt(iY) == '\"') {
            iY++;
            if (iY == u().length()) {
                r(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iY;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i == u().length()) {
                z = z;
                z2 = z4;
                break;
            }
            char cCharAt = u().charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z4) {
                z = z;
                if (cCharAt == '-' && z4) {
                    if (i == iY) {
                        r(this, "Unexpected symbol '-' in numeric literal", 0, r6, 6);
                        throw r6;
                    }
                    i++;
                    z3 = false;
                    r6 = r6;
                } else if (cCharAt != '+' || !z4) {
                    z2 = z4;
                    if (cCharAt != '-') {
                        if (C5208m0.e(cCharAt) != 0) {
                            break;
                        }
                        i++;
                        int i2 = cCharAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            ?? r12 = r6;
                            r(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, r12, 6);
                            throw r12;
                        }
                        if (z2) {
                            j = (j * ((long) 10)) + ((long) i2);
                            z4 = z2;
                            r6 = r6;
                        } else {
                            boolean z6 = z3;
                            j2 = (j2 * ((long) 10)) - ((long) i2);
                            if (j2 > 0) {
                                r(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                            z3 = z6;
                            z4 = z2;
                            r6 = 0;
                        }
                    } else {
                        if (i != iY) {
                            r(this, "Unexpected symbol '-' in numeric literal", 0, r6, 6);
                            throw r6;
                        }
                        i++;
                        z = z;
                        z4 = z2;
                        z5 = true;
                    }
                } else {
                    if (i == iY) {
                        r(this, "Unexpected symbol '+' in numeric literal", 0, r6, 6);
                        throw r6;
                    }
                    i++;
                    z3 = true;
                    r6 = r6;
                }
            } else {
                if (i == iY) {
                    r(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r6, 6);
                    throw r6;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z7 = z3;
        boolean z8 = i != iY;
        if (iY == i || (z5 && iY == i - 1)) {
            r(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z) {
            if (!z8) {
                r(this, "EOF", 0, null, 6);
                throw null;
            }
            if (u().charAt(i) != '\"') {
                r(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i++;
        }
        this.a = i;
        if (z2) {
            double d = j2;
            if (!z7) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (!z7) {
                    throw new C6489s51();
                }
                dPow = Math.pow(10.0d, j);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                r(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                r(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j2 = (long) d2;
        }
        if (z5) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        r(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    @NotNull
    public final String j() {
        String str = this.c;
        if (str == null) {
            return e();
        }
        Intrinsics.checkNotNull(str);
        this.c = null;
        return str;
    }

    @NotNull
    public final String k(@NotNull CharSequence source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i, i2);
                int iY = y(i2 + 1);
                if (iY == -1) {
                    r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA = iY + 1;
                char cCharAt2 = u().charAt(iY);
                if (cCharAt2 == 'u') {
                    iA = a(iA, u());
                } else {
                    char c = cCharAt2 < 'u' ? C6088qA.a[cCharAt2] : (char) 0;
                    if (c == 0) {
                        r(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    this.d.append(c);
                }
                i = y(iA);
                if (i == -1) {
                    r(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    b(i, i2);
                    i = y(i2);
                    if (i == -1) {
                        r(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = source.charAt(i2);
            }
            i2 = i;
            z = true;
            cCharAt = source.charAt(i2);
        }
        String strA = !z ? A(i, i2) : n(i, i2);
        this.a = i2 + 1;
        return strA;
    }

    @NotNull
    public final String l() {
        String str = this.c;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            this.c = null;
            return str;
        }
        int iZ = z();
        if (iZ >= u().length() || iZ == -1) {
            r(this, "EOF", iZ, null, 4);
            throw null;
        }
        byte bE = C5208m0.e(u().charAt(iZ));
        if (bE == 1) {
            return j();
        }
        if (bE != 0) {
            r(this, "Expected beginning of the string, but got " + u().charAt(iZ), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (C5208m0.e(u().charAt(iZ)) == 0) {
            iZ++;
            if (iZ >= u().length()) {
                b(this.a, iZ);
                int iY = y(iZ);
                if (iY == -1) {
                    this.a = iZ;
                    return n(0, 0);
                }
                iZ = iY;
                z = true;
            }
        }
        String strA = !z ? A(this.a, iZ) : n(this.a, iZ);
        this.a = iZ;
        return strA;
    }

    @NotNull
    public final String m() {
        String strL = l();
        if (!Intrinsics.a(strL, "null") || u().charAt(this.a - 1) == '\"') {
            return strL;
        }
        r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final String n(int i, int i2) {
        b(i, i2);
        StringBuilder sb = this.d;
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public final void p() {
        if (f() == 10) {
            return;
        }
        r(this, "Expected EOF after parsing, but had " + u().charAt(this.a - 1) + " instead", 0, null, 6);
        throw null;
    }

    @NotNull
    public final void q(int i, @NotNull String message, @NotNull String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbB = K1.b(message, " at path: ");
        sbB.append(this.b.a());
        sbB.append(strConcat);
        throw C1874Qu.e(sbB.toString(), u(), i);
    }

    @NotNull
    public final void s(byte b, boolean z) {
        String strU = C5208m0.u(b);
        int i = z ? this.a - 1 : this.a;
        r(this, C4694ja0.a("Expected ", strU, ", but had '", (this.a == u().length() || i < 0) ? "EOF" : String.valueOf(u().charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public final int t(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    @NotNull
    public final String toString() {
        return "JsonReader(source='" + ((Object) u()) + "', currentPosition=" + this.a + ')';
    }

    @NotNull
    public abstract CharSequence u();

    @Nullable
    public abstract String v(@NotNull String str, boolean z);

    public final byte w() {
        CharSequence charSequenceU = u();
        int i = this.a;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.a = iY;
                return (byte) 10;
            }
            char cCharAt = charSequenceU.charAt(iY);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = iY;
                return C5208m0.e(cCharAt);
            }
            i = iY + 1;
        }
    }

    @Nullable
    public final String x(boolean z) {
        String strJ;
        byte bW = w();
        if (z) {
            if (bW != 1 && bW != 0) {
                return null;
            }
            strJ = l();
        } else {
            if (bW != 1) {
                return null;
            }
            strJ = j();
        }
        this.c = strJ;
        return strJ;
    }

    public abstract int y(int i);

    public int z() {
        int iY;
        char cCharAt;
        int i = this.a;
        while (true) {
            iY = y(i);
            if (iY == -1 || !((cCharAt = u().charAt(iY)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i = iY + 1;
        }
        this.a = iY;
        return iY;
    }

    public void o() {
    }
}

package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UH0 extends YH0 {
    public static final String[] n = new String[UserVerificationMethods.USER_VERIFY_PATTERN];
    public final C1481Lu k;
    public final String l = ":";
    public String m;

    static {
        for (int i = 0; i <= 31; i++) {
            n[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public UH0(C1481Lu c1481Lu) {
        this.k = c1481Lu;
        v(6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void Z(C1481Lu c1481Lu, String str) {
        String str2;
        String[] strArr = n;
        c1481Lu.j1(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        c1481Lu.v1(i, i2, str);
                    }
                    c1481Lu.w1(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    c1481Lu.v1(i, i2, str);
                }
                c1481Lu.w1(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            c1481Lu.v1(i, length, str);
        }
        c1481Lu.j1(34);
    }

    @Override // defpackage.YH0
    public final YH0 A(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        if (this.i) {
            this.i = false;
            q(Double.toString(d));
            return this;
        }
        i0();
        P();
        this.k.w1(Double.toString(d));
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 C(long j) {
        if (this.i) {
            this.i = false;
            q(Long.toString(j));
            return this;
        }
        i0();
        P();
        this.k.w1(Long.toString(j));
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 D(@Nullable Float f) {
        if (f == null) {
            t();
            return this;
        }
        String string = f.toString();
        if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        if (this.i) {
            this.i = false;
            q(string);
            return this;
        }
        i0();
        P();
        this.k.w1(string);
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 G(String str) {
        if (str == null) {
            t();
            return this;
        }
        if (this.i) {
            this.i = false;
            q(str);
            return this;
        }
        i0();
        P();
        Z(this.k, str);
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 L(boolean z) {
        if (this.i) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + p());
        }
        i0();
        P();
        this.k.w1(z ? "true" : "false");
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void P() {
        int iU = u();
        int i = 2;
        if (iU != 1) {
            C1481Lu c1481Lu = this.k;
            if (iU == 2) {
                c1481Lu.j1(44);
            } else if (iU == 4) {
                c1481Lu.w1(this.l);
                i = 5;
            } else {
                if (iU == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iU != 6) {
                    if (iU != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                i = 7;
            }
        }
        this.e[this.d - 1] = i;
    }

    public final void W(char c, int i, int i2) {
        int iU = u();
        if (iU != i2 && iU != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.m != null) {
            throw new IllegalStateException("Dangling name: " + this.m);
        }
        int i3 = this.d;
        int i4 = ~this.j;
        if (i3 == i4) {
            this.j = i4;
            return;
        }
        int i5 = i3 - 1;
        this.d = i5;
        this.g[i5] = null;
        int[] iArr = this.h;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.k.j1(c);
    }

    public final void X(char c, int i, int i2) {
        int i3;
        int i4 = this.d;
        int i5 = this.j;
        if (i4 == i5 && ((i3 = this.e[i4 - 1]) == i || i3 == i2)) {
            this.j = ~i5;
            return;
        }
        P();
        g();
        v(i);
        this.h[this.d - 1] = 0;
        this.k.j1(c);
    }

    @Override // defpackage.YH0
    public final YH0 c() {
        if (this.i) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + p());
        }
        i0();
        X('[', 1, 2);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.k.getClass();
        int i = this.d;
        if (i > 1 || (i == 1 && this.e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.d = 0;
    }

    @Override // defpackage.YH0
    public final YH0 f() {
        if (this.i) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + p());
        }
        i0();
        X('{', 3, 5);
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.k.getClass();
    }

    public final void i0() {
        if (this.m != null) {
            int iU = u();
            C1481Lu c1481Lu = this.k;
            if (iU == 5) {
                c1481Lu.j1(44);
            } else if (iU != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.e[this.d - 1] = 4;
            Z(c1481Lu, this.m);
            this.m = null;
        }
    }

    @Override // defpackage.YH0
    public final YH0 k() {
        W(']', 1, 2);
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 l() {
        this.i = false;
        W('}', 3, 5);
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 q(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iU = u();
        if ((iU != 3 && iU != 5) || this.m != null || this.i) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.m = str;
        this.g[this.d - 1] = str;
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 t() {
        if (this.i) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + p());
        }
        if (this.m != null) {
            this.m = null;
            return this;
        }
        P();
        this.k.w1("null");
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}

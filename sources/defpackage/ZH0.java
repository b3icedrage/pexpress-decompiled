package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ZH0 implements Closeable, Flushable {
    public static final Pattern m = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] n = new String[UserVerificationMethods.USER_VERIFY_PATTERN];
    public static final String[] o;
    public final Writer d;
    public int[] e;
    public int g;
    public final String h;
    public boolean i;
    public boolean j;
    public String k;
    public boolean l;

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
        String[] strArr2 = (String[]) strArr.clone();
        o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public ZH0(Writer writer) {
        int[] iArr = new int[32];
        this.e = iArr;
        this.g = 0;
        if (iArr.length == 0) {
            this.e = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.e;
        int i = this.g;
        this.g = i + 1;
        iArr2[i] = 6;
        this.h = ":";
        this.l = true;
        Objects.requireNonNull(writer, "out == null");
        this.d = writer;
    }

    public void A(Number number) throws IOException {
        if (number == null) {
            l();
            return;
        }
        G();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !m.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.i) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        c();
        this.d.append((CharSequence) string);
    }

    public void B0() throws IOException {
        f('}', 3, 5);
    }

    public void C(String str) throws IOException {
        if (str == null) {
            l();
            return;
        }
        G();
        c();
        q(str);
    }

    public void D(boolean z) throws IOException {
        G();
        c();
        this.d.write(z ? "true" : "false");
    }

    public final void G() throws IOException {
        if (this.k != null) {
            int iP = p();
            if (iP == 5) {
                this.d.write(44);
            } else if (iP != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            k();
            this.e[this.g - 1] = 4;
            q(this.k);
            this.k = null;
        }
    }

    public void X0() throws IOException {
        G();
        c();
        int i = this.g;
        int[] iArr = this.e;
        if (i == iArr.length) {
            this.e = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr2[i2] = 3;
        this.d.write(123);
    }

    public final void c() throws IOException {
        int iP = p();
        if (iP == 1) {
            this.e[this.g - 1] = 2;
            k();
            return;
        }
        Writer writer = this.d;
        if (iP == 2) {
            writer.append(',');
            k();
        } else {
            if (iP == 4) {
                writer.append((CharSequence) this.h);
                this.e[this.g - 1] = 5;
                return;
            }
            if (iP != 6) {
                if (iP != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.i) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.e[this.g - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d.close();
        int i = this.g;
        if (i > 1 || (i == 1 && this.e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.g = 0;
    }

    public final void f(char c, int i, int i2) throws IOException {
        int iP = p();
        if (iP != i2 && iP != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Dangling name: " + this.k);
        }
        this.g--;
        if (iP == i2) {
            k();
        }
        this.d.write(c);
    }

    public void flush() throws IOException {
        if (this.g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.d.flush();
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.k != null) {
            throw new IllegalStateException();
        }
        if (this.g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.k = str;
    }

    public void h1() throws IOException {
        f(']', 1, 2);
    }

    public ZH0 l() throws IOException {
        if (this.k != null) {
            if (!this.l) {
                this.k = null;
                return this;
            }
            G();
        }
        c();
        this.d.write("null");
        return this;
    }

    public void l1() throws IOException {
        G();
        c();
        int i = this.g;
        int[] iArr = this.e;
        if (i == iArr.length) {
            this.e = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr2[i2] = 1;
        this.d.write(91);
    }

    public final int p() {
        int i = this.g;
        if (i != 0) {
            return this.e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void q(String str) throws IOException {
        String str2;
        String[] strArr = this.j ? o : n;
        Writer writer = this.d;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public void t(double d) throws IOException {
        G();
        if (this.i || !(Double.isNaN(d) || Double.isInfinite(d))) {
            c();
            this.d.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void u(long j) throws IOException {
        G();
        c();
        this.d.write(Long.toString(j));
    }

    public void v(Boolean bool) throws IOException {
        if (bool == null) {
            l();
            return;
        }
        G();
        c();
        this.d.write(bool.booleanValue() ? "true" : "false");
    }

    public final void k() {
    }
}

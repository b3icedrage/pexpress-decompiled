package io.sentry.vendor.gson.stream;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Closeable, Flushable {
    public static final String[] m = new String[UserVerificationMethods.USER_VERIFY_PATTERN];
    public final Writer d;
    public int[] e;
    public int g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public final boolean l;

    static {
        for (int i = 0; i <= 31; i++) {
            m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
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
        this.i = ":";
        this.l = true;
        this.d = writer;
    }

    public final void c() throws IOException {
        int iL = l();
        if (iL == 1) {
            this.e[this.g - 1] = 2;
            g();
            return;
        }
        Writer writer = this.d;
        if (iL == 2) {
            writer.append(',');
            g();
        } else {
            if (iL == 4) {
                writer.append((CharSequence) this.i);
                this.e[this.g - 1] = 5;
                return;
            }
            if (iL != 6) {
                if (iL != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.j) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.e[this.g - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
        int i = this.g;
        if (i > 1 || (i == 1 && this.e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.g = 0;
    }

    public final void f(char c, int i, int i2) throws IOException {
        int iL = l();
        if (iL != i2 && iL != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Dangling name: " + this.k);
        }
        this.g--;
        if (iL == i2) {
            g();
        }
        this.d.write(c);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.d.flush();
    }

    public final void g() throws IOException {
        if (this.h == null) {
            return;
        }
        Writer writer = this.d;
        writer.write(10);
        int i = this.g;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.h);
        }
    }

    public final void k() throws IOException {
        if (this.k != null) {
            if (!this.l) {
                this.k = null;
                return;
            }
            q();
        }
        c();
        this.d.write("null");
    }

    public final int l() {
        int i = this.g;
        if (i != 0) {
            return this.e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final void p(String str) throws IOException {
        String str2;
        String[] strArr = m;
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

    public final void q() throws IOException {
        if (this.k != null) {
            int iL = l();
            if (iL == 5) {
                this.d.write(44);
            } else if (iL != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            g();
            this.e[this.g - 1] = 4;
            p(this.k);
            this.k = null;
        }
    }
}

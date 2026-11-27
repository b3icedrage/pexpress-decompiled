package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class XH0 extends YH0 {
    public Object[] k = new Object[32];

    @Nullable
    public String l;

    public XH0() {
        v(6);
    }

    @Override // defpackage.YH0
    public final YH0 A(double d) {
        if (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        if (this.i) {
            this.i = false;
            q(Double.toString(d));
            return this;
        }
        P(Double.valueOf(d));
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
        P(Long.valueOf(j));
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 D(@Nullable Float f) {
        if (f != null) {
            A(f.doubleValue());
            return this;
        }
        if (f == null) {
            t();
            return this;
        }
        BigDecimal bigDecimal = new BigDecimal(f.toString());
        if (this.i) {
            this.i = false;
            q(bigDecimal.toString());
            return this;
        }
        P(bigDecimal);
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 G(@Nullable String str) {
        if (this.i) {
            this.i = false;
            q(str);
            return this;
        }
        P(str);
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
        P(Boolean.valueOf(z));
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void P(@Nullable Serializable serializable) {
        String str;
        Object objPut;
        int iU = u();
        int i = this.d;
        if (i == 1) {
            if (iU != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            int i2 = i - 1;
            this.e[i2] = 7;
            this.k[i2] = serializable;
            return;
        }
        if (iU != 3 || (str = this.l) == null) {
            if (iU == 1) {
                ((List) this.k[i - 1]).add(serializable);
                return;
            } else {
                if (iU != 9) {
                    throw new IllegalStateException("Nesting problem.");
                }
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
        }
        if (serializable == null || (objPut = ((Map) this.k[i - 1]).put(str, serializable)) == null) {
            this.l = null;
            return;
        }
        throw new IllegalArgumentException("Map key '" + this.l + "' has multiple values at path " + p() + ": " + objPut + " and " + serializable);
    }

    @Override // defpackage.YH0
    public final YH0 c() {
        if (this.i) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + p());
        }
        int i = this.d;
        int i2 = this.j;
        if (i == i2 && this.e[i - 1] == 1) {
            this.j = ~i2;
            return this;
        }
        g();
        ArrayList arrayList = new ArrayList();
        P(arrayList);
        Object[] objArr = this.k;
        int i3 = this.d;
        objArr[i3] = arrayList;
        this.h[i3] = 0;
        v(1);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
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
        int i = this.d;
        int i2 = this.j;
        if (i == i2 && this.e[i - 1] == 3) {
            this.j = ~i2;
            return this;
        }
        g();
        C7397wQ0 c7397wQ0 = new C7397wQ0();
        P(c7397wQ0);
        this.k[this.d] = c7397wQ0;
        v(3);
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // defpackage.YH0
    public final YH0 k() {
        if (u() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = this.d;
        int i2 = this.j;
        if (i == (~i2)) {
            this.j = ~i2;
            return this;
        }
        int i3 = i - 1;
        this.d = i3;
        this.k[i3] = null;
        int[] iArr = this.h;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 l() {
        if (u() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.l != null) {
            throw new IllegalStateException("Dangling name: " + this.l);
        }
        int i = this.d;
        int i2 = this.j;
        if (i == (~i2)) {
            this.j = ~i2;
            return this;
        }
        this.i = false;
        int i3 = i - 1;
        this.d = i3;
        this.k[i3] = null;
        this.g[i3] = null;
        int[] iArr = this.h;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
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
        if (u() != 3 || this.l != null || this.i) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.l = str;
        this.g[this.d - 1] = str;
        return this;
    }

    @Override // defpackage.YH0
    public final YH0 t() {
        if (this.i) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + p());
        }
        P(null);
        int[] iArr = this.h;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}

package defpackage;

import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.c;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6319rH0 implements W71 {

    @NotNull
    public final c a;

    @NotNull
    public final C4257hi b;

    public C6319rH0(@NotNull Writer writer, int i) {
        this.a = new c(writer);
        this.b = new C4257hi(i);
    }

    public final C6319rH0 a() {
        c cVar = this.a;
        cVar.q();
        cVar.c();
        int i = cVar.g;
        int[] iArr = cVar.e;
        if (i == iArr.length) {
            cVar.e = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = cVar.e;
        int i2 = cVar.g;
        cVar.g = i2 + 1;
        iArr2[i2] = 3;
        cVar.d.write(123);
        return this;
    }

    public final C6319rH0 b() {
        this.a.f('}', 3, 5);
        return this;
    }

    public final C6319rH0 c(@NotNull String str) {
        c cVar = this.a;
        if (str == null) {
            cVar.getClass();
            throw new NullPointerException("name == null");
        }
        if (cVar.k != null) {
            throw new IllegalStateException();
        }
        if (cVar.g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        cVar.k = str;
        return this;
    }

    public final void d(@Nullable String str) {
        c cVar = this.a;
        if (str != null) {
            cVar.getClass();
            if (str.length() != 0) {
                cVar.h = str;
                cVar.i = ": ";
                return;
            }
        }
        cVar.h = null;
        cVar.i = ":";
    }

    public final C6319rH0 e(double d) throws IOException {
        c cVar = this.a;
        cVar.q();
        if (cVar.j || !(Double.isNaN(d) || Double.isInfinite(d))) {
            cVar.c();
            cVar.d.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public final C6319rH0 f(long j) {
        c cVar = this.a;
        cVar.q();
        cVar.c();
        cVar.d.write(Long.toString(j));
        return this;
    }

    public final C6319rH0 g(@NotNull ILogger iLogger, @Nullable Object obj) {
        this.b.a(this, iLogger, obj);
        return this;
    }

    public final C6319rH0 h(@Nullable Boolean bool) throws IOException {
        c cVar = this.a;
        if (bool == null) {
            cVar.k();
            return this;
        }
        cVar.q();
        cVar.c();
        cVar.d.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public final C6319rH0 i(@Nullable Number number) throws IOException {
        c cVar = this.a;
        if (number == null) {
            cVar.k();
            return this;
        }
        cVar.q();
        String string = number.toString();
        if (cVar.j || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            cVar.c();
            cVar.d.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public final C6319rH0 j(@Nullable String str) {
        c cVar = this.a;
        if (str == null) {
            cVar.k();
            return this;
        }
        cVar.q();
        cVar.c();
        cVar.p(str);
        return this;
    }

    public final C6319rH0 k(boolean z) throws IOException {
        c cVar = this.a;
        cVar.q();
        cVar.c();
        cVar.d.write(z ? "true" : "false");
        return this;
    }
}

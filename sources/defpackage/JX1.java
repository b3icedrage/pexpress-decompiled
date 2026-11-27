package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class JX1 {
    public final int a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @Nullable
    public final Throwable f;

    @NotNull
    public final Map<String, Object> g;

    public JX1(int i, @NotNull String errorClass, @NotNull String kind, @NotNull String text, @NotNull String platformCode, @Nullable Throwable th, @NotNull Map<String, ? extends Object> http) {
        Intrinsics.checkNotNullParameter(errorClass, "errorClass");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(platformCode, "platformCode");
        Intrinsics.checkNotNullParameter(http, "http");
        this.a = i;
        this.b = errorClass;
        this.c = kind;
        this.d = text;
        this.e = platformCode;
        this.f = th;
        this.g = http;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JX1)) {
            return false;
        }
        JX1 jx1 = (JX1) obj;
        return this.a == jx1.a && Intrinsics.a(this.b, jx1.b) && Intrinsics.a(this.c, jx1.c) && Intrinsics.a(this.d, jx1.d) && Intrinsics.a(this.e, jx1.e) && Intrinsics.a(this.f, jx1.f) && Intrinsics.a(this.g, jx1.g);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Throwable th = this.f;
        return this.g.hashCode() + ((iB + (th == null ? 0 : th.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "TelemetryFailure(code=" + this.a + ", errorClass=" + this.b + ", kind=" + this.c + ", text=" + this.d + ", platformCode=" + this.e + ", cause=" + this.f + ", http=" + this.g + ")";
    }

    public /* synthetic */ JX1(String str, String str2, String str3, Throwable th) {
        this(0, str, str2, str3, "", th, PW0.c());
    }
}

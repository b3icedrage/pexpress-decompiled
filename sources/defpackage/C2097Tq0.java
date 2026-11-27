package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2097Tq0 {

    @NotNull
    public static final C2097Tq0 d = new C2097Tq0("HTTP", 2, 0);

    @NotNull
    public static final C2097Tq0 e = new C2097Tq0("HTTP", 1, 1);

    @NotNull
    public static final C2097Tq0 f = new C2097Tq0("HTTP", 1, 0);

    @NotNull
    public static final C2097Tq0 g = new C2097Tq0("SPDY", 3, 0);

    @NotNull
    public static final C2097Tq0 h = new C2097Tq0("QUIC", 1, 0);

    @NotNull
    public final String a;
    public final int b;
    public final int c;

    public C2097Tq0(@NotNull String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2097Tq0)) {
            return false;
        }
        C2097Tq0 c2097Tq0 = (C2097Tq0) obj;
        return this.a.equals(c2097Tq0.a) && this.b == c2097Tq0.b && this.c == c2097Tq0.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + EF0.a(this.b, this.a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return this.a + '/' + this.b + JwtParser.SEPARATOR_CHAR + this.c;
    }
}

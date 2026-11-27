package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6751tL0 implements Comparable<C6751tL0> {

    @NotNull
    public static final a i = new a(null);

    @NotNull
    public static final C6751tL0 j = new C6751tL0(2, 1, 0);
    public final int d;
    public final int e;
    public final int g;
    public final int h;

    /* JADX INFO: renamed from: tL0$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C6751tL0(int i2, int i3, int i4) {
        this.d = i2;
        this.e = i3;
        this.g = i4;
        if (i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256 && i4 >= 0 && i4 < 256) {
            this.h = (i2 << 16) + (i3 << 8) + i4;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + JwtParser.SEPARATOR_CHAR + i3 + JwtParser.SEPARATOR_CHAR + i4).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(C6751tL0 c6751tL0) {
        C6751tL0 other = c6751tL0;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.h - other.h;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        C6751tL0 c6751tL0 = obj instanceof C6751tL0 ? (C6751tL0) obj : null;
        return c6751tL0 != null && this.h == c6751tL0.h;
    }

    public final int hashCode() {
        return this.h;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.e);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.g);
        return sb.toString();
    }
}

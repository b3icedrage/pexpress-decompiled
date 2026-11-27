package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2513Yp {
    public final double a;
    public final double b;

    @NotNull
    public final String c;

    public C2513Yp(double d, double d2, @NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.a = d;
        this.b = d2;
        this.c = result;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2513Yp)) {
            return false;
        }
        C2513Yp c2513Yp = (C2513Yp) obj;
        return Double.compare(this.a, c2513Yp.a) == 0 && Double.compare(this.b, c2513Yp.b) == 0 && Intrinsics.a(this.c, c2513Yp.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ID.a(this.b, Double.hashCode(this.a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "BalanceTarget(expected=" + this.a + ", snapshot=" + this.b + ", result=" + this.c + ")";
    }
}

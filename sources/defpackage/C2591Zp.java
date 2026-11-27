package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2591Zp {
    public final double a;

    @NotNull
    public final String b;

    public C2591Zp(double d, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.a = d;
        this.b = currencyCode;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2591Zp)) {
            return false;
        }
        C2591Zp c2591Zp = (C2591Zp) obj;
        return Double.compare(this.a, c2591Zp.a) == 0 && Intrinsics.a(this.b, c2591Zp.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "BalanceWithCurrency(balance=" + this.a + ", currencyCode=" + this.b + ")";
    }
}

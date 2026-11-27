package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4122h32 extends P80 {

    @InterfaceC2691aI1("finish_balance")
    @Nullable
    public final Double a;

    @InterfaceC2691aI1("finish_balance_usd")
    @Nullable
    public final Double b;

    @InterfaceC2691aI1("start_balance")
    @Nullable
    public final Double c;

    @InterfaceC2691aI1("start_balance_usd")
    @Nullable
    public final Double d;

    @InterfaceC2691aI1("currency")
    @NotNull
    public final String e;

    public C4122h32(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = currency;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4122h32)) {
            return false;
        }
        C4122h32 c4122h32 = (C4122h32) obj;
        return Intrinsics.a(this.a, c4122h32.a) && Intrinsics.a(this.b, c4122h32.b) && Intrinsics.a(this.c, c4122h32.c) && Intrinsics.a(this.d, c4122h32.d) && Intrinsics.a(this.e, c4122h32.e);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (d4 != null ? d4.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TradingLose(balance=");
        sb.append(this.a);
        sb.append(", balanceUsd=");
        sb.append(this.b);
        sb.append(", startBalance=");
        sb.append(this.c);
        sb.append(", startBalanceUsd=");
        sb.append(this.d);
        sb.append(", currency=");
        return C5807oq.b(sb, this.e, ")");
    }
}

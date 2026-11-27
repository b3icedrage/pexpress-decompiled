package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4126h42 extends P80 {

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

    @InterfaceC2691aI1("type")
    @NotNull
    public final String e;

    @InterfaceC2691aI1("currency")
    @NotNull
    public final String f;

    @InterfaceC2691aI1("result_amount")
    @NotNull
    public final String g;

    @InterfaceC2691aI1("result_amount_usd")
    @NotNull
    public final String h;

    @InterfaceC2691aI1("usd_rate_missing")
    @Nullable
    public final Boolean i;

    public C4126h42(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @NotNull String type, @NotNull String currency, @NotNull String balanceChange, @NotNull String balanceChangeUsd, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balanceChange, "balanceChange");
        Intrinsics.checkNotNullParameter(balanceChangeUsd, "balanceChangeUsd");
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = type;
        this.f = currency;
        this.g = balanceChange;
        this.h = balanceChangeUsd;
        this.i = bool;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4126h42)) {
            return false;
        }
        C4126h42 c4126h42 = (C4126h42) obj;
        return Intrinsics.a(this.a, c4126h42.a) && Intrinsics.a(this.b, c4126h42.b) && Intrinsics.a(this.c, c4126h42.c) && Intrinsics.a(this.d, c4126h42.d) && Intrinsics.a(this.e, c4126h42.e) && Intrinsics.a(this.f, c4126h42.f) && Intrinsics.a(this.g, c4126h42.g) && Intrinsics.a(this.h, c4126h42.h) && Intrinsics.a(this.i, c4126h42.i);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b((iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Boolean bool = this.i;
        return iB + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "TradingWin(balance=" + this.a + ", balanceUsd=" + this.b + ", startBalance=" + this.c + ", startBalanceUsd=" + this.d + ", type=" + this.e + ", currency=" + this.f + ", balanceChange=" + this.g + ", balanceChangeUsd=" + this.h + ", usdRateMissing=" + this.i + ")";
    }
}

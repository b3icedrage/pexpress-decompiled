package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: i42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4336i42 extends P80 {

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
    public final double g;

    @InterfaceC2691aI1("result_amount_usd")
    public final double h;

    public C4336i42(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @NotNull String type, @NotNull String currency, double d5, double d6) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = type;
        this.f = currency;
        this.g = d5;
        this.h = d6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4336i42)) {
            return false;
        }
        C4336i42 c4336i42 = (C4336i42) obj;
        return Intrinsics.a(this.a, c4336i42.a) && Intrinsics.a(this.b, c4336i42.b) && Intrinsics.a(this.c, c4336i42.c) && Intrinsics.a(this.d, c4336i42.d) && Intrinsics.a(this.e, c4336i42.e) && Intrinsics.a(this.f, c4336i42.f) && Double.compare(this.g, c4336i42.g) == 0 && Double.compare(this.h, c4336i42.h) == 0;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        return Double.hashCode(this.h) + ID.a(this.g, C1039Gc0.b(C1039Gc0.b((iHashCode3 + (d4 != null ? d4.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31);
    }

    @NotNull
    public final String toString() {
        return "TradingWinMixpanel(balance=" + this.a + ", balanceUsd=" + this.b + ", startBalance=" + this.c + ", startBalanceUsd=" + this.d + ", type=" + this.e + ", currency=" + this.f + ", balanceChange=" + this.g + ", balanceChangeUsd=" + this.h + ")";
    }
}

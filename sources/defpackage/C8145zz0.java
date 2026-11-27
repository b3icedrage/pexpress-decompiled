package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8145zz0 extends P80 {

    @InterfaceC2691aI1("asset_selection")
    @NotNull
    public final String a;

    @InterfaceC2691aI1("trading_strategy")
    @NotNull
    public final String b;

    @InterfaceC2691aI1("trading_asset")
    @NotNull
    public final String c;

    @InterfaceC2691aI1("technical_indicator")
    @NotNull
    public final String d;

    @InterfaceC2691aI1("start_amount")
    @NotNull
    public final String e;

    @InterfaceC2691aI1("currency")
    @NotNull
    public final String f;

    @InterfaceC2691aI1("play_time")
    @NotNull
    public final String g;

    @InterfaceC2691aI1("start_balance")
    @NotNull
    public final String h;

    @InterfaceC2691aI1("start_balance_usd")
    @NotNull
    public final String i;

    @InterfaceC2691aI1("loss_limit")
    public final boolean j;

    @InterfaceC2691aI1("profit_filter")
    @NotNull
    public final String k;

    @InterfaceC2691aI1("profit_filter_sum")
    @Nullable
    public final Double l;

    @InterfaceC2691aI1("oneclick_deals")
    public final boolean m;

    @InterfaceC2691aI1("start_deal_id")
    @NotNull
    public final String n;

    public C8145zz0(@NotNull String assetSelection, @NotNull String tradingStrategy, @NotNull String tradingAsset, @NotNull String technicalIndicator, @NotNull String startAmount, @NotNull String currency, @NotNull String playTime, @NotNull String startBalance, @NotNull String startBalanceUsd, boolean z, @NotNull String profitFilter, @Nullable Double d, boolean z2, @NotNull String startDealId) {
        Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
        Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
        Intrinsics.checkNotNullParameter(tradingAsset, "tradingAsset");
        Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
        Intrinsics.checkNotNullParameter(startAmount, "startAmount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(playTime, "playTime");
        Intrinsics.checkNotNullParameter(startBalance, "startBalance");
        Intrinsics.checkNotNullParameter(startBalanceUsd, "startBalanceUsd");
        Intrinsics.checkNotNullParameter(profitFilter, "profitFilter");
        Intrinsics.checkNotNullParameter(startDealId, "startDealId");
        this.a = assetSelection;
        this.b = tradingStrategy;
        this.c = tradingAsset;
        this.d = technicalIndicator;
        this.e = startAmount;
        this.f = currency;
        this.g = playTime;
        this.h = startBalance;
        this.i = startBalanceUsd;
        this.j = z;
        this.k = profitFilter;
        this.l = d;
        this.m = z2;
        this.n = startDealId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8145zz0)) {
            return false;
        }
        C8145zz0 c8145zz0 = (C8145zz0) obj;
        return Intrinsics.a(this.a, c8145zz0.a) && Intrinsics.a(this.b, c8145zz0.b) && Intrinsics.a(this.c, c8145zz0.c) && Intrinsics.a(this.d, c8145zz0.d) && Intrinsics.a(this.e, c8145zz0.e) && Intrinsics.a(this.f, c8145zz0.f) && Intrinsics.a(this.g, c8145zz0.g) && Intrinsics.a(this.h, c8145zz0.h) && Intrinsics.a(this.i, c8145zz0.i) && this.j == c8145zz0.j && Intrinsics.a(this.k, c8145zz0.k) && Intrinsics.a(this.l, c8145zz0.l) && this.m == c8145zz0.m && Intrinsics.a(this.n, c8145zz0.n);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C2983be.a(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), this.j, 31), 31, this.k);
        Double d = this.l;
        return this.n.hashCode() + C2983be.a((iB + (d == null ? 0 : d.hashCode())) * 31, this.m, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorsTradingProperty(assetSelection=");
        sb.append(this.a);
        sb.append(", tradingStrategy=");
        sb.append(this.b);
        sb.append(", tradingAsset=");
        sb.append(this.c);
        sb.append(", technicalIndicator=");
        sb.append(this.d);
        sb.append(", startAmount=");
        sb.append(this.e);
        sb.append(", currency=");
        sb.append(this.f);
        sb.append(", playTime=");
        sb.append(this.g);
        sb.append(", startBalance=");
        sb.append(this.h);
        sb.append(", startBalanceUsd=");
        sb.append(this.i);
        sb.append(", lossLimit=");
        sb.append(this.j);
        sb.append(", profitFilter=");
        sb.append(this.k);
        sb.append(", profitFilterSum=");
        sb.append(this.l);
        sb.append(", oneClickDeals=");
        sb.append(this.m);
        sb.append(", startDealId=");
        return C5807oq.b(sb, this.n, ")");
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Az0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0640Az0 extends P80 {

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
    public final long e;

    @InterfaceC2691aI1("currency")
    @NotNull
    public final String f;

    @InterfaceC2691aI1("play_time")
    public final int g;

    @InterfaceC2691aI1("start_balance")
    @Nullable
    public final Double h;

    @InterfaceC2691aI1("start_balance_usd")
    @Nullable
    public final Double i;

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

    public C0640Az0(@NotNull String assetSelection, @NotNull String tradingStrategy, @NotNull String tradingAsset, @NotNull String technicalIndicator, long j, @NotNull String currency, int i, @Nullable Double d, @Nullable Double d2, boolean z, @NotNull String profitFilter, @Nullable Double d3, boolean z2, @NotNull String startDealId) {
        Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
        Intrinsics.checkNotNullParameter(tradingStrategy, "tradingStrategy");
        Intrinsics.checkNotNullParameter(tradingAsset, "tradingAsset");
        Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(profitFilter, "profitFilter");
        Intrinsics.checkNotNullParameter(startDealId, "startDealId");
        this.a = assetSelection;
        this.b = tradingStrategy;
        this.c = tradingAsset;
        this.d = technicalIndicator;
        this.e = j;
        this.f = currency;
        this.g = i;
        this.h = d;
        this.i = d2;
        this.j = z;
        this.k = profitFilter;
        this.l = d3;
        this.m = z2;
        this.n = startDealId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0640Az0)) {
            return false;
        }
        C0640Az0 c0640Az0 = (C0640Az0) obj;
        return Intrinsics.a(this.a, c0640Az0.a) && Intrinsics.a(this.b, c0640Az0.b) && Intrinsics.a(this.c, c0640Az0.c) && Intrinsics.a(this.d, c0640Az0.d) && this.e == c0640Az0.e && Intrinsics.a(this.f, c0640Az0.f) && this.g == c0640Az0.g && Intrinsics.a(this.h, c0640Az0.h) && Intrinsics.a(this.i, c0640Az0.i) && this.j == c0640Az0.j && Intrinsics.a(this.k, c0640Az0.k) && Intrinsics.a(this.l, c0640Az0.l) && this.m == c0640Az0.m && Intrinsics.a(this.n, c0640Az0.n);
    }

    public final int hashCode() {
        int iA = EF0.a(this.g, C1039Gc0.b(C5491nL.a(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
        Double d = this.h;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.i;
        int iB = C1039Gc0.b(C2983be.a((iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31, this.j, 31), 31, this.k);
        Double d3 = this.l;
        return this.n.hashCode() + C2983be.a((iB + (d3 != null ? d3.hashCode() : 0)) * 31, this.m, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorsTradingPropertyMixpanel(assetSelection=");
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

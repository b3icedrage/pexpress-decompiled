package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7786yG {

    @NotNull
    public final GP1 a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final GP1 f;

    @NotNull
    public final GP1 g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final GP1 k;

    @NotNull
    public final GP1 l;

    @NotNull
    public final GP1 m;

    @NotNull
    public final GP1 n;

    @NotNull
    public final GP1 o;

    @NotNull
    public final GP1 p;

    @NotNull
    public final GP1 q;

    public C7786yG(@NotNull GP1 currentInvestmentIsVisible, @NotNull GP1 accountSelectionIsVisible, @NotNull GP1 tradingOptionsIsVisible, @NotNull GP1 tradingAssetSelectionIsVisible, @NotNull GP1 tradingIndicatorSelectionIsVisible, @NotNull GP1 riskManagementIsVisible, @NotNull GP1 tradingStrategiesIsVisible, @NotNull GP1 startTradingBtnIsVisible, @NotNull GP1 currentInvestmentDivIsVisible, @NotNull GP1 accountSelectionDivIsVisible, @NotNull GP1 riskManagementDivIsVisible, @NotNull GP1 tradingStrategiesDivIsVisible, @NotNull GP1 dividerUnderFooterIsVisible, @NotNull GP1 footerIsVisible, @NotNull GP1 dividerUnderFooterBigIsVisible, @NotNull GP1 realAccountActivationIsVisible, @NotNull GP1 realAccountActivationDivIsVisible) {
        Intrinsics.checkNotNullParameter(currentInvestmentIsVisible, "currentInvestmentIsVisible");
        Intrinsics.checkNotNullParameter(accountSelectionIsVisible, "accountSelectionIsVisible");
        Intrinsics.checkNotNullParameter(tradingOptionsIsVisible, "tradingOptionsIsVisible");
        Intrinsics.checkNotNullParameter(tradingAssetSelectionIsVisible, "tradingAssetSelectionIsVisible");
        Intrinsics.checkNotNullParameter(tradingIndicatorSelectionIsVisible, "tradingIndicatorSelectionIsVisible");
        Intrinsics.checkNotNullParameter(riskManagementIsVisible, "riskManagementIsVisible");
        Intrinsics.checkNotNullParameter(tradingStrategiesIsVisible, "tradingStrategiesIsVisible");
        Intrinsics.checkNotNullParameter(startTradingBtnIsVisible, "startTradingBtnIsVisible");
        Intrinsics.checkNotNullParameter(currentInvestmentDivIsVisible, "currentInvestmentDivIsVisible");
        Intrinsics.checkNotNullParameter(accountSelectionDivIsVisible, "accountSelectionDivIsVisible");
        Intrinsics.checkNotNullParameter(riskManagementDivIsVisible, "riskManagementDivIsVisible");
        Intrinsics.checkNotNullParameter(tradingStrategiesDivIsVisible, "tradingStrategiesDivIsVisible");
        Intrinsics.checkNotNullParameter(dividerUnderFooterIsVisible, "dividerUnderFooterIsVisible");
        Intrinsics.checkNotNullParameter(footerIsVisible, "footerIsVisible");
        Intrinsics.checkNotNullParameter(dividerUnderFooterBigIsVisible, "dividerUnderFooterBigIsVisible");
        Intrinsics.checkNotNullParameter(realAccountActivationIsVisible, "realAccountActivationIsVisible");
        Intrinsics.checkNotNullParameter(realAccountActivationDivIsVisible, "realAccountActivationDivIsVisible");
        this.a = currentInvestmentIsVisible;
        this.b = accountSelectionIsVisible;
        this.c = tradingOptionsIsVisible;
        this.d = tradingAssetSelectionIsVisible;
        this.e = tradingIndicatorSelectionIsVisible;
        this.f = riskManagementIsVisible;
        this.g = tradingStrategiesIsVisible;
        this.h = startTradingBtnIsVisible;
        this.i = currentInvestmentDivIsVisible;
        this.j = accountSelectionDivIsVisible;
        this.k = riskManagementDivIsVisible;
        this.l = tradingStrategiesDivIsVisible;
        this.m = dividerUnderFooterIsVisible;
        this.n = footerIsVisible;
        this.o = dividerUnderFooterBigIsVisible;
        this.p = realAccountActivationIsVisible;
        this.q = realAccountActivationDivIsVisible;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7786yG)) {
            return false;
        }
        C7786yG c7786yG = (C7786yG) obj;
        return this.a.equals(c7786yG.a) && this.b.equals(c7786yG.b) && this.c.equals(c7786yG.c) && this.d.equals(c7786yG.d) && this.e.equals(c7786yG.e) && this.f.equals(c7786yG.f) && this.g.equals(c7786yG.g) && this.h.equals(c7786yG.h) && this.i.equals(c7786yG.i) && this.j.equals(c7786yG.j) && this.k.equals(c7786yG.k) && this.l.equals(c7786yG.l) && this.m.equals(c7786yG.m) && this.n.equals(c7786yG.n) && this.o.equals(c7786yG.o) && this.p.equals(c7786yG.p) && this.q.equals(c7786yG.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonViewsVisibilityData(currentInvestmentIsVisible=" + this.a + ", accountSelectionIsVisible=" + this.b + ", tradingOptionsIsVisible=" + this.c + ", tradingAssetSelectionIsVisible=" + this.d + ", tradingIndicatorSelectionIsVisible=" + this.e + ", riskManagementIsVisible=" + this.f + ", tradingStrategiesIsVisible=" + this.g + ", startTradingBtnIsVisible=" + this.h + ", currentInvestmentDivIsVisible=" + this.i + ", accountSelectionDivIsVisible=" + this.j + ", riskManagementDivIsVisible=" + this.k + ", tradingStrategiesDivIsVisible=" + this.l + ", dividerUnderFooterIsVisible=" + this.m + ", footerIsVisible=" + this.n + ", dividerUnderFooterBigIsVisible=" + this.o + ", realAccountActivationIsVisible=" + this.p + ", realAccountActivationDivIsVisible=" + this.q + ")";
    }
}

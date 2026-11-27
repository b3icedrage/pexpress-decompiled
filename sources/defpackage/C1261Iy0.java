package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Iy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1261Iy0 implements InterfaceC5331mb0<C1183Hy0> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final InterfaceC1531Mk1<ReporterApi> b;
    public final InterfaceC1531Mk1<NQ> c;
    public final InterfaceC1531Mk1<J22> d;
    public final InterfaceC1531Mk1<O3> e;
    public final InterfaceC1531Mk1<EQ> f;
    public final InterfaceC1531Mk1<MR1> g;
    public final C5470nE h;
    public final C3320dE i;
    public final C1763Pj j;
    public final InterfaceC1531Mk1<InterfaceC2152Ui1> k;
    public final InterfaceC1531Mk1<RT0> l;
    public final InterfaceC1531Mk1<AbstractC6505s91> m;
    public final InterfaceC1531Mk1<AbstractC4892kW0> n;
    public final InterfaceC1531Mk1<C4612j90> o;
    public final VM p;

    public C1261Iy0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7, C5470nE c5470nE, C3320dE c3320dE, C1763Pj c1763Pj, InterfaceC1531Mk1 interfaceC1531Mk8, InterfaceC1531Mk1 interfaceC1531Mk9, InterfaceC1531Mk1 interfaceC1531Mk10, InterfaceC1531Mk1 interfaceC1531Mk11, InterfaceC1531Mk1 interfaceC1531Mk12, VM vm) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = interfaceC1531Mk5;
        this.f = interfaceC1531Mk6;
        this.g = interfaceC1531Mk7;
        this.h = c5470nE;
        this.i = c3320dE;
        this.j = c1763Pj;
        this.k = interfaceC1531Mk8;
        this.l = interfaceC1531Mk9;
        this.m = interfaceC1531Mk10;
        this.n = interfaceC1531Mk11;
        this.o = interfaceC1531Mk12;
        this.p = vm;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C4923kf appData = this.a.get();
        ReporterApi reporter = this.b.get();
        NQ currentIndicatorProvider = this.c.get();
        J22 currentAssetProvider = this.d.get();
        O3 accountModeSelectionUseCase = this.e.get();
        EQ currencySignProvider = this.f.get();
        MR1 strategySelectionUseCase = this.g.get();
        AbstractC2327Wn1 realAmountUseCase = (AbstractC2327Wn1) this.h.get();
        AbstractC6366rX demoAmountUseCase = (AbstractC6366rX) this.i.get();
        AbstractC1787Pr betDurationUseCase = (AbstractC1787Pr) this.j.get();
        InterfaceC2152Ui1 profitLimitUseCase = this.k.get();
        RT0 lossLimitUseCase = this.l.get();
        AbstractC6505s91 oneClickDealsUseCase = this.m.get();
        AbstractC4892kW0 manualAssetSelectionEnabledUseCaseApi = this.n.get();
        C4612j90 eventsFlowsProvider = this.o.get();
        OM convertCurrencyUseCase = (OM) this.p.get();
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(currentAssetProvider, "currentAssetProvider");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        Intrinsics.checkNotNullParameter(strategySelectionUseCase, "strategySelectionUseCase");
        Intrinsics.checkNotNullParameter(realAmountUseCase, "realAmountUseCase");
        Intrinsics.checkNotNullParameter(demoAmountUseCase, "demoAmountUseCase");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        Intrinsics.checkNotNullParameter(profitLimitUseCase, "profitLimitUseCase");
        Intrinsics.checkNotNullParameter(lossLimitUseCase, "lossLimitUseCase");
        Intrinsics.checkNotNullParameter(oneClickDealsUseCase, "oneClickDealsUseCase");
        Intrinsics.checkNotNullParameter(manualAssetSelectionEnabledUseCaseApi, "manualAssetSelectionEnabledUseCaseApi");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(convertCurrencyUseCase, "convertCurrencyUseCase");
        return new C1183Hy0(appData, reporter, currentIndicatorProvider, currentAssetProvider, accountModeSelectionUseCase, currencySignProvider, strategySelectionUseCase, realAmountUseCase, demoAmountUseCase, betDurationUseCase, profitLimitUseCase, lossLimitUseCase, oneClickDealsUseCase, manualAssetSelectionEnabledUseCaseApi, eventsFlowsProvider, convertCurrencyUseCase);
    }
}

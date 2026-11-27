package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7529x22 implements InterfaceC5331mb0<C7318w22> {
    public final InterfaceC1531Mk1<AbstractC7949z22> a;
    public final InterfaceC1531Mk1<InterfaceC4118h22> b;
    public final InterfaceC1531Mk1<C4923kf> c;
    public final InterfaceC1531Mk1<ReporterApi> d;
    public final InterfaceC1531Mk1<NQ> e;
    public final InterfaceC1531Mk1<AbstractC2199Uy0> f;
    public final InterfaceC1531Mk1<AbstractC4892kW0> g;
    public final InterfaceC1531Mk1<InterfaceC3706f42> h;

    public C7529x22(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7, InterfaceC1531Mk1 interfaceC1531Mk8) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = interfaceC1531Mk5;
        this.f = interfaceC1531Mk6;
        this.g = interfaceC1531Mk7;
        this.h = interfaceC1531Mk8;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        AbstractC7949z22 assetsProviderImpl = this.a.get();
        InterfaceC4118h22 tradingAssetCallback = this.b.get();
        C4923kf appDataRepository = this.c.get();
        ReporterApi reporter = this.d.get();
        C3069c22 tradingAmplitudeEventsLocalExperiment = new C3069c22();
        NQ currentIndicatorProvider = this.e.get();
        AbstractC2199Uy0 indicatorUseCase = this.f.get();
        AbstractC4892kW0 manualAssetSelectionEnabledUseCase = this.g.get();
        InterfaceC3706f42 telemetryReporter = this.h.get();
        Intrinsics.checkNotNullParameter(assetsProviderImpl, "assetsProviderImpl");
        Intrinsics.checkNotNullParameter(tradingAssetCallback, "tradingAssetCallback");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(tradingAmplitudeEventsLocalExperiment, "tradingAmplitudeEventsLocalExperiment");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        Intrinsics.checkNotNullParameter(manualAssetSelectionEnabledUseCase, "manualAssetSelectionEnabledUseCase");
        Intrinsics.checkNotNullParameter(telemetryReporter, "telemetryReporter");
        return new C7318w22(assetsProviderImpl, tradingAssetCallback, appDataRepository, reporter, tradingAmplitudeEventsLocalExperiment, currentIndicatorProvider, indicatorUseCase, manualAssetSelectionEnabledUseCase, telemetryReporter);
    }
}

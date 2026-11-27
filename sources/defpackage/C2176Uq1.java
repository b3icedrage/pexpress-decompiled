package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2176Uq1 implements InterfaceC5331mb0<InterfaceC0720Ca> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final InterfaceC1531Mk1<ReporterApi> b;
    public final InterfaceC1531Mk1<ZT1> c;
    public final InterfaceC1531Mk1<C5176lq1> d;
    public final M3 e;
    public final InterfaceC1531Mk1<InterfaceC5862p6> f;

    public C2176Uq1(C0957Fb c0957Fb, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, M3 m3, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = m3;
        this.f = interfaceC1531Mk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C4923kf appData = this.a.get();
        ReporterApi reporter = this.b.get();
        ZT1 subIdProvider = this.c.get();
        C5176lq1 params = this.d.get();
        C3378dX0 marketingEventsManager = (C3378dX0) this.e.get();
        InterfaceC5862p6 activationStateProviderApi = this.f.get();
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(marketingEventsManager, "marketingEventsManager");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        L80 l80 = L80.MAX_PROFIT;
        return new C1577Na(appData, reporter, subIdProvider, "Registration", params, marketingEventsManager, activationStateProviderApi);
    }
}

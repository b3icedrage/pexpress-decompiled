package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4199hR0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC5331mb0 f;
    public final InterfaceC1531Mk1 g;

    public C4199hR0(InterfaceC1531Mk1 interfaceC1531Mk1, C3557eN0 c3557eN0, C1763Pj c1763Pj, C3523eC c3523eC, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.b = interfaceC1531Mk1;
        this.d = c3557eN0;
        this.e = c1763Pj;
        this.f = c3523eC;
        this.c = interfaceC1531Mk2;
        this.g = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        InterfaceC1531Mk1 interfaceC1531Mk1 = this.g;
        InterfaceC5331mb0 interfaceC5331mb0 = this.f;
        InterfaceC1531Mk1 interfaceC1531Mk2 = this.e;
        InterfaceC1531Mk1 interfaceC1531Mk3 = this.d;
        InterfaceC1531Mk1 interfaceC1531Mk4 = this.c;
        InterfaceC1531Mk1 interfaceC1531Mk5 = this.b;
        switch (this.a) {
            case 0:
                return new C3989gR0((C4923kf) interfaceC1531Mk5.get(), (InterfaceC4209hU1) ((C3557eN0) interfaceC1531Mk3).get(), (A92) ((C1763Pj) interfaceC1531Mk2).get(), (InterfaceC6444rs1) ((C3523eC) interfaceC5331mb0).get(), (C6038px) interfaceC1531Mk4.get(), (InterfaceC4862kM0) ((InterfaceC1454Lk1) interfaceC1531Mk1).get());
            default:
                C4923kf appData = (C4923kf) interfaceC1531Mk5.get();
                ReporterApi reporter = (ReporterApi) interfaceC1531Mk4.get();
                ZT1 subIdProvider = (ZT1) interfaceC1531Mk3.get();
                C5176lq1 params = (C5176lq1) interfaceC1531Mk2.get();
                C3378dX0 marketingEventsManager = (C3378dX0) ((M3) interfaceC5331mb0).get();
                InterfaceC5862p6 activationStateProviderApi = (InterfaceC5862p6) interfaceC1531Mk1.get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(reporter, "reporter");
                Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(marketingEventsManager, "marketingEventsManager");
                Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
                L80 l80 = L80.MAX_PROFIT;
                return new C1577Na(appData, reporter, subIdProvider, "Account activation", params, marketingEventsManager, activationStateProviderApi);
        }
    }

    public C4199hR0(C0957Fb c0957Fb, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, M3 m3, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = m3;
        this.g = interfaceC1531Mk5;
    }
}

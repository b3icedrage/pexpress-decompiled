package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: of1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5768of1 implements InterfaceC5331mb0<C5558nf1> {
    public final InterfaceC1531Mk1<YX> a;
    public final InterfaceC1531Mk1<C4923kf> b;
    public final InterfaceC1531Mk1<C4612j90> c;
    public final InterfaceC1531Mk1<ReporterApi> d;
    public final InterfaceC1531Mk1<LU> e;
    public final InterfaceC1531Mk1<C3051bx1> f;
    public final XK1 g;
    public final InterfaceC1531Mk1<AbstractC5045lD0> h;
    public final InterfaceC1531Mk1<I50> i;
    public final InterfaceC1531Mk1<O3> j;

    public C5768of1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, XK1 xk1, InterfaceC1531Mk1 interfaceC1531Mk7, InterfaceC1531Mk1 interfaceC1531Mk8, InterfaceC1531Mk1 interfaceC1531Mk9) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = interfaceC1531Mk5;
        this.f = interfaceC1531Mk6;
        this.g = xk1;
        this.h = interfaceC1531Mk7;
        this.i = interfaceC1531Mk8;
        this.j = interfaceC1531Mk9;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        YX depositScreenStarter = this.a.get();
        C4923kf appDataRepository = this.b.get();
        C4612j90 eventsFlowsProvider = this.c.get();
        ReporterApi reporter = this.d.get();
        LU deeplinkManager = this.e.get();
        C3051bx1 robotIndicatorProvider = this.f.get();
        VK1 showAlertDialogUseCase = (VK1) this.g.get();
        AbstractC5045lD0 isShowUseCaseApi = this.h.get();
        I50 emailUseCase = this.i.get();
        O3 selectedAccountModeSelectionUseCase = this.j.get();
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(deeplinkManager, "deeplinkManager");
        Intrinsics.checkNotNullParameter(robotIndicatorProvider, "robotIndicatorProvider");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(isShowUseCaseApi, "isShowUseCaseApi");
        Intrinsics.checkNotNullParameter(emailUseCase, "emailUseCase");
        Intrinsics.checkNotNullParameter(selectedAccountModeSelectionUseCase, "selectedAccountModeSelectionUseCase");
        return new C5558nf1(depositScreenStarter, appDataRepository, eventsFlowsProvider, reporter, deeplinkManager, robotIndicatorProvider, showAlertDialogUseCase, isShowUseCaseApi, emailUseCase, selectedAccountModeSelectionUseCase);
    }
}

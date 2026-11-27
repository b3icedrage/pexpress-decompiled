package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class NE1 implements LE1 {

    @NotNull
    public final ReporterApi a;

    @NotNull
    public final C5253mB1 b;

    @NotNull
    public final InterfaceC3951gE1 c;

    @NotNull
    public final InterfaceC4374iF1 d;

    public NE1(@NotNull ReporterApi reporter, @NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull InterfaceC4374iF1 selectedAccountProvider) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(selectedAccountProvider, "selectedAccountProvider");
        this.a = reporter;
        this.b = router;
        this.c = screensProvider;
        this.d = selectedAccountProvider;
    }

    @Override // defpackage.LE1
    public final void a() {
        L80 l80 = L80.MAX_PROFIT;
        EnumC5028l80 enumC5028l80 = EnumC5028l80.w0;
        C1510Md1 c1510Md1 = new C1510Md1("Registration");
        ReporterApi reporterApi = this.a;
        ReporterApi.a.b(reporterApi, enumC5028l80, c1510Md1, null, 12);
        ReporterApi.a.b(reporterApi, EnumC5028l80.o, new C1510Md1("NotOurAccount"), null, 12);
        this.d.b();
        C5189lv.k(C3286d41.a, null, new ME1(this, null), 3);
    }

    @Override // defpackage.LE1
    public final void b() {
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.a, EnumC5028l80.w0, new C1510Md1("Login"), null, 12);
        this.d.c();
        C5189lv.k(C3286d41.a, null, new ME1(this, null), 3);
    }
}

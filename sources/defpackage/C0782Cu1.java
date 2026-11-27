package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0782Cu1 implements InterfaceC0704Bu1 {

    @NotNull
    public final AbstractC5463nB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final InterfaceC5213m10 c;

    @NotNull
    public final YX d;

    @NotNull
    public final ReporterApi e;

    public C0782Cu1(@NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull InterfaceC5213m10 dialogScreensProvider, @NotNull YX depositScreenStarter, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(dialogScreensProvider, "dialogScreensProvider");
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = router;
        this.b = screensProvider;
        this.c = dialogScreensProvider;
        this.d = depositScreenStarter;
        this.e = reporter;
    }

    @Override // defpackage.InterfaceC0704Bu1
    public final void a() {
        this.a.c(this.b.E(), false);
    }

    @Override // defpackage.InterfaceC0704Bu1
    public final void b() {
        this.a.c(this.c.k(), false);
    }

    @Override // defpackage.InterfaceC0704Bu1
    public final void c() {
        this.a.f();
    }

    @Override // defpackage.InterfaceC0704Bu1
    @Nullable
    public final Object d(@NotNull C1720Ou1 c1720Ou1) {
        EnumC5028l80 enumC5028l80 = EnumC5028l80.i0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.e, enumC5028l80, new C1510Md1("Robot"), null, 12);
        Object objE = this.d.e(c1720Ou1);
        return objE == MN.d ? objE : Unit.a;
    }
}

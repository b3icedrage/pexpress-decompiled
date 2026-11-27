package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7349wA1 implements InterfaceC7139vA1 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final InterfaceC5213m10 c;

    @NotNull
    public final ReporterApi d;

    @NotNull
    public final YX e;

    public C7349wA1(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull InterfaceC5213m10 dialogScreensProvider, @NotNull ReporterApi reporter, @NotNull YX depositScreenStarter) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(dialogScreensProvider, "dialogScreensProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        this.a = router;
        this.b = screensProvider;
        this.c = dialogScreensProvider;
        this.d = reporter;
        this.e = depositScreenStarter;
    }

    @Override // defpackage.InterfaceC7139vA1
    public final void a() {
        this.a.c(this.b.E(), false);
    }

    @Override // defpackage.InterfaceC7139vA1
    @Nullable
    public final Object b(@NotNull C2545Yz1 c2545Yz1) {
        EnumC5028l80 enumC5028l80 = EnumC5028l80.i0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.d, enumC5028l80, new C1510Md1("Insufficient Funds"), null, 12);
        Object objE = this.e.e(c2545Yz1);
        return objE == MN.d ? objE : Unit.a;
    }

    @Override // defpackage.InterfaceC7139vA1
    public final void c() {
        this.a.c(this.b.k(), false);
    }

    @Override // defpackage.InterfaceC7139vA1
    public final void d() {
        this.a.c(this.c.m(), false);
    }
}

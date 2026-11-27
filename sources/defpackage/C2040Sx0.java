package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Sx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2040Sx0 implements InterfaceC1962Rx0 {

    @NotNull
    public final AbstractC5463nB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final InterfaceC5213m10 c;

    public C2040Sx0(@NotNull InterfaceC5213m10 dialogScreensProvider, @NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(dialogScreensProvider, "dialogScreensProvider");
        this.a = router;
        this.b = screensProvider;
        this.c = dialogScreensProvider;
    }

    @Override // defpackage.InterfaceC2630a10
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.InterfaceC1962Rx0
    public final void e() {
        this.a.c(this.c.l(), false);
    }

    @Override // defpackage.InterfaceC1962Rx0
    public final void g() {
        this.a.c(this.b.E(), false);
    }

    @Override // defpackage.InterfaceC1962Rx0
    public final void h() {
        this.a.c(this.c.d(), false);
    }

    @Override // defpackage.InterfaceC1962Rx0
    public final void j() {
        this.a.c(this.c.b(), false);
    }

    @Override // defpackage.InterfaceC2630a10
    public final void onDismiss() {
        this.a.g();
    }
}

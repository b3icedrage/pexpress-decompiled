package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Vx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2275Vx1 implements InterfaceC2197Ux1 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final InterfaceC5213m10 c;

    public C2275Vx1(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull InterfaceC5213m10 dialogScreensProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(dialogScreensProvider, "dialogScreensProvider");
        this.a = router;
        this.b = screensProvider;
        this.c = dialogScreensProvider;
    }

    @Override // defpackage.InterfaceC2197Ux1
    public final void a() {
        this.a.c(this.b.E(), false);
    }

    @Override // defpackage.InterfaceC2197Ux1
    public final void b() {
        this.a.c(this.c.c(), false);
    }

    @Override // defpackage.InterfaceC2197Ux1
    public final void c() {
        this.a.c(this.c.f(), false);
    }

    @Override // defpackage.InterfaceC2197Ux1
    public final void d() {
        this.a.c(this.c.j(), false);
    }
}

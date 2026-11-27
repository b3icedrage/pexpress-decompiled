package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5100lV1 implements InterfaceC4890kV1 {

    @NotNull
    public final AbstractC5463nB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final InterfaceC5213m10 c;

    public C5100lV1(@NotNull InterfaceC5213m10 dialogsScreensProviderApi, @NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(dialogsScreensProviderApi, "dialogsScreensProviderApi");
        this.a = router;
        this.b = screensProvider;
        this.c = dialogsScreensProviderApi;
    }

    @Override // defpackage.InterfaceC4890kV1
    public final void a() {
        this.a.c(this.b.E(), false);
    }

    @Override // defpackage.InterfaceC4890kV1
    public final void b() {
        this.a.c(this.b.l(), false);
    }

    @Override // defpackage.InterfaceC4890kV1
    public final void c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // defpackage.InterfaceC4890kV1
    public final void d() {
        this.a.c(this.c.n(), false);
    }
}

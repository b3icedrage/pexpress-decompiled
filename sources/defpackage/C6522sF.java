package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6522sF implements InterfaceC6312rF {

    @NotNull
    public final InterfaceC5213m10 a;

    @NotNull
    public final AbstractC5463nB1 b;

    @NotNull
    public final InterfaceC3951gE1 c;

    @NotNull
    public final AbstractC2903bE1 d;

    public C6522sF(@NotNull InterfaceC5213m10 dialogScreens, @NotNull AbstractC5463nB1 routerApi, @NotNull InterfaceC3951gE1 screensProvider, @NotNull AbstractC2903bE1 screenToChatTransitionProvider) {
        Intrinsics.checkNotNullParameter(dialogScreens, "dialogScreens");
        Intrinsics.checkNotNullParameter(routerApi, "routerApi");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(screenToChatTransitionProvider, "screenToChatTransitionProvider");
        this.a = dialogScreens;
        this.b = routerApi;
        this.c = screensProvider;
        this.d = screenToChatTransitionProvider;
    }

    @Override // defpackage.InterfaceC6312rF
    public final void a(@NotNull String screen) {
        Intrinsics.checkNotNullParameter(screen, "screenName");
        AbstractC2903bE1 abstractC2903bE1 = this.d;
        abstractC2903bE1.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        GP1 gp1 = abstractC2903bE1.a;
        gp1.getClass();
        gp1.m(null, screen);
        this.b.c(this.c.l(), false);
    }

    @Override // defpackage.InterfaceC6312rF
    public final void b() {
        this.b.c(this.a.e(), false);
    }
}

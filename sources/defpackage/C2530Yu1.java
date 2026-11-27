package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Yu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2530Yu1 implements InterfaceC2452Xu1 {

    @NotNull
    public final ReporterApi a;

    @NotNull
    public final C5253mB1 b;

    @NotNull
    public final InterfaceC3951gE1 c;

    @NotNull
    public final InterfaceC5213m10 d;

    public C2530Yu1(@NotNull ReporterApi reporter, @NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull InterfaceC5213m10 dialogScreens) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(dialogScreens, "dialogScreens");
        this.a = reporter;
        this.b = router;
        this.c = screensProvider;
        this.d = dialogScreens;
    }

    @Override // defpackage.InterfaceC2452Xu1
    public final void a() {
        this.b.c(this.d.o(), false);
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class WS1 implements VS1 {

    @NotNull
    public final InterfaceC3951gE1 a;

    @NotNull
    public final C5253mB1 b;

    public WS1(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(router, "router");
        this.a = screensProvider;
        this.b = router;
    }

    @Override // defpackage.VS1
    public final void a() {
        this.b.e(this.a.e());
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7166vJ1 implements InterfaceC6956uJ1 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    public C7166vJ1(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        this.a = router;
        this.b = screensProvider;
    }

    @Override // defpackage.InterfaceC6956uJ1
    public final void a() {
        this.a.c(this.b.x(), false);
    }
}

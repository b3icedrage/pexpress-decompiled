package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class R21 implements Q21 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    public R21(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        this.a = router;
        this.b = screensProvider;
    }

    @Override // defpackage.Q21
    public final void a() {
        C5253mB1 c5253mB1 = this.a;
        c5253mB1.b();
        c5253mB1.c(this.b.C(), false);
    }
}

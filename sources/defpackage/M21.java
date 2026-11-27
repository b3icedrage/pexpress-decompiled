package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class M21 implements L21 {

    @NotNull
    public final AbstractC5463nB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    public M21(@NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        this.a = router;
        this.b = screensProvider;
    }

    @Override // defpackage.L21
    public final void a() {
        AbstractC5463nB1 abstractC5463nB1 = this.a;
        abstractC5463nB1.f();
        abstractC5463nB1.d(new AbstractC2307Wh[]{this.b.k()});
    }
}

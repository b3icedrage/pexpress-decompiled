package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: i22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4328i22 extends AbstractC4766ju implements InterfaceC4118h22 {

    @NotNull
    public final AbstractC5463nB1 b;

    @NotNull
    public final InterfaceC3951gE1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4328i22(@NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        super(router);
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        this.b = router;
        this.c = screensProvider;
    }

    @Override // defpackage.InterfaceC4118h22
    public final void i(@NotNull C3279d22 tradingAsset) {
        Intrinsics.checkNotNullParameter(tradingAsset, "tradingAsset");
        C0667Bi0 c0667Bi0A = this.c.a();
        AbstractC5463nB1 abstractC5463nB1 = this.b;
        abstractC5463nB1.getClass();
        abstractC5463nB1.a(new C5171lp(c0667Bi0A));
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class KR1 extends AbstractC4766ju implements JR1 {

    @NotNull
    public final InterfaceC5213m10 b;

    @NotNull
    public final InterfaceC3951gE1 c;

    @NotNull
    public final AbstractC5463nB1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KR1(@NotNull InterfaceC5213m10 dialogScreensProvider, @NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        super(router);
        Intrinsics.checkNotNullParameter(dialogScreensProvider, "dialogScreensProvider");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(router, "router");
        this.b = dialogScreensProvider;
        this.c = screensProvider;
        this.d = router;
    }

    @Override // defpackage.JR1
    public final void d() {
        this.d.c(this.b.g(), false);
    }

    @Override // defpackage.JR1
    public final void k() {
        C0667Bi0 c0667Bi0A = this.c.a();
        AbstractC5463nB1 abstractC5463nB1 = this.d;
        abstractC5463nB1.getClass();
        abstractC5463nB1.a(new C5171lp(c0667Bi0A));
    }
}

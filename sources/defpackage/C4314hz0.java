package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4314hz0 extends AbstractC4766ju implements InterfaceC4104gz0 {

    @NotNull
    public final AbstractC5463nB1 b;

    @NotNull
    public final InterfaceC3951gE1 c;

    @NotNull
    public final InterfaceC5213m10 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4314hz0(@NotNull InterfaceC5213m10 dialogScreensProvider, @NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        super(router);
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(dialogScreensProvider, "dialogScreensProvider");
        this.b = router;
        this.c = screensProvider;
        this.d = dialogScreensProvider;
    }

    @Override // defpackage.InterfaceC4104gz0
    public final void a() {
        InterfaceC3951gE1 interfaceC3951gE1 = this.c;
        C0667Bi0 c0667Bi0A = interfaceC3951gE1.a();
        AbstractC5463nB1 abstractC5463nB1 = this.b;
        abstractC5463nB1.getClass();
        abstractC5463nB1.a(new C5171lp(c0667Bi0A));
        abstractC5463nB1.c(interfaceC3951gE1.E(), false);
    }
}

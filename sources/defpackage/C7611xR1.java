package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7611xR1 extends AbstractC4766ju implements InterfaceC7401wR1 {

    @NotNull
    public final AbstractC5463nB1 b;

    @NotNull
    public final InterfaceC3951gE1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7611xR1(@NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        super(router);
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        this.b = router;
        this.c = screensProvider;
    }

    @Override // defpackage.InterfaceC7401wR1
    public final void a() {
        f();
        this.b.c(this.c.E(), false);
    }

    @Override // defpackage.InterfaceC7401wR1
    public final void f() {
        C0667Bi0 c0667Bi0A = this.c.a();
        AbstractC5463nB1 abstractC5463nB1 = this.b;
        abstractC5463nB1.getClass();
        abstractC5463nB1.a(new C5171lp(c0667Bi0A));
    }
}

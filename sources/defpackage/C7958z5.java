package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7958z5 implements InterfaceC7748y5 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    public C7958z5(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        this.a = router;
        this.b = screensProvider;
    }

    @Override // defpackage.InterfaceC7748y5
    public final void a() {
        this.a.c(this.b.j(), false);
    }
}

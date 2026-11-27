package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Vw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2272Vw1 implements InterfaceC2194Uw1 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC5213m10 b;

    public C2272Vw1(@NotNull C5253mB1 router, @NotNull InterfaceC5213m10 dialogScreensProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(dialogScreensProvider, "dialogScreensProvider");
        this.a = router;
        this.b = dialogScreensProvider;
    }

    @Override // defpackage.InterfaceC2194Uw1
    public final void a() {
        this.a.c(this.b.a(), false);
    }
}

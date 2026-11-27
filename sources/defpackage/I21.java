package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class I21 implements H21 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    public I21(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProviderApi) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProviderApi, "screensProviderApi");
        this.a = router;
        this.b = screensProviderApi;
    }

    @Override // defpackage.H21
    public final void a() {
        C5253mB1 c5253mB1 = this.a;
        c5253mB1.b();
        c5253mB1.c(this.b.v(), false);
    }
}

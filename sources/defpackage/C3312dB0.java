package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3312dB0 implements InterfaceC2630a10 {

    @NotNull
    public final AbstractC5463nB1 a;

    public C3312dB0(@NotNull AbstractC5463nB1 router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.a = router;
    }

    @Override // defpackage.InterfaceC2630a10
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.InterfaceC2630a10
    public final void onDismiss() {
        this.a.g();
    }
}

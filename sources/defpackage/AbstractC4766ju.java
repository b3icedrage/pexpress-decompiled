package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4766ju implements InterfaceC2630a10 {

    @NotNull
    public final AbstractC5463nB1 a;

    public AbstractC4766ju(@NotNull AbstractC5463nB1 router) {
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

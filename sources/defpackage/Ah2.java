package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Ah2 implements InterfaceC8087zh2 {

    @NotNull
    public final C5253mB1 a;

    public Ah2(@NotNull C5253mB1 router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.a = router;
    }

    @Override // defpackage.InterfaceC8087zh2
    public final void a() {
        this.a.b();
    }
}

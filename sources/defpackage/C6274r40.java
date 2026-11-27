package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: r40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6274r40 implements InterfaceC6065q40 {

    @NotNull
    public final C5253mB1 a;

    public C6274r40(@NotNull C5253mB1 router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.a = router;
    }

    @Override // defpackage.InterfaceC6065q40
    public final void a() {
        this.a.b();
    }
}

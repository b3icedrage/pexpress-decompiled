package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5523nV1 implements InterfaceC5313mV1 {

    @NotNull
    public final InterfaceC7007ua1 a;

    public C5523nV1(@NotNull InterfaceC7007ua1 ourSideHttpService) {
        Intrinsics.checkNotNullParameter(ourSideHttpService, "ourSideHttpService");
        this.a = ourSideHttpService;
    }

    @Override // defpackage.InterfaceC5313mV1
    @Nullable
    public final Object a(@NotNull String str, @NotNull C2733aW1 c2733aW1) {
        return this.a.f(str, c2733aW1);
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Xt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2449Xt1 extends C20<Long> {
    public final C2695aK.b e;

    public C2449Xt1(@NotNull C2695aK.b stateManager) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        this.e = stateManager;
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void a(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        throw throwable;
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void d(Object obj) {
        ((Number) obj).longValue();
        this.e.f(AbstractC2882b80.b.a);
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void onComplete() {
    }
}

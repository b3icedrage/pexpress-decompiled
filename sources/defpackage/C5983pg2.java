package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5983pg2 extends C20<Pf2.a> {
    public final C2695aK.b e;

    public C5983pg2(@NotNull C2695aK.b stateManager) {
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
        Pf2.a webSocketEvent = (Pf2.a) obj;
        Intrinsics.checkNotNullParameter(webSocketEvent, "webSocketEvent");
        this.e.f(new AbstractC2882b80.d.a(webSocketEvent));
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void onComplete() {
        this.e.f(AbstractC2882b80.d.b.a);
    }
}

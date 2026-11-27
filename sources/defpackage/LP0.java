package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LP0 extends C20<InterfaceC7394wP0.a> {
    public final AtomicInteger e;
    public final C2695aK.b g;

    public LP0(@NotNull C2695aK.b stateManager) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        this.g = stateManager;
        this.e = new AtomicInteger();
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void a(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        throw throwable;
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void d(Object obj) {
        InterfaceC7394wP0.a lifecycleState = (InterfaceC7394wP0.a) obj;
        Intrinsics.checkNotNullParameter(lifecycleState, "lifecycleState");
        AtomicInteger atomicInteger = this.e;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
        this.g.f(new AbstractC2882b80.a.C0249a(lifecycleState));
    }

    @Override // defpackage.C20
    public final void e() {
        this.d.get().s(1L);
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void onComplete() {
        this.g.f(AbstractC2882b80.a.b.a);
    }
}

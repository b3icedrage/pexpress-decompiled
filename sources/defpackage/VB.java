package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class VB extends ZF0 {

    @NotNull
    public final C6251qy<?> i;

    public VB(@NotNull C6251qy<?> c6251qy) {
        this.i = c6251qy;
    }

    @Override // defpackage.InterfaceC2672aC0
    public final void a(@Nullable Throwable th) {
        C3956gG0 c3956gG0L = l();
        C6251qy<?> c6251qy = this.i;
        Throwable thP = c6251qy.p(c3956gG0L);
        if (c6251qy.w()) {
            JM<?> jm = c6251qy.h;
            Intrinsics.c(jm, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            C5004l20 c5004l20 = (C5004l20) jm;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5004l20.l;
                Object obj = atomicReferenceFieldUpdater.get(c5004l20);
                GW1 gw1 = UE.d;
                if (Intrinsics.a(obj, gw1)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c5004l20, gw1, thP)) {
                        if (atomicReferenceFieldUpdater.get(c5004l20) != gw1) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c5004l20, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c5004l20) == obj);
                }
            }
        }
        c6251qy.l(thP);
        if (c6251qy.w()) {
            return;
        }
        c6251qy.n();
    }
}

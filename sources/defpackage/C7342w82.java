package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: w82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7342w82 extends DN {

    @NotNull
    public static final C7342w82 g = new C7342w82();

    @Override // defpackage.DN
    public final void c1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Pl2 pl2 = (Pl2) coroutineContext.p(Pl2.g);
        if (pl2 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        pl2.e = true;
    }

    @Override // defpackage.DN
    @NotNull
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}

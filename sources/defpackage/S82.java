package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class S82 extends DN {

    @NotNull
    public static final S82 g = new S82();

    @Override // defpackage.DN
    public final void c1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        RV rv = RV.h;
        rv.g.g(runnable, BX1.h, false);
    }

    @Override // defpackage.DN
    public final void j1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        RV rv = RV.h;
        rv.g.g(runnable, BX1.h, true);
    }
}

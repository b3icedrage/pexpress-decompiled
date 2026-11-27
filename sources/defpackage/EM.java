package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EM implements KN {

    @NotNull
    public final CoroutineContext d;

    public EM(@NotNull CoroutineContext coroutineContext) {
        this.d = coroutineContext;
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.d;
    }

    @NotNull
    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.d + ')';
    }
}

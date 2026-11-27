package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NG implements JM<Object> {

    @NotNull
    public static final NG d = new NG();

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @NotNull
    public final String toString() {
        return "This continuation is already complete";
    }
}

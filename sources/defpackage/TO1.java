package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TO1<T> implements JM<T>, NN {

    @NotNull
    public final JM<T> d;

    @NotNull
    public final CoroutineContext e;

    /* JADX WARN: Multi-variable type inference failed */
    public TO1(@NotNull JM<? super T> jm, @NotNull CoroutineContext coroutineContext) {
        this.d = jm;
        this.e = coroutineContext;
    }

    @Override // defpackage.NN
    @Nullable
    public final NN getCallerFrame() {
        JM<T> jm = this.d;
        if (jm instanceof NN) {
            return (NN) jm;
        }
        return null;
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        this.d.resumeWith(obj);
    }
}

package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ND1<T> extends AbstractC2625a0<T> implements NN {

    @NotNull
    public final JM<T> h;

    public ND1(@NotNull JM jm, @NotNull CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.h = jm;
    }

    @Override // defpackage.C3956gG0
    public final boolean a0() {
        return true;
    }

    @Override // defpackage.NN
    @Nullable
    public final NN getCallerFrame() {
        JM<T> jm = this.h;
        if (jm instanceof NN) {
            return (NN) jm;
        }
        return null;
    }

    @Override // defpackage.C3956gG0
    public void x(@Nullable Object obj) {
        UE.s(C5885pC0.b(this.h), RG.a(obj));
    }

    @Override // defpackage.C3956gG0
    public void y(@Nullable Object obj) {
        this.h.resumeWith(RG.a(obj));
    }
}

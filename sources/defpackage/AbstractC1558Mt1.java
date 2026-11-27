package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1558Mt1 extends AbstractC7487wq {
    public AbstractC1558Mt1(@Nullable JM<Object> jm) {
        super(jm);
        if (jm != null && jm.getContext() != e.d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        return e.d;
    }
}

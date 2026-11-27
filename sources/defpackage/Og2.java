package defpackage;

import com.api.core.backend.domain.models.abstractModels.WebSocketResponseAbstract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase", f = "WebSocketRequestExecutorBase.kt", l = {456}, m = "singleSubscribe")
public final class Og2<T extends WebSocketResponseAbstract> extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ Fg2<Object> e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Og2(Fg2 fg2, LM lm) {
        super(lm);
        this.e = fg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.B(null, null, null, null, null, this);
    }
}

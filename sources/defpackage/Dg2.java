package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase", f = "WebSocketRequestExecutorBase.kt", l = {315, 328}, m = "closeConnection")
public final class Dg2 extends LM {
    public Fg2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Fg2<Object> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dg2(Fg2 fg2, LM lm) {
        super(lm);
        this.g = fg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase", f = "WebSocketRequestExecutorBase.kt", l = {247}, m = "provideWebSocketUrl$suspendImpl")
public final class Jg2<W> extends LM {
    public Fg2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Fg2<W> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jg2(Fg2 fg2, LM lm) {
        super(lm);
        this.g = fg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return Fg2.s(this.g, this);
    }
}

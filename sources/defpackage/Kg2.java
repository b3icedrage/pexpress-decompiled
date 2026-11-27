package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase", f = "WebSocketRequestExecutorBase.kt", l = {254}, m = "resolveConnectableUrl")
public final class Kg2 extends LM {
    public Fg2 d;
    public P60 e;
    public C2590Zo1 g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Fg2<Object> j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kg2(Fg2 fg2, LM lm) {
        super(lm);
        this.j = fg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        int i = Fg2.w;
        return this.j.w(false, this);
    }
}

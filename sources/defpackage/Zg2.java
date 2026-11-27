package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.WebSocketRequestExecutorImpl", f = "WebSocketRequestExecutorImpl.kt", l = {165}, m = "provideWebSocketUrl$suspendImpl")
public final class Zg2 extends LM {
    public Vg2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Vg2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zg2(Vg2 vg2, LM lm) {
        super(lm);
        this.g = vg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return Vg2.H(this.g, this);
    }
}

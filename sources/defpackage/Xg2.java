package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.WebSocketRequestExecutorImpl", f = "WebSocketRequestExecutorImpl.kt", l = {190}, m = "connect$suspendImpl")
public final class Xg2 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ Vg2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xg2(Vg2 vg2, LM lm) {
        super(lm);
        this.e = vg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return Vg2.E(this.e, this);
    }
}

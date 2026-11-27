package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase", f = "WebSocketRequestExecutorBase.kt", l = {291}, m = "updateData")
public final class Ug2 extends LM {
    public Fg2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Vg2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ug2(Vg2 vg2, LM lm) {
        super(lm);
        this.g = vg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return Fg2.c(this.g, this);
    }
}

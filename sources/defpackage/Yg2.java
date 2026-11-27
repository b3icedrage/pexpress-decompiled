package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.WebSocketRequestExecutorImpl", f = "WebSocketRequestExecutorImpl.kt", l = {197, 202, 204, 204, 205, 219, 220}, m = "onOpen$suspendImpl")
public final class Yg2 extends LM {
    public Vg2 d;
    public String e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Vg2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yg2(Vg2 vg2, LM lm) {
        super(lm);
        this.i = vg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return Vg2.G(this.i, this);
    }
}

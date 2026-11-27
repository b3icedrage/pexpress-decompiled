package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ah2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.WebSocketRequestExecutorImpl", f = "WebSocketRequestExecutorImpl.kt", l = {366, 176, 177}, m = "reconnect$suspendImpl")
public final class C2774ah2 extends LM {
    public Object d;
    public Function1 e;
    public InterfaceC4117h21 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Vg2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2774ah2(Vg2 vg2, LM lm) {
        super(lm);
        this.i = vg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return Vg2.I(this.i, null, this);
    }
}

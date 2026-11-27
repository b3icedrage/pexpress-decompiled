package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.WsSessionRevokeKt", f = "WsSessionRevoke.kt", l = {39}, m = "revokeDeadSession")
public final class Fl2 extends LM {
    public /* synthetic */ Object d;
    public int e;

    public Fl2() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return C6561sS.l(null, null, false, this);
    }
}

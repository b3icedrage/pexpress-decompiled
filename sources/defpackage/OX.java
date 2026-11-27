package defpackage;

import com.impl.core.backend.DepositMadeWorker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.DepositMadeWorker", f = "DepositMadeWorker.kt", l = {57, 58, 59}, m = "updateBalances")
public final class OX extends LM {
    public DepositMadeWorker d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ DepositMadeWorker h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OX(DepositMadeWorker depositMadeWorker, LM lm) {
        super(lm);
        this.h = depositMadeWorker;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return DepositMadeWorker.b(this.h, this);
    }
}

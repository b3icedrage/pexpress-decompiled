package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase", f = "UserRepositoryBase.kt", l = {88}, m = "userActivation$suspendImpl")
public final class Fb2 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ Ib2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fb2(Ib2 ib2, LM lm) {
        super(lm);
        this.e = ib2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return Ib2.F(this.e, null, this);
    }
}

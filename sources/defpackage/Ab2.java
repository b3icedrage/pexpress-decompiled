package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase", f = "UserRepositoryBase.kt", l = {51}, m = "getUserData$suspendImpl")
public final class Ab2 extends LM {
    public Ib2 d;
    public C7698xq0 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ Ib2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ab2(Ib2 ib2, LM lm) {
        super(lm);
        this.h = ib2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return Ib2.D(this.h, null, this);
    }
}

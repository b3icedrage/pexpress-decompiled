package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.repositories.UserRepositoryImpl", f = "UserRepositoryImpl.kt", l = {89}, m = "subscribeForBalancesChanges")
public final class Nb2 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ Kb2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nb2(Kb2 kb2, LM lm) {
        super(lm);
        this.e = kb2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.q(this);
    }
}

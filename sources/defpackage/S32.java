package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.repositories.TradingRepositoryImpl", f = "TradingRepositoryImpl.kt", l = {49}, m = "makeABet")
public final class S32 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ T32 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S32(T32 t32, LM lm) {
        super(lm);
        this.e = t32;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.g(null, this);
    }
}

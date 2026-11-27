package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.TradingDataSourceImpl", f = "TradingDataSourceImpl.kt", l = {141}, m = "historyCandleToTimestamp")
public final class N22 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ M22 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N22(M22 m22, LM lm) {
        super(lm);
        this.e = m22;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}

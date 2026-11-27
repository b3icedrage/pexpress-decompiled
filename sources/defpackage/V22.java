package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.trading.providers.TradingDefaultsProviderBase", f = "TradingDefaultsProviderBase.kt", l = {17}, m = "defaultMaximumProfit$suspendImpl")
public final class V22 extends LM {
    public X22 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ X22 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V22(X22 x22, LM lm) {
        super(lm);
        this.g = x22;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return X22.e(this.g, null, this);
    }
}

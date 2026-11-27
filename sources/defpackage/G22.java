package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.trading.providers.TradingAssetsProviderImpl", f = "TradingAssetsProviderImpl.kt", l = {63}, m = "checkTimeAvailability")
public final class G22 extends LM {
    public C3279d22 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ H22 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G22(H22 h22, LM lm) {
        super(lm);
        this.g = h22;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, this);
    }
}

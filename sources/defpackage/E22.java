package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider", f = "TradingAssetsProvider.kt", l = {121, 122, 123, 126, 127}, m = "updateSelectedAssetForNewTimeIfNeed")
public final class E22 extends LM {
    public AbstractC7949z22 d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC7949z22 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E22(AbstractC7949z22 abstractC7949z22, LM lm) {
        super(lm);
        this.h = abstractC7949z22;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return AbstractC7949z22.b(this.h, this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingAssetsProvider", f = "TradingAssetsProvider.kt", l = {190, 190, 191, 196}, m = "updateSelectedAsset")
public final class D22 extends LM {
    public AbstractC7949z22 d;
    public Object e;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ AbstractC7949z22 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D22(AbstractC7949z22 abstractC7949z22, LM lm) {
        super(lm);
        this.i = abstractC7949z22;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return AbstractC7949z22.a(this.i, null, this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {447, 449, 452, 454, 456, 470, 480, 482, 493, 516}, m = "tradingFlow")
public final class L12 extends LM {
    public S02 d;
    public Object e;
    public Object g;
    public String h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ S02<H32> k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L12(S02 s02, LM lm) {
        super(lm);
        this.k = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return S02.b(this.k, this);
    }
}

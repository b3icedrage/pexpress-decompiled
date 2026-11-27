package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {326}, m = "startTrading")
public final class J12 extends LM {
    public S02 d;
    public EnumC4164hF1 e;
    public InterfaceC7187vQ1 g;
    public InterfaceC5721oR1 h;
    public E10 i;
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ S02<H32> m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J12(S02 s02, LM lm) {
        super(lm);
        this.m = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.S(null, null, false, 0, null, null, this);
    }
}

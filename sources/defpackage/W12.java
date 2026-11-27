package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.trading.usecases.TraderImpl", f = "TraderImpl.kt", l = {125, 126}, m = "createTradingParams")
public final class W12 extends LM {
    public Y12 d;
    public H32.a e;
    public String g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Y12 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W12(Y12 y12, LM lm) {
        super(lm);
        this.k = y12;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(0, null, this);
    }
}

package defpackage;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {702, 704}, m = "tradingWin")
public final class M12 extends LM {
    public S02 d;
    public Object e;
    public String g;
    public Object h;
    public Double i;
    public Double j;
    public Double k;
    public /* synthetic */ Object l;
    public final /* synthetic */ S02<H32> m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M12(S02 s02, LM lm) {
        super(lm);
        this.m = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.m.V(null, null, null, null, null, this);
    }
}

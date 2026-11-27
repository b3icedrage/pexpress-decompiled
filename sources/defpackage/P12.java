package defpackage;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {563, 564, 565}, m = "tryUpdateTradingState")
public final class P12 extends LM {
    public S02 d;
    public InterfaceC2441Xr e;
    public /* synthetic */ Object g;
    public final /* synthetic */ S02<H32> h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P12(S02 s02, LM lm) {
        super(lm);
        this.h = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.h.Y(null, this);
    }
}

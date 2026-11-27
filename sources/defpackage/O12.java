package defpackage;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {541, 548}, m = "trySetupRate")
public final class O12 extends LM {
    public S02 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ S02<H32> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O12(S02 s02, LM lm) {
        super(lm);
        this.g = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.g.X(this);
    }
}

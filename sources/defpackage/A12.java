package defpackage;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {1340}, m = "sendBetIdToOurBackend")
public final class A12 extends LM {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ S02<H32> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A12(S02 s02, LM lm) {
        super(lm);
        this.g = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.g.I(0L, this);
    }
}

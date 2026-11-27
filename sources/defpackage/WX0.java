package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.stop_triggers.MaxProfitStopChecker", f = "MaxProfitStopChecker.kt", l = {16}, m = "shouldStopClause$suspendImpl")
public final class WX0 extends LM {
    public double d;
    public /* synthetic */ Object e;
    public final /* synthetic */ XX0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WX0(XX0 xx0, LM lm) {
        super(lm);
        this.g = xx0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return XX0.f(this.g, null, this);
    }
}

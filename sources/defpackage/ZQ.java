package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrentStrategyProvider", f = "CurrentStrategyProvider.kt", l = {47, 49}, m = "createStrategyCalculator")
public final class ZQ extends LM {
    public C3149cR d;
    public EnumC2644a42 e;
    public C5475nF1 g;
    public int h;
    public int i;
    public double j;
    public /* synthetic */ Object k;
    public final /* synthetic */ C3149cR l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZQ(C3149cR c3149cR, LM lm) {
        super(lm);
        this.l = c3149cR;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, 0, 0, null, this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.reporters.RobotTradingReporter", f = "RobotTradingReporter.kt", l = {265, 266, 268}, m = "currentMaxProfit")
public final class BA1 extends LM {
    public AbstractC7770yA1 d;
    public long e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC7770yA1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BA1(AbstractC7770yA1 abstractC7770yA1, LM lm) {
        super(lm);
        this.h = abstractC7770yA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(0L, this);
    }
}

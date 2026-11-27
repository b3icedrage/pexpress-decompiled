package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.reporters.RobotTradingReporter", f = "RobotTradingReporter.kt", l = {272, 273, 275, 276}, m = "currentStartAmount")
public final class CA1 extends LM {
    public AbstractC7770yA1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AbstractC7770yA1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CA1(AbstractC7770yA1 abstractC7770yA1, LM lm) {
        super(lm);
        this.g = abstractC7770yA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(this);
    }
}

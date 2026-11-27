package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.reporters.RobotTradingReporter", f = "RobotTradingReporter.kt", l = {121, 131, 137, 148, 151, 157, 169}, m = "notifyAmplitudeAboutStartTrading")
public final class DA1 extends LM {
    public AbstractC7770yA1 d;
    public Object e;
    public Object g;
    public EnumC5028l80 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AbstractC7770yA1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DA1(AbstractC7770yA1 abstractC7770yA1, LM lm) {
        super(lm);
        this.j = abstractC7770yA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(null, null, null, 0L, null, this);
    }
}

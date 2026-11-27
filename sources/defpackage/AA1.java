package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.reporters.RobotTradingReporter", f = "RobotTradingReporter.kt", l = {259}, m = "currentAutoSelection")
public final class AA1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC7770yA1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AA1(AbstractC7770yA1 abstractC7770yA1, LM lm) {
        super(lm);
        this.e = abstractC7770yA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}

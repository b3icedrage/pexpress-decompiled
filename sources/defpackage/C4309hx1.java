package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.callbacks.RobotInvestmentCallbacksBase", f = "RobotInvestmentCallbacksBase.kt", l = {27}, m = "onShowOnChartClicked")
public final class C4309hx1 extends LM {
    public C4557ix1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4557ix1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4309hx1(C4557ix1 c4557ix1, LM lm) {
        super(lm);
        this.g = c4557ix1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}

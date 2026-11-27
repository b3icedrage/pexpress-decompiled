package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {532, 534, 535, 544, 546, 548}, m = "onMaxProfitEarned")
public final class C3100cA1 extends LM {
    public C4617jA1 d;
    public Object e;
    public double g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C4617jA1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3100cA1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.i = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.o(0.0d, this);
    }
}

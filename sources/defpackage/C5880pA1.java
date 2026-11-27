package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {640, 666, 667, 669, 663}, m = "startTradingRobot")
public final class C5880pA1 extends LM {
    public C4617jA1 d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ C4617jA1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5880pA1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.m = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return C4617jA1.h(this.m, this);
    }
}

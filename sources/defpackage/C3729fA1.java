package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading", f = "RobotTrading.kt", l = {313, 321, 321, 317}, m = "onStopRobot")
public final class C3729fA1 extends LM {
    public C4617jA1 d;
    public Long e;
    public AbstractC7770yA1 g;
    public EnumC4164hF1 h;
    public Double i;
    public Double j;
    public boolean k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C4617jA1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3729fA1(C4617jA1 c4617jA1, LM lm) {
        super(lm);
        this.n = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.q(false, this);
    }
}

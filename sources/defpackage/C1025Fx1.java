package defpackage;

import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart", f = "RobotInvestmentPart.kt", l = {224}, m = "invalidateState")
public final class C1025Fx1 extends LM {
    public RobotInvestmentPart d;
    public PQ e;
    public C2533Yv1 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ RobotInvestmentPart i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025Fx1(RobotInvestmentPart robotInvestmentPart, JM<? super C1025Fx1> jm) {
        super(jm);
        this.i = robotInvestmentPart;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return RobotInvestmentPart.l(this.i, null, this);
    }
}

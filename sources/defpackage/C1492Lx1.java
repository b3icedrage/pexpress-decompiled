package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Lx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentViewModelBase$realStopRobot$1", f = "RobotInvestmentViewModelBase.kt", l = {295}, m = "invokeSuspend")
public final class C1492Lx1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1259Ix1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1492Lx1(C1259Ix1 c1259Ix1, JM<? super C1492Lx1> jm) {
        super(1, jm);
        this.e = c1259Ix1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1492Lx1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C1492Lx1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4617jA1 c4617jA1 = this.e.f;
            this.d = 1;
            if (c4617jA1.q(true, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}

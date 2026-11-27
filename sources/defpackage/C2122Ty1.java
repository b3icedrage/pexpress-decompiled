package defpackage;

import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ty1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initViews$1", f = "RobotRiskManagementPart.kt", l = {53}, m = "invokeSuspend")
public final class C2122Ty1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ RobotRiskManagementPart e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2122Ty1(RobotRiskManagementPart robotRiskManagementPart, JM<? super C2122Ty1> jm) {
        super(2, jm);
        this.e = robotRiskManagementPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2122Ty1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2122Ty1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            RobotRiskManagementPart robotRiskManagementPart = this.e;
            InterfaceC1918Ri1 interfaceC1918Ri1 = robotRiskManagementPart.o;
            this.d = 1;
            if (interfaceC1918Ri1.a(robotRiskManagementPart.n) == mn) {
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

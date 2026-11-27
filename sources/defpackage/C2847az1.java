package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: az1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onLossLimitClick$1", f = "RobotRiskManagementViewModelBase.kt", l = {267}, m = "invokeSuspend")
public final class C2847az1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C2360Wy1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2847az1(C2360Wy1 c2360Wy1, JM<? super C2847az1> jm) {
        super(1, jm);
        this.e = c2360Wy1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2847az1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C2847az1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C2360Wy1 c2360Wy1 = this.e;
            if (((Boolean) c2360Wy1.f.e.getValue()).booleanValue()) {
                C6120qK1 c6120qK1 = c2360Wy1.D;
                E32 e32 = E32.g;
                this.d = 1;
                if (c6120qK1.a(e32, this) == mn) {
                    return mn;
                }
            } else {
                C6561sS.g(c2360Wy1, new C3685ez1(c2360Wy1, null));
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

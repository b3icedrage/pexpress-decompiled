package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ez1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$showLossLimitBlockedDialog$1", f = "RobotRiskManagementViewModelBase.kt", l = {276}, m = "invokeSuspend")
public final class C3685ez1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C2360Wy1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3685ez1(C2360Wy1 c2360Wy1, JM<? super C3685ez1> jm) {
        super(1, jm);
        this.e = c2360Wy1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3685ez1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C3685ez1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C2360Wy1 c2360Wy1 = this.e;
            C6120qK1 c6120qK1 = c2360Wy1.H;
            C3668eu c3668euA = c2360Wy1.i.a(EnumC5404mv1.g);
            this.d = 1;
            if (c6120qK1.a(c3668euA, this) == mn) {
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

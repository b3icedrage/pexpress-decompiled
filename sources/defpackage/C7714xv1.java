package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$startTrading$1", f = "RobotCommonActionViewModelBase.kt", l = {204}, m = "invokeSuspend")
public final class C7714xv1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C7293vv1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7714xv1(C7293vv1 c7293vv1, JM<? super C7714xv1> jm) {
        super(1, jm);
        this.e = c7293vv1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C7714xv1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C7714xv1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C7293vv1 c7293vv1 = this.e;
            C4617jA1 c4617jA1 = c7293vv1.d;
            ((Boolean) c7293vv1.e.e.getValue()).getClass();
            this.d = 1;
            if (c4617jA1.p() == mn) {
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

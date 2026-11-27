package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ou1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onDepositClick$1", f = "RobotAccountSelectionViewModelBase.kt", l = {177}, m = "invokeSuspend")
public final class C1720Ou1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1798Pu1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720Ou1(C1798Pu1 c1798Pu1, JM<? super C1720Ou1> jm) {
        super(2, jm);
        this.e = c1798Pu1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1720Ou1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1720Ou1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC0704Bu1 interfaceC0704Bu1 = this.e.e;
            this.d = 1;
            if (interfaceC0704Bu1.d(this) == mn) {
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

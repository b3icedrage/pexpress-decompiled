package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetViewModelBase$stopTrading$1", f = "StopConfirmBottomSheetViewModelBase.kt", l = {38}, m = "invokeSuspend")
public final class CQ1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ DQ1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CQ1(DQ1 dq1, JM<? super CQ1> jm) {
        super(2, jm);
        this.e = dq1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new CQ1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((CQ1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4617jA1 c4617jA1 = this.e.e;
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

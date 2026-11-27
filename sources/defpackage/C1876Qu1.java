package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Qu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase$onMultipleAccountSelectionClicked$1", f = "RobotAccountSelectionViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C1876Qu1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C1798Pu1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1876Qu1(C1798Pu1 c1798Pu1, JM<? super C1876Qu1> jm) {
        super(2, jm);
        this.d = c1798Pu1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1876Qu1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1876Qu1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        this.d.e.b();
        return Unit.a;
    }
}

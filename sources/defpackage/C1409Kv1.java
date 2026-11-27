package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Kv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$onDialogButtonClick$1", f = "RobotCommonViewModelBase.kt", l = {160}, m = "invokeSuspend")
public final class C1409Kv1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1486Lv1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409Kv1(C1486Lv1 c1486Lv1, JM<? super C1409Kv1> jm) {
        super(2, jm);
        this.e = c1486Lv1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1409Kv1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1409Kv1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC4548iu1 interfaceC4548iu1 = this.e.m.b;
            Boolean bool = Boolean.TRUE;
            this.d = 1;
            if (interfaceC4548iu1.b(bool, this) == mn) {
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

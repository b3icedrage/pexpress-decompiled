package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: sA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$tryRestartRobot$1", f = "RobotTrading.kt", l = {197}, m = "invokeSuspend")
public final class C6509sA1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4617jA1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6509sA1(C4617jA1 c4617jA1, JM<? super C6509sA1> jm) {
        super(2, jm);
        this.e = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6509sA1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6509sA1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            if (C4617jA1.c(this.e, false, this) == mn) {
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

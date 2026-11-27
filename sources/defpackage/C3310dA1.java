package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: dA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$onMaxProfitEarned$3", f = "RobotTrading.kt", l = {}, m = "invokeSuspend")
public final class C3310dA1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C4617jA1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3310dA1(C4617jA1 c4617jA1, JM<? super C3310dA1> jm) {
        super(2, jm);
        this.d = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3310dA1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3310dA1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        this.d.g.d();
        return Unit.a;
    }
}

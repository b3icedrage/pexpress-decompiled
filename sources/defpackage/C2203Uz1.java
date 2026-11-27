package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Uz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$currentMaxProfit$limit$2", f = "RobotTrading.kt", l = {718}, m = "invokeSuspend")
public final class C2203Uz1 extends AW1 implements Function1<JM<? super Long>, Object> {
    public int d;
    public final /* synthetic */ C4617jA1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203Uz1(C4617jA1 c4617jA1, JM<? super C2203Uz1> jm) {
        super(1, jm);
        this.e = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2203Uz1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Long> jm) {
        return ((C2203Uz1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        InterfaceC6396rf0<Long> interfaceC6396rf0B = this.e.q.b();
        this.d = 1;
        Object objO = C4466ii.o(interfaceC6396rf0B, this);
        return objO == mn ? mn : objO;
    }
}

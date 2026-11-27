package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotTrading$currentAutoSelection$2", f = "RobotTrading.kt", l = {730}, m = "invokeSuspend")
public final class C1891Qz1 extends AW1 implements Function1<JM<? super Boolean>, Object> {
    public int d;
    public final /* synthetic */ C4617jA1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891Qz1(C4617jA1 c4617jA1, JM<? super C1891Qz1> jm) {
        super(1, jm);
        this.e = c4617jA1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1891Qz1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Boolean> jm) {
        return ((C1891Qz1) create(jm)).invokeSuspend(Unit.a);
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
        InterfaceC6396rf0<Boolean> interfaceC6396rf0L = this.e.r.l();
        this.d = 1;
        Object objO = C4466ii.o(interfaceC6396rf0L, this);
        return objO == mn ? mn : objO;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.trading.usecases.AddRobotBetIdUseCaseBase$execute$2$3", f = "AddRobotBetIdUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class Y7 extends AW1 implements Function1<JM<? super Long>, Object> {
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7(long j, JM<? super Y7> jm) {
        super(1, jm);
        this.d = j;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new Y7(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Long> jm) {
        return ((Y7) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return new Long(this.d);
    }
}

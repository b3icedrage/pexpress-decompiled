package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.accountselection.usecases.SelectAccountUseCaseBase$selectAccount$2", f = "SelectAccountUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class GE1 extends AW1 implements Function1<JM<? super EnumC4164hF1>, Object> {
    public GE1() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new GE1(1, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super EnumC4164hF1> jm) {
        ((GE1) create(jm)).invokeSuspend(Unit.a);
        return EnumC4164hF1.g;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return EnumC4164hF1.g;
    }
}

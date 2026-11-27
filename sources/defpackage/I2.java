package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.screens.balance.AccountBalanceViewModelBase$onAlertDialogActivateClick$1", f = "AccountBalanceViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class I2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ J2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(J2 j2, JM<? super I2> jm) {
        super(2, jm);
        this.d = j2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new I2(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((I2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        this.d.e.f();
        return Unit.a;
    }
}

package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonAccount;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.accountselection.usecases.SelectAccountUseCaseBase$selectAccount$4", f = "SelectAccountUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class IE1 extends AW1 implements Function1<JM<? super Long>, Object> {
    public final /* synthetic */ CommonAccount d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IE1(CommonAccount commonAccount, JM<? super IE1> jm) {
        super(1, jm);
        this.d = commonAccount;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new IE1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Long> jm) {
        return ((IE1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return new Long(this.d.getId());
    }
}

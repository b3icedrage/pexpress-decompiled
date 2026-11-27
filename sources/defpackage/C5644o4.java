package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonAccount;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.accountselection.screens.AccountSelectionViewModelBase$onAccountSelected$1", f = "AccountSelectionViewModelBase.kt", l = {51}, m = "invokeSuspend")
public final class C5644o4 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5434n4 e;
    public final /* synthetic */ CommonAccount g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5644o4(C5434n4 c5434n4, CommonAccount commonAccount, JM<? super C5644o4> jm) {
        super(2, jm);
        this.e = c5434n4;
        this.g = commonAccount;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5644o4(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5644o4) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        CommonAccount commonAccount = this.g;
        C5434n4 c5434n4 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            EE1 ee1 = c5434n4.f;
            this.d = 1;
            if (ee1.a(commonAccount, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        c5434n4.e.c(commonAccount);
        return Unit.a;
    }
}

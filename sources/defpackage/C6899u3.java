package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.screens.logout.AccountLogoutViewModelBase$logout$1", f = "AccountLogoutViewModelBase.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
public final class C6899u3 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C7109v3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6899u3(C7109v3 c7109v3, JM<? super C6899u3> jm) {
        super(2, jm);
        this.e = c7109v3;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6899u3(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6899u3) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            M2 m2 = this.e.d;
            this.d = 1;
            if (m2.e(this) == mn) {
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

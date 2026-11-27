package defpackage;

import com.api.core.backend.domain.models.responseModels.DefaultResponse;
import com.api.core.backend.repositories.user.models.requests.AccountActivationRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase$userActivation$2", f = "UserRepositoryBase.kt", l = {89}, m = "invokeSuspend")
public final class Gb2 extends AW1 implements Function1<JM<? super DefaultResponse>, Object> {
    public int d;
    public final /* synthetic */ Ib2 e;
    public final /* synthetic */ C5893pF g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb2(Ib2 ib2, C5893pF c5893pF, JM<? super Gb2> jm) {
        super(1, jm);
        this.e = ib2;
        this.g = c5893pF;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new Gb2(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super DefaultResponse> jm) {
        return ((Gb2) create(jm)).invokeSuspend(Unit.a);
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
        Ya2 ya2 = this.e.a;
        AccountActivationRequest.INSTANCE.getClass();
        C5893pF common = this.g;
        Intrinsics.checkNotNullParameter(common, "common");
        AccountActivationRequest accountActivationRequest = new AccountActivationRequest(Long.valueOf(common.a));
        this.d = 1;
        Object objC = ya2.c(accountActivationRequest, this);
        return objC == mn ? mn : objC;
    }
}

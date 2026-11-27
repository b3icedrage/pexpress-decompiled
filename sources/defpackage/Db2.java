package defpackage;

import com.api.core.backend.domain.models.responseModels.DefaultResponse;
import com.api.core.backend.repositories.user.models.requests.CryptoEnableRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase$setCryptoEnable$2", f = "UserRepositoryBase.kt", l = {98}, m = "invokeSuspend")
public final class Db2 extends AW1 implements Function1<JM<? super DefaultResponse>, Object> {
    public int d;
    public final /* synthetic */ Ib2 e;
    public final /* synthetic */ JF g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Db2(Ib2 ib2, JF jf, JM<? super Db2> jm) {
        super(1, jm);
        this.e = ib2;
        this.g = jf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new Db2(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super DefaultResponse> jm) {
        return ((Db2) create(jm)).invokeSuspend(Unit.a);
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
        CryptoEnableRequest.INSTANCE.getClass();
        JF common = this.g;
        Intrinsics.checkNotNullParameter(common, "common");
        CryptoEnableRequest cryptoEnableRequest = new CryptoEnableRequest(common.a);
        this.d = 1;
        Object objH = ya2.h(cryptoEnableRequest, this);
        return objH == mn ? mn : objH;
    }
}

package defpackage;

import com.api.core.backend.domain.models.responseModels.DefaultResponse;
import com.api.core.backend.repositories.user.models.requests.ChangeChangeUserDataRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase$changeUserData$2", f = "UserRepositoryBase.kt", l = {105}, m = "invokeSuspend")
public final class C7853yb2 extends AW1 implements Function1<JM<? super DefaultResponse>, Object> {
    public int d;
    public final /* synthetic */ Ib2 e;
    public final /* synthetic */ AF g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7853yb2(Ib2 ib2, AF af, JM<? super C7853yb2> jm) {
        super(1, jm);
        this.e = ib2;
        this.g = af;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C7853yb2(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super DefaultResponse> jm) {
        return ((C7853yb2) create(jm)).invokeSuspend(Unit.a);
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
        ChangeChangeUserDataRequest.INSTANCE.getClass();
        AF common = this.g;
        Intrinsics.checkNotNullParameter(common, "common");
        ChangeChangeUserDataRequest changeChangeUserDataRequest = new ChangeChangeUserDataRequest(common.b, common.c, Long.valueOf(common.a));
        this.d = 1;
        Object objG = ya2.g(changeChangeUserDataRequest, this);
        return objG == mn ? mn : objG;
    }
}

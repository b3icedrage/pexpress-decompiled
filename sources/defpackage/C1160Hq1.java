package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonErrorClassificationKt;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegisterUseCaseBase$requestRegister$result$1", f = "RegisterUseCaseBase.kt", l = {154}, m = "invokeSuspend")
public final class C1160Hq1 extends AW1 implements Function1<JM<? super CommonResult<? extends Object>>, Object> {
    public int d;
    public final /* synthetic */ AbstractC7909yq1 e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160Hq1(AbstractC7909yq1 abstractC7909yq1, String str, JM<? super C1160Hq1> jm) {
        super(1, jm);
        this.e = abstractC7909yq1;
        this.g = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1160Hq1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super CommonResult<? extends Object>> jm) {
        return ((C1160Hq1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        AbstractC7909yq1 abstractC7909yq1 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            C7278vq1 c7278vq1 = abstractC7909yq1.a;
            this.d = 1;
            obj = c7278vq1.b(this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        CommonResult commonResult = (CommonResult) obj;
        if (commonResult instanceof ResultError) {
            ResultError resultError = (ResultError) commonResult;
            if (CommonErrorClassificationKt.c(resultError.getError())) {
                CommonError error = resultError.getError();
                Intrinsics.checkNotNullParameter(error, "<this>");
                if ((error instanceof CommonError.SessionMissing) || error.getHttp().get("status") != null || error.getHttp().get("connect_ms") != null || Intrinsics.a(error.getHttp().get("connection_reused"), Boolean.TRUE)) {
                    abstractC7909yq1.s = this.g;
                }
            }
        }
        return obj;
    }
}

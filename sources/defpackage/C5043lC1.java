package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.helpers.SafeRequestsApi$httpWithError$2", f = "SafeRequestsApi.kt", l = {93}, m = "invokeSuspend")
public final class C5043lC1 extends AW1 implements Function1<JM<? super CommonResult<Object>>, Object> {
    public int d;
    public final /* synthetic */ Function1<JM<Object>, Object> e;
    public final /* synthetic */ AbstractC6305rC1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5043lC1(JM jm, AbstractC6305rC1 abstractC6305rC1, Function1 function1) {
        super(1, jm);
        this.e = function1;
        this.g = abstractC6305rC1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5043lC1(jm, this.g, this.e);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super CommonResult<Object>> jm) {
        return ((C5043lC1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            obj = this.e.invoke(this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (Intrinsics.a(httpResponse.getStatus(), "success")) {
            return new ResultOk(httpResponse);
        }
        Integer code = httpResponse.getCode();
        String message = httpResponse.getMessage();
        if (message == null) {
            message = "empty message";
        }
        CommonError commonErrorB = CommonError.Companion.b(CommonError.INSTANCE, code != null ? code.intValue() : CommonError.Codes.UnexpectedError.getValue(), message, null, 4);
        if (code != null && C5676oC1.a.e(code.intValue()) && ((commonErrorB instanceof CommonError.OtherError) || (commonErrorB instanceof CommonError.EmailNotExists))) {
            commonErrorB = new CommonError.OurServerError();
            commonErrorB.setText(message);
            commonErrorB.setPlatformCode("body_" + code + ":" + KS1.B(HttpPlatformResponse.MAX_MESSAGE_LENGTH, message));
        }
        return new ResultError(commonErrorB);
    }
}

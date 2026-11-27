package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Al0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.usecases.GetUserUseCaseBase$getProfile$data$2", f = "GetUserUseCaseBase.kt", l = {38}, m = "invokeSuspend")
public final class C0598Al0 extends AW1 implements Function1<JM<? super CommonResult<? extends C6945uG>>, Object> {
    public int d;
    public final /* synthetic */ C0754Cl0 e;
    public final /* synthetic */ C6315rG g;
    public final /* synthetic */ C3027bp1<CommonError> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598Al0(C0754Cl0 c0754Cl0, C6315rG c6315rG, C3027bp1<CommonError> c3027bp1, JM<? super C0598Al0> jm) {
        super(1, jm);
        this.e = c0754Cl0;
        this.g = c6315rG;
        this.h = c3027bp1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C0598Al0(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super CommonResult<? extends C6945uG>> jm) {
        return ((C0598Al0) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.api.core.backend.domain.models.resultModels.CommonError] */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC7012ub2 interfaceC7012ub2 = this.e.a;
            this.d = 1;
            obj = interfaceC7012ub2.k(this.g, this);
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
            this.h.d = ((ResultError) commonResult).getError();
        }
        return obj;
    }
}

package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$prepareSession$session$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {201}, m = "invokeSuspend")
public final class BN0 extends AW1 implements Function1<JM<? super XN0>, Object> {
    public int d;
    public final /* synthetic */ C3977gN0 e;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BN0(C3977gN0 c3977gN0, boolean z, JM<? super BN0> jm) {
        super(1, jm);
        this.e = c3977gN0;
        this.g = z;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new BN0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super XN0> jm) {
        return ((BN0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            C3977gN0 c3977gN0 = this.e;
            C6315rG c6315rG = (C6315rG) c3977gN0.c.f.getValue();
            String str = c6315rG != null ? c6315rG.a : null;
            if (str == null || str.length() == 0 || !this.g) {
                obj = null;
            } else {
                obj = c3977gN0.m.a(this);
                if (obj != mn) {
                    obj = (CommonResult) obj;
                }
            }
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
        Set<Integer> set = YN0.a;
        if (commonResult == null) {
            return XN0.c.a;
        }
        if (commonResult instanceof ResultOk) {
            return XN0.d.a;
        }
        if (!(commonResult instanceof ResultError)) {
            throw new C6489s51();
        }
        ResultError resultError = (ResultError) commonResult;
        return C1603Nh1.a(resultError.getError()) ? new XN0.b(resultError.getError()) : new XN0.a(resultError.getError());
    }
}

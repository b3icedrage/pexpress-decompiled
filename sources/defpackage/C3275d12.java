package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: d12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$getBetResponses$2", f = "Trader.kt", l = {}, m = "invokeSuspend")
public final class C3275d12 extends AW1 implements Function2<CommonResult<? extends AbstractC7783yF>, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ C3034bs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3275d12(C3034bs c3034bs, JM<? super C3275d12> jm) {
        super(2, jm);
        this.e = c3034bs;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C3275d12 c3275d12 = new C3275d12(this.e, jm);
        c3275d12.d = obj;
        return c3275d12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CommonResult<? extends AbstractC7783yF> commonResult, JM<? super Unit> jm) {
        return ((C3275d12) create(commonResult, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        CommonResult commonResult = (CommonResult) this.d;
        if (commonResult instanceof ResultError) {
            this.e.a = ((ResultError) commonResult).getError();
        }
        return Unit.a;
    }
}

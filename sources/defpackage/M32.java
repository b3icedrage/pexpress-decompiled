package defpackage;

import com.api.core.backend.domain.models.requestModels.AddDealRequest;
import com.api.core.backend.domain.models.requestModels.CommonAddDealRequest;
import com.api.core.backend.domain.models.responseModels.CommonDefaultResponse;
import com.api.core.backend.domain.models.responseModels.DefaultResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.TradingRepositoryBase$addDeal$2", f = "TradingRepositoryBase.kt", l = {34}, m = "invokeSuspend")
public final class M32 extends AW1 implements Function1<JM<? super CommonDefaultResponse>, Object> {
    public int d;
    public final /* synthetic */ N32 e;
    public final /* synthetic */ CommonAddDealRequest g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M32(N32 n32, CommonAddDealRequest commonAddDealRequest, JM<? super M32> jm) {
        super(1, jm);
        this.e = n32;
        this.g = commonAddDealRequest;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new M32(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super CommonDefaultResponse> jm) {
        return ((M32) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            K22 k22 = this.e.a;
            AddDealRequest.INSTANCE.getClass();
            CommonAddDealRequest common = this.g;
            Intrinsics.checkNotNullParameter(common, "common");
            AddDealRequest addDealRequest = new AddDealRequest(Long.valueOf(common.getUserId()), Double.valueOf(common.getProfit()), Integer.valueOf(common.getStartAmount()), Double.valueOf(common.getBalance()), common.getCurrency());
            this.d = 1;
            obj = k22.d(addDealRequest, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return ((DefaultResponse) obj).e();
    }
}

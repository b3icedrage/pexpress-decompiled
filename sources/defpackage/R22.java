package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.impl.core.backend.modelsResponse.BetClosedResponseImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.TradingDataSourceImpl$separateCloseResponses$1", f = "TradingDataSourceImpl.kt", l = {}, m = "invokeSuspend")
public final class R22 extends AW1 implements Function2<ResultOk<? extends BetClosedResponseImpl>, JM<? super InterfaceC6396rf0<? extends BetClosedResponseImpl.ClosedBetImpl>>, Object> {
    public /* synthetic */ Object d;

    public R22() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        R22 r22 = new R22(2, jm);
        r22.d = obj;
        return r22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ResultOk<? extends BetClosedResponseImpl> resultOk, JM<? super InterfaceC6396rf0<? extends BetClosedResponseImpl.ClosedBetImpl>> jm) {
        return ((R22) create(resultOk, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        List<BetClosedResponseImpl.ClosedBetImpl> listF = ((BetClosedResponseImpl) ((ResultOk) this.d).a()).f();
        if (listF == null) {
            listF = C5653o60.d;
        }
        return new C0580Af0(listF);
    }
}

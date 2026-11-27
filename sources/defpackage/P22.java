package defpackage;

import com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract;
import com.api.core.backend.domain.models.requestModels.MakeABetRequestApi;
import com.impl.core.backend.modelsRequest.MakeABetRequestImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.TradingDataSourceImpl$makeABet$2", f = "TradingDataSourceImpl.kt", l = {93}, m = "invokeSuspend")
public final class P22 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Vg2 e;
    public final /* synthetic */ MakeABetRequestApi g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P22(Vg2 vg2, MakeABetRequestApi makeABetRequestApi, JM<? super P22> jm) {
        super(1, jm);
        this.e = vg2;
        this.g = makeABetRequestApi;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new P22(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((P22) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            Object obj2 = this.g;
            ((MakeABetRequestImpl) obj2).getClass();
            this.d = 1;
            if (Fg2.z(this.e, "openOrder", (WebSocketRequestAbstract) obj2, this, 12) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}

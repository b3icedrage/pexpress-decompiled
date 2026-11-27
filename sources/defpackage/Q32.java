package defpackage;

import com.api.core.backend.domain.models.responseModels.ChartEntryPointsHistoryResponseApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.repositories.TradingRepositoryImpl$historyCandleToTimestamp$2", f = "TradingRepositoryImpl.kt", l = {97}, m = "invokeSuspend")
public final class Q32 extends AW1 implements Function1<JM<? super List<? extends BF>>, Object> {
    public int d;
    public final /* synthetic */ T32 e;
    public final /* synthetic */ YF g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q32(T32 t32, YF yf, JM<? super Q32> jm) {
        super(1, jm);
        this.e = t32;
        this.g = yf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new Q32(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super List<? extends BF>> jm) {
        return ((Q32) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            K22 k22 = this.e.c;
            this.d = 1;
            obj = k22.a(this.g, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return ((ChartEntryPointsHistoryResponseApi) obj).a();
    }
}

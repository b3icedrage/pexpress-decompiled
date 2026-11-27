package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonMinMaxBet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.trading.providers.TradingDefaultsProviderBase$listBetParams$2", f = "TradingDefaultsProviderBase.kt", l = {}, m = "invokeSuspend")
public final class W22 extends AW1 implements Function2<Map<String, ? extends CommonMinMaxBet>, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;

    public W22() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        W22 w22 = new W22(2, jm);
        w22.d = obj;
        return w22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Map<String, ? extends CommonMinMaxBet> map, JM<? super Boolean> jm) {
        return ((W22) create(map, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(!((Map) this.d).isEmpty());
    }
}

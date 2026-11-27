package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$startUpdatingProgress$3", f = "TradingNotificationController.kt", l = {}, m = "invokeSuspend")
public final class A32 extends AW1 implements Function2<Integer, JM<? super Boolean>, Object> {
    public /* synthetic */ int d;

    public A32() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        A32 a32 = new A32(2, jm);
        a32.d = ((Number) obj).intValue();
        return a32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, JM<? super Boolean> jm) {
        return ((A32) create(Integer.valueOf(num.intValue()), jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d < 100);
    }
}

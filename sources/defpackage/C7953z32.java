package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: z32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$startUpdatingProgress$2", f = "TradingNotificationController.kt", l = {}, m = "invokeSuspend")
public final class C7953z32 extends AW1 implements Function2<Integer, JM<? super Boolean>, Object> {
    public /* synthetic */ int d;

    public C7953z32() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7953z32 c7953z32 = new C7953z32(2, jm);
        c7953z32.d = ((Number) obj).intValue();
        return c7953z32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, JM<? super Boolean> jm) {
        return ((C7953z32) create(Integer.valueOf(num.intValue()), jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d > 0);
    }
}

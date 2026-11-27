package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$startUpdatingProgress$4$1", f = "TradingNotificationController.kt", l = {}, m = "invokeSuspend")
public final class B32 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ D32 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B32(D32 d32, int i, JM<? super B32> jm) {
        super(2, jm);
        this.d = d32;
        this.e = i;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new B32(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((B32) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        this.d.d.c(null, null, null, new Integer(this.e));
        return Unit.a;
    }
}

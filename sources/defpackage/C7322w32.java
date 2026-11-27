package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: w32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$onTradingStarted$2", f = "TradingNotificationController.kt", l = {137}, m = "invokeSuspend")
public final class C7322w32 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ D32 e;
    public final /* synthetic */ InterfaceC6396rf0<Integer> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7322w32(D32 d32, InterfaceC6396rf0<Integer> interfaceC6396rf0, JM<? super C7322w32> jm) {
        super(2, jm);
        this.e = d32;
        this.g = interfaceC6396rf0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7322w32(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7322w32) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            if (D32.d(this.e, this.g, this) == mn) {
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

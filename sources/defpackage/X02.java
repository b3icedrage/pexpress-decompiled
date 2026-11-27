package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$calculateNewTradingParams$directionParams$2", f = "Trader.kt", l = {788}, m = "invokeSuspend")
public final class X02 extends AW1 implements Function1<JM<? super Boolean>, Object> {
    public int d;
    public final /* synthetic */ S02<H32> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X02(S02<H32> s02, JM<? super X02> jm) {
        super(1, jm);
        this.e = s02;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new X02(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Boolean> jm) {
        return ((X02) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        InterfaceC6396rf0<Boolean> interfaceC6396rf0 = this.e.q.c;
        this.d = 1;
        Object objO = C4466ii.o(interfaceC6396rf0, this);
        return objO == mn ? mn : objO;
    }
}

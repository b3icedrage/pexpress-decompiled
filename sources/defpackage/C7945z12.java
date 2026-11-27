package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: z12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader$reportingTradingFlow$1", f = "Trader.kt", l = {228}, m = "invokeSuspend")
public final class C7945z12 extends AW1 implements Function2<InterfaceC6606sf0<? super Z22>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ S02<H32> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7945z12(S02<H32> s02, JM<? super C7945z12> jm) {
        super(2, jm);
        this.g = s02;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7945z12 c7945z12 = new C7945z12(this.g, jm);
        c7945z12.e = obj;
        return c7945z12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<? super Z22> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C7945z12) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        S02<H32> s02 = this.g;
        try {
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC6606sf0 interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
                s02.N.incrementAndGet();
                C1621Nn1 c1621Nn1 = s02.M;
                this.d = 1;
                if (C4466ii.n(this, c1621Nn1, interfaceC6606sf0) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            s02.N.decrementAndGet();
            return Unit.a;
        } catch (Throwable th) {
            s02.N.decrementAndGet();
            throw th;
        }
    }
}

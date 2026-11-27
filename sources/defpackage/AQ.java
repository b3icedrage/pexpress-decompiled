package defpackage;

import com.api.core.backend.domain.models.responseModels.GetCurrencyResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.CurrencyRepositoryBase$getCurrency$2", f = "CurrencyRepositoryBase.kt", l = {25}, m = "invokeSuspend")
public final class AQ extends AW1 implements Function1<JM<? super InterfaceC1247It1<KF>>, Object> {
    public int d;
    public final /* synthetic */ CQ e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQ(CQ cq, JM<? super AQ> jm) {
        super(1, jm);
        this.e = cq;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new AQ(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super InterfaceC1247It1<KF>> jm) {
        return ((AQ) create(jm)).invokeSuspend(Unit.a);
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
        InterfaceC6345rQ interfaceC6345rQ = this.e.b;
        this.d = 1;
        GetCurrencyResponse getCurrencyResponseJ = interfaceC6345rQ.j();
        return getCurrencyResponseJ == mn ? mn : getCurrencyResponseJ;
    }
}

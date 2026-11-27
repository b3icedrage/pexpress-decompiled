package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.d;

/* JADX INFO: renamed from: Rq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegistrationCurrenciesUseCaseBase$selectedCurrency$1", f = "RegistrationCurrenciesUseCaseBase.kt", l = {25}, m = "invokeSuspend")
public final class C1942Rq1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public C2020Sq1 d;
    public C2020Sq1 e;
    public int g;
    public final /* synthetic */ C2020Sq1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1942Rq1(C2020Sq1 c2020Sq1, JM<? super C1942Rq1> jm) {
        super(2, jm);
        this.h = c2020Sq1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1942Rq1(this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1942Rq1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        C2020Sq1 c2020Sq1;
        C2020Sq1 c2020Sq2;
        MN mn = MN.d;
        int i = this.g;
        if (i == 0) {
            C1795Pt1.b(obj);
            C2020Sq1 c2020Sq3 = this.h;
            this.d = c2020Sq3;
            this.e = c2020Sq3;
            this.g = 1;
            Object objC = c2020Sq3.c(this);
            if (objC == mn) {
                return mn;
            }
            c2020Sq1 = c2020Sq3;
            obj = objC;
            c2020Sq2 = c2020Sq1;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2020Sq1 = this.e;
            c2020Sq2 = this.d;
            C1795Pt1.b(obj);
        }
        LF lf = (LF) CollectionsKt.F((List) obj);
        c2020Sq1.getClass();
        String str = lf.c;
        String str2 = lf.b;
        c2020Sq2.c = new C2098Tq1(str, str2, d.i(str2, "USDT") ? "USDT" : lf.c, true);
        return Unit.a;
    }
}

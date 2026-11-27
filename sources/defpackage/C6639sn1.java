package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: sn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationViewModelBase$onCurrencyChecked$1", f = "ReRegistrationViewModelBase.kt", l = {93}, m = "invokeSuspend")
public final class C6639sn1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5800on1 e;
    public final /* synthetic */ C2098Tq1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6639sn1(C5800on1 c5800on1, C2098Tq1 c2098Tq1, JM<? super C6639sn1> jm) {
        super(2, jm);
        this.e = c5800on1;
        this.g = c2098Tq1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6639sn1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6639sn1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC1549Mq1 interfaceC1549Mq1 = this.e.L;
            this.d = 1;
            if (interfaceC1549Mq1.b(this.g, this) == mn) {
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

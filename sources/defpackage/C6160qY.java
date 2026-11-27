package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: qY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.screens.deposit.DepositViewModelImpl$onGoToPlatformClick$1", f = "DepositViewModelImpl.kt", l = {30}, m = "invokeSuspend")
public final class C6160qY extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C6369rY e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6160qY(C6369rY c6369rY, JM<? super C6160qY> jm) {
        super(2, jm);
        this.e = c6369rY;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6160qY(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6160qY) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C6369rY c6369rY = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = c6369rY.q.B;
            Unit unit = Unit.a;
            this.d = 1;
            if (c6120qK1.a(unit, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        c6369rY.p.a();
        return Unit.a;
    }
}

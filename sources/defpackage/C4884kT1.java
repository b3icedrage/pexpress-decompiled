package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameViewModelBase$placeBetDown$1", f = "StubGameViewModelBase.kt", l = {54}, m = "invokeSuspend")
public final class C4884kT1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4416iT1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4884kT1(C4416iT1 c4416iT1, JM<? super C4884kT1> jm) {
        super(2, jm);
        this.e = c4416iT1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4884kT1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4884kT1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4416iT1 c4416iT1 = this.e;
            InterfaceC3786fT1 interfaceC3786fT1 = c4416iT1.f;
            H32.a aVar = H32.a.PUT_DOWN;
            double d = c4416iT1.e.a.e().b;
            this.d = 1;
            if (interfaceC3786fT1.a(aVar, d, this) == mn) {
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

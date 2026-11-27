package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameViewModelBase$onResultsScreen$1", f = "StubGameViewModelBase.kt", l = {63}, m = "invokeSuspend")
public final class C4674jT1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4416iT1 e;
    public final /* synthetic */ TT1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4674jT1(C4416iT1 c4416iT1, TT1 tt1, JM<? super C4674jT1> jm) {
        super(2, jm);
        this.e = c4416iT1;
        this.g = tt1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4674jT1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4674jT1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C4416iT1 c4416iT1 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            QT1 qt1 = c4416iT1.h;
            this.d = 1;
            if (qt1.b(this.g) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        c4416iT1.g.a();
        return Unit.a;
    }
}

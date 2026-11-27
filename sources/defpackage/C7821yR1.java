package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: yR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.strategyinstructions.screens.StrategyInstructionsViewModelBase$onActivationButtonClicked$1", f = "StrategyInstructionsViewModelBase.kt", l = {46}, m = "invokeSuspend")
public final class C7821yR1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ BR1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7821yR1(BR1 br1, JM<? super C7821yR1> jm) {
        super(2, jm);
        this.e = br1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7821yR1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7821yR1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        BR1 br1 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            if (BR1.n(br1, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        br1.e.a();
        return Unit.a;
    }
}

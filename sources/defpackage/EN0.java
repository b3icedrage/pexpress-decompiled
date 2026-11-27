package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$prepareSignedIn$3", f = "LaunchAppThirdStepUseCaseBase.kt", l = {241}, m = "invokeSuspend")
public final class EN0 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C3977gN0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EN0(C3977gN0 c3977gN0, JM<? super EN0> jm) {
        super(1, jm);
        this.e = c3977gN0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new EN0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((EN0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C3977gN0 c3977gN0 = this.e;
            this.d = 1;
            if (c3977gN0.d.a() == mn) {
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

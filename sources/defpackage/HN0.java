package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$prepareSignedIn$pending$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {221}, m = "invokeSuspend")
public final class HN0 extends AW1 implements Function1<JM<? super InterfaceC1822Qc1>, Object> {
    public int d;
    public final /* synthetic */ C3977gN0 e;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HN0(C3977gN0 c3977gN0, int i, JM<? super HN0> jm) {
        super(1, jm);
        this.e = c3977gN0;
        this.g = i;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new HN0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super InterfaceC1822Qc1> jm) {
        return ((HN0) create(jm)).invokeSuspend(Unit.a);
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
        this.d = 1;
        Object objA = C3977gN0.a(this.e, this.g, this);
        return objA == mn ? mn : objA;
    }
}

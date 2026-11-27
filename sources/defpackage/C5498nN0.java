package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: nN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$getRobotUser$ourUser$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {350}, m = "invokeSuspend")
public final class C5498nN0 extends AW1 implements Function2<KN, JM<? super CommonResult<? extends C6106qG>>, Object> {
    public int d;
    public final /* synthetic */ C3977gN0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5498nN0(C3977gN0 c3977gN0, JM<? super C5498nN0> jm) {
        super(2, jm);
        this.e = c3977gN0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5498nN0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super CommonResult<? extends C6106qG>> jm) {
        return ((C5498nN0) create(kn, jm)).invokeSuspend(Unit.a);
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
        C3977gN0 c3977gN0 = this.e;
        this.d = 1;
        Object objB = c3977gN0.m.b(this);
        return objB == mn ? mn : objB;
    }
}

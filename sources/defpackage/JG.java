package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.CompletePendingRegistrationUseCaseBase$addUserIfPending$added$1", f = "CompletePendingRegistrationUseCaseBase.kt", l = {36}, m = "invokeSuspend")
public final class JG extends AW1 implements Function2<KN, JM<? super CommonResult<? extends Unit>>, Object> {
    public int d;
    public final /* synthetic */ KG e;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JG(KG kg, long j, JM<? super JG> jm) {
        super(2, jm);
        this.e = kg;
        this.g = j;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new JG(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super CommonResult<? extends Unit>> jm) {
        return ((JG) create(kn, jm)).invokeSuspend(Unit.a);
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
        InterfaceC3509e8 interfaceC3509e8 = this.e.b;
        this.d = 1;
        Object objA = interfaceC3509e8.a(this.g, this);
        return objA == mn ? mn : objA;
    }
}

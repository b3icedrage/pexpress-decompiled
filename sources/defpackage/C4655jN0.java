package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$checkConnectionToServer$2$outcome$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {133}, m = "invokeSuspend")
public final class C4655jN0 extends AW1 implements Function2<KN, JM<? super C3977gN0.b>, Object> {
    public int d;
    public final /* synthetic */ C3977gN0 e;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4655jN0(C3977gN0 c3977gN0, int i, JM<? super C4655jN0> jm) {
        super(2, jm);
        this.e = c3977gN0;
        this.g = i;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4655jN0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super C3977gN0.b> jm) {
        return ((C4655jN0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        Enum enumH = C3977gN0.h(this.e, this.g, this);
        return enumH == mn ? mn : enumH;
    }
}

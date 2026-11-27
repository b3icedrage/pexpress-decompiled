package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase$checkConnectionToServer$2$stage$1", f = "LaunchAppThirdStepUseCaseBase.kt", l = {129}, m = "invokeSuspend")
public final class C4865kN0 extends AW1 implements Function2<KN, JM<? super C3977gN0.c>, Object> {
    public int d;
    public final /* synthetic */ C3977gN0 e;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4865kN0(C3977gN0 c3977gN0, long j, int i, JM<? super C4865kN0> jm) {
        super(2, jm);
        this.e = c3977gN0;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4865kN0(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super C3977gN0.c> jm) {
        return ((C4865kN0) create(kn, jm)).invokeSuspend(Unit.a);
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
        AtomicInteger atomicInteger = C3977gN0.G;
        Object objD = LN.d(new C7388wN0(this.e, this.g, this.h, null), this);
        return objD == mn ? mn : objD;
    }
}

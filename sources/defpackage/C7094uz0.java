package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: uz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigViewModel$onResetClick$1", f = "IndicatorsManualConfigViewModel.kt", l = {117}, m = "invokeSuspend")
public final class C7094uz0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C6674sz0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7094uz0(C6674sz0 c6674sz0, JM<? super C7094uz0> jm) {
        super(2, jm);
        this.e = c6674sz0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7094uz0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7094uz0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C6674sz0 c6674sz0 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            C5412my0 c5412my0 = c6674sz0.f;
            this.d = 1;
            if (c5412my0.a(this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        c6674sz0.e.b();
        return Unit.a;
    }
}

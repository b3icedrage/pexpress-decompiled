package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: fR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartHistoryUseCaseBase$subscribeToUpdatesAndLoadChartHistory$2", f = "LoadChartHistoryUseCaseBase.kt", l = {91}, m = "invokeSuspend")
public final class C3779fR0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C3989gR0 e;
    public final /* synthetic */ ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3779fR0(C3989gR0 c3989gR0, ArrayList arrayList, JM jm) {
        super(2, jm);
        this.e = c3989gR0;
        this.g = arrayList;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3779fR0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3779fR0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C3989gR0 c3989gR0 = this.e;
            c3989gR0.e.a.clear();
            AbstractC7721xy.b bVar = new AbstractC7721xy.b(this.g);
            this.d = 1;
            GP1 gp1 = c3989gR0.h;
            gp1.getClass();
            gp1.m(null, bVar);
            if (Unit.a == mn) {
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

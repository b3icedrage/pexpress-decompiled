package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;

/* JADX INFO: renamed from: qZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.timeselection.screens.TimeSelectionViewModelBase$onTimeClicked$1", f = "TimeSelectionViewModelBase.kt", l = {48}, m = "invokeSuspend")
public final class C6165qZ1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5955pZ1 e;
    public final /* synthetic */ C1709Or g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6165qZ1(C5955pZ1 c5955pZ1, C1709Or c1709Or, JM<? super C6165qZ1> jm) {
        super(2, jm);
        this.e = c5955pZ1;
        this.g = c1709Or;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6165qZ1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6165qZ1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            ReporterApi reporterApi = this.e.g;
            EnumC5028l80 enumC5028l80 = EnumC5028l80.I;
            long j = this.g.a;
            b.a aVar = b.e;
            C4434iZ1 c4434iZ1 = new C4434iZ1((int) b.r(j, R40.SECONDS));
            this.d = 1;
            if (reporterApi.f(enumC5028l80, c4434iZ1) == mn) {
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

package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: iz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsViewModel$onActivationButtonClicked$1", f = "IndicatorsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
public final class C4562iz0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C4782jz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4562iz0(C4782jz0 c4782jz0, JM<? super C4562iz0> jm) {
        super(2, jm);
        this.d = c4782jz0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4562iz0(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4562iz0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C4782jz0 c4782jz0 = this.d;
        ReporterApi reporterApi = c4782jz0.i;
        EnumC5028l80 enumC5028l80 = EnumC5028l80.y0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(reporterApi, enumC5028l80, new C1510Md1("Indicators:Summary"), null, 12);
        c4782jz0.h.a();
        return Unit.a;
    }
}

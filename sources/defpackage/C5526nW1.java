package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: nW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportViewModelBase$sendTransitionEvent$1", f = "SupportViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C5526nW1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public final /* synthetic */ C5316mW1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5526nW1(C5316mW1 c5316mW1, JM<? super C5526nW1> jm) {
        super(1, jm);
        this.d = c5316mW1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5526nW1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C5526nW1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        ReporterApi reporterApi = this.d.e;
        EnumC5028l80 enumC5028l80 = EnumC5028l80.l0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(reporterApi, enumC5028l80, new C1510Md1("support"), null, 12);
        return Unit.a;
    }
}

package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: py1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsViewModelBase$onInstructionClick$1", f = "RobotOptionsViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C6043py1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C5623ny1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6043py1(C5623ny1 c5623ny1, JM<? super C6043py1> jm) {
        super(2, jm);
        this.d = c5623ny1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6043py1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6043py1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C5623ny1 c5623ny1 = this.d;
        ReporterApi reporterApi = c5623ny1.i;
        EnumC5028l80 enumC5028l80 = EnumC5028l80.G;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(reporterApi, enumC5028l80, new C1510Md1("Trading Options"), VE.c(EnumC5326ma.e), 8);
        c5623ny1.g.a(c5623ny1.h.a(EnumC5404mv1.e), R.string.main_option_title);
        c5623ny1.d.b();
        return Unit.a;
    }
}

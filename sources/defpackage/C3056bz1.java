package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementViewModelBase$onMaxProfitChecked$1", f = "RobotRiskManagementViewModelBase.kt", l = {238}, m = "invokeSuspend")
public final class C3056bz1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C2360Wy1 e;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3056bz1(C2360Wy1 c2360Wy1, boolean z, JM<? super C3056bz1> jm) {
        super(1, jm);
        this.e = c2360Wy1;
        this.g = z;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3056bz1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C3056bz1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C2360Wy1 c2360Wy1 = this.e;
            boolean z = ((C7963z60) c2360Wy1.r.getValue()).a;
            boolean z2 = this.g;
            if (z) {
                ReporterApi.a.b(c2360Wy1.g, EnumC5028l80.N0, new C2074Ti1(z2 ? "on" : "off"), VE.c(EnumC5326ma.e), 8);
            }
            C2542Yy1 c2542Yy1 = new C2542Yy1(z2);
            this.d = 1;
            if (c2360Wy1.o.e(c2542Yy1, this) == mn) {
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

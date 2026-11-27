package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: qv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.bottomsheet_dialogs.RobotBottomSheetDialogsManagerBase$showMaximumProfitWasReachedBottomSheet$1", f = "RobotBottomSheetDialogsManagerBase.kt", l = {}, m = "invokeSuspend")
public final class C6244qv1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C6453rv1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;
    public final /* synthetic */ C2141Uf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6244qv1(C6453rv1 c6453rv1, String str, String str2, C2141Uf c2141Uf, JM jm) {
        super(2, jm);
        this.d = c6453rv1;
        this.e = str;
        this.g = str2;
        this.h = c2141Uf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6244qv1(this.d, this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6244qv1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C6453rv1 c6453rv1 = this.d;
        ReporterApi.a.b(c6453rv1.b, EnumC5028l80.q0, new C6472s10("Max profit was reached"), null, 12);
        new ProfitLimitBottomSheet(new C1606Ni1(this.e, this.g, this.h)).show(c6453rv1.a.getSupportFragmentManager(), C2017Sp1.a.b(ProfitLimitBottomSheet.class).f());
        return Unit.a;
    }
}

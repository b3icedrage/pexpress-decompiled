package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Fz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.shared.IndicatorsViewModelBase$showUnlockIndicatorsDialog$1", f = "IndicatorsViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C1030Fz0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C0718Bz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1030Fz0(C0718Bz0 c0718Bz0, JM<? super C1030Fz0> jm) {
        super(2, jm);
        this.d = c0718Bz0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1030Fz0(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1030Fz0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        this.d.h.e();
        return Unit.a;
    }
}

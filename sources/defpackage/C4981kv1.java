package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.asset_selection.RobotAssetSelectionViewModelBase$onTradingAssetClickSuccess$2", f = "RobotAssetSelectionViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C4981kv1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C5191lv1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4981kv1(C5191lv1 c5191lv1, JM<? super C4981kv1> jm) {
        super(2, jm);
        this.d = c5191lv1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4981kv1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4981kv1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        this.d.d.a();
        return Unit.a;
    }
}

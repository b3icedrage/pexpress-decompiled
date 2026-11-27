package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.asset_selection.RobotAssetSelectionViewModelBase$onTradingAssetClick$1", f = "RobotAssetSelectionViewModelBase.kt", l = {71}, m = "invokeSuspend")
public final class C4771jv1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5191lv1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4771jv1(C5191lv1 c5191lv1, JM<? super C4771jv1> jm) {
        super(1, jm);
        this.e = c5191lv1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C4771jv1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C4771jv1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            C5191lv1 c5191lv1 = this.e;
            c5191lv1.getClass();
            RV rv = C6266r20.a;
            Object objP = C5189lv.p(QV0.a, new C4981kv1(c5191lv1, null), this);
            if (objP != obj2) {
                objP = Unit.a;
            }
            if (objP == obj2) {
                return obj2;
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

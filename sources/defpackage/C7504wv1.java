package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: wv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.RobotCommonActionViewModelBase$retryStart$1", f = "RobotCommonActionViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C7504wv1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C7293vv1 d;
    public final /* synthetic */ EnumC4164hF1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7504wv1(C7293vv1 c7293vv1, EnumC4164hF1 enumC4164hF1, JM<? super C7504wv1> jm) {
        super(2, jm);
        this.d = c7293vv1;
        this.e = enumC4164hF1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7504wv1(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7504wv1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C7293vv1 c7293vv1 = this.d;
        if (c7293vv1.k.l().d.getValue() != this.e) {
            return Unit.a;
        }
        if (((Boolean) c7293vv1.d.B.d.getValue()).booleanValue()) {
            return Unit.a;
        }
        c7293vv1.m(false);
        return Unit.a;
    }
}

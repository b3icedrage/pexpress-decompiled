package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Dv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonFragment$addWithAnim$3", f = "RobotCommonFragment.kt", l = {}, m = "invokeSuspend")
public final class C0863Dv1 extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
    public /* synthetic */ boolean d;

    public C0863Dv1() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C0863Dv1 c0863Dv1 = new C0863Dv1(2, jm);
        c0863Dv1.d = ((Boolean) obj).booleanValue();
        return c0863Dv1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C0863Dv1) create(bool2, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d);
    }
}

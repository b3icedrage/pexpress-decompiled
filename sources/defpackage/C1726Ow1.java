package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: Ow1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.inapptutorial.RobotInAppTutorialManager$selectValueFromTutorialIfNeeded$1", f = "RobotInAppTutorialManager.kt", l = {}, m = "invokeSuspend")
public final class C1726Ow1 extends AW1 implements InterfaceC1138Hj0<Boolean, Object, Object, JM<Object>, Object> {
    public /* synthetic */ boolean d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object g;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.d ? this.g : this.e;
    }

    @Override // defpackage.InterfaceC1138Hj0
    public final Object l(Boolean bool, Object obj, Object obj2, JM<Object> jm) {
        boolean zBooleanValue = bool.booleanValue();
        C1726Ow1 c1726Ow1 = new C1726Ow1(4, jm);
        c1726Ow1.d = zBooleanValue;
        c1726Ow1.e = obj;
        c1726Ow1.g = obj2;
        return c1726Ow1.invokeSuspend(Unit.a);
    }
}

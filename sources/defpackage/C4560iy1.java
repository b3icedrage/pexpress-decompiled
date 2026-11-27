package defpackage;

import java.io.Serializable;
import kotlin.Unit;

/* JADX INFO: renamed from: iy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsViewModelBase$getValueByAccount$1", f = "RobotOptionsViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C4560iy1 extends AW1 implements InterfaceC1216Ij0<Object, Object, EnumC4164hF1, C6945uG, JM<Object>, Object> {
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ EnumC4164hF1 g;

    @Override // defpackage.InterfaceC1216Ij0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        C4560iy1 c4560iy1 = new C4560iy1(5, (JM) serializable);
        c4560iy1.d = obj;
        c4560iy1.e = obj2;
        c4560iy1.g = (EnumC4164hF1) obj3;
        return c4560iy1.invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.g == EnumC4164hF1.g ? this.d : this.e;
    }
}

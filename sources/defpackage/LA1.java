package defpackage;

import java.io.Serializable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.utils.RobotUtilsKt$getValueByAccount$1", f = "RobotUtils.kt", l = {}, m = "invokeSuspend")
public final class LA1 extends AW1 implements InterfaceC1216Ij0<Object, Object, EnumC4164hF1, C6945uG, JM<? super AbstractC6892u10<Object>>, Object> {
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ EnumC4164hF1 g;

    @Override // defpackage.InterfaceC1216Ij0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        LA1 la1 = new LA1(5, (JM) serializable);
        la1.d = obj;
        la1.e = obj2;
        la1.g = (EnumC4164hF1) obj3;
        return la1.invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.g == EnumC4164hF1.g ? new C6157qX(this.d) : new C2089Tn1(this.e);
    }
}

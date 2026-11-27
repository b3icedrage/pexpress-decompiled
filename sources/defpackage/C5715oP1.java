package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: oP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.StartGateWatchdogKt$watchStartGate$2", f = "StartGateWatchdog.kt", l = {}, m = "invokeSuspend")
public final class C5715oP1 extends AW1 implements InterfaceC1060Gj0<Boolean, Boolean, JM<? super Boolean>, Object> {
    public /* synthetic */ boolean d;
    public /* synthetic */ boolean e;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d && this.e);
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Boolean bool, Boolean bool2, JM<? super Boolean> jm) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C5715oP1 c5715oP1 = new C5715oP1(3, jm);
        c5715oP1.d = zBooleanValue;
        c5715oP1.e = zBooleanValue2;
        return c5715oP1.invokeSuspend(Unit.a);
    }
}

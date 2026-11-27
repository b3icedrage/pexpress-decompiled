package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: lR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.strategyselection.providers.StrategiesProviderBase$initShouldLockAndIsSelectedStrategyFlowCollector$1", f = "StrategiesProviderBase.kt", l = {}, m = "invokeSuspend")
public final class C5088lR1 extends AW1 implements InterfaceC1060Gj0<Boolean, EnumC2644a42, JM<? super Unit>, Object> {
    public /* synthetic */ EnumC2644a42 d;
    public final /* synthetic */ C5301mR1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5088lR1(C5301mR1 c5301mR1, JM<? super C5088lR1> jm) {
        super(3, jm);
        this.e = c5301mR1;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        EnumC2644a42 enumC2644a42 = this.d;
        C5301mR1 c5301mR1 = this.e;
        Iterable<C3496e42> iterable = (Iterable) c5301mR1.d.getValue();
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        for (C3496e42 c3496e42 : iterable) {
            arrayList.add(C3496e42.a(c3496e42, null, 0, null, false, enumC2644a42 == c3496e42.a, 61439));
        }
        GP1 gp1 = c5301mR1.d;
        gp1.getClass();
        gp1.m(null, arrayList);
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Boolean bool, EnumC2644a42 enumC2644a42, JM<? super Unit> jm) {
        bool.getClass();
        C5088lR1 c5088lR1 = new C5088lR1(this.e, jm);
        c5088lR1.d = enumC2644a42;
        return c5088lR1.invokeSuspend(Unit.a);
    }
}

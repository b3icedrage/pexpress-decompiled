package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.CryptoDemoTradesUpdater$closedDemoDeals$3", f = "CryptoDemoTradesUpdater.kt", l = {}, m = "invokeSuspend")
public final class ZP extends AW1 implements Function2<Set<? extends DF>, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ C3775fQ e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZP(C3775fQ c3775fQ, JM<? super ZP> jm) {
        super(2, jm);
        this.e = c3775fQ;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        ZP zp = new ZP(this.e, jm);
        zp.d = obj;
        return zp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Set<? extends DF> set, JM<? super Unit> jm) {
        return ((ZP) create(set, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        this.e.d = (Set) this.d;
        return Unit.a;
    }
}

package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.CryptoDemoTradesUpdater$closedDemoDeals$2", f = "CryptoDemoTradesUpdater.kt", l = {}, m = "invokeSuspend")
public final class YP extends AW1 implements InterfaceC1060Gj0<Set<? extends DF>, List<? extends DF>, JM<? super Set<? extends DF>>, Object> {
    public /* synthetic */ Set d;
    public /* synthetic */ List e;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return C5907pJ1.d(this.d, this.e);
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(Set<? extends DF> set, List<? extends DF> list, JM<? super Set<? extends DF>> jm) {
        YP yp = new YP(3, jm);
        yp.d = set;
        yp.e = list;
        return yp.invokeSuspend(Unit.a);
    }
}

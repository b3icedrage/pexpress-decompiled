package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: dQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.CryptoDemoTradesUpdater$start$3", f = "CryptoDemoTradesUpdater.kt", l = {}, m = "invokeSuspend")
public final class C3356dQ extends AW1 implements InterfaceC1216Ij0<FF, C6106qG, Long, Set<? extends DF>, JM<? super Boolean>, Object> {
    public /* synthetic */ FF d;
    public /* synthetic */ C6106qG e;
    public /* synthetic */ Long g;
    public /* synthetic */ Set h;

    @Override // defpackage.InterfaceC1216Ij0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        C3356dQ c3356dQ = new C3356dQ(5, (JM) serializable);
        c3356dQ.d = (FF) obj;
        c3356dQ.e = (C6106qG) obj2;
        c3356dQ.g = (Long) obj3;
        c3356dQ.h = (Set) obj4;
        return c3356dQ.invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        int i;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        FF ff = this.d;
        C6106qG c6106qG = this.e;
        Long l = this.g;
        Set set = this.h;
        if ((!ff.D && !ff.E) || !ff.J || c6106qG == null || c6106qG.f || l == null) {
            return Boolean.FALSE;
        }
        if (set == null || !set.isEmpty()) {
            Iterator it = set.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((DF) it.next()).b == l.longValue() && (i = i + 1) < 0) {
                    WE.k();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        return Boolean.valueOf(i >= ff.K);
    }
}

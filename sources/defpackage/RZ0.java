package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RZ0<T> implements InterfaceC7779yD1<T> {
    public final GZ0 a;
    public final M82<?, ?> b;
    public final boolean c;
    public final AbstractC1659Oa0<?> d;

    public RZ0(M82<?, ?> m82, AbstractC1659Oa0<?> abstractC1659Oa0, GZ0 gz0) {
        this.b = m82;
        this.c = abstractC1659Oa0.d(gz0);
        this.d = abstractC1659Oa0;
        this.a = gz0;
    }

    @Override // defpackage.InterfaceC7779yD1
    public final void b(T t) {
        this.b.d(t);
        this.d.e(t);
    }

    @Override // defpackage.InterfaceC7779yD1
    public final boolean c(T t) {
        this.d.b(t).e();
        return true;
    }

    @Override // defpackage.InterfaceC7779yD1
    public final void d(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1) {
        Class<?> cls = HD1.a;
        M82<?, ?> m82 = this.b;
        m82.f(abstractC0595Ak0, m82.e(m82.a(abstractC0595Ak0), m82.a(abstractC0595Ak1)));
        if (this.c) {
            HD1.x(this.d, abstractC0595Ak0, abstractC0595Ak1);
        }
    }

    @Override // defpackage.InterfaceC7779yD1
    public final void e(T t, InterfaceC5160ll2 interfaceC5160ll2) {
        Iterator itG = this.d.b(t).g();
        if (itG.hasNext()) {
            ((C0649Bc0.a) ((Map.Entry) itG.next()).getKey()).a();
            throw null;
        }
        M82<?, ?> m82 = this.b;
        m82.g(m82.a(t), interfaceC5160ll2);
    }

    @Override // defpackage.InterfaceC7779yD1
    public final int f(AbstractC0595Ak0 abstractC0595Ak0) {
        int iHashCode = this.b.a(abstractC0595Ak0).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.b(abstractC0595Ak0).a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.InterfaceC7779yD1
    public final int g(G0 g0) {
        M82<?, ?> m82 = this.b;
        int iC = m82.c(m82.a(g0));
        if (this.c) {
            YM1 ym1 = this.d.b(g0).a;
            if (ym1.e.size() > 0) {
                C0649Bc0.d(ym1.d(0));
                throw null;
            }
            Iterator<Map.Entry<Object, Object>> it = ym1.e().iterator();
            if (it.hasNext()) {
                C0649Bc0.d(it.next());
                throw null;
            }
        }
        return iC;
    }

    @Override // defpackage.InterfaceC7779yD1
    public final boolean h(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1) {
        M82<?, ?> m82 = this.b;
        if (!m82.a(abstractC0595Ak0).equals(m82.a(abstractC0595Ak1))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        AbstractC1659Oa0<?> abstractC1659Oa0 = this.d;
        return abstractC1659Oa0.b(abstractC0595Ak0).equals(abstractC1659Oa0.b(abstractC0595Ak1));
    }
}

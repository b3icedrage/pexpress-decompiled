package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SZ0<T> implements InterfaceC7989zD1<T> {
    public final IZ0 a;
    public final N82<?, ?> b;
    public final boolean c;
    public final AbstractC1737Pa0<?> d;

    public SZ0(N82<?, ?> n82, AbstractC1737Pa0<?> abstractC1737Pa0, IZ0 iz0) {
        this.b = n82;
        this.c = abstractC1737Pa0.e(iz0);
        this.d = abstractC1737Pa0;
        this.a = iz0;
    }

    @Override // defpackage.InterfaceC7989zD1
    public final void a(T t, T t2) {
        Class<?> cls = ID1.a;
        N82<?, ?> n82 = this.b;
        n82.o(t, n82.k(n82.g(t), n82.g(t2)));
        if (this.c) {
            ID1.k(this.d, t, t2);
        }
    }

    @Override // defpackage.InterfaceC7989zD1
    public final void b(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // defpackage.InterfaceC7989zD1
    public final boolean c(T t) {
        this.d.c(t).e();
        return true;
    }

    @Override // defpackage.InterfaceC7989zD1
    public final boolean d(AbstractC8097zk0 abstractC8097zk0, AbstractC8097zk0 abstractC8097zk1) {
        N82<?, ?> n82 = this.b;
        if (!n82.g(abstractC8097zk0).equals(n82.g(abstractC8097zk1))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        AbstractC1737Pa0<?> abstractC1737Pa0 = this.d;
        return abstractC1737Pa0.c(abstractC8097zk0).equals(abstractC1737Pa0.c(abstractC8097zk1));
    }

    @Override // defpackage.InterfaceC7989zD1
    public final void e(Object obj, FE fe, C1423La0 c1423La0) {
        N82<?, ?> n82 = this.b;
        P82 p82F = n82.f(obj);
        AbstractC1737Pa0<?> abstractC1737Pa0 = this.d;
        C0571Ac0<T> c0571Ac0D = abstractC1737Pa0.d(obj);
        while (fe.a() != Integer.MAX_VALUE) {
            try {
                FE fe2 = fe;
                C1423La0 c1423La1 = c1423La0;
                if (!j(fe2, c1423La1, abstractC1737Pa0, c0571Ac0D, n82, p82F)) {
                    return;
                }
                fe = fe2;
                c1423La0 = c1423La1;
            } finally {
                n82.n(obj, p82F);
            }
        }
    }

    @Override // defpackage.InterfaceC7989zD1
    public final int f(AbstractC8097zk0 abstractC8097zk0) {
        int iHashCode = this.b.g(abstractC8097zk0).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.c(abstractC8097zk0).a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.InterfaceC7989zD1
    public final int g(F0 f0) {
        N82<?, ?> n82 = this.b;
        int i = n82.i(n82.g(f0));
        if (this.c) {
            C2706aN1 c2706aN1 = this.d.c(f0).a;
            if (c2706aN1.d.size() > 0) {
                C0571Ac0.d(c2706aN1.d(0));
                throw null;
            }
            Iterator<T> it = c2706aN1.e().iterator();
            if (it.hasNext()) {
                C0571Ac0.d((Map.Entry) it.next());
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC7989zD1
    public final void h(T t, InterfaceC5373ml2 interfaceC5373ml2) {
        Iterator itG = this.d.c(t).g();
        if (itG.hasNext()) {
            ((C0571Ac0.a) ((Map.Entry) itG.next()).getKey()).a();
            throw null;
        }
        N82<?, ?> n82 = this.b;
        n82.q(n82.g(t), interfaceC5373ml2);
    }

    @Override // defpackage.InterfaceC7989zD1
    public final T i() {
        IZ0 iz0 = this.a;
        return iz0 instanceof AbstractC8097zk0 ? (T) ((AbstractC8097zk0) iz0).o() : (T) iz0.g().i();
    }

    public final boolean j(FE fe, C1423La0 c1423La0, AbstractC1737Pa0 abstractC1737Pa0, C0571Ac0 c0571Ac0, N82 n82, Object obj) throws C6724tC0 {
        int i = fe.b;
        IZ0 iz0 = this.a;
        if (i != 11) {
            if ((i & 7) != 2) {
                return fe.x();
            }
            AbstractC8097zk0.e eVarB = abstractC1737Pa0.b(c1423La0, iz0, i >>> 3);
            if (eVarB == null) {
                return n82.l(0, fe, obj);
            }
            abstractC1737Pa0.h(eVarB);
            throw null;
        }
        int iW = 0;
        AbstractC8097zk0.e eVarB2 = null;
        AbstractC1565Mw abstractC1565MwE = null;
        while (fe.a() != Integer.MAX_VALUE) {
            int i2 = fe.b;
            if (i2 == 16) {
                fe.w(0);
                iW = fe.a.w();
                eVarB2 = abstractC1737Pa0.b(c1423La0, iz0, iW);
            } else if (i2 == 26) {
                if (eVarB2 != null) {
                    abstractC1737Pa0.h(eVarB2);
                    throw null;
                }
                abstractC1565MwE = fe.e();
            } else if (!fe.x()) {
                break;
            }
        }
        if (fe.b != 12) {
            throw new C6724tC0("Protocol message end-group tag did not match expected tag.");
        }
        if (abstractC1565MwE == null) {
            return true;
        }
        if (eVarB2 == null) {
            n82.d(obj, iW, abstractC1565MwE);
            return true;
        }
        abstractC1737Pa0.i(eVarB2);
        throw null;
    }
}

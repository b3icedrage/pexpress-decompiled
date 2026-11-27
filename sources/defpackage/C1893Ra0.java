package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: Ra0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1893Ra0 extends AbstractC1737Pa0<AbstractC8097zk0.d> {
    @Override // defpackage.AbstractC1737Pa0
    public final void a(Map.Entry entry) {
        ((AbstractC8097zk0.d) entry.getKey()).getClass();
    }

    @Override // defpackage.AbstractC1737Pa0
    public final AbstractC8097zk0.e b(C1423La0 c1423La0, IZ0 iz0, int i) {
        c1423La0.getClass();
        return c1423La0.a.get(new C1423La0.a(i, iz0));
    }

    @Override // defpackage.AbstractC1737Pa0
    public final C0571Ac0<AbstractC8097zk0.d> c(Object obj) {
        return ((AbstractC8097zk0.c) obj).extensions;
    }

    @Override // defpackage.AbstractC1737Pa0
    public final C0571Ac0<AbstractC8097zk0.d> d(Object obj) {
        AbstractC8097zk0.c cVar = (AbstractC8097zk0.c) obj;
        C0571Ac0<AbstractC8097zk0.d> c0571Ac0 = cVar.extensions;
        if (c0571Ac0.b) {
            cVar.extensions = c0571Ac0.clone();
        }
        return cVar.extensions;
    }

    @Override // defpackage.AbstractC1737Pa0
    public final boolean e(IZ0 iz0) {
        return iz0 instanceof AbstractC8097zk0.c;
    }

    @Override // defpackage.AbstractC1737Pa0
    public final void f(Object obj) {
        ((AbstractC8097zk0.c) obj).extensions.h();
    }

    @Override // defpackage.AbstractC1737Pa0
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.AbstractC1737Pa0
    public final void h(Object obj) {
        throw null;
    }

    @Override // defpackage.AbstractC1737Pa0
    public final void i(Object obj) {
        throw null;
    }

    @Override // defpackage.AbstractC1737Pa0
    public final void j(Map.Entry entry) {
        ((AbstractC8097zk0.d) entry.getKey()).getClass();
        throw null;
    }
}

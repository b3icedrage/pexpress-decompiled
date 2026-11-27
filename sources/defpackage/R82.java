package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class R82 extends N82<P82, P82> {
    @Override // defpackage.N82
    public final void a(P82 p82, int i, int i2) {
        p82.c((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // defpackage.N82
    public final void b(P82 p82, int i, long j) {
        p82.c((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.N82
    public final void c(int i, Object obj, Object obj2) {
        ((P82) obj).c((i << 3) | 3, (P82) obj2);
    }

    @Override // defpackage.N82
    public final void d(P82 p82, int i, AbstractC1565Mw abstractC1565Mw) {
        p82.c((i << 3) | 2, abstractC1565Mw);
    }

    @Override // defpackage.N82
    public final void e(P82 p82, int i, long j) {
        p82.c(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.N82
    public final P82 f(Object obj) {
        AbstractC8097zk0 abstractC8097zk0 = (AbstractC8097zk0) obj;
        P82 p82 = abstractC8097zk0.unknownFields;
        if (p82 != P82.f) {
            return p82;
        }
        P82 p83 = new P82();
        abstractC8097zk0.unknownFields = p83;
        return p83;
    }

    @Override // defpackage.N82
    public final P82 g(Object obj) {
        return ((AbstractC8097zk0) obj).unknownFields;
    }

    @Override // defpackage.N82
    public final int h(P82 p82) {
        return p82.b();
    }

    @Override // defpackage.N82
    public final int i(P82 p82) {
        P82 p83 = p82;
        int i = p83.d;
        if (i != -1) {
            return i;
        }
        int iW = 0;
        for (int i2 = 0; i2 < p83.a; i2++) {
            int i3 = p83.b[i2] >>> 3;
            iW += GE.w(3, (AbstractC1565Mw) p83.c[i2]) + GE.D(i3) + GE.C(2) + (GE.C(1) * 2);
        }
        p83.d = iW;
        return iW;
    }

    @Override // defpackage.N82
    public final void j(Object obj) {
        P82 p82 = ((AbstractC8097zk0) obj).unknownFields;
        if (p82.e) {
            p82.e = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.N82
    public final P82 k(Object obj, Object obj2) {
        P82 p82 = (P82) obj;
        P82 p83 = (P82) obj2;
        P82 p84 = P82.f;
        if (p84.equals(p83)) {
            return p82;
        }
        if (p84.equals(p82)) {
            int i = p82.a + p83.a;
            int[] iArrCopyOf = Arrays.copyOf(p82.b, i);
            System.arraycopy(p83.b, 0, iArrCopyOf, p82.a, p83.a);
            Object[] objArrCopyOf = Arrays.copyOf(p82.c, i);
            System.arraycopy(p83.c, 0, objArrCopyOf, p82.a, p83.a);
            return new P82(i, iArrCopyOf, objArrCopyOf, true);
        }
        p82.getClass();
        if (p83.equals(p84)) {
            return p82;
        }
        if (!p82.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = p82.a + p83.a;
        p82.a(i2);
        System.arraycopy(p83.b, 0, p82.b, p82.a, p83.a);
        System.arraycopy(p83.c, 0, p82.c, p82.a, p83.a);
        p82.a = i2;
        return p82;
    }

    @Override // defpackage.N82
    public final P82 m() {
        return new P82();
    }

    @Override // defpackage.N82
    public final void n(Object obj, P82 p82) {
        ((AbstractC8097zk0) obj).unknownFields = p82;
    }

    @Override // defpackage.N82
    public final void o(Object obj, P82 p82) {
        ((AbstractC8097zk0) obj).unknownFields = p82;
    }

    @Override // defpackage.N82
    public final P82 p(Object obj) {
        P82 p82 = (P82) obj;
        if (p82.e) {
            p82.e = false;
        }
        return p82;
    }

    @Override // defpackage.N82
    public final void q(P82 p82, InterfaceC5373ml2 interfaceC5373ml2) {
        P82 p83 = p82;
        p83.getClass();
        interfaceC5373ml2.getClass();
        for (int i = 0; i < p83.a; i++) {
            int i2 = p83.b[i] >>> 3;
            Object obj = p83.c[i];
            KE ke = (KE) interfaceC5373ml2;
            ke.getClass();
            boolean z = obj instanceof AbstractC1565Mw;
            GE ge = ke.a;
            if (z) {
                ge.U(i2, (AbstractC1565Mw) obj);
            } else {
                ge.T(i2, (IZ0) obj);
            }
        }
    }

    @Override // defpackage.N82
    public final void r(P82 p82, InterfaceC5373ml2 interfaceC5373ml2) {
        p82.d(interfaceC5373ml2);
    }
}

package defpackage;

/* JADX INFO: renamed from: eV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3581eV0 extends N71.a {
    public static final N71<C3581eV0> h;
    public double e = 0.0d;
    public double g = 0.0d;

    static {
        N71<C3581eV0> n71A = N71.a(64, new C3581eV0());
        h = n71A;
        n71A.f = 0.5f;
    }

    public static C3581eV0 b(double d, double d2) {
        C3581eV0 c3581eV0 = (C3581eV0) h.b();
        c3581eV0.e = d;
        c3581eV0.g = d2;
        return c3581eV0;
    }

    public static void c(C3581eV0 c3581eV0) {
        h.c(c3581eV0);
    }

    @Override // N71.a
    public final N71.a a() {
        return new C3581eV0();
    }

    public final String toString() {
        return "MPPointD, x: " + this.e + ", y: " + this.g;
    }
}

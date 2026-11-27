package defpackage;

/* JADX INFO: renamed from: fV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3791fV0 extends N71.a {
    public static final N71<C3791fV0> h;
    public float e;
    public float g;

    static {
        N71<C3791fV0> n71A = N71.a(32, new C3791fV0(0));
        h = n71A;
        n71A.f = 0.5f;
    }

    public C3791fV0() {
    }

    public static C3791fV0 b(float f, float f2) {
        C3791fV0 c3791fV0 = (C3791fV0) h.b();
        c3791fV0.e = f;
        c3791fV0.g = f2;
        return c3791fV0;
    }

    public static void c(C3791fV0 c3791fV0) {
        h.c(c3791fV0);
    }

    @Override // N71.a
    public final N71.a a() {
        return new C3791fV0(0);
    }

    public C3791fV0(int i) {
        this.e = 0.0f;
        this.g = 0.0f;
    }
}

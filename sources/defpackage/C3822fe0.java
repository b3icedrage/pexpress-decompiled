package defpackage;

/* JADX INFO: renamed from: fe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3822fe0 extends AbstractC5550nd1 {
    public final C6416rk0 a;

    public C3822fe0(C6416rk0 c6416rk0) {
        this.a = c6416rk0;
    }

    @Override // defpackage.AbstractC5550nd1
    public final boolean a() {
        C6416rk0 c6416rk0 = this.a;
        if (!c6416rk0.F()) {
            return false;
        }
        if (c6416rk0.B() > 0 || c6416rk0.A() > 0) {
            return true;
        }
        return c6416rk0.E() && c6416rk0.D().A();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class JQ0 extends M {
    public final IQ0 a = new IQ0();
    public final int b;
    public boolean c;

    public JQ0(int i) {
        this.b = i;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final boolean a() {
        return true;
    }

    @Override // defpackage.InterfaceC2024Ss
    public final C1946Rs c(N20 n20) {
        if (n20.h) {
            if (this.a.b == null) {
                return null;
            }
            AbstractC1634Ns abstractC1634NsF = n20.h().f();
            this.c = (abstractC1634NsF instanceof C1349Kb1) || (abstractC1634NsF instanceof IQ0);
            return C1946Rs.a(n20.e);
        }
        int i = n20.g;
        int i2 = this.b;
        if (i >= i2) {
            return new C1946Rs(-1, false, n20.c + i2);
        }
        return null;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final boolean e(AbstractC1634Ns abstractC1634Ns) {
        if (!this.c) {
            return true;
        }
        AbstractC1634Ns abstractC1634Ns2 = (AbstractC1634Ns) this.a.a;
        if (!(abstractC1634Ns2 instanceof AQ0)) {
            return true;
        }
        ((AQ0) abstractC1634Ns2).f = false;
        return true;
    }

    @Override // defpackage.InterfaceC2024Ss
    public final AbstractC1634Ns f() {
        return this.a;
    }
}

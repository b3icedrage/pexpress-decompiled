package defpackage;

/* JADX INFO: renamed from: rU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6358rU0 implements DU0.b {
    public final /* synthetic */ DU0 a;
    public final /* synthetic */ float b;

    public /* synthetic */ C6358rU0(DU0 du0, float f) {
        this.a = du0;
        this.b = f;
    }

    @Override // DU0.b
    public final void run() {
        DU0 du0 = this.a;
        C3788fU0 c3788fU0 = du0.d;
        float f = this.b;
        if (c3788fU0 == null) {
            du0.k.add(new C6358rU0(du0, f));
            return;
        }
        float fD = C7099v01.d(c3788fU0.k, c3788fU0.l, f);
        MU0 mu0 = du0.e;
        mu0.k(mu0.n, fD);
    }
}

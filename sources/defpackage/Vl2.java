package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Vl2 extends AbstractRunnableC7477wm2 {
    public final /* synthetic */ Wl2 e;

    public Vl2(Wl2 wl2) {
        this.e = wl2;
    }

    @Override // defpackage.AbstractRunnableC7477wm2
    public final void b() {
        Xl2 xl2 = this.e.a;
        xl2.b.a("unlinkToDeath", new Object[0]);
        xl2.n.asBinder().unlinkToDeath(xl2.k, 0);
        xl2.n = null;
        xl2.g = false;
    }
}

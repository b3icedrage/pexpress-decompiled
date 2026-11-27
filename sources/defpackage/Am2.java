package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Am2 extends AbstractRunnableC7477wm2 {
    public final /* synthetic */ Xl2 e;

    public Am2(Xl2 xl2) {
        this.e = xl2;
    }

    @Override // defpackage.AbstractRunnableC7477wm2
    public final void b() {
        synchronized (this.e.f) {
            try {
                if (this.e.l.get() > 0 && this.e.l.decrementAndGet() > 0) {
                    this.e.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                Xl2 xl2 = this.e;
                if (xl2.n != null) {
                    xl2.b.a("Unbind from service.", new Object[0]);
                    Xl2 xl3 = this.e;
                    xl3.a.unbindService(xl3.m);
                    Xl2 xl4 = this.e;
                    xl4.g = false;
                    xl4.n = null;
                    xl4.m = null;
                }
                this.e.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

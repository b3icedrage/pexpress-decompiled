package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qn2 extends hn2 {
    public final /* synthetic */ yn2 e;

    public qn2(yn2 yn2Var) {
        this.e = yn2Var;
    }

    @Override // defpackage.hn2
    public final void a() {
        synchronized (this.e.f) {
            try {
                if (this.e.k.get() > 0 && this.e.k.decrementAndGet() > 0) {
                    this.e.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                yn2 yn2Var = this.e;
                if (yn2Var.m != null) {
                    yn2Var.b.c("Unbind from service.", new Object[0]);
                    yn2 yn2Var2 = this.e;
                    yn2Var2.a.unbindService(yn2Var2.l);
                    yn2 yn2Var3 = this.e;
                    yn2Var3.g = false;
                    yn2Var3.m = null;
                    yn2Var3.l = null;
                }
                this.e.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wn2 extends hn2 {
    public final /* synthetic */ xn2 e;

    public wn2(xn2 xn2Var) {
        this.e = xn2Var;
    }

    @Override // defpackage.hn2
    public final void a() {
        yn2 yn2Var = this.e.a;
        yn2Var.b.c("unlinkToDeath", new Object[0]);
        yn2Var.m.asBinder().unlinkToDeath(yn2Var.j, 0);
        yn2Var.m = null;
        yn2Var.g = false;
    }
}

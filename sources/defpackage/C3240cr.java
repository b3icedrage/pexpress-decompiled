package defpackage;

/* JADX INFO: renamed from: cr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3240cr extends C5494nM implements InterfaceC5062lJ {
    @Override // defpackage.InterfaceC5062lJ
    public final void k(HS0 hs0) {
        n("Setting up default configuration.");
        C7167vK c7167vK = new C7167vK();
        c7167vK.j(hs0);
        c7167vK.j = "console";
        C3141cO0 c3141cO0 = new C3141cO0();
        c3141cO0.j(hs0);
        C3588eX1 c3588eX1 = new C3588eX1();
        c3588eX1.i = new C0711Bx("HH:mm:ss.SSS");
        c3588eX1.j = new QY1();
        c3588eX1.e = hs0;
        c3588eX1.start();
        c3141cO0.h = c3588eX1;
        c7167vK.n = c3141cO0;
        c7167vK.start();
        hs0.d("ROOT").b(c7167vK);
    }
}

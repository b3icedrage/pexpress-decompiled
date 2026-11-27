package defpackage;

/* JADX INFO: renamed from: pT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5935pT extends AbstractC3946gD {
    public C0711Bx h;

    public C5935pT() {
        super(0);
        this.h = null;
    }

    @Override // defpackage.AbstractC3946gD
    public final String d(QS0 qs0) {
        return this.h.a(qs0.b());
    }

    @Override // defpackage.AbstractC3946gD, defpackage.InterfaceC7183vP0
    public final void start() {
        String strH = h();
        if (strH == null) {
            strH = "yyyy-MM-dd HH:mm:ss,SSS";
        }
        if (strH.equals("ISO8601")) {
            strH = "yyyy-MM-dd HH:mm:ss,SSS";
        }
        try {
            this.h = new C0711Bx(strH);
        } catch (IllegalArgumentException e) {
            String strConcat = "Could not instantiate SimpleDateFormat with pattern ".concat(strH);
            C5494nM c5494nM = this.d;
            c5494nM.o(new Ff2(strConcat, e, 1, c5494nM.g));
            this.h = new C0711Bx("yyyy-MM-dd HH:mm:ss,SSS");
        }
    }
}

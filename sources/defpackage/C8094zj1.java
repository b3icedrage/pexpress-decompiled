package defpackage;

/* JADX INFO: renamed from: zj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8094zj1 extends AbstractC3946gD {
    public String h;

    public C8094zj1() {
        super(0);
    }

    @Override // defpackage.AbstractC3946gD
    public final String d(QS0 qs0) {
        String str = (String) qs0.f().e.get(this.h);
        return str != null ? str : System.getProperty(this.h);
    }

    @Override // defpackage.AbstractC3946gD, defpackage.InterfaceC7183vP0
    public final void start() {
        String strH = h();
        if (strH != null) {
            this.h = strH;
            this.e = true;
        }
    }
}

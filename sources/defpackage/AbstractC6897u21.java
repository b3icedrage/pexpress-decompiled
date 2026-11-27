package defpackage;

/* JADX INFO: renamed from: u21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6897u21 extends AbstractC3946gD {
    public InterfaceC7096v h;

    public AbstractC6897u21() {
        super(0);
        this.h = null;
    }

    @Override // defpackage.AbstractC3946gD
    public final String d(QS0 qs0) {
        String strM = m(qs0);
        InterfaceC7096v interfaceC7096v = this.h;
        return interfaceC7096v == null ? strM : interfaceC7096v.a(strM);
    }

    public abstract String m(InterfaceC6237qt0 interfaceC6237qt0);

    @Override // defpackage.AbstractC3946gD, defpackage.InterfaceC7183vP0
    public final void start() {
        String strH = h();
        if (strH != null) {
            try {
                int i = Integer.parseInt(strH);
                if (i == 0) {
                    this.h = new C8056za();
                } else if (i > 0) {
                    this.h = new C6159qX1(i);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}

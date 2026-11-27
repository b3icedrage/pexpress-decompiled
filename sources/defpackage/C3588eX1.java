package defpackage;

/* JADX INFO: renamed from: eX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3588eX1 extends AbstractC2932bO0<InterfaceC6237qt0> {
    public C0711Bx i;
    public QY1 j;

    @Override // defpackage.AbstractC2932bO0
    public final String q(QS0 qs0) {
        if (!this.h) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.i.a(qs0.b()));
        sb.append(" [");
        sb.append(qs0.l());
        sb.append("] ");
        sb.append(qs0.getLevel().e);
        sb.append(" ");
        sb.append(qs0.c());
        sb.append(" - ");
        sb.append(qs0.d());
        sb.append(C3766fN.a);
        if (qs0.h() != null) {
            sb.append(this.j.d(qs0));
        }
        return sb.toString();
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void start() {
        this.j.start();
        this.h = true;
    }
}

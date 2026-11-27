package defpackage;

/* JADX INFO: renamed from: gD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3946gD implements InterfaceC7183vP0, InterfaceC5284mM {
    public final C5494nM d = new C5494nM(this);
    public boolean e = false;
    public final /* synthetic */ int g;

    public AbstractC3946gD(int i) {
        this.g = i;
    }

    public final void a(String str) {
        this.d.l(str);
    }

    public final void c(String str, Throwable th) {
        this.d.m(str, th);
    }

    public String d(QS0 qs0) {
        return i(qs0, new StringBuilder().toString());
    }

    public final String h() {
        return null;
    }

    public abstract String i(QS0 qs0, String str);

    @Override // defpackage.InterfaceC7183vP0
    public final boolean isStarted() {
        return this.e;
    }

    @Override // defpackage.InterfaceC5284mM
    public final void j(HS0 hs0) {
        this.d.j(hs0);
    }

    public final void l(StringBuilder sb, QS0 qs0) {
        sb.append(d(qs0));
    }

    @Override // defpackage.InterfaceC7183vP0
    public void start() {
        this.e = true;
    }

    @Override // defpackage.InterfaceC7183vP0
    public void stop() {
        this.e = false;
    }

    public String toString() {
        switch (this.g) {
            case 1:
                return "CompositeConverter<>";
            default:
                return super.toString();
        }
    }
}

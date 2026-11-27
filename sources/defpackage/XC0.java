package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class XC0 implements InterfaceC5331mb0<WC0> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final C4948kl0 b;
    public final InterfaceC1531Mk1<O3> c;
    public final InterfaceC1531Mk1<InterfaceC2152Ui1> d;
    public final InterfaceC1531Mk1<RT0> e;

    public XC0(InterfaceC1531Mk1 interfaceC1531Mk1, C4948kl0 c4948kl0, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = interfaceC1531Mk1;
        this.b = c4948kl0;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new WC0(this.a.get(), (U22) this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

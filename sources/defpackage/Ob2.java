package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Ob2 implements InterfaceC5331mb0<Kb2> {
    public final C0742Ch0 a;
    public final InterfaceC1531Mk1<C3224cm> b;
    public final C0609Ap c;
    public final InterfaceC1531Mk1<C4923kf> d;
    public final WT1 e;

    public Ob2(C0742Ch0 c0742Ch0, InterfaceC1531Mk1 interfaceC1531Mk1, C0609Ap c0609Ap, InterfaceC1531Mk1 interfaceC1531Mk2, WT1 wt1) {
        this.a = c0742Ch0;
        this.b = interfaceC1531Mk1;
        this.c = c0609Ap;
        this.d = interfaceC1531Mk2;
        this.e = wt1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new Kb2((Ya2) this.a.get(), this.b.get(), (InterfaceC4833kC1) this.c.get(), this.d.get(), (K22) this.e.get());
    }
}

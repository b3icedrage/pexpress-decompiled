package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class TB1 implements InterfaceC5541nb0<SB1> {
    public final GD1 a;
    public final InterfaceC1531Mk1<String> b;

    public TB1(GD1 gd1, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = gd1;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new SB1(new Cm2(), new C2432Xo(), (U80) W80.a.a.get(), (FD1) this.a.get(), this.b);
    }
}

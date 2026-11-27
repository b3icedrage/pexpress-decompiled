package defpackage;

/* JADX INFO: renamed from: Tx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2118Tx0 implements InterfaceC5331mb0<C2040Sx0> {
    public final InterfaceC1531Mk1<AbstractC5463nB1> a;
    public final OW b;
    public final InterfaceC1531Mk1<InterfaceC5213m10> c;

    public C2118Tx0(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = interfaceC1531Mk1;
        this.b = ow;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C2040Sx0(this.c.get(), this.a.get(), (InterfaceC3951gE1) this.b.get());
    }
}

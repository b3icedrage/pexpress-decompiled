package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class I22 implements InterfaceC5331mb0<H22> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final InterfaceC1531Mk1<AbstractC7004uZ1> b;
    public final InterfaceC1531Mk1<J22> c;
    public final InterfaceC1531Mk1<NQ> d;
    public final InterfaceC1531Mk1<AbstractC2199Uy0> e;
    public final C1763Pj f;
    public final C3216ck g;

    public I22(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, C1763Pj c1763Pj, C3216ck c3216ck) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = interfaceC1531Mk5;
        this.f = c1763Pj;
        this.g = c3216ck;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new H22(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), (AbstractC1787Pr) this.f.get(), (AbstractC2783ak) this.g.get());
    }
}

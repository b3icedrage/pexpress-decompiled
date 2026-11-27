package defpackage;

/* JADX INFO: renamed from: tT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6775tT0 implements InterfaceC5331mb0<C6355rT0> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final InterfaceC1531Mk1<C1281Jf> b;
    public final W6 c;
    public final InterfaceC1531Mk1<C4612j90> d;
    public final InterfaceC1531Mk1<InterfaceC6516sD> e;
    public final InterfaceC1531Mk1<InterfaceC4358iA0> f;
    public final InterfaceC1531Mk1<InterfaceC7012ub2> g;
    public final InterfaceC1531Mk1<InterfaceC1777Pn1> h;

    public C6775tT0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, W6 w6, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = w6;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
        this.g = interfaceC1531Mk6;
        this.h = interfaceC1531Mk7;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C6355rT0(this.a.get(), this.b.get(), (U6) this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}

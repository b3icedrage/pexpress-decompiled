package defpackage;

/* JADX INFO: renamed from: Tu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2110Tu1 implements InterfaceC5331mb0<C1798Pu1> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final InterfaceC1531Mk1<InterfaceC0704Bu1> b;
    public final InterfaceC1531Mk1<InterfaceC4315hz1> c;
    public final InterfaceC1531Mk1<InterfaceC3493e4> d;
    public final InterfaceC1531Mk1<O3> e;
    public final InterfaceC1531Mk1<EQ> f;
    public final InterfaceC1531Mk1<C4617jA1> g;

    public C2110Tu1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = interfaceC1531Mk5;
        this.f = interfaceC1531Mk6;
        this.g = interfaceC1531Mk7;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C1798Pu1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), (S3) U3.a.a.get(), this.e.get(), this.f.get(), this.g.get());
    }
}

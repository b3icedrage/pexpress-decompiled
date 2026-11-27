package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class LG implements InterfaceC5331mb0<KG> {
    public final InterfaceC1531Mk1<InterfaceC1900Rc1> a;
    public final InterfaceC1531Mk1<InterfaceC3509e8> b;
    public final InterfaceC1531Mk1<InterfaceC3546eJ1> c;
    public final InterfaceC1531Mk1<InterfaceC0720Ca> d;
    public final InterfaceC1531Mk1<C4966kq1> e;

    public LG(InterfaceC1531Mk1<InterfaceC1900Rc1> interfaceC1531Mk1, InterfaceC1531Mk1<InterfaceC3509e8> interfaceC1531Mk2, InterfaceC1531Mk1<InterfaceC3546eJ1> interfaceC1531Mk3, InterfaceC1531Mk1<InterfaceC0720Ca> interfaceC1531Mk4, InterfaceC1531Mk1<C4966kq1> interfaceC1531Mk5) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = interfaceC1531Mk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new KG(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

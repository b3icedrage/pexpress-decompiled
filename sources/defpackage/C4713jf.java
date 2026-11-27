package defpackage;

/* JADX INFO: renamed from: jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4713jf implements InterfaceC5331mb0<C4245hf> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final InterfaceC1531Mk1<InterfaceC1777Pn1> b;
    public final InterfaceC1531Mk1<InterfaceC3706f42> c;
    public final InterfaceC1531Mk1<O3> d;

    public C4713jf(InterfaceC1531Mk1<C4923kf> interfaceC1531Mk1, InterfaceC1531Mk1<InterfaceC1777Pn1> interfaceC1531Mk2, InterfaceC1531Mk1<InterfaceC3706f42> interfaceC1531Mk3, InterfaceC1531Mk1<O3> interfaceC1531Mk4) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C4245hf(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}

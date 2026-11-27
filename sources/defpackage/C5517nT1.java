package defpackage;

/* JADX INFO: renamed from: nT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5517nT1 implements InterfaceC5331mb0<C4416iT1> {
    public final InterfaceC1531Mk1<C0854Ds1> a;
    public final InterfaceC1531Mk1<US1> b;
    public final C8114zp c;
    public final M5 d;
    public final InterfaceC1531Mk1<QT1> e;

    public C5517nT1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C8114zp c8114zp, M5 m5, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = c8114zp;
        this.d = m5;
        this.e = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C4416iT1(this.a.get(), this.b.get(), (InterfaceC3786fT1) this.c.get(), (VS1) this.d.get(), this.e.get());
    }
}

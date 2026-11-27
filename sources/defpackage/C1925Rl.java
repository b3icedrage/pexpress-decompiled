package defpackage;

/* JADX INFO: renamed from: Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1925Rl implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1454Lk1 e;

    public C1925Rl(C0609Ap c0609Ap, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.d = c0609Ap;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.e = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C1847Ql((C5253mB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.e).get(), (InterfaceC1547Mq) this.c.get(), (AbstractC5045lD0) this.d.get());
            default:
                return new II1((InterfaceC4833kC1) ((C0609Ap) this.d).get(), (C4923kf) this.b.get(), (InterfaceC7864ye1) this.c.get(), (InterfaceC7444we1) this.e.get());
        }
    }

    public C1925Rl(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.b = interfaceC1531Mk1;
        this.e = ow;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }
}

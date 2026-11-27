package defpackage;

/* JADX INFO: renamed from: Ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0750Ck implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ C0750Ck(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC5331mb0;
        this.e = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0672Bk((InterfaceC5570ni1) ((InterfaceC1454Lk1) this.b).get(), (M3) this.e, (InterfaceC5889pD1) ((InterfaceC1454Lk1) this.c).get(), (InterfaceC7170vL) this.d.get());
            case 1:
                return new C3224cm((InterfaceC7007ua1) ((C7904yp) this.b).get(), (InterfaceC7864ye1) this.c.get(), (InterfaceC4833kC1) ((C0609Ap) this.d).get(), (InterfaceC7444we1) this.e.get());
            default:
                return new C1263Iz((RL0) this.b.get(), (C4612j90) this.c.get(), (ZL0) ((C2926bM0) this.d).get(), (InterfaceC1131Hh) ((C2147Uh) this.e).get());
        }
    }

    public C0750Ck(InterfaceC1454Lk1 interfaceC1454Lk1, M3 m3, InterfaceC1454Lk1 interfaceC1454Lk2, InterfaceC1454Lk1 interfaceC1454Lk3) {
        this.a = 0;
        this.b = interfaceC1454Lk1;
        this.e = m3;
        this.c = interfaceC1454Lk2;
        this.d = interfaceC1454Lk3;
    }
}

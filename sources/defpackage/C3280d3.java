package defpackage;

/* JADX INFO: renamed from: d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3280d3 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1454Lk1 c;

    public /* synthetic */ C3280d3(int i, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.c = interfaceC1454Lk1;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3070c3((InterfaceC3350dO) ((C3979gO) this.c).get(), (C4612j90) this.b.get());
            case 1:
                return new C5538na1((C4923kf) this.b.get(), (Pa2) this.c.get());
            default:
                return new C2957bW1((InterfaceC5313mV1) this.c.get(), (InterfaceC4833kC1) ((C0609Ap) this.b).get());
        }
    }

    public C3280d3(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = 1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1454Lk1;
    }
}

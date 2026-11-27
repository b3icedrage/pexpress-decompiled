package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class WM0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ WM0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new VM0((C4923kf) this.b.get(), (InterfaceC2421Xk0) ((C2788al0) this.c).get());
            case 1:
                return new XU0((InterfaceC0715By0) this.b.get(), (C6348rR) ((M4) this.c).get());
            case 2:
                return new C3839fi1((C4923kf) this.b.get(), (InterfaceC3431dl0) ((C6091qB) this.c).get());
            default:
                return new NR1((InterfaceC1442Lg1) this.b.get(), (InterfaceC0565Aa0) this.c.get());
        }
    }
}

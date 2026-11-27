package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class J5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ J5(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new I5((U5) this.b.get(), (InterfaceC7748y5) this.c.get(), (InterfaceC5862p6) this.d.get());
            default:
                return new CI((C4923kf) this.b.get(), (InterfaceC5482nI) this.c.get(), (AbstractC5045lD0) this.d.get());
        }
    }
}

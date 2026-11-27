package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class VM implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ VM(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new UM((InterfaceC7816yQ) this.b.get(), (EQ) this.c.get());
            default:
                return new G50((C4923kf) this.b.get(), (Oc2) this.c.get());
        }
    }
}

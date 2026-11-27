package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class M5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final OW b;
    public final InterfaceC1531Mk1 c;

    public M5(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.b = ow;
        this.c = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new L5((C5253mB1) this.c.get(), (InterfaceC3951gE1) this.b.get());
            default:
                return new WS1((C5253mB1) this.c.get(), (InterfaceC3951gE1) this.b.get());
        }
    }

    public M5(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow) {
        this.c = interfaceC1531Mk1;
        this.b = ow;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class SC0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ SC0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new RC0((C4617jA1) this.b.get(), (KQ) this.c.get(), (CA) this.d.get());
            case 1:
                return new C6530sH1((C4923kf) this.b.get(), (C5698oK) this.c.get(), (O3) this.d.get());
            default:
                return new C4875kQ1((C4923kf) this.b.get(), (InterfaceC3170cY) this.c.get(), new C3501e6(), (InterfaceC5862p6) this.d.get());
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class IQ implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ IQ(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HQ((C4923kf) this.b.get(), (O3) this.c.get(), (AbstractC2167Un1) this.d.get(), (InterfaceC7816yQ) this.e.get());
            default:
                return new UC0((C4617jA1) this.b.get(), (QC0) this.c.get(), (InterfaceC3360dR0) this.d.get(), (C6348rR) ((M4) this.e).get(), new C7061uo0());
        }
    }
}

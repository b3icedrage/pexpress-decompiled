package defpackage;

/* JADX INFO: renamed from: vT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7196vT1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public C7196vT1(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, C4024gc0 c4024gc0) {
        this.c = ow;
        this.b = interfaceC1531Mk1;
        this.d = c4024gc0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C6986uT1((InterfaceC3951gE1) ((OW) this.c).get(), (C5253mB1) this.b.get(), (DT1) ((C4024gc0) this.d).get());
            default:
                return new Li2((InterfaceC1442Lg1) this.b.get(), (C4923kf) this.c.get(), (O3) this.d.get(), new C5829ox0());
        }
    }

    public C7196vT1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }
}

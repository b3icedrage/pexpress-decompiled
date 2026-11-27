package defpackage;

/* JADX INFO: renamed from: b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2881b8 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ C2881b8(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
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
                return new C2657a8((C4923kf) this.b.get(), (O3) this.c.get(), (InterfaceC4824k92) this.d.get(), (L32) this.e.get());
            case 1:
                return new C6522sF((InterfaceC5213m10) this.b.get(), (AbstractC5463nB1) this.c.get(), (InterfaceC3951gE1) ((OW) this.e).get(), (AbstractC2903bE1) this.d.get());
            default:
                return new C4228ha2((C6102qE1) ((InterfaceC1454Lk1) this.b).get(), (InterfaceC5889pD1) ((InterfaceC1454Lk1) this.c).get(), (InterfaceC4430iY0) ((InterfaceC1454Lk1) this.d).get(), (EK1) ((InterfaceC1454Lk1) this.e).get());
        }
    }

    public C2881b8(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = 1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.e = ow;
        this.d = interfaceC1531Mk3;
    }
}

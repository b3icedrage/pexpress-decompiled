package defpackage;

/* JADX INFO: renamed from: Zo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2589Zo0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;

    public /* synthetic */ C2589Zo0(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1531Mk1;
        this.d = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2511Yo0((C6102qE1) this.b.get(), (InterfaceC5889pD1) ((InterfaceC1454Lk1) this.c).get(), (InterfaceC5049lE1) ((InterfaceC1454Lk1) this.d).get(), (EK1) ((InterfaceC1454Lk1) this.e).get(), (InterfaceC1153Ho0) ((InterfaceC1454Lk1) this.f).get());
            default:
                return new PV1((InterfaceC4890kV1) ((IT1) this.b).get(), (IV1) this.c.get(), (WA) this.d.get(), (InterfaceC0565Aa0) this.e.get(), (AbstractC2903bE1) this.f.get());
        }
    }
}

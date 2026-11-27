package defpackage;

/* JADX INFO: renamed from: Ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0594Ak implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1454Lk1 c;
    public final InterfaceC1454Lk1 d;

    public /* synthetic */ C0594Ak(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, InterfaceC1454Lk1 interfaceC1454Lk3, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1454Lk2;
        this.d = interfaceC1454Lk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C8096zk((InterfaceC1153Ho0) this.b.get(), (InterfaceC7011ub1) this.c.get(), (R42) this.d.get());
            case 1:
                return new C1465Lo0((InterfaceC5889pD1) this.b.get(), (EK1) this.c.get(), (InterfaceC5570ni1) this.d.get());
            default:
                return new C3819fd1((InterfaceC5889pD1) this.b.get(), (EK1) this.c.get(), (C3903g11) this.d.get());
        }
    }
}

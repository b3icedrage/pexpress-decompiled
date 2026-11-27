package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class RD implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1454Lk1 c;

    public /* synthetic */ RD(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1454Lk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new QD((M8) this.b.get(), (InterfaceC5321mY0) this.c.get());
            default:
                return new C6409ri1((InterfaceC5889pD1) this.b.get(), (EK1) this.c.get());
        }
    }
}

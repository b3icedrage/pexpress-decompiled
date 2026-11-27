package defpackage;

/* JADX INFO: renamed from: Jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1296Jk implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C1296Jk(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C1218Ik((InterfaceC0836Dm1) this.b.get());
            default:
                return new C2677aE((M8) this.b.get());
        }
    }
}

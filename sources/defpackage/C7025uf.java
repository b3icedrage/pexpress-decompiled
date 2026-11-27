package defpackage;

/* JADX INFO: renamed from: uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7025uf implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C7025uf(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4923kf((AbstractC3900g02) this.b.get());
            default:
                return new C1678Og1((ES) this.b.get());
        }
    }
}

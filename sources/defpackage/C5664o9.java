package defpackage;

/* JADX INFO: renamed from: o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5664o9 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C5664o9(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5454n9((M8) this.b.get());
            case 1:
                return new C1845Qk0((C4966kq1) this.b.get());
            default:
                return new Ha2((M8) this.b.get());
        }
    }
}

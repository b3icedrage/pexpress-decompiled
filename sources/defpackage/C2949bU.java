package defpackage;

/* JADX INFO: renamed from: bU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2949bU implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C2949bU(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2725aU((InterfaceC7195vT0) this.b.get());
            default:
                return new C6274r40((C5253mB1) this.b.get());
        }
    }
}

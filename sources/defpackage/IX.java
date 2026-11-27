package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class IX implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ IX(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HX((InterfaceC1442Lg1) this.b.get());
            default:
                return new C4652jM0((InterfaceC1442Lg1) this.b.get());
        }
    }
}

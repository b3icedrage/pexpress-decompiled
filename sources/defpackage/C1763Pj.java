package defpackage;

/* JADX INFO: renamed from: Pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1763Pj implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C1763Pj(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C1685Oj((InterfaceC1442Lg1) this.b.get());
            case 1:
                return new C1943Rr((InterfaceC1442Lg1) this.b.get());
            case 2:
                return new C5678oD0((InterfaceC1442Lg1) this.b.get());
            case 3:
                return new AM0((InterfaceC1442Lg1) this.b.get());
            default:
                return new B92((L32) this.b.get());
        }
    }
}

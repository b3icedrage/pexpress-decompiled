package defpackage;

/* JADX INFO: renamed from: Vc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2212Vc1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C2212Vc1(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2134Uc1((InterfaceC1442Lg1) this.b.get());
            default:
                return new C7654xe1((Pa2) this.b.get());
        }
    }
}

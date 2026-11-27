package defpackage;

/* JADX INFO: renamed from: bM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2926bM0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C2926bM0(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2702aM0((InterfaceC1442Lg1) this.b.get());
            case 1:
                return new C1436Le1((Pa2) this.b.get());
            default:
                return new DE1((InterfaceC1442Lg1) this.b.get());
        }
    }
}

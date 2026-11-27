package defpackage;

/* JADX INFO: renamed from: cj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3214cj1 implements InterfaceC5331mb0<C2494Yi1> {
    public final InterfaceC1531Mk1<InterfaceC1442Lg1> a;
    public final InterfaceC1531Mk1<C4923kf> b;

    public C3214cj1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C2494Yi1(this.a.get(), new InterfaceC2152Ui1.b(), new InterfaceC2152Ui1.c(), new InterfaceC2152Ui1.a(), this.b.get());
    }
}

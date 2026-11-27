package defpackage;

/* JADX INFO: renamed from: s92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6506s92 implements InterfaceC5331mb0<C5877p92> {
    public final InterfaceC1531Mk1<InterfaceC1442Lg1> a;

    public C6506s92(InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C5877p92(this.a.get(), new InterfaceC4824k92.a(), new InterfaceC4824k92.b());
    }
}

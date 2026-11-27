package defpackage;

/* JADX INFO: renamed from: pz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6046pz1 implements InterfaceC5331mb0<C5836oz1> {
    public final M3 a;
    public final InterfaceC1531Mk1<InterfaceC4619jB0> b;
    public final C1395Kr c;

    public C6046pz1(M3 m3, InterfaceC1531Mk1 interfaceC1531Mk1, C1395Kr c1395Kr) {
        this.a = m3;
        this.b = interfaceC1531Mk1;
        this.c = c1395Kr;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C5836oz1((MU) this.a.get(), this.b.get(), (InterfaceC5614nv1) this.c.get());
    }
}

package defpackage;

/* JADX INFO: renamed from: gO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3979gO implements InterfaceC5331mb0<C3769fO> {
    public final InterfaceC1531Mk1<RL0> a;
    public final InterfaceC1531Mk1<C4612j90> b;
    public final C2147Uh c;
    public final InterfaceC1531Mk1<C4923kf> d;

    public C3979gO(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C2147Uh c2147Uh, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = c2147Uh;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C3769fO(this.a.get(), this.b.get(), (InterfaceC1131Hh) this.c.get(), this.d.get());
    }
}

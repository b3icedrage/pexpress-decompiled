package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class KB1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final M4 c;

    public /* synthetic */ KB1(InterfaceC1531Mk1 interfaceC1531Mk1, M4 m4, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = m4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new JB1((InterfaceC0715By0) this.b.get(), (C6348rR) this.c.get());
            default:
                return new C6977uQ1((InterfaceC0715By0) this.b.get(), (C6348rR) this.c.get());
        }
    }
}

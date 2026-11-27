package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class HC0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ HC0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new GC0((C4617jA1) this.b.get(), (O3) this.c.get(), (EQ) this.d.get());
            default:
                return new C2455Xv1((C4923kf) this.b.get(), (InterfaceC4315hz1) this.c.get(), (C4617jA1) this.d.get());
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Y3 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ Y3(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new X3((YD1) this.b.get(), (InterfaceC7248vi0) this.c.get());
            default:
                return new C2414Xi((C6201qi2) this.b.get(), (Pa2) this.c.get());
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class N6 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ N6(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new M6((InterfaceC6890u02) ((C7263vm) this.b).get());
            default:
                return new EX((InterfaceC2773ah1) this.b.get(), new C5027l8());
        }
    }
}

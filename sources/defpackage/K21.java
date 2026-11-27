package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class K21 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC5331mb0 b;

    public /* synthetic */ K21(InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new J21((MU) ((M3) this.b).get());
            default:
                return new XQ1(new C7652xe(), (AL1) ((D11) this.b).get());
        }
    }
}

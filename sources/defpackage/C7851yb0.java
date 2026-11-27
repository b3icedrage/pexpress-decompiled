package defpackage;

/* JADX INFO: renamed from: yb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7851yb0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C7851yb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7641xb0((InterfaceC4209hU1) ((C3557eN0) this.b).get());
            case 1:
                InterfaceC1612Nk1<W42> interfaceC1612Nk1 = ((C5130le0) this.b).d;
                C0957Fb.h(interfaceC1612Nk1, "Cannot return null from a non-@Nullable @Provides method");
                return interfaceC1612Nk1;
            default:
                return new B21((MU) ((M3) this.b).get());
        }
    }
}

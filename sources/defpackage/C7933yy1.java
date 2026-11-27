package defpackage;

/* JADX INFO: renamed from: yy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7933yy1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C7933yy1(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7723xy1((C4923kf) this.b.get(), new D6());
            case 1:
                return new C4632jF1((C4923kf) this.b.get());
            default:
                return new Ah2((C5253mB1) this.b.get());
        }
    }
}

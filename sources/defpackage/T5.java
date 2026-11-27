package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class T5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ T5(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new S5((K5) this.b.get(), (VQ1) this.c.get(), (InterfaceC2718aR1) this.d.get());
            default:
                return new C6960uL((EK1) ((InterfaceC1454Lk1) this.b).get(), (InterfaceC7170vL) ((InterfaceC1454Lk1) this.c).get(), (M8) ((InterfaceC1454Lk1) this.d).get());
        }
    }
}

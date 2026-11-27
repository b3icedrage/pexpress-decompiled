package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class WT1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC5331mb0 d;

    public WT1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C7904yp c7904yp) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = c7904yp;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new VT1((GT1) ((IT1) this.d).get(), (QT1) this.b.get(), (KT1) this.c.get());
            default:
                return new M22((Vg2) this.b.get(), (C3836fh2) this.c.get(), (InterfaceC7007ua1) ((C7904yp) this.d).get());
        }
    }

    public WT1(IT1 it1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.d = it1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }
}

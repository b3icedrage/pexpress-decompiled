package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class G40 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ G40(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new F40((C4966kq1) this.b.get(), (InterfaceC1767Pk0) this.c.get(), (InterfaceC7012ub2) this.d.get(), (C4923kf) this.e.get());
            default:
                return new C5301mR1((C4923kf) this.b.get(), (EQ) this.c.get(), (MR1) this.d.get(), (InterfaceC0565Aa0) this.e.get());
        }
    }
}

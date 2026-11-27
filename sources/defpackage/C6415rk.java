package defpackage;

/* JADX INFO: renamed from: rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6415rk implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC5331mb0 d;

    public C6415rk(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.b = interfaceC1531Mk1;
        this.d = ow;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C6206qk((C4923kf) this.b.get(), (C4943kk) this.c.get(), (InterfaceC3985gQ) ((C5083lQ) this.d).get());
            case 1:
                return new C4314hz0((InterfaceC5213m10) this.c.get(), (AbstractC5463nB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.d).get());
            default:
                return new DQ1((InterfaceC3371dV) ((C3320dE) this.d).get(), (MP) OP.a.a.get(), (C4617jA1) this.b.get(), (AbstractC6925u91) this.c.get());
        }
    }

    public C6415rk(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C5083lQ c5083lQ) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = c5083lQ;
    }

    public C6415rk(C3320dE c3320dE, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.d = c3320dE;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }
}

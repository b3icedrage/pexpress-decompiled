package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class IB1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final C3523eC b;
    public final C4948kl0 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;
    public final C3557eN0 g;
    public final InterfaceC5331mb0 h;

    public /* synthetic */ IB1(C3523eC c3523eC, C4948kl0 c4948kl0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, C3557eN0 c3557eN0, InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = c3523eC;
        this.c = c4948kl0;
        this.d = interfaceC1531Mk1;
        this.e = interfaceC1531Mk2;
        this.f = interfaceC1531Mk3;
        this.g = c3557eN0;
        this.h = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HB1((InterfaceC6444rs1) this.b.get(), (InterfaceC4270hl0) this.c.get(), (C4953km1) this.d.get(), (C3556eN) this.e.get(), (AbstractC7949z22) this.f.get(), (InterfaceC4209hU1) this.g.get(), (JB1) ((KB1) this.h).get());
            default:
                return new C6767tQ1((InterfaceC6444rs1) this.b.get(), (InterfaceC4270hl0) this.c.get(), (C4953km1) this.d.get(), (C3556eN) this.e.get(), (AbstractC7949z22) this.f.get(), (InterfaceC4209hU1) this.g.get(), (C6977uQ1) ((KB1) this.h).get());
        }
    }
}

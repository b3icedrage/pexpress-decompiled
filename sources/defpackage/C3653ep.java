package defpackage;

/* JADX INFO: renamed from: ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3653ep implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final C3523eC b;
    public final C4948kl0 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final C3557eN0 f;
    public final InterfaceC1531Mk1 g;
    public final InterfaceC5331mb0 h;

    public C3653ep(C3523eC c3523eC, C4948kl0 c4948kl0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk2, C3557eN0 c3557eN0, C4073gp c4073gp) {
        this.b = c3523eC;
        this.c = c4948kl0;
        this.d = interfaceC1531Mk1;
        this.g = interfaceC1454Lk1;
        this.e = interfaceC1531Mk2;
        this.f = c3557eN0;
        this.h = c4073gp;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3443dp((InterfaceC6444rs1) this.b.get(), (InterfaceC4270hl0) this.c.get(), (C4953km1) this.d.get(), (C3556eN) this.e.get(), (AbstractC7949z22) this.g.get(), (InterfaceC4209hU1) this.f.get(), (C3863fp) ((C4073gp) this.h).get());
            default:
                return new C6278r50((InterfaceC6444rs1) this.b.get(), (InterfaceC4270hl0) this.c.get(), (C4953km1) this.d.get(), (C3556eN) ((InterfaceC1454Lk1) this.g).get(), (AbstractC7949z22) this.e.get(), (InterfaceC4209hU1) this.f.get(), (C6488s50) ((C4073gp) this.h).get());
        }
    }

    public C3653ep(C3523eC c3523eC, C4948kl0 c4948kl0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, C3557eN0 c3557eN0, C4073gp c4073gp) {
        this.b = c3523eC;
        this.c = c4948kl0;
        this.d = interfaceC1531Mk1;
        this.e = interfaceC1531Mk2;
        this.g = interfaceC1531Mk3;
        this.f = c3557eN0;
        this.h = c4073gp;
    }
}

package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ZU1 implements InterfaceC5331mb0<YU1> {
    public final C4176hJ1 a;
    public final C3523eC b;
    public final C4948kl0 c;
    public final InterfaceC1531Mk1<C4953km1> d;
    public final InterfaceC1531Mk1<AbstractC7949z22> e;
    public final C3557eN0 f;
    public final C2290Wb0 g;

    public ZU1(C4176hJ1 c4176hJ1, C3523eC c3523eC, C4948kl0 c4948kl0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C3557eN0 c3557eN0, C2290Wb0 c2290Wb0) {
        this.a = c4176hJ1;
        this.b = c3523eC;
        this.c = c4948kl0;
        this.d = interfaceC1531Mk1;
        this.e = interfaceC1531Mk2;
        this.f = c3557eN0;
        this.g = c2290Wb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new YU1((Set) this.a.get(), (InterfaceC6444rs1) this.b.get(), (InterfaceC4270hl0) this.c.get(), this.d.get(), this.e.get(), (InterfaceC4209hU1) this.f.get(), (C2730aV1) this.g.get());
    }
}

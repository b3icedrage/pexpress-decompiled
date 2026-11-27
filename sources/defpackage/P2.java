package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class P2 implements InterfaceC5331mb0<O2> {
    public final InterfaceC1531Mk1<C5253mB1> a;
    public final OW b;
    public final InterfaceC1531Mk1<YX> c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC1531Mk1<ReporterApi> e;
    public final InterfaceC1531Mk1<C4923kf> f;
    public final InterfaceC1531Mk1<C6355rT0> g;
    public final InterfaceC1531Mk1<C4612j90> h;
    public final InterfaceC1531Mk1<AbstractC2903bE1> i;

    public P2(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7) {
        this.a = interfaceC1531Mk1;
        this.b = ow;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1454Lk1;
        this.e = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
        this.g = interfaceC1531Mk5;
        this.h = interfaceC1531Mk6;
        this.i = interfaceC1531Mk7;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new O2(this.a.get(), (InterfaceC3951gE1) this.b.get(), this.c.get(), (Fj2) this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}

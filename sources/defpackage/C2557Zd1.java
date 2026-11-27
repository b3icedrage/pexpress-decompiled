package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Zd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2557Zd1 implements InterfaceC5331mb0<C2479Yd1> {
    public final InterfaceC1531Mk1<Y71> a;
    public final OW b;
    public final InterfaceC1531Mk1<YX> c;
    public final InterfaceC1531Mk1<AbstractC5463nB1> d;
    public final InterfaceC1531Mk1<ReporterApi> e;
    public final InterfaceC1531Mk1<InterfaceC5862p6> f;
    public final InterfaceC1531Mk1<C4923kf> g;

    public C2557Zd1(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6) {
        this.a = interfaceC1531Mk1;
        this.b = ow;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
        this.g = interfaceC1531Mk6;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C2479Yd1(this.a.get(), (InterfaceC3951gE1) this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}

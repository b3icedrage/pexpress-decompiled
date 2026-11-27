package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Au1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0626Au1 implements InterfaceC5331mb0<C8131zu1> {
    public final InterfaceC1531Mk1<ReporterApi> a;
    public final InterfaceC1531Mk1<C4923kf> b;
    public final C6630sl0 c;
    public final InterfaceC1531Mk1<O3> d;
    public final InterfaceC1531Mk1<InterfaceC2152Ui1> e;
    public final InterfaceC1531Mk1<RT0> f;

    public C0626Au1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C6630sl0 c6630sl0, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = c6630sl0;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C8131zu1(this.a.get(), this.b.get(), new C3069c22(), (Lc2) this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}

package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Az1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0641Az1 implements InterfaceC5331mb0<C7936yz1> {
    public final InterfaceC1531Mk1<ReporterApi> a;
    public final W5 b;
    public final C1395Kr c;
    public final InterfaceC1531Mk1<InterfaceC4619jB0> d;
    public final InterfaceC1531Mk1<InterfaceC4878kR1> e;
    public final InterfaceC1531Mk1<MR1> f;

    public C0641Az1(InterfaceC1531Mk1 interfaceC1531Mk1, W5 w5, C1395Kr c1395Kr, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = interfaceC1531Mk1;
        this.b = w5;
        this.c = c1395Kr;
        this.d = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C7936yz1(this.a.get(), (InterfaceC6675sz1) this.b.get(), (InterfaceC5614nv1) this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}

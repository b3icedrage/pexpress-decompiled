package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class A52 implements InterfaceC5331mb0<C7961z52> {
    public final InterfaceC1531Mk1<C5253mB1> a;
    public final OW b;
    public final InterfaceC1531Mk1<AbstractC5045lD0> c;
    public final InterfaceC1531Mk1<ReporterApi> d;

    public A52(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = interfaceC1531Mk1;
        this.b = ow;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C7961z52(this.a.get(), (InterfaceC3951gE1) this.b.get(), this.c.get(), this.d.get());
    }
}

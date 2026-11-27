package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class CR1 implements InterfaceC5331mb0<BR1> {
    public final Z2 a;
    public final InterfaceC1531Mk1<InterfaceC6350rR1> b;
    public final InterfaceC1531Mk1<ReporterApi> c;
    public final InterfaceC1531Mk1<MR1> d;

    public CR1(Z2 z2, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = z2;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new BR1((InterfaceC7401wR1) this.a.get(), this.b.get(), this.c.get(), new C3069c22(), this.d.get());
    }
}

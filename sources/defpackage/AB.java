package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class AB implements InterfaceC5331mb0<C7981zB> {
    public final WQ a;
    public final InterfaceC1531Mk1<ReporterApi> b;
    public final InterfaceC1531Mk1<InterfaceC3541eI> c;
    public final InterfaceC1531Mk1<C6753tM> d;

    public AB(WQ wq, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = wq;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C7981zB((InterfaceC1923Rk0) this.a.get(), this.b.get(), this.c.get(), this.d.get(), new C5727oT1());
    }
}

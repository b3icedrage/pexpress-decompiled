package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class QR1 implements InterfaceC5331mb0<PR1> {
    public final C3534eF1 a;
    public final InterfaceC1531Mk1<InterfaceC4878kR1> b;
    public final InterfaceC1531Mk1<InterfaceC6350rR1> c;
    public final InterfaceC1531Mk1<ReporterApi> d;
    public final InterfaceC1531Mk1<MR1> e;

    public QR1(C3534eF1 c3534eF1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = c3534eF1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new PR1((JR1) this.a.get(), this.b.get(), this.c.get(), this.d.get(), new RR1(), this.e.get());
    }
}

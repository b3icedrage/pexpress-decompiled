package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class M3 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;

    public /* synthetic */ M3(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new L3((C4923kf) this.b.get(), (M2) this.c.get(), (ReporterApi) this.d.get(), (C7105v2) this.e.get(), (InterfaceC5862p6) this.f.get());
            case 1:
                return new NU((AbstractC5463nB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.f).get(), (InterfaceC5213m10) this.c.get(), (YX) this.d.get(), (InterfaceC5862p6) this.e.get());
            case 2:
                return new C3378dX0((C4923kf) this.b.get(), (ReporterApi) this.c.get(), (C5358mi) ((C6617si) this.f).get(), (InterfaceC5862p6) this.d.get(), (MF1) this.e.get());
            default:
                return new W92((C6102qE1) ((InterfaceC1454Lk1) this.b).get(), (InterfaceC5889pD1) ((InterfaceC1454Lk1) this.c).get(), (EK1) ((InterfaceC1454Lk1) this.d).get(), (InterfaceC3432dl1) ((InterfaceC1454Lk1) this.e).get(), (InterfaceC5570ni1) ((InterfaceC1454Lk1) this.f).get());
        }
    }

    public M3(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C6617si c6617si, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = 2;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.f = c6617si;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    public M3(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = 1;
        this.b = interfaceC1531Mk1;
        this.f = ow;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }
}

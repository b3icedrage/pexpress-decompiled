package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: xA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7560xA1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC5331mb0 f;

    public C7560xA1(IT1 it1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.f = it1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7349wA1((C5253mB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.f).get(), (InterfaceC5213m10) this.c.get(), (ReporterApi) this.d.get(), (YX) this.e.get());
            default:
                return new C6572sV1((InterfaceC4890kV1) ((IT1) this.f).get(), (C4923kf) this.b.get(), (InterfaceC1192Ib0) this.c.get(), (ReporterApi) this.d.get(), (C4422iV1) this.e.get());
        }
    }

    public C7560xA1(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.b = interfaceC1531Mk1;
        this.f = ow;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }
}

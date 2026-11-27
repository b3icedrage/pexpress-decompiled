package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: nz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5625nz0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC5331mb0 f;
    public final InterfaceC1531Mk1 g;

    public C5625nz0(VM vm, IX ix, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = ix;
        this.g = vm;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4782jz0((InterfaceC4104gz0) ((C6415rk) this.f).get(), (InterfaceC2460Xx0) this.b.get(), (AbstractC7949z22) this.c.get(), (AbstractC2199Uy0) this.d.get(), (ReporterApi) this.e.get(), (XE1) this.g.get());
            default:
                return new C3165cW0((C4923kf) this.b.get(), (InterfaceC4399iO) this.c.get(), (ReporterApi) this.d.get(), (InterfaceC3579eU1) this.e.get(), (GX) ((IX) this.f).get(), (OM) ((VM) this.g).get());
        }
    }

    public C5625nz0(C6415rk c6415rk, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.f = c6415rk;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.g = interfaceC1531Mk5;
    }
}

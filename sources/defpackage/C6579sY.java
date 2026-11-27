package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: sY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6579sY implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC5331mb0 f;
    public final InterfaceC5331mb0 g;

    public C6579sY(VM vm, IX ix, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.f = ix;
        this.g = vm;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C6369rY((C4923kf) this.b.get(), (InterfaceC8087zh2) ((C7933yy1) this.f).get(), (Q21) this.c.get(), (ReporterApi) this.d.get(), (L21) ((C6448ru) this.g).get(), (C4612j90) this.e.get());
            default:
                return new C5118lb0((C4923kf) this.b.get(), (ReporterApi) this.c.get(), (InterfaceC7012ub2) this.d.get(), (GX) ((IX) this.f).get(), (OM) ((VM) this.g).get(), (InterfaceC4399iO) this.e.get());
        }
    }

    public C6579sY(InterfaceC1531Mk1 interfaceC1531Mk1, C7933yy1 c7933yy1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, C6448ru c6448ru, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.b = interfaceC1531Mk1;
        this.f = c7933yy1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.g = c6448ru;
        this.e = interfaceC1531Mk4;
    }
}

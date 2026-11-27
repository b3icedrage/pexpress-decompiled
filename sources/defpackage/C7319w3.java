package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7319w3 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final XK1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ C7319w3(InterfaceC1531Mk1 interfaceC1531Mk1, XK1 xk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = xk1;
        this.d = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7109v3((M2) this.b.get(), (VK1) this.c.get(), (ReporterApi) this.d.get(), (C4923kf) this.e.get());
            default:
                return new G4((M2) this.b.get(), (VK1) this.c.get(), (C4909kb1) this.d.get(), (InterfaceC3880fu1) this.e.get());
        }
    }
}

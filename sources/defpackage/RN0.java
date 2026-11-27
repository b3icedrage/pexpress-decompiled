package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: loaded from: classes.dex */
public final class RN0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC5331mb0 f;
    public final InterfaceC5331mb0 g;

    public RN0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, XK1 xk1, C5038lB c5038lB, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.f = xk1;
        this.g = c5038lB;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ON0((IM0) this.b.get(), (C3348dN0) this.c.get(), (C3977gN0) this.d.get(), (VK1) ((XK1) this.f).get(), (C2879b71) ((C5038lB) this.g).get(), (K61) this.e.get());
            default:
                return new C0980Fi1((C4923kf) this.b.get(), (InterfaceC1211Ih1) this.c.get(), (InterfaceC7776yC1) ((BC1) this.f).get(), (InterfaceC6638sn0) ((C1062Gk) this.g).get(), new C4860kL1(), (ReporterApi) this.d.get(), (InterfaceC5862p6) this.e.get(), new C5888pD0());
        }
    }

    public RN0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, BC1 bc1, C1062Gk c1062Gk, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.f = bc1;
        this.g = c1062Gk;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }
}

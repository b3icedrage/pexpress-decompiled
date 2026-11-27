package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: Ch0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0742Ch0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC5331mb0 f;
    public final InterfaceC5331mb0 g;
    public final InterfaceC1531Mk1 h;
    public final InterfaceC5331mb0 i;

    public C0742Ch0(C7904yp c7904yp, InterfaceC1531Mk1 interfaceC1531Mk1, C6091qB c6091qB, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, C0609Ap c0609Ap) {
        this.f = c7904yp;
        this.b = interfaceC1531Mk1;
        this.g = c6091qB;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.h = interfaceC1531Mk5;
        this.i = c0609Ap;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0664Bh0((C1273Jc0) ((C7616xT0) this.f).get(), (TK1) this.b.get(), (ReporterApi) this.c.get(), (VK1) ((XK1) this.g).get(), (InterfaceC4358iA0) this.d.get(), (InterfaceC7012ub2) this.e.get(), (InterfaceC7931yy) ((C1338Jy) this.h).get(), (EB) ((HB) this.i).get());
            default:
                return new C2750ab2((InterfaceC7007ua1) ((C7904yp) this.f).get(), (C4923kf) this.b.get(), (NX) ((C6091qB) this.g).get(), (InterfaceC7864ye1) this.c.get(), (InterfaceC7444we1) this.d.get(), (Vg2) this.e.get(), (C3836fh2) this.h.get(), (InterfaceC4833kC1) ((C0609Ap) this.i).get());
        }
    }

    public C0742Ch0(C7616xT0 c7616xT0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, XK1 xk1, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, C1338Jy c1338Jy, HB hb) {
        this.f = c7616xT0;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.g = xk1;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.h = c1338Jy;
        this.i = hb;
    }
}

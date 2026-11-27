package defpackage;

import com.impl.feature.webpageinapp.screens.termsandconditions.BotTermsAndConditionsFragmentImpl;

/* JADX INFO: renamed from: Kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1401Kt implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC5331mb0 e;
    public final InterfaceC1531Mk1 f;
    public final InterfaceC1531Mk1 g;

    public C1401Kt(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, E2 e2, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.e = ow;
        this.b = interfaceC1531Mk1;
        this.f = e2;
        this.g = interfaceC1454Lk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new BotTermsAndConditionsFragmentImpl((Sd2) ((OW) this.e).get(), new C7175vM1(), (Pa2) this.b.get(), (C6755tM1) ((E2) this.f).get(), (C7386wM1) ((InterfaceC1454Lk1) this.g).get(), (Ch2) this.c.get(), (C6201qi2) this.d.get());
            default:
                return new C3670eu1((Ki2) this.b.get(), (InterfaceC4548iu1) this.c.get(), new C5829ox0(), (VK1) ((XK1) this.e).get(), (C4909kb1) this.d.get(), (InterfaceC6312rF) this.f.get(), (InterfaceC3880fu1) this.g.get());
        }
    }

    public C1401Kt(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, XK1 xk1, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.e = xk1;
        this.d = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
        this.g = interfaceC1531Mk5;
    }
}

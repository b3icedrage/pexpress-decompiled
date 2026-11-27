package defpackage;

import com.impl.feature.webpageinapp.screens.termsandconditions.PlatformTermsAndConditionsWebViewFragmentImpl;

/* JADX INFO: loaded from: classes.dex */
public final class WQ implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC5331mb0 d;
    public final InterfaceC5331mb0 e;
    public final InterfaceC1531Mk1 f;
    public final InterfaceC1531Mk1 g;

    public WQ(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C5470nE c5470nE, C3320dE c3320dE, C4948kl0 c4948kl0, VM vm) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = c5470nE;
        this.e = c3320dE;
        this.f = c4948kl0;
        this.g = vm;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new VQ((C4923kf) this.b.get(), (O3) this.c.get(), (AbstractC2327Wn1) ((C5470nE) this.d).get(), (AbstractC6366rX) ((C3320dE) this.e).get(), (U22) ((C4948kl0) this.f).get(), (OM) ((VM) this.g).get());
            case 1:
                return new C2317Wk0((InterfaceC1131Hh) ((C2147Uh) this.d).get(), (C4923kf) this.b.get(), (AbstractC5045lD0) this.c.get(), (AbstractC5468nD0) ((C1763Pj) this.e).get(), (AbstractC3947gD0) this.f.get(), (InterfaceC3541eI) this.g.get());
            default:
                return new PlatformTermsAndConditionsWebViewFragmentImpl((Sd2) ((OW) this.d).get(), new C7175vM1(), (Pa2) this.b.get(), (C1828Qe1) ((CV0) this.e).get(), (PX1) this.c.get(), (Ch2) this.f.get(), (C6201qi2) this.g.get());
        }
    }

    public WQ(C2147Uh c2147Uh, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C1763Pj c1763Pj, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.d = c2147Uh;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.e = c1763Pj;
        this.f = interfaceC1531Mk3;
        this.g = interfaceC1531Mk4;
    }

    public WQ(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, CV0 cv0, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.d = ow;
        this.b = interfaceC1531Mk1;
        this.e = cv0;
        this.c = interfaceC1531Mk2;
        this.f = interfaceC1531Mk3;
        this.g = interfaceC1531Mk4;
    }
}

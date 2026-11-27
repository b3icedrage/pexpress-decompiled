package defpackage;

import com.impl.feature.webpageinapp.screens.privacypolicy.BotPrivacyPolicyFragmentImpl;

/* JADX INFO: renamed from: It, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1245It implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1454Lk1 f;
    public final InterfaceC5331mb0 g;

    public C1245It(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, C1763Pj c1763Pj, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.f = interfaceC1454Lk1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.g = c1763Pj;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new BotPrivacyPolicyFragmentImpl((Sd2) ((OW) this.f).get(), new C7175vM1(), (Pa2) this.b.get(), (C6755tM1) ((E2) this.g).get(), (C7386wM1) this.c.get(), (Ch2) this.d.get(), (C6201qi2) this.e.get());
            default:
                return new C5191lv1((InterfaceC2452Xu1) this.f.get(), (AbstractC7004uZ1) this.b.get(), (AbstractC7949z22) this.c.get(), (J22) this.d.get(), (AbstractC1787Pr) ((C1763Pj) this.g).get(), (AbstractC4892kW0) this.e.get());
        }
    }

    public C1245It(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, E2 e2, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.f = ow;
        this.b = interfaceC1531Mk1;
        this.g = e2;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }
}

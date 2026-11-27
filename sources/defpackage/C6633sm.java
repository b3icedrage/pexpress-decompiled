package defpackage;

import com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;

/* JADX INFO: renamed from: sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6633sm implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final OW c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;
    public final InterfaceC1531Mk1 g;
    public final InterfaceC5331mb0 h;
    public final InterfaceC1531Mk1 i;
    public final InterfaceC1531Mk1 j;

    public C6633sm(OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, DV0 dv0, InterfaceC1531Mk1 interfaceC1531Mk5, C1997Sj c1997Sj, C4219hY c4219hY) {
        this.c = ow;
        this.b = interfaceC1531Mk1;
        this.d = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
        this.h = dv0;
        this.g = interfaceC1531Mk5;
        this.i = c1997Sj;
        this.j = c4219hY;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new AuthorizationFragmentImpl((Sd2) this.c.get(), (InterfaceC1455Ll) this.b.get(), (InterfaceC6843tm) this.d.get(), (C7178vN1) this.e.get(), (C7599xN1) this.f.get(), (C5289mN1) ((DV0) this.h).get(), (C3296d7) this.g.get(), (InterfaceC3728fA0) ((C1997Sj) this.i).get(), (InterfaceC8112zo0) ((C4219hY) this.j).get());
            default:
                return new WithdrawFragmentImpl((Pa2) this.b.get(), (Sd2) this.c.get(), (Bj2) ((C2666aA0) this.h).get(), (Mj2) this.d.get(), (Oj2) this.e.get(), (C6201qi2) this.f.get(), (Ch2) this.g.get(), (InterfaceC2773ah1) this.i.get(), (C3296d7) this.j.get());
        }
    }

    public C6633sm(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, C2666aA0 c2666aA0, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7) {
        this.b = interfaceC1531Mk1;
        this.c = ow;
        this.h = c2666aA0;
        this.d = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
        this.g = interfaceC1531Mk5;
        this.i = interfaceC1531Mk6;
        this.j = interfaceC1531Mk7;
    }
}

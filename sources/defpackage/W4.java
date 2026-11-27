package defpackage;

import com.impl.feature.platform.screens.verification.AccountVerificationFragmentImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class W4 implements InterfaceC5331mb0<AccountVerificationFragmentImpl> {
    public final InterfaceC1531Mk1<Pa2> a;
    public final OW b;
    public final J4 c;
    public final InterfaceC1531Mk1<C4805k5> d;
    public final InterfaceC1531Mk1<AbstractC3917g5> e;
    public final InterfaceC1531Mk1<Ch2> f;
    public final InterfaceC1531Mk1<C3296d7> g;
    public final Y3 h;
    public final InterfaceC1531Mk1<InterfaceC2773ah1> i;
    public final Z00 j;

    public W4(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, J4 j4, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, Y3 y3, InterfaceC1531Mk1 interfaceC1531Mk6, Z00 z00) {
        this.a = interfaceC1531Mk1;
        this.b = ow;
        this.c = j4;
        this.d = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
        this.g = interfaceC1531Mk5;
        this.h = y3;
        this.i = interfaceC1531Mk6;
        this.j = z00;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new AccountVerificationFragmentImpl(this.a.get(), (Sd2) this.b.get(), (H4) this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), (InterfaceC2228Vi) this.h.get(), new C1952Ru(), this.i.get(), (AbstractC5341md2) this.j.get());
    }
}

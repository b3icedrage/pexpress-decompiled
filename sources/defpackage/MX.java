package defpackage;

import com.impl.feature.platform.screens.deposit.DepositFragmentImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class MX implements InterfaceC5331mb0<DepositFragmentImpl> {
    public final InterfaceC1531Mk1<Pa2> a;
    public final OW b;
    public final N6 c;
    public final InterfaceC1531Mk1<C6999uY> d;
    public final InterfaceC1531Mk1<C7630xY> e;
    public final InterfaceC1531Mk1<Ch2> f;
    public final InterfaceC1531Mk1<InterfaceC2773ah1> g;
    public final InterfaceC1531Mk1<C3296d7> h;

    public MX(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, N6 n6, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6) {
        this.a = interfaceC1531Mk1;
        this.b = ow;
        this.c = n6;
        this.d = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
        this.g = interfaceC1531Mk5;
        this.h = interfaceC1531Mk6;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new DepositFragmentImpl(this.a.get(), (Sd2) this.b.get(), (EX) this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}

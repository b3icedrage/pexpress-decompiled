package defpackage;

import androidx.lifecycle.x;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;

/* JADX INFO: renamed from: kn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4957kn1 implements InterfaceC5331mb0<ReRegistrationFragmentImpl> {
    public final InterfaceC1531Mk1<InterfaceC2428Xm1> a;
    public final InterfaceC1531Mk1<InterfaceC5167ln1> b;
    public final OW c;
    public final InterfaceC1531Mk1<C3296d7> d;
    public final C1997Sj e;
    public final C7902yo0 f;

    public C4957kn1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, OW ow, InterfaceC1531Mk1 interfaceC1531Mk3, C1997Sj c1997Sj, C7902yo0 c7902yo0) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = ow;
        this.d = interfaceC1531Mk3;
        this.e = c1997Sj;
        this.f = c7902yo0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new ReRegistrationFragmentImpl(this.a.get(), this.b.get(), (x.b) this.c.get(), this.d.get(), (InterfaceC3728fA0) this.e.get(), (InterfaceC8112zo0) this.f.get());
    }
}

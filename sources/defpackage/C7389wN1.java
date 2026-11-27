package defpackage;

/* JADX INFO: renamed from: wN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7389wN1 implements InterfaceC5331mb0<C7178vN1> {
    public final InterfaceC1531Mk1<Pa2> a;
    public final InterfaceC1531Mk1<C6201qi2> b;
    public final XK1 c;
    public final C2147Uh d;

    public C7389wN1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, XK1 xk1, C2147Uh c2147Uh) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = xk1;
        this.d = c2147Uh;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C7178vN1(this.a.get(), this.b.get(), (VK1) this.c.get(), (InterfaceC1131Hh) this.d.get());
    }
}

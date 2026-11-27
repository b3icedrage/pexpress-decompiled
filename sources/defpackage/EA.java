package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class EA implements InterfaceC5331mb0<DA> {
    public final InterfaceC1531Mk1<S02<?>> a;
    public final BA b;
    public final InterfaceC1454Lk1 c;
    public final InterfaceC1531Mk1<KQ> d;
    public final C1763Pj e;

    public EA(InterfaceC1531Mk1 interfaceC1531Mk1, BA ba, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk2, C1763Pj c1763Pj) {
        this.a = interfaceC1531Mk1;
        this.b = ba;
        this.c = interfaceC1454Lk1;
        this.d = interfaceC1531Mk2;
        this.e = c1763Pj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new DA(this.a.get(), (InterfaceC7768yA) this.b.get(), (InterfaceC2636a22) this.c.get(), this.d.get(), (AbstractC1787Pr) this.e.get());
    }
}

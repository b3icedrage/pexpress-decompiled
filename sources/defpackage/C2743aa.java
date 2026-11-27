package defpackage;

/* JADX INFO: renamed from: aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2743aa implements InterfaceC5331mb0<V9> {
    public final WQ a;
    public final C6630sl0 b;
    public final InterfaceC1531Mk1<O3> c;
    public final C5470nE d;
    public final C3320dE e;

    public C2743aa(WQ wq, C6630sl0 c6630sl0, InterfaceC1531Mk1 interfaceC1531Mk1, C5470nE c5470nE, C3320dE c3320dE) {
        this.a = wq;
        this.b = c6630sl0;
        this.c = interfaceC1531Mk1;
        this.d = c5470nE;
        this.e = c3320dE;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new V9((VQ) this.a.get(), (Lc2) this.b.get(), this.c.get(), (AbstractC2327Wn1) this.d.get(), (AbstractC6366rX) this.e.get());
    }
}

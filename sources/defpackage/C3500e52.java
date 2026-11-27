package defpackage;

/* JADX INFO: renamed from: e52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3500e52 implements InterfaceC5541nb0<C3081c52> {
    public final TV a;
    public final C7849ya2 b;
    public final C4268hk2 c;

    public C3500e52(TV tv, C7849ya2 c7849ya2, C4268hk2 c4268hk2) {
        this.a = tv;
        this.b = c7849ya2;
        this.c = c4268hk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C3081c52(new Cm2(), new C2432Xo(), (InterfaceC4626jD1) this.a.get(), (C7639xa2) this.b.get(), (C4058gk2) this.c.get());
    }
}

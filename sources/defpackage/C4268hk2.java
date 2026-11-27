package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: hk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4268hk2 implements InterfaceC5541nb0<C4058gk2> {
    public final InterfaceC1531Mk1<Executor> a;
    public final InterfaceC1531Mk1<T80> b;
    public final C7569xD1 c;
    public final InterfaceC1531Mk1<JW1> d;

    public C4268hk2(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C7569xD1 c7569xD1, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = c7569xD1;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C4058gk2(this.a.get(), this.b.get(), (Ak2) this.c.get(), this.d.get());
    }
}

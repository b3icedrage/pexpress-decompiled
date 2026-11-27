package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: dB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3311dB implements InterfaceC5331mb0<XA> {
    public final VA a;
    public final InterfaceC1531Mk1<IV1> b;
    public final C4176hJ1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC1531Mk1<C4923kf> e;

    public C3311dB(VA va, InterfaceC1531Mk1 interfaceC1531Mk1, C4176hJ1 c4176hJ1, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = va;
        this.b = interfaceC1531Mk1;
        this.c = c4176hJ1;
        this.d = interfaceC1454Lk1;
        this.e = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new XA((TA) this.a.get(), this.b.get(), (Set) this.c.get(), (AbstractC5251mB) this.d.get(), this.e.get());
    }
}

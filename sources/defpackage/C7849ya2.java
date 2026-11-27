package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ya2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7849ya2 implements InterfaceC5541nb0<C7639xa2> {
    public final UA0 a;
    public final InterfaceC1531Mk1<InterfaceC0921Ep> b;
    public final InterfaceC1531Mk1<T80> c;
    public final C7569xD1 d;
    public final InterfaceC1531Mk1<Executor> e;
    public final InterfaceC1531Mk1<JW1> f;
    public final InterfaceC1531Mk1<LD> g;

    public C7849ya2(UA0 ua0, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C7569xD1 c7569xD1, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.a = ua0;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = c7569xD1;
        this.e = interfaceC1531Mk3;
        this.f = interfaceC1531Mk4;
        this.g = interfaceC1531Mk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C7639xa2((Context) this.a.a, this.b.get(), this.c.get(), (Ak2) this.d.get(), this.e.get(), this.f.get(), new Cm2(), new C2432Xo(), this.g.get());
    }
}

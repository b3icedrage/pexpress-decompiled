package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: Kb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1348Kb0 implements InterfaceC5331mb0<C1270Jb0> {
    public final C6 a;
    public final InterfaceC1531Mk1<C4923kf> b;
    public final InterfaceC1531Mk1<InterfaceC3170cY> c;

    public C1348Kb0(C6 c6, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = c6;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C1270Jb0((Context) this.a.get(), this.b.get(), this.c.get());
    }
}

package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: ki2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4938ki2 implements InterfaceC5331mb0<C4728ji2> {
    public final InterfaceC1531Mk1<InterfaceC2773ah1> a;
    public final InterfaceC1531Mk1<O3> b;
    public final InterfaceC1531Mk1<AbstractC2167Un1> c;
    public final InterfaceC1531Mk1<C4923kf> d;
    public final InterfaceC1531Mk1<Pa2> e;
    public final InterfaceC1531Mk1<Context> f;
    public final InterfaceC1531Mk1<InterfaceC4399iO> g;
    public final C5083lQ h;

    public C4938ki2(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7, C5083lQ c5083lQ) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = interfaceC1531Mk5;
        this.f = interfaceC1531Mk6;
        this.g = interfaceC1531Mk7;
        this.h = c5083lQ;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C4728ji2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), (InterfaceC3985gQ) this.h.get());
    }
}

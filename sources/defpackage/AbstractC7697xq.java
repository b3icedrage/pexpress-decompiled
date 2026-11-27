package defpackage;

import defpackage.C3506e70;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7697xq<T extends C3506e70> implements InterfaceC6653ss0<T> {
    public ArrayList a;
    public ArrayList b;
    public String c;
    public Kl2.a d;
    public boolean e;
    public transient Vc2 f;
    public C4871kP0.b g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public C3791fV0 l;
    public float m;
    public boolean n;

    @Override // defpackage.InterfaceC6653ss0
    public final float B() {
        return this.h;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final int D(int i) {
        ArrayList arrayList = this.a;
        return ((Integer) arrayList.get(i % arrayList.size())).intValue();
    }

    @Override // defpackage.InterfaceC6653ss0
    public final boolean E() {
        return this.f == null;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final int F(int i) {
        ArrayList arrayList = this.b;
        return ((Integer) arrayList.get(i % arrayList.size())).intValue();
    }

    @Override // defpackage.InterfaceC6653ss0
    public final List<Integer> H() {
        return this.a;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final boolean N() {
        return this.j;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final Kl2.a S() {
        return this.d;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final C3791fV0 U() {
        return this.l;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final int V() {
        return ((Integer) this.a.get(0)).intValue();
    }

    @Override // defpackage.InterfaceC6653ss0
    public final boolean X() {
        return this.e;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final String a() {
        return this.c;
    }

    public final void d0(int i) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.clear();
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.InterfaceC6653ss0
    public final boolean isVisible() {
        return this.n;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final C4871kP0.b l() {
        return this.g;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final float t() {
        return this.m;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final Vc2 u() {
        return E() ? AbstractC8067zc2.g : this.f;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final void v(Vc2 vc2) {
        if (vc2 == null) {
            return;
        }
        this.f = vc2;
    }

    @Override // defpackage.InterfaceC6653ss0
    public final float x() {
        return this.i;
    }
}

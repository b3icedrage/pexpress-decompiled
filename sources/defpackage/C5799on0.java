package defpackage;

/* JADX INFO: renamed from: on0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5799on0 extends Fi2 {
    @Override // defpackage.Fi2, defpackage.InterfaceC7206vX
    public final void a(InterfaceC7206vX interfaceC7206vX) {
        DX dx = this.h;
        if (dx.c && !dx.j) {
            dx.d((int) ((((DX) dx.l.get(0)).g * ((C5589nn0) this.b).u0) + 0.5f));
        }
    }

    @Override // defpackage.Fi2
    public final void d() {
        TK tk = this.b;
        C5589nn0 c5589nn0 = (C5589nn0) tk;
        int i = c5589nn0.v0;
        int i2 = c5589nn0.w0;
        int i3 = c5589nn0.y0;
        DX dx = this.h;
        if (i3 == 1) {
            if (i != -1) {
                dx.l.add(tk.V.d.h);
                this.b.V.d.h.k.add(dx);
                dx.f = i;
            } else if (i2 != -1) {
                dx.l.add(tk.V.d.i);
                this.b.V.d.i.k.add(dx);
                dx.f = -i2;
            } else {
                dx.b = true;
                dx.l.add(tk.V.d.i);
                this.b.V.d.i.k.add(dx);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            dx.l.add(tk.V.e.h);
            this.b.V.e.h.k.add(dx);
            dx.f = i;
        } else if (i2 != -1) {
            dx.l.add(tk.V.e.i);
            this.b.V.e.i.k.add(dx);
            dx.f = -i2;
        } else {
            dx.b = true;
            dx.l.add(tk.V.e.i);
            this.b.V.e.i.k.add(dx);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.Fi2
    public final void e() {
        TK tk = this.b;
        int i = ((C5589nn0) tk).y0;
        DX dx = this.h;
        if (i == 1) {
            tk.a0 = dx.g;
        } else {
            tk.b0 = dx.g;
        }
    }

    @Override // defpackage.Fi2
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.Fi2
    public final boolean k() {
        return false;
    }

    public final void m(DX dx) {
        DX dx2 = this.h;
        dx2.k.add(dx);
        dx.l.add(dx2);
    }
}

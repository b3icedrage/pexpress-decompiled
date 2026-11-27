package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: ro0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6431ro0 extends Fi2 {
    @Override // defpackage.Fi2, defpackage.InterfaceC7206vX
    public final void a(InterfaceC7206vX interfaceC7206vX) {
        C6017pq c6017pq = (C6017pq) this.b;
        int i = c6017pq.w0;
        DX dx = this.h;
        Iterator it = dx.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((DX) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            dx.d(i3 + c6017pq.y0);
        } else {
            dx.d(i2 + c6017pq.y0);
        }
    }

    @Override // defpackage.Fi2
    public final void d() {
        TK tk = this.b;
        if (tk instanceof C6017pq) {
            DX dx = this.h;
            dx.b = true;
            C6017pq c6017pq = (C6017pq) tk;
            int i = c6017pq.w0;
            boolean z = c6017pq.x0;
            int i2 = 0;
            if (i == 0) {
                dx.e = DX.a.h;
                while (i2 < c6017pq.v0) {
                    TK tk2 = c6017pq.u0[i2];
                    if (z || tk2.i0 != 8) {
                        DX dx2 = tk2.d.h;
                        dx2.k.add(dx);
                        dx.l.add(dx2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                dx.e = DX.a.i;
                while (i2 < c6017pq.v0) {
                    TK tk3 = c6017pq.u0[i2];
                    if (z || tk3.i0 != 8) {
                        DX dx3 = tk3.d.i;
                        dx3.k.add(dx);
                        dx.l.add(dx3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                dx.e = DX.a.j;
                while (i2 < c6017pq.v0) {
                    TK tk4 = c6017pq.u0[i2];
                    if (z || tk4.i0 != 8) {
                        DX dx4 = tk4.e.h;
                        dx4.k.add(dx);
                        dx.l.add(dx4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            dx.e = DX.a.k;
            while (i2 < c6017pq.v0) {
                TK tk5 = c6017pq.u0[i2];
                if (z || tk5.i0 != 8) {
                    DX dx5 = tk5.e.i;
                    dx5.k.add(dx);
                    dx.l.add(dx5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.Fi2
    public final void e() {
        TK tk = this.b;
        if (tk instanceof C6017pq) {
            int i = ((C6017pq) tk).w0;
            DX dx = this.h;
            if (i == 0 || i == 1) {
                tk.a0 = dx.g;
            } else {
                tk.b0 = dx.g;
            }
        }
    }

    @Override // defpackage.Fi2
    public final void f() {
        this.c = null;
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

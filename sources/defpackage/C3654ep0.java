package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: ep0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3654ep0 extends Fi2 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // defpackage.Fi2, defpackage.InterfaceC7206vX
    public final void a(InterfaceC7206vX interfaceC7206vX) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (this.j.ordinal() == 3) {
            TK tk = this.b;
            l(tk.J, tk.L, 0);
            return;
        }
        C7312w10 c7312w10 = this.e;
        boolean z = c7312w10.j;
        TK.a aVar = TK.a.g;
        DX dx = this.h;
        DX dx2 = this.i;
        if (z || this.d != aVar) {
            f = 0.5f;
        } else {
            TK tk2 = this.b;
            int i3 = tk2.r;
            if (i3 == 2) {
                f = 0.5f;
                TK tk3 = tk2.V;
                if (tk3 != null) {
                    C7312w10 c7312w11 = tk3.d.e;
                    if (c7312w11.j) {
                        c7312w10.d((int) ((c7312w11.g * tk2.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = tk2.s;
                if (i4 == 0 || i4 == 3) {
                    C6600sd2 c6600sd2 = tk2.e;
                    DX dx3 = c6600sd2.h;
                    DX dx4 = c6600sd2.i;
                    boolean z2 = tk2.J.f != null;
                    boolean z3 = tk2.K.f != null;
                    boolean z4 = tk2.L.f != null;
                    boolean z5 = tk2.M.f != null;
                    f = 0.5f;
                    int i5 = tk2.Z;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = tk2.Y;
                        boolean z6 = dx3.j;
                        int[] iArr = k;
                        if (z6 && dx4.j) {
                            if (dx.c && dx2.c) {
                                m(iArr, ((DX) dx.l.get(0)).g + dx.f, ((DX) dx2.l.get(0)).g - dx2.f, dx3.g + dx3.f, dx4.g - dx4.f, f5, i5);
                                c7312w10.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z7 = dx.j;
                        ArrayList arrayList = dx3.l;
                        if (z7 && dx2.j) {
                            if (!dx3.c || !dx4.c) {
                                return;
                            }
                            m(iArr, dx.g + dx.f, dx2.g - dx2.f, ((DX) arrayList.get(0)).g + dx3.f, ((DX) dx4.l.get(0)).g - dx4.f, f5, i5);
                            c7312w10.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!dx.c || !dx2.c || !dx3.c || !dx4.c) {
                            return;
                        }
                        m(iArr, ((DX) dx.l.get(0)).g + dx.f, ((DX) dx2.l.get(0)).g - dx2.f, ((DX) arrayList.get(0)).g + dx3.f, ((DX) dx4.l.get(0)).g - dx4.f, f5, i5);
                        c7312w10.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!dx.c || !dx2.c) {
                            return;
                        }
                        float f6 = tk2.Y;
                        int i6 = ((DX) dx.l.get(0)).g + dx.f;
                        int i7 = ((DX) dx2.l.get(0)).g - dx2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            c7312w10.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            c7312w10.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!dx3.c || !dx4.c) {
                            return;
                        }
                        float f7 = tk2.Y;
                        int i10 = ((DX) dx3.l.get(0)).g + dx3.f;
                        int i11 = ((DX) dx4.l.get(0)).g - dx4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            c7312w10.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            c7312w10.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            c7312w10.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = tk2.Z;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = tk2.e.e.g / tk2.Y;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = tk2.e.e.g;
                            f3 = tk2.Y;
                        }
                        c7312w10.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = tk2.e.e.g;
                        f3 = tk2.Y;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    c7312w10.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        if (dx.c && dx2.c) {
            if (dx.j && dx2.j && c7312w10.j) {
                return;
            }
            if (!c7312w10.j && this.d == aVar) {
                TK tk4 = this.b;
                if (tk4.r == 0 && !tk4.B()) {
                    DX dx5 = (DX) dx.l.get(0);
                    DX dx6 = (DX) dx2.l.get(0);
                    int i14 = dx5.g + dx.f;
                    int i15 = dx6.g + dx2.f;
                    dx.d(i14);
                    dx2.d(i15);
                    c7312w10.d(i15 - i14);
                    return;
                }
            }
            if (!c7312w10.j && this.d == aVar && this.a == 1 && dx.l.size() > 0 && dx2.l.size() > 0) {
                int iMin = Math.min((((DX) dx2.l.get(0)).g + dx2.f) - (((DX) dx.l.get(0)).g + dx.f), c7312w10.m);
                TK tk5 = this.b;
                int i16 = tk5.v;
                int iMax = Math.max(tk5.u, iMin);
                if (i16 > 0) {
                    iMax = Math.min(i16, iMax);
                }
                c7312w10.d(iMax);
            }
            if (c7312w10.j) {
                DX dx7 = (DX) dx.l.get(0);
                DX dx8 = (DX) dx2.l.get(0);
                int i17 = dx7.g;
                int i18 = dx.f + i17;
                int i19 = dx8.g;
                int i20 = dx2.f + i19;
                float f8 = this.b.f0;
                if (dx7 == dx8) {
                    f8 = f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                dx.d((int) ((((i19 - i17) - c7312w10.g) * f8) + i17 + f));
                dx2.d(dx.g + c7312w10.g);
            }
        }
    }

    @Override // defpackage.Fi2
    public final void d() {
        TK tk;
        TK tk2;
        TK.a aVar;
        TK tk3;
        TK tk4;
        TK.a aVar2;
        TK tk5 = this.b;
        boolean z = tk5.a;
        C7312w10 c7312w10 = this.e;
        if (z) {
            c7312w10.d(tk5.u());
        }
        boolean z2 = c7312w10.j;
        TK.a aVar3 = TK.a.h;
        TK.a aVar4 = TK.a.g;
        TK.a aVar5 = TK.a.d;
        DX dx = this.i;
        DX dx2 = this.h;
        if (!z2) {
            TK tk6 = this.b;
            TK.a aVar6 = tk6.U[0];
            this.d = aVar6;
            if (aVar6 != aVar4) {
                if (aVar6 == aVar3 && (tk4 = tk6.V) != null && ((aVar2 = tk4.U[0]) == aVar5 || aVar2 == aVar3)) {
                    int iU = (tk4.u() - this.b.J.e()) - this.b.L.e();
                    Fi2.b(dx2, tk4.d.h, this.b.J.e());
                    Fi2.b(dx, tk4.d.i, -this.b.L.e());
                    c7312w10.d(iU);
                    return;
                }
                if (aVar6 == aVar5) {
                    c7312w10.d(tk6.u());
                }
            }
        } else if (this.d == aVar3 && (tk2 = (tk = this.b).V) != null && ((aVar = tk2.U[0]) == aVar5 || aVar == aVar3)) {
            Fi2.b(dx2, tk2.d.h, tk.J.e());
            Fi2.b(dx, tk2.d.i, -this.b.L.e());
            return;
        }
        if (c7312w10.j) {
            TK tk7 = this.b;
            if (tk7.a) {
                IK[] ikArr = tk7.R;
                IK ik = ikArr[0];
                IK ik2 = ik.f;
                if (ik2 != null && ikArr[1].f != null) {
                    if (tk7.B()) {
                        dx2.f = this.b.R[0].e();
                        dx.f = -this.b.R[1].e();
                        return;
                    }
                    DX dxH = Fi2.h(this.b.R[0]);
                    if (dxH != null) {
                        Fi2.b(dx2, dxH, this.b.R[0].e());
                    }
                    DX dxH2 = Fi2.h(this.b.R[1]);
                    if (dxH2 != null) {
                        Fi2.b(dx, dxH2, -this.b.R[1].e());
                    }
                    dx2.b = true;
                    dx.b = true;
                    return;
                }
                if (ik2 != null) {
                    DX dxH3 = Fi2.h(ik);
                    if (dxH3 != null) {
                        Fi2.b(dx2, dxH3, this.b.R[0].e());
                        Fi2.b(dx, dx2, c7312w10.g);
                        return;
                    }
                    return;
                }
                IK ik3 = ikArr[1];
                if (ik3.f != null) {
                    DX dxH4 = Fi2.h(ik3);
                    if (dxH4 != null) {
                        Fi2.b(dx, dxH4, -this.b.R[1].e());
                        Fi2.b(dx2, dx, -c7312w10.g);
                        return;
                    }
                    return;
                }
                if ((tk7 instanceof InterfaceC6222qo0) || tk7.V == null || tk7.m(IK.a.j).f != null) {
                    return;
                }
                TK tk8 = this.b;
                Fi2.b(dx2, tk8.V.d.h, tk8.v());
                Fi2.b(dx, dx2, c7312w10.g);
                return;
            }
        }
        if (this.d == aVar4) {
            TK tk9 = this.b;
            int i = tk9.r;
            if (i == 2) {
                TK tk10 = tk9.V;
                if (tk10 != null) {
                    C7312w10 c7312w11 = tk10.e.e;
                    c7312w10.l.add(c7312w11);
                    c7312w11.k.add(c7312w10);
                    c7312w10.b = true;
                    c7312w10.k.add(dx2);
                    c7312w10.k.add(dx);
                }
            } else if (i == 3) {
                if (tk9.s == 3) {
                    dx2.a = this;
                    dx.a = this;
                    C6600sd2 c6600sd2 = tk9.e;
                    c6600sd2.h.a = this;
                    c6600sd2.i.a = this;
                    c7312w10.a = this;
                    if (tk9.C()) {
                        c7312w10.l.add(this.b.e.e);
                        this.b.e.e.k.add(c7312w10);
                        C6600sd2 c6600sd3 = this.b.e;
                        c6600sd3.e.a = this;
                        c7312w10.l.add(c6600sd3.h);
                        c7312w10.l.add(this.b.e.i);
                        this.b.e.h.k.add(c7312w10);
                        this.b.e.i.k.add(c7312w10);
                    } else if (this.b.B()) {
                        this.b.e.e.l.add(c7312w10);
                        c7312w10.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(c7312w10);
                    }
                } else {
                    C7312w10 c7312w12 = tk9.e.e;
                    c7312w10.l.add(c7312w12);
                    c7312w12.k.add(c7312w10);
                    this.b.e.h.k.add(c7312w10);
                    this.b.e.i.k.add(c7312w10);
                    c7312w10.b = true;
                    c7312w10.k.add(dx2);
                    c7312w10.k.add(dx);
                    dx2.l.add(c7312w10);
                    dx.l.add(c7312w10);
                }
            }
        }
        TK tk11 = this.b;
        IK[] ikArr2 = tk11.R;
        IK ik4 = ikArr2[0];
        IK ik5 = ik4.f;
        if (ik5 != null && ikArr2[1].f != null) {
            if (tk11.B()) {
                dx2.f = this.b.R[0].e();
                dx.f = -this.b.R[1].e();
                return;
            }
            DX dxH5 = Fi2.h(this.b.R[0]);
            DX dxH6 = Fi2.h(this.b.R[1]);
            if (dxH5 != null) {
                dxH5.b(this);
            }
            if (dxH6 != null) {
                dxH6.b(this);
            }
            this.j = Fi2.a.e;
            return;
        }
        if (ik5 != null) {
            DX dxH7 = Fi2.h(ik4);
            if (dxH7 != null) {
                Fi2.b(dx2, dxH7, this.b.R[0].e());
                c(dx, dx2, 1, c7312w10);
                return;
            }
            return;
        }
        IK ik6 = ikArr2[1];
        if (ik6.f != null) {
            DX dxH8 = Fi2.h(ik6);
            if (dxH8 != null) {
                Fi2.b(dx, dxH8, -this.b.R[1].e());
                c(dx2, dx, -1, c7312w10);
                return;
            }
            return;
        }
        if ((tk11 instanceof InterfaceC6222qo0) || (tk3 = tk11.V) == null) {
            return;
        }
        Fi2.b(dx2, tk3.d.h, tk11.v());
        c(dx, dx2, 1, c7312w10);
    }

    @Override // defpackage.Fi2
    public final void e() {
        DX dx = this.h;
        if (dx.j) {
            this.b.a0 = dx.g;
        }
    }

    @Override // defpackage.Fi2
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.Fi2
    public final boolean k() {
        return this.d != TK.a.g || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        DX dx = this.h;
        dx.c();
        dx.j = false;
        DX dx2 = this.i;
        dx2.c();
        dx2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.k0;
    }
}

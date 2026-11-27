package defpackage;

/* JADX INFO: renamed from: sd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6600sd2 extends Fi2 {
    public DX k;
    public C2821ar l;

    @Override // defpackage.Fi2, defpackage.InterfaceC7206vX
    public final void a(InterfaceC7206vX interfaceC7206vX) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.j.ordinal() == 3) {
            TK tk = this.b;
            l(tk.K, tk.M, 1);
            return;
        }
        C7312w10 c7312w10 = this.e;
        boolean z = c7312w10.c;
        TK.a aVar = TK.a.g;
        if (z && !c7312w10.j && this.d == aVar) {
            TK tk2 = this.b;
            int i2 = tk2.s;
            if (i2 == 2) {
                TK tk3 = tk2.V;
                if (tk3 != null) {
                    C7312w10 c7312w11 = tk3.e.e;
                    if (c7312w11.j) {
                        c7312w10.d((int) ((c7312w11.g * tk2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C7312w10 c7312w12 = tk2.d.e;
                if (c7312w12.j) {
                    int i3 = tk2.Z;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = c7312w12.g * tk2.Y;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = c7312w12.g;
                            f2 = tk2.Y;
                        }
                        c7312w10.d(i);
                    } else {
                        f = c7312w12.g;
                        f2 = tk2.Y;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c7312w10.d(i);
                }
            }
        }
        DX dx = this.h;
        if (dx.c) {
            DX dx2 = this.i;
            if (dx2.c) {
                if (dx.j && dx2.j && c7312w10.j) {
                    return;
                }
                if (!c7312w10.j && this.d == aVar) {
                    TK tk4 = this.b;
                    if (tk4.r == 0 && !tk4.C()) {
                        DX dx3 = (DX) dx.l.get(0);
                        DX dx4 = (DX) dx2.l.get(0);
                        int i4 = dx3.g + dx.f;
                        int i5 = dx4.g + dx2.f;
                        dx.d(i4);
                        dx2.d(i5);
                        c7312w10.d(i5 - i4);
                        return;
                    }
                }
                if (!c7312w10.j && this.d == aVar && this.a == 1 && dx.l.size() > 0 && dx2.l.size() > 0) {
                    DX dx5 = (DX) dx.l.get(0);
                    int i6 = (((DX) dx2.l.get(0)).g + dx2.f) - (dx5.g + dx.f);
                    int i7 = c7312w10.m;
                    if (i6 < i7) {
                        c7312w10.d(i6);
                    } else {
                        c7312w10.d(i7);
                    }
                }
                if (c7312w10.j && dx.l.size() > 0 && dx2.l.size() > 0) {
                    DX dx6 = (DX) dx.l.get(0);
                    DX dx7 = (DX) dx2.l.get(0);
                    int i8 = dx6.g;
                    int i9 = dx.f + i8;
                    int i10 = dx7.g;
                    int i11 = dx2.f + i10;
                    float f4 = this.b.g0;
                    if (dx6 == dx7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    dx.d((int) ((((i10 - i8) - c7312w10.g) * f4) + i8 + 0.5f));
                    dx2.d(dx.g + c7312w10.g);
                }
            }
        }
    }

    @Override // defpackage.Fi2
    public final void d() {
        TK tk;
        TK tk2;
        TK tk3;
        TK tk4;
        TK tk5 = this.b;
        boolean z = tk5.a;
        C7312w10 c7312w10 = this.e;
        if (z) {
            c7312w10.d(tk5.o());
        }
        boolean z2 = c7312w10.j;
        TK.a aVar = TK.a.h;
        TK.a aVar2 = TK.a.d;
        TK.a aVar3 = TK.a.g;
        DX dx = this.i;
        DX dx2 = this.h;
        if (!z2) {
            TK tk6 = this.b;
            this.d = tk6.U[1];
            if (tk6.E) {
                this.l = new C2821ar(this);
            }
            TK.a aVar4 = this.d;
            if (aVar4 != aVar3) {
                if (aVar4 == aVar && (tk4 = this.b.V) != null && tk4.U[1] == aVar2) {
                    int iO = (tk4.o() - this.b.K.e()) - this.b.M.e();
                    Fi2.b(dx2, tk4.e.h, this.b.K.e());
                    Fi2.b(dx, tk4.e.i, -this.b.M.e());
                    c7312w10.d(iO);
                    return;
                }
                if (aVar4 == aVar2) {
                    c7312w10.d(this.b.o());
                }
            }
        } else if (this.d == aVar && (tk2 = (tk = this.b).V) != null && tk2.U[1] == aVar2) {
            Fi2.b(dx2, tk2.e.h, tk.K.e());
            Fi2.b(dx, tk2.e.i, -this.b.M.e());
            return;
        }
        boolean z3 = c7312w10.j;
        DX dx3 = this.k;
        if (z3) {
            TK tk7 = this.b;
            if (tk7.a) {
                IK[] ikArr = tk7.R;
                IK ik = ikArr[2];
                IK ik2 = ik.f;
                if (ik2 != null && ikArr[3].f != null) {
                    if (tk7.C()) {
                        dx2.f = this.b.R[2].e();
                        dx.f = -this.b.R[3].e();
                    } else {
                        DX dxH = Fi2.h(this.b.R[2]);
                        if (dxH != null) {
                            Fi2.b(dx2, dxH, this.b.R[2].e());
                        }
                        DX dxH2 = Fi2.h(this.b.R[3]);
                        if (dxH2 != null) {
                            Fi2.b(dx, dxH2, -this.b.R[3].e());
                        }
                        dx2.b = true;
                        dx.b = true;
                    }
                    TK tk8 = this.b;
                    if (tk8.E) {
                        Fi2.b(dx3, dx2, tk8.c0);
                        return;
                    }
                    return;
                }
                if (ik2 != null) {
                    DX dxH3 = Fi2.h(ik);
                    if (dxH3 != null) {
                        Fi2.b(dx2, dxH3, this.b.R[2].e());
                        Fi2.b(dx, dx2, c7312w10.g);
                        TK tk9 = this.b;
                        if (tk9.E) {
                            Fi2.b(dx3, dx2, tk9.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                IK ik3 = ikArr[3];
                if (ik3.f != null) {
                    DX dxH4 = Fi2.h(ik3);
                    if (dxH4 != null) {
                        Fi2.b(dx, dxH4, -this.b.R[3].e());
                        Fi2.b(dx2, dx, -c7312w10.g);
                    }
                    TK tk10 = this.b;
                    if (tk10.E) {
                        Fi2.b(dx3, dx2, tk10.c0);
                        return;
                    }
                    return;
                }
                IK ik4 = ikArr[4];
                if (ik4.f != null) {
                    DX dxH5 = Fi2.h(ik4);
                    if (dxH5 != null) {
                        Fi2.b(dx3, dxH5, 0);
                        Fi2.b(dx2, dx3, -this.b.c0);
                        Fi2.b(dx, dx2, c7312w10.g);
                        return;
                    }
                    return;
                }
                if ((tk7 instanceof InterfaceC6222qo0) || tk7.V == null || tk7.m(IK.a.j).f != null) {
                    return;
                }
                TK tk11 = this.b;
                Fi2.b(dx2, tk11.V.e.h, tk11.w());
                Fi2.b(dx, dx2, c7312w10.g);
                TK tk12 = this.b;
                if (tk12.E) {
                    Fi2.b(dx3, dx2, tk12.c0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != aVar3) {
            c7312w10.b(this);
        } else {
            TK tk13 = this.b;
            int i = tk13.s;
            if (i == 2) {
                TK tk14 = tk13.V;
                if (tk14 != null) {
                    C7312w10 c7312w11 = tk14.e.e;
                    c7312w10.l.add(c7312w11);
                    c7312w11.k.add(c7312w10);
                    c7312w10.b = true;
                    c7312w10.k.add(dx2);
                    c7312w10.k.add(dx);
                }
            } else if (i == 3 && !tk13.C()) {
                TK tk15 = this.b;
                if (tk15.r != 3) {
                    C7312w10 c7312w12 = tk15.d.e;
                    c7312w10.l.add(c7312w12);
                    c7312w12.k.add(c7312w10);
                    c7312w10.b = true;
                    c7312w10.k.add(dx2);
                    c7312w10.k.add(dx);
                }
            }
        }
        TK tk16 = this.b;
        IK[] ikArr2 = tk16.R;
        IK ik5 = ikArr2[2];
        IK ik6 = ik5.f;
        if (ik6 != null && ikArr2[3].f != null) {
            if (tk16.C()) {
                dx2.f = this.b.R[2].e();
                dx.f = -this.b.R[3].e();
            } else {
                DX dxH6 = Fi2.h(this.b.R[2]);
                DX dxH7 = Fi2.h(this.b.R[3]);
                if (dxH6 != null) {
                    dxH6.b(this);
                }
                if (dxH7 != null) {
                    dxH7.b(this);
                }
                this.j = Fi2.a.e;
            }
            if (this.b.E) {
                c(dx3, dx2, 1, this.l);
            }
        } else if (ik6 != null) {
            DX dxH8 = Fi2.h(ik5);
            if (dxH8 != null) {
                Fi2.b(dx2, dxH8, this.b.R[2].e());
                c(dx, dx2, 1, c7312w10);
                if (this.b.E) {
                    c(dx3, dx2, 1, this.l);
                }
                if (this.d == aVar3) {
                    TK tk17 = this.b;
                    if (tk17.Y > 0.0f) {
                        C3654ep0 c3654ep0 = tk17.d;
                        if (c3654ep0.d == aVar3) {
                            c3654ep0.e.k.add(c7312w10);
                            c7312w10.l.add(this.b.d.e);
                            c7312w10.a = this;
                        }
                    }
                }
            }
        } else {
            IK ik7 = ikArr2[3];
            if (ik7.f != null) {
                DX dxH9 = Fi2.h(ik7);
                if (dxH9 != null) {
                    Fi2.b(dx, dxH9, -this.b.R[3].e());
                    c(dx2, dx, -1, c7312w10);
                    if (this.b.E) {
                        c(dx3, dx2, 1, this.l);
                    }
                }
            } else {
                IK ik8 = ikArr2[4];
                if (ik8.f != null) {
                    DX dxH10 = Fi2.h(ik8);
                    if (dxH10 != null) {
                        Fi2.b(dx3, dxH10, 0);
                        c(dx2, dx3, -1, this.l);
                        c(dx, dx2, 1, c7312w10);
                    }
                } else if (!(tk16 instanceof InterfaceC6222qo0) && (tk3 = tk16.V) != null) {
                    Fi2.b(dx2, tk3.e.h, tk16.w());
                    c(dx, dx2, 1, c7312w10);
                    if (this.b.E) {
                        c(dx3, dx2, 1, this.l);
                    }
                    if (this.d == aVar3) {
                        TK tk18 = this.b;
                        if (tk18.Y > 0.0f) {
                            C3654ep0 c3654ep1 = tk18.d;
                            if (c3654ep1.d == aVar3) {
                                c3654ep1.e.k.add(c7312w10);
                                c7312w10.l.add(this.b.d.e);
                                c7312w10.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c7312w10.l.size() == 0) {
            c7312w10.c = true;
        }
    }

    @Override // defpackage.Fi2
    public final void e() {
        DX dx = this.h;
        if (dx.j) {
            this.b.b0 = dx.g;
        }
    }

    @Override // defpackage.Fi2
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.Fi2
    public final boolean k() {
        return this.d != TK.a.g || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        DX dx = this.h;
        dx.c();
        dx.j = false;
        DX dx2 = this.i;
        dx2.c();
        dx2.j = false;
        DX dx3 = this.k;
        dx3.c();
        dx3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.k0;
    }
}

package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6017pq extends C6641so0 {
    public int w0 = 0;
    public boolean x0 = true;
    public int y0 = 0;
    public boolean z0 = false;

    @Override // defpackage.TK
    public final boolean E() {
        return this.z0;
    }

    @Override // defpackage.TK
    public final boolean F() {
        return this.z0;
    }

    public final boolean W() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.v0;
            if (i4 >= i) {
                break;
            }
            TK tk = this.u0[i4];
            if ((this.x0 || tk.f()) && ((((i2 = this.w0) == 0 || i2 == 1) && !tk.E()) || (((i3 = this.w0) == 2 || i3 == 3) && !tk.F()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.v0; i5++) {
            TK tk2 = this.u0[i5];
            if (this.x0 || tk2.f()) {
                IK.a aVar = IK.a.h;
                IK.a aVar2 = IK.a.e;
                IK.a aVar3 = IK.a.g;
                IK.a aVar4 = IK.a.d;
                if (!z2) {
                    int i6 = this.w0;
                    if (i6 == 0) {
                        iMax = tk2.m(aVar4).d();
                    } else if (i6 == 1) {
                        iMax = tk2.m(aVar3).d();
                    } else if (i6 == 2) {
                        iMax = tk2.m(aVar2).d();
                    } else if (i6 == 3) {
                        iMax = tk2.m(aVar).d();
                    }
                    z2 = true;
                }
                int i7 = this.w0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, tk2.m(aVar4).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, tk2.m(aVar3).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, tk2.m(aVar2).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, tk2.m(aVar).d());
                }
            }
        }
        int i8 = iMax + this.y0;
        int i9 = this.w0;
        if (i9 == 0 || i9 == 1) {
            N(i8, i8);
        } else {
            O(i8, i8);
        }
        this.z0 = true;
        return true;
    }

    public final int X() {
        int i = this.w0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.TK
    public final void e(C4874kQ0 c4874kQ0, boolean z) {
        boolean z2;
        int i;
        IK[] ikArr = this.R;
        IK ik = this.J;
        ikArr[0] = ik;
        IK ik2 = this.K;
        int i2 = 2;
        ikArr[2] = ik2;
        IK ik3 = this.L;
        ikArr[1] = ik3;
        IK ik4 = this.M;
        ikArr[3] = ik4;
        for (IK ik5 : ikArr) {
            ik5.i = c4874kQ0.k(ik5);
        }
        int i3 = this.w0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        IK ik6 = ikArr[i3];
        if (!this.z0) {
            W();
        }
        if (this.z0) {
            this.z0 = false;
            int i4 = this.w0;
            if (i4 == 0 || i4 == 1) {
                c4874kQ0.d(ik.i, this.a0);
                c4874kQ0.d(ik3.i, this.a0);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    c4874kQ0.d(ik2.i, this.b0);
                    c4874kQ0.d(ik4.i, this.b0);
                    return;
                }
                return;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.v0) {
                z2 = false;
                break;
            }
            TK tk = this.u0[i5];
            if (this.x0 || tk.f()) {
                int i6 = this.w0;
                TK.a aVar = TK.a.g;
                if (((i6 == 0 || i6 == 1) && tk.U[0] == aVar && tk.J.f != null && tk.L.f != null) || ((i6 == 2 || i6 == 3) && tk.U[1] == aVar && tk.K.f != null && tk.M.f != null)) {
                    z2 = true;
                    break;
                }
            }
            i5++;
        }
        boolean z3 = ik.g() || ik3.g();
        boolean z4 = ik2.g() || ik4.g();
        int i7 = (z2 || !(((i = this.w0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.v0) {
            TK tk2 = this.u0[i8];
            if (this.x0 || tk2.f()) {
                TN1 tn1K = c4874kQ0.k(tk2.R[this.w0]);
                int i9 = this.w0;
                IK ik7 = tk2.R[i9];
                ik7.i = tn1K;
                IK ik8 = ik7.f;
                int i10 = (ik8 == null || ik8.d != this) ? 0 : ik7.g;
                if (i9 == 0 || i9 == i2) {
                    TN1 tn1 = ik6.i;
                    int i11 = this.y0 - i10;
                    C0747Cj c0747CjL = c4874kQ0.l();
                    TN1 tn1M = c4874kQ0.m();
                    tn1M.h = 0;
                    c0747CjL.d(tn1, tn1K, tn1M, i11);
                    c4874kQ0.c(c0747CjL);
                } else {
                    TN1 tn2 = ik6.i;
                    int i12 = this.y0 + i10;
                    C0747Cj c0747CjL2 = c4874kQ0.l();
                    TN1 tn1M2 = c4874kQ0.m();
                    tn1M2.h = 0;
                    c0747CjL2.c(tn2, tn1K, tn1M2, i12);
                    c4874kQ0.c(c0747CjL2);
                }
                c4874kQ0.e(ik6.i, tn1K, this.y0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.w0;
        if (i13 == 0) {
            c4874kQ0.e(ik3.i, ik.i, 0, 8);
            c4874kQ0.e(ik.i, this.V.L.i, 0, 4);
            c4874kQ0.e(ik.i, this.V.J.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c4874kQ0.e(ik.i, ik3.i, 0, 8);
            c4874kQ0.e(ik.i, this.V.J.i, 0, 4);
            c4874kQ0.e(ik.i, this.V.L.i, 0, 0);
        } else if (i13 == 2) {
            c4874kQ0.e(ik4.i, ik2.i, 0, 8);
            c4874kQ0.e(ik2.i, this.V.M.i, 0, 4);
            c4874kQ0.e(ik2.i, this.V.K.i, 0, 0);
        } else if (i13 == 3) {
            c4874kQ0.e(ik2.i, ik4.i, 0, 8);
            c4874kQ0.e(ik2.i, this.V.K.i, 0, 4);
            c4874kQ0.e(ik2.i, this.V.M.i, 0, 0);
        }
    }

    @Override // defpackage.TK
    public final boolean f() {
        return true;
    }

    @Override // defpackage.C6641so0, defpackage.TK
    public final void j(TK tk, HashMap<TK, TK> map) {
        super.j(tk, map);
        C6017pq c6017pq = (C6017pq) tk;
        this.w0 = c6017pq.w0;
        this.x0 = c6017pq.x0;
        this.y0 = c6017pq.y0;
    }

    @Override // defpackage.TK
    public final String toString() {
        String strB = C5807oq.b(new StringBuilder("[Barrier] "), this.k0, " {");
        for (int i = 0; i < this.v0; i++) {
            TK tk = this.u0[i];
            if (i > 0) {
                strB = Z0.c(strB, ", ");
            }
            StringBuilder sbF = C1039Gc0.f(strB);
            sbF.append(tk.k0);
            strB = sbF.toString();
        }
        return Z0.c(strB, "}");
    }
}

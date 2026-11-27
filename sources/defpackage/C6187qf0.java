package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: qf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6187qf0 extends We2 {
    public TK[] e1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public int T0 = 0;
    public int U0 = 0;
    public int V0 = 2;
    public int W0 = 2;
    public int X0 = 0;
    public int Y0 = -1;
    public int Z0 = 0;
    public final ArrayList<a> a1 = new ArrayList<>();
    public TK[] b1 = null;
    public TK[] c1 = null;
    public int[] d1 = null;
    public int f1 = 0;

    /* JADX INFO: renamed from: qf0$a */
    public class a {
        public int a;
        public IK d;
        public IK e;
        public IK f;
        public IK g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int q;
        public TK b = null;
        public int c = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;

        public a(int i, IK ik, IK ik2, IK ik3, IK ik4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = ik;
            this.e = ik2;
            this.f = ik3;
            this.g = ik4;
            this.h = C6187qf0.this.A0;
            this.i = C6187qf0.this.w0;
            this.j = C6187qf0.this.B0;
            this.k = C6187qf0.this.x0;
            this.q = i2;
        }

        public final void a(TK tk) {
            int i = this.a;
            TK.a aVar = TK.a.g;
            C6187qf0 c6187qf0 = C6187qf0.this;
            if (i == 0) {
                int iZ = c6187qf0.Z(tk, this.q);
                if (tk.U[0] == aVar) {
                    this.p++;
                    iZ = 0;
                }
                this.l = iZ + (tk.i0 != 8 ? c6187qf0.T0 : 0) + this.l;
                int iY = c6187qf0.Y(tk, this.q);
                if (this.b == null || this.c < iY) {
                    this.b = tk;
                    this.c = iY;
                    this.m = iY;
                }
            } else {
                int iZ2 = c6187qf0.Z(tk, this.q);
                int iY2 = c6187qf0.Y(tk, this.q);
                if (tk.U[1] == aVar) {
                    this.p++;
                    iY2 = 0;
                }
                this.m = iY2 + (tk.i0 != 8 ? c6187qf0.U0 : 0) + this.m;
                if (this.b == null || this.c < iZ2) {
                    this.b = tk;
                    this.c = iZ2;
                    this.l = iZ2;
                }
            }
            this.o++;
        }

        public final void b(int i, boolean z, boolean z2) {
            C6187qf0 c6187qf0;
            int i2;
            TK tk;
            boolean z3;
            char c;
            float f;
            float f2;
            int i3;
            float f3;
            float f4;
            int i4;
            int i5 = this.o;
            int i6 = 0;
            while (true) {
                c6187qf0 = C6187qf0.this;
                if (i6 >= i5 || (i4 = this.n + i6) >= c6187qf0.f1) {
                    break;
                }
                TK tk2 = c6187qf0.e1[i4];
                if (tk2 != null) {
                    tk2.H();
                }
                i6++;
            }
            if (i5 == 0 || this.b == null) {
                return;
            }
            boolean z4 = z2 && i == 0;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = this.n + (z ? (i5 - 1) - i9 : i9);
                if (i10 >= c6187qf0.f1) {
                    break;
                }
                TK tk3 = c6187qf0.e1[i10];
                if (tk3 != null && tk3.i0 == 0) {
                    if (i7 == -1) {
                        i7 = i9;
                    }
                    i8 = i9;
                }
            }
            if (this.a != 0) {
                boolean z5 = z4;
                TK tk4 = this.b;
                tk4.l0 = c6187qf0.H0;
                int i11 = this.h;
                if (i > 0) {
                    i11 += c6187qf0.T0;
                }
                IK ik = tk4.J;
                IK ik2 = tk4.L;
                if (z) {
                    ik2.a(this.f, i11);
                    if (z2) {
                        ik.a(this.d, this.j);
                    }
                    if (i > 0) {
                        this.f.d.J.a(ik2, 0);
                    }
                } else {
                    ik.a(this.d, i11);
                    if (z2) {
                        ik2.a(this.f, this.j);
                    }
                    if (i > 0) {
                        this.d.d.L.a(ik, 0);
                    }
                }
                TK tk5 = null;
                for (int i12 = 0; i12 < i5; i12++) {
                    int i13 = this.n + i12;
                    if (i13 >= c6187qf0.f1) {
                        return;
                    }
                    TK tk6 = c6187qf0.e1[i13];
                    if (tk6 != null) {
                        IK ik3 = tk6.K;
                        if (i12 == 0) {
                            tk6.i(ik3, this.e, this.i);
                            int i14 = c6187qf0.I0;
                            float f5 = c6187qf0.O0;
                            if (this.n == 0) {
                                int i15 = c6187qf0.K0;
                                i2 = -1;
                                if (i15 != -1) {
                                    f5 = c6187qf0.Q0;
                                }
                                i14 = i15;
                                tk6.m0 = i14;
                                tk6.g0 = f5;
                            } else {
                                i2 = -1;
                            }
                            if (z2 && (i15 = c6187qf0.M0) != i2) {
                                f5 = c6187qf0.S0;
                                i14 = i15;
                            }
                            tk6.m0 = i14;
                            tk6.g0 = f5;
                        }
                        if (i12 == i5 - 1) {
                            tk6.i(tk6.M, this.g, this.k);
                        }
                        if (tk5 != null) {
                            int i16 = c6187qf0.U0;
                            IK ik4 = tk5.M;
                            ik3.a(ik4, i16);
                            if (i12 == i7) {
                                int i17 = this.i;
                                if (ik3.h()) {
                                    ik3.h = i17;
                                }
                            }
                            ik4.a(ik3, 0);
                            if (i12 == i8 + 1) {
                                int i18 = this.k;
                                if (ik4.h()) {
                                    ik4.h = i18;
                                }
                            }
                        }
                        if (tk6 != tk4) {
                            IK ik5 = tk6.L;
                            IK ik6 = tk6.J;
                            if (z) {
                                int i19 = c6187qf0.V0;
                                if (i19 == 0) {
                                    ik5.a(ik2, 0);
                                } else if (i19 == 1) {
                                    ik6.a(ik, 0);
                                } else if (i19 == 2) {
                                    ik6.a(ik, 0);
                                    ik5.a(ik2, 0);
                                }
                            } else {
                                int i20 = c6187qf0.V0;
                                if (i20 == 0) {
                                    ik6.a(ik, 0);
                                } else if (i20 == 1) {
                                    ik5.a(ik2, 0);
                                } else if (i20 == 2) {
                                    if (z5) {
                                        ik6.a(this.d, this.h);
                                        ik5.a(this.f, this.j);
                                    } else {
                                        ik6.a(ik, 0);
                                        ik5.a(ik2, 0);
                                    }
                                }
                            }
                        }
                        tk5 = tk6;
                    }
                }
                return;
            }
            TK tk7 = this.b;
            tk7.m0 = c6187qf0.I0;
            int i21 = this.i;
            if (i > 0) {
                i21 += c6187qf0.U0;
            }
            IK ik7 = this.e;
            IK ik8 = tk7.K;
            ik8.a(ik7, i21);
            IK ik9 = tk7.M;
            if (z2) {
                ik9.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.M.a(ik8, 0);
            }
            if (c6187qf0.W0 != 3 || tk7.E) {
                tk = tk7;
                break;
            }
            int i22 = 0;
            while (true) {
                if (i22 < i5) {
                    int i23 = this.n + (z ? (i5 - 1) - i22 : i22);
                    if (i23 < c6187qf0.f1) {
                        tk = c6187qf0.e1[i23];
                        if (tk.E) {
                            break;
                        } else {
                            i22++;
                        }
                    }
                }
                tk = tk7;
                break;
            }
            int i24 = 0;
            TK tk8 = null;
            while (i24 < i5) {
                int i25 = z ? (i5 - 1) - i24 : i24;
                int i26 = this.n + i25;
                if (i26 >= c6187qf0.f1) {
                    return;
                }
                TK tk9 = c6187qf0.e1[i26];
                if (tk9 == null) {
                    z3 = z4;
                    c = 3;
                } else {
                    IK ik10 = tk9.J;
                    if (i24 == 0) {
                        tk9.i(ik10, this.d, this.h);
                    }
                    if (i25 == 0) {
                        int i27 = c6187qf0.H0;
                        if (z) {
                            f = 1.0f;
                            f2 = 1.0f - c6187qf0.N0;
                        } else {
                            f = 1.0f;
                            f2 = c6187qf0.N0;
                        }
                        if (this.n == 0) {
                            i3 = c6187qf0.J0;
                            z3 = z4;
                            if (i3 != -1) {
                                if (z) {
                                    f4 = c6187qf0.P0;
                                    f2 = f - f4;
                                } else {
                                    f3 = c6187qf0.P0;
                                    f2 = f3;
                                }
                            }
                            tk9.l0 = i3;
                            tk9.f0 = f2;
                        } else {
                            z3 = z4;
                        }
                        if (!z2 || (i3 = c6187qf0.L0) == -1) {
                            i3 = i27;
                        } else if (z) {
                            f4 = c6187qf0.R0;
                            f2 = f - f4;
                        } else {
                            f3 = c6187qf0.R0;
                            f2 = f3;
                        }
                        tk9.l0 = i3;
                        tk9.f0 = f2;
                    } else {
                        z3 = z4;
                    }
                    if (i24 == i5 - 1) {
                        tk9.i(tk9.L, this.f, this.j);
                    }
                    if (tk8 != null) {
                        int i28 = c6187qf0.T0;
                        IK ik11 = tk8.L;
                        ik10.a(ik11, i28);
                        if (i24 == i7) {
                            int i29 = this.h;
                            if (ik10.h()) {
                                ik10.h = i29;
                            }
                        }
                        ik11.a(ik10, 0);
                        if (i24 == i8 + 1) {
                            int i30 = this.j;
                            if (ik11.h()) {
                                ik11.h = i30;
                            }
                        }
                    }
                    if (tk9 != tk7) {
                        int i31 = c6187qf0.W0;
                        c = 3;
                        if (i31 == 3 && tk.E && tk9 != tk && tk9.E) {
                            tk9.N.a(tk.N, 0);
                        } else {
                            IK ik12 = tk9.K;
                            if (i31 != 0) {
                                IK ik13 = tk9.M;
                                if (i31 == 1) {
                                    ik13.a(ik9, 0);
                                } else if (z3) {
                                    ik12.a(this.e, this.i);
                                    ik13.a(this.g, this.k);
                                } else {
                                    ik12.a(ik8, 0);
                                    ik13.a(ik9, 0);
                                }
                            } else {
                                ik12.a(ik8, 0);
                            }
                        }
                    } else {
                        c = 3;
                    }
                    tk8 = tk9;
                }
                i24++;
                z4 = z3;
            }
        }

        public final int c() {
            return this.a == 1 ? this.m - C6187qf0.this.U0 : this.m;
        }

        public final int d() {
            return this.a == 0 ? this.l - C6187qf0.this.T0 : this.l;
        }

        public final void e(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.n;
                int i7 = i6 + i5;
                C6187qf0 c6187qf0 = C6187qf0.this;
                if (i7 >= c6187qf0.f1) {
                    break;
                }
                TK tk = c6187qf0.e1[i6 + i5];
                int i8 = this.a;
                TK.a aVar = TK.a.d;
                TK.a aVar2 = TK.a.g;
                if (i8 == 0) {
                    if (tk != null) {
                        TK.a[] aVarArr = tk.U;
                        if (aVarArr[0] == aVar2 && tk.r == 0) {
                            c6187qf0.X(tk, aVar, i4, aVarArr[1], tk.o());
                        }
                    }
                } else if (tk != null) {
                    TK.a[] aVarArr2 = tk.U;
                    if (aVarArr2[1] == aVar2 && tk.s == 0) {
                        int i9 = i4;
                        c6187qf0.X(tk, aVarArr2[0], tk.u(), aVar, i9);
                        i4 = i9;
                    }
                }
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i10 = this.o;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = this.n + i11;
                C6187qf0 c6187qf1 = C6187qf0.this;
                if (i12 >= c6187qf1.f1) {
                    return;
                }
                TK tk2 = c6187qf1.e1[i12];
                if (this.a == 0) {
                    int iU = tk2.u();
                    int i13 = c6187qf1.T0;
                    if (tk2.i0 == 8) {
                        i13 = 0;
                    }
                    this.l = iU + i13 + this.l;
                    int iY = c6187qf1.Y(tk2, this.q);
                    if (this.b == null || this.c < iY) {
                        this.b = tk2;
                        this.c = iY;
                        this.m = iY;
                    }
                } else {
                    int iZ = c6187qf1.Z(tk2, this.q);
                    int iY2 = c6187qf1.Y(tk2, this.q);
                    int i14 = c6187qf1.U0;
                    if (tk2.i0 == 8) {
                        i14 = 0;
                    }
                    this.m = iY2 + i14 + this.m;
                    if (this.b == null || this.c < iZ) {
                        this.b = tk2;
                        this.c = iZ;
                        this.l = iZ;
                    }
                }
            }
        }

        public final void f(int i, IK ik, IK ik2, IK ik3, IK ik4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = ik;
            this.e = ik2;
            this.f = ik3;
            this.g = ik4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:396:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:398:0x06cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:399:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:400:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:403:0x06db  */
    /* JADX WARN: Code duplicated, block: B:405:0x06df  */
    /* JADX WARN: Code duplicated, block: B:406:0x06e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:407:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:408:0x06eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:410:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:413:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:414:0x0701  */
    /* JADX WARN: Code duplicated, block: B:77:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.We2
    public final void W(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        TK[] tkArr;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        a aVar;
        char c;
        int iMin;
        int iMin2;
        int i11;
        boolean z;
        int i12;
        int i13;
        int i14;
        int iCeil;
        int iCeil2;
        Object obj;
        TK tk;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.v0;
        TK.a aVar2 = TK.a.e;
        TK.a aVar3 = TK.a.g;
        if (i19 > 0) {
            TK tk2 = this.V;
            C4289hr.b bVar = tk2 != null ? ((UK) tk2).y0 : null;
            if (bVar == null) {
                this.D0 = 0;
                this.E0 = 0;
                this.C0 = false;
                return;
            }
            for (int i20 = 0; i20 < this.v0; i20++) {
                TK tk3 = this.u0[i20];
                if (tk3 != null && !(tk3 instanceof C5589nn0)) {
                    TK.a aVarN = tk3.n(0);
                    TK.a aVarN2 = tk3.n(1);
                    if (aVarN != aVar3 || tk3.r == 1 || aVarN2 != aVar3 || tk3.s == 1) {
                        if (aVarN == aVar3) {
                            aVarN = aVar2;
                        }
                        if (aVarN2 == aVar3) {
                            aVarN2 = aVar2;
                        }
                        C4289hr.a aVar4 = this.F0;
                        aVar4.a = aVarN;
                        aVar4.b = aVarN2;
                        aVar4.c = tk3.u();
                        aVar4.d = tk3.o();
                        ((ConstraintLayout.b) bVar).b(tk3, aVar4);
                        tk3.S(aVar4.e);
                        tk3.P(aVar4.f);
                        tk3.M(aVar4.g);
                    }
                }
            }
        }
        int i21 = this.A0;
        int i22 = this.B0;
        int i23 = this.w0;
        int i24 = this.x0;
        int[] iArr2 = new int[2];
        int i25 = (i2 - i21) - i22;
        int i26 = this.Z0;
        if (i26 == 1) {
            i25 = (i4 - i23) - i24;
        }
        int i27 = i25;
        if (i26 == 0) {
            if (this.H0 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        } else {
            if (this.H0 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        }
        TK[] tkArr2 = this.u0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            i5 = this.v0;
            if (i28 >= i5) {
                break;
            }
            if (this.u0[i28].i0 == 8) {
                i29++;
            }
            i28++;
        }
        if (i29 > 0) {
            TK[] tkArr3 = new TK[i5 - i29];
            int i31 = 0;
            int i32 = 0;
            while (i31 < this.v0) {
                TK tk4 = this.u0[i31];
                int i33 = i21;
                TK[] tkArr4 = tkArr3;
                if (tk4.i0 != 8) {
                    tkArr4[i32] = tk4;
                    i32++;
                }
                i31++;
                i21 = i33;
                tkArr3 = tkArr4;
            }
            i6 = i32;
            tkArr = tkArr3;
        } else {
            i6 = i5;
            tkArr = tkArr2;
        }
        int i34 = i21;
        this.e1 = tkArr;
        this.f1 = i6;
        int i35 = this.X0;
        ArrayList<a> arrayList = this.a1;
        if (i35 == 0) {
            i7 = i22;
            i8 = i23;
            i9 = i24;
            iArr = iArr2;
            i10 = i34;
            int i36 = this.Z0;
            if (i6 != 0) {
                if (arrayList.size() == 0) {
                    aVar = new a(i36, this.J, this.K, this.L, this.M, i27);
                    arrayList.add(aVar);
                } else {
                    a aVar5 = arrayList.get(0);
                    aVar5.c = 0;
                    aVar5.b = null;
                    aVar5.l = 0;
                    aVar5.m = 0;
                    aVar5.n = 0;
                    aVar5.o = 0;
                    aVar5.p = 0;
                    aVar5.f(i36, this.J, this.K, this.L, this.M, this.A0, this.w0, this.B0, this.x0, i27);
                    aVar = aVar5;
                }
                for (int i37 = 0; i37 < i6; i37++) {
                    aVar.a(tkArr[i37]);
                }
                i30 = 0;
                iArr[0] = aVar.d();
                c = 1;
                iArr[1] = aVar.c();
            }
            iMin = iArr[i30] + i10 + i7;
            iMin2 = iArr[c] + i8 + i9;
            if (i == 1073741824) {
                if (i == Integer.MIN_VALUE) {
                    iMin = Math.min(iMin, i2);
                } else {
                    i11 = i3;
                    if (i != 0) {
                        iMin = i30;
                    }
                }
                if (i11 == 1073741824) {
                    iMin2 = i4;
                } else if (i11 == Integer.MIN_VALUE) {
                    iMin2 = Math.min(iMin2, i4);
                } else if (i11 != 0) {
                    iMin2 = i30;
                }
                this.D0 = iMin;
                this.E0 = iMin2;
                S(iMin);
                P(iMin2);
                if (this.v0 > 0) {
                    z = c;
                } else {
                    z = i30;
                }
                this.C0 = z;
            }
            iMin = i2;
            i11 = i3;
            if (i11 == 1073741824) {
                iMin2 = i4;
            } else if (i11 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i4);
            } else if (i11 != 0) {
                iMin2 = i30;
            }
            this.D0 = iMin;
            this.E0 = iMin2;
            S(iMin);
            P(iMin2);
            if (this.v0 > 0) {
                z = c;
            } else {
                z = i30;
            }
            this.C0 = z;
        }
        IK ik = this.K;
        IK ik2 = this.J;
        IK ik3 = this.L;
        IK ik4 = this.M;
        if (i35 == 1) {
            i7 = i22;
            i8 = i23;
            i9 = i24;
            iArr = iArr2;
            i10 = i34;
            int i38 = this.Z0;
            if (i6 != 0) {
                arrayList.clear();
                a aVar6 = new a(i38, this.J, this.K, this.L, this.M, i27);
                arrayList.add(aVar6);
                if (i38 == 0) {
                    i12 = 0;
                    int i39 = 0;
                    int i40 = 0;
                    while (i40 < i6) {
                        TK tk5 = tkArr[i40];
                        int iZ = Z(tk5, i27);
                        if (tk5.U[0] == aVar3) {
                            i12++;
                        }
                        int i41 = i12;
                        boolean z2 = (i39 == i27 || (this.T0 + i39) + iZ > i27) && aVar6.b != null;
                        if (!z2 && i40 > 0 && (i14 = this.Y0) > 0 && i40 % i14 == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            aVar6 = new a(i38, this.J, this.K, this.L, this.M, i27);
                            aVar6.n = i40;
                            arrayList.add(aVar6);
                        } else {
                            if (i40 > 0) {
                                i39 = this.T0 + iZ + i39;
                            }
                            aVar6.a(tk5);
                            i40++;
                            i12 = i41;
                        }
                        i39 = iZ;
                        aVar6.a(tk5);
                        i40++;
                        i12 = i41;
                    }
                } else {
                    i12 = 0;
                    int i42 = 0;
                    int i43 = 0;
                    while (i43 < i6) {
                        TK tk6 = tkArr[i43];
                        int iY = Y(tk6, i27);
                        if (tk6.U[1] == aVar3) {
                            i12++;
                        }
                        int i44 = i12;
                        boolean z3 = (i42 == i27 || (this.U0 + i42) + iY > i27) && aVar6.b != null;
                        if (!z3 && i43 > 0 && (i13 = this.Y0) > 0 && i43 % i13 == 0) {
                            z3 = true;
                        }
                        if (z3) {
                            aVar6 = new a(i38, this.J, this.K, this.L, this.M, i27);
                            aVar6.n = i43;
                            arrayList.add(aVar6);
                        } else {
                            if (i43 > 0) {
                                i42 = this.U0 + iY + i42;
                            }
                            aVar6.a(tk6);
                            i43++;
                            i12 = i44;
                        }
                        i42 = iY;
                        aVar6.a(tk6);
                        i43++;
                        i12 = i44;
                    }
                }
                int size = arrayList.size();
                int i45 = this.A0;
                int i46 = this.w0;
                int i47 = this.B0;
                int i48 = this.x0;
                TK.a[] aVarArr = this.U;
                boolean z4 = aVarArr[0] == aVar2 || aVarArr[1] == aVar2;
                if (i12 > 0 && z4) {
                    for (int i49 = 0; i49 < size; i49++) {
                        a aVar7 = arrayList.get(i49);
                        if (i38 == 0) {
                            aVar7.e(i27 - aVar7.d());
                        } else {
                            aVar7.e(i27 - aVar7.c());
                        }
                    }
                }
                int i50 = i45;
                int i51 = i46;
                int i52 = i47;
                int i53 = i48;
                IK ik5 = ik2;
                IK ik6 = ik;
                int iMax = 0;
                int i54 = 0;
                IK ik7 = ik3;
                IK ik8 = ik4;
                for (int i55 = 0; i55 < size; i55++) {
                    a aVar8 = arrayList.get(i55);
                    if (i38 == 0) {
                        if (i55 < size - 1) {
                            ik8 = arrayList.get(i55 + 1).b.K;
                            i53 = 0;
                        } else {
                            i53 = this.x0;
                            ik8 = ik4;
                        }
                        IK ik9 = aVar8.b.M;
                        aVar8.f(i38, ik5, ik6, ik7, ik8, i50, i51, i52, i53, i27);
                        iMax = Math.max(iMax, aVar8.d());
                        int iC = aVar8.c() + i54;
                        if (i55 > 0) {
                            iC += this.U0;
                        }
                        i54 = iC;
                        ik6 = ik9;
                        i51 = 0;
                    } else {
                        if (i55 < size - 1) {
                            ik7 = arrayList.get(i55 + 1).b.J;
                            i52 = 0;
                        } else {
                            i52 = this.B0;
                            ik7 = ik3;
                        }
                        IK ik10 = aVar8.b.L;
                        aVar8.f(i38, ik5, ik6, ik7, ik8, i50, i51, i52, i53, i27);
                        int iD = aVar8.d() + iMax;
                        int iMax2 = Math.max(i54, aVar8.c());
                        if (i55 > 0) {
                            iD += this.T0;
                        }
                        i54 = iMax2;
                        iMax = iD;
                        ik5 = ik10;
                        i50 = 0;
                    }
                }
                iArr[0] = iMax;
                iArr[1] = i54;
            }
        } else if (i35 == 2) {
            i7 = i22;
            i8 = i23;
            i9 = i24;
            iArr = iArr2;
            i10 = i34;
            int i56 = this.Z0;
            if (i56 == 0) {
                int i57 = this.Y0;
                if (i57 <= 0) {
                    int i58 = 0;
                    iCeil2 = 0;
                    for (int i59 = 0; i59 < i6; i59++) {
                        if (i59 > 0) {
                            i58 += this.T0;
                        }
                        TK tk7 = tkArr[i59];
                        if (tk7 != null) {
                            int iZ2 = Z(tk7, i27) + i58;
                            if (iZ2 > i27) {
                                break;
                            }
                            iCeil2++;
                            i58 = iZ2;
                        }
                    }
                } else {
                    iCeil2 = i57;
                }
                iCeil = 0;
            } else {
                iCeil = this.Y0;
                if (iCeil <= 0) {
                    int i60 = 0;
                    int i61 = 0;
                    for (int i62 = 0; i62 < i6; i62++) {
                        if (i62 > 0) {
                            i60 += this.U0;
                        }
                        TK tk8 = tkArr[i62];
                        if (tk8 != null) {
                            int iY2 = Y(tk8, i27) + i60;
                            if (iY2 > i27) {
                                break;
                            }
                            i61++;
                            i60 = iY2;
                        }
                    }
                    iCeil = i61;
                }
                iCeil2 = 0;
            }
            if (this.d1 == null) {
                this.d1 = new int[2];
            }
            boolean z5 = (iCeil == 0 && i56 == 1) || (iCeil2 == 0 && i56 == 0);
            while (!z5) {
                if (i56 == 0) {
                    iCeil = (int) Math.ceil(i6 / iCeil2);
                } else {
                    iCeil2 = (int) Math.ceil(i6 / iCeil);
                }
                TK[] tkArr5 = this.c1;
                if (tkArr5 == null || tkArr5.length < iCeil2) {
                    obj = null;
                    this.c1 = new TK[iCeil2];
                } else {
                    obj = null;
                    Arrays.fill(tkArr5, (Object) null);
                }
                TK[] tkArr6 = this.b1;
                if (tkArr6 == null || tkArr6.length < iCeil) {
                    this.b1 = new TK[iCeil];
                } else {
                    Arrays.fill(tkArr6, obj);
                }
                for (int i63 = 0; i63 < iCeil2; i63++) {
                    for (int i64 = 0; i64 < iCeil; i64++) {
                        int i65 = (i64 * iCeil2) + i63;
                        if (i56 == 1) {
                            i65 = (i63 * iCeil) + i64;
                        }
                        if (i65 < tkArr.length && (tk = tkArr[i65]) != null) {
                            int iZ3 = Z(tk, i27);
                            TK tk9 = this.c1[i63];
                            if (tk9 == null || tk9.u() < iZ3) {
                                this.c1[i63] = tk;
                            }
                            int iY3 = Y(tk, i27);
                            TK tk10 = this.b1[i64];
                            if (tk10 == null || tk10.o() < iY3) {
                                this.b1[i64] = tk;
                            }
                        }
                    }
                }
                int iZ4 = 0;
                for (int i66 = 0; i66 < iCeil2; i66++) {
                    TK tk11 = this.c1[i66];
                    if (tk11 != null) {
                        if (i66 > 0) {
                            iZ4 += this.T0;
                        }
                        iZ4 = Z(tk11, i27) + iZ4;
                    }
                }
                int iY4 = 0;
                for (int i67 = 0; i67 < iCeil; i67++) {
                    TK tk12 = this.b1[i67];
                    if (tk12 != null) {
                        if (i67 > 0) {
                            iY4 += this.U0;
                        }
                        iY4 = Y(tk12, i27) + iY4;
                    }
                }
                iArr[0] = iZ4;
                iArr[1] = iY4;
                if (i56 == 0) {
                    if (iZ4 <= i27 || iCeil2 <= 1) {
                        z5 = true;
                    } else {
                        iCeil2--;
                    }
                } else if (iY4 <= i27 || iCeil <= 1) {
                    z5 = true;
                } else {
                    iCeil--;
                }
            }
            int[] iArr3 = this.d1;
            iArr3[0] = iCeil2;
            iArr3[1] = iCeil;
        } else if (i35 != 3) {
            i7 = i22;
            i8 = i23;
            i9 = i24;
            iArr = iArr2;
            i10 = i34;
        } else {
            int i68 = this.Z0;
            if (i6 == 0) {
                i7 = i22;
                i8 = i23;
                i9 = i24;
                iArr = iArr2;
                i10 = i34;
            } else {
                arrayList.clear();
                iArr = iArr2;
                i7 = i22;
                i8 = i23;
                i10 = i34;
                i9 = i24;
                a aVar9 = new a(i68, this.J, this.K, this.L, this.M, i27);
                arrayList.add(aVar9);
                if (i68 == 0) {
                    int i69 = 0;
                    int i70 = 0;
                    i15 = 0;
                    int i71 = 0;
                    while (i69 < i6) {
                        int i72 = i70 + 1;
                        TK tk13 = tkArr[i69];
                        int iZ5 = Z(tk13, i27);
                        int i73 = i68;
                        if (tk13.U[0] == aVar3) {
                            i15++;
                        }
                        int i74 = i15;
                        boolean z6 = (i71 == i27 || (this.T0 + i71) + iZ5 > i27) && aVar9.b != null;
                        if (!z6 && i69 > 0 && (i18 = this.Y0) > 0 && i72 > i18) {
                            z6 = true;
                        }
                        if (z6) {
                            i17 = i69;
                            i68 = i73;
                            aVar9 = new a(i68, this.J, this.K, this.L, this.M, i27);
                            aVar9.n = i17;
                            arrayList.add(aVar9);
                            i71 = iZ5;
                            i70 = i72;
                        } else {
                            i17 = i69;
                            i68 = i73;
                            i71 = i17 > 0 ? this.T0 + iZ5 + i71 : iZ5;
                            i70 = 0;
                        }
                        aVar9.a(tk13);
                        i69 = i17 + 1;
                        i15 = i74;
                    }
                } else {
                    int i75 = 0;
                    int i76 = 0;
                    int i77 = 0;
                    while (i77 < i6) {
                        TK tk14 = tkArr[i77];
                        int iY5 = Y(tk14, i27);
                        if (tk14.U[1] == aVar3) {
                            i75++;
                        }
                        int i78 = i75;
                        boolean z7 = (i76 == i27 || (this.U0 + i76) + iY5 > i27) && aVar9.b != null;
                        if (!z7 && i77 > 0 && (i16 = this.Y0) > 0 && i16 < 0) {
                            z7 = true;
                        }
                        if (z7) {
                            aVar9 = new a(i68, this.J, this.K, this.L, this.M, i27);
                            aVar9.n = i77;
                            arrayList.add(aVar9);
                        } else {
                            if (i77 > 0) {
                                i76 = this.U0 + iY5 + i76;
                            }
                            aVar9.a(tk14);
                            i77++;
                            i75 = i78;
                        }
                        i76 = iY5;
                        aVar9.a(tk14);
                        i77++;
                        i75 = i78;
                    }
                    i15 = i75;
                }
                int size2 = arrayList.size();
                int i79 = this.A0;
                int i80 = this.w0;
                int i81 = this.B0;
                int i82 = this.x0;
                TK.a[] aVarArr2 = this.U;
                boolean z8 = aVarArr2[0] == aVar2 || aVarArr2[1] == aVar2;
                if (i15 > 0 && z8) {
                    for (int i83 = 0; i83 < size2; i83++) {
                        a aVar10 = arrayList.get(i83);
                        if (i68 == 0) {
                            aVar10.e(i27 - aVar10.d());
                        } else {
                            aVar10.e(i27 - aVar10.c());
                        }
                    }
                }
                int i84 = i79;
                int i85 = i80;
                int i86 = i81;
                int i87 = i82;
                IK ik11 = ik2;
                IK ik12 = ik;
                int iMax3 = 0;
                int i88 = 0;
                IK ik13 = ik3;
                IK ik14 = ik4;
                for (int i89 = 0; i89 < size2; i89++) {
                    a aVar11 = arrayList.get(i89);
                    if (i68 == 0) {
                        if (i89 < size2 - 1) {
                            ik14 = arrayList.get(i89 + 1).b.K;
                            i87 = 0;
                        } else {
                            i87 = this.x0;
                            ik14 = ik4;
                        }
                        IK ik15 = aVar11.b.M;
                        aVar11.f(i68, ik11, ik12, ik13, ik14, i84, i85, i86, i87, i27);
                        iMax3 = Math.max(iMax3, aVar11.d());
                        int iC2 = aVar11.c() + i88;
                        if (i89 > 0) {
                            iC2 += this.U0;
                        }
                        i88 = iC2;
                        ik12 = ik15;
                        i85 = 0;
                    } else {
                        if (i89 < size2 - 1) {
                            ik13 = arrayList.get(i89 + 1).b.J;
                            i86 = 0;
                        } else {
                            i86 = this.B0;
                            ik13 = ik3;
                        }
                        IK ik16 = aVar11.b.L;
                        aVar11.f(i68, ik11, ik12, ik13, ik14, i84, i85, i86, i87, i27);
                        int iD2 = aVar11.d() + iMax3;
                        int iMax4 = Math.max(i88, aVar11.c());
                        if (i89 > 0) {
                            iD2 += this.T0;
                        }
                        i88 = iMax4;
                        iMax3 = iD2;
                        ik11 = ik16;
                        i84 = 0;
                    }
                }
                iArr[0] = iMax3;
                iArr[1] = i88;
            }
        }
        c = 1;
        iMin = iArr[i30] + i10 + i7;
        iMin2 = iArr[c] + i8 + i9;
        if (i == 1073741824) {
            if (i == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i2);
            } else {
                i11 = i3;
                if (i != 0) {
                    iMin = i30;
                }
            }
            if (i11 == 1073741824) {
                iMin2 = i4;
            } else if (i11 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i4);
            } else if (i11 != 0) {
                iMin2 = i30;
            }
            this.D0 = iMin;
            this.E0 = iMin2;
            S(iMin);
            P(iMin2);
            if (this.v0 > 0) {
                z = c;
            } else {
                z = i30;
            }
            this.C0 = z;
        }
        iMin = i2;
        i11 = i3;
        if (i11 == 1073741824) {
            iMin2 = i4;
        } else if (i11 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i11 != 0) {
            iMin2 = i30;
        }
        this.D0 = iMin;
        this.E0 = iMin2;
        S(iMin);
        P(iMin2);
        if (this.v0 > 0) {
            z = c;
        } else {
            z = i30;
        }
        this.C0 = z;
    }

    public final int Y(TK tk, int i) {
        TK tk2;
        if (tk == null) {
            return 0;
        }
        if (tk.U[1] == TK.a.g) {
            int i2 = tk.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (tk.z * i);
                if (i3 != tk.o()) {
                    tk.g = true;
                    X(tk, tk.U[0], tk.u(), TK.a.d, i3);
                }
                return i3;
            }
            tk2 = tk;
            if (i2 == 1) {
                return tk2.o();
            }
            if (i2 == 3) {
                return (int) ((tk2.u() * tk2.Y) + 0.5f);
            }
        } else {
            tk2 = tk;
        }
        return tk2.o();
    }

    public final int Z(TK tk, int i) {
        TK tk2;
        if (tk == null) {
            return 0;
        }
        if (tk.U[0] == TK.a.g) {
            int i2 = tk.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (tk.w * i);
                if (i3 != tk.u()) {
                    tk.g = true;
                    X(tk, TK.a.d, i3, tk.U[1], tk.o());
                }
                return i3;
            }
            tk2 = tk;
            if (i2 == 1) {
                return tk2.u();
            }
            if (i2 == 3) {
                return (int) ((tk2.o() * tk2.Y) + 0.5f);
            }
        } else {
            tk2 = tk;
        }
        return tk2.u();
    }

    @Override // defpackage.TK
    public final void e(C4874kQ0 c4874kQ0, boolean z) {
        TK tk;
        float f;
        int i;
        super.e(c4874kQ0, z);
        TK tk2 = this.V;
        boolean z2 = tk2 != null && ((UK) tk2).z0;
        int i2 = this.X0;
        ArrayList<a> arrayList = this.a1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    arrayList.get(i3).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        arrayList.get(i4).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.d1 != null && this.c1 != null && this.b1 != null) {
                for (int i5 = 0; i5 < this.f1; i5++) {
                    this.e1[i5].H();
                }
                int[] iArr = this.d1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.N0;
                TK tk3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.N0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    TK tk4 = this.c1[i];
                    if (tk4 != null && tk4.i0 != 8) {
                        IK ik = tk4.J;
                        if (i8 == 0) {
                            tk4.i(ik, this.J, this.A0);
                            tk4.l0 = this.H0;
                            tk4.f0 = f;
                        }
                        if (i8 == i6 - 1) {
                            tk4.i(tk4.L, this.L, this.B0);
                        }
                        if (i8 > 0 && tk3 != null) {
                            int i9 = this.T0;
                            IK ik2 = tk3.L;
                            tk4.i(ik, ik2, i9);
                            tk3.i(ik2, ik, 0);
                        }
                        tk3 = tk4;
                    }
                    i8++;
                    f2 = f;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    TK tk5 = this.b1[i10];
                    if (tk5 != null && tk5.i0 != 8) {
                        IK ik3 = tk5.K;
                        if (i10 == 0) {
                            tk5.i(ik3, this.K, this.w0);
                            tk5.m0 = this.I0;
                            tk5.g0 = this.O0;
                        }
                        if (i10 == i7 - 1) {
                            tk5.i(tk5.M, this.M, this.x0);
                        }
                        if (i10 > 0 && tk3 != null) {
                            int i11 = this.U0;
                            IK ik4 = tk3.M;
                            tk5.i(ik3, ik4, i11);
                            tk3.i(ik4, ik3, 0);
                        }
                        tk3 = tk5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.Z0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        TK[] tkArr = this.e1;
                        if (i14 < tkArr.length && (tk = tkArr[i14]) != null && tk.i0 != 8) {
                            TK tk6 = this.c1[i12];
                            TK tk7 = this.b1[i13];
                            if (tk != tk6) {
                                tk.i(tk.J, tk6.J, 0);
                                tk.i(tk.L, tk6.L, 0);
                            }
                            if (tk != tk7) {
                                tk.i(tk.K, tk7.K, 0);
                                tk.i(tk.M, tk7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z2, true);
        }
        this.C0 = false;
    }

    @Override // defpackage.C6641so0, defpackage.TK
    public final void j(TK tk, HashMap<TK, TK> map) {
        super.j(tk, map);
        C6187qf0 c6187qf0 = (C6187qf0) tk;
        this.H0 = c6187qf0.H0;
        this.I0 = c6187qf0.I0;
        this.J0 = c6187qf0.J0;
        this.K0 = c6187qf0.K0;
        this.L0 = c6187qf0.L0;
        this.M0 = c6187qf0.M0;
        this.N0 = c6187qf0.N0;
        this.O0 = c6187qf0.O0;
        this.P0 = c6187qf0.P0;
        this.Q0 = c6187qf0.Q0;
        this.R0 = c6187qf0.R0;
        this.S0 = c6187qf0.S0;
        this.T0 = c6187qf0.T0;
        this.U0 = c6187qf0.U0;
        this.V0 = c6187qf0.V0;
        this.W0 = c6187qf0.W0;
        this.X0 = c6187qf0.X0;
        this.Y0 = c6187qf0.Y0;
        this.Z0 = c6187qf0.Z0;
    }
}

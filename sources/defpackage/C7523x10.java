package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: x10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7523x10 {
    public static final C4289hr.a a = new C4289hr.a();

    public static boolean a(TK tk) {
        TK.a[] aVarArr = tk.U;
        TK.a aVar = aVarArr[0];
        TK.a aVar2 = aVarArr[1];
        TK tk2 = tk.V;
        UK uk = tk2 != null ? (UK) tk2 : null;
        TK.a aVar3 = TK.a.d;
        if (uk != null) {
            TK.a aVar4 = uk.U[0];
        }
        if (uk != null) {
            TK.a aVar5 = uk.U[1];
        }
        TK.a aVar6 = TK.a.g;
        TK.a aVar7 = TK.a.e;
        boolean z = aVar == aVar3 || tk.E() || aVar == aVar7 || (aVar == aVar6 && tk.r == 0 && tk.Y == 0.0f && tk.x(0)) || (aVar == aVar6 && tk.r == 1 && tk.y(0, tk.u()));
        boolean z2 = aVar2 == aVar3 || tk.F() || aVar2 == aVar7 || (aVar2 == aVar6 && tk.s == 0 && tk.Y == 0.0f && tk.x(1)) || (aVar2 == aVar6 && tk.s == 1 && tk.y(1, tk.o()));
        return (tk.Y > 0.0f && (z || z2)) || (z && z2);
    }

    public static void b(int i, C4289hr.b bVar, TK tk, boolean z) {
        IK ik;
        IK ik2;
        char c;
        IK ik3;
        IK ik4;
        if (tk.m) {
            return;
        }
        if (!(tk instanceof UK) && tk.D() && a(tk)) {
            UK.Z(tk, bVar, new C4289hr.a());
        }
        IK ikM = tk.m(IK.a.d);
        IK ikM2 = tk.m(IK.a.g);
        int iD = ikM.d();
        int iD2 = ikM2.d();
        HashSet<IK> hashSet = ikM.a;
        TK.a aVar = TK.a.g;
        if (hashSet != null && ikM.c) {
            Iterator<IK> it = hashSet.iterator();
            while (it.hasNext()) {
                IK next = it.next();
                TK tk2 = next.d;
                int i2 = i + 1;
                boolean zA = a(tk2);
                if (tk2.D() && zA) {
                    c = 0;
                    UK.Z(tk2, bVar, new C4289hr.a());
                } else {
                    c = 0;
                }
                IK ik5 = tk2.J;
                IK ik6 = tk2.L;
                char c2 = ((next == ik5 && (ik4 = ik6.f) != null && ik4.c) || (next == ik6 && (ik3 = ik5.f) != null && ik3.c)) ? (char) 1 : c;
                TK.a aVar2 = tk2.U[c];
                if (aVar2 != aVar || zA) {
                    if (!tk2.D()) {
                        if (next == ik5 && ik6.f == null) {
                            int iE = ik5.e() + iD;
                            tk2.N(iE, tk2.u() + iE);
                            b(i2, bVar, tk2, z);
                        } else if (next == ik6 && ik5.f == null) {
                            int iE2 = iD - ik6.e();
                            tk2.N(iE2 - tk2.u(), iE2);
                            b(i2, bVar, tk2, z);
                        } else if (c2 != 0 && !tk2.B()) {
                            c(i2, bVar, tk2, z);
                        }
                    }
                } else if (aVar2 == aVar && tk2.v >= 0 && tk2.u >= 0 && (tk2.i0 == 8 || (tk2.r == 0 && tk2.Y == 0.0f))) {
                    if (!tk2.B() && !tk2.G && c2 != 0 && !tk2.B()) {
                        d(i2, tk, bVar, tk2, z);
                    }
                }
            }
        }
        if (tk instanceof C5589nn0) {
            return;
        }
        HashSet<IK> hashSet2 = ikM2.a;
        if (hashSet2 != null && ikM2.c) {
            Iterator<IK> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                IK next2 = it2.next();
                TK tk3 = next2.d;
                int i3 = i + 1;
                boolean zA2 = a(tk3);
                if (tk3.D() && zA2) {
                    UK.Z(tk3, bVar, new C4289hr.a());
                }
                IK ik7 = tk3.J;
                IK ik8 = tk3.L;
                boolean z2 = (next2 == ik7 && (ik2 = ik8.f) != null && ik2.c) || (next2 == ik8 && (ik = ik7.f) != null && ik.c);
                TK.a aVar3 = tk3.U[0];
                if (aVar3 != aVar || zA2) {
                    if (!tk3.D()) {
                        if (next2 == ik7 && ik8.f == null) {
                            int iE3 = ik7.e() + iD2;
                            tk3.N(iE3, tk3.u() + iE3);
                            b(i3, bVar, tk3, z);
                        } else if (next2 == ik8 && ik7.f == null) {
                            int iE4 = iD2 - ik8.e();
                            tk3.N(iE4 - tk3.u(), iE4);
                            b(i3, bVar, tk3, z);
                        } else if (z2 && !tk3.B()) {
                            c(i3, bVar, tk3, z);
                        }
                    }
                } else if (aVar3 == aVar && tk3.v >= 0 && tk3.u >= 0) {
                    if (tk3.i0 == 8 || (tk3.r == 0 && tk3.Y == 0.0f)) {
                        if (!tk3.B() && !tk3.G && z2 && !tk3.B()) {
                            d(i3, tk, bVar, tk3, z);
                        }
                    }
                }
            }
        }
        tk.m = true;
    }

    public static void c(int i, C4289hr.b bVar, TK tk, boolean z) {
        float f = tk.f0;
        IK ik = tk.J;
        int iD = ik.f.d();
        IK ik2 = tk.L;
        int iD2 = ik2.f.d();
        int iE = ik.e() + iD;
        int iE2 = iD2 - ik2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iU = tk.u();
        int i2 = (iD2 - iD) - iU;
        if (iD > iD2) {
            i2 = (iD - iD2) - iU;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iD;
        int i4 = i3 + iU;
        if (iD > iD2) {
            i4 = i3 - iU;
        }
        tk.N(i3, i4);
        b(i + 1, bVar, tk, z);
    }

    public static void d(int i, TK tk, C4289hr.b bVar, TK tk2, boolean z) {
        float f = tk2.f0;
        IK ik = tk2.J;
        int iE = ik.e() + ik.f.d();
        IK ik2 = tk2.L;
        int iD = ik2.f.d() - ik2.e();
        if (iD >= iE) {
            int iU = tk2.u();
            if (tk2.i0 != 8) {
                int i2 = tk2.r;
                if (i2 == 2) {
                    iU = (int) (tk2.f0 * 0.5f * (tk instanceof UK ? tk.u() : tk.V.u()));
                } else if (i2 == 0) {
                    iU = iD - iE;
                }
                iU = Math.max(tk2.u, iU);
                int i3 = tk2.v;
                if (i3 > 0) {
                    iU = Math.min(i3, iU);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iU)) + 0.5f));
            tk2.N(i4, iU + i4);
            b(i + 1, bVar, tk2, z);
        }
    }

    public static void e(int i, C4289hr.b bVar, TK tk) {
        float f = tk.g0;
        IK ik = tk.K;
        int iD = ik.f.d();
        IK ik2 = tk.M;
        int iD2 = ik2.f.d();
        int iE = ik.e() + iD;
        int iE2 = iD2 - ik2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iO = tk.o();
        int i2 = (iD2 - iD) - iO;
        if (iD > iD2) {
            i2 = (iD - iD2) - iO;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iD + i3;
        int i5 = i4 + iO;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iO;
        }
        tk.O(i4, i5);
        g(i + 1, bVar, tk);
    }

    public static void f(int i, TK tk, C4289hr.b bVar, TK tk2) {
        float f = tk2.g0;
        IK ik = tk2.K;
        int iE = ik.e() + ik.f.d();
        IK ik2 = tk2.M;
        int iD = ik2.f.d() - ik2.e();
        if (iD >= iE) {
            int iO = tk2.o();
            if (tk2.i0 != 8) {
                int i2 = tk2.s;
                if (i2 == 2) {
                    iO = (int) (f * 0.5f * (tk instanceof UK ? tk.o() : tk.V.o()));
                } else if (i2 == 0) {
                    iO = iD - iE;
                }
                iO = Math.max(tk2.x, iO);
                int i3 = tk2.y;
                if (i3 > 0) {
                    iO = Math.min(i3, iO);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iO)) + 0.5f));
            tk2.O(i4, iO + i4);
            g(i + 1, bVar, tk2);
        }
    }

    public static void g(int i, C4289hr.b bVar, TK tk) {
        boolean z;
        IK ik;
        IK ik2;
        IK ik3;
        IK ik4;
        if (tk.n) {
            return;
        }
        if (!(tk instanceof UK) && tk.D() && a(tk)) {
            UK.Z(tk, bVar, new C4289hr.a());
        }
        IK ikM = tk.m(IK.a.e);
        IK ikM2 = tk.m(IK.a.h);
        int iD = ikM.d();
        int iD2 = ikM2.d();
        HashSet<IK> hashSet = ikM.a;
        TK.a aVar = TK.a.g;
        if (hashSet != null && ikM.c) {
            Iterator<IK> it = hashSet.iterator();
            while (it.hasNext()) {
                IK next = it.next();
                TK tk2 = next.d;
                int i2 = i + 1;
                boolean zA = a(tk2);
                if (tk2.D() && zA) {
                    UK.Z(tk2, bVar, new C4289hr.a());
                }
                IK ik5 = tk2.K;
                IK ik6 = tk2.M;
                boolean z2 = (next == ik5 && (ik4 = ik6.f) != null && ik4.c) || (next == ik6 && (ik3 = ik5.f) != null && ik3.c);
                TK.a aVar2 = tk2.U[1];
                if (aVar2 != aVar || zA) {
                    if (!tk2.D()) {
                        if (next == ik5 && ik6.f == null) {
                            int iE = ik5.e() + iD;
                            tk2.O(iE, tk2.o() + iE);
                            g(i2, bVar, tk2);
                        } else if (next == ik6 && ik5.f == null) {
                            int iE2 = iD - ik6.e();
                            tk2.O(iE2 - tk2.o(), iE2);
                            g(i2, bVar, tk2);
                        } else if (z2 && !tk2.C()) {
                            e(i2, bVar, tk2);
                        }
                    }
                } else if (aVar2 == aVar && tk2.y >= 0 && tk2.x >= 0 && (tk2.i0 == 8 || (tk2.s == 0 && tk2.Y == 0.0f))) {
                    if (!tk2.C() && !tk2.G && z2 && !tk2.C()) {
                        f(i2, tk, bVar, tk2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (tk instanceof C5589nn0) {
            return;
        }
        HashSet<IK> hashSet2 = ikM2.a;
        if (hashSet2 != null && ikM2.c) {
            Iterator<IK> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                IK next2 = it2.next();
                TK tk3 = next2.d;
                int i3 = i + 1;
                boolean zA2 = a(tk3);
                if (tk3.D() && zA2) {
                    UK.Z(tk3, bVar, new C4289hr.a());
                }
                IK ik7 = tk3.K;
                IK ik8 = tk3.M;
                boolean z4 = (next2 == ik7 && (ik2 = ik8.f) != null && ik2.c) || (next2 == ik8 && (ik = ik7.f) != null && ik.c);
                TK.a aVar3 = tk3.U[1];
                if (aVar3 != aVar || zA2) {
                    if (!tk3.D()) {
                        if (next2 == ik7 && ik8.f == null) {
                            int iE3 = ik7.e() + iD2;
                            tk3.O(iE3, tk3.o() + iE3);
                            g(i3, bVar, tk3);
                        } else if (next2 == ik8 && ik7.f == null) {
                            int iE4 = iD2 - ik8.e();
                            tk3.O(iE4 - tk3.o(), iE4);
                            g(i3, bVar, tk3);
                        } else if (z4 && !tk3.C()) {
                            e(i3, bVar, tk3);
                        }
                    }
                } else if (aVar3 == aVar && tk3.y >= 0 && tk3.x >= 0 && (tk3.i0 == 8 || (tk3.s == 0 && tk3.Y == 0.0f))) {
                    if (!tk3.C() && !tk3.G && z4 && !tk3.C()) {
                        f(i3, tk, bVar, tk3);
                    }
                }
            }
        }
        IK ikM3 = tk.m(IK.a.i);
        if (ikM3.a != null && ikM3.c) {
            int iD3 = ikM3.d();
            for (IK ik9 : ikM3.a) {
                TK tk4 = ik9.d;
                int i4 = i + 1;
                boolean zA3 = a(tk4);
                if (tk4.D() && zA3) {
                    UK.Z(tk4, bVar, new C4289hr.a());
                }
                if (tk4.U[z3 ? 1 : 0] != aVar || zA3) {
                    if (!tk4.D()) {
                        IK ik10 = tk4.N;
                        if (ik9 == ik10) {
                            int iE5 = ik9.e() + iD3;
                            if (tk4.E) {
                                int i5 = iE5 - tk4.c0;
                                int i6 = tk4.X + i5;
                                tk4.b0 = i5;
                                tk4.K.l(i5);
                                tk4.M.l(i6);
                                ik10.l(iE5);
                                z = z3 ? 1 : 0;
                                tk4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            g(i4, bVar, tk4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        tk.n = z3;
    }
}

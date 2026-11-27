package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class CX {
    public UK a;
    public boolean b;
    public boolean c;
    public UK d;
    public ArrayList<Fi2> e;
    public C4289hr.b f;
    public C4289hr.a g;
    public ArrayList<C6932uB1> h;

    public final void a(DX dx, int i, ArrayList arrayList, C6932uB1 c6932uB1) {
        Fi2 fi2 = dx.d;
        if (fi2.c == null) {
            UK uk = this.a;
            if (fi2 == uk.d || fi2 == uk.e) {
                return;
            }
            if (c6932uB1 == null) {
                c6932uB1 = new C6932uB1();
                c6932uB1.a = null;
                c6932uB1.b = new ArrayList<>();
                c6932uB1.a = fi2;
                arrayList.add(c6932uB1);
            }
            fi2.c = c6932uB1;
            c6932uB1.b.add(fi2);
            DX dx2 = fi2.h;
            for (InterfaceC7206vX interfaceC7206vX : dx2.k) {
                if (interfaceC7206vX instanceof DX) {
                    a((DX) interfaceC7206vX, i, arrayList, c6932uB1);
                }
            }
            DX dx3 = fi2.i;
            for (InterfaceC7206vX interfaceC7206vX2 : dx3.k) {
                if (interfaceC7206vX2 instanceof DX) {
                    a((DX) interfaceC7206vX2, i, arrayList, c6932uB1);
                }
            }
            if (i == 1 && (fi2 instanceof C6600sd2)) {
                for (InterfaceC7206vX interfaceC7206vX3 : ((C6600sd2) fi2).k.k) {
                    if (interfaceC7206vX3 instanceof DX) {
                        a((DX) interfaceC7206vX3, i, arrayList, c6932uB1);
                    }
                }
            }
            Iterator it = dx2.l.iterator();
            while (it.hasNext()) {
                a((DX) it.next(), i, arrayList, c6932uB1);
            }
            Iterator it2 = dx3.l.iterator();
            while (it2.hasNext()) {
                a((DX) it2.next(), i, arrayList, c6932uB1);
            }
            if (i == 1 && (fi2 instanceof C6600sd2)) {
                Iterator it3 = ((C6600sd2) fi2).k.l.iterator();
                while (it3.hasNext()) {
                    a((DX) it3.next(), i, arrayList, c6932uB1);
                }
            }
        }
    }

    public final void b(UK uk) {
        TK.a aVar;
        TK.a aVar2;
        float f;
        TK.a aVar3;
        TK.a aVar4;
        TK.a aVar5;
        TK.a aVar6;
        Iterator<TK> it = uk.u0.iterator();
        while (it.hasNext()) {
            TK next = it.next();
            TK.a[] aVarArr = next.U;
            TK.a aVar7 = aVarArr[0];
            TK.a aVar8 = aVarArr[1];
            if (next.i0 == 8) {
                next.a = true;
            } else {
                float f2 = next.w;
                TK.a aVar9 = TK.a.g;
                if (f2 < 1.0f && aVar7 == aVar9) {
                    next.r = 2;
                }
                float f3 = next.z;
                if (f3 < 1.0f && aVar8 == aVar9) {
                    next.s = 2;
                }
                float f4 = next.Y;
                TK.a aVar10 = TK.a.e;
                TK.a aVar11 = TK.a.d;
                if (f4 > 0.0f) {
                    if (aVar7 == aVar9 && (aVar8 == aVar10 || aVar8 == aVar11)) {
                        next.r = 3;
                    } else if (aVar8 == aVar9 && (aVar7 == aVar10 || aVar7 == aVar11)) {
                        next.s = 3;
                    } else if (aVar7 == aVar9 && aVar8 == aVar9) {
                        if (next.r == 0) {
                            next.r = 3;
                        }
                        if (next.s == 0) {
                            next.s = 3;
                        }
                    }
                }
                IK ik = next.L;
                IK ik2 = next.J;
                if (aVar7 == aVar9 && next.r == 1 && (ik2.f == null || ik.f == null)) {
                    aVar7 = aVar10;
                }
                IK ik3 = next.M;
                IK ik4 = next.K;
                if (aVar8 == aVar9 && next.s == 1 && (ik4.f == null || ik3.f == null)) {
                    aVar8 = aVar10;
                }
                C3654ep0 c3654ep0 = next.d;
                c3654ep0.d = aVar7;
                int i = next.r;
                c3654ep0.a = i;
                C6600sd2 c6600sd2 = next.e;
                c6600sd2.d = aVar8;
                Iterator<TK> it2 = it;
                int i2 = next.s;
                c6600sd2.a = i2;
                TK.a aVar12 = TK.a.h;
                if ((aVar7 == aVar12 || aVar7 == aVar11 || aVar7 == aVar10) && (aVar8 == aVar12 || aVar8 == aVar11 || aVar8 == aVar10)) {
                    TK.a aVar13 = aVar8;
                    int iU = next.u();
                    if (aVar7 == aVar12) {
                        iU = (uk.u() - ik2.g) - ik.g;
                        aVar7 = aVar11;
                    }
                    int i3 = iU;
                    int iO = next.o();
                    if (aVar13 == aVar12) {
                        iO = (uk.o() - ik4.g) - ik3.g;
                        aVar13 = aVar11;
                    }
                    f(next, aVar7, i3, aVar13, iO);
                    next.d.e.d(next.u());
                    next.e.e.d(next.o());
                    next.a = true;
                } else {
                    IK[] ikArr = next.R;
                    if (aVar7 != aVar9 || (aVar8 != aVar10 && aVar8 != aVar11)) {
                        aVar = aVar7;
                        aVar2 = aVar10;
                        f = f3;
                        aVar3 = aVar11;
                        aVar4 = aVar8;
                    } else if (i == 3) {
                        if (aVar8 == aVar10) {
                            f(next, aVar10, 0, aVar10, 0);
                        }
                        int iO2 = next.o();
                        f(next, aVar11, (int) ((iO2 * next.Y) + 0.5f), aVar11, iO2);
                        next.d.e.d(next.u());
                        next.e.e.d(next.o());
                        next.a = true;
                    } else {
                        aVar = aVar7;
                        aVar2 = aVar10;
                        aVar3 = aVar11;
                        if (i == 1) {
                            f(next, aVar2, 0, aVar8, 0);
                            next.d.e.m = next.u();
                        } else {
                            f = f3;
                            aVar4 = aVar8;
                            if (i == 2) {
                                TK.a aVar14 = uk.U[0];
                                if (aVar14 == aVar3 || aVar14 == aVar12) {
                                    f(next, aVar3, (int) ((f2 * uk.u()) + 0.5f), aVar4, next.o());
                                    next.d.e.d(next.u());
                                    next.e.e.d(next.o());
                                    next.a = true;
                                }
                            } else if (ikArr[0].f == null || ikArr[1].f == null) {
                                f(next, aVar2, 0, aVar4, 0);
                                next.d.e.d(next.u());
                                next.e.e.d(next.o());
                                next.a = true;
                            }
                        }
                    }
                    if (aVar4 != aVar9 || (aVar != aVar2 && aVar != aVar3)) {
                        TK.a aVar15 = aVar;
                        aVar5 = aVar2;
                        aVar6 = aVar15;
                    } else if (i2 == 3) {
                        if (aVar == aVar2) {
                            f(next, aVar2, 0, aVar2, 0);
                        }
                        int iU2 = next.u();
                        float f5 = next.Y;
                        if (next.Z == -1) {
                            f5 = 1.0f / f5;
                        }
                        f(next, aVar3, iU2, aVar3, (int) ((iU2 * f5) + 0.5f));
                        next.d.e.d(next.u());
                        next.e.e.d(next.o());
                        next.a = true;
                    } else if (i2 == 1) {
                        f(next, aVar, 0, aVar2, 0);
                        next.e.e.m = next.o();
                    } else {
                        TK.a aVar16 = aVar;
                        aVar5 = aVar2;
                        if (i2 == 2) {
                            TK.a aVar17 = uk.U[1];
                            if (aVar17 == aVar3 || aVar17 == aVar12) {
                                f(next, aVar16, next.u(), aVar3, (int) ((f * uk.o()) + 0.5f));
                                next.d.e.d(next.u());
                                next.e.e.d(next.o());
                                next.a = true;
                            } else {
                                aVar6 = aVar16;
                            }
                        } else {
                            aVar6 = aVar16;
                            if (ikArr[2].f == null || ikArr[3].f == null) {
                                f(next, aVar5, 0, aVar4, 0);
                                next.d.e.d(next.u());
                                next.e.e.d(next.o());
                                next.a = true;
                            }
                        }
                    }
                    if (aVar6 == aVar9 && aVar4 == aVar9) {
                        if (i == 1 || i2 == 1) {
                            f(next, aVar5, 0, aVar5, 0);
                            next.d.e.m = next.u();
                            next.e.e.m = next.o();
                        } else if (i2 == 2 && i == 2) {
                            TK.a[] aVarArr2 = uk.U;
                            if (aVarArr2[0] == aVar3 && aVarArr2[1] == aVar3) {
                                f(next, aVar3, (int) ((f2 * uk.u()) + 0.5f), aVar3, (int) ((f * uk.o()) + 0.5f));
                                next.d.e.d(next.u());
                                next.e.e.d(next.o());
                                next.a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public final void c() {
        ArrayList<Fi2> arrayList = this.e;
        arrayList.clear();
        UK uk = this.d;
        uk.d.f();
        uk.e.f();
        arrayList.add(uk.d);
        arrayList.add(uk.e);
        HashSet hashSet = null;
        for (TK tk : uk.u0) {
            if (tk instanceof C5589nn0) {
                C5799on0 c5799on0 = new C5799on0(tk);
                tk.d.f();
                tk.e.f();
                c5799on0.f = ((C5589nn0) tk).y0;
                arrayList.add(c5799on0);
            } else {
                if (tk.B()) {
                    if (tk.b == null) {
                        tk.b = new C6883tz(tk, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(tk.b);
                } else {
                    arrayList.add(tk.d);
                }
                if (tk.C()) {
                    if (tk.c == null) {
                        tk.c = new C6883tz(tk, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(tk.c);
                } else {
                    arrayList.add(tk.e);
                }
                if (tk instanceof C6641so0) {
                    arrayList.add(new C6431ro0(tk));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<Fi2> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (Fi2 fi2 : arrayList) {
            if (fi2.b != uk) {
                fi2.d();
            }
        }
        ArrayList<C6932uB1> arrayList2 = this.h;
        arrayList2.clear();
        UK uk2 = this.a;
        e(uk2.d, 0, arrayList2);
        e(uk2.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(UK uk, int i) {
        ArrayList<C6932uB1> arrayList;
        int i2;
        int i3;
        long j;
        float f;
        long j2;
        ArrayList<C6932uB1> arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax = 0;
        while (i4 < size) {
            Fi2 fi2 = arrayList2.get(i4).a;
            if (!(fi2 instanceof C6883tz) ? !(i != 0 ? (fi2 instanceof C6600sd2) : (fi2 instanceof C3654ep0)) : ((C6883tz) fi2).f != i) {
                DX dx = (i == 0 ? uk.d : uk.e).h;
                DX dx2 = (i == 0 ? uk.d : uk.e).i;
                boolean zContains = fi2.h.l.contains(dx);
                DX dx3 = fi2.i;
                boolean zContains2 = dx3.l.contains(dx2);
                long j3 = fi2.j();
                DX dx4 = fi2.h;
                if (zContains && zContains2) {
                    long jB = C6932uB1.b(dx4, 0L);
                    ArrayList<C6932uB1> arrayList3 = arrayList2;
                    i2 = size;
                    long jA = C6932uB1.a(dx3, 0L);
                    long j4 = jB - j3;
                    int i5 = dx3.f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += (long) i5;
                    }
                    long j5 = (-jA) - j3;
                    long j6 = dx4.f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    TK tk = fi2.b;
                    if (i == 0) {
                        f = tk.f0;
                    } else if (i == 1) {
                        f = tk.g0;
                    } else {
                        tk.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j4 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) dx4.f) + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) BX.a(1.0f, f, f2, 0.5f)))) - ((long) dx3.f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    if (zContains) {
                        j = Math.max(C6932uB1.b(dx4, dx4.f), ((long) dx4.f) + j3);
                    } else if (zContains2) {
                        j = Math.max(-C6932uB1.a(dx3, dx3.f), ((long) (-dx3.f)) + j3);
                    } else {
                        j = (fi2.j() + ((long) dx4.f)) - ((long) dx3.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                j = 0;
            }
            jMax = Math.max(jMax, j);
            i4 = i3 + 1;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(Fi2 fi2, int i, ArrayList<C6932uB1> arrayList) {
        DX dx;
        Iterator it = fi2.h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dx = fi2.i;
            if (!zHasNext) {
                break;
            }
            InterfaceC7206vX interfaceC7206vX = (InterfaceC7206vX) it.next();
            if (interfaceC7206vX instanceof DX) {
                a((DX) interfaceC7206vX, i, arrayList, null);
            } else if (interfaceC7206vX instanceof Fi2) {
                a(((Fi2) interfaceC7206vX).h, i, arrayList, null);
            }
        }
        for (InterfaceC7206vX interfaceC7206vX2 : dx.k) {
            if (interfaceC7206vX2 instanceof DX) {
                a((DX) interfaceC7206vX2, i, arrayList, null);
            } else if (interfaceC7206vX2 instanceof Fi2) {
                a(((Fi2) interfaceC7206vX2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC7206vX interfaceC7206vX3 : ((C6600sd2) fi2).k.k) {
                if (interfaceC7206vX3 instanceof DX) {
                    a((DX) interfaceC7206vX3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(TK tk, TK.a aVar, int i, TK.a aVar2, int i2) {
        C4289hr.a aVar3 = this.g;
        aVar3.a = aVar;
        aVar3.b = aVar2;
        aVar3.c = i;
        aVar3.d = i2;
        ((ConstraintLayout.b) this.f).b(tk, aVar3);
        tk.S(aVar3.e);
        tk.P(aVar3.f);
        tk.E = aVar3.h;
        tk.M(aVar3.g);
    }

    public final void g() {
        C2821ar c2821ar;
        for (TK tk : this.a.u0) {
            if (!tk.a) {
                TK.a[] aVarArr = tk.U;
                boolean z = false;
                TK.a aVar = aVarArr[0];
                TK.a aVar2 = aVarArr[1];
                int i = tk.r;
                int i2 = tk.s;
                TK.a aVar3 = TK.a.e;
                TK.a aVar4 = TK.a.g;
                boolean z2 = aVar == aVar3 || (aVar == aVar4 && i == 1);
                if (aVar2 == aVar3 || (aVar2 == aVar4 && i2 == 1)) {
                    z = true;
                }
                C7312w10 c7312w10 = tk.d.e;
                boolean z3 = c7312w10.j;
                C7312w10 c7312w11 = tk.e.e;
                boolean z4 = c7312w11.j;
                boolean z5 = z2;
                TK.a aVar5 = TK.a.d;
                if (z3 && z4) {
                    f(tk, aVar5, c7312w10.g, aVar5, c7312w11.g);
                    tk.a = true;
                } else if (z3 && z) {
                    f(tk, aVar5, c7312w10.g, aVar3, c7312w11.g);
                    if (aVar2 == aVar4) {
                        tk.e.e.m = tk.o();
                    } else {
                        tk.e.e.d(tk.o());
                        tk.a = true;
                    }
                } else if (z4 && z5) {
                    f(tk, aVar3, c7312w10.g, aVar5, c7312w11.g);
                    if (aVar == aVar4) {
                        tk.d.e.m = tk.u();
                    } else {
                        tk.d.e.d(tk.u());
                        tk.a = true;
                    }
                }
                if (tk.a && (c2821ar = tk.e.l) != null) {
                    c2821ar.d(tk.c0);
                }
            }
        }
    }
}

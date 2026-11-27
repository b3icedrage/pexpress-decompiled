package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6883tz extends Fi2 {
    public final ArrayList<Fi2> k;
    public int l;

    public C6883tz(TK tk, int i) {
        TK tk2;
        super(tk);
        this.k = new ArrayList<>();
        this.f = i;
        TK tk3 = this.b;
        TK tkQ = tk3.q(i);
        while (true) {
            TK tk4 = tkQ;
            tk2 = tk3;
            tk3 = tk4;
            if (tk3 == null) {
                break;
            } else {
                tkQ = tk3.q(this.f);
            }
        }
        this.b = tk2;
        int i2 = this.f;
        Fi2 fi2 = i2 == 0 ? tk2.d : i2 == 1 ? tk2.e : null;
        ArrayList<Fi2> arrayList = this.k;
        arrayList.add(fi2);
        TK tkP = tk2.p(this.f);
        while (tkP != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? tkP.d : i3 == 1 ? tkP.e : null);
            tkP = tkP.p(this.f);
        }
        for (Fi2 fi3 : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                fi3.b.b = this;
            } else if (i4 == 1) {
                fi3.b.c = this;
            }
        }
        if (this.f == 0 && ((UK) this.b.V).z0 && arrayList.size() > 1) {
            this.b = ((Fi2) C1742Pc.c(1, arrayList)).b;
        }
        this.l = this.f == 0 ? this.b.l0 : this.b.m0;
    }

    /* JADX WARN: Code duplicated, block: B:294:0x00f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    @Override // defpackage.Fi2, defpackage.InterfaceC7206vX
    public final void a(InterfaceC7206vX interfaceC7206vX) {
        int i;
        TK.a aVar;
        boolean z;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f3;
        DX dx = this.h;
        if (dx.j) {
            DX dx2 = this.i;
            if (dx2.j) {
                TK tk = this.b.V;
                boolean z2 = tk instanceof UK ? ((UK) tk).z0 : false;
                int i15 = dx2.g - dx.g;
                ArrayList<Fi2> arrayList = this.k;
                int size = arrayList.size();
                int i16 = 0;
                while (true) {
                    i = -1;
                    if (i16 >= size) {
                        i16 = -1;
                        break;
                    } else if (arrayList.get(i16).b.i0 != 8) {
                        break;
                    } else {
                        i16++;
                    }
                }
                int i17 = size - 1;
                for (int i18 = i17; i18 >= 0; i18--) {
                    if (arrayList.get(i18).b.i0 != 8) {
                        i = i18;
                        break;
                    }
                }
                int i19 = 0;
                while (true) {
                    aVar = TK.a.g;
                    if (i19 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i20 = 0;
                    i4 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    while (i20 < size) {
                        Fi2 fi2 = arrayList.get(i20);
                        TK tk2 = fi2.b;
                        boolean z3 = z2;
                        int i23 = i19;
                        if (tk2.i0 != 8) {
                            i22++;
                            if (i20 > 0 && i20 >= i16) {
                                i4 += fi2.h.f;
                            }
                            C7312w10 c7312w10 = fi2.e;
                            int i24 = c7312w10.g;
                            boolean z4 = fi2.d != aVar;
                            if (z4) {
                                int i25 = this.f;
                                if (i25 == 0 && !tk2.d.e.j) {
                                    return;
                                }
                                if (i25 == 1 && !tk2.e.e.j) {
                                    return;
                                } else {
                                    i13 = i4;
                                }
                            } else {
                                i13 = i4;
                                if (fi2.a == 1 && i23 == 0) {
                                    i14 = c7312w10.m;
                                    i21++;
                                } else {
                                    if (c7312w10.j) {
                                        i14 = i24;
                                    }
                                    if (z4) {
                                        i4 = i13 + i14;
                                    } else {
                                        i21++;
                                        f3 = tk2.n0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                        i4 = i13;
                                    }
                                    if (i20 >= i17 && i20 < i) {
                                        i4 += -fi2.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i21++;
                                    f3 = tk2.n0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                    i4 = i13;
                                } else {
                                    i4 = i13 + i14;
                                }
                                if (i20 >= i17) {
                                }
                            }
                            i14 = i24;
                            if (z4) {
                                i21++;
                                f3 = tk2.n0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                                i4 = i13;
                            } else {
                                i4 = i13 + i14;
                            }
                            if (i20 >= i17) {
                            }
                        }
                        i20++;
                        z2 = z3;
                        i19 = i23;
                    }
                    z = z2;
                    int i26 = i19;
                    if (i4 < i15 || i21 == 0) {
                        i2 = i21;
                        i3 = i22;
                        break;
                    } else {
                        i19 = i26 + 1;
                        z2 = z;
                    }
                }
                int i27 = dx.g;
                if (z) {
                    i27 = dx2.g;
                }
                float f4 = 0.5f;
                if (i4 > i15) {
                    i27 = z ? i27 + ((int) (((i4 - i15) / 2.0f) + 0.5f)) : i27 - ((int) (((i4 - i15) / 2.0f) + 0.5f));
                }
                if (i2 > 0) {
                    float f5 = i15 - i4;
                    int i28 = (int) ((f5 / i2) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        float f6 = f4;
                        Fi2 fi3 = arrayList.get(i29);
                        int i31 = i27;
                        TK tk3 = fi3.b;
                        int i32 = i2;
                        float f7 = f5;
                        if (tk3.i0 != 8 && fi3.d == aVar) {
                            C7312w10 c7312w11 = fi3.e;
                            if (c7312w11.j) {
                                i10 = i28;
                            } else {
                                if (f > 0.0f) {
                                    i9 = (int) (((tk3.n0[this.f] * f7) / f) + f6);
                                    i10 = i28;
                                } else {
                                    i9 = i28;
                                    i10 = i9;
                                }
                                if (this.f == 0) {
                                    i11 = tk3.v;
                                    i12 = tk3.u;
                                } else {
                                    i11 = tk3.y;
                                    i12 = tk3.x;
                                }
                                int iMax = Math.max(i12, fi3.a == 1 ? Math.min(i9, c7312w11.m) : i9);
                                if (i11 > 0) {
                                    iMax = Math.min(i11, iMax);
                                }
                                if (iMax != i9) {
                                    i30++;
                                    i9 = iMax;
                                }
                                c7312w11.d(i9);
                            }
                        } else {
                            i10 = i28;
                        }
                        i29++;
                        i27 = i31;
                        f4 = f6;
                        i2 = i32;
                        f5 = f7;
                        i28 = i10;
                    }
                    i5 = i27;
                    f2 = f4;
                    int i33 = i2;
                    if (i30 > 0) {
                        i2 = i33 - i30;
                        i4 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            Fi2 fi4 = arrayList.get(i34);
                            if (fi4.b.i0 != 8) {
                                if (i34 > 0 && i34 >= i16) {
                                    i4 += fi4.h.f;
                                }
                                i4 += fi4.e.g;
                                if (i34 < i17 && i34 < i) {
                                    i4 += -fi4.i.f;
                                }
                            }
                        }
                    } else {
                        i2 = i33;
                    }
                    i7 = 2;
                    if (this.l == 2 && i30 == 0) {
                        i6 = 0;
                        this.l = 0;
                    } else {
                        i6 = 0;
                    }
                } else {
                    i5 = i27;
                    f2 = 0.5f;
                    i6 = 0;
                    i7 = 2;
                }
                if (i4 > i15) {
                    this.l = i7;
                }
                if (i3 > 0 && i2 == 0 && i16 == i) {
                    this.l = i7;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i3 > 1 ? (i15 - i4) / (i3 - 1) : i3 == 1 ? (i15 - i4) / 2 : i6;
                    if (i2 > 0) {
                        i36 = i6;
                    }
                    int i37 = i5;
                    for (int i38 = i6; i38 < size; i38++) {
                        Fi2 fi5 = arrayList.get(z ? size - (i38 + 1) : i38);
                        int i39 = fi5.b.i0;
                        DX dx3 = fi5.i;
                        DX dx4 = fi5.h;
                        if (i39 == 8) {
                            dx4.d(i37);
                            dx3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i16) {
                                i37 = z ? i37 - dx4.f : i37 + dx4.f;
                            }
                            if (z) {
                                dx3.d(i37);
                            } else {
                                dx4.d(i37);
                            }
                            C7312w10 c7312w12 = fi5.e;
                            int i40 = c7312w12.g;
                            if (fi5.d == aVar) {
                                i8 = i37;
                                if (fi5.a == 1) {
                                    i40 = c7312w12.m;
                                }
                            } else {
                                i8 = i37;
                            }
                            i37 = z ? i8 - i40 : i8 + i40;
                            if (z) {
                                dx4.d(i37);
                            } else {
                                dx3.d(i37);
                            }
                            fi5.g = true;
                            if (i38 < i17 && i38 < i) {
                                i37 = z ? i37 - (-dx3.f) : i37 + (-dx3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i41 = (i15 - i4) / (i3 + 1);
                    if (i2 > 0) {
                        i41 = i6;
                    }
                    int i42 = i5;
                    for (int i43 = i6; i43 < size; i43++) {
                        Fi2 fi6 = arrayList.get(z ? size - (i43 + 1) : i43);
                        int i44 = fi6.b.i0;
                        DX dx5 = fi6.i;
                        DX dx6 = fi6.h;
                        if (i44 == 8) {
                            dx6.d(i42);
                            dx5.d(i42);
                        } else {
                            int i45 = z ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i16) {
                                i45 = z ? i45 - dx6.f : i45 + dx6.f;
                            }
                            if (z) {
                                dx5.d(i45);
                            } else {
                                dx6.d(i45);
                            }
                            C7312w10 c7312w13 = fi6.e;
                            int iMin = c7312w13.g;
                            if (fi6.d == aVar && fi6.a == 1) {
                                iMin = Math.min(iMin, c7312w13.m);
                            }
                            i42 = z ? i45 - iMin : i45 + iMin;
                            if (z) {
                                dx6.d(i42);
                            } else {
                                dx5.d(i42);
                            }
                            if (i43 < i17 && i43 < i) {
                                i42 = z ? i42 - (-dx5.f) : i42 + (-dx5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    float f8 = this.f == 0 ? this.b.f0 : this.b.g0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i46 = (int) (((i15 - i4) * f8) + f2);
                    if (i46 < 0 || i2 > 0) {
                        i46 = i6;
                    }
                    int i47 = z ? i5 - i46 : i5 + i46;
                    for (int i48 = i6; i48 < size; i48++) {
                        Fi2 fi7 = arrayList.get(z ? size - (i48 + 1) : i48);
                        int i49 = fi7.b.i0;
                        DX dx7 = fi7.i;
                        DX dx8 = fi7.h;
                        if (i49 == 8) {
                            dx8.d(i47);
                            dx7.d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i16) {
                                i47 = z ? i47 - dx8.f : i47 + dx8.f;
                            }
                            if (z) {
                                dx7.d(i47);
                            } else {
                                dx8.d(i47);
                            }
                            C7312w10 c7312w14 = fi7.e;
                            int i50 = c7312w14.g;
                            if (fi7.d == aVar && fi7.a == 1) {
                                i50 = c7312w14.m;
                            }
                            i47 = z ? i47 - i50 : i47 + i50;
                            if (z) {
                                dx8.d(i47);
                            } else {
                                dx7.d(i47);
                            }
                            if (i48 < i17 && i48 < i) {
                                i47 = z ? i47 - (-dx7.f) : i47 + (-dx7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.Fi2
    public final void d() {
        ArrayList<Fi2> arrayList = this.k;
        Iterator<Fi2> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        TK tk = arrayList.get(0).b;
        TK tk2 = arrayList.get(size - 1).b;
        int i = this.f;
        DX dx = this.i;
        DX dx2 = this.h;
        if (i == 0) {
            IK ik = tk.J;
            IK ik2 = tk2.L;
            DX dxI = Fi2.i(ik, 0);
            int iE = ik.e();
            TK tkM = m();
            if (tkM != null) {
                iE = tkM.J.e();
            }
            if (dxI != null) {
                Fi2.b(dx2, dxI, iE);
            }
            DX dxI2 = Fi2.i(ik2, 0);
            int iE2 = ik2.e();
            TK tkN = n();
            if (tkN != null) {
                iE2 = tkN.L.e();
            }
            if (dxI2 != null) {
                Fi2.b(dx, dxI2, -iE2);
            }
        } else {
            IK ik3 = tk.K;
            IK ik4 = tk2.M;
            DX dxI3 = Fi2.i(ik3, 1);
            int iE3 = ik3.e();
            TK tkM2 = m();
            if (tkM2 != null) {
                iE3 = tkM2.K.e();
            }
            if (dxI3 != null) {
                Fi2.b(dx2, dxI3, iE3);
            }
            DX dxI4 = Fi2.i(ik4, 1);
            int iE4 = ik4.e();
            TK tkN2 = n();
            if (tkN2 != null) {
                iE4 = tkN2.M.e();
            }
            if (dxI4 != null) {
                Fi2.b(dx, dxI4, -iE4);
            }
        }
        dx2.a = this;
        dx.a = this;
    }

    @Override // defpackage.Fi2
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList<Fi2> arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).e();
            i++;
        }
    }

    @Override // defpackage.Fi2
    public final void f() {
        this.c = null;
        Iterator<Fi2> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // defpackage.Fi2
    public final long j() {
        ArrayList<Fi2> arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Fi2 fi2 = arrayList.get(i);
            j = ((long) fi2.i.f) + fi2.j() + j + ((long) fi2.h.f);
        }
        return j;
    }

    @Override // defpackage.Fi2
    public final boolean k() {
        ArrayList<Fi2> arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final TK m() {
        int i = 0;
        while (true) {
            ArrayList<Fi2> arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            TK tk = arrayList.get(i).b;
            if (tk.i0 != 8) {
                return tk;
            }
            i++;
        }
    }

    public final TK n() {
        ArrayList<Fi2> arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            TK tk = arrayList.get(size).b;
            if (tk.i0 != 8) {
                return tk;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (Fi2 fi2 : this.k) {
            sb.append("<");
            sb.append(fi2);
            sb.append("> ");
        }
        return sb.toString();
    }
}

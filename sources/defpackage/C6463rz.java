package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6463rz {
    /* JADX WARN: Code duplicated, block: B:190:0x0295  */
    /* JADX WARN: Code duplicated, block: B:207:0x02df  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:213:0x0309  */
    /* JADX WARN: Code duplicated, block: B:235:0x0373  */
    /* JADX WARN: Code duplicated, block: B:237:0x038d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0391  */
    /* JADX WARN: Code duplicated, block: B:243:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:254:0x0427  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:413:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:414:0x06af  */
    /* JADX WARN: Code duplicated, block: B:417:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:418:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:420:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:422:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:425:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:427:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x06ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0111  */
    public static void a(UK uk, C4874kQ0 c4874kQ0, ArrayList<TK> arrayList, int i) {
        int i2;
        C6673sz[] c6673szArr;
        int i3;
        int i4;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        IK[] ikArr;
        int i5;
        C6673sz[] c6673szArr2;
        TK tk;
        C4874kQ0 c4874kQ1;
        TN1 tn1;
        IK ik;
        TN1 tn2;
        int i6;
        IK ik2;
        TN1 tn3;
        TK tk2;
        int i7;
        IK[] ikArr2;
        int i8;
        IK ik3;
        IK ik4;
        TN1 tn4;
        IK ik5;
        TN1 tn5;
        int size;
        ArrayList<TK> arrayList2;
        float f2;
        TN1 tn6;
        TN1 tn7;
        TN1 tn8;
        TN1 tn9;
        C0747Cj c0747CjL;
        float f3;
        boolean z4;
        IK ik6;
        TK tk3;
        int i9;
        int i10;
        int i11;
        TK tk4;
        float f4;
        UK uk2 = uk;
        if (i == 0) {
            i2 = uk2.D0;
            c6673szArr = uk2.G0;
            i3 = 0;
        } else {
            i2 = uk2.E0;
            c6673szArr = uk2.F0;
            i3 = 2;
        }
        int i12 = i2;
        C6673sz[] c6673szArr3 = c6673szArr;
        int i13 = 0;
        while (i13 < i12) {
            C6673sz c6673sz = c6673szArr3[i13];
            boolean z5 = c6673sz.q;
            TK.a aVar = TK.a.g;
            TK tk5 = c6673sz.a;
            int i14 = 8;
            if (z5) {
                i4 = i13;
                f = 0.0f;
            } else {
                int i15 = c6673sz.l;
                int i16 = i15 * 2;
                TK tk6 = tk5;
                TK tk7 = tk6;
                boolean z6 = false;
                f = 0.0f;
                while (!z6) {
                    c6673sz.i++;
                    tk6.p0[i15] = null;
                    tk6.o0[i15] = null;
                    int i17 = tk6.i0;
                    IK[] ikArr3 = tk6.R;
                    if (i17 != i14) {
                        tk6.n(i15);
                        ikArr3[i16].e();
                        int i18 = i16 + 1;
                        ikArr3[i18].e();
                        ikArr3[i16].e();
                        ikArr3[i18].e();
                        if (c6673sz.b == null) {
                            c6673sz.b = tk6;
                        }
                        c6673sz.d = tk6;
                        TK.a aVar2 = tk6.U[i15];
                        if (aVar2 == aVar) {
                            int i19 = tk6.t[i15];
                            i10 = i13;
                            if (i19 == 0 || i19 == 3 || i19 == 2) {
                                c6673sz.j++;
                                float f5 = tk6.n0[i15];
                                if (f5 > 0.0f) {
                                    f4 = f5;
                                    c6673sz.k += f4;
                                } else {
                                    f4 = f5;
                                }
                                i11 = i15;
                                if (tk6.i0 != 8 && aVar2 == aVar && (i19 == 0 || i19 == 3)) {
                                    if (f4 < 0.0f) {
                                        c6673sz.n = true;
                                    } else {
                                        c6673sz.o = true;
                                    }
                                    if (c6673sz.h == null) {
                                        c6673sz.h = new ArrayList<>();
                                    }
                                    c6673sz.h.add(tk6);
                                }
                                if (c6673sz.f == null) {
                                    c6673sz.f = tk6;
                                }
                                TK tk8 = c6673sz.g;
                                if (tk8 != null) {
                                    tk8.o0[i11] = tk6;
                                }
                                c6673sz.g = tk6;
                            } else {
                                i11 = i15;
                            }
                            if (i11 == 0) {
                                if (tk6.r == 0 && tk6.u == 0) {
                                    int i20 = tk6.v;
                                }
                            } else if (tk6.s == 0 && tk6.x == 0) {
                                int i21 = tk6.y;
                            }
                        } else {
                            i10 = i13;
                            i11 = i15;
                        }
                    } else {
                        i10 = i13;
                        i11 = i15;
                    }
                    if (tk7 != tk6) {
                        tk7.p0[i11] = tk6;
                    }
                    IK ik7 = ikArr3[i16 + 1].f;
                    if (ik7 != null) {
                        tk4 = ik7.d;
                        IK ik8 = tk4.R[i16].f;
                        if (ik8 == null || ik8.d != tk6) {
                            tk4 = null;
                        }
                    } else {
                        tk4 = null;
                    }
                    if (tk4 == null) {
                        tk4 = tk6;
                        z6 = true;
                    }
                    tk7 = tk6;
                    i15 = i11;
                    i14 = 8;
                    tk6 = tk4;
                    i13 = i10;
                }
                i4 = i13;
                int i22 = i15;
                TK tk9 = c6673sz.b;
                if (tk9 != null) {
                    tk9.R[i16].e();
                }
                TK tk10 = c6673sz.d;
                if (tk10 != null) {
                    tk10.R[i16 + 1].e();
                }
                c6673sz.c = tk6;
                if (i22 == 0 && c6673sz.m) {
                    c6673sz.e = tk6;
                } else {
                    c6673sz.e = tk5;
                }
                c6673sz.p = c6673sz.o && c6673sz.n;
            }
            c6673sz.q = true;
            if (arrayList == 0 || arrayList.contains(tk5)) {
                TK tk11 = c6673sz.c;
                TK tk12 = c6673sz.b;
                TK tk13 = c6673sz.d;
                TK tk14 = c6673sz.e;
                float f6 = c6673sz.k;
                boolean z7 = uk2.U[i] == TK.a.e;
                if (i == 0) {
                    int i23 = tk14.l0;
                    boolean z8 = i23 == 0;
                    z = i23 == 1;
                    z2 = i23 == 2;
                    z3 = z8;
                } else {
                    int i24 = tk14.m0;
                    boolean z9 = i24 == 0;
                    z = i24 == 1;
                    z2 = i24 == 2;
                    z3 = z9;
                }
                boolean z10 = false;
                while (true) {
                    ikArr = uk2.R;
                    if (z10) {
                        break;
                    }
                    IK ik9 = tk5.R[i3];
                    int i25 = z2 ? 1 : 4;
                    int iE = ik9.e();
                    boolean z11 = z2;
                    boolean z12 = tk5.U[i] == aVar && tk5.t[i] == 0;
                    IK ik10 = ik9.f;
                    if (ik10 != null && tk5 != tk5) {
                        iE = ik10.e() + iE;
                    }
                    int i26 = iE;
                    if (z11 && tk5 != tk5 && tk5 != tk12) {
                        i25 = 8;
                    }
                    IK ik11 = ik9.f;
                    if (ik11 != null) {
                        if (tk5 == tk12) {
                            c4874kQ0.f(ik9.i, ik11.i, i26, 6);
                        } else {
                            c4874kQ0.f(ik9.i, ik11.i, i26, 8);
                        }
                        if (z12 && !z11) {
                            i25 = 5;
                        }
                        c4874kQ0.e(ik9.i, ik9.f.i, i26, (tk5 == tk12 && z11 && tk5.T[i]) ? 5 : i25);
                    } else {
                        i12 = i12;
                        c6673szArr3 = c6673szArr3;
                    }
                    IK[] ikArr4 = tk5.R;
                    if (z7) {
                        if (tk5.i0 == 8 || tk5.U[i] != aVar) {
                            i9 = 0;
                        } else {
                            i9 = 0;
                            c4874kQ0.f(ikArr4[i3 + 1].i, ikArr4[i3].i, 0, 5);
                        }
                        c4874kQ0.f(ikArr4[i3].i, ikArr[i3].i, i9, 8);
                    }
                    IK ik12 = ikArr4[i3 + 1].f;
                    if (ik12 != null) {
                        tk3 = ik12.d;
                        IK ik13 = tk3.R[i3].f;
                        if (ik13 == null || ik13.d != tk5) {
                            tk3 = null;
                        }
                    } else {
                        tk3 = null;
                    }
                    if (tk3 != null) {
                        tk5 = tk3;
                    } else {
                        z10 = true;
                    }
                    i12 = i12;
                    z2 = z11;
                    c6673szArr3 = c6673szArr3;
                }
                boolean z13 = z2;
                i5 = i12;
                c6673szArr2 = c6673szArr3;
                if (tk13 != null) {
                    int i27 = i3 + 1;
                    if (tk11.R[i27].f != null) {
                        IK ik14 = tk13.R[i27];
                        if (tk13.U[i] == aVar && tk13.t[i] == 0 && !z13) {
                            IK ik15 = ik14.f;
                            if (ik15.d == uk2) {
                                c4874kQ0.e(ik14.i, ik15.i, -ik14.e(), 5);
                            } else if (z13) {
                                ik6 = ik14.f;
                                if (ik6.d == uk2) {
                                    c4874kQ0.e(ik14.i, ik6.i, -ik14.e(), 4);
                                }
                            }
                        } else if (z13) {
                            ik6 = ik14.f;
                            if (ik6.d == uk2) {
                                c4874kQ0.e(ik14.i, ik6.i, -ik14.e(), 4);
                            }
                        }
                        c4874kQ0.g(ik14.i, tk11.R[i27].f.i, -ik14.e(), 6);
                    }
                }
                if (z7 != 0) {
                    int i28 = i3 + 1;
                    TN1 tn10 = ikArr[i28].i;
                    IK ik16 = tk11.R[i28];
                    c4874kQ0.f(tn10, ik16.i, ik16.e(), 8);
                }
                ArrayList<TK> arrayList3 = c6673sz.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (c6673sz.n && !c6673sz.p) {
                        f6 = c6673sz.j;
                    }
                    TK tk15 = null;
                    float f7 = f;
                    int i29 = 0;
                    while (i29 < size) {
                        TK tk16 = arrayList3.get(i29);
                        float f8 = tk16.n0[i];
                        IK[] ikArr5 = tk16.R;
                        if (f8 >= f) {
                            arrayList2 = arrayList3;
                            if (f8 == f) {
                                z4 = false;
                                c4874kQ0.e(ikArr5[i3 + 1].i, ikArr5[i3].i, 0, 8);
                                size = size;
                                i29 = i29;
                                f2 = f;
                            } else {
                                if (tk15 != null) {
                                    IK[] ikArr6 = tk15.R;
                                    tn6 = ikArr6[i3].i;
                                    int i30 = i3 + 1;
                                    tn7 = ikArr6[i30].i;
                                    tn8 = ikArr5[i3].i;
                                    tn9 = ikArr5[i30].i;
                                    c0747CjL = c4874kQ0.l();
                                    float f9 = f7;
                                    f3 = f;
                                    c0747CjL.b = f3;
                                    f2 = f3;
                                    if (f6 != f3 || f9 == f8) {
                                        c0747CjL.d.k(tn6, 1.0f);
                                        c0747CjL.d.k(tn7, -1.0f);
                                        c0747CjL.d.k(tn9, 1.0f);
                                        c0747CjL.d.k(tn8, -1.0f);
                                    } else if (f9 == f2) {
                                        c0747CjL.d.k(tn6, 1.0f);
                                        c0747CjL.d.k(tn7, -1.0f);
                                    } else if (f8 == f) {
                                        c0747CjL.d.k(tn8, 1.0f);
                                        c0747CjL.d.k(tn9, -1.0f);
                                    } else {
                                        float f10 = (f9 / f6) / (f8 / f6);
                                        c0747CjL.d.k(tn6, 1.0f);
                                        c0747CjL.d.k(tn7, -1.0f);
                                        c0747CjL.d.k(tn9, f10);
                                        c0747CjL.d.k(tn8, -f10);
                                    }
                                    c4874kQ0.c(c0747CjL);
                                } else {
                                    i29 = i29;
                                    f2 = f;
                                    f8 = f8;
                                }
                                f7 = f8;
                                tk15 = tk16;
                            }
                        } else {
                            if (c6673sz.p) {
                                arrayList2 = arrayList3;
                                z4 = false;
                                c4874kQ0.e(ikArr5[i3 + 1].i, ikArr5[i3].i, 0, 4);
                            } else {
                                f8 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f8 == f) {
                                    z4 = false;
                                    c4874kQ0.e(ikArr5[i3 + 1].i, ikArr5[i3].i, 0, 8);
                                } else {
                                    if (tk15 != null) {
                                        IK[] ikArr7 = tk15.R;
                                        tn6 = ikArr7[i3].i;
                                        int i31 = i3 + 1;
                                        tn7 = ikArr7[i31].i;
                                        tn8 = ikArr5[i3].i;
                                        tn9 = ikArr5[i31].i;
                                        c0747CjL = c4874kQ0.l();
                                        float f11 = f7;
                                        f3 = f;
                                        c0747CjL.b = f3;
                                        f2 = f3;
                                        if (f6 != f3) {
                                            c0747CjL.d.k(tn6, 1.0f);
                                            c0747CjL.d.k(tn7, -1.0f);
                                            c0747CjL.d.k(tn9, 1.0f);
                                            c0747CjL.d.k(tn8, -1.0f);
                                        } else {
                                            c0747CjL.d.k(tn6, 1.0f);
                                            c0747CjL.d.k(tn7, -1.0f);
                                            c0747CjL.d.k(tn9, 1.0f);
                                            c0747CjL.d.k(tn8, -1.0f);
                                        }
                                        c4874kQ0.c(c0747CjL);
                                    } else {
                                        i29 = i29;
                                        f2 = f;
                                        f8 = f8;
                                    }
                                    f7 = f8;
                                    tk15 = tk16;
                                }
                            }
                            size = size;
                            i29 = i29;
                            f2 = f;
                        }
                        i29++;
                        arrayList3 = arrayList2;
                        size = size;
                        f = f2;
                    }
                }
                if (tk12 == null || !(tk12 == tk13 || z13)) {
                    tk = tk13;
                    if (!z3 || tk12 == null) {
                        if (z && tk12 != null) {
                            int i32 = c6673sz.j;
                            boolean z14 = i32 > 0 && c6673sz.i == i32;
                            TK tk17 = tk12;
                            TK tk18 = tk17;
                            while (tk17 != null) {
                                TK tk19 = tk17.p0[i];
                                while (tk19 != null && tk19.i0 == 8) {
                                    tk19 = tk19.p0[i];
                                }
                                if (tk17 != tk12 && tk17 != tk && tk19 != null) {
                                    if (tk19 == tk) {
                                        tk19 = null;
                                    }
                                    IK[] ikArr8 = tk17.R;
                                    IK ik17 = ikArr8[i3];
                                    TN1 tn11 = ik17.i;
                                    int i33 = i3 + 1;
                                    TN1 tn12 = tk18.R[i33].i;
                                    int iE2 = ik17.e();
                                    int iE3 = ikArr8[i33].e();
                                    if (tk19 != null) {
                                        ik = tk19.R[i3];
                                        tn2 = ik.i;
                                        IK ik18 = ik.f;
                                        tn1 = ik18 != null ? ik18.i : null;
                                    } else {
                                        IK ik19 = tk.R[i3];
                                        TN1 tn13 = ik19 != null ? ik19.i : null;
                                        tn1 = ikArr8[i33].i;
                                        ik = ik19;
                                        tn2 = tn13;
                                    }
                                    if (ik != null) {
                                        iE3 += ik.e();
                                    }
                                    int iE4 = tk18.R[i33].e() + iE2;
                                    TN1 tn14 = tn2;
                                    int i34 = iE3;
                                    TN1 tn15 = tn1;
                                    int i35 = z14 ? 8 : 4;
                                    if (tn11 != null && tn12 != null && tn14 != null && tn15 != null) {
                                        c4874kQ0.b(tn11, tn12, iE4, 0.5f, tn14, tn15, i34, i35);
                                    }
                                    tk19 = tk19;
                                }
                                if (tk17.i0 != 8) {
                                    tk18 = tk17;
                                }
                                tk17 = tk19;
                            }
                            IK ik20 = tk12.R[i3];
                            IK ik21 = tk5.R[i3].f;
                            int i36 = i3 + 1;
                            IK ik22 = tk.R[i36];
                            IK ik23 = tk11.R[i36].f;
                            if (ik21 == null) {
                                c4874kQ1 = c4874kQ0;
                            } else {
                                if (tk12 != tk) {
                                    c4874kQ0.e(ik20.i, ik21.i, ik20.e(), 5);
                                } else if (ik23 != null) {
                                    c4874kQ1 = c4874kQ0;
                                    c4874kQ1.b(ik20.i, ik21.i, ik20.e(), 0.5f, ik22.i, ik23.i, ik22.e(), 5);
                                }
                                c4874kQ1 = c4874kQ0;
                            }
                            if (ik23 != null && tk12 != tk) {
                                c4874kQ1.e(ik22.i, ik23.i, -ik22.e(), 5);
                            }
                        }
                        if ((z3 || z) && tk12 != null && tk12 != tk) {
                            ikArr2 = tk12.R;
                            IK ik24 = ikArr2[i3];
                            if (tk == null) {
                                tk = tk12;
                            }
                            i8 = i3 + 1;
                            IK[] ikArr9 = tk.R;
                            ik3 = ikArr9[i8];
                            ik4 = ik24.f;
                            if (ik4 != null) {
                                tn4 = ik4.i;
                            } else {
                                tn4 = null;
                            }
                            ik5 = ik3.f;
                            if (ik5 != null) {
                                tn5 = ik5.i;
                            } else {
                                tn5 = null;
                            }
                            if (tk11 != tk) {
                                IK ik25 = tk11.R[i8].f;
                                tn5 = ik25 != null ? ik25.i : null;
                            }
                            if (tk12 == tk) {
                                ik3 = ikArr2[i8];
                            }
                            if (tn4 == null && tn5 != null) {
                                c4874kQ1.b(ik24.i, tn4, ik24.e(), 0.5f, tn5, ik3.i, ikArr9[i8].e(), 5);
                            }
                        }
                    } else {
                        int i37 = c6673sz.j;
                        boolean z15 = i37 > 0 && c6673sz.i == i37;
                        TK tk20 = tk12;
                        TK tk21 = tk20;
                        while (tk20 != null) {
                            TK tk22 = tk20.p0[i];
                            while (true) {
                                if (tk22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (tk22.i0 != 8) {
                                    break;
                                } else {
                                    tk22 = tk22.p0[i];
                                }
                            }
                            if (tk22 != null || tk20 == tk) {
                                IK[] ikArr10 = tk20.R;
                                IK ik26 = ikArr10[i3];
                                TN1 tn16 = ik26.i;
                                IK ik27 = ik26.f;
                                TN1 tn17 = ik27 != null ? ik27.i : null;
                                if (tk21 != tk20) {
                                    tn17 = tk21.R[i3 + 1].i;
                                } else if (tk20 == tk12) {
                                    IK ik28 = tk5.R[i3].f;
                                    tn17 = ik28 != null ? ik28.i : null;
                                }
                                int iE5 = ik26.e();
                                int i38 = i3 + 1;
                                int iE6 = ikArr10[i38].e();
                                if (tk22 != null) {
                                    ik2 = tk22.R[i3];
                                    tn3 = ik2.i;
                                } else {
                                    ik2 = tk11.R[i38].f;
                                    tn3 = ik2 != null ? ik2.i : null;
                                }
                                TN1 tn18 = ikArr10[i38].i;
                                if (ik2 != null) {
                                    iE6 += ik2.e();
                                }
                                int iE7 = tk21.R[i38].e() + iE5;
                                if (tn16 == null || tn17 == null || tn3 == null || tn18 == null) {
                                    tk2 = tk5;
                                    i7 = 8;
                                } else {
                                    if (tk20 == tk12) {
                                        iE7 = tk12.R[i3].e();
                                    }
                                    if (tk20 == tk) {
                                        iE6 = tk.R[i38].e();
                                    }
                                    tk2 = tk5;
                                    i7 = 8;
                                    c4874kQ0.b(tn16, tn17, iE7, 0.5f, tn3, tn18, iE6, z15 ? 8 : 5);
                                }
                            } else {
                                tk2 = tk5;
                                i7 = i6;
                            }
                            if (tk20.i0 != i7) {
                                tk21 = tk20;
                            }
                            tk20 = tk22;
                            tk21 = tk21;
                            tk5 = tk2;
                        }
                    }
                } else {
                    IK ik29 = tk5.R[i3];
                    int i39 = i3 + 1;
                    IK ik30 = tk11.R[i39];
                    IK ik31 = ik29.f;
                    TN1 tn19 = ik31 != null ? ik31.i : null;
                    IK ik32 = ik30.f;
                    TN1 tn20 = ik32 != null ? ik32.i : null;
                    IK ik33 = tk12.R[i3];
                    if (tk13 != null) {
                        ik30 = tk13.R[i39];
                    }
                    if (tn19 == null || tn20 == null) {
                        tk = tk13;
                    } else {
                        float f12 = i == 0 ? tk14.f0 : tk14.g0;
                        int iE8 = ik33.e();
                        int iE9 = ik30.e();
                        TN1 tn21 = ik33.i;
                        TN1 tn22 = ik30.i;
                        TN1 tn23 = tn19;
                        tk = tk13;
                        c4874kQ0.b(tn21, tn23, iE8, f12, tn20, tn22, iE9, 7);
                    }
                }
                c4874kQ1 = c4874kQ0;
                if (z3) {
                    ikArr2 = tk12.R;
                    IK ik210 = ikArr2[i3];
                    if (tk == null) {
                        tk = tk12;
                    }
                    i8 = i3 + 1;
                    IK[] ikArr11 = tk.R;
                    ik3 = ikArr11[i8];
                    ik4 = ik210.f;
                    if (ik4 != null) {
                        tn4 = ik4.i;
                    } else {
                        tn4 = null;
                    }
                    ik5 = ik3.f;
                    if (ik5 != null) {
                        tn5 = ik5.i;
                    } else {
                        tn5 = null;
                    }
                    if (tk11 != tk) {
                        IK ik211 = tk11.R[i8].f;
                        tn5 = ik211 != null ? ik211.i : null;
                    }
                    if (tk12 == tk) {
                        ik3 = ikArr2[i8];
                    }
                    if (tn4 == null) {
                    }
                } else {
                    ikArr2 = tk12.R;
                    IK ik212 = ikArr2[i3];
                    if (tk == null) {
                        tk = tk12;
                    }
                    i8 = i3 + 1;
                    IK[] ikArr12 = tk.R;
                    ik3 = ikArr12[i8];
                    ik4 = ik212.f;
                    if (ik4 != null) {
                        tn4 = ik4.i;
                    } else {
                        tn4 = null;
                    }
                    ik5 = ik3.f;
                    if (ik5 != null) {
                        tn5 = ik5.i;
                    } else {
                        tn5 = null;
                    }
                    if (tk11 != tk) {
                        IK ik213 = tk11.R[i8].f;
                        tn5 = ik213 != null ? ik213.i : null;
                    }
                    if (tk12 == tk) {
                        ik3 = ikArr2[i8];
                    }
                    if (tn4 == null) {
                    }
                }
            } else {
                i5 = i12;
                c6673szArr2 = c6673szArr3;
            }
            i13 = i4 + 1;
            uk2 = uk;
            i12 = i5;
            c6673szArr3 = c6673szArr2;
        }
    }
}

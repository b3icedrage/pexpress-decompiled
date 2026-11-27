package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class UK extends Di2 {
    public final C4874kQ0 A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public C6673sz[] F0;
    public C6673sz[] G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public WeakReference<IK> K0;
    public WeakReference<IK> L0;
    public WeakReference<IK> M0;
    public WeakReference<IK> N0;
    public final HashSet<TK> O0;
    public final C4289hr.a P0;
    public final C4289hr v0 = new C4289hr(this);
    public final CX w0;
    public int x0;
    public C4289hr.b y0;
    public boolean z0;

    public UK() {
        CX cx = new CX();
        cx.b = true;
        cx.c = true;
        cx.e = new ArrayList<>();
        new ArrayList();
        cx.f = null;
        cx.g = new C4289hr.a();
        cx.h = new ArrayList<>();
        cx.a = this;
        cx.d = this;
        this.w0 = cx;
        this.y0 = null;
        this.z0 = false;
        this.A0 = new C4874kQ0();
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = new C6673sz[4];
        this.G0 = new C6673sz[4];
        this.H0 = 257;
        this.I0 = false;
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = new HashSet<>();
        this.P0 = new C4289hr.a();
    }

    public static void Z(TK tk, C4289hr.b bVar, C4289hr.a aVar) {
        int i;
        int i2;
        if (bVar == null) {
            return;
        }
        if (tk.i0 == 8 || (tk instanceof C5589nn0) || (tk instanceof C6017pq)) {
            aVar.e = 0;
            aVar.f = 0;
            return;
        }
        TK.a[] aVarArr = tk.U;
        aVar.a = aVarArr[0];
        aVar.b = aVarArr[1];
        aVar.c = tk.u();
        aVar.d = tk.o();
        aVar.i = false;
        aVar.j = 0;
        TK.a aVar2 = aVar.a;
        TK.a aVar3 = TK.a.g;
        boolean z = aVar2 == aVar3;
        boolean z2 = aVar.b == aVar3;
        boolean z3 = z && tk.Y > 0.0f;
        boolean z4 = z2 && tk.Y > 0.0f;
        TK.a aVar4 = TK.a.e;
        TK.a aVar5 = TK.a.d;
        if (z && tk.x(0) && tk.r == 0 && !z3) {
            aVar.a = aVar4;
            if (z2 && tk.s == 0) {
                aVar.a = aVar5;
            }
            z = false;
        }
        if (z2 && tk.x(1) && tk.s == 0 && !z4) {
            aVar.b = aVar4;
            if (z && tk.r == 0) {
                aVar.b = aVar5;
            }
            z2 = false;
        }
        if (tk.E()) {
            aVar.a = aVar5;
            z = false;
        }
        if (tk.F()) {
            aVar.b = aVar5;
            z2 = false;
        }
        int[] iArr = tk.t;
        if (z3) {
            if (iArr[0] == 4) {
                aVar.a = aVar5;
            } else if (!z2) {
                if (aVar.b == aVar5) {
                    i2 = aVar.d;
                } else {
                    aVar.a = aVar4;
                    ((ConstraintLayout.b) bVar).b(tk, aVar);
                    i2 = aVar.f;
                }
                aVar.a = aVar5;
                aVar.c = (int) (tk.Y * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                aVar.b = aVar5;
            } else if (!z) {
                if (aVar.a == aVar5) {
                    i = aVar.c;
                } else {
                    aVar.b = aVar4;
                    ((ConstraintLayout.b) bVar).b(tk, aVar);
                    i = aVar.e;
                }
                aVar.b = aVar5;
                if (tk.Z == -1) {
                    aVar.d = (int) (i / tk.Y);
                } else {
                    aVar.d = (int) (tk.Y * i);
                }
            }
        }
        ((ConstraintLayout.b) bVar).b(tk, aVar);
        tk.S(aVar.e);
        tk.P(aVar.f);
        tk.E = aVar.h;
        tk.M(aVar.g);
        aVar.j = 0;
    }

    @Override // defpackage.Di2, defpackage.TK
    public final void G() {
        this.A0.t();
        this.B0 = 0;
        this.C0 = 0;
        super.G();
    }

    @Override // defpackage.TK
    public final void T(boolean z, boolean z2) {
        super.T(z, z2);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            this.u0.get(i).T(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:226:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:359:0x063b  */
    /* JADX WARN: Code duplicated, block: B:373:0x066e  */
    /* JADX WARN: Code duplicated, block: B:398:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:403:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:410:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:413:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:415:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:419:0x0704  */
    /* JADX WARN: Code duplicated, block: B:424:0x0718 A[Catch: Exception -> 0x0726, LOOP:12: B:423:0x0716->B:424:0x0718, LOOP_END, TryCatch #7 {Exception -> 0x0726, blocks: (B:422:0x070e, B:424:0x0718, B:427:0x072e), top: B:562:0x070e }] */
    /* JADX WARN: Code duplicated, block: B:451:0x0777  */
    /* JADX WARN: Code duplicated, block: B:454:0x0781 A[Catch: Exception -> 0x075e, TRY_ENTER, TryCatch #1 {Exception -> 0x075e, blocks: (B:438:0x0757, B:454:0x0781, B:456:0x0787, B:459:0x07a7, B:461:0x07ad, B:465:0x07c5), top: B:550:0x0757 }] */
    /* JADX WARN: Code duplicated, block: B:459:0x07a7 A[Catch: Exception -> 0x075e, TRY_ENTER, TryCatch #1 {Exception -> 0x075e, blocks: (B:438:0x0757, B:454:0x0781, B:456:0x0787, B:459:0x07a7, B:461:0x07ad, B:465:0x07c5), top: B:550:0x0757 }] */
    /* JADX WARN: Code duplicated, block: B:471:0x07d4 A[Catch: Exception -> 0x07fc, TryCatch #3 {Exception -> 0x07fc, blocks: (B:452:0x077d, B:457:0x07a3, B:469:0x07d0, B:471:0x07d4, B:473:0x07da), top: B:554:0x077d }] */
    /* JADX WARN: Code duplicated, block: B:480:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:488:0x0826  */
    /* JADX WARN: Code duplicated, block: B:490:0x083f  */
    /* JADX WARN: Code duplicated, block: B:492:0x0855  */
    /* JADX WARN: Code duplicated, block: B:494:0x0859  */
    /* JADX WARN: Code duplicated, block: B:497:0x0865  */
    /* JADX WARN: Code duplicated, block: B:499:0x086e A[LOOP:15: B:498:0x086c->B:499:0x086e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:503:0x0881 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:518:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:521:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:524:0x0917  */
    /* JADX WARN: Code duplicated, block: B:525:0x0923  */
    /* JADX WARN: Code duplicated, block: B:527:0x0926  */
    /* JADX WARN: Code duplicated, block: B:529:0x092e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:532:0x0936  */
    /* JADX WARN: Code duplicated, block: B:535:0x0948 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:539:0x095e A[PHI: r15 r25
      0x095e: PHI (r15v10 ??) = (r15v9 ??), (r15v14 ??), (r15v14 ??), (r15v14 ??) binds: [B:526:0x0924, B:534:0x0946, B:535:0x0948, B:537:0x094e] A[DONT_GENERATE, DONT_INLINE]
      0x095e: PHI (r25v8 boolean) = (r25v7 boolean), (r25v9 boolean), (r25v9 boolean), (r25v9 boolean) binds: [B:526:0x0924, B:534:0x0946, B:535:0x0948, B:537:0x094e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:541:0x0964  */
    /* JADX WARN: Code duplicated, block: B:545:0x0974  */
    /* JADX WARN: Code duplicated, block: B:612:0x06f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0965 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r32v0, types: [Di2, TK, UK] */
    @Override // defpackage.Di2
    public final void V() {
        IK ik;
        int i;
        IK ik2;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        char c;
        TK.a[] aVarArr;
        boolean z3;
        int i4;
        int i5;
        boolean zA0;
        boolean z4;
        int i6;
        ?? r15;
        boolean z5;
        int i7;
        boolean z6;
        TK.a aVar;
        boolean z7;
        ?? r16;
        boolean[] zArr;
        boolean[] zArr2;
        int i8;
        boolean z8;
        int iMax;
        boolean z9;
        int iMax2;
        ?? r10;
        ?? r17;
        int i9;
        ?? r18;
        boolean zA1;
        int size;
        int i10;
        boolean z10;
        TK tk;
        ?? r19;
        int i11;
        WeakReference<IK> weakReference;
        IK ik3;
        WeakReference<IK> weakReference2;
        WeakReference<IK> weakReference3;
        WeakReference<IK> weakReference4;
        IK ik4;
        TK tk2;
        Ei2 ei2;
        Ei2 ei3;
        int i12;
        int iO;
        int iB;
        int iB2;
        int i13;
        TK.a aVar2;
        Ei2 ei4;
        Ei2 ei5;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i14;
        IK ik5;
        this.a0 = 0;
        this.b0 = 0;
        this.I0 = false;
        this.J0 = false;
        int size2 = this.u0.size();
        int iMax3 = Math.max(0, u());
        int iMax4 = Math.max(0, o());
        TK.a[] aVarArr2 = this.U;
        TK.a aVar3 = aVarArr2[1];
        TK.a aVar4 = aVarArr2[0];
        int i15 = this.x0;
        TK.a aVar5 = TK.a.g;
        IK ik6 = this.K;
        IK ik7 = this.J;
        TK.a aVar6 = TK.a.d;
        if (i15 == 0 && Y91.b(this.H0, 1)) {
            C4289hr.b bVar = this.y0;
            TK.a[] aVarArr3 = this.U;
            TK.a aVar7 = aVarArr3[0];
            TK.a aVar8 = aVarArr3[1];
            I();
            ArrayList<TK> arrayList4 = this.u0;
            int size3 = arrayList4.size();
            for (int i16 = 0; i16 < size3; i16++) {
                arrayList4.get(i16).I();
            }
            boolean z12 = this.z0;
            if (aVar7 == aVar6) {
                N(0, u());
            } else {
                ik7.l(0);
                this.a0 = 0;
            }
            boolean z13 = false;
            int i17 = 0;
            boolean z14 = false;
            while (i17 < size3) {
                boolean z15 = z13;
                TK tk3 = arrayList4.get(i17);
                int i18 = i17;
                if (tk3 instanceof C5589nn0) {
                    C5589nn0 c5589nn0 = (C5589nn0) tk3;
                    ik5 = ik7;
                    if (c5589nn0.y0 == 1) {
                        int i19 = c5589nn0.v0;
                        if (i19 != -1) {
                            c5589nn0.V(i19);
                        } else if (c5589nn0.w0 != -1 && E()) {
                            c5589nn0.V(u() - c5589nn0.w0);
                        } else if (E()) {
                            c5589nn0.V((int) ((c5589nn0.u0 * u()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else {
                    ik5 = ik7;
                    if ((tk3 instanceof C6017pq) && ((C6017pq) tk3).X() == 0) {
                        z13 = z15;
                        z14 = true;
                    }
                    i17 = i18 + 1;
                    ik7 = ik5;
                }
                z13 = z15;
                i17 = i18 + 1;
                ik7 = ik5;
            }
            ik = ik7;
            if (z13) {
                for (int i20 = 0; i20 < size3; i20 = i14 + 1) {
                    TK tk4 = arrayList4.get(i20);
                    if (tk4 instanceof C5589nn0) {
                        C5589nn0 c5589nn1 = (C5589nn0) tk4;
                        i14 = i20;
                        if (c5589nn1.y0 == 1) {
                            C7523x10.b(0, bVar, c5589nn1, z12);
                        }
                    } else {
                        i14 = i20;
                    }
                }
            }
            C7523x10.b(0, bVar, this, z12);
            if (z14) {
                for (int i21 = 0; i21 < size3; i21++) {
                    TK tk5 = arrayList4.get(i21);
                    if (tk5 instanceof C6017pq) {
                        C6017pq c6017pq = (C6017pq) tk5;
                        if (c6017pq.X() == 0 && c6017pq.W()) {
                            C7523x10.b(1, bVar, c6017pq, z12);
                        }
                    }
                }
            }
            if (aVar8 == aVar6) {
                O(0, o());
            } else {
                ik6.l(0);
                this.b0 = 0;
            }
            int i22 = 0;
            boolean z16 = false;
            boolean z17 = false;
            while (i22 < size3) {
                TK tk6 = arrayList4.get(i22);
                int i23 = i22;
                if (tk6 instanceof C5589nn0) {
                    C5589nn0 c5589nn2 = (C5589nn0) tk6;
                    if (c5589nn2.y0 == 0) {
                        int i24 = c5589nn2.v0;
                        if (i24 != -1) {
                            c5589nn2.V(i24);
                        } else if (c5589nn2.w0 != -1 && F()) {
                            c5589nn2.V(o() - c5589nn2.w0);
                        } else if (F()) {
                            c5589nn2.V((int) ((c5589nn2.u0 * o()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else if ((tk6 instanceof C6017pq) && ((C6017pq) tk6).X() == 1) {
                    z17 = true;
                }
                i22 = i23 + 1;
            }
            if (z16) {
                for (int i25 = 0; i25 < size3; i25++) {
                    TK tk7 = arrayList4.get(i25);
                    if (tk7 instanceof C5589nn0) {
                        C5589nn0 c5589nn3 = (C5589nn0) tk7;
                        if (c5589nn3.y0 == 0) {
                            C7523x10.g(1, bVar, c5589nn3);
                        }
                    }
                }
            }
            C7523x10.g(0, bVar, this);
            if (z17) {
                for (int i26 = 0; i26 < size3; i26++) {
                    TK tk8 = arrayList4.get(i26);
                    if (tk8 instanceof C6017pq) {
                        C6017pq c6017pq2 = (C6017pq) tk8;
                        if (c6017pq2.X() == 1 && c6017pq2.W()) {
                            C7523x10.g(1, bVar, c6017pq2);
                        }
                    }
                }
            }
            for (int i27 = 0; i27 < size3; i27++) {
                TK tk9 = arrayList4.get(i27);
                if (tk9.D() && C7523x10.a(tk9)) {
                    Z(tk9, bVar, C7523x10.a);
                    if (!(tk9 instanceof C5589nn0)) {
                        C7523x10.b(0, bVar, tk9, z12);
                        C7523x10.g(0, bVar, tk9);
                    } else if (((C5589nn0) tk9).y0 == 0) {
                        C7523x10.g(0, bVar, tk9);
                    } else {
                        C7523x10.b(0, bVar, tk9, z12);
                    }
                }
            }
            for (int i28 = 0; i28 < size2; i28++) {
                TK tk10 = this.u0.get(i28);
                if (tk10.D() && !(tk10 instanceof C5589nn0) && !(tk10 instanceof C6017pq) && !(tk10 instanceof We2) && !tk10.G) {
                    TK.a aVarN = tk10.n(0);
                    TK.a aVarN2 = tk10.n(1);
                    if (aVarN != aVar5 || tk10.r == 1 || aVarN2 != aVar5 || tk10.s == 1) {
                        Z(tk10, this.y0, new C4289hr.a());
                    }
                }
            }
        } else {
            iMax4 = iMax4;
            ik = ik7;
        }
        TK.a aVar9 = TK.a.e;
        C4874kQ0 c4874kQ0 = this.A0;
        if (size2 <= 2 || !((aVar4 == aVar9 || aVar3 == aVar9) && Y91.b(this.H0, UserVerificationMethods.USER_VERIFY_ALL))) {
            i = size2;
            ik2 = ik6;
        } else {
            C4289hr.b bVar2 = this.y0;
            ArrayList<TK> arrayList5 = this.u0;
            int size4 = arrayList5.size();
            int i29 = 0;
            while (true) {
                if (i29 >= size4) {
                    i = size2;
                    ik2 = ik6;
                    int i30 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    while (i30 < size4) {
                        int i31 = i30;
                        TK tk11 = arrayList5.get(i30);
                        ArrayList arrayList12 = arrayList6;
                        TK.a[] aVarArr4 = this.U;
                        TK.a aVar10 = aVarArr4[0];
                        ArrayList arrayList13 = arrayList7;
                        TK.a aVar11 = aVarArr4[1];
                        ArrayList arrayList14 = arrayList8;
                        TK.a[] aVarArr5 = tk11.U;
                        ArrayList arrayList15 = arrayList9;
                        if (!C3229cn0.b(aVar10, aVar11, aVarArr5[0], aVarArr5[1])) {
                            Z(tk11, bVar2, this.P0);
                        }
                        boolean z18 = tk11 instanceof C5589nn0;
                        if (z18) {
                            C5589nn0 c5589nn4 = (C5589nn0) tk11;
                            if (c5589nn4.y0 == 0) {
                                arrayList2 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList2.add(c5589nn4);
                            } else {
                                arrayList2 = arrayList14;
                            }
                            z11 = z18;
                            if (c5589nn4.y0 == 1) {
                                arrayList = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList.add(c5589nn4);
                            } else {
                                arrayList = arrayList12;
                            }
                        } else {
                            z11 = z18;
                            arrayList = arrayList12;
                            arrayList2 = arrayList14;
                        }
                        if (tk11 instanceof C6641so0) {
                            if (tk11 instanceof C6017pq) {
                                C6017pq c6017pq3 = (C6017pq) tk11;
                                if (c6017pq3.X() == 0) {
                                    arrayList3 = arrayList13 == null ? new ArrayList() : arrayList13;
                                    arrayList3.add(c6017pq3);
                                } else {
                                    arrayList3 = arrayList13;
                                }
                                if (c6017pq3.X() == 1) {
                                    ArrayList arrayList16 = arrayList15 == null ? new ArrayList() : arrayList15;
                                    arrayList16.add(c6017pq3);
                                    arrayList15 = arrayList16;
                                }
                                arrayList7 = arrayList3;
                            } else {
                                arrayList = arrayList;
                                arrayList2 = arrayList2;
                                C6641so0 c6641so0 = (C6641so0) tk11;
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(c6641so0);
                                arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList9.add(c6641so0);
                            }
                            if (tk11.J.f == null && tk11.L.f == null && !z11 && !(tk11 instanceof C6017pq)) {
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                }
                                ArrayList arrayList17 = arrayList10;
                                arrayList17.add(tk11);
                                arrayList10 = arrayList17;
                            }
                            if (tk11.K.f != null && tk11.M.f == null && tk11.N.f == null && !z11 && !(tk11 instanceof C6017pq)) {
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                }
                                ArrayList arrayList18 = arrayList11;
                                arrayList18.add(tk11);
                                arrayList11 = arrayList18;
                            }
                            i30 = i31 + 1;
                            arrayList6 = arrayList;
                            arrayList8 = arrayList2;
                        } else {
                            arrayList7 = arrayList13;
                        }
                        arrayList9 = arrayList15;
                        if (tk11.J.f == null) {
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                            }
                            ArrayList arrayList19 = arrayList10;
                            arrayList19.add(tk11);
                            arrayList10 = arrayList19;
                        }
                        if (tk11.K.f != null) {
                        }
                        i30 = i31 + 1;
                        arrayList6 = arrayList;
                        arrayList8 = arrayList2;
                    }
                    ArrayList arrayList20 = arrayList6;
                    ArrayList<C6641so0> arrayList21 = arrayList7;
                    ArrayList arrayList22 = arrayList8;
                    ArrayList arrayList23 = arrayList9;
                    ArrayList<Ei2> arrayList24 = new ArrayList<>();
                    if (arrayList20 != null) {
                        Iterator it = arrayList20.iterator();
                        while (it.hasNext()) {
                            C3229cn0.a((C5589nn0) it.next(), 0, arrayList24, null);
                        }
                    }
                    Ei2 ei6 = null;
                    int i32 = 0;
                    if (arrayList21 != null) {
                        for (C6641so0 c6641so1 : arrayList21) {
                            Ei2 ei2A = C3229cn0.a(c6641so1, i32, arrayList24, ei6);
                            c6641so1.V(i32, ei2A, arrayList24);
                            ei2A.a(arrayList24);
                            ei6 = null;
                            i32 = 0;
                        }
                    }
                    HashSet<IK> hashSet = m(IK.a.d).a;
                    if (hashSet != null) {
                        Iterator<IK> it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            C3229cn0.a(it2.next().d, 0, arrayList24, null);
                        }
                    }
                    HashSet<IK> hashSet2 = m(IK.a.g).a;
                    if (hashSet2 != null) {
                        Iterator<IK> it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            C3229cn0.a(it3.next().d, 0, arrayList24, null);
                        }
                    }
                    IK.a aVar12 = IK.a.j;
                    HashSet<IK> hashSet3 = m(aVar12).a;
                    if (hashSet3 != null) {
                        Iterator<IK> it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            C3229cn0.a(it4.next().d, 0, arrayList24, null);
                        }
                    }
                    Ei2 ei7 = null;
                    if (arrayList10 != null) {
                        Iterator it5 = arrayList10.iterator();
                        while (it5.hasNext()) {
                            C3229cn0.a((TK) it5.next(), 0, arrayList24, null);
                        }
                    }
                    if (arrayList22 != null) {
                        Iterator it6 = arrayList22.iterator();
                        while (it6.hasNext()) {
                            C3229cn0.a((C5589nn0) it6.next(), 1, arrayList24, null);
                        }
                    }
                    int i33 = 1;
                    if (arrayList23 != null) {
                        Iterator it7 = arrayList23.iterator();
                        while (it7.hasNext()) {
                            C6641so0 c6641so2 = (C6641so0) it7.next();
                            Iterator it8 = it7;
                            Ei2 ei2A2 = C3229cn0.a(c6641so2, i33, arrayList24, ei7);
                            c6641so2.V(i33, ei2A2, arrayList24);
                            ei2A2.a(arrayList24);
                            it7 = it8;
                            i33 = 1;
                            ei7 = null;
                        }
                    }
                    HashSet<IK> hashSet4 = m(IK.a.e).a;
                    if (hashSet4 != null) {
                        Iterator<IK> it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            C3229cn0.a(it9.next().d, 1, arrayList24, null);
                        }
                    }
                    HashSet<IK> hashSet5 = m(IK.a.i).a;
                    if (hashSet5 != null) {
                        Iterator<IK> it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            C3229cn0.a(it10.next().d, 1, arrayList24, null);
                        }
                    }
                    HashSet<IK> hashSet6 = m(IK.a.h).a;
                    if (hashSet6 != null) {
                        Iterator<IK> it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            C3229cn0.a(it11.next().d, 1, arrayList24, null);
                        }
                    }
                    HashSet<IK> hashSet7 = m(aVar12).a;
                    if (hashSet7 != null) {
                        Iterator<IK> it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            C3229cn0.a(it12.next().d, 1, arrayList24, null);
                        }
                    }
                    if (arrayList11 != null) {
                        Iterator it13 = arrayList11.iterator();
                        while (it13.hasNext()) {
                            C3229cn0.a((TK) it13.next(), 1, arrayList24, null);
                        }
                    }
                    int i34 = 0;
                    while (i34 < size4) {
                        TK tk12 = arrayList5.get(i34);
                        TK.a[] aVarArr6 = tk12.U;
                        if (aVarArr6[0] == aVar5 && aVarArr6[1] == aVar5) {
                            int i35 = tk12.s0;
                            int size5 = arrayList24.size();
                            int i36 = 0;
                            while (true) {
                                if (i36 >= size5) {
                                    i13 = i34;
                                    aVar2 = aVar5;
                                    ei4 = null;
                                    break;
                                }
                                i13 = i34;
                                ei4 = arrayList24.get(i36);
                                aVar2 = aVar5;
                                if (i35 == ei4.b) {
                                    break;
                                }
                                i36++;
                                aVar5 = aVar2;
                                i34 = i13;
                            }
                            int i37 = tk12.t0;
                            int size6 = arrayList24.size();
                            int i38 = 0;
                            while (true) {
                                if (i38 >= size6) {
                                    ei5 = null;
                                    break;
                                }
                                ei5 = arrayList24.get(i38);
                                if (i37 == ei5.b) {
                                    break;
                                } else {
                                    i38++;
                                }
                            }
                            if (ei4 != null && ei5 != null) {
                                ei4.c(0, ei5);
                                ei5.c = 2;
                                arrayList24.remove(ei4);
                            }
                        } else {
                            i13 = i34;
                            aVar2 = aVar5;
                        }
                        i34 = i13 + 1;
                        aVar5 = aVar2;
                    }
                    if (arrayList24.size() > 1) {
                        if (this.U[0] == aVar9) {
                            int i39 = 0;
                            ei2 = null;
                            for (Ei2 ei8 : arrayList24) {
                                if (ei8.c != 1 && (iB2 = ei8.b(c4874kQ0, 0)) > i39) {
                                    ei2 = ei8;
                                    i39 = iB2;
                                }
                            }
                            if (ei2 != null) {
                                Q(aVar6);
                                S(i39);
                            } else {
                                ei2 = null;
                            }
                        } else {
                            ei2 = null;
                        }
                        if (this.U[1] == aVar9) {
                            int i40 = 0;
                            ei3 = null;
                            for (Ei2 ei9 : arrayList24) {
                                if (ei9.c != 0 && (iB = ei9.b(c4874kQ0, 1)) > i40) {
                                    ei3 = ei9;
                                    i40 = iB;
                                }
                            }
                            if (ei3 != null) {
                                R(aVar6);
                                P(i40);
                            } else {
                                ei3 = null;
                            }
                        } else {
                            ei3 = null;
                        }
                        if (ei2 != null || ei3 != null) {
                            if (aVar4 == aVar9) {
                                if (iMax3 >= u() || iMax3 <= 0) {
                                    iMax3 = u();
                                } else {
                                    S(iMax3);
                                    this.I0 = true;
                                }
                            }
                            if (aVar3 == aVar9) {
                                i12 = iMax4;
                                if (i12 >= o() || i12 <= 0) {
                                    iO = o();
                                } else {
                                    P(i12);
                                    this.J0 = true;
                                }
                                i2 = iO;
                                i3 = iMax3;
                                z = true;
                            } else {
                                i12 = iMax4;
                            }
                            iO = i12;
                            i2 = iO;
                            i3 = iMax3;
                            z = true;
                        }
                    }
                    if (!a0(64) || a0(UserVerificationMethods.USER_VERIFY_PATTERN)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c4874kQ0.getClass();
                    c4874kQ0.g = false;
                    if (this.H0 == 0 && z2) {
                        c = 1;
                        c4874kQ0.g = true;
                    } else {
                        c = 1;
                    }
                    ArrayList<TK> arrayList25 = this.u0;
                    aVarArr = this.U;
                    if (aVarArr[0] != aVar9 || aVarArr[c] == aVar9) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.D0 = 0;
                    this.E0 = 0;
                    i4 = i;
                    for (i5 = 0; i5 < i4; i5++) {
                        tk2 = this.u0.get(i5);
                        if (tk2 instanceof Di2) {
                            ((Di2) tk2).V();
                        }
                    }
                    zA0 = a0(64);
                    z4 = z;
                    i6 = 0;
                    r15 = 1;
                    while (r15 != 0) {
                        i7 = i6 + 1;
                        try {
                            c4874kQ0.t();
                            z6 = z3;
                            try {
                                this.D0 = 0;
                                this.E0 = 0;
                                k(c4874kQ0);
                                for (i11 = 0; i11 < i4; i11++) {
                                    this.u0.get(i11).k(c4874kQ0);
                                }
                                X(c4874kQ0);
                                try {
                                    weakReference = this.K0;
                                    if (weakReference != null || weakReference.get() == null) {
                                        aVar = aVar6;
                                        z7 = z4;
                                        ik3 = ik2;
                                    } else {
                                        IK ik8 = this.K0.get();
                                        IK ik9 = ik2;
                                        try {
                                            TN1 tn1K = c4874kQ0.k(ik9);
                                            aVar = aVar6;
                                            try {
                                                C4874kQ0 c4874kQ1 = this.A0;
                                                z7 = z4;
                                                ik3 = ik9;
                                                try {
                                                    c4874kQ1.f(c4874kQ1.k(ik8), tn1K, 0, 5);
                                                    this.K0 = null;
                                                } catch (Exception e) {
                                                    e = e;
                                                    ik2 = ik3;
                                                    r19 = 1;
                                                    e.printStackTrace();
                                                    System.out.println("EXCEPTION : " + e);
                                                    r16 = r19;
                                                    zArr = Y91.a;
                                                    if (r16 != 0) {
                                                        zArr[2] = false;
                                                        zA1 = a0(64);
                                                        U(c4874kQ0, zA1);
                                                        size = this.u0.size();
                                                        i10 = 0;
                                                        z10 = false;
                                                        while (i10 < size) {
                                                            boolean[] zArr3 = zArr;
                                                            tk = this.u0.get(i10);
                                                            tk.U(c4874kQ0, zA1);
                                                            int i41 = i10;
                                                            boolean z19 = zA1;
                                                            if (tk.h == -1) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = true;
                                                            }
                                                            i10 = i41 + 1;
                                                            zArr = zArr3;
                                                            zA1 = z19;
                                                            z10 = z10;
                                                        }
                                                        zArr2 = zArr;
                                                        z8 = z10;
                                                    } else {
                                                        zArr2 = zArr;
                                                        U(c4874kQ0, zA0);
                                                        for (i8 = 0; i8 < i4; i8++) {
                                                            this.u0.get(i8).U(c4874kQ0, zA0);
                                                        }
                                                        z8 = false;
                                                    }
                                                    if (!z6) {
                                                    }
                                                    iMax = Math.max(this.d0, u());
                                                    z9 = z8;
                                                    if (iMax > u()) {
                                                        S(iMax);
                                                        this.U[0] = aVar;
                                                        z9 = true;
                                                        z7 = true;
                                                    }
                                                    iMax2 = Math.max(this.e0, o());
                                                    if (iMax2 > o()) {
                                                        P(iMax2);
                                                        r10 = 1;
                                                        this.U[1] = aVar;
                                                        r17 = 1;
                                                        z7 = true;
                                                    } else {
                                                        r10 = 1;
                                                        r17 = z9;
                                                    }
                                                    if (z7) {
                                                        z4 = z7;
                                                        i9 = 8;
                                                        r18 = r17;
                                                    } else {
                                                        r17 = r17;
                                                        r17 = r17;
                                                        if (this.U[0] == aVar9) {
                                                            r17 = r17;
                                                            if (u() > i3) {
                                                                this.I0 = r10;
                                                                this.U[0] = aVar;
                                                                S(i3);
                                                                ?? r110 = r10;
                                                                z7 = r110 == true ? 1 : 0;
                                                                r17 = r110;
                                                            }
                                                        }
                                                        if (this.U[r10] == aVar9) {
                                                            z4 = z7;
                                                            i9 = 8;
                                                            r18 = r17;
                                                        } else {
                                                            z4 = z7;
                                                            i9 = 8;
                                                            r18 = r17;
                                                        }
                                                    }
                                                    if (i7 > i9) {
                                                        r18 = 0;
                                                    }
                                                    i6 = i7;
                                                    z3 = z6;
                                                    aVar6 = aVar;
                                                    r15 = r18;
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                z7 = z4;
                                                ik3 = ik9;
                                                ik2 = ik3;
                                                r19 = 1;
                                                e.printStackTrace();
                                                System.out.println("EXCEPTION : " + e);
                                                r16 = r19;
                                                zArr = Y91.a;
                                                if (r16 != 0) {
                                                    zArr[2] = false;
                                                    zA1 = a0(64);
                                                    U(c4874kQ0, zA1);
                                                    size = this.u0.size();
                                                    i10 = 0;
                                                    z10 = false;
                                                    while (i10 < size) {
                                                        boolean[] zArr4 = zArr;
                                                        tk = this.u0.get(i10);
                                                        tk.U(c4874kQ0, zA1);
                                                        int i42 = i10;
                                                        boolean z110 = zA1;
                                                        if (tk.h == -1) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = true;
                                                        }
                                                        i10 = i42 + 1;
                                                        zArr = zArr4;
                                                        zA1 = z110;
                                                        z10 = z10;
                                                    }
                                                    zArr2 = zArr;
                                                    z8 = z10;
                                                } else {
                                                    zArr2 = zArr;
                                                    U(c4874kQ0, zA0);
                                                    while (i8 < i4) {
                                                        this.u0.get(i8).U(c4874kQ0, zA0);
                                                    }
                                                    z8 = false;
                                                }
                                                if (!z6) {
                                                }
                                                iMax = Math.max(this.d0, u());
                                                z9 = z8;
                                                if (iMax > u()) {
                                                    S(iMax);
                                                    this.U[0] = aVar;
                                                    z9 = true;
                                                    z7 = true;
                                                }
                                                iMax2 = Math.max(this.e0, o());
                                                if (iMax2 > o()) {
                                                    P(iMax2);
                                                    r10 = 1;
                                                    this.U[1] = aVar;
                                                    r17 = 1;
                                                    z7 = true;
                                                } else {
                                                    r10 = 1;
                                                    r17 = z9;
                                                }
                                                if (z7) {
                                                    r17 = r17;
                                                    r17 = r17;
                                                    if (this.U[0] == aVar9) {
                                                        r17 = r17;
                                                        if (u() > i3) {
                                                            this.I0 = r10;
                                                            this.U[0] = aVar;
                                                            S(i3);
                                                            ?? r111 = r10;
                                                            z7 = r111 == true ? 1 : 0;
                                                            r17 = r111;
                                                        }
                                                    }
                                                    if (this.U[r10] == aVar9) {
                                                        z4 = z7;
                                                        i9 = 8;
                                                        r18 = r17;
                                                    } else {
                                                        z4 = z7;
                                                        i9 = 8;
                                                        r18 = r17;
                                                    }
                                                } else {
                                                    z4 = z7;
                                                    i9 = 8;
                                                    r18 = r17;
                                                }
                                                if (i7 > i9) {
                                                    r18 = 0;
                                                }
                                                i6 = i7;
                                                z3 = z6;
                                                aVar6 = aVar;
                                                r15 = r18;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            aVar = aVar6;
                                        }
                                    }
                                    try {
                                        weakReference2 = this.M0;
                                        if (weakReference2 != null && weakReference2.get() != null) {
                                            IK ik10 = this.M0.get();
                                            TN1 tn1K2 = c4874kQ0.k(this.M);
                                            C4874kQ0 c4874kQ2 = this.A0;
                                            c4874kQ2.f(tn1K2, c4874kQ2.k(ik10), 0, 5);
                                            this.M0 = null;
                                        }
                                        weakReference3 = this.L0;
                                        if (weakReference3 != null && weakReference3.get() != null) {
                                            IK ik11 = this.L0.get();
                                            ik4 = ik;
                                            try {
                                                TN1 tn1K3 = c4874kQ0.k(ik4);
                                                C4874kQ0 c4874kQ3 = this.A0;
                                                ik = ik4;
                                                c4874kQ3.f(c4874kQ3.k(ik11), tn1K3, 0, 5);
                                                this.L0 = null;
                                            } catch (Exception e4) {
                                                e = e4;
                                                ik = ik4;
                                                ik2 = ik3;
                                                r19 = 1;
                                                e.printStackTrace();
                                                System.out.println("EXCEPTION : " + e);
                                                r16 = r19;
                                            }
                                        }
                                        weakReference4 = this.N0;
                                        if (weakReference4 == null && weakReference4.get() != null) {
                                            IK ik12 = this.N0.get();
                                            TN1 tn1K4 = c4874kQ0.k(this.L);
                                            C4874kQ0 c4874kQ4 = this.A0;
                                            c4874kQ4.f(tn1K4, c4874kQ4.k(ik12), 0, 5);
                                            try {
                                                this.N0 = null;
                                            } catch (Exception e5) {
                                                e = e5;
                                                ik2 = ik3;
                                                r19 = 1;
                                                e.printStackTrace();
                                                System.out.println("EXCEPTION : " + e);
                                                r16 = r19;
                                            }
                                        }
                                        c4874kQ0.p();
                                        ik2 = ik3;
                                        r16 = 1;
                                    } catch (Exception e6) {
                                        e = e6;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    aVar = aVar6;
                                    z7 = z4;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                aVar = aVar6;
                                z7 = z4;
                                r19 = r15;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r16 = r19;
                                zArr = Y91.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zA1 = a0(64);
                                    U(c4874kQ0, zA1);
                                    size = this.u0.size();
                                    i10 = 0;
                                    z10 = false;
                                    while (i10 < size) {
                                        boolean[] zArr5 = zArr;
                                        tk = this.u0.get(i10);
                                        tk.U(c4874kQ0, zA1);
                                        int i43 = i10;
                                        boolean z111 = zA1;
                                        if (tk.h == -1) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        i10 = i43 + 1;
                                        zArr = zArr5;
                                        zA1 = z111;
                                        z10 = z10;
                                    }
                                    zArr2 = zArr;
                                    z8 = z10;
                                } else {
                                    zArr2 = zArr;
                                    U(c4874kQ0, zA0);
                                    while (i8 < i4) {
                                        this.u0.get(i8).U(c4874kQ0, zA0);
                                    }
                                    z8 = false;
                                }
                                if (!z6) {
                                }
                                iMax = Math.max(this.d0, u());
                                z9 = z8;
                                if (iMax > u()) {
                                    S(iMax);
                                    this.U[0] = aVar;
                                    z9 = true;
                                    z7 = true;
                                }
                                iMax2 = Math.max(this.e0, o());
                                if (iMax2 > o()) {
                                    P(iMax2);
                                    r10 = 1;
                                    this.U[1] = aVar;
                                    r17 = 1;
                                    z7 = true;
                                } else {
                                    r10 = 1;
                                    r17 = z9;
                                }
                                if (z7) {
                                    r17 = r17;
                                    r17 = r17;
                                    if (this.U[0] == aVar9) {
                                        r17 = r17;
                                        if (u() > i3) {
                                            this.I0 = r10;
                                            this.U[0] = aVar;
                                            S(i3);
                                            ?? r112 = r10;
                                            z7 = r112 == true ? 1 : 0;
                                            r17 = r112;
                                        }
                                    }
                                    if (this.U[r10] == aVar9) {
                                        z4 = z7;
                                        i9 = 8;
                                        r18 = r17;
                                    } else {
                                        z4 = z7;
                                        i9 = 8;
                                        r18 = r17;
                                    }
                                } else {
                                    z4 = z7;
                                    i9 = 8;
                                    r18 = r17;
                                }
                                if (i7 > i9) {
                                    r18 = 0;
                                }
                                i6 = i7;
                                z3 = z6;
                                aVar6 = aVar;
                                r15 = r18;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            z6 = z3;
                        }
                        zArr = Y91.a;
                        if (r16 != 0) {
                            zArr[2] = false;
                            zA1 = a0(64);
                            U(c4874kQ0, zA1);
                            size = this.u0.size();
                            i10 = 0;
                            z10 = false;
                            while (i10 < size) {
                                boolean[] zArr6 = zArr;
                                tk = this.u0.get(i10);
                                tk.U(c4874kQ0, zA1);
                                int i44 = i10;
                                boolean z112 = zA1;
                                if (tk.h == -1 || tk.i != -1) {
                                    z10 = true;
                                }
                                i10 = i44 + 1;
                                zArr = zArr6;
                                zA1 = z112;
                                z10 = z10;
                            }
                            zArr2 = zArr;
                            z8 = z10;
                        } else {
                            zArr2 = zArr;
                            U(c4874kQ0, zA0);
                            while (i8 < i4) {
                                this.u0.get(i8).U(c4874kQ0, zA0);
                            }
                            z8 = false;
                        }
                        if (!z6 && i7 < 8) {
                            if (zArr2[2]) {
                                int iMax5 = 0;
                                int iMax6 = 0;
                                for (int i45 = 0; i45 < i4; i45++) {
                                    TK tk13 = this.u0.get(i45);
                                    iMax6 = Math.max(iMax6, tk13.u() + tk13.a0);
                                    iMax5 = Math.max(iMax5, tk13.o() + tk13.b0);
                                }
                                int iMax7 = Math.max(this.d0, iMax6);
                                int iMax8 = Math.max(this.e0, iMax5);
                                z8 = z8;
                                if (aVar4 == aVar9) {
                                    z8 = z8;
                                    if (u() < iMax7) {
                                        S(iMax7);
                                        this.U[0] = aVar9;
                                        z8 = true;
                                        z7 = true;
                                    }
                                }
                                if (aVar3 == aVar9 && o() < iMax8) {
                                    P(iMax8);
                                    this.U[1] = aVar9;
                                    z8 = true;
                                    z7 = true;
                                }
                            }
                        }
                        iMax = Math.max(this.d0, u());
                        z9 = z8;
                        if (iMax > u()) {
                            S(iMax);
                            this.U[0] = aVar;
                            z9 = true;
                            z7 = true;
                        }
                        iMax2 = Math.max(this.e0, o());
                        if (iMax2 > o()) {
                            P(iMax2);
                            r10 = 1;
                            this.U[1] = aVar;
                            r17 = 1;
                            z7 = true;
                        } else {
                            r10 = 1;
                            r17 = z9;
                        }
                        if (z7) {
                            r17 = r17;
                            r17 = r17;
                            if (this.U[0] == aVar9 && i3 > 0) {
                                r17 = r17;
                                if (u() > i3) {
                                    this.I0 = r10;
                                    this.U[0] = aVar;
                                    S(i3);
                                    ?? r113 = r10;
                                    z7 = r113 == true ? 1 : 0;
                                    r17 = r113;
                                }
                            }
                            if (this.U[r10] == aVar9 || i2 <= 0 || o() <= i2) {
                                z4 = z7;
                                i9 = 8;
                                r18 = r17;
                            } else {
                                this.J0 = r10;
                                this.U[r10] = aVar;
                                P(i2);
                                i9 = 8;
                                z4 = true;
                                r18 = 1;
                            }
                        } else {
                            z4 = z7;
                            i9 = 8;
                            r18 = r17;
                        }
                        if (i7 > i9) {
                            r18 = 0;
                        }
                        i6 = i7;
                        z3 = z6;
                        aVar6 = aVar;
                        r15 = r18;
                    }
                    z5 = z4;
                    this.u0 = arrayList25;
                    if (z5) {
                        TK.a[] aVarArr7 = this.U;
                        aVarArr7[0] = aVar4;
                        aVarArr7[1] = aVar3;
                    }
                    J(c4874kQ0.l);
                }
                TK tk14 = arrayList5.get(i29);
                TK.a[] aVarArr8 = this.U;
                TK.a aVar13 = aVarArr8[0];
                int i46 = i29;
                TK.a aVar14 = aVarArr8[1];
                ik2 = ik6;
                TK.a[] aVarArr9 = tk14.U;
                i = size2;
                if (C3229cn0.b(aVar13, aVar14, aVarArr9[0], aVarArr9[1]) && !(tk14 instanceof C6187qf0)) {
                    i29 = i46 + 1;
                    ik6 = ik2;
                    size2 = i;
                }
            }
        }
        i2 = iMax4;
        i3 = iMax3;
        z = false;
        if (a0(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        c4874kQ0.getClass();
        c4874kQ0.g = false;
        if (this.H0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList<TK> arrayList26 = this.u0;
        aVarArr = this.U;
        if (aVarArr[0] != aVar9) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.D0 = 0;
        this.E0 = 0;
        i4 = i;
        while (i5 < i4) {
            tk2 = this.u0.get(i5);
            if (tk2 instanceof Di2) {
                ((Di2) tk2).V();
            }
        }
        zA0 = a0(64);
        z4 = z;
        i6 = 0;
        r15 = 1;
        while (r15 != 0) {
            i7 = i6 + 1;
            c4874kQ0.t();
            z6 = z3;
            this.D0 = 0;
            this.E0 = 0;
            k(c4874kQ0);
            while (i11 < i4) {
                this.u0.get(i11).k(c4874kQ0);
            }
            X(c4874kQ0);
            weakReference = this.K0;
            if (weakReference != null) {
                aVar = aVar6;
                z7 = z4;
                ik3 = ik2;
                weakReference2 = this.M0;
                if (weakReference2 != null) {
                    IK ik13 = this.M0.get();
                    TN1 tn1K5 = c4874kQ0.k(this.M);
                    C4874kQ0 c4874kQ5 = this.A0;
                    c4874kQ5.f(tn1K5, c4874kQ5.k(ik13), 0, 5);
                    this.M0 = null;
                }
                weakReference3 = this.L0;
                if (weakReference3 != null) {
                    IK ik14 = this.L0.get();
                    ik4 = ik;
                    TN1 tn1K6 = c4874kQ0.k(ik4);
                    C4874kQ0 c4874kQ6 = this.A0;
                    ik = ik4;
                    c4874kQ6.f(c4874kQ6.k(ik14), tn1K6, 0, 5);
                    this.L0 = null;
                }
                weakReference4 = this.N0;
                if (weakReference4 == null) {
                }
                c4874kQ0.p();
                ik2 = ik3;
                r16 = 1;
            } else {
                aVar = aVar6;
                z7 = z4;
                ik3 = ik2;
                weakReference2 = this.M0;
                if (weakReference2 != null) {
                    IK ik15 = this.M0.get();
                    TN1 tn1K7 = c4874kQ0.k(this.M);
                    C4874kQ0 c4874kQ7 = this.A0;
                    c4874kQ7.f(tn1K7, c4874kQ7.k(ik15), 0, 5);
                    this.M0 = null;
                }
                weakReference3 = this.L0;
                if (weakReference3 != null) {
                    IK ik16 = this.L0.get();
                    ik4 = ik;
                    TN1 tn1K8 = c4874kQ0.k(ik4);
                    C4874kQ0 c4874kQ8 = this.A0;
                    ik = ik4;
                    c4874kQ8.f(c4874kQ8.k(ik16), tn1K8, 0, 5);
                    this.L0 = null;
                }
                weakReference4 = this.N0;
                if (weakReference4 == null) {
                }
                c4874kQ0.p();
                ik2 = ik3;
                r16 = 1;
            }
            zArr = Y91.a;
            if (r16 != 0) {
                zArr[2] = false;
                zA1 = a0(64);
                U(c4874kQ0, zA1);
                size = this.u0.size();
                i10 = 0;
                z10 = false;
                while (i10 < size) {
                    boolean[] zArr7 = zArr;
                    tk = this.u0.get(i10);
                    tk.U(c4874kQ0, zA1);
                    int i47 = i10;
                    boolean z113 = zA1;
                    if (tk.h == -1) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    i10 = i47 + 1;
                    zArr = zArr7;
                    zA1 = z113;
                    z10 = z10;
                }
                zArr2 = zArr;
                z8 = z10;
            } else {
                zArr2 = zArr;
                U(c4874kQ0, zA0);
                while (i8 < i4) {
                    this.u0.get(i8).U(c4874kQ0, zA0);
                }
                z8 = false;
            }
            if (!z6) {
            }
            iMax = Math.max(this.d0, u());
            z9 = z8;
            if (iMax > u()) {
                S(iMax);
                this.U[0] = aVar;
                z9 = true;
                z7 = true;
            }
            iMax2 = Math.max(this.e0, o());
            if (iMax2 > o()) {
                P(iMax2);
                r10 = 1;
                this.U[1] = aVar;
                r17 = 1;
                z7 = true;
            } else {
                r10 = 1;
                r17 = z9;
            }
            if (z7) {
                r17 = r17;
                r17 = r17;
                if (this.U[0] == aVar9) {
                    r17 = r17;
                    if (u() > i3) {
                        this.I0 = r10;
                        this.U[0] = aVar;
                        S(i3);
                        ?? r114 = r10;
                        z7 = r114 == true ? 1 : 0;
                        r17 = r114;
                    }
                }
                if (this.U[r10] == aVar9) {
                    z4 = z7;
                    i9 = 8;
                    r18 = r17;
                } else {
                    z4 = z7;
                    i9 = 8;
                    r18 = r17;
                }
            } else {
                z4 = z7;
                i9 = 8;
                r18 = r17;
            }
            if (i7 > i9) {
                r18 = 0;
            }
            i6 = i7;
            z3 = z6;
            aVar6 = aVar;
            r15 = r18;
        }
        z5 = z4;
        this.u0 = arrayList26;
        if (z5) {
            TK.a[] aVarArr10 = this.U;
            aVarArr10[0] = aVar4;
            aVarArr10[1] = aVar3;
        }
        J(c4874kQ0.l);
    }

    public final void W(TK tk, int i) {
        if (i == 0) {
            int i2 = this.D0 + 1;
            C6673sz[] c6673szArr = this.G0;
            if (i2 >= c6673szArr.length) {
                this.G0 = (C6673sz[]) Arrays.copyOf(c6673szArr, c6673szArr.length * 2);
            }
            C6673sz[] c6673szArr2 = this.G0;
            int i3 = this.D0;
            c6673szArr2[i3] = new C6673sz(tk, 0, this.z0);
            this.D0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.E0 + 1;
            C6673sz[] c6673szArr3 = this.F0;
            if (i4 >= c6673szArr3.length) {
                this.F0 = (C6673sz[]) Arrays.copyOf(c6673szArr3, c6673szArr3.length * 2);
            }
            C6673sz[] c6673szArr4 = this.F0;
            int i5 = this.E0;
            c6673szArr4[i5] = new C6673sz(tk, 1, this.z0);
            this.E0 = i5 + 1;
        }
    }

    public final void X(C4874kQ0 c4874kQ0) {
        UK uk;
        C4874kQ0 c4874kQ1;
        boolean zA0 = a0(64);
        e(c4874kQ0, zA0);
        int size = this.u0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            TK tk = this.u0.get(i);
            boolean[] zArr = tk.T;
            zArr[0] = false;
            zArr[1] = false;
            if (tk instanceof C6017pq) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                TK tk2 = this.u0.get(i2);
                if (tk2 instanceof C6017pq) {
                    C6017pq c6017pq = (C6017pq) tk2;
                    for (int i3 = 0; i3 < c6017pq.v0; i3++) {
                        TK tk3 = c6017pq.u0[i3];
                        if (c6017pq.x0 || tk3.f()) {
                            int i4 = c6017pq.w0;
                            if (i4 == 0 || i4 == 1) {
                                tk3.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                tk3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<TK> hashSet = this.O0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            TK tk4 = this.u0.get(i5);
            tk4.getClass();
            boolean z2 = tk4 instanceof We2;
            if (z2 || (tk4 instanceof C5589nn0)) {
                if (z2) {
                    hashSet.add(tk4);
                } else {
                    tk4.e(c4874kQ0, zA0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<TK> it = hashSet.iterator();
            while (it.hasNext()) {
                We2 we2 = (We2) it.next();
                for (int i6 = 0; i6 < we2.v0; i6++) {
                    if (hashSet.contains(we2.u0[i6])) {
                        we2.e(c4874kQ0, zA0);
                        hashSet.remove(we2);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<TK> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().e(c4874kQ0, zA0);
                }
                hashSet.clear();
            }
        }
        boolean z3 = C4874kQ0.p;
        TK.a aVar = TK.a.e;
        if (z3) {
            HashSet<TK> hashSet2 = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                TK tk5 = this.u0.get(i7);
                tk5.getClass();
                if (!(tk5 instanceof We2) && !(tk5 instanceof C5589nn0)) {
                    hashSet2.add(tk5);
                }
            }
            uk = this;
            c4874kQ1 = c4874kQ0;
            uk.d(this, c4874kQ1, hashSet2, this.U[0] == aVar ? 0 : 1, false);
            for (TK tk6 : hashSet2) {
                Y91.a(this, c4874kQ1, tk6);
                tk6.e(c4874kQ1, zA0);
            }
        } else {
            uk = this;
            c4874kQ1 = c4874kQ0;
            for (int i8 = 0; i8 < size; i8++) {
                TK tk7 = uk.u0.get(i8);
                if (tk7 instanceof UK) {
                    TK.a[] aVarArr = tk7.U;
                    TK.a aVar2 = aVarArr[0];
                    TK.a aVar3 = aVarArr[1];
                    TK.a aVar4 = TK.a.d;
                    if (aVar2 == aVar) {
                        tk7.Q(aVar4);
                    }
                    if (aVar3 == aVar) {
                        tk7.R(aVar4);
                    }
                    tk7.e(c4874kQ1, zA0);
                    if (aVar2 == aVar) {
                        tk7.Q(aVar2);
                    }
                    if (aVar3 == aVar) {
                        tk7.R(aVar3);
                    }
                } else {
                    Y91.a(this, c4874kQ1, tk7);
                    if (!(tk7 instanceof We2) && !(tk7 instanceof C5589nn0)) {
                        tk7.e(c4874kQ1, zA0);
                    }
                }
            }
        }
        if (uk.D0 > 0) {
            C6463rz.a(this, c4874kQ1, null, 0);
        }
        if (uk.E0 > 0) {
            C6463rz.a(this, c4874kQ1, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    public final boolean Y(int i, boolean z) {
        boolean z2;
        TK.a aVar;
        boolean z3;
        CX cx = this.w0;
        UK uk = cx.a;
        boolean z4 = false;
        TK.a aVarN = uk.n(0);
        TK.a aVarN2 = uk.n(1);
        int iV = uk.v();
        int iW = uk.w();
        ArrayList<Fi2> arrayList = cx.e;
        TK.a aVar2 = TK.a.d;
        if (z && (aVarN == (aVar = TK.a.e) || aVarN2 == aVar)) {
            Iterator<Fi2> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = z;
                    break;
                }
                Fi2 next = it.next();
                if (next.f == i && !next.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && aVarN == aVar) {
                    uk.Q(aVar2);
                    uk.S(cx.d(uk, 0));
                    uk.d.e.d(uk.u());
                }
            } else if (z3 && aVarN2 == aVar) {
                uk.R(aVar2);
                uk.P(cx.d(uk, 1));
                uk.e.e.d(uk.o());
            }
        }
        TK.a aVar3 = TK.a.h;
        if (i == 0) {
            TK.a aVar4 = uk.U[0];
            if (aVar4 == aVar2 || aVar4 == aVar3) {
                int iU = uk.u() + iV;
                uk.d.i.d(iU);
                uk.d.e.d(iU - iV);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            TK.a aVar5 = uk.U[1];
            if (aVar5 == aVar2 || aVar5 == aVar3) {
                int iO = uk.o() + iW;
                uk.e.i.d(iO);
                uk.e.e.d(iO - iW);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        cx.g();
        for (Fi2 fi2 : arrayList) {
            if (fi2.f == i && (fi2.b != uk || fi2.g)) {
                fi2.e();
            }
        }
        for (Fi2 fi3 : arrayList) {
            if (fi3.f == i && (z2 || fi3.b != uk)) {
                if (!fi3.h.j || !fi3.i.j || (!(fi3 instanceof C6883tz) && !fi3.e.j)) {
                    uk.Q(aVarN);
                    uk.R(aVarN2);
                    return z4;
                }
            }
        }
        z4 = true;
        uk.Q(aVarN);
        uk.R(aVarN2);
        return z4;
    }

    public final boolean a0(int i) {
        return (this.H0 & i) == i;
    }

    @Override // defpackage.TK
    public final void r(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        Iterator<TK> it = this.u0.iterator();
        while (it.hasNext()) {
            it.next().r(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}

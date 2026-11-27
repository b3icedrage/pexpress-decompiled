package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Y91 {
    public static final boolean[] a = new boolean[3];

    public static void a(UK uk, C4874kQ0 c4874kQ0, TK tk) {
        tk.o = -1;
        tk.p = -1;
        TK.a aVar = uk.U[0];
        TK.a aVar2 = TK.a.e;
        TK.a aVar3 = TK.a.h;
        if (aVar != aVar2 && tk.U[0] == aVar3) {
            IK ik = tk.J;
            int i = ik.g;
            int iU = uk.u();
            IK ik2 = tk.L;
            int i2 = iU - ik2.g;
            ik.i = c4874kQ0.k(ik);
            ik2.i = c4874kQ0.k(ik2);
            c4874kQ0.d(ik.i, i);
            c4874kQ0.d(ik2.i, i2);
            tk.o = 2;
            tk.a0 = i;
            int i3 = i2 - i;
            tk.W = i3;
            int i4 = tk.d0;
            if (i3 < i4) {
                tk.W = i4;
            }
        }
        if (uk.U[1] == aVar2 || tk.U[1] != aVar3) {
            return;
        }
        IK ik3 = tk.K;
        int i5 = ik3.g;
        int iO = uk.o();
        IK ik4 = tk.M;
        int i6 = iO - ik4.g;
        ik3.i = c4874kQ0.k(ik3);
        ik4.i = c4874kQ0.k(ik4);
        c4874kQ0.d(ik3.i, i5);
        c4874kQ0.d(ik4.i, i6);
        if (tk.c0 > 0 || tk.i0 == 8) {
            IK ik5 = tk.N;
            ik5.i = c4874kQ0.k(ik5);
            c4874kQ0.d(ik5.i, tk.c0 + i5);
        }
        tk.p = 2;
        tk.b0 = i5;
        int i7 = i6 - i5;
        tk.X = i7;
        int i8 = tk.e0;
        if (i7 < i8) {
            tk.X = i8;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}

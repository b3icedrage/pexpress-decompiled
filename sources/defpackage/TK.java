package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TK {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final IK J;
    public final IK K;
    public final IK L;
    public final IK M;
    public final IK N;
    public final IK O;
    public final IK P;
    public final IK Q;
    public final IK[] R;
    public final ArrayList<IK> S;
    public final boolean[] T;
    public a[] U;
    public TK V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public int a0;
    public C6883tz b;
    public int b0;
    public C6883tz c;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public View h0;
    public int i0;
    public String j;
    public boolean j0;
    public boolean k;
    public String k0;
    public boolean l;
    public int l0;
    public boolean m;
    public int m0;
    public boolean n;
    public final float[] n0;
    public int o;
    public final TK[] o0;
    public int p;
    public final TK[] p0;
    public int q;
    public TK q0;
    public int r;
    public TK r0;
    public int s;
    public int s0;
    public final int[] t;
    public int t0;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public C3654ep0 d = null;
    public C6600sd2 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("FIXED", 0);
            d = aVar;
            a aVar2 = new a("WRAP_CONTENT", 1);
            e = aVar2;
            a aVar3 = new a("MATCH_CONSTRAINT", 2);
            g = aVar3;
            a aVar4 = new a("MATCH_PARENT", 3);
            h = aVar4;
            i = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    public TK() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        IK ik = new IK(this, IK.a.d);
        this.J = ik;
        IK ik2 = new IK(this, IK.a.e);
        this.K = ik2;
        IK ik3 = new IK(this, IK.a.g);
        this.L = ik3;
        IK ik4 = new IK(this, IK.a.h);
        this.M = ik4;
        IK ik5 = new IK(this, IK.a.i);
        this.N = ik5;
        IK ik6 = new IK(this, IK.a.k);
        this.O = ik6;
        IK ik7 = new IK(this, IK.a.l);
        this.P = ik7;
        IK ik8 = new IK(this, IK.a.j);
        this.Q = ik8;
        this.R = new IK[]{ik, ik3, ik2, ik4, ik5, ik8};
        ArrayList<IK> arrayList = new ArrayList<>();
        this.S = arrayList;
        this.T = new boolean[2];
        a aVar = a.d;
        this.U = new a[]{aVar, aVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new float[]{-1.0f, -1.0f};
        this.o0 = new TK[]{null, null};
        this.p0 = new TK[]{null, null};
        this.q0 = null;
        this.r0 = null;
        this.s0 = -1;
        this.t0 = -1;
        arrayList.add(ik);
        arrayList.add(ik2);
        arrayList.add(ik3);
        arrayList.add(ik4);
        arrayList.add(ik6);
        arrayList.add(ik7);
        arrayList.add(ik8);
        arrayList.add(ik5);
    }

    public static void K(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void L(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void s(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        K(i, 0, "      size", sb);
        K(i2, 0, "      min", sb);
        K(i3, Api.BaseClientBuilder.API_PRIORITY_OTHER, "      max", sb);
        K(i4, 0, "      matchMin", sb);
        K(i5, 0, "      matchDef", sb);
        L(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void t(StringBuilder sb, String str, IK ik) {
        if (ik.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(ik.f);
        sb.append("'");
        if (ik.h != Integer.MIN_VALUE || ik.g != 0) {
            sb.append(",");
            sb.append(ik.g);
            if (ik.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(ik.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A(int i) {
        IK ik;
        IK ik2;
        int i2 = i * 2;
        IK[] ikArr = this.R;
        IK ik3 = ikArr[i2];
        IK ik4 = ik3.f;
        return (ik4 == null || ik4.f == ik3 || (ik2 = (ik = ikArr[i2 + 1]).f) == null || ik2.f != ik) ? false : true;
    }

    public final boolean B() {
        IK ik = this.J;
        IK ik2 = ik.f;
        if (ik2 != null && ik2.f == ik) {
            return true;
        }
        IK ik3 = this.L;
        IK ik4 = ik3.f;
        return ik4 != null && ik4.f == ik3;
    }

    public final boolean C() {
        IK ik = this.K;
        IK ik2 = ik.f;
        if (ik2 != null && ik2.f == ik) {
            return true;
        }
        IK ik3 = this.M;
        IK ik4 = ik3.f;
        return ik4 != null && ik4.f == ik3;
    }

    public final boolean D() {
        return this.g && this.i0 != 8;
    }

    public boolean E() {
        if (this.k) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean F() {
        if (this.l) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public void G() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        a[] aVarArr = this.U;
        a aVar = a.d;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.h0 = null;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        float[] fArr = this.n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.y = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void H() {
        TK tk = this.V;
        if (tk != null && (tk instanceof UK)) {
            ((UK) tk).getClass();
        }
        ArrayList<IK> arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).j();
        }
    }

    public final void I() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList<IK> arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IK ik = arrayList.get(i);
            ik.c = false;
            ik.b = 0;
        }
    }

    public void J(C3887fx c3887fx) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void M(int i) {
        this.c0 = i;
        this.E = i > 0;
    }

    public final void N(int i, int i2) {
        if (this.k) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        this.k = true;
    }

    public final void O(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        if (this.E) {
            this.N.l(i + this.c0);
        }
        this.l = true;
    }

    public final void P(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public final void Q(a aVar) {
        this.U[0] = aVar;
    }

    public final void R(a aVar) {
        this.U[1] = aVar;
    }

    public final void S(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void T(boolean z, boolean z2) {
        int i;
        int i2;
        C3654ep0 c3654ep0 = this.d;
        boolean z3 = z & c3654ep0.g;
        C6600sd2 c6600sd2 = this.e;
        boolean z4 = z2 & c6600sd2.g;
        int i3 = c3654ep0.h.g;
        int i4 = c6600sd2.h.g;
        int i5 = c3654ep0.i.g;
        int i6 = c6600sd2.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.a0 = i3;
        }
        if (z4) {
            this.b0 = i4;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        a aVar = a.d;
        if (z3) {
            if (this.U[0] == aVar && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i10 = this.d0;
            if (i8 < i10) {
                this.W = i10;
            }
        }
        if (z4) {
            if (this.U[1] == aVar && i9 < (i = this.X)) {
                i9 = i;
            }
            this.X = i9;
            int i11 = this.e0;
            if (i9 < i11) {
                this.X = i11;
            }
        }
    }

    public void U(C4874kQ0 c4874kQ0, boolean z) {
        int i;
        int i2;
        C6600sd2 c6600sd2;
        C3654ep0 c3654ep0;
        IK ik = this.J;
        c4874kQ0.getClass();
        int iN = C4874kQ0.n(ik);
        int iN2 = C4874kQ0.n(this.K);
        int iN3 = C4874kQ0.n(this.L);
        int iN4 = C4874kQ0.n(this.M);
        if (z && (c3654ep0 = this.d) != null) {
            DX dx = c3654ep0.h;
            if (dx.j) {
                DX dx2 = c3654ep0.i;
                if (dx2.j) {
                    iN = dx.g;
                    iN3 = dx2.g;
                }
            }
        }
        if (z && (c6600sd2 = this.e) != null) {
            DX dx3 = c6600sd2.h;
            if (dx3.j) {
                DX dx4 = c6600sd2.i;
                if (dx4.j) {
                    iN2 = dx3.g;
                    iN4 = dx4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.a0 = iN;
        this.b0 = iN2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        a[] aVarArr = this.U;
        a aVar = aVarArr[0];
        a aVar2 = a.d;
        if (aVar == aVar2 && i4 < (i2 = this.W)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar2 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i4;
        this.X = i5;
        int i6 = this.e0;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.d0;
        if (i4 < i7) {
            this.W = i7;
        }
        int i8 = this.v;
        a aVar3 = a.g;
        if (i8 > 0 && aVar == aVar3) {
            this.W = Math.min(this.W, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && this.U[1] == aVar3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void d(UK uk, C4874kQ0 c4874kQ0, HashSet<TK> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Y91.a(uk, c4874kQ0, this);
            hashSet.remove(this);
            e(c4874kQ0, uk.a0(64));
        }
        if (i == 0) {
            HashSet<IK> hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator<IK> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.d(uk, c4874kQ0, hashSet, i, true);
                }
            }
            HashSet<IK> hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator<IK> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.d(uk, c4874kQ0, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<IK> hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator<IK> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().d.d(uk, c4874kQ0, hashSet, i, true);
            }
        }
        HashSet<IK> hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator<IK> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().d.d(uk, c4874kQ0, hashSet, i, true);
            }
        }
        HashSet<IK> hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator<IK> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().d.d(uk, c4874kQ0, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0210  */
    /* JADX WARN: Code duplicated, block: B:128:0x0218  */
    /* JADX WARN: Code duplicated, block: B:131:0x0221  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:137:0x023e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0247  */
    /* JADX WARN: Code duplicated, block: B:148:0x026d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0293  */
    /* JADX WARN: Code duplicated, block: B:164:0x029e  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:190:0x0302  */
    /* JADX WARN: Code duplicated, block: B:253:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:255:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:263:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:267:0x03db  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:274:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:278:0x040b  */
    /* JADX WARN: Code duplicated, block: B:280:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0416  */
    /* JADX WARN: Code duplicated, block: B:286:0x041c  */
    /* JADX WARN: Code duplicated, block: B:290:0x0426  */
    /* JADX WARN: Code duplicated, block: B:293:0x0430  */
    /* JADX WARN: Code duplicated, block: B:296:0x0436  */
    /* JADX WARN: Code duplicated, block: B:298:0x0439  */
    /* JADX WARN: Code duplicated, block: B:301:0x0452  */
    /* JADX WARN: Code duplicated, block: B:320:0x0499  */
    /* JADX WARN: Code duplicated, block: B:335:0x0547  */
    /* JADX WARN: Code duplicated, block: B:351:0x0598  */
    /* JADX WARN: Code duplicated, block: B:354:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:355:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:357:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:379:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:381:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:383:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:385:0x060a  */
    /* JADX WARN: Code duplicated, block: B:387:0x060e  */
    /* JADX WARN: Code duplicated, block: B:388:0x0616  */
    /* JADX WARN: Code duplicated, block: B:394:0x066d  */
    /* JADX WARN: Code duplicated, block: B:396:0x0673  */
    /* JADX WARN: Code duplicated, block: B:398:0x067a  */
    /* JADX WARN: Code duplicated, block: B:399:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:402:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r36v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r59v0, types: [TK] */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    public void e(C4874kQ0 c4874kQ0, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r19;
        int i6;
        boolean z2;
        HashSet<IK> hashSet;
        TK tk;
        UK uk;
        WeakReference<IK> weakReference;
        WeakReference<IK> weakReference2;
        TK tk2;
        UK uk2;
        WeakReference<IK> weakReference3;
        WeakReference<IK> weakReference4;
        boolean[] zArr;
        IK ik;
        boolean[] zArr2;
        boolean z3;
        ?? r12;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        a aVar;
        a aVar2;
        boolean z5;
        a aVar3;
        boolean z6;
        int i12;
        float f;
        int i13;
        int i14;
        TN1 tn1;
        TN1 tn2;
        int i15;
        int i16;
        boolean z7;
        int i17;
        boolean z8;
        boolean z9;
        IK ik2;
        boolean z10;
        TN1 tn3;
        TN1 tn4;
        int i18;
        ?? r20;
        a aVar4;
        boolean z11;
        ?? r3;
        boolean z12;
        ?? r110;
        TN1 tn5;
        TN1 tn6;
        TN1 tn7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        IK ik3;
        ?? r27;
        C6600sd2 c6600sd2;
        C3654ep0 c3654ep0;
        int i24;
        int i25;
        int i26;
        ?? B;
        boolean zC;
        C3654ep0 c3654ep1;
        C6600sd2 c6600sd3;
        boolean z13;
        C4874kQ0 c4874kQ1 = c4874kQ0;
        IK ik4 = this.J;
        TN1 tn1K = c4874kQ1.k(ik4);
        IK ik5 = this.L;
        TN1 tn1K2 = c4874kQ1.k(ik5);
        IK ik6 = this.K;
        TN1 tn1K3 = c4874kQ1.k(ik6);
        IK ik7 = this.M;
        TN1 tn1K4 = c4874kQ1.k(ik7);
        IK ik8 = this.N;
        TN1 tn1K5 = c4874kQ1.k(ik8);
        TK tk3 = this.V;
        a aVar5 = a.e;
        if (tk3 != null) {
            a[] aVarArr = tk3.U;
            i2 = 0;
            i4 = aVarArr[0] == aVar5 ? 1 : 0;
            int i27 = aVarArr[1] == aVar5 ? 1 : 0;
            int i28 = this.q;
            if (i28 != 1) {
                i = 1;
                if (i28 == 2) {
                    i4 = 0;
                } else if (i28 != 3) {
                }
                i3 = i27;
            } else {
                i = 1;
                i3 = 0;
            }
            i5 = this.i0;
            r19 = i3;
            boolean[] zArr3 = this.T;
            if (i5 != 8 && !this.j0) {
                ArrayList<IK> arrayList = this.S;
                int size = arrayList.size();
                i6 = i4;
                int i29 = i2;
                while (true) {
                    if (i29 >= size) {
                        if (zArr3[i2] || zArr3[i]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i30 = size;
                    HashSet<IK> hashSet2 = arrayList.get(i29).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i29++;
                    size = i30;
                }
            } else {
                i6 = i4;
            }
            z2 = this.k;
            if (z2 || this.l) {
                if (z2) {
                    c4874kQ1.d(tn1K, this.a0);
                    c4874kQ1.d(tn1K2, this.a0 + this.W);
                    if (i6 != 0 && (tk2 = this.V) != null) {
                        uk2 = (UK) tk2;
                        weakReference3 = uk2.L0;
                        if (weakReference3 != null || weakReference3.get() == null || ik4.d() > uk2.L0.get().d()) {
                            uk2.L0 = new WeakReference<>(ik4);
                        }
                        weakReference4 = uk2.N0;
                        if (weakReference4 != null || weakReference4.get() == null || ik5.d() > uk2.N0.get().d()) {
                            uk2.N0 = new WeakReference<>(ik5);
                        }
                    }
                }
                if (this.l) {
                    c4874kQ1.d(tn1K3, this.b0);
                    c4874kQ1.d(tn1K4, this.b0 + this.X);
                    hashSet = ik8.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        c4874kQ1.d(tn1K5, this.b0 + this.c0);
                    }
                    if (r19 != 0 && (tk = this.V) != null) {
                        uk = (UK) tk;
                        weakReference = uk.K0;
                        if (weakReference != null || weakReference.get() == null || ik6.d() > uk.K0.get().d()) {
                            uk.K0 = new WeakReference<>(ik6);
                        }
                        weakReference2 = uk.M0;
                        if (weakReference2 != null || weakReference2.get() == null || ik7.d() > uk.M0.get().d()) {
                            uk.M0 = new WeakReference<>(ik7);
                        }
                    }
                }
                if (this.k && this.l) {
                    ?? r13 = i2;
                    this.k = r13;
                    this.l = r13;
                    return;
                }
            }
            zArr = this.f;
            if (z || (c3654ep1 = this.d) == null || (c6600sd3 = this.e) == null) {
                ik = ik8;
                zArr2 = zArr;
            } else {
                ik = ik8;
                DX dx = c3654ep1.h;
                zArr2 = zArr;
                if (dx.j && c3654ep1.i.j && c6600sd3.h.j && c6600sd3.i.j) {
                    c4874kQ1.d(tn1K, dx.g);
                    c4874kQ1.d(tn1K2, this.d.i.g);
                    c4874kQ1.d(tn1K3, this.e.h.g);
                    c4874kQ1.d(tn1K4, this.e.i.g);
                    c4874kQ1.d(tn1K5, this.e.k.g);
                    if (this.V == null) {
                        z13 = false;
                    } else {
                        if (i6 != 0 && zArr2[0] && !B()) {
                            c4874kQ1.f(c4874kQ1.k(this.V.L), tn1K2, 0, 8);
                        }
                        if (r19 == 0 || !zArr2[i] || C()) {
                            z13 = false;
                        } else {
                            z13 = false;
                            c4874kQ1.f(c4874kQ1.k(this.V.M), tn1K4, 0, 8);
                        }
                    }
                    this.k = z13;
                    this.l = z13;
                    return;
                }
            }
            if (this.V != null) {
                if (A(0)) {
                    ((UK) this.V).W(this, 0);
                    int i31 = i;
                    i26 = i31 == true ? 1 : 0;
                    B = i31;
                } else {
                    i26 = i;
                    B = B();
                }
                if (A(i26)) {
                    ((UK) this.V).W(this, i26);
                    zC = true;
                } else {
                    zC = C();
                }
                if (B != 0 && i6 != 0 && this.i0 != 8 && ik4.f == null && ik5.f == null) {
                    c4874kQ1.f(c4874kQ1.k(this.V.L), tn1K2, 0, 1);
                }
                if (!zC && r19 != 0 && this.i0 != 8 && ik6.f == null && ik7.f == null && ik == null) {
                    c4874kQ1.f(c4874kQ1.k(this.V.M), tn1K4, 0, 1);
                }
                z3 = zC;
                r12 = B;
            } else {
                ik4 = ik4;
                z3 = false;
                r12 = 0;
            }
            i7 = this.W;
            i8 = this.d0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.X;
            z4 = z3;
            i10 = this.e0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            a[] aVarArr2 = this.U;
            aVar = aVarArr2[0];
            aVar2 = a.g;
            if (aVar != aVar2) {
                z5 = true;
            } else {
                z5 = false;
            }
            aVar3 = aVarArr2[1];
            if (aVar3 != aVar2) {
                z6 = true;
            } else {
                z6 = false;
            }
            i12 = this.Z;
            this.A = i12;
            f = this.Y;
            this.B = f;
            i13 = this.r;
            i14 = this.s;
            if (f > 0.0f) {
                tn1 = tn1K4;
                if (this.i0 != 8) {
                    if (aVar == aVar2 || i13 != 0) {
                        i15 = i13;
                    } else {
                        i15 = 3;
                    }
                    if (aVar3 == aVar2 || i14 != 0) {
                        i25 = i14;
                    } else {
                        i25 = 3;
                    }
                    if (aVar != aVar2 && aVar3 == aVar2) {
                        tn2 = tn1K5;
                        if (i15 == 3 && i25 == 3) {
                            if (i12 == -1) {
                                if (z5 && !z6) {
                                    this.A = 0;
                                } else if (!z5 && z6) {
                                    this.A = 1;
                                    if (i12 == -1) {
                                        this.B = 1.0f / f;
                                    }
                                }
                            }
                            if (this.A == 0 && (!ik6.h() || !ik7.h())) {
                                this.A = 1;
                            } else if (this.A == 1 && (!ik4.h() || !ik5.h())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!ik6.h() || !ik7.h() || !ik4.h() || !ik5.h())) {
                                if (ik6.h() && ik7.h()) {
                                    this.A = 0;
                                } else if (ik4.h() && ik5.h()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            if (this.A == -1) {
                                int i32 = this.u;
                                if (i32 > 0 && this.x == 0) {
                                    this.A = 0;
                                } else if (i32 == 0 && this.x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                        }
                        i6 = i6;
                        z7 = true;
                        i16 = i25;
                        int[] iArr = this.t;
                        iArr[0] = i15;
                        iArr[1] = i16;
                        if (z7) {
                            int i33 = this.A;
                            i17 = -1;
                            boolean z14 = i33 != 0 || i33 == -1;
                            if (z7 || !((i24 = this.A) == 1 || i24 == i17)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (this.U[0] == aVar5 || !(this instanceof UK)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (z9) {
                                i8 = 0;
                            }
                            ik2 = this.Q;
                            z10 = !ik2.h();
                            boolean z15 = zArr3[0];
                            boolean z16 = zArr3[1];
                            if (this.o != 2 || this.k) {
                                tn3 = tn1K;
                                tn4 = tn1K2;
                                i18 = i15;
                                r20 = r12;
                                aVar4 = aVar5;
                                z11 = z4;
                                r3 = i6;
                                z12 = z10;
                                r110 = r19;
                            } else {
                                if (z && (c3654ep0 = this.d) != null) {
                                    DX dx2 = c3654ep0.h;
                                    if (dx2.j && c3654ep0.i.j) {
                                        if (z) {
                                            c4874kQ1.d(tn1K, dx2.g);
                                            c4874kQ1.d(tn1K2, this.d.i.g);
                                            if (this.V != null && i6 != 0 && zArr2[0] && !B()) {
                                                c4874kQ1.f(c4874kQ1.k(this.V.L), tn1K2, 0, 8);
                                            }
                                        }
                                        tn3 = tn1K;
                                        tn4 = tn1K2;
                                        i18 = i15;
                                        r20 = r12;
                                        aVar4 = aVar5;
                                        z11 = z4;
                                        r3 = i6;
                                        z12 = z10;
                                        r110 = r19;
                                    }
                                }
                                TK tk4 = this.V;
                                TN1 tn1K6 = tk4 != null ? c4874kQ1.k(tk4.L) : null;
                                TK tk5 = this.V;
                                TN1 tn1K7 = tk5 != null ? c4874kQ1.k(tk5.J) : null;
                                boolean z17 = zArr2[0];
                                a[] aVarArr3 = this.U;
                                i18 = i15;
                                ?? r111 = r12;
                                boolean z18 = z10;
                                ?? r4 = i6;
                                tn4 = tn1K2;
                                aVar4 = aVar5;
                                tn3 = tn1K;
                                c4874kQ1 = c4874kQ0;
                                g(c4874kQ1, true, r4, r19, z17, tn1K7, tn1K6, aVarArr3[0], z9, this.J, this.L, this.a0, i8, this.d0, this.C[0], this.f0, z14, aVarArr3[1] == aVar2, r111, z4, z15, i18, i16, this.u, this.v, this.w, z18);
                                z11 = z4;
                                r20 = r111 == true ? 1 : 0;
                                r110 = r19 == true ? 1 : 0;
                                r3 = r4;
                                z12 = z18;
                            }
                            if (z || (c6600sd2 = this.e) == null) {
                                tn5 = r33;
                                tn6 = tn1;
                                tn7 = tn2;
                                i19 = 0;
                                i20 = 8;
                                i21 = 1;
                                i22 = 1;
                            } else {
                                DX dx3 = c6600sd2.h;
                                if (dx3.j && c6600sd2.i.j) {
                                    int i34 = dx3.g;
                                    tn5 = tn1K3;
                                    c4874kQ1.d(tn5, i34);
                                    tn6 = tn1;
                                    c4874kQ1.d(tn6, this.e.i.g);
                                    tn7 = tn2;
                                    c4874kQ1.d(tn7, this.e.k.g);
                                    TK tk6 = this.V;
                                    if (tk6 == null || z11 || r110 == 0) {
                                        i19 = 0;
                                        i20 = 8;
                                        i21 = 1;
                                    } else {
                                        i21 = 1;
                                        if (zArr2[1]) {
                                            i19 = 0;
                                            i20 = 8;
                                            c4874kQ1.f(c4874kQ1.k(tk6.M), tn6, 0, 8);
                                        } else {
                                            i19 = 0;
                                            i20 = 8;
                                        }
                                    }
                                    i22 = i19;
                                } else {
                                    tn5 = r33;
                                    tn6 = tn1;
                                    tn7 = tn2;
                                    i19 = 0;
                                    i20 = 8;
                                    i21 = 1;
                                    i22 = 1;
                                }
                            }
                            if (this.p == 2) {
                                i23 = i19;
                            } else {
                                i23 = i22;
                            }
                            if (i23 == 0 && !this.l) {
                                int i35 = (this.U[i21] == aVar4 && (this instanceof UK)) ? i21 : i19;
                                int i36 = i35 != 0 ? i19 : i11;
                                TK tk7 = this.V;
                                TN1 tn1K8 = tk7 != null ? c4874kQ1.k(tk7.M) : null;
                                TK tk8 = this.V;
                                TN1 tn1K9 = tk8 != null ? c4874kQ1.k(tk8.K) : null;
                                int i37 = this.c0;
                                if (i37 <= 0) {
                                    r27 = z12;
                                    if (this.i0 == i20) {
                                        ik3 = ik;
                                        if (ik3.f != null) {
                                            c4874kQ1.e(tn7, tn5, i37, i20);
                                            c4874kQ1.e(tn7, c4874kQ1.k(ik3.f), ik3.e(), i20);
                                            if (r110 != 0) {
                                                c4874kQ1.f(tn1K8, c4874kQ1.k(ik7), i19, 5);
                                            }
                                            r27 = i19;
                                        } else if (this.i0 == i20) {
                                            c4874kQ1.e(tn7, tn5, ik3.e(), i20);
                                            r27 = z12;
                                        } else {
                                            c4874kQ1.e(tn7, tn5, i37, i20);
                                            r27 = z12;
                                        }
                                    }
                                } else {
                                    ik3 = ik;
                                    if (ik3.f != null) {
                                        c4874kQ1.e(tn7, tn5, i37, i20);
                                        c4874kQ1.e(tn7, c4874kQ1.k(ik3.f), ik3.e(), i20);
                                        if (r110 != 0) {
                                            c4874kQ1.f(tn1K8, c4874kQ1.k(ik7), i19, 5);
                                        }
                                        r27 = i19;
                                    } else if (this.i0 == i20) {
                                        c4874kQ1.e(tn7, tn5, ik3.e(), i20);
                                        r27 = z12;
                                    } else {
                                        c4874kQ1.e(tn7, tn5, i37, i20);
                                        r27 = z12;
                                    }
                                }
                                boolean z19 = zArr2[i21];
                                a[] aVarArr4 = this.U;
                                int i38 = i19;
                                c4874kQ1 = c4874kQ0;
                                g(c4874kQ1, false, r110, r3, z19, tn1K9, tn1K8, aVarArr4[i21], i35, this.K, this.M, this.b0, i36, this.e0, this.C[i21], this.g0, z8, aVarArr4[i38] == aVar2 ? 1 : i38, z11, r20, z16, i16, i18, this.x, this.y, this.z, r27);
                            }
                            if (z7) {
                                if (this.A == 1) {
                                    float f2 = this.B;
                                    C0747Cj c0747CjL = c4874kQ1.l();
                                    c0747CjL.d.k(tn6, -1.0f);
                                    c0747CjL.d.k(tn5, 1.0f);
                                    c0747CjL.d.k(tn4, f2);
                                    c0747CjL.d.k(tn3, -f2);
                                    c4874kQ1.c(c0747CjL);
                                } else {
                                    TN1 tn8 = tn5;
                                    float f3 = this.B;
                                    C0747Cj c0747CjL2 = c4874kQ1.l();
                                    c0747CjL2.d.k(tn4, -1.0f);
                                    c0747CjL2.d.k(tn3, 1.0f);
                                    c0747CjL2.d.k(tn6, f3);
                                    c0747CjL2.d.k(tn8, -f3);
                                    c4874kQ1.c(c0747CjL2);
                                }
                            }
                            if (ik2.h()) {
                                TK tk9 = ik2.f.d;
                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                int iE = ik2.e();
                                IK.a aVar6 = IK.a.d;
                                TN1 tn1K10 = c4874kQ1.k(m(aVar6));
                                IK.a aVar7 = IK.a.e;
                                TN1 tn1K11 = c4874kQ1.k(m(aVar7));
                                IK.a aVar8 = IK.a.g;
                                TN1 tn1K12 = c4874kQ1.k(m(aVar8));
                                IK.a aVar9 = IK.a.h;
                                TN1 tn1K13 = c4874kQ1.k(m(aVar9));
                                TN1 tn1K14 = c4874kQ1.k(tk9.m(aVar6));
                                TN1 tn1K15 = c4874kQ1.k(tk9.m(aVar7));
                                TN1 tn1K16 = c4874kQ1.k(tk9.m(aVar8));
                                TN1 tn1K17 = c4874kQ1.k(tk9.m(aVar9));
                                C0747Cj c0747CjL3 = c4874kQ1.l();
                                double d = radians;
                                double dSin = Math.sin(d);
                                double d2 = iE;
                                c0747CjL3.d.k(tn1K15, 0.5f);
                                c0747CjL3.d.k(tn1K17, 0.5f);
                                c0747CjL3.d.k(tn1K11, -0.5f);
                                c0747CjL3.d.k(tn1K13, -0.5f);
                                c0747CjL3.b = -((float) (dSin * d2));
                                c4874kQ1.c(c0747CjL3);
                                C0747Cj c0747CjL4 = c4874kQ1.l();
                                float fCos = (float) (Math.cos(d) * d2);
                                c0747CjL4.d.k(tn1K14, 0.5f);
                                c0747CjL4.d.k(tn1K16, 0.5f);
                                c0747CjL4.d.k(tn1K10, -0.5f);
                                c0747CjL4.d.k(tn1K12, -0.5f);
                                c0747CjL4.b = -fCos;
                                c4874kQ1.c(c0747CjL4);
                            }
                            this.k = false;
                            this.l = false;
                        }
                        i17 = -1;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (this.U[0] == aVar5) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        ik2 = this.Q;
                        z10 = !ik2.h();
                        boolean z110 = zArr3[0];
                        boolean z111 = zArr3[1];
                        if (this.o != 2) {
                            tn3 = tn1K;
                            tn4 = tn1K2;
                            i18 = i15;
                            r20 = r12;
                            aVar4 = aVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        } else {
                            tn3 = tn1K;
                            tn4 = tn1K2;
                            i18 = i15;
                            r20 = r12;
                            aVar4 = aVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        }
                        if (z) {
                            tn5 = r33;
                            tn6 = tn1;
                            tn7 = tn2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        } else {
                            tn5 = r33;
                            tn6 = tn1;
                            tn7 = tn2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        }
                        if (this.p == 2) {
                            i23 = i19;
                        } else {
                            i23 = i22;
                        }
                        if (i23 == 0) {
                        }
                        if (z7) {
                            if (this.A == 1) {
                                float f4 = this.B;
                                C0747Cj c0747CjL5 = c4874kQ1.l();
                                c0747CjL5.d.k(tn6, -1.0f);
                                c0747CjL5.d.k(tn5, 1.0f);
                                c0747CjL5.d.k(tn4, f4);
                                c0747CjL5.d.k(tn3, -f4);
                                c4874kQ1.c(c0747CjL5);
                            } else {
                                TN1 tn9 = tn5;
                                float f5 = this.B;
                                C0747Cj c0747CjL6 = c4874kQ1.l();
                                c0747CjL6.d.k(tn4, -1.0f);
                                c0747CjL6.d.k(tn3, 1.0f);
                                c0747CjL6.d.k(tn6, f5);
                                c0747CjL6.d.k(tn9, -f5);
                                c4874kQ1.c(c0747CjL6);
                            }
                        }
                        if (ik2.h()) {
                            TK tk10 = ik2.f.d;
                            float radians2 = (float) Math.toRadians(this.D + 90.0f);
                            int iE2 = ik2.e();
                            IK.a aVar10 = IK.a.d;
                            TN1 tn1K18 = c4874kQ1.k(m(aVar10));
                            IK.a aVar11 = IK.a.e;
                            TN1 tn1K19 = c4874kQ1.k(m(aVar11));
                            IK.a aVar12 = IK.a.g;
                            TN1 tn1K110 = c4874kQ1.k(m(aVar12));
                            IK.a aVar13 = IK.a.h;
                            TN1 tn1K111 = c4874kQ1.k(m(aVar13));
                            TN1 tn1K112 = c4874kQ1.k(tk10.m(aVar10));
                            TN1 tn1K113 = c4874kQ1.k(tk10.m(aVar11));
                            TN1 tn1K114 = c4874kQ1.k(tk10.m(aVar12));
                            TN1 tn1K115 = c4874kQ1.k(tk10.m(aVar13));
                            C0747Cj c0747CjL7 = c4874kQ1.l();
                            double d3 = radians2;
                            double dSin2 = Math.sin(d3);
                            double d4 = iE2;
                            c0747CjL7.d.k(tn1K113, 0.5f);
                            c0747CjL7.d.k(tn1K115, 0.5f);
                            c0747CjL7.d.k(tn1K19, -0.5f);
                            c0747CjL7.d.k(tn1K111, -0.5f);
                            c0747CjL7.b = -((float) (dSin2 * d4));
                            c4874kQ1.c(c0747CjL7);
                            C0747Cj c0747CjL8 = c4874kQ1.l();
                            float fCos2 = (float) (Math.cos(d3) * d4);
                            c0747CjL8.d.k(tn1K112, 0.5f);
                            c0747CjL8.d.k(tn1K114, 0.5f);
                            c0747CjL8.d.k(tn1K18, -0.5f);
                            c0747CjL8.d.k(tn1K110, -0.5f);
                            c0747CjL8.b = -fCos2;
                            c4874kQ1.c(c0747CjL8);
                        }
                        this.k = false;
                        this.l = false;
                    }
                    tn2 = tn1K5;
                    if (aVar == aVar2 || i15 != 3) {
                        if (aVar3 == aVar2 && i25 == 3) {
                            this.A = 1;
                            if (i12 == -1) {
                                this.B = 1.0f / f;
                            }
                            i11 = (int) (this.B * i7);
                            if (aVar != aVar2) {
                                i16 = 4;
                            }
                        }
                        i6 = i6;
                        z7 = true;
                    } else {
                        this.A = 0;
                        i8 = (int) (i9 * f);
                        i6 = i6;
                        if (aVar3 != aVar2) {
                            i15 = 4;
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                    }
                    i16 = i25;
                    int[] iArr2 = this.t;
                    iArr2[0] = i15;
                    iArr2[1] = i16;
                    if (z7) {
                        int i39 = this.A;
                        i17 = -1;
                        if (i39 != 0) {
                        }
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (this.U[0] == aVar5) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        ik2 = this.Q;
                        z10 = !ik2.h();
                        boolean z112 = zArr3[0];
                        boolean z113 = zArr3[1];
                        if (this.o != 2) {
                            tn3 = tn1K;
                            tn4 = tn1K2;
                            i18 = i15;
                            r20 = r12;
                            aVar4 = aVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        } else {
                            tn3 = tn1K;
                            tn4 = tn1K2;
                            i18 = i15;
                            r20 = r12;
                            aVar4 = aVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        }
                        if (z) {
                            tn5 = r33;
                            tn6 = tn1;
                            tn7 = tn2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        } else {
                            tn5 = r33;
                            tn6 = tn1;
                            tn7 = tn2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        }
                        if (this.p == 2) {
                            i23 = i19;
                        } else {
                            i23 = i22;
                        }
                        if (i23 == 0) {
                        }
                        if (z7) {
                            if (this.A == 1) {
                                float f6 = this.B;
                                C0747Cj c0747CjL9 = c4874kQ1.l();
                                c0747CjL9.d.k(tn6, -1.0f);
                                c0747CjL9.d.k(tn5, 1.0f);
                                c0747CjL9.d.k(tn4, f6);
                                c0747CjL9.d.k(tn3, -f6);
                                c4874kQ1.c(c0747CjL9);
                            } else {
                                TN1 tn10 = tn5;
                                float f7 = this.B;
                                C0747Cj c0747CjL10 = c4874kQ1.l();
                                c0747CjL10.d.k(tn4, -1.0f);
                                c0747CjL10.d.k(tn3, 1.0f);
                                c0747CjL10.d.k(tn6, f7);
                                c0747CjL10.d.k(tn10, -f7);
                                c4874kQ1.c(c0747CjL10);
                            }
                        }
                        if (ik2.h()) {
                            TK tk11 = ik2.f.d;
                            float radians3 = (float) Math.toRadians(this.D + 90.0f);
                            int iE3 = ik2.e();
                            IK.a aVar14 = IK.a.d;
                            TN1 tn1K116 = c4874kQ1.k(m(aVar14));
                            IK.a aVar15 = IK.a.e;
                            TN1 tn1K117 = c4874kQ1.k(m(aVar15));
                            IK.a aVar16 = IK.a.g;
                            TN1 tn1K118 = c4874kQ1.k(m(aVar16));
                            IK.a aVar17 = IK.a.h;
                            TN1 tn1K119 = c4874kQ1.k(m(aVar17));
                            TN1 tn1K1110 = c4874kQ1.k(tk11.m(aVar14));
                            TN1 tn1K1111 = c4874kQ1.k(tk11.m(aVar15));
                            TN1 tn1K1112 = c4874kQ1.k(tk11.m(aVar16));
                            TN1 tn1K1113 = c4874kQ1.k(tk11.m(aVar17));
                            C0747Cj c0747CjL11 = c4874kQ1.l();
                            double d5 = radians3;
                            double dSin3 = Math.sin(d5);
                            double d6 = iE3;
                            c0747CjL11.d.k(tn1K1111, 0.5f);
                            c0747CjL11.d.k(tn1K1113, 0.5f);
                            c0747CjL11.d.k(tn1K117, -0.5f);
                            c0747CjL11.d.k(tn1K119, -0.5f);
                            c0747CjL11.b = -((float) (dSin3 * d6));
                            c4874kQ1.c(c0747CjL11);
                            C0747Cj c0747CjL12 = c4874kQ1.l();
                            float fCos3 = (float) (Math.cos(d5) * d6);
                            c0747CjL12.d.k(tn1K1110, 0.5f);
                            c0747CjL12.d.k(tn1K1112, 0.5f);
                            c0747CjL12.d.k(tn1K116, -0.5f);
                            c0747CjL12.d.k(tn1K118, -0.5f);
                            c0747CjL12.b = -fCos3;
                            c4874kQ1.c(c0747CjL12);
                        }
                        this.k = false;
                        this.l = false;
                    }
                    i17 = -1;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (this.U[0] == aVar5) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    ik2 = this.Q;
                    z10 = !ik2.h();
                    boolean z114 = zArr3[0];
                    boolean z115 = zArr3[1];
                    if (this.o != 2) {
                        tn3 = tn1K;
                        tn4 = tn1K2;
                        i18 = i15;
                        r20 = r12;
                        aVar4 = aVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    } else {
                        tn3 = tn1K;
                        tn4 = tn1K2;
                        i18 = i15;
                        r20 = r12;
                        aVar4 = aVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    }
                    if (z) {
                        tn5 = r33;
                        tn6 = tn1;
                        tn7 = tn2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        tn5 = r33;
                        tn6 = tn1;
                        tn7 = tn2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.p == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        if (this.A == 1) {
                            float f8 = this.B;
                            C0747Cj c0747CjL13 = c4874kQ1.l();
                            c0747CjL13.d.k(tn6, -1.0f);
                            c0747CjL13.d.k(tn5, 1.0f);
                            c0747CjL13.d.k(tn4, f8);
                            c0747CjL13.d.k(tn3, -f8);
                            c4874kQ1.c(c0747CjL13);
                        } else {
                            TN1 tn11 = tn5;
                            float f9 = this.B;
                            C0747Cj c0747CjL14 = c4874kQ1.l();
                            c0747CjL14.d.k(tn4, -1.0f);
                            c0747CjL14.d.k(tn3, 1.0f);
                            c0747CjL14.d.k(tn6, f9);
                            c0747CjL14.d.k(tn11, -f9);
                            c4874kQ1.c(c0747CjL14);
                        }
                    }
                    if (ik2.h()) {
                        TK tk12 = ik2.f.d;
                        float radians4 = (float) Math.toRadians(this.D + 90.0f);
                        int iE4 = ik2.e();
                        IK.a aVar18 = IK.a.d;
                        TN1 tn1K1114 = c4874kQ1.k(m(aVar18));
                        IK.a aVar19 = IK.a.e;
                        TN1 tn1K1115 = c4874kQ1.k(m(aVar19));
                        IK.a aVar110 = IK.a.g;
                        TN1 tn1K1116 = c4874kQ1.k(m(aVar110));
                        IK.a aVar111 = IK.a.h;
                        TN1 tn1K1117 = c4874kQ1.k(m(aVar111));
                        TN1 tn1K1118 = c4874kQ1.k(tk12.m(aVar18));
                        TN1 tn1K1119 = c4874kQ1.k(tk12.m(aVar19));
                        TN1 tn1K11110 = c4874kQ1.k(tk12.m(aVar110));
                        TN1 tn1K11111 = c4874kQ1.k(tk12.m(aVar111));
                        C0747Cj c0747CjL15 = c4874kQ1.l();
                        double d7 = radians4;
                        double dSin4 = Math.sin(d7);
                        double d8 = iE4;
                        c0747CjL15.d.k(tn1K1119, 0.5f);
                        c0747CjL15.d.k(tn1K11111, 0.5f);
                        c0747CjL15.d.k(tn1K1115, -0.5f);
                        c0747CjL15.d.k(tn1K1117, -0.5f);
                        c0747CjL15.b = -((float) (dSin4 * d8));
                        c4874kQ1.c(c0747CjL15);
                        C0747Cj c0747CjL16 = c4874kQ1.l();
                        float fCos4 = (float) (Math.cos(d7) * d8);
                        c0747CjL16.d.k(tn1K1118, 0.5f);
                        c0747CjL16.d.k(tn1K11110, 0.5f);
                        c0747CjL16.d.k(tn1K1114, -0.5f);
                        c0747CjL16.d.k(tn1K1116, -0.5f);
                        c0747CjL16.b = -fCos4;
                        c4874kQ1.c(c0747CjL16);
                    }
                    this.k = false;
                    this.l = false;
                }
                z7 = false;
                int[] iArr3 = this.t;
                iArr3[0] = i15;
                iArr3[1] = i16;
                if (z7) {
                    int i310 = this.A;
                    i17 = -1;
                    if (i310 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (this.U[0] == aVar5) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    ik2 = this.Q;
                    z10 = !ik2.h();
                    boolean z116 = zArr3[0];
                    boolean z117 = zArr3[1];
                    if (this.o != 2) {
                        tn3 = tn1K;
                        tn4 = tn1K2;
                        i18 = i15;
                        r20 = r12;
                        aVar4 = aVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    } else {
                        tn3 = tn1K;
                        tn4 = tn1K2;
                        i18 = i15;
                        r20 = r12;
                        aVar4 = aVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    }
                    if (z) {
                        tn5 = r33;
                        tn6 = tn1;
                        tn7 = tn2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        tn5 = r33;
                        tn6 = tn1;
                        tn7 = tn2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.p == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        if (this.A == 1) {
                            float f10 = this.B;
                            C0747Cj c0747CjL17 = c4874kQ1.l();
                            c0747CjL17.d.k(tn6, -1.0f);
                            c0747CjL17.d.k(tn5, 1.0f);
                            c0747CjL17.d.k(tn4, f10);
                            c0747CjL17.d.k(tn3, -f10);
                            c4874kQ1.c(c0747CjL17);
                        } else {
                            TN1 tn12 = tn5;
                            float f11 = this.B;
                            C0747Cj c0747CjL18 = c4874kQ1.l();
                            c0747CjL18.d.k(tn4, -1.0f);
                            c0747CjL18.d.k(tn3, 1.0f);
                            c0747CjL18.d.k(tn6, f11);
                            c0747CjL18.d.k(tn12, -f11);
                            c4874kQ1.c(c0747CjL18);
                        }
                    }
                    if (ik2.h()) {
                        TK tk13 = ik2.f.d;
                        float radians5 = (float) Math.toRadians(this.D + 90.0f);
                        int iE5 = ik2.e();
                        IK.a aVar112 = IK.a.d;
                        TN1 tn1K11112 = c4874kQ1.k(m(aVar112));
                        IK.a aVar113 = IK.a.e;
                        TN1 tn1K11113 = c4874kQ1.k(m(aVar113));
                        IK.a aVar114 = IK.a.g;
                        TN1 tn1K11114 = c4874kQ1.k(m(aVar114));
                        IK.a aVar115 = IK.a.h;
                        TN1 tn1K11115 = c4874kQ1.k(m(aVar115));
                        TN1 tn1K11116 = c4874kQ1.k(tk13.m(aVar112));
                        TN1 tn1K11117 = c4874kQ1.k(tk13.m(aVar113));
                        TN1 tn1K11118 = c4874kQ1.k(tk13.m(aVar114));
                        TN1 tn1K11119 = c4874kQ1.k(tk13.m(aVar115));
                        C0747Cj c0747CjL19 = c4874kQ1.l();
                        double d9 = radians5;
                        double dSin5 = Math.sin(d9);
                        double d10 = iE5;
                        c0747CjL19.d.k(tn1K11117, 0.5f);
                        c0747CjL19.d.k(tn1K11119, 0.5f);
                        c0747CjL19.d.k(tn1K11113, -0.5f);
                        c0747CjL19.d.k(tn1K11115, -0.5f);
                        c0747CjL19.b = -((float) (dSin5 * d10));
                        c4874kQ1.c(c0747CjL19);
                        C0747Cj c0747CjL110 = c4874kQ1.l();
                        float fCos5 = (float) (Math.cos(d9) * d10);
                        c0747CjL110.d.k(tn1K11116, 0.5f);
                        c0747CjL110.d.k(tn1K11118, 0.5f);
                        c0747CjL110.d.k(tn1K11112, -0.5f);
                        c0747CjL110.d.k(tn1K11114, -0.5f);
                        c0747CjL110.b = -fCos5;
                        c4874kQ1.c(c0747CjL110);
                    }
                    this.k = false;
                    this.l = false;
                }
                i17 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (this.U[0] == aVar5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                ik2 = this.Q;
                z10 = !ik2.h();
                boolean z118 = zArr3[0];
                boolean z119 = zArr3[1];
                if (this.o != 2) {
                    tn3 = tn1K;
                    tn4 = tn1K2;
                    i18 = i15;
                    r20 = r12;
                    aVar4 = aVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                } else {
                    tn3 = tn1K;
                    tn4 = tn1K2;
                    i18 = i15;
                    r20 = r12;
                    aVar4 = aVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                }
                if (z) {
                    tn5 = r33;
                    tn6 = tn1;
                    tn7 = tn2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    tn5 = r33;
                    tn6 = tn1;
                    tn7 = tn2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.p == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    if (this.A == 1) {
                        float f12 = this.B;
                        C0747Cj c0747CjL111 = c4874kQ1.l();
                        c0747CjL111.d.k(tn6, -1.0f);
                        c0747CjL111.d.k(tn5, 1.0f);
                        c0747CjL111.d.k(tn4, f12);
                        c0747CjL111.d.k(tn3, -f12);
                        c4874kQ1.c(c0747CjL111);
                    } else {
                        TN1 tn13 = tn5;
                        float f13 = this.B;
                        C0747Cj c0747CjL112 = c4874kQ1.l();
                        c0747CjL112.d.k(tn4, -1.0f);
                        c0747CjL112.d.k(tn3, 1.0f);
                        c0747CjL112.d.k(tn6, f13);
                        c0747CjL112.d.k(tn13, -f13);
                        c4874kQ1.c(c0747CjL112);
                    }
                }
                if (ik2.h()) {
                    TK tk14 = ik2.f.d;
                    float radians6 = (float) Math.toRadians(this.D + 90.0f);
                    int iE6 = ik2.e();
                    IK.a aVar116 = IK.a.d;
                    TN1 tn1K111110 = c4874kQ1.k(m(aVar116));
                    IK.a aVar117 = IK.a.e;
                    TN1 tn1K111111 = c4874kQ1.k(m(aVar117));
                    IK.a aVar118 = IK.a.g;
                    TN1 tn1K111112 = c4874kQ1.k(m(aVar118));
                    IK.a aVar119 = IK.a.h;
                    TN1 tn1K111113 = c4874kQ1.k(m(aVar119));
                    TN1 tn1K111114 = c4874kQ1.k(tk14.m(aVar116));
                    TN1 tn1K111115 = c4874kQ1.k(tk14.m(aVar117));
                    TN1 tn1K111116 = c4874kQ1.k(tk14.m(aVar118));
                    TN1 tn1K111117 = c4874kQ1.k(tk14.m(aVar119));
                    C0747Cj c0747CjL113 = c4874kQ1.l();
                    double d11 = radians6;
                    double dSin6 = Math.sin(d11);
                    double d12 = iE6;
                    c0747CjL113.d.k(tn1K111115, 0.5f);
                    c0747CjL113.d.k(tn1K111117, 0.5f);
                    c0747CjL113.d.k(tn1K111111, -0.5f);
                    c0747CjL113.d.k(tn1K111113, -0.5f);
                    c0747CjL113.b = -((float) (dSin6 * d12));
                    c4874kQ1.c(c0747CjL113);
                    C0747Cj c0747CjL114 = c4874kQ1.l();
                    float fCos6 = (float) (Math.cos(d11) * d12);
                    c0747CjL114.d.k(tn1K111114, 0.5f);
                    c0747CjL114.d.k(tn1K111116, 0.5f);
                    c0747CjL114.d.k(tn1K111110, -0.5f);
                    c0747CjL114.d.k(tn1K111112, -0.5f);
                    c0747CjL114.b = -fCos6;
                    c4874kQ1.c(c0747CjL114);
                }
                this.k = false;
                this.l = false;
            }
            tn1 = tn1K4;
            tn2 = tn1K5;
            i15 = i13;
            i16 = i14;
            z7 = false;
            int[] iArr4 = this.t;
            iArr4[0] = i15;
            iArr4[1] = i16;
            if (z7) {
                int i311 = this.A;
                i17 = -1;
                if (i311 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (this.U[0] == aVar5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                ik2 = this.Q;
                z10 = !ik2.h();
                boolean z1110 = zArr3[0];
                boolean z1111 = zArr3[1];
                if (this.o != 2) {
                    tn3 = tn1K;
                    tn4 = tn1K2;
                    i18 = i15;
                    r20 = r12;
                    aVar4 = aVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                } else {
                    tn3 = tn1K;
                    tn4 = tn1K2;
                    i18 = i15;
                    r20 = r12;
                    aVar4 = aVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                }
                if (z) {
                    tn5 = r33;
                    tn6 = tn1;
                    tn7 = tn2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    tn5 = r33;
                    tn6 = tn1;
                    tn7 = tn2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.p == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    if (this.A == 1) {
                        float f14 = this.B;
                        C0747Cj c0747CjL115 = c4874kQ1.l();
                        c0747CjL115.d.k(tn6, -1.0f);
                        c0747CjL115.d.k(tn5, 1.0f);
                        c0747CjL115.d.k(tn4, f14);
                        c0747CjL115.d.k(tn3, -f14);
                        c4874kQ1.c(c0747CjL115);
                    } else {
                        TN1 tn14 = tn5;
                        float f15 = this.B;
                        C0747Cj c0747CjL116 = c4874kQ1.l();
                        c0747CjL116.d.k(tn4, -1.0f);
                        c0747CjL116.d.k(tn3, 1.0f);
                        c0747CjL116.d.k(tn6, f15);
                        c0747CjL116.d.k(tn14, -f15);
                        c4874kQ1.c(c0747CjL116);
                    }
                }
                if (ik2.h()) {
                    TK tk15 = ik2.f.d;
                    float radians7 = (float) Math.toRadians(this.D + 90.0f);
                    int iE7 = ik2.e();
                    IK.a aVar1110 = IK.a.d;
                    TN1 tn1K111118 = c4874kQ1.k(m(aVar1110));
                    IK.a aVar1111 = IK.a.e;
                    TN1 tn1K111119 = c4874kQ1.k(m(aVar1111));
                    IK.a aVar1112 = IK.a.g;
                    TN1 tn1K1111110 = c4874kQ1.k(m(aVar1112));
                    IK.a aVar1113 = IK.a.h;
                    TN1 tn1K1111111 = c4874kQ1.k(m(aVar1113));
                    TN1 tn1K1111112 = c4874kQ1.k(tk15.m(aVar1110));
                    TN1 tn1K1111113 = c4874kQ1.k(tk15.m(aVar1111));
                    TN1 tn1K1111114 = c4874kQ1.k(tk15.m(aVar1112));
                    TN1 tn1K1111115 = c4874kQ1.k(tk15.m(aVar1113));
                    C0747Cj c0747CjL117 = c4874kQ1.l();
                    double d13 = radians7;
                    double dSin7 = Math.sin(d13);
                    double d14 = iE7;
                    c0747CjL117.d.k(tn1K1111113, 0.5f);
                    c0747CjL117.d.k(tn1K1111115, 0.5f);
                    c0747CjL117.d.k(tn1K111119, -0.5f);
                    c0747CjL117.d.k(tn1K1111111, -0.5f);
                    c0747CjL117.b = -((float) (dSin7 * d14));
                    c4874kQ1.c(c0747CjL117);
                    C0747Cj c0747CjL118 = c4874kQ1.l();
                    float fCos7 = (float) (Math.cos(d13) * d14);
                    c0747CjL118.d.k(tn1K1111112, 0.5f);
                    c0747CjL118.d.k(tn1K1111114, 0.5f);
                    c0747CjL118.d.k(tn1K111118, -0.5f);
                    c0747CjL118.d.k(tn1K1111110, -0.5f);
                    c0747CjL118.b = -fCos7;
                    c4874kQ1.c(c0747CjL118);
                }
                this.k = false;
                this.l = false;
            }
            i17 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.U[0] == aVar5) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            ik2 = this.Q;
            z10 = !ik2.h();
            boolean z1112 = zArr3[0];
            boolean z1113 = zArr3[1];
            if (this.o != 2) {
                tn3 = tn1K;
                tn4 = tn1K2;
                i18 = i15;
                r20 = r12;
                aVar4 = aVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            } else {
                tn3 = tn1K;
                tn4 = tn1K2;
                i18 = i15;
                r20 = r12;
                aVar4 = aVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            }
            if (z) {
                tn5 = r33;
                tn6 = tn1;
                tn7 = tn2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            } else {
                tn5 = r33;
                tn6 = tn1;
                tn7 = tn2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            }
            if (this.p == 2) {
                i23 = i19;
            } else {
                i23 = i22;
            }
            if (i23 == 0) {
            }
            if (z7) {
                if (this.A == 1) {
                    float f16 = this.B;
                    C0747Cj c0747CjL119 = c4874kQ1.l();
                    c0747CjL119.d.k(tn6, -1.0f);
                    c0747CjL119.d.k(tn5, 1.0f);
                    c0747CjL119.d.k(tn4, f16);
                    c0747CjL119.d.k(tn3, -f16);
                    c4874kQ1.c(c0747CjL119);
                } else {
                    TN1 tn15 = tn5;
                    float f17 = this.B;
                    C0747Cj c0747CjL1110 = c4874kQ1.l();
                    c0747CjL1110.d.k(tn4, -1.0f);
                    c0747CjL1110.d.k(tn3, 1.0f);
                    c0747CjL1110.d.k(tn6, f17);
                    c0747CjL1110.d.k(tn15, -f17);
                    c4874kQ1.c(c0747CjL1110);
                }
            }
            if (ik2.h()) {
                TK tk16 = ik2.f.d;
                float radians8 = (float) Math.toRadians(this.D + 90.0f);
                int iE8 = ik2.e();
                IK.a aVar1114 = IK.a.d;
                TN1 tn1K1111116 = c4874kQ1.k(m(aVar1114));
                IK.a aVar1115 = IK.a.e;
                TN1 tn1K1111117 = c4874kQ1.k(m(aVar1115));
                IK.a aVar1116 = IK.a.g;
                TN1 tn1K1111118 = c4874kQ1.k(m(aVar1116));
                IK.a aVar1117 = IK.a.h;
                TN1 tn1K1111119 = c4874kQ1.k(m(aVar1117));
                TN1 tn1K11111110 = c4874kQ1.k(tk16.m(aVar1114));
                TN1 tn1K11111111 = c4874kQ1.k(tk16.m(aVar1115));
                TN1 tn1K11111112 = c4874kQ1.k(tk16.m(aVar1116));
                TN1 tn1K11111113 = c4874kQ1.k(tk16.m(aVar1117));
                C0747Cj c0747CjL1111 = c4874kQ1.l();
                double d15 = radians8;
                double dSin8 = Math.sin(d15);
                double d16 = iE8;
                c0747CjL1111.d.k(tn1K11111111, 0.5f);
                c0747CjL1111.d.k(tn1K11111113, 0.5f);
                c0747CjL1111.d.k(tn1K1111117, -0.5f);
                c0747CjL1111.d.k(tn1K1111119, -0.5f);
                c0747CjL1111.b = -((float) (dSin8 * d16));
                c4874kQ1.c(c0747CjL1111);
                C0747Cj c0747CjL1112 = c4874kQ1.l();
                float fCos8 = (float) (Math.cos(d15) * d16);
                c0747CjL1112.d.k(tn1K11111110, 0.5f);
                c0747CjL1112.d.k(tn1K11111112, 0.5f);
                c0747CjL1112.d.k(tn1K1111116, -0.5f);
                c0747CjL1112.d.k(tn1K1111118, -0.5f);
                c0747CjL1112.b = -fCos8;
                c4874kQ1.c(c0747CjL1112);
            }
            this.k = false;
            this.l = false;
        }
        i = 1;
        i2 = 0;
        i3 = i2;
        i4 = i3;
        i5 = this.i0;
        r19 = i3;
        boolean[] zArr4 = this.T;
        if (i5 != 8) {
            i6 = i4;
        } else {
            i6 = i4;
        }
        z2 = this.k;
        if (z2) {
            if (z2) {
                c4874kQ1.d(tn1K, this.a0);
                c4874kQ1.d(tn1K2, this.a0 + this.W);
                if (i6 != 0) {
                    uk2 = (UK) tk2;
                    weakReference3 = uk2.L0;
                    if (weakReference3 != null) {
                        uk2.L0 = new WeakReference<>(ik4);
                    } else {
                        uk2.L0 = new WeakReference<>(ik4);
                    }
                    weakReference4 = uk2.N0;
                    if (weakReference4 != null) {
                        uk2.N0 = new WeakReference<>(ik5);
                    } else {
                        uk2.N0 = new WeakReference<>(ik5);
                    }
                }
            }
            if (this.l) {
                c4874kQ1.d(tn1K3, this.b0);
                c4874kQ1.d(tn1K4, this.b0 + this.X);
                hashSet = ik8.a;
                if (hashSet != null) {
                    c4874kQ1.d(tn1K5, this.b0 + this.c0);
                }
                if (r19 != 0) {
                    uk = (UK) tk;
                    weakReference = uk.K0;
                    if (weakReference != null) {
                        uk.K0 = new WeakReference<>(ik6);
                    } else {
                        uk.K0 = new WeakReference<>(ik6);
                    }
                    weakReference2 = uk.M0;
                    if (weakReference2 != null) {
                        uk.M0 = new WeakReference<>(ik7);
                    } else {
                        uk.M0 = new WeakReference<>(ik7);
                    }
                }
            }
            if (this.k) {
                ?? r14 = i2;
                this.k = r14;
                this.l = r14;
                return;
            }
        } else {
            if (z2) {
                c4874kQ1.d(tn1K, this.a0);
                c4874kQ1.d(tn1K2, this.a0 + this.W);
                if (i6 != 0) {
                    uk2 = (UK) tk2;
                    weakReference3 = uk2.L0;
                    if (weakReference3 != null) {
                        uk2.L0 = new WeakReference<>(ik4);
                    } else {
                        uk2.L0 = new WeakReference<>(ik4);
                    }
                    weakReference4 = uk2.N0;
                    if (weakReference4 != null) {
                        uk2.N0 = new WeakReference<>(ik5);
                    } else {
                        uk2.N0 = new WeakReference<>(ik5);
                    }
                }
            }
            if (this.l) {
                c4874kQ1.d(tn1K3, this.b0);
                c4874kQ1.d(tn1K4, this.b0 + this.X);
                hashSet = ik8.a;
                if (hashSet != null) {
                    c4874kQ1.d(tn1K5, this.b0 + this.c0);
                }
                if (r19 != 0) {
                    uk = (UK) tk;
                    weakReference = uk.K0;
                    if (weakReference != null) {
                        uk.K0 = new WeakReference<>(ik6);
                    } else {
                        uk.K0 = new WeakReference<>(ik6);
                    }
                    weakReference2 = uk.M0;
                    if (weakReference2 != null) {
                        uk.M0 = new WeakReference<>(ik7);
                    } else {
                        uk.M0 = new WeakReference<>(ik7);
                    }
                }
            }
            if (this.k) {
                ?? r15 = i2;
                this.k = r15;
                this.l = r15;
                return;
            }
        }
        zArr = this.f;
        if (z) {
            ik = ik8;
            zArr2 = zArr;
        } else {
            ik = ik8;
            zArr2 = zArr;
        }
        if (this.V != null) {
            if (A(0)) {
                ((UK) this.V).W(this, 0);
                int i312 = i;
                i26 = i312 == true ? 1 : 0;
                B = i312;
            } else {
                i26 = i;
                B = B();
            }
            if (A(i26)) {
                ((UK) this.V).W(this, i26);
                zC = true;
            } else {
                zC = C();
            }
            if (B != 0) {
            }
            if (!zC) {
                c4874kQ1.f(c4874kQ1.k(this.V.M), tn1K4, 0, 1);
            }
            z3 = zC;
            r12 = B;
        } else {
            ik4 = ik4;
            z3 = false;
            r12 = 0;
        }
        i7 = this.W;
        i8 = this.d0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.X;
        z4 = z3;
        i10 = this.e0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        a[] aVarArr5 = this.U;
        aVar = aVarArr5[0];
        aVar2 = a.g;
        if (aVar != aVar2) {
            z5 = true;
        } else {
            z5 = false;
        }
        aVar3 = aVarArr5[1];
        if (aVar3 != aVar2) {
            z6 = true;
        } else {
            z6 = false;
        }
        i12 = this.Z;
        this.A = i12;
        f = this.Y;
        this.B = f;
        i13 = this.r;
        i14 = this.s;
        if (f > 0.0f) {
            tn1 = tn1K4;
            if (this.i0 != 8) {
                if (aVar == aVar2) {
                    i15 = i13;
                } else {
                    i15 = i13;
                }
                if (aVar3 == aVar2) {
                    i25 = i14;
                } else {
                    i25 = i14;
                }
                if (aVar != aVar2) {
                    tn2 = tn1K5;
                    if (aVar == aVar2) {
                    }
                    if (aVar3 == aVar2) {
                        this.A = 1;
                        if (i12 == -1) {
                            this.B = 1.0f / f;
                        }
                        i11 = (int) (this.B * i7);
                        if (aVar != aVar2) {
                            i16 = 4;
                        }
                    }
                } else {
                    tn2 = tn1K5;
                    if (aVar == aVar2) {
                    }
                    if (aVar3 == aVar2) {
                        this.A = 1;
                        if (i12 == -1) {
                            this.B = 1.0f / f;
                        }
                        i11 = (int) (this.B * i7);
                        if (aVar != aVar2) {
                            i16 = 4;
                        }
                    }
                }
                i6 = i6;
                z7 = true;
                i16 = i25;
                int[] iArr5 = this.t;
                iArr5[0] = i15;
                iArr5[1] = i16;
                if (z7) {
                    int i313 = this.A;
                    i17 = -1;
                    if (i313 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (this.U[0] == aVar5) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    ik2 = this.Q;
                    z10 = !ik2.h();
                    boolean z1114 = zArr4[0];
                    boolean z1115 = zArr4[1];
                    if (this.o != 2) {
                        tn3 = tn1K;
                        tn4 = tn1K2;
                        i18 = i15;
                        r20 = r12;
                        aVar4 = aVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    } else {
                        tn3 = tn1K;
                        tn4 = tn1K2;
                        i18 = i15;
                        r20 = r12;
                        aVar4 = aVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    }
                    if (z) {
                        tn5 = r33;
                        tn6 = tn1;
                        tn7 = tn2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        tn5 = r33;
                        tn6 = tn1;
                        tn7 = tn2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.p == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        if (this.A == 1) {
                            float f18 = this.B;
                            C0747Cj c0747CjL1113 = c4874kQ1.l();
                            c0747CjL1113.d.k(tn6, -1.0f);
                            c0747CjL1113.d.k(tn5, 1.0f);
                            c0747CjL1113.d.k(tn4, f18);
                            c0747CjL1113.d.k(tn3, -f18);
                            c4874kQ1.c(c0747CjL1113);
                        } else {
                            TN1 tn16 = tn5;
                            float f19 = this.B;
                            C0747Cj c0747CjL1114 = c4874kQ1.l();
                            c0747CjL1114.d.k(tn4, -1.0f);
                            c0747CjL1114.d.k(tn3, 1.0f);
                            c0747CjL1114.d.k(tn6, f19);
                            c0747CjL1114.d.k(tn16, -f19);
                            c4874kQ1.c(c0747CjL1114);
                        }
                    }
                    if (ik2.h()) {
                        TK tk17 = ik2.f.d;
                        float radians9 = (float) Math.toRadians(this.D + 90.0f);
                        int iE9 = ik2.e();
                        IK.a aVar1118 = IK.a.d;
                        TN1 tn1K11111114 = c4874kQ1.k(m(aVar1118));
                        IK.a aVar1119 = IK.a.e;
                        TN1 tn1K11111115 = c4874kQ1.k(m(aVar1119));
                        IK.a aVar11110 = IK.a.g;
                        TN1 tn1K11111116 = c4874kQ1.k(m(aVar11110));
                        IK.a aVar11111 = IK.a.h;
                        TN1 tn1K11111117 = c4874kQ1.k(m(aVar11111));
                        TN1 tn1K11111118 = c4874kQ1.k(tk17.m(aVar1118));
                        TN1 tn1K11111119 = c4874kQ1.k(tk17.m(aVar1119));
                        TN1 tn1K111111110 = c4874kQ1.k(tk17.m(aVar11110));
                        TN1 tn1K111111111 = c4874kQ1.k(tk17.m(aVar11111));
                        C0747Cj c0747CjL1115 = c4874kQ1.l();
                        double d17 = radians9;
                        double dSin9 = Math.sin(d17);
                        double d18 = iE9;
                        c0747CjL1115.d.k(tn1K11111119, 0.5f);
                        c0747CjL1115.d.k(tn1K111111111, 0.5f);
                        c0747CjL1115.d.k(tn1K11111115, -0.5f);
                        c0747CjL1115.d.k(tn1K11111117, -0.5f);
                        c0747CjL1115.b = -((float) (dSin9 * d18));
                        c4874kQ1.c(c0747CjL1115);
                        C0747Cj c0747CjL1116 = c4874kQ1.l();
                        float fCos9 = (float) (Math.cos(d17) * d18);
                        c0747CjL1116.d.k(tn1K11111118, 0.5f);
                        c0747CjL1116.d.k(tn1K111111110, 0.5f);
                        c0747CjL1116.d.k(tn1K11111114, -0.5f);
                        c0747CjL1116.d.k(tn1K11111116, -0.5f);
                        c0747CjL1116.b = -fCos9;
                        c4874kQ1.c(c0747CjL1116);
                    }
                    this.k = false;
                    this.l = false;
                }
                i17 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (this.U[0] == aVar5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                ik2 = this.Q;
                z10 = !ik2.h();
                boolean z1116 = zArr4[0];
                boolean z1117 = zArr4[1];
                if (this.o != 2) {
                    tn3 = tn1K;
                    tn4 = tn1K2;
                    i18 = i15;
                    r20 = r12;
                    aVar4 = aVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                } else {
                    tn3 = tn1K;
                    tn4 = tn1K2;
                    i18 = i15;
                    r20 = r12;
                    aVar4 = aVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                }
                if (z) {
                    tn5 = r33;
                    tn6 = tn1;
                    tn7 = tn2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    tn5 = r33;
                    tn6 = tn1;
                    tn7 = tn2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.p == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    if (this.A == 1) {
                        float f110 = this.B;
                        C0747Cj c0747CjL1117 = c4874kQ1.l();
                        c0747CjL1117.d.k(tn6, -1.0f);
                        c0747CjL1117.d.k(tn5, 1.0f);
                        c0747CjL1117.d.k(tn4, f110);
                        c0747CjL1117.d.k(tn3, -f110);
                        c4874kQ1.c(c0747CjL1117);
                    } else {
                        TN1 tn17 = tn5;
                        float f111 = this.B;
                        C0747Cj c0747CjL1118 = c4874kQ1.l();
                        c0747CjL1118.d.k(tn4, -1.0f);
                        c0747CjL1118.d.k(tn3, 1.0f);
                        c0747CjL1118.d.k(tn6, f111);
                        c0747CjL1118.d.k(tn17, -f111);
                        c4874kQ1.c(c0747CjL1118);
                    }
                }
                if (ik2.h()) {
                    TK tk18 = ik2.f.d;
                    float radians10 = (float) Math.toRadians(this.D + 90.0f);
                    int iE10 = ik2.e();
                    IK.a aVar11112 = IK.a.d;
                    TN1 tn1K111111112 = c4874kQ1.k(m(aVar11112));
                    IK.a aVar11113 = IK.a.e;
                    TN1 tn1K111111113 = c4874kQ1.k(m(aVar11113));
                    IK.a aVar11114 = IK.a.g;
                    TN1 tn1K111111114 = c4874kQ1.k(m(aVar11114));
                    IK.a aVar11115 = IK.a.h;
                    TN1 tn1K111111115 = c4874kQ1.k(m(aVar11115));
                    TN1 tn1K111111116 = c4874kQ1.k(tk18.m(aVar11112));
                    TN1 tn1K111111117 = c4874kQ1.k(tk18.m(aVar11113));
                    TN1 tn1K111111118 = c4874kQ1.k(tk18.m(aVar11114));
                    TN1 tn1K111111119 = c4874kQ1.k(tk18.m(aVar11115));
                    C0747Cj c0747CjL1119 = c4874kQ1.l();
                    double d19 = radians10;
                    double dSin10 = Math.sin(d19);
                    double d110 = iE10;
                    c0747CjL1119.d.k(tn1K111111117, 0.5f);
                    c0747CjL1119.d.k(tn1K111111119, 0.5f);
                    c0747CjL1119.d.k(tn1K111111113, -0.5f);
                    c0747CjL1119.d.k(tn1K111111115, -0.5f);
                    c0747CjL1119.b = -((float) (dSin10 * d110));
                    c4874kQ1.c(c0747CjL1119);
                    C0747Cj c0747CjL11110 = c4874kQ1.l();
                    float fCos10 = (float) (Math.cos(d19) * d110);
                    c0747CjL11110.d.k(tn1K111111116, 0.5f);
                    c0747CjL11110.d.k(tn1K111111118, 0.5f);
                    c0747CjL11110.d.k(tn1K111111112, -0.5f);
                    c0747CjL11110.d.k(tn1K111111114, -0.5f);
                    c0747CjL11110.b = -fCos10;
                    c4874kQ1.c(c0747CjL11110);
                }
                this.k = false;
                this.l = false;
            }
            z7 = false;
            int[] iArr6 = this.t;
            iArr6[0] = i15;
            iArr6[1] = i16;
            if (z7) {
                int i314 = this.A;
                i17 = -1;
                if (i314 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (this.U[0] == aVar5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                ik2 = this.Q;
                z10 = !ik2.h();
                boolean z1118 = zArr4[0];
                boolean z1119 = zArr4[1];
                if (this.o != 2) {
                    tn3 = tn1K;
                    tn4 = tn1K2;
                    i18 = i15;
                    r20 = r12;
                    aVar4 = aVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                } else {
                    tn3 = tn1K;
                    tn4 = tn1K2;
                    i18 = i15;
                    r20 = r12;
                    aVar4 = aVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                }
                if (z) {
                    tn5 = r33;
                    tn6 = tn1;
                    tn7 = tn2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    tn5 = r33;
                    tn6 = tn1;
                    tn7 = tn2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.p == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    if (this.A == 1) {
                        float f112 = this.B;
                        C0747Cj c0747CjL11111 = c4874kQ1.l();
                        c0747CjL11111.d.k(tn6, -1.0f);
                        c0747CjL11111.d.k(tn5, 1.0f);
                        c0747CjL11111.d.k(tn4, f112);
                        c0747CjL11111.d.k(tn3, -f112);
                        c4874kQ1.c(c0747CjL11111);
                    } else {
                        TN1 tn18 = tn5;
                        float f113 = this.B;
                        C0747Cj c0747CjL11112 = c4874kQ1.l();
                        c0747CjL11112.d.k(tn4, -1.0f);
                        c0747CjL11112.d.k(tn3, 1.0f);
                        c0747CjL11112.d.k(tn6, f113);
                        c0747CjL11112.d.k(tn18, -f113);
                        c4874kQ1.c(c0747CjL11112);
                    }
                }
                if (ik2.h()) {
                    TK tk19 = ik2.f.d;
                    float radians11 = (float) Math.toRadians(this.D + 90.0f);
                    int iE11 = ik2.e();
                    IK.a aVar11116 = IK.a.d;
                    TN1 tn1K1111111110 = c4874kQ1.k(m(aVar11116));
                    IK.a aVar11117 = IK.a.e;
                    TN1 tn1K1111111111 = c4874kQ1.k(m(aVar11117));
                    IK.a aVar11118 = IK.a.g;
                    TN1 tn1K1111111112 = c4874kQ1.k(m(aVar11118));
                    IK.a aVar11119 = IK.a.h;
                    TN1 tn1K1111111113 = c4874kQ1.k(m(aVar11119));
                    TN1 tn1K1111111114 = c4874kQ1.k(tk19.m(aVar11116));
                    TN1 tn1K1111111115 = c4874kQ1.k(tk19.m(aVar11117));
                    TN1 tn1K1111111116 = c4874kQ1.k(tk19.m(aVar11118));
                    TN1 tn1K1111111117 = c4874kQ1.k(tk19.m(aVar11119));
                    C0747Cj c0747CjL11113 = c4874kQ1.l();
                    double d111 = radians11;
                    double dSin11 = Math.sin(d111);
                    double d112 = iE11;
                    c0747CjL11113.d.k(tn1K1111111115, 0.5f);
                    c0747CjL11113.d.k(tn1K1111111117, 0.5f);
                    c0747CjL11113.d.k(tn1K1111111111, -0.5f);
                    c0747CjL11113.d.k(tn1K1111111113, -0.5f);
                    c0747CjL11113.b = -((float) (dSin11 * d112));
                    c4874kQ1.c(c0747CjL11113);
                    C0747Cj c0747CjL11114 = c4874kQ1.l();
                    float fCos11 = (float) (Math.cos(d111) * d112);
                    c0747CjL11114.d.k(tn1K1111111114, 0.5f);
                    c0747CjL11114.d.k(tn1K1111111116, 0.5f);
                    c0747CjL11114.d.k(tn1K1111111110, -0.5f);
                    c0747CjL11114.d.k(tn1K1111111112, -0.5f);
                    c0747CjL11114.b = -fCos11;
                    c4874kQ1.c(c0747CjL11114);
                }
                this.k = false;
                this.l = false;
            }
            i17 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.U[0] == aVar5) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            ik2 = this.Q;
            z10 = !ik2.h();
            boolean z11110 = zArr4[0];
            boolean z11111 = zArr4[1];
            if (this.o != 2) {
                tn3 = tn1K;
                tn4 = tn1K2;
                i18 = i15;
                r20 = r12;
                aVar4 = aVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            } else {
                tn3 = tn1K;
                tn4 = tn1K2;
                i18 = i15;
                r20 = r12;
                aVar4 = aVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            }
            if (z) {
                tn5 = r33;
                tn6 = tn1;
                tn7 = tn2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            } else {
                tn5 = r33;
                tn6 = tn1;
                tn7 = tn2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            }
            if (this.p == 2) {
                i23 = i19;
            } else {
                i23 = i22;
            }
            if (i23 == 0) {
            }
            if (z7) {
                if (this.A == 1) {
                    float f114 = this.B;
                    C0747Cj c0747CjL11115 = c4874kQ1.l();
                    c0747CjL11115.d.k(tn6, -1.0f);
                    c0747CjL11115.d.k(tn5, 1.0f);
                    c0747CjL11115.d.k(tn4, f114);
                    c0747CjL11115.d.k(tn3, -f114);
                    c4874kQ1.c(c0747CjL11115);
                } else {
                    TN1 tn19 = tn5;
                    float f115 = this.B;
                    C0747Cj c0747CjL11116 = c4874kQ1.l();
                    c0747CjL11116.d.k(tn4, -1.0f);
                    c0747CjL11116.d.k(tn3, 1.0f);
                    c0747CjL11116.d.k(tn6, f115);
                    c0747CjL11116.d.k(tn19, -f115);
                    c4874kQ1.c(c0747CjL11116);
                }
            }
            if (ik2.h()) {
                TK tk110 = ik2.f.d;
                float radians12 = (float) Math.toRadians(this.D + 90.0f);
                int iE12 = ik2.e();
                IK.a aVar111110 = IK.a.d;
                TN1 tn1K1111111118 = c4874kQ1.k(m(aVar111110));
                IK.a aVar111111 = IK.a.e;
                TN1 tn1K1111111119 = c4874kQ1.k(m(aVar111111));
                IK.a aVar111112 = IK.a.g;
                TN1 tn1K11111111110 = c4874kQ1.k(m(aVar111112));
                IK.a aVar111113 = IK.a.h;
                TN1 tn1K11111111111 = c4874kQ1.k(m(aVar111113));
                TN1 tn1K11111111112 = c4874kQ1.k(tk110.m(aVar111110));
                TN1 tn1K11111111113 = c4874kQ1.k(tk110.m(aVar111111));
                TN1 tn1K11111111114 = c4874kQ1.k(tk110.m(aVar111112));
                TN1 tn1K11111111115 = c4874kQ1.k(tk110.m(aVar111113));
                C0747Cj c0747CjL11117 = c4874kQ1.l();
                double d113 = radians12;
                double dSin12 = Math.sin(d113);
                double d114 = iE12;
                c0747CjL11117.d.k(tn1K11111111113, 0.5f);
                c0747CjL11117.d.k(tn1K11111111115, 0.5f);
                c0747CjL11117.d.k(tn1K1111111119, -0.5f);
                c0747CjL11117.d.k(tn1K11111111111, -0.5f);
                c0747CjL11117.b = -((float) (dSin12 * d114));
                c4874kQ1.c(c0747CjL11117);
                C0747Cj c0747CjL11118 = c4874kQ1.l();
                float fCos12 = (float) (Math.cos(d113) * d114);
                c0747CjL11118.d.k(tn1K11111111112, 0.5f);
                c0747CjL11118.d.k(tn1K11111111114, 0.5f);
                c0747CjL11118.d.k(tn1K1111111118, -0.5f);
                c0747CjL11118.d.k(tn1K11111111110, -0.5f);
                c0747CjL11118.b = -fCos12;
                c4874kQ1.c(c0747CjL11118);
            }
            this.k = false;
            this.l = false;
        }
        tn1 = tn1K4;
        tn2 = tn1K5;
        i15 = i13;
        i16 = i14;
        z7 = false;
        int[] iArr7 = this.t;
        iArr7[0] = i15;
        iArr7[1] = i16;
        if (z7) {
            int i315 = this.A;
            i17 = -1;
            if (i315 != 0) {
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.U[0] == aVar5) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            ik2 = this.Q;
            z10 = !ik2.h();
            boolean z11112 = zArr4[0];
            boolean z11113 = zArr4[1];
            if (this.o != 2) {
                tn3 = tn1K;
                tn4 = tn1K2;
                i18 = i15;
                r20 = r12;
                aVar4 = aVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            } else {
                tn3 = tn1K;
                tn4 = tn1K2;
                i18 = i15;
                r20 = r12;
                aVar4 = aVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            }
            if (z) {
                tn5 = r33;
                tn6 = tn1;
                tn7 = tn2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            } else {
                tn5 = r33;
                tn6 = tn1;
                tn7 = tn2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            }
            if (this.p == 2) {
                i23 = i19;
            } else {
                i23 = i22;
            }
            if (i23 == 0) {
            }
            if (z7) {
                if (this.A == 1) {
                    float f116 = this.B;
                    C0747Cj c0747CjL11119 = c4874kQ1.l();
                    c0747CjL11119.d.k(tn6, -1.0f);
                    c0747CjL11119.d.k(tn5, 1.0f);
                    c0747CjL11119.d.k(tn4, f116);
                    c0747CjL11119.d.k(tn3, -f116);
                    c4874kQ1.c(c0747CjL11119);
                } else {
                    TN1 tn110 = tn5;
                    float f117 = this.B;
                    C0747Cj c0747CjL111110 = c4874kQ1.l();
                    c0747CjL111110.d.k(tn4, -1.0f);
                    c0747CjL111110.d.k(tn3, 1.0f);
                    c0747CjL111110.d.k(tn6, f117);
                    c0747CjL111110.d.k(tn110, -f117);
                    c4874kQ1.c(c0747CjL111110);
                }
            }
            if (ik2.h()) {
                TK tk111 = ik2.f.d;
                float radians13 = (float) Math.toRadians(this.D + 90.0f);
                int iE13 = ik2.e();
                IK.a aVar111114 = IK.a.d;
                TN1 tn1K11111111116 = c4874kQ1.k(m(aVar111114));
                IK.a aVar111115 = IK.a.e;
                TN1 tn1K11111111117 = c4874kQ1.k(m(aVar111115));
                IK.a aVar111116 = IK.a.g;
                TN1 tn1K11111111118 = c4874kQ1.k(m(aVar111116));
                IK.a aVar111117 = IK.a.h;
                TN1 tn1K11111111119 = c4874kQ1.k(m(aVar111117));
                TN1 tn1K111111111110 = c4874kQ1.k(tk111.m(aVar111114));
                TN1 tn1K111111111111 = c4874kQ1.k(tk111.m(aVar111115));
                TN1 tn1K111111111112 = c4874kQ1.k(tk111.m(aVar111116));
                TN1 tn1K111111111113 = c4874kQ1.k(tk111.m(aVar111117));
                C0747Cj c0747CjL111111 = c4874kQ1.l();
                double d115 = radians13;
                double dSin13 = Math.sin(d115);
                double d116 = iE13;
                c0747CjL111111.d.k(tn1K111111111111, 0.5f);
                c0747CjL111111.d.k(tn1K111111111113, 0.5f);
                c0747CjL111111.d.k(tn1K11111111117, -0.5f);
                c0747CjL111111.d.k(tn1K11111111119, -0.5f);
                c0747CjL111111.b = -((float) (dSin13 * d116));
                c4874kQ1.c(c0747CjL111111);
                C0747Cj c0747CjL111112 = c4874kQ1.l();
                float fCos13 = (float) (Math.cos(d115) * d116);
                c0747CjL111112.d.k(tn1K111111111110, 0.5f);
                c0747CjL111112.d.k(tn1K111111111112, 0.5f);
                c0747CjL111112.d.k(tn1K11111111116, -0.5f);
                c0747CjL111112.d.k(tn1K11111111118, -0.5f);
                c0747CjL111112.b = -fCos13;
                c4874kQ1.c(c0747CjL111112);
            }
            this.k = false;
            this.l = false;
        }
        i17 = -1;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (this.U[0] == aVar5) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (z9) {
            i8 = 0;
        }
        ik2 = this.Q;
        z10 = !ik2.h();
        boolean z11114 = zArr4[0];
        boolean z11115 = zArr4[1];
        if (this.o != 2) {
            tn3 = tn1K;
            tn4 = tn1K2;
            i18 = i15;
            r20 = r12;
            aVar4 = aVar5;
            z11 = z4;
            r3 = i6;
            z12 = z10;
            r110 = r19;
        } else {
            tn3 = tn1K;
            tn4 = tn1K2;
            i18 = i15;
            r20 = r12;
            aVar4 = aVar5;
            z11 = z4;
            r3 = i6;
            z12 = z10;
            r110 = r19;
        }
        if (z) {
            tn5 = r33;
            tn6 = tn1;
            tn7 = tn2;
            i19 = 0;
            i20 = 8;
            i21 = 1;
            i22 = 1;
        } else {
            tn5 = r33;
            tn6 = tn1;
            tn7 = tn2;
            i19 = 0;
            i20 = 8;
            i21 = 1;
            i22 = 1;
        }
        if (this.p == 2) {
            i23 = i19;
        } else {
            i23 = i22;
        }
        if (i23 == 0) {
        }
        if (z7) {
            if (this.A == 1) {
                float f118 = this.B;
                C0747Cj c0747CjL111113 = c4874kQ1.l();
                c0747CjL111113.d.k(tn6, -1.0f);
                c0747CjL111113.d.k(tn5, 1.0f);
                c0747CjL111113.d.k(tn4, f118);
                c0747CjL111113.d.k(tn3, -f118);
                c4874kQ1.c(c0747CjL111113);
            } else {
                TN1 tn111 = tn5;
                float f119 = this.B;
                C0747Cj c0747CjL111114 = c4874kQ1.l();
                c0747CjL111114.d.k(tn4, -1.0f);
                c0747CjL111114.d.k(tn3, 1.0f);
                c0747CjL111114.d.k(tn6, f119);
                c0747CjL111114.d.k(tn111, -f119);
                c4874kQ1.c(c0747CjL111114);
            }
        }
        if (ik2.h()) {
            TK tk112 = ik2.f.d;
            float radians14 = (float) Math.toRadians(this.D + 90.0f);
            int iE14 = ik2.e();
            IK.a aVar111118 = IK.a.d;
            TN1 tn1K111111111114 = c4874kQ1.k(m(aVar111118));
            IK.a aVar111119 = IK.a.e;
            TN1 tn1K111111111115 = c4874kQ1.k(m(aVar111119));
            IK.a aVar1111110 = IK.a.g;
            TN1 tn1K111111111116 = c4874kQ1.k(m(aVar1111110));
            IK.a aVar1111111 = IK.a.h;
            TN1 tn1K111111111117 = c4874kQ1.k(m(aVar1111111));
            TN1 tn1K111111111118 = c4874kQ1.k(tk112.m(aVar111118));
            TN1 tn1K111111111119 = c4874kQ1.k(tk112.m(aVar111119));
            TN1 tn1K1111111111110 = c4874kQ1.k(tk112.m(aVar1111110));
            TN1 tn1K1111111111111 = c4874kQ1.k(tk112.m(aVar1111111));
            C0747Cj c0747CjL111115 = c4874kQ1.l();
            double d117 = radians14;
            double dSin14 = Math.sin(d117);
            double d118 = iE14;
            c0747CjL111115.d.k(tn1K111111111119, 0.5f);
            c0747CjL111115.d.k(tn1K1111111111111, 0.5f);
            c0747CjL111115.d.k(tn1K111111111115, -0.5f);
            c0747CjL111115.d.k(tn1K111111111117, -0.5f);
            c0747CjL111115.b = -((float) (dSin14 * d118));
            c4874kQ1.c(c0747CjL111115);
            C0747Cj c0747CjL111116 = c4874kQ1.l();
            float fCos14 = (float) (Math.cos(d117) * d118);
            c0747CjL111116.d.k(tn1K111111111118, 0.5f);
            c0747CjL111116.d.k(tn1K1111111111110, 0.5f);
            c0747CjL111116.d.k(tn1K111111111114, -0.5f);
            c0747CjL111116.d.k(tn1K111111111116, -0.5f);
            c0747CjL111116.b = -fCos14;
            c4874kQ1.c(c0747CjL111116);
        }
        this.k = false;
        this.l = false;
    }

    public boolean f() {
        return this.i0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:218:0x03be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:223:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:224:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x03df  */
    /* JADX WARN: Code duplicated, block: B:232:0x0401  */
    /* JADX WARN: Code duplicated, block: B:235:0x0414  */
    /* JADX WARN: Code duplicated, block: B:241:0x0422  */
    /* JADX WARN: Code duplicated, block: B:242:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x0433  */
    /* JADX WARN: Code duplicated, block: B:252:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x045a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0460  */
    /* JADX WARN: Code duplicated, block: B:262:0x0462 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x0468 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x0471  */
    /* JADX WARN: Code duplicated, block: B:272:0x0475  */
    /* JADX WARN: Code duplicated, block: B:275:0x047b  */
    /* JADX WARN: Code duplicated, block: B:277:0x047f  */
    /* JADX WARN: Code duplicated, block: B:279:0x0483  */
    /* JADX WARN: Code duplicated, block: B:280:0x0485  */
    /* JADX WARN: Code duplicated, block: B:283:0x048d  */
    /* JADX WARN: Code duplicated, block: B:285:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x049b A[PHI: r3
      0x049b: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:282:0x048b, B:284:0x0491, B:285:0x0493, B:287:0x0497] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:292:0x04ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x04af  */
    /* JADX WARN: Code duplicated, block: B:294:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:296:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:298:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:339:0x0528  */
    public final void g(C4874kQ0 c4874kQ0, boolean z, boolean z2, boolean z3, boolean z4, TN1 tn1, TN1 tn2, a aVar, boolean z5, IK ik, IK ik2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int iMin;
        int i9;
        int i10;
        boolean z12;
        TN1 tn1K;
        TN1 tn1K2;
        IK ik3;
        TN1 tn3;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        boolean z15;
        boolean z16;
        TK tk;
        boolean z17;
        int i13;
        boolean z18;
        int iMin2;
        int i14;
        int i15;
        int iE;
        int i16;
        int i17;
        int i18;
        HashSet<IK> hashSet;
        int i19;
        int i20;
        int i21;
        int i22;
        c4874kQ0 = c4874kQ0;
        int i23 = i7;
        int i24 = i8;
        TN1 tn1K3 = c4874kQ0.k(ik);
        TN1 tn1K4 = c4874kQ0.k(ik2);
        TN1 tn1K5 = c4874kQ0.k(ik.f);
        TN1 tn1K6 = c4874kQ0.k(ik2.f);
        boolean zH = ik.h();
        boolean zH2 = ik2.h();
        boolean zH3 = this.Q.h();
        int i25 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i5;
        int iOrdinal = aVar.ordinal();
        boolean z19 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i27 == 4) ? false : true;
        int i28 = this.h;
        boolean z20 = z19;
        if (i28 != -1 && z) {
            this.h = -1;
            i2 = i28;
            z20 = false;
        }
        int i29 = this.i;
        if (i29 == -1 || z) {
            i29 = i2;
        } else {
            this.i = -1;
            z20 = false;
        }
        int i30 = i29;
        if (this.i0 == 8) {
            iMin = 0;
            z20 = false;
        } else {
            iMin = i30;
        }
        if (z11) {
            if (!zH && !zH2 && !zH3) {
                c4874kQ0.d(tn1K3, i);
            } else if (zH && !zH2) {
                i9 = 8;
                c4874kQ0.e(tn1K3, tn1K5, ik.e(), 8);
            }
            i9 = 8;
        } else {
            i9 = 8;
        }
        if (z20) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    c4874kQ0.f(tn1K4, tn1K3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        c4874kQ0.g(tn1K4, tn1K3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        c4874kQ0.e(tn1K4, tn1K3, iMin, 8);
                    } else if (z8) {
                        c4874kQ0.e(tn1K4, tn1K3, iMin, 5);
                        c4874kQ0.g(tn1K4, tn1K3, iMin, 8);
                    } else {
                        c4874kQ0.e(tn1K4, tn1K3, iMin, 5);
                        c4874kQ0.g(tn1K4, tn1K3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    IK.a aVar2 = IK.a.e;
                    IK.a aVar3 = IK.a.h;
                    IK.a aVar4 = ik.e;
                    if (aVar4 == aVar2 || aVar4 == aVar3) {
                        tn1K = c4874kQ0.k(this.V.m(aVar2));
                        tn1K2 = c4874kQ0.k(this.V.m(aVar3));
                    } else {
                        tn1K = c4874kQ0.k(this.V.m(IK.a.d));
                        tn1K2 = c4874kQ0.k(this.V.m(IK.a.g));
                    }
                    C0747Cj c0747CjL = c4874kQ0.l();
                    int i31 = i23;
                    c0747CjL.d.k(tn1K4, -1.0f);
                    c0747CjL.d.k(tn1K3, 1.0f);
                    c0747CjL.d.k(tn1K2, f2);
                    c0747CjL.d.k(tn1K, -f2);
                    c4874kQ0.c(c0747CjL);
                    if (z2) {
                        z20 = false;
                    }
                    z12 = z4;
                    i10 = i31;
                } else {
                    i10 = i23;
                    z12 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                c4874kQ0.e(tn1K4, tn1K3, iMax, 8);
                z12 = z4;
                i10 = i23;
                z20 = false;
            }
            if (z11 || z8) {
                boolean z21 = z12;
                if (i26 >= 2 && z2 && z21) {
                    c4874kQ0.f(tn1K3, tn1, 0, 8);
                    IK ik4 = this.N;
                    boolean z22 = z || ik4.f == null;
                    if (!z && (ik3 = ik4.f) != null) {
                        TK tk2 = ik3.d;
                        if (tk2.Y != 0.0f) {
                            a[] aVarArr = tk2.U;
                            a aVar5 = aVarArr[0];
                            a aVar6 = a.g;
                            if (aVar5 == aVar6) {
                                z22 = true;
                                if (aVarArr[1] != aVar6) {
                                    z22 = false;
                                }
                            } else {
                                z22 = false;
                            }
                        } else {
                            z22 = false;
                        }
                    }
                    if (z22) {
                        c4874kQ0.f(tn2, tn1K4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    z18 = z2;
                    ik2 = ik2;
                    tn1K4 = tn1K4;
                    z12 = z12;
                    tn3 = tn1K6;
                    i22 = (z2 && (ik.f.d instanceof C6017pq)) ? 8 : 5;
                } else if (zH || !zH2) {
                    tn3 = tn1K6;
                    if (zH && zH2) {
                        TK tk3 = ik.f.d;
                        TK tk4 = ik2.f.d;
                        z12 = z12;
                        TK tk5 = this.V;
                        int i32 = 6;
                        if (z20) {
                            if (i27 == 0) {
                                if (i24 != 0 || i10 != 0) {
                                    z13 = true;
                                    z15 = false;
                                    z14 = true;
                                    i11 = 5;
                                    i12 = 5;
                                } else if (tn1K5.j && tn3.j) {
                                    c4874kQ0.e(tn1K3, tn1K5, ik.e(), 8);
                                    c4874kQ0.e(tn1K4, tn3, -ik2.e(), 8);
                                    return;
                                } else {
                                    z13 = false;
                                    z15 = true;
                                    z14 = false;
                                    i11 = 8;
                                    i12 = 8;
                                }
                                if ((tk3 instanceof C6017pq) || (tk4 instanceof C6017pq)) {
                                    tn1K5 = tn1K5;
                                    i12 = 4;
                                } else {
                                    tn1K5 = tn1K5;
                                }
                                i27 = i27;
                            } else {
                                if (i27 == 2) {
                                    if ((tk3 instanceof C6017pq) || (tk4 instanceof C6017pq)) {
                                        z13 = true;
                                        z14 = true;
                                        i11 = 5;
                                    } else {
                                        c4874kQ0 = c4874kQ0;
                                        i27 = i27;
                                        tn1K3 = tn1K3;
                                        tn1K4 = tn1K4;
                                        tn1K5 = tn1K5;
                                        i32 = 6;
                                        z13 = true;
                                        z14 = true;
                                        i11 = 5;
                                        i12 = 5;
                                    }
                                    z15 = false;
                                } else {
                                    if (i27 == 1) {
                                        z13 = true;
                                        z14 = true;
                                        i11 = 8;
                                    } else if (i27 == 3) {
                                        i27 = i27;
                                        if (this.A == -1) {
                                            if (z9) {
                                                c4874kQ0 = c4874kQ0;
                                                tn2 = tn2;
                                                tn1K3 = tn1K3;
                                                tn1K4 = tn1K4;
                                                tn1K5 = tn1K5;
                                                i32 = z2 ? 5 : 4;
                                            } else {
                                                c4874kQ0 = c4874kQ0;
                                                tn2 = tn2;
                                                tn1K3 = tn1K3;
                                                tn1K4 = tn1K4;
                                                tn1K5 = tn1K5;
                                                i32 = 8;
                                            }
                                            z13 = true;
                                            z14 = true;
                                            i11 = 8;
                                        } else if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i20 = 5;
                                                i21 = 4;
                                            } else {
                                                i20 = 8;
                                                i21 = 5;
                                            }
                                            i11 = i20;
                                            i12 = i21;
                                            tn1K3 = tn1K3;
                                            tn1K4 = tn1K4;
                                            tn1K5 = tn1K5;
                                            i32 = 6;
                                            z13 = true;
                                            z14 = true;
                                            z15 = true;
                                            c4874kQ0 = c4874kQ0;
                                        } else if (i24 > 0) {
                                            c4874kQ0 = c4874kQ0;
                                            tn2 = tn2;
                                            tn1K3 = tn1K3;
                                            tn1K4 = tn1K4;
                                            tn1K5 = tn1K5;
                                            i32 = 6;
                                            z13 = true;
                                            z14 = true;
                                            i11 = 5;
                                        } else {
                                            if (i24 != 0 || i10 != 0) {
                                                c4874kQ0 = c4874kQ0;
                                                tn2 = tn2;
                                                tn1K3 = tn1K3;
                                                tn1K4 = tn1K4;
                                                tn1K5 = tn1K5;
                                                i32 = 6;
                                                z13 = true;
                                                z14 = true;
                                                i11 = 5;
                                                i12 = 4;
                                            } else if (z9) {
                                                tn2 = tn2;
                                                i11 = (tk3 == tk5 || tk4 == tk5) ? 5 : 4;
                                                tn1K3 = tn1K3;
                                                tn1K4 = tn1K4;
                                                tn1K5 = tn1K5;
                                                i32 = 6;
                                                z13 = true;
                                                z14 = true;
                                                i12 = 4;
                                                z15 = true;
                                                c4874kQ0 = c4874kQ0;
                                            } else {
                                                c4874kQ0 = c4874kQ0;
                                                tn2 = tn2;
                                                tn1K3 = tn1K3;
                                                tn1K4 = tn1K4;
                                                tn1K5 = tn1K5;
                                                i32 = 6;
                                                z13 = true;
                                                z14 = true;
                                                i11 = 5;
                                                i12 = 8;
                                            }
                                            z15 = true;
                                        }
                                        i12 = 5;
                                        z15 = true;
                                    } else {
                                        z13 = false;
                                        z14 = false;
                                    }
                                    if (z14 || tn1K5 != tn3 || tk3 == tk5) {
                                        z16 = true;
                                    } else {
                                        z14 = false;
                                        z16 = false;
                                    }
                                    if (z13) {
                                        if (z20 && !z7 && !z9 && tn1K5 == tn1 && tn3 == tn2) {
                                            i19 = 8;
                                            z18 = false;
                                            i13 = 8;
                                            z17 = false;
                                        } else {
                                            i19 = i32;
                                            z17 = z16;
                                            i13 = i11;
                                            z18 = z2;
                                        }
                                        TN1 tn4 = tn1K5;
                                        tk = tk4;
                                        c4874kQ0.b(tn1K3, tn4, ik.e(), f, tn3, tn1K4, ik2.e(), i19);
                                        tn1K5 = tn4;
                                    } else {
                                        tk = tk4;
                                        z17 = z16;
                                        i13 = i11;
                                        z18 = z2;
                                    }
                                    if (this.i0 != 8 && ((hashSet = ik2.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z14) {
                                        if (z18 || tn1K5 == tn3 || z20 || !((tk3 instanceof C6017pq) || (tk instanceof C6017pq))) {
                                            i18 = i13;
                                        } else {
                                            i18 = 6;
                                        }
                                        c4874kQ0.f(tn1K3, tn1K5, ik.e(), i18);
                                        c4874kQ0.g(tn1K4, tn3, -ik2.e(), i18);
                                        i13 = i18;
                                    }
                                    if (z18 || !z10 || (tk3 instanceof C6017pq) || (tk instanceof C6017pq) || tk == tk5) {
                                        iMin2 = i12;
                                        i14 = i13;
                                    } else {
                                        iMin2 = 6;
                                        i14 = 6;
                                        z17 = true;
                                    }
                                    if (z17) {
                                        if (z15 && (!z9 || z3)) {
                                            if (tk3 != tk5 && tk != tk5) {
                                                i32 = iMin2;
                                            }
                                            if ((tk3 instanceof C5589nn0) || (tk instanceof C5589nn0)) {
                                                i32 = 5;
                                            }
                                            if ((tk3 instanceof C6017pq) || (tk instanceof C6017pq)) {
                                                i32 = 5;
                                            }
                                            if (z9) {
                                                i17 = 5;
                                            } else {
                                                i17 = i32;
                                            }
                                            iMin2 = Math.max(i17, iMin2);
                                        }
                                        if (z18) {
                                            iMin2 = Math.min(i14, iMin2);
                                            if (z6 || z9 || !(tk3 == tk5 || tk == tk5)) {
                                                i16 = iMin2;
                                            } else {
                                                i16 = 4;
                                            }
                                        } else {
                                            i16 = iMin2;
                                        }
                                        c4874kQ0.e(tn1K3, tn1K5, ik.e(), i16);
                                        c4874kQ0.e(tn1K4, tn3, -ik2.e(), i16);
                                    }
                                    if (z18) {
                                        if (tn1 == tn1K5) {
                                            iE = ik.e();
                                        } else {
                                            iE = 0;
                                        }
                                        if (tn1K5 != tn1) {
                                            c4874kQ0.f(tn1K3, tn1, iE, 5);
                                        }
                                    }
                                    if (z18 || !z20 || i3 != 0 || i10 != 0) {
                                        i15 = 5;
                                    } else if (z20 && i27 == 3) {
                                        c4874kQ0.f(tn1K4, tn1K3, 0, 8);
                                        i15 = 5;
                                    } else {
                                        i15 = 5;
                                        c4874kQ0.f(tn1K4, tn1K3, 0, 5);
                                    }
                                }
                                i12 = 4;
                                z15 = false;
                            }
                            tn2 = tn2;
                            if (z14) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            if (z13) {
                                if (z20) {
                                    i19 = i32;
                                    z17 = z16;
                                    i13 = i11;
                                    z18 = z2;
                                } else {
                                    i19 = i32;
                                    z17 = z16;
                                    i13 = i11;
                                    z18 = z2;
                                }
                                TN1 tn5 = tn1K5;
                                tk = tk4;
                                c4874kQ0.b(tn1K3, tn5, ik.e(), f, tn3, tn1K4, ik2.e(), i19);
                                tn1K5 = tn5;
                            } else {
                                tk = tk4;
                                z17 = z16;
                                i13 = i11;
                                z18 = z2;
                            }
                            if (this.i0 != 8) {
                            }
                            if (z14) {
                                if (z18) {
                                    i18 = i13;
                                } else {
                                    i18 = i13;
                                }
                                c4874kQ0.f(tn1K3, tn1K5, ik.e(), i18);
                                c4874kQ0.g(tn1K4, tn3, -ik2.e(), i18);
                                i13 = i18;
                            }
                            if (z18) {
                                iMin2 = i12;
                                i14 = i13;
                            } else {
                                iMin2 = i12;
                                i14 = i13;
                            }
                            if (z17) {
                                if (z15) {
                                    if (tk3 != tk5) {
                                        i32 = iMin2;
                                    }
                                    if (tk3 instanceof C5589nn0) {
                                        i32 = 5;
                                    } else {
                                        i32 = 5;
                                    }
                                    if (tk3 instanceof C6017pq) {
                                        i32 = 5;
                                    } else {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i17 = 5;
                                    } else {
                                        i17 = i32;
                                    }
                                    iMin2 = Math.max(i17, iMin2);
                                }
                                if (z18) {
                                    iMin2 = Math.min(i14, iMin2);
                                    if (z6) {
                                        i16 = iMin2;
                                    } else {
                                        i16 = iMin2;
                                    }
                                } else {
                                    i16 = iMin2;
                                }
                                c4874kQ0.e(tn1K3, tn1K5, ik.e(), i16);
                                c4874kQ0.e(tn1K4, tn3, -ik2.e(), i16);
                            }
                            if (z18) {
                                if (tn1 == tn1K5) {
                                    iE = ik.e();
                                } else {
                                    iE = 0;
                                }
                                if (tn1K5 != tn1) {
                                    c4874kQ0.f(tn1K3, tn1, iE, 5);
                                }
                            }
                            if (z18) {
                                i15 = 5;
                            } else {
                                i15 = 5;
                            }
                        } else {
                            if (tn1K5.j && tn3.j) {
                                c4874kQ0.b(tn1K3, tn1K5, ik.e(), f, tn3, tn1K4, ik2.e(), 8);
                                if (z2 && z12) {
                                    int iE2 = ik2.f != null ? ik2.e() : 0;
                                    if (tn3 != tn2) {
                                        c4874kQ0.f(tn2, tn1K4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            z13 = true;
                            z14 = true;
                        }
                        i11 = 5;
                        i12 = 4;
                        z15 = false;
                        if (z14) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (z13) {
                            if (z20) {
                                i19 = i32;
                                z17 = z16;
                                i13 = i11;
                                z18 = z2;
                            } else {
                                i19 = i32;
                                z17 = z16;
                                i13 = i11;
                                z18 = z2;
                            }
                            TN1 tn6 = tn1K5;
                            tk = tk4;
                            c4874kQ0.b(tn1K3, tn6, ik.e(), f, tn3, tn1K4, ik2.e(), i19);
                            tn1K5 = tn6;
                        } else {
                            tk = tk4;
                            z17 = z16;
                            i13 = i11;
                            z18 = z2;
                        }
                        if (this.i0 != 8) {
                        }
                        if (z14) {
                            if (z18) {
                                i18 = i13;
                            } else {
                                i18 = i13;
                            }
                            c4874kQ0.f(tn1K3, tn1K5, ik.e(), i18);
                            c4874kQ0.g(tn1K4, tn3, -ik2.e(), i18);
                            i13 = i18;
                        }
                        if (z18) {
                            iMin2 = i12;
                            i14 = i13;
                        } else {
                            iMin2 = i12;
                            i14 = i13;
                        }
                        if (z17) {
                            if (z15) {
                                if (tk3 != tk5) {
                                    i32 = iMin2;
                                }
                                if (tk3 instanceof C5589nn0) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (tk3 instanceof C6017pq) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i17 = 5;
                                } else {
                                    i17 = i32;
                                }
                                iMin2 = Math.max(i17, iMin2);
                            }
                            if (z18) {
                                iMin2 = Math.min(i14, iMin2);
                                if (z6) {
                                    i16 = iMin2;
                                } else {
                                    i16 = iMin2;
                                }
                            } else {
                                i16 = iMin2;
                            }
                            c4874kQ0.e(tn1K3, tn1K5, ik.e(), i16);
                            c4874kQ0.e(tn1K4, tn3, -ik2.e(), i16);
                        }
                        if (z18) {
                            if (tn1 == tn1K5) {
                                iE = ik.e();
                            } else {
                                iE = 0;
                            }
                            if (tn1K5 != tn1) {
                                c4874kQ0.f(tn1K3, tn1, iE, 5);
                            }
                        }
                        if (z18) {
                            i15 = 5;
                        } else {
                            i15 = 5;
                        }
                    }
                    i22 = i15;
                } else {
                    tn3 = tn1K6;
                    c4874kQ0.e(tn1K4, tn3, -ik2.e(), 8);
                    if (z2) {
                        c4874kQ0.f(tn1K3, tn1, 0, 5);
                        ik2 = ik2;
                        i15 = 5;
                        tn1K4 = tn1K4;
                        z12 = z12;
                    }
                    z18 = z2;
                    i22 = i15;
                }
                if (z18 || !z12) {
                    return;
                }
                int iE3 = ik2.f != null ? ik2.e() : 0;
                if (tn3 != tn2) {
                    c4874kQ0.f(tn2, tn1K4, iE3, i22);
                    return;
                }
                return;
            }
            tn3 = tn1K6;
            i15 = 5;
            z18 = z2;
            i22 = i15;
            if (z18) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            c4874kQ0.e(tn1K4, tn1K3, 0, 3);
            if (i3 > 0) {
                c4874kQ0.f(tn1K4, tn1K3, i3, i9);
            }
            if (i4 < Integer.MAX_VALUE) {
                c4874kQ0.g(tn1K4, tn1K3, i4, i9);
            }
        } else {
            c4874kQ0.e(tn1K4, tn1K3, iMin, i9);
        }
        z12 = z4;
        i10 = i23;
        if (z11) {
        }
        boolean z23 = z12;
        if (i26 >= 2) {
        }
    }

    public final void h(IK.a aVar, TK tk, IK.a aVar2, int i) {
        boolean z;
        IK.a aVar3 = IK.a.j;
        IK.a aVar4 = IK.a.l;
        IK.a aVar5 = IK.a.k;
        IK.a aVar6 = IK.a.d;
        IK.a aVar7 = IK.a.e;
        IK.a aVar8 = IK.a.g;
        IK.a aVar9 = IK.a.h;
        if (aVar == aVar3) {
            if (aVar2 != aVar3) {
                if (aVar2 == aVar6 || aVar2 == aVar8) {
                    h(aVar6, tk, aVar2, 0);
                    h(aVar8, tk, aVar2, 0);
                    m(aVar3).a(tk.m(aVar2), 0);
                    return;
                } else {
                    if (aVar2 == aVar7 || aVar2 == aVar9) {
                        h(aVar7, tk, aVar2, 0);
                        h(aVar9, tk, aVar2, 0);
                        m(aVar3).a(tk.m(aVar2), 0);
                        return;
                    }
                    return;
                }
            }
            IK ikM = m(aVar6);
            IK ikM2 = m(aVar8);
            IK ikM3 = m(aVar7);
            IK ikM4 = m(aVar9);
            boolean z2 = true;
            if ((ikM == null || !ikM.h()) && (ikM2 == null || !ikM2.h())) {
                h(aVar6, tk, aVar6, 0);
                h(aVar8, tk, aVar8, 0);
                z = true;
            } else {
                z = false;
            }
            if ((ikM3 == null || !ikM3.h()) && (ikM4 == null || !ikM4.h())) {
                h(aVar7, tk, aVar7, 0);
                h(aVar9, tk, aVar9, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                m(aVar3).a(tk.m(aVar3), 0);
                return;
            } else if (z) {
                m(aVar5).a(tk.m(aVar5), 0);
                return;
            } else {
                if (z2) {
                    m(aVar4).a(tk.m(aVar4), 0);
                    return;
                }
                return;
            }
        }
        if (aVar == aVar5 && (aVar2 == aVar6 || aVar2 == aVar8)) {
            IK ikM5 = m(aVar6);
            IK ikM6 = tk.m(aVar2);
            IK ikM7 = m(aVar8);
            ikM5.a(ikM6, 0);
            ikM7.a(ikM6, 0);
            m(aVar5).a(ikM6, 0);
            return;
        }
        if (aVar == aVar4 && (aVar2 == aVar7 || aVar2 == aVar9)) {
            IK ikM8 = tk.m(aVar2);
            m(aVar7).a(ikM8, 0);
            m(aVar9).a(ikM8, 0);
            m(aVar4).a(ikM8, 0);
            return;
        }
        if (aVar == aVar5 && aVar2 == aVar5) {
            m(aVar6).a(tk.m(aVar6), 0);
            m(aVar8).a(tk.m(aVar8), 0);
            m(aVar5).a(tk.m(aVar2), 0);
            return;
        }
        if (aVar == aVar4 && aVar2 == aVar4) {
            m(aVar7).a(tk.m(aVar7), 0);
            m(aVar9).a(tk.m(aVar9), 0);
            m(aVar4).a(tk.m(aVar2), 0);
            return;
        }
        IK ikM9 = m(aVar);
        IK ikM10 = tk.m(aVar2);
        if (ikM9.i(ikM10)) {
            IK.a aVar10 = IK.a.i;
            if (aVar == aVar10) {
                IK ikM11 = m(aVar7);
                IK ikM12 = m(aVar9);
                if (ikM11 != null) {
                    ikM11.j();
                }
                if (ikM12 != null) {
                    ikM12.j();
                }
            } else if (aVar == aVar7 || aVar == aVar9) {
                IK ikM13 = m(aVar10);
                if (ikM13 != null) {
                    ikM13.j();
                }
                IK ikM14 = m(aVar3);
                if (ikM14.f != ikM10) {
                    ikM14.j();
                }
                IK ikF = m(aVar).f();
                IK ikM15 = m(aVar4);
                if (ikM15.h()) {
                    ikF.j();
                    ikM15.j();
                }
            } else if (aVar == aVar6 || aVar == aVar8) {
                IK ikM16 = m(aVar3);
                if (ikM16.f != ikM10) {
                    ikM16.j();
                }
                IK ikF2 = m(aVar).f();
                IK ikM17 = m(aVar5);
                if (ikM17.h()) {
                    ikF2.j();
                    ikM17.j();
                }
            }
            ikM9.a(ikM10, i);
        }
    }

    public final void i(IK ik, IK ik2, int i) {
        if (ik.d == this) {
            h(ik.e, ik2.d, ik2.e, i);
        }
    }

    public void j(TK tk, HashMap<TK, TK> map) {
        this.o = tk.o;
        this.p = tk.p;
        this.r = tk.r;
        this.s = tk.s;
        int[] iArr = tk.t;
        int i = iArr[0];
        int[] iArr2 = this.t;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.u = tk.u;
        this.v = tk.v;
        this.x = tk.x;
        this.y = tk.y;
        this.z = tk.z;
        this.A = tk.A;
        this.B = tk.B;
        int[] iArr3 = tk.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = tk.D;
        this.E = tk.E;
        this.F = tk.F;
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.U = (a[]) Arrays.copyOf(this.U, 2);
        this.V = this.V == null ? null : map.get(tk.V);
        this.W = tk.W;
        this.X = tk.X;
        this.Y = tk.Y;
        this.Z = tk.Z;
        this.a0 = tk.a0;
        this.b0 = tk.b0;
        this.c0 = tk.c0;
        this.d0 = tk.d0;
        this.e0 = tk.e0;
        this.f0 = tk.f0;
        this.g0 = tk.g0;
        this.h0 = tk.h0;
        this.i0 = tk.i0;
        this.j0 = tk.j0;
        this.k0 = tk.k0;
        this.l0 = tk.l0;
        this.m0 = tk.m0;
        float[] fArr = tk.n0;
        float f = fArr[0];
        float[] fArr2 = this.n0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        TK[] tkArr = tk.o0;
        TK tk2 = tkArr[0];
        TK[] tkArr2 = this.o0;
        tkArr2[0] = tk2;
        tkArr2[1] = tkArr[1];
        TK[] tkArr3 = tk.p0;
        TK tk3 = tkArr3[0];
        TK[] tkArr4 = this.p0;
        tkArr4[0] = tk3;
        tkArr4[1] = tkArr3[1];
        TK tk4 = tk.q0;
        this.q0 = tk4 == null ? null : map.get(tk4);
        TK tk5 = tk.r0;
        this.r0 = tk5 != null ? map.get(tk5) : null;
    }

    public final void k(C4874kQ0 c4874kQ0) {
        c4874kQ0.k(this.J);
        c4874kQ0.k(this.K);
        c4874kQ0.k(this.L);
        c4874kQ0.k(this.M);
        if (this.c0 > 0) {
            c4874kQ0.k(this.N);
        }
    }

    public final void l() {
        if (this.d == null) {
            C3654ep0 c3654ep0 = new C3654ep0(this);
            c3654ep0.h.e = DX.a.h;
            c3654ep0.i.e = DX.a.i;
            c3654ep0.f = 0;
            this.d = c3654ep0;
        }
        if (this.e == null) {
            C6600sd2 c6600sd2 = new C6600sd2(this);
            DX dx = new DX(c6600sd2);
            c6600sd2.k = dx;
            c6600sd2.l = null;
            c6600sd2.h.e = DX.a.j;
            c6600sd2.i.e = DX.a.k;
            dx.e = DX.a.l;
            c6600sd2.f = 1;
            this.e = c6600sd2;
        }
    }

    public IK m(IK.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final a n(int i) {
        if (i == 0) {
            return this.U[0];
        }
        if (i == 1) {
            return this.U[1];
        }
        return null;
    }

    public final int o() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final TK p(int i) {
        IK ik;
        IK ik2;
        if (i != 0) {
            if (i == 1 && (ik2 = (ik = this.M).f) != null && ik2.f == ik) {
                return ik2.d;
            }
            return null;
        }
        IK ik3 = this.L;
        IK ik4 = ik3.f;
        if (ik4 == null || ik4.f != ik3) {
            return null;
        }
        return ik4.d;
    }

    public final TK q(int i) {
        IK ik;
        IK ik2;
        if (i != 0) {
            if (i == 1 && (ik2 = (ik = this.K).f) != null && ik2.f == ik) {
                return ik2.d;
            }
            return null;
        }
        IK ik3 = this.J;
        IK ik4 = ik3.f;
        if (ik4 == null || ik4.f != ik3) {
            return null;
        }
        return ik4.d;
    }

    public void r(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.b0);
        sb.append("\n");
        t(sb, "left", this.J);
        t(sb, "top", this.K);
        t(sb, "right", this.L);
        t(sb, "bottom", this.M);
        t(sb, "baseline", this.N);
        t(sb, "centerX", this.O);
        t(sb, "centerY", this.P);
        int i = this.W;
        int i2 = this.d0;
        int i3 = this.C[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        float[] fArr = this.n0;
        float f2 = fArr[0];
        s(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.X;
        int i7 = this.e0;
        int i8 = this.C[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        float f4 = fArr[1];
        s(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.Y;
        int i11 = this.Z;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        L(sb, "    horizontalBias", this.f0, 0.5f);
        L(sb, "    verticalBias", this.g0, 0.5f);
        K(this.l0, 0, "    horizontalChainStyle", sb);
        K(this.m0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public String toString() {
        StringBuilder sbF = C1039Gc0.f("");
        sbF.append(this.k0 != null ? C5807oq.b(new StringBuilder("id: "), this.k0, " ") : "");
        sbF.append("(");
        sbF.append(this.a0);
        sbF.append(", ");
        sbF.append(this.b0);
        sbF.append(") - (");
        sbF.append(this.W);
        sbF.append(" x ");
        return SK.b(sbF, this.X, ")");
    }

    public final int u() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int v() {
        TK tk = this.V;
        return (tk == null || !(tk instanceof UK)) ? this.a0 : ((UK) tk).B0 + this.a0;
    }

    public final int w() {
        TK tk = this.V;
        return (tk == null || !(tk instanceof UK)) ? this.b0 : ((UK) tk).C0 + this.b0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean x(int i) {
        if (i == 0) {
            if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean y(int i, int i2) {
        IK ik;
        IK ik2;
        IK ik3;
        IK ik4;
        if (i == 0) {
            IK ik5 = this.J;
            IK ik6 = ik5.f;
            if (ik6 == null || !ik6.c || (ik4 = (ik3 = this.L).f) == null || !ik4.c) {
                return false;
            }
            return (ik4.d() - ik3.e()) - (ik5.e() + ik5.f.d()) >= i2;
        }
        IK ik7 = this.K;
        IK ik8 = ik7.f;
        if (ik8 == null || !ik8.c || (ik2 = (ik = this.M).f) == null || !ik2.c) {
            return false;
        }
        return (ik2.d() - ik.e()) - (ik7.e() + ik7.f.d()) >= i2;
    }

    public final void z(IK.a aVar, TK tk, IK.a aVar2, int i, int i2) {
        m(aVar).b(tk.m(aVar2), i, i2, true);
    }
}

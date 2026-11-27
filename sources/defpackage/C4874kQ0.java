package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C7245vh1.b;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: kQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4874kQ0 {
    public static boolean p = false;
    public static int q = 1000;
    public final C7245vh1 c;
    public C0747Cj[] f;
    public final C3887fx l;
    public C0747Cj o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public TN1[] m = new TN1[q];
    public int n = 0;

    /* JADX INFO: renamed from: kQ0$a */
    public interface a {
        TN1 a(boolean[] zArr);
    }

    public C4874kQ0() {
        this.f = null;
        this.f = new C0747Cj[32];
        s();
        C3887fx c3887fx = new C3887fx();
        c3887fx.a = new C1439Lf1();
        c3887fx.b = new C1439Lf1();
        c3887fx.c = new TN1[32];
        this.l = c3887fx;
        C7245vh1 c7245vh1 = new C7245vh1(c3887fx);
        c7245vh1.f = new TN1[UserVerificationMethods.USER_VERIFY_PATTERN];
        c7245vh1.g = new TN1[UserVerificationMethods.USER_VERIFY_PATTERN];
        c7245vh1.h = 0;
        c7245vh1.i = c7245vh1.new b();
        this.c = c7245vh1;
        this.o = new C0747Cj(c3887fx);
    }

    public static int n(Object obj) {
        TN1 tn1 = ((IK) obj).i;
        if (tn1 != null) {
            return (int) (tn1.i + 0.5f);
        }
        return 0;
    }

    public final TN1 a(TN1.a aVar) {
        C1439Lf1 c1439Lf1 = this.l.b;
        int i = c1439Lf1.b;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c1439Lf1.a;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            c1439Lf1.b = i2;
            obj = obj2;
        }
        TN1 tn1 = (TN1) obj;
        if (tn1 == null) {
            tn1 = new TN1(aVar);
            tn1.m = aVar;
        } else {
            tn1.f();
            tn1.m = aVar;
        }
        int i3 = this.n;
        int i4 = q;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            q = i5;
            this.m = (TN1[]) Arrays.copyOf(this.m, i5);
        }
        TN1[] tn1Arr = this.m;
        int i6 = this.n;
        this.n = i6 + 1;
        tn1Arr[i6] = tn1;
        return tn1;
    }

    public final void b(TN1 tn1, TN1 tn2, int i, float f, TN1 tn3, TN1 tn4, int i2, int i3) {
        C0747Cj c0747CjL = l();
        if (tn2 == tn3) {
            c0747CjL.d.k(tn1, 1.0f);
            c0747CjL.d.k(tn4, 1.0f);
            c0747CjL.d.k(tn2, -2.0f);
        } else if (f == 0.5f) {
            c0747CjL.d.k(tn1, 1.0f);
            c0747CjL.d.k(tn2, -1.0f);
            c0747CjL.d.k(tn3, -1.0f);
            c0747CjL.d.k(tn4, 1.0f);
            if (i > 0 || i2 > 0) {
                c0747CjL.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c0747CjL.d.k(tn1, -1.0f);
            c0747CjL.d.k(tn2, 1.0f);
            c0747CjL.b = i;
        } else if (f >= 1.0f) {
            c0747CjL.d.k(tn4, -1.0f);
            c0747CjL.d.k(tn3, 1.0f);
            c0747CjL.b = -i2;
        } else {
            float f2 = 1.0f - f;
            c0747CjL.d.k(tn1, f2 * 1.0f);
            c0747CjL.d.k(tn2, f2 * (-1.0f));
            c0747CjL.d.k(tn3, (-1.0f) * f);
            c0747CjL.d.k(tn4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c0747CjL.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c0747CjL.b(this, i3);
        }
        c(c0747CjL);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x019a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    public final void c(C0747Cj c0747Cj) {
        boolean z;
        TN1.a aVar;
        boolean z2;
        TN1 tn1F;
        ArrayList<TN1> arrayList;
        boolean z3 = true;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (c0747Cj.e) {
            z = false;
        } else {
            if (this.f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iC = c0747Cj.d.c();
                    int i = 0;
                    while (true) {
                        arrayList = c0747Cj.c;
                        if (i >= iC) {
                            break;
                        }
                        TN1 tn1D = c0747Cj.d.d(i);
                        if (tn1D.g != -1 || tn1D.j) {
                            arrayList.add(tn1D);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            TN1 tn1 = arrayList.get(i2);
                            if (tn1.j) {
                                c0747Cj.h(this, tn1, true);
                            } else {
                                c0747Cj.i(this, this.f[tn1.g], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0747Cj.a != null && c0747Cj.d.c() == 0) {
                    c0747Cj.e = true;
                    this.a = true;
                }
            }
            if (c0747Cj.e()) {
                return;
            }
            float f = c0747Cj.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c0747Cj.b = f * (-1.0f);
                c0747Cj.d.f();
            }
            int iC2 = c0747Cj.d.c();
            float f3 = 0.0f;
            float f4 = 0.0f;
            TN1 tn2 = null;
            TN1 tn3 = null;
            int i3 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (true) {
                aVar = TN1.a.d;
                if (i3 >= iC2) {
                    break;
                }
                float fG = c0747Cj.d.g(i3);
                float f5 = f2;
                TN1 tn1D2 = c0747Cj.d.d(i3);
                if (tn1D2.m == aVar) {
                    if (tn2 == null) {
                        if (tn1D2.p <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        f3 = fG;
                        tn2 = tn1D2;
                    } else {
                        if (f3 > fG) {
                            if (tn1D2.p > 1) {
                                z5 = false;
                            }
                            f3 = fG;
                            tn2 = tn1D2;
                        } else if (z5 || tn1D2.p > 1) {
                        }
                        z5 = true;
                        f3 = fG;
                        tn2 = tn1D2;
                    }
                } else if (tn2 == null && fG < f5) {
                    if (tn3 == null) {
                        if (tn1D2.p <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        f4 = fG;
                        tn3 = tn1D2;
                    } else {
                        if (f4 > fG) {
                            if (tn1D2.p > 1) {
                                z6 = false;
                            }
                            f4 = fG;
                            tn3 = tn1D2;
                        } else if (z6 || tn1D2.p > 1) {
                        }
                        z6 = true;
                        f4 = fG;
                        tn3 = tn1D2;
                    }
                }
                i3++;
                f2 = f5;
            }
            float f6 = f2;
            if (tn2 == null) {
                tn2 = tn3;
            }
            if (tn2 == null) {
                z2 = true;
            } else {
                c0747Cj.g(tn2);
                z2 = false;
            }
            if (c0747Cj.d.c() == 0) {
                c0747Cj.e = true;
            }
            if (z2) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                TN1 tn1A = a(TN1.a.e);
                int i4 = this.b + 1;
                this.b = i4;
                this.i++;
                tn1A.e = i4;
                C3887fx c3887fx = this.l;
                c3887fx.c[i4] = tn1A;
                c0747Cj.a = tn1A;
                int i5 = this.j;
                h(c0747Cj);
                if (this.j == i5 + 1) {
                    C0747Cj c0747Cj2 = this.o;
                    c0747Cj2.getClass();
                    c0747Cj2.a = null;
                    c0747Cj2.d.clear();
                    for (int i6 = 0; i6 < c0747Cj.d.c(); i6++) {
                        c0747Cj2.d.e(c0747Cj.d.d(i6), c0747Cj.d.g(i6), true);
                    }
                    r(this.o);
                    if (tn1A.g == -1) {
                        if (c0747Cj.a == tn1A && (tn1F = c0747Cj.f(null, tn1A)) != null) {
                            c0747Cj.g(tn1F);
                        }
                        if (!c0747Cj.e) {
                            c0747Cj.a.k(this, c0747Cj);
                        }
                        c3887fx.a.a(c0747Cj);
                        this.j--;
                    }
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            TN1 tn4 = c0747Cj.a;
            if (tn4 == null) {
                return;
            }
            if (tn4.m != aVar && c0747Cj.b < f6) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        h(c0747Cj);
    }

    public final void d(TN1 tn1, int i) {
        int i2 = tn1.g;
        if (i2 == -1) {
            tn1.i(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                TN1 tn2 = this.l.c[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0747Cj c0747CjL = l();
            c0747CjL.a = tn1;
            float f = i;
            tn1.i = f;
            c0747CjL.b = f;
            c0747CjL.e = true;
            c(c0747CjL);
            return;
        }
        C0747Cj c0747Cj = this.f[i2];
        if (c0747Cj.e) {
            c0747Cj.b = i;
            return;
        }
        if (c0747Cj.d.c() == 0) {
            c0747Cj.e = true;
            c0747Cj.b = i;
            return;
        }
        C0747Cj c0747CjL2 = l();
        if (i < 0) {
            c0747CjL2.b = i * (-1);
            c0747CjL2.d.k(tn1, 1.0f);
        } else {
            c0747CjL2.b = i;
            c0747CjL2.d.k(tn1, -1.0f);
        }
        c(c0747CjL2);
    }

    public final void e(TN1 tn1, TN1 tn2, int i, int i2) {
        if (i2 == 8 && tn2.j && tn1.g == -1) {
            tn1.i(this, tn2.i + i);
            return;
        }
        C0747Cj c0747CjL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0747CjL.b = i;
        }
        if (z) {
            c0747CjL.d.k(tn1, 1.0f);
            c0747CjL.d.k(tn2, -1.0f);
        } else {
            c0747CjL.d.k(tn1, -1.0f);
            c0747CjL.d.k(tn2, 1.0f);
        }
        if (i2 != 8) {
            c0747CjL.b(this, i2);
        }
        c(c0747CjL);
    }

    public final void f(TN1 tn1, TN1 tn2, int i, int i2) {
        C0747Cj c0747CjL = l();
        TN1 tn1M = m();
        tn1M.h = 0;
        c0747CjL.c(tn1, tn2, tn1M, i);
        if (i2 != 8) {
            c0747CjL.d.k(j(i2), (int) (c0747CjL.d.a(tn1M) * (-1.0f)));
        }
        c(c0747CjL);
    }

    public final void g(TN1 tn1, TN1 tn2, int i, int i2) {
        C0747Cj c0747CjL = l();
        TN1 tn1M = m();
        tn1M.h = 0;
        c0747CjL.d(tn1, tn2, tn1M, i);
        if (i2 != 8) {
            c0747CjL.d.k(j(i2), (int) (c0747CjL.d.a(tn1M) * (-1.0f)));
        }
        c(c0747CjL);
    }

    public final void h(C0747Cj c0747Cj) {
        int i;
        if (c0747Cj.e) {
            c0747Cj.a.i(this, c0747Cj.b);
        } else {
            C0747Cj[] c0747CjArr = this.f;
            int i2 = this.j;
            c0747CjArr[i2] = c0747Cj;
            TN1 tn1 = c0747Cj.a;
            tn1.g = i2;
            this.j = i2 + 1;
            tn1.k(this, c0747Cj);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                C0747Cj c0747Cj2 = this.f[i3];
                if (c0747Cj2 != null && c0747Cj2.e) {
                    c0747Cj2.a.i(this, c0747Cj2.b);
                    this.l.a.a(c0747Cj2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        C0747Cj[] c0747CjArr2 = this.f;
                        int i6 = i4 - 1;
                        C0747Cj c0747Cj3 = c0747CjArr2[i4];
                        c0747CjArr2[i6] = c0747Cj3;
                        TN1 tn2 = c0747Cj3.a;
                        if (tn2.g == i4) {
                            tn2.g = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            C0747Cj c0747Cj = this.f[i];
            c0747Cj.a.i = c0747Cj.b;
        }
    }

    public final TN1 j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        TN1 tn1A = a(TN1.a.g);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        tn1A.e = i2;
        tn1A.h = i;
        this.l.c[i2] = tn1A;
        C7245vh1 c7245vh1 = this.c;
        c7245vh1.i.a = tn1A;
        float[] fArr = tn1A.l;
        Arrays.fill(fArr, 0.0f);
        fArr[tn1A.h] = 1.0f;
        c7245vh1.j(tn1A);
        return tn1A;
    }

    public final TN1 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof IK)) {
            return null;
        }
        IK ik = (IK) obj;
        TN1 tn1 = ik.i;
        if (tn1 == null) {
            ik.k();
            tn1 = ik.i;
        }
        int i = tn1.e;
        C3887fx c3887fx = this.l;
        if (i != -1 && i <= this.b && c3887fx.c[i] != null) {
            return tn1;
        }
        if (i != -1) {
            tn1.f();
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        tn1.e = i2;
        tn1.m = TN1.a.d;
        c3887fx.c[i2] = tn1;
        return tn1;
    }

    public final C0747Cj l() {
        Object obj;
        C3887fx c3887fx = this.l;
        C1439Lf1 c1439Lf1 = c3887fx.a;
        int i = c1439Lf1.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c1439Lf1.a;
            obj = objArr[i2];
            objArr[i2] = null;
            c1439Lf1.b = i2;
        } else {
            obj = null;
        }
        C0747Cj c0747Cj = (C0747Cj) obj;
        if (c0747Cj == null) {
            return new C0747Cj(c3887fx);
        }
        c0747Cj.a = null;
        c0747Cj.d.clear();
        c0747Cj.b = 0.0f;
        c0747Cj.e = false;
        return c0747Cj;
    }

    public final TN1 m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        TN1 tn1A = a(TN1.a.e);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        tn1A.e = i;
        this.l.c[i] = tn1A;
        return tn1A;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (C0747Cj[]) Arrays.copyOf(this.f, i);
        C3887fx c3887fx = this.l;
        c3887fx.c = (TN1[]) Arrays.copyOf(c3887fx.c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        C7245vh1 c7245vh1 = this.c;
        if (c7245vh1.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(c7245vh1);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(c7245vh1);
                return;
            }
        }
        i();
    }

    public final void q(C7245vh1 c7245vh1) {
        for (int i = 0; i < this.j; i++) {
            C0747Cj c0747Cj = this.f[i];
            TN1.a aVar = c0747Cj.a.m;
            TN1.a aVar2 = TN1.a.d;
            if (aVar != aVar2) {
                float f = 0.0f;
                if (c0747Cj.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.j) {
                            C0747Cj c0747Cj2 = this.f[i3];
                            if (c0747Cj2.a.m != aVar2 && !c0747Cj2.e && c0747Cj2.b < f) {
                                int iC = c0747Cj2.d.c();
                                int i7 = 0;
                                while (i7 < iC) {
                                    TN1 tn1D = c0747Cj2.d.d(i7);
                                    float f3 = f;
                                    float fA = c0747Cj2.d.a(tn1D);
                                    if (fA > f3) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f4 = tn1D.k[i8] / fA;
                                            if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = tn1D.e;
                                                i4 = i3;
                                                f2 = f4;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = f3;
                                }
                            }
                            i3++;
                            f = f;
                        }
                        float f5 = f;
                        if (i4 != -1) {
                            C0747Cj c0747Cj3 = this.f[i4];
                            c0747Cj3.a.g = -1;
                            c0747Cj3.g(this.l.c[i5]);
                            TN1 tn1 = c0747Cj3.a;
                            tn1.g = i4;
                            tn1.k(this, c0747Cj3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.i / 2) {
                            z = true;
                        }
                        f = f5;
                    }
                    break;
                }
            }
        }
        r(c7245vh1);
        i();
    }

    public final void r(C0747Cj c0747Cj) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            TN1 tn1 = c0747Cj.a;
            if (tn1 != null) {
                this.h[tn1.e] = true;
            }
            TN1 tn1A = c0747Cj.a(this.h);
            if (tn1A != null) {
                boolean[] zArr = this.h;
                int i3 = tn1A.e;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (tn1A != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    C0747Cj c0747Cj2 = this.f[i5];
                    if (c0747Cj2.a.m != TN1.a.d && !c0747Cj2.e && c0747Cj2.d.b(tn1A)) {
                        float fA = c0747Cj2.d.a(tn1A);
                        if (fA < 0.0f) {
                            float f2 = (-c0747Cj2.b) / fA;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0747Cj c0747Cj3 = this.f[i4];
                    c0747Cj3.a.g = -1;
                    c0747Cj3.g(tn1A);
                    TN1 tn2 = c0747Cj3.a;
                    tn2.g = i4;
                    tn2.k(this, c0747Cj3);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            C0747Cj c0747Cj = this.f[i];
            if (c0747Cj != null) {
                this.l.a.a(c0747Cj);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        C3887fx c3887fx;
        int i = 0;
        while (true) {
            c3887fx = this.l;
            TN1[] tn1Arr = c3887fx.c;
            if (i >= tn1Arr.length) {
                break;
            }
            TN1 tn1 = tn1Arr[i];
            if (tn1 != null) {
                tn1.f();
            }
            i++;
        }
        C1439Lf1 c1439Lf1 = c3887fx.b;
        TN1[] tn1Arr2 = this.m;
        int length = this.n;
        c1439Lf1.getClass();
        if (length > tn1Arr2.length) {
            length = tn1Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            TN1 tn2 = tn1Arr2[i2];
            int i3 = c1439Lf1.b;
            Object[] objArr = c1439Lf1.a;
            if (i3 < objArr.length) {
                objArr[i3] = tn2;
                c1439Lf1.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill(c3887fx.c, (Object) null);
        this.b = 0;
        C7245vh1 c7245vh1 = this.c;
        c7245vh1.h = 0;
        c7245vh1.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            C0747Cj c0747Cj = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new C0747Cj(c3887fx);
    }
}

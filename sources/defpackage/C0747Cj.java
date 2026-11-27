package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: Cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0747Cj implements C4874kQ0.a {
    public final a d;
    public TN1 a = null;
    public float b = 0.0f;
    public final ArrayList<TN1> c = new ArrayList<>();
    public boolean e = false;

    /* JADX INFO: renamed from: Cj$a */
    public interface a {
        float a(TN1 tn1);

        boolean b(TN1 tn1);

        int c();

        void clear();

        TN1 d(int i);

        void e(TN1 tn1, float f, boolean z);

        void f();

        float g(int i);

        float h(TN1 tn1, boolean z);

        float i(C0747Cj c0747Cj, boolean z);

        void j(float f);

        void k(TN1 tn1, float f);
    }

    public C0747Cj() {
    }

    @Override // defpackage.C4874kQ0.a
    public TN1 a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(C4874kQ0 c4874kQ0, int i) {
        this.d.k(c4874kQ0.j(i), 1.0f);
        this.d.k(c4874kQ0.j(i), -1.0f);
    }

    public final void c(TN1 tn1, TN1 tn2, TN1 tn3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.k(tn1, 1.0f);
            this.d.k(tn2, -1.0f);
            this.d.k(tn3, -1.0f);
        } else {
            this.d.k(tn1, -1.0f);
            this.d.k(tn2, 1.0f);
            this.d.k(tn3, 1.0f);
        }
    }

    public final void d(TN1 tn1, TN1 tn2, TN1 tn3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.k(tn1, 1.0f);
            this.d.k(tn2, -1.0f);
            this.d.k(tn3, 1.0f);
        } else {
            this.d.k(tn1, -1.0f);
            this.d.k(tn2, 1.0f);
            this.d.k(tn3, -1.0f);
        }
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.c() == 0;
    }

    public final TN1 f(boolean[] zArr, TN1 tn1) {
        TN1.a aVar;
        int iC = this.d.c();
        TN1 tn2 = null;
        float f = 0.0f;
        for (int i = 0; i < iC; i++) {
            float fG = this.d.g(i);
            if (fG < 0.0f) {
                TN1 tn1D = this.d.d(i);
                if ((zArr == null || !zArr[tn1D.e]) && tn1D != tn1 && (((aVar = tn1D.m) == TN1.a.e || aVar == TN1.a.g) && fG < f)) {
                    f = fG;
                    tn2 = tn1D;
                }
            }
        }
        return tn2;
    }

    public final void g(TN1 tn1) {
        TN1 tn2 = this.a;
        if (tn2 != null) {
            this.d.k(tn2, -1.0f);
            this.a.g = -1;
            this.a = null;
        }
        float fH = this.d.h(tn1, true) * (-1.0f);
        this.a = tn1;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        this.d.j(fH);
    }

    public final void h(C4874kQ0 c4874kQ0, TN1 tn1, boolean z) {
        if (tn1 == null || !tn1.j) {
            return;
        }
        float fA = this.d.a(tn1);
        this.b = (tn1.i * fA) + this.b;
        this.d.h(tn1, z);
        if (z) {
            tn1.e(this);
        }
        if (this.d.c() == 0) {
            this.e = true;
            c4874kQ0.a = true;
        }
    }

    public void i(C4874kQ0 c4874kQ0, C0747Cj c0747Cj, boolean z) {
        float fI = this.d.i(c0747Cj, z);
        this.b = (c0747Cj.b * fI) + this.b;
        if (z) {
            c0747Cj.a.e(this);
        }
        if (this.a == null || this.d.c() != 0) {
            return;
        }
        this.e = true;
        c4874kQ0.a = true;
    }

    public String toString() {
        boolean z;
        String strC = Z0.c(this.a == null ? "0" : "" + this.a, " = ");
        if (this.b != 0.0f) {
            StringBuilder sbF = C1039Gc0.f(strC);
            sbF.append(this.b);
            strC = sbF.toString();
            z = true;
        } else {
            z = false;
        }
        int iC = this.d.c();
        for (int i = 0; i < iC; i++) {
            TN1 tn1D = this.d.d(i);
            if (tn1D != null) {
                float fG = this.d.g(i);
                if (fG != 0.0f) {
                    String string = tn1D.toString();
                    if (z) {
                        if (fG > 0.0f) {
                            strC = Z0.c(strC, " + ");
                        } else {
                            strC = Z0.c(strC, " - ");
                            fG *= -1.0f;
                        }
                    } else if (fG < 0.0f) {
                        strC = Z0.c(strC, "- ");
                        fG *= -1.0f;
                    }
                    strC = fG == 1.0f ? Z0.c(strC, string) : strC + fG + " " + string;
                    z = true;
                }
            }
        }
        return !z ? Z0.c(strC, "0.0") : strC;
    }

    public C0747Cj(C3887fx c3887fx) {
        this.d = new C7041uj(this, c3887fx);
    }
}

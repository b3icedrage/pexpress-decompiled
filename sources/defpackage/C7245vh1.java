package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: vh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7245vh1 extends C0747Cj {
    public TN1[] f;
    public TN1[] g;
    public int h;
    public b i;

    /* JADX INFO: renamed from: vh1$a */
    public class a implements Comparator<TN1> {
        @Override // java.util.Comparator
        public final int compare(TN1 tn1, TN1 tn2) {
            return tn1.e - tn2.e;
        }
    }

    /* JADX INFO: renamed from: vh1$b */
    public class b {
        public TN1 a;

        public b() {
        }

        public final String toString() {
            String string = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbF = C1039Gc0.f(string);
                    sbF.append(this.a.l[i]);
                    sbF.append(" ");
                    string = sbF.toString();
                }
            }
            StringBuilder sbB = K1.b(string, "] ");
            sbB.append(this.a);
            return sbB.toString();
        }
    }

    @Override // defpackage.C0747Cj, defpackage.C4874kQ0.a
    public final TN1 a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            TN1[] tn1Arr = this.f;
            TN1 tn1 = tn1Arr[i2];
            if (!zArr[tn1.e]) {
                b bVar = this.i;
                bVar.a = tn1;
                int i3 = 8;
                if (i != -1) {
                    TN1 tn2 = tn1Arr[i];
                    while (i3 >= 0) {
                        float f = tn2.l[i3];
                        float f2 = bVar.a.l[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = bVar.a.l[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.C0747Cj
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.C0747Cj
    public final void i(C4874kQ0 c4874kQ0, C0747Cj c0747Cj, boolean z) {
        TN1 tn1 = c0747Cj.a;
        if (tn1 == null) {
            return;
        }
        C0747Cj.a aVar = c0747Cj.d;
        int iC = aVar.c();
        for (int i = 0; i < iC; i++) {
            TN1 tn1D = aVar.d(i);
            float fG = aVar.g(i);
            b bVar = this.i;
            bVar.a = tn1D;
            boolean z2 = tn1D.d;
            float[] fArr = tn1.l;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = bVar.a.l;
                    float f = (fArr[i2] * fG) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        bVar.a.l[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    C7245vh1.this.k(bVar.a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fG;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bVar.a.l[i3] = f3;
                    } else {
                        bVar.a.l[i3] = 0.0f;
                    }
                }
                j(tn1D);
            }
            this.b = (c0747Cj.b * fG) + this.b;
        }
        k(tn1);
    }

    public final void j(TN1 tn1) {
        int i;
        int i2 = this.h + 1;
        TN1[] tn1Arr = this.f;
        if (i2 > tn1Arr.length) {
            TN1[] tn1Arr2 = (TN1[]) Arrays.copyOf(tn1Arr, tn1Arr.length * 2);
            this.f = tn1Arr2;
            this.g = (TN1[]) Arrays.copyOf(tn1Arr2, tn1Arr2.length * 2);
        }
        TN1[] tn1Arr3 = this.f;
        int i3 = this.h;
        tn1Arr3[i3] = tn1;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && tn1Arr3[i3].e > tn1.e) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new a());
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        tn1.d = true;
        tn1.b(this);
    }

    public final void k(TN1 tn1) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == tn1) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        tn1.d = false;
                        return;
                    } else {
                        TN1[] tn1Arr = this.f;
                        int i3 = i + 1;
                        tn1Arr[i] = tn1Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.C0747Cj
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            TN1 tn1 = this.f[i];
            b bVar = this.i;
            bVar.a = tn1;
            str = str + bVar + " ";
        }
        return str;
    }
}

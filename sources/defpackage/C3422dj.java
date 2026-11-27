package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3422dj extends AbstractC4198hR {
    public final double[] a;
    public final a[] b;

    /* JADX INFO: renamed from: dj$a */
    public static class a {
        public static final double[] s = new double[91];
        public double[] a;
        public double b;
        public double c;
        public double d;
        public double e;
        public double f;
        public double g;
        public double h;
        public double i;
        public double j;
        public double k;
        public double l;
        public double m;
        public double n;
        public double o;
        public double p;
        public boolean q;
        public boolean r;

        public final double a() {
            double d = this.j * this.p;
            double dHypot = this.n / Math.hypot(d, (-this.k) * this.o);
            return this.q ? (-d) * dHypot : d * dHypot;
        }

        public final double b() {
            double d = this.j * this.p;
            double d2 = (-this.k) * this.o;
            double dHypot = this.n / Math.hypot(d, d2);
            return this.q ? (-d2) * dHypot : d2 * dHypot;
        }

        public final double c(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.f;
            double d4 = this.e;
            return ((d3 - d4) * d2) + d4;
        }

        public final double d(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.h;
            double d4 = this.g;
            return ((d3 - d4) * d2) + d4;
        }

        public final double e() {
            return (this.j * this.o) + this.l;
        }

        public final double f() {
            return (this.k * this.p) + this.m;
        }

        public final void g(double d) {
            double d2 = (this.q ? this.d - d : d - this.c) * this.i;
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.a;
                    double length = d2 * ((double) (dArr.length - 1));
                    int i = (int) length;
                    double d4 = dArr[i];
                    d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
                }
            }
            double d5 = d3 * 1.5707963267948966d;
            this.o = Math.sin(d5);
            this.p = Math.cos(d5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dj, java.lang.Object] */
    public C3422dj(int[] iArr, double[] dArr, double[][] dArr2) {
        int i;
        a[] aVarArr;
        int i2;
        double[] dArr3;
        int i3;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.a = dArr4;
        int i4 = 1;
        obj.b = new a[dArr4.length - 1];
        char c = 0;
        int i5 = 0;
        int i6 = 1;
        int i7 = 1;
        C3422dj c3422dj = obj;
        while (true) {
            a[] aVarArr2 = c3422dj.b;
            if (i5 >= aVarArr2.length) {
                return;
            }
            int i8 = iArr[i5];
            if (i8 == 0) {
                i7 = 3;
            } else if (i8 == i4) {
                i6 = i4;
                i7 = i6;
            } else {
                if (i8 != 2) {
                    if (i8 == 3) {
                        if (i6 != i4) {
                            i6 = i4;
                        }
                        i7 = i6;
                    }
                }
                i6 = 2;
                i7 = i6;
            }
            double d = dArr4[i5];
            int i9 = i5 + 1;
            double d2 = dArr4[i9];
            double[] dArr5 = dArr2[i5];
            double d3 = dArr5[c];
            boolean z = i4;
            int i10 = i5;
            double d4 = dArr5[z ? 1 : 0];
            double[] dArr6 = dArr2[i9];
            double d5 = dArr6[c];
            double d6 = dArr6[z ? 1 : 0];
            a aVar = new a();
            aVar.r = false;
            boolean z2 = i7 == z ? z ? 1 : 0 : false;
            aVar.q = z2;
            aVar.c = d;
            aVar.d = d2;
            double d7 = d2 - d;
            double d8 = 1.0d / d7;
            aVar.i = d8;
            if (3 == i7) {
                aVar.r = z;
            }
            double d9 = d5 - d3;
            boolean z3 = z2;
            int i11 = i6;
            double d10 = d6 - d4;
            if (aVar.r || Math.abs(d9) < 0.001d || Math.abs(d10) < 0.001d) {
                i = i7;
                aVarArr = aVarArr2;
                i2 = 1;
                aVar.r = true;
                aVar.e = d3;
                aVar.f = d5;
                aVar.g = d4;
                aVar.h = d6;
                double dHypot = Math.hypot(d10, d9);
                aVar.b = dHypot;
                aVar.n = dHypot * d8;
                aVar.l = d9 / d7;
                aVar.m = d10 / d7;
            } else {
                aVar.a = new double[101];
                aVar.j = ((double) (z3 ? -1 : 1)) * d9;
                aVar.k = d10 * ((double) (z3 ? 1 : -1));
                aVar.l = z3 ? d5 : d3;
                aVar.m = z3 ? d4 : d6;
                double d11 = d4 - d6;
                int i12 = 0;
                double dHypot2 = 0.0d;
                double d12 = 0.0d;
                double d13 = 0.0d;
                while (true) {
                    dArr3 = a.s;
                    if (i12 >= 91) {
                        break;
                    }
                    double d14 = d12;
                    double radians = Math.toRadians((((double) i12) * 90.0d) / ((double) 90));
                    double dSin = Math.sin(radians) * d9;
                    double dCos = Math.cos(radians) * d11;
                    double d15 = d11;
                    if (i12 > 0) {
                        i3 = i12;
                        dHypot2 += Math.hypot(dSin - d14, dCos - d13);
                        dArr3[i3] = dHypot2;
                    } else {
                        i3 = i12;
                    }
                    i12 = i3 + 1;
                    d13 = dCos;
                    aVarArr2 = aVarArr2;
                    d11 = d15;
                    i7 = i7;
                    d12 = dSin;
                }
                i = i7;
                aVarArr = aVarArr2;
                aVar.b = dHypot2;
                for (int i13 = 0; i13 < 91; i13++) {
                    dArr3[i13] = dArr3[i13] / dHypot2;
                }
                int i14 = 0;
                while (true) {
                    double[] dArr7 = aVar.a;
                    if (i14 >= dArr7.length) {
                        break;
                    }
                    double length = ((double) i14) / ((double) (dArr7.length - 1));
                    int iBinarySearch = Arrays.binarySearch(dArr3, length);
                    if (iBinarySearch >= 0) {
                        dArr7[i14] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr7[i14] = 0.0d;
                    } else {
                        int i15 = -iBinarySearch;
                        int i16 = i15 - 2;
                        double d16 = dArr3[i16];
                        dArr7[i14] = (((length - d16) / (dArr3[i15 - 1] - d16)) + ((double) i16)) / ((double) 90);
                    }
                    i14++;
                }
                aVar.n = aVar.b * aVar.i;
                i2 = 1;
            }
            aVarArr[i10] = aVar;
            c3422dj = this;
            dArr4 = dArr;
            i4 = i2;
            i6 = i11;
            i5 = i9;
            i7 = i;
            c = 0;
        }
    }

    @Override // defpackage.AbstractC4198hR
    public final double b(double d) {
        a[] aVarArr = this.b;
        a aVar = aVarArr[0];
        double d2 = aVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.r) {
                return (d3 * aVarArr[0].l) + aVar.c(d2);
            }
            aVar.g(d2);
            return (aVarArr[0].a() * d3) + aVarArr[0].e();
        }
        if (d > aVarArr[aVarArr.length - 1].d) {
            double d4 = aVarArr[aVarArr.length - 1].d;
            double d5 = d - d4;
            int length = aVarArr.length - 1;
            return (d5 * aVarArr[length].l) + aVarArr[length].c(d4);
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar2 = aVarArr[i];
            if (d <= aVar2.d) {
                if (aVar2.r) {
                    return aVar2.c(d);
                }
                aVar2.g(d);
                return aVarArr[i].e();
            }
        }
        return Double.NaN;
    }

    @Override // defpackage.AbstractC4198hR
    public final void c(double d, double[] dArr) {
        a[] aVarArr = this.b;
        a aVar = aVarArr[0];
        double d2 = aVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.r) {
                double dC = aVar.c(d2);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.l * d3) + dC;
                dArr[1] = (d3 * aVarArr[0].m) + aVar2.d(d2);
                return;
            }
            aVar.g(d2);
            dArr[0] = (aVarArr[0].a() * d3) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d3) + aVarArr[0].f();
            return;
        }
        if (d <= aVarArr[aVarArr.length - 1].d) {
            for (int i = 0; i < aVarArr.length; i++) {
                a aVar3 = aVarArr[i];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        dArr[0] = aVar3.c(d);
                        dArr[1] = aVarArr[i].d(d);
                        return;
                    } else {
                        aVar3.g(d);
                        dArr[0] = aVarArr[i].e();
                        dArr[1] = aVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = aVarArr[aVarArr.length - 1].d;
        double d5 = d - d4;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.r) {
            double dC2 = aVar4.c(d4);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.l * d5) + dC2;
            dArr[1] = (d5 * aVarArr[length].m) + aVar5.d(d4);
            return;
        }
        aVar4.g(d);
        dArr[0] = (aVarArr[length].a() * d5) + aVarArr[length].e();
        dArr[1] = (aVarArr[length].b() * d5) + aVarArr[length].f();
    }

    @Override // defpackage.AbstractC4198hR
    public final void d(double d, float[] fArr) {
        a[] aVarArr = this.b;
        a aVar = aVarArr[0];
        double d2 = aVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.r) {
                double dC = aVar.c(d2);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.l * d3) + dC);
                fArr[1] = (float) ((d3 * aVarArr[0].m) + aVar2.d(d2));
                return;
            }
            aVar.g(d2);
            fArr[0] = (float) ((aVarArr[0].a() * d3) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d3) + aVarArr[0].f());
            return;
        }
        if (d <= aVarArr[aVarArr.length - 1].d) {
            for (int i = 0; i < aVarArr.length; i++) {
                a aVar3 = aVarArr[i];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        fArr[0] = (float) aVar3.c(d);
                        fArr[1] = (float) aVarArr[i].d(d);
                        return;
                    } else {
                        aVar3.g(d);
                        fArr[0] = (float) aVarArr[i].e();
                        fArr[1] = (float) aVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = aVarArr[aVarArr.length - 1].d;
        double d5 = d - d4;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.r) {
            aVar4.g(d);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            double dC2 = aVar4.c(d4);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.l * d5) + dC2);
            fArr[1] = (float) ((d5 * aVarArr[length].m) + aVar5.d(d4));
        }
    }

    @Override // defpackage.AbstractC4198hR
    public final void e(double d, double[] dArr) {
        a[] aVarArr = this.b;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            if (d <= aVar.d) {
                if (aVar.r) {
                    dArr[0] = aVar.l;
                    dArr[1] = aVar.m;
                    return;
                } else {
                    aVar.g(d);
                    dArr[0] = aVarArr[i].a();
                    dArr[1] = aVarArr[i].b();
                    return;
                }
            }
        }
    }

    @Override // defpackage.AbstractC4198hR
    public final double[] f() {
        return this.a;
    }
}

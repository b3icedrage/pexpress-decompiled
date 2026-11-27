package defpackage;

/* JADX INFO: renamed from: eN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3556eN {
    public final MP0[] c = {new MP0(), new MP0(), new MP0(), new MP0(), new MP0(), new MP0(), new MP0(), new MP0(), new MP0(), new MP0(), new MP0()};
    public final int[] a = new int[23];
    public final MP0[] b = new MP0[11];

    public C3556eN() {
        int i = 0;
        while (true) {
            MP0[] mp0Arr = this.b;
            if (i >= mp0Arr.length) {
                return;
            }
            MP0 mp0 = this.c[i];
            MP0 mp1 = new MP0();
            mp0.getClass();
            mp0Arr[i] = mp1;
            i++;
        }
    }

    public static EnumC2107Tt1 f(int i, float[] fArr, int i2, C3372dV0 c3372dV0, C3372dV0 c3372dV1, double[] dArr) {
        int i3;
        int i4 = i2;
        if (i < 0 || i < 0) {
            return EnumC2107Tt1.g;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = 30;
        } else if (i4 < 2 || i4 > 100000) {
            return EnumC2107Tt1.e;
        }
        int i5 = i4 - 1;
        int i6 = 0;
        int i7 = i5 > 0 ? i5 : 0;
        EnumC2107Tt1 enumC2107Tt1 = EnumC2107Tt1.d;
        if (i7 > i) {
            c3372dV0.a = 0;
            c3372dV1.a = 0;
            return enumC2107Tt1;
        }
        int i8 = i7 - i5;
        double d = 0.0d;
        if (i4 > 1) {
            i3 = i8;
            while (i3 < i7) {
                d += (double) fArr[i3];
                i3++;
            }
        } else {
            i3 = i8;
        }
        while (true) {
            int i9 = i3 + 1;
            double d2 = d + ((double) fArr[i3]);
            int i10 = i8 + 1;
            double d3 = d2 - ((double) fArr[i8]);
            int i11 = i6 + 1;
            dArr[i6] = d2 / ((double) i4);
            if (i9 > i) {
                c3372dV1.a = i11;
                c3372dV0.a = i7;
                return enumC2107Tt1;
            }
            i6 = i11;
            i8 = i10;
            i3 = i9;
            d = d3;
        }
    }

    public final EnumC2107Tt1 a(int i, int i2, float[] fArr, int i3, double d, C3372dV0 c3372dV0, C3372dV0 c3372dV1, double[] dArr) {
        int iC = c(i3);
        if (i < iC) {
            i = iC;
        }
        EnumC2107Tt1 enumC2107Tt1 = EnumC2107Tt1.d;
        if (i > i2) {
            c3372dV0.a = 0;
            c3372dV1.a = 0;
            return enumC2107Tt1;
        }
        c3372dV0.a = i;
        int i4 = i - iC;
        double d2 = 0.0d;
        int i5 = i3;
        while (true) {
            int i6 = i5 - 1;
            if (i5 <= 0) {
                break;
            }
            d2 += (double) fArr[i4];
            i4++;
            i5 = i6;
        }
        double d3 = d2 / ((double) i3);
        while (i4 <= i) {
            d3 += (((double) fArr[i4]) - d3) * d;
            i4++;
        }
        dArr[0] = d3;
        int i7 = 1;
        while (i4 <= i2) {
            d3 += (((double) fArr[i4]) - d3) * d;
            dArr[i7] = d3;
            i7++;
            i4++;
        }
        c3372dV1.a = i7;
        return enumC2107Tt1;
    }

    public final EnumC2107Tt1 b(int i, float[] fArr, int i2, C3372dV0 c3372dV0, C3372dV0 c3372dV1, double[] dArr) {
        if (i < 0 || i < 0) {
            return EnumC2107Tt1.g;
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = 30;
        } else if (i2 < 2 || i2 > 100000) {
            return EnumC2107Tt1.e;
        }
        int i3 = i2;
        a(0, i, fArr, i3, 2.0d / ((double) (i3 + 1)), c3372dV0, c3372dV1, dArr);
        return EnumC2107Tt1.d;
    }

    public final int c(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 30;
        } else if (i < 2 || i > 100000) {
            return -1;
        }
        return (i - 1) + this.a[5];
    }

    public final EnumC2107Tt1 d(int i, double[] dArr, int i2, C3372dV0 c3372dV0, C3372dV0 c3372dV1, double[] dArr2) {
        int i3;
        int i4 = i2;
        EnumC2107Tt1 enumC2107Tt1 = EnumC2107Tt1.g;
        if (i >= 0 && i >= 0) {
            EnumC2107Tt1 enumC2107Tt2 = EnumC2107Tt1.e;
            if (i4 != Integer.MIN_VALUE) {
                if (i4 >= 1 && i4 <= 100000) {
                }
                return enumC2107Tt2;
            }
            i4 = 30;
            EnumC2107Tt1 enumC2107Tt3 = EnumC2107Tt1.d;
            int i5 = 0;
            if (i4 == 1) {
                int i6 = i + 1;
                c3372dV1.a = i6;
                int i7 = 0;
                int i8 = 0;
                while (i7 < i6) {
                    dArr2[i7] = dArr[i8];
                    i7++;
                    i8++;
                }
                c3372dV0.a = 0;
                return enumC2107Tt3;
            }
            if (i >= 0 && i >= 0) {
                if (i4 != Integer.MIN_VALUE) {
                    i3 = (i4 >= 2 && i4 <= 100000) ? i4 : 30;
                    return enumC2107Tt2;
                }
                int i9 = i3 - 1;
                int i10 = i9 > 0 ? i9 : 0;
                if (i10 > i) {
                    c3372dV0.a = 0;
                    c3372dV1.a = 0;
                    return enumC2107Tt3;
                }
                int i11 = i10 - i9;
                double d = 0.0d;
                int i12 = i11;
                if (i3 > 1) {
                    while (i12 < i10) {
                        d += dArr[i12];
                        i12++;
                    }
                }
                while (true) {
                    int i13 = i12 + 1;
                    double d2 = d + dArr[i12];
                    int i14 = i11 + 1;
                    double d3 = d2 - dArr[i11];
                    int i15 = i5 + 1;
                    dArr2[i5] = d2 / ((double) i3);
                    if (i13 > i) {
                        c3372dV1.a = i15;
                        c3372dV0.a = i10;
                        return enumC2107Tt3;
                    }
                    i5 = i15;
                    i11 = i14;
                    i12 = i13;
                    d = d3;
                }
            }
        }
        return enumC2107Tt1;
    }

    public final int e(int i) {
        int i2;
        if (i != Integer.MIN_VALUE) {
            if (i >= 1 && i <= 100000) {
            }
            return -1;
        }
        i = 30;
        if (i <= 1) {
            return 0;
        }
        if (i != Integer.MIN_VALUE) {
            i2 = (i >= 2 && i <= 100000) ? i : 30;
            return -1;
        }
        return i2 - 1;
    }
}

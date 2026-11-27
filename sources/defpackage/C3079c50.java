package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: c50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3079c50 {
    public static final C3079c50 b = new C3079c50();
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public String a = "identity";

    /* JADX INFO: renamed from: c50$a */
    public static class a extends C3079c50 {
        public final double d;
        public final double e;
        public final double f;
        public final double g;

        public a(String str) {
            this.a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.e = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.f = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // defpackage.C3079c50
        public final double a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d(d4);
            double d6 = d3 + d2;
            double d7 = d(d6);
            double dE = e(d4);
            return (((d - d5) * (e(d6) - dE)) / (d7 - d5)) + dE;
        }

        @Override // defpackage.C3079c50
        public final double b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                d3 = d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (e(d5) - e(d4)) / (d(d5) - d(d4));
        }

        public final double d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f * d5) + (this.d * d4) + (d * d * d);
        }

        public final double e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.g * d5) + (this.e * d4) + (d * d * d);
        }
    }

    public static C3079c50 c(String str) {
        byte b2 = 3;
        char c2 = 0;
        char c3 = 2;
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            C4197hQ1 c4197hQ1 = new C4197hQ1();
            c4197hQ1.a = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i = 0;
            while (iIndexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            int i2 = 0;
            while (i2 < dArrCopyOf.length) {
                double d2 = dArrCopyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][c2] = d2;
                char c4 = c2;
                char c5 = c3;
                double d3 = ((double) i2) * d;
                dArr3[i3] = d3;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][c4] = d2 + 1.0d;
                    dArr3[i4] = d3 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][c4] = (d2 - 1.0d) - d;
                    dArr3[i5] = (d3 - 1.0d) - d;
                }
                i2++;
                c2 = c4;
                c3 = c5;
            }
            C2631a11 c2631a11 = new C2631a11(dArr3, dArr2);
            System.out.println(" 0 " + c2631a11.b(0.0d));
            System.out.println(" 1 " + c2631a11.b(1.0d));
            c4197hQ1.d = c2631a11;
            return c4197hQ1;
        }
        if (str.startsWith("Schlick")) {
            JD1 jd1 = new JD1();
            jd1.a = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            jd1.d = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i6 = iIndexOf4 + 1;
            jd1.e = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return jd1;
        }
        switch (str.hashCode()) {
            case -1354466595:
                b2 = !str.equals("accelerate") ? (byte) -1 : (byte) 0;
                break;
            case -1263948740:
                b2 = !str.equals("decelerate") ? (byte) -1 : (byte) 1;
                break;
            case -1197605014:
                b2 = !str.equals("anticipate") ? (byte) -1 : (byte) 2;
                break;
            case -1102672091:
                if (!str.equals("linear")) {
                    b2 = -1;
                }
                break;
            case -749065269:
                b2 = !str.equals("overshoot") ? (byte) -1 : (byte) 4;
                break;
            case 1312628413:
                b2 = !str.equals("standard") ? (byte) -1 : (byte) 5;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new a("cubic(1, 1, 0, 0)");
            case 4:
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(c));
                return b;
        }
    }

    public double b(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.a;
    }

    public double a(double d) {
        return d;
    }
}

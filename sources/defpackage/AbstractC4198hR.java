package defpackage;

/* JADX INFO: renamed from: hR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4198hR {

    /* JADX INFO: renamed from: hR$a */
    public static class a extends AbstractC4198hR {
        public double a;
        public double[] b;

        @Override // defpackage.AbstractC4198hR
        public final double b(double d) {
            return this.b[0];
        }

        @Override // defpackage.AbstractC4198hR
        public final void c(double d, double[] dArr) {
            double[] dArr2 = this.b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // defpackage.AbstractC4198hR
        public final void d(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.b;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // defpackage.AbstractC4198hR
        public final void e(double d, double[] dArr) {
            for (int i = 0; i < this.b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // defpackage.AbstractC4198hR
        public final double[] f() {
            return new double[]{this.a};
        }
    }

    public static AbstractC4198hR a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C2631a11(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            a aVar = new a();
            aVar.a = d;
            aVar.b = dArr3;
            return aVar;
        }
        C4406iQ0 c4406iQ0 = new C4406iQ0();
        int length = dArr2[0].length;
        c4406iQ0.c = new double[length];
        c4406iQ0.a = dArr;
        c4406iQ0.b = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return c4406iQ0;
    }

    public abstract double b(double d);

    public abstract void c(double d, double[] dArr);

    public abstract void d(double d, float[] fArr);

    public abstract void e(double d, double[] dArr);

    public abstract double[] f();
}

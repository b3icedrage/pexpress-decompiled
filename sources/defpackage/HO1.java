package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class HO1 implements FQ1 {
    public double a;
    public double b;
    public double c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;

    @Override // defpackage.FQ1
    public final boolean a() {
        double d = ((double) this.e) - this.c;
        double d2 = this.b;
        double d3 = this.f;
        return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.g))) / d2) <= ((double) this.h);
    }

    @Override // defpackage.FQ1
    public final float b() {
        return 0.0f;
    }

    @Override // defpackage.FQ1
    public final float getInterpolation(float f) {
        double d = f - this.d;
        double d2 = this.b;
        double d3 = this.a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.g)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) iSqrt);
        int i = 0;
        while (i < iSqrt) {
            double d5 = this.e;
            double d6 = this.c;
            double d7 = d4;
            double d8 = this.f;
            double d9 = this.g;
            double d10 = ((((((-d2) * (d5 - d6)) - (d3 * d8)) / d9) * d7) / 2.0d) + d8;
            double d11 = ((((-((((d7 * d10) / 2.0d) + d5) - d6)) * d2) - (d10 * d3)) / d9) * d7;
            double d12 = (d11 / 2.0d) + d8;
            float f2 = (float) (d8 + d11);
            this.f = f2;
            float f3 = (float) ((d12 * d7) + d5);
            this.e = f3;
            int i2 = this.i;
            if (i2 > 0) {
                if (f3 < 0.0f && (i2 & 1) == 1) {
                    this.e = -f3;
                    this.f = -f2;
                }
                float f4 = this.e;
                if (f4 > 1.0f && (i2 & 2) == 2) {
                    this.e = 2.0f - f4;
                    this.f = -this.f;
                }
            }
            i++;
            d4 = d7;
        }
        this.d = f;
        return this.e;
    }
}

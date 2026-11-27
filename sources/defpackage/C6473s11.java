package defpackage;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.c;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: s11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6473s11 implements Comparable<C6473s11> {
    public static final String[] v = {"position", "x", "y", "width", "height", "pathRotate"};
    public C3079c50 d;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int e = 0;
    public float m = Float.NaN;
    public int n = -1;
    public int o = -1;
    public float p = Float.NaN;
    public C5214m11 q = null;
    public LinkedHashMap<String, a> r = new LinkedHashMap<>();
    public int s = 0;
    public double[] t = new double[18];
    public double[] u = new double[18];

    public static boolean e(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public static void k(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    public final void b(c.a aVar) {
        int iOrdinal;
        this.d = C3079c50.c(aVar.d.d);
        c.C0228c c0228c = aVar.d;
        this.n = c0228c.e;
        this.o = c0228c.b;
        this.m = c0228c.h;
        this.e = c0228c.f;
        this.p = aVar.e.C;
        for (String str : aVar.g.keySet()) {
            a aVar2 = aVar.g.get(str);
            if (aVar2 != null && (iOrdinal = aVar2.c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.r.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull C6473s11 c6473s11) {
        return Float.compare(this.h, c6473s11.h);
    }

    public final void f(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.i;
        float fCos = this.j;
        float f = this.k;
        float f2 = this.l;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        C5214m11 c5214m11 = this.q;
        if (c5214m11 != null) {
            float[] fArr2 = new float[2];
            c5214m11.b(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) (((Math.sin(d4) * d3) + d2) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (Math.cos(d4) * d3)) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = (f / 2.0f) + fSin + 0.0f;
        fArr[i + 1] = (f2 / 2.0f) + fCos + 0.0f;
    }

    public final void i(float f, float f2, float f3, float f4) {
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = f4;
    }

    public final void l(C5214m11 c5214m11, C6473s11 c6473s11) {
        double d = (((this.k / 2.0f) + this.i) - c6473s11.i) - (c6473s11.k / 2.0f);
        double d2 = (((this.l / 2.0f) + this.j) - c6473s11.j) - (c6473s11.l / 2.0f);
        this.q = c5214m11;
        this.i = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.p)) {
            this.j = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.j = (float) Math.toRadians(this.p);
        }
    }
}

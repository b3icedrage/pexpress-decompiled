package defpackage;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: hK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4178hK0 {
    public a a;
    public String b;
    public int c;
    public String d;
    public int e;
    public ArrayList<b> f;

    /* JADX INFO: renamed from: hK0$a */
    public static class a {
        public C5958pa1 a;
        public float[] b;
        public double[] c;
        public float[] d;
        public float[] e;
        public float[] f;
        public AbstractC4198hR g;
        public double[] h;
    }

    /* JADX INFO: renamed from: hK0$b */
    public static class b {
        public final int a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;

        public b(float f, float f2, float f3, float f4, int i) {
            this.a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public final float a(float f) {
        double d;
        double dSignum;
        a aVar = this.a;
        AbstractC4198hR abstractC4198hR = aVar.g;
        if (abstractC4198hR != null) {
            abstractC4198hR.c(f, aVar.h);
        } else {
            double[] dArr = aVar.h;
            dArr[0] = aVar.e[0];
            dArr[1] = aVar.f[0];
            dArr[2] = aVar.b[0];
        }
        double[] dArr2 = aVar.h;
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        double d4 = f;
        C5958pa1 c5958pa1 = aVar.a;
        c5958pa1.getClass();
        double d5 = 0.0d;
        if (d4 < 0.0d) {
            d4 = 0.0d;
        } else if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(c5958pa1.b, d4);
        if (iBinarySearch > 0) {
            d5 = 1.0d;
            d = 1.0d;
        } else if (iBinarySearch != 0) {
            int i = -iBinarySearch;
            int i2 = i - 1;
            float[] fArr = c5958pa1.a;
            float f2 = fArr[i2];
            int i3 = i - 2;
            float f3 = fArr[i3];
            d = 1.0d;
            double[] dArr3 = c5958pa1.b;
            double d6 = dArr3[i2];
            double d7 = dArr3[i3];
            double d8 = ((double) (f2 - f3)) / (d6 - d7);
            double d9 = d4;
            d5 = ((((d9 * d9) - (d7 * d7)) * d8) / 2.0d) + ((d9 - d7) * (((double) f3) - (d8 * d7))) + c5958pa1.c[i3];
        } else {
            d = 1.0d;
        }
        double d10 = d5 + d3;
        switch (c5958pa1.e) {
            case 1:
                dSignum = Math.signum(0.5d - (d10 % d));
                break;
            case 2:
                dSignum = d - Math.abs((((d10 * 4.0d) + d) % 4.0d) - 2.0d);
                break;
            case 3:
                dSignum = (((d10 * 2.0d) + d) % 2.0d) - d;
                break;
            case 4:
                dSignum = d - (((d10 * 2.0d) + d) % 2.0d);
                break;
            case 5:
                dSignum = Math.cos((d3 + d10) * 6.283185307179586d);
                break;
            case 6:
                double dAbs = d - Math.abs(((d10 * 4.0d) % 4.0d) - 2.0d);
                dSignum = d - (dAbs * dAbs);
                break;
            case 7:
                dSignum = c5958pa1.d.b(d10 % d);
                break;
            default:
                dSignum = Math.sin(6.283185307179586d * d10);
                break;
        }
        return (float) ((dSignum * aVar.h[2]) + d2);
    }

    public final void c() {
        int i;
        int i2;
        double d;
        int i3;
        ArrayList<b> arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C3968gK0());
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i4 = this.c;
        String str = this.d;
        a aVar = new a();
        C5958pa1 c5958pa1 = new C5958pa1();
        c5958pa1.a = new float[0];
        c5958pa1.b = new double[0];
        aVar.a = c5958pa1;
        c5958pa1.e = i4;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            i2 = 0;
            i = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i5 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i5++;
            }
            dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i5 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            int i6 = 0;
            while (i6 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i6];
                int i7 = i6 + length2;
                dArr4[i7][0] = d3;
                double d4 = d2;
                double d5 = ((double) i6) * d4;
                dArr5[i7] = d5;
                if (i6 > 0) {
                    int i8 = (length2 * 2) + i6;
                    dArr4[i8][0] = d3 + 1.0d;
                    dArr5[i8] = d5 + 1.0d;
                    int i9 = i6 - 1;
                    dArr4[i9][0] = (d3 - 1.0d) - d4;
                    dArr5[i9] = (d5 - 1.0d) - d4;
                }
                i6++;
                d2 = d4;
            }
            c5958pa1.d = new C2631a11(dArr5, dArr4);
        } else {
            i = 1;
            i2 = 0;
            d = 1.0d;
        }
        aVar.b = new float[size];
        aVar.c = new double[size];
        aVar.d = new float[size];
        aVar.e = new float[size];
        aVar.f = new float[size];
        float[] fArr = new float[size];
        this.a = aVar;
        int i10 = i2;
        for (b bVar : arrayList) {
            float f = bVar.d;
            dArr[i10] = ((double) f) * 0.01d;
            double[] dArr6 = dArr2[i10];
            float f2 = bVar.b;
            dArr6[i2] = f2;
            float f3 = bVar.c;
            dArr6[i] = f3;
            float f4 = bVar.e;
            dArr6[r4] = f4;
            a aVar2 = this.a;
            aVar2.c[i10] = ((double) bVar.a) / 100.0d;
            aVar2.d[i10] = f;
            aVar2.e[i10] = f3;
            aVar2.f[i10] = f4;
            aVar2.b[i10] = f2;
            i10++;
        }
        a aVar3 = this.a;
        double[] dArr7 = aVar3.c;
        int length3 = dArr7.length;
        int[] iArr = new int[2];
        iArr[i] = 3;
        iArr[i2] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr2 = aVar3.b;
        aVar3.h = new double[fArr2.length + 2];
        double[] dArr9 = new double[fArr2.length + 2];
        double d6 = dArr7[i2];
        double d7 = 0.0d;
        float[] fArr3 = aVar3.d;
        C5958pa1 c5958pa2 = aVar3.a;
        if (d6 > 0.0d) {
            c5958pa2.a(0.0d, fArr3[i2]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            c5958pa2.a(d, fArr3[length4]);
        }
        for (int i11 = i2; i11 < dArr8.length; i11++) {
            double[] dArr10 = dArr8[i11];
            dArr10[i2] = aVar3.e[i11];
            dArr10[i] = aVar3.f[i11];
            dArr10[2] = fArr2[i11];
            c5958pa2.a(dArr7[i11], fArr3[i11]);
        }
        double d8 = 0.0d;
        int i12 = i2;
        while (true) {
            float[] fArr4 = c5958pa2.a;
            if (i12 >= fArr4.length) {
                break;
            }
            d8 += (double) fArr4[i12];
            i12++;
        }
        double d9 = 0.0d;
        int i13 = i;
        while (true) {
            float[] fArr5 = c5958pa2.a;
            if (i13 >= fArr5.length) {
                break;
            }
            int i14 = i13 - 1;
            float f5 = (fArr5[i14] + fArr5[i13]) / 2.0f;
            double d10 = d7;
            double[] dArr11 = c5958pa2.b;
            d9 = ((dArr11[i13] - dArr11[i14]) * ((double) f5)) + d9;
            i13++;
            d7 = d10;
        }
        double d11 = d7;
        int i15 = i2;
        while (true) {
            float[] fArr6 = c5958pa2.a;
            if (i15 >= fArr6.length) {
                break;
            }
            fArr6[i15] = (float) (((double) fArr6[i15]) * (d8 / d9));
            i15++;
        }
        c5958pa2.c[i2] = d11;
        int i16 = i;
        while (true) {
            float[] fArr7 = c5958pa2.a;
            if (i16 >= fArr7.length) {
                break;
            }
            int i17 = i16 - 1;
            float f6 = (fArr7[i17] + fArr7[i16]) / 2.0f;
            double[] dArr12 = c5958pa2.b;
            double d12 = dArr12[i16] - dArr12[i17];
            double[] dArr13 = c5958pa2.c;
            double d13 = dArr13[i17];
            int i18 = i16;
            dArr13[i18] = (d12 * ((double) f6)) + d13;
            i16 = i18 + 1;
        }
        if (dArr7.length > i) {
            i3 = i2;
            aVar3.g = AbstractC4198hR.a(i3, dArr7, dArr8);
        } else {
            i3 = i2;
            aVar3.g = null;
        }
        AbstractC4198hR.a(i3, dArr, dArr2);
    }

    public final String toString() {
        String string = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (b bVar : this.f) {
            StringBuilder sbB = K1.b(string, "[");
            sbB.append(bVar.a);
            sbB.append(" , ");
            sbB.append(decimalFormat.format(bVar.b));
            sbB.append("] ");
            string = sbB.toString();
        }
        return string;
    }

    public void b(androidx.constraintlayout.widget.a aVar) {
    }
}

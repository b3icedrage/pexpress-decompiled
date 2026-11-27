package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: Jm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1303Jm0 implements Zc2<C1147Hm0> {
    public int d;

    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    @Override // defpackage.Zc2
    public final C1147Hm0 d(AbstractC7580xH0 abstractC7580xH0, float f) {
        int i;
        int iArgb;
        float f2;
        int iArgb2;
        float f3;
        float fD;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        boolean z = abstractC7580xH0.g() == AbstractC7580xH0.b.d;
        if (z) {
            abstractC7580xH0.l1();
        }
        while (abstractC7580xH0.hasNext()) {
            arrayList.add(Float.valueOf((float) abstractC7580xH0.d0()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.d = 2;
        }
        if (z) {
            abstractC7580xH0.h1();
        }
        if (this.d == -1) {
            this.d = arrayList.size() / 4;
        }
        int i4 = this.d;
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.d * 4;
            if (i5 >= i) {
                break;
            }
            int i8 = i5 / 4;
            double dFloatValue = ((Float) arrayList.get(i5)).floatValue();
            int i9 = i3;
            int i10 = i5 % 4;
            if (i10 != 0) {
                if (i10 == i2) {
                    i6 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 2) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 3) {
                    iArr[i8] = Color.argb(255, i6, i7, (int) (dFloatValue * 255.0d));
                }
            } else if (i8 > 0) {
                float f4 = (float) dFloatValue;
                if (fArr[i8 - 1] >= f4) {
                    fArr[i8] = f4 + 0.01f;
                } else {
                    fArr[i8] = (float) dFloatValue;
                }
            } else {
                fArr[i8] = (float) dFloatValue;
            }
            i5++;
            i3 = i9;
            i2 = 1;
        }
        int i11 = i3;
        C1147Hm0 c1147Hm0 = new C1147Hm0(fArr, iArr);
        if (arrayList.size() <= i) {
            return c1147Hm0;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i12 = i11;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i12] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i12] = ((Float) arrayList.get(i)).floatValue();
                i12++;
            }
            i++;
        }
        float[] fArrCopyOf = c1147Hm0.a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i13 = i11;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            while (i13 < length) {
                float f5 = i15 < fArrCopyOf.length ? fArrCopyOf[i15] : Float.NaN;
                float f6 = i16 < size ? fArr2[i16] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr4[i13] = f5;
                    i15++;
                } else if (Float.isNaN(f5) || f6 < f5) {
                    fArr4[i13] = f6;
                    i16++;
                } else {
                    fArr4[i13] = f5;
                    i15++;
                    i16++;
                    i14++;
                }
                i13++;
            }
            fArrCopyOf = i14 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i14);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i17 = i11;
        while (i17 < length2) {
            float f7 = fArrCopyOf[i17];
            int iBinarySearch = Arrays.binarySearch(fArr, f7);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f7);
            int[] iArr3 = c1147Hm0.b;
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f8 = fArr3[iBinarySearch2];
                if (iArr3.length < 2 || f7 == fArr[i11]) {
                    iArgb = iArr3[i11];
                } else {
                    int i18 = 1;
                    while (true) {
                        if (i18 >= i4) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f2 = fArr[i18];
                        if (f2 >= f7 || i18 == i4 - 1) {
                            break;
                        }
                        i18++;
                    }
                    int i19 = i18 - 1;
                    float f9 = fArr[i19];
                    float f10 = (f7 - f9) / (f2 - f9);
                    int i20 = iArr3[i18];
                    int i21 = iArr3[i19];
                    iArgb = Color.argb((int) (f8 * 255.0f), MP0.f(f10, Color.red(i21), Color.red(i20)), MP0.f(f10, Color.green(i21), Color.green(i20)), MP0.f(f10, Color.blue(i21), Color.blue(i20)));
                }
                iArr2[i17] = iArgb;
            } else {
                int i22 = iArr3[iBinarySearch];
                if (size < 2 || f7 <= fArr2[i11]) {
                    iArgb2 = Color.argb((int) (fArr3[i11] * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                } else {
                    int i23 = 1;
                    while (true) {
                        if (i23 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f3 = fArr2[i23];
                        if (f3 >= f7 || i23 == size - 1) {
                            break;
                        }
                        i23++;
                    }
                    if (f3 <= f7) {
                        fD = fArr3[i23];
                    } else {
                        int i24 = i23 - 1;
                        float f11 = fArr2[i24];
                        fD = C7099v01.d(fArr3[i24], fArr3[i23], (f7 - f11) / (f3 - f11));
                    }
                    iArgb2 = Color.argb((int) (fD * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                }
                iArr2[i17] = iArgb2;
                i4 = i4;
            }
            i17++;
            i4 = i4;
        }
        return new C1147Hm0(fArrCopyOf, iArr2);
    }
}

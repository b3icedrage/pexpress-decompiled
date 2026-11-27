package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: Hm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1147Hm0 {
    public final float[] a;
    public final int[] b;

    public C1147Hm0(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final C1147Hm0 a(float[] fArr) {
        int iF;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iF = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iF = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iF = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iF = MP0.f((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iF;
        }
        return new C1147Hm0(fArr, iArr);
    }
}

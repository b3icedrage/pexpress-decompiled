package defpackage;

import com.google.android.gms.common.api.Api;
import java.security.SecureRandom;

/* JADX INFO: renamed from: Or0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1710Or0 {
    public final int a;
    public final int b;
    public final int[] c;
    public final int[] d;

    public C1710Or0(int[] iArr) {
        SecureRandom secureRandom = C6889u01.a;
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        this.a = Math.max(i, 1);
        int i3 = Integer.MIN_VALUE;
        for (int i4 : iArr) {
            if (i3 < i4) {
                i3 = i4;
            }
        }
        this.b = i3;
        int i5 = i3 + 1;
        int[] iArr2 = new int[i5];
        for (int i6 : iArr) {
            iArr2[i6] = iArr2[i6] + 1;
        }
        int i7 = this.b + 1;
        int[] iArr3 = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr3[i8] = -1;
        }
        iArr2[0] = 0;
        int[] iArr4 = new int[i7];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 1; i11 < i5; i11++) {
            i10 = (i10 + iArr2[i11 - 1]) << 1;
            iArr4[i11] = i10;
            i9 = (iArr2[i11] + i10) - 1;
            iArr3[i11] = i9;
        }
        Object[] objArr = {iArr4, Integer.valueOf(i9)};
        this.c = iArr3;
        int[] iArr5 = (int[]) objArr[0];
        int[] iArr6 = new int[((Integer) objArr[1]).intValue() + 1];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 != 0) {
                int i14 = iArr5[i13];
                iArr5[i13] = i14 + 1;
                iArr6[i14] = i12;
            }
        }
        this.d = iArr6;
    }

    public final int a(C1721Ov c1721Ov, int[] iArr) throws C1054Gh0 {
        for (int i = this.a; i <= this.b; i++) {
            int i2 = this.c[i];
            if (i2 >= 0) {
                int i3 = iArr[0];
                int i4 = i - 1;
                int i5 = 1;
                int i6 = 0;
                while (i4 >= 0) {
                    if (c1721Ov.c(i3 + i4)) {
                        i6 += i5;
                    }
                    i4--;
                    i5 *= 2;
                }
                if (i2 >= i6) {
                    int i7 = this.d[i6];
                    iArr[0] = iArr[0] + i;
                    return i7;
                }
            }
        }
        throw new C1054Gh0(String.format("[%s] Bad code at the bit index '%d'.", getClass().getSimpleName(), Integer.valueOf(iArr[0])));
    }
}

package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes3.dex */
public final class DW {
    public static void a(C1721Ov c1721Ov, C1721Ov c1721Ov2) throws C1054Gh0 {
        boolean zC;
        int[] iArr = {0};
        do {
            zC = c1721Ov.c(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int iF = c1721Ov.f(iArr, 2);
            if (iF == 0) {
                int i = ((iArr[0] + 7) & (-8)) / 8;
                int iB = ((c1721Ov.b(i + 1) & 255) * UserVerificationMethods.USER_VERIFY_HANDPRINT) + (c1721Ov.b(i) & 255);
                int i2 = i + 4;
                c1721Ov2.getClass();
                byte[] bArrArray = c1721Ov.a.array();
                int iCapacity = c1721Ov2.a.capacity();
                int i3 = c1721Ov2.b + iB;
                if (iCapacity < i3) {
                    c1721Ov2.a(i3 + UserVerificationMethods.USER_VERIFY_ALL);
                }
                c1721Ov2.a.put(bArrArray, i2, iB);
                c1721Ov2.b += iB;
                iArr[0] = (i2 + iB) * 8;
            } else if (iF == 1) {
                b(c1721Ov, iArr, c1721Ov2, C1827Qe0.e, C1749Pe0.e);
            } else {
                if (iF != 2) {
                    throw new C1054Gh0(String.format("[%s] Bad compression type '11' at the bit index '%d'.", DW.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                C1710Or0[] c1710Or0Arr = new C1710Or0[2];
                EW.c(c1721Ov, iArr, c1710Or0Arr);
                b(c1721Ov, iArr, c1721Ov2, c1710Or0Arr[0], c1710Or0Arr[1]);
            }
            if (c1721Ov.b <= iArr[0] / 8) {
                zC = true;
            }
        } while (!zC);
    }

    public static void b(C1721Ov c1721Ov, int[] iArr, C1721Ov c1721Ov2, C1710Or0 c1710Or0, C1710Or0 c1710Or1) throws C1054Gh0 {
        while (true) {
            int iA = c1710Or0.a(c1721Ov, iArr);
            if (iA == 256) {
                return;
            }
            if (iA < 0 || iA > 255) {
                int iD = EW.d(c1721Ov, iArr, iA);
                int iB = EW.b(c1721Ov, iArr, c1710Or1);
                int i = c1721Ov2.b;
                byte[] bArr = new byte[iD];
                int i2 = i - iB;
                int i3 = 0;
                int i4 = i2;
                while (i3 < iD) {
                    if (i <= i4) {
                        i4 = i2;
                    }
                    bArr[i3] = c1721Ov2.b(i4);
                    i3++;
                    i4++;
                }
                c1721Ov2.e(bArr);
            } else {
                c1721Ov2.d(iA);
            }
        }
    }
}

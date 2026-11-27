package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
public final class EW {
    public static final int[] a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[LOOP:1: B:19:0x004b->B:20:0x004d, LOOP_END] */
    public static void a(C1721Ov c1721Ov, int[] iArr, int[] iArr2, C1710Or0 c1710Or0) throws C1054Gh0 {
        int i;
        int iF;
        int iF2;
        int i2;
        int i3 = 0;
        while (i3 < iArr2.length) {
            int iA = c1710Or0.a(c1721Ov, iArr);
            if (iA < 0 || iA > 15) {
                switch (iA) {
                    case 16:
                        i = iArr2[i3 - 1];
                        iF = 3 + c1721Ov.f(iArr, 2);
                        for (i2 = 0; i2 < iF; i2++) {
                            iArr2[i3 + i2] = i;
                        }
                        i3 += iF - 1;
                        break;
                    case 17:
                        iF2 = c1721Ov.f(iArr, 3) + 3;
                        iF = iF2;
                        i = 0;
                        while (i2 < iF) {
                            iArr2[i3 + i2] = i;
                        }
                        i3 += iF - 1;
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        iF2 = c1721Ov.f(iArr, 7) + 11;
                        iF = iF2;
                        i = 0;
                        while (i2 < iF) {
                            iArr2[i3 + i2] = i;
                        }
                        i3 += iF - 1;
                        break;
                    default:
                        throw new C1054Gh0(String.format("[%s] Bad code length '%d' at the bit index '%d'.", EW.class.getSimpleName(), Integer.valueOf(iA), iArr));
                }
            } else {
                iArr2[i3] = iA;
            }
            i3++;
        }
    }

    public static int b(C1721Ov c1721Ov, int[] iArr, C1710Or0 c1710Or0) throws C1054Gh0 {
        int i;
        int iA = c1710Or0.a(c1721Ov, iArr);
        int i2 = 2;
        int i3 = 5;
        switch (iA) {
            case 0:
            case 1:
            case 2:
            case 3:
                return iA + 1;
            case 4:
                i2 = 1;
                return c1721Ov.f(iArr, i2) + i3;
            case 5:
                i2 = 1;
                i3 = 7;
                return c1721Ov.f(iArr, i2) + i3;
            case 6:
                i3 = 9;
                return c1721Ov.f(iArr, i2) + i3;
            case 7:
                i3 = 13;
                return c1721Ov.f(iArr, i2) + i3;
            case 8:
                i3 = 17;
                i2 = 3;
                return c1721Ov.f(iArr, i2) + i3;
            case 9:
                i3 = 25;
                i2 = 3;
                return c1721Ov.f(iArr, i2) + i3;
            case 10:
                i3 = 33;
                i2 = 4;
                return c1721Ov.f(iArr, i2) + i3;
            case 11:
                i3 = 49;
                i2 = 4;
                return c1721Ov.f(iArr, i2) + i3;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                i = 65;
                i2 = 5;
                i3 = i;
                return c1721Ov.f(iArr, i2) + i3;
            case 13:
                i = 97;
                i2 = 5;
                i3 = i;
                return c1721Ov.f(iArr, i2) + i3;
            case 14:
                i3 = 129;
                i2 = 6;
                return c1721Ov.f(iArr, i2) + i3;
            case 15:
                i3 = 193;
                i2 = 6;
                return c1721Ov.f(iArr, i2) + i3;
            case 16:
                i3 = 257;
                i2 = 7;
                return c1721Ov.f(iArr, i2) + i3;
            case 17:
                i3 = 385;
                i2 = 7;
                return c1721Ov.f(iArr, i2) + i3;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                i3 = 513;
                i2 = 8;
                return c1721Ov.f(iArr, i2) + i3;
            case 19:
                i3 = 769;
                i2 = 8;
                return c1721Ov.f(iArr, i2) + i3;
            case 20:
                i3 = 1025;
                i2 = 9;
                return c1721Ov.f(iArr, i2) + i3;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                i3 = 1537;
                i2 = 9;
                return c1721Ov.f(iArr, i2) + i3;
            case 22:
                i3 = 2049;
                i2 = 10;
                return c1721Ov.f(iArr, i2) + i3;
            case ConnectionResult.API_DISABLED /* 23 */:
                i3 = 3073;
                i2 = 10;
                return c1721Ov.f(iArr, i2) + i3;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                i3 = 4097;
                i2 = 11;
                return c1721Ov.f(iArr, i2) + i3;
            case 25:
                i3 = 6145;
                i2 = 11;
                return c1721Ov.f(iArr, i2) + i3;
            case 26:
                i3 = 8193;
                i2 = 12;
                return c1721Ov.f(iArr, i2) + i3;
            case 27:
                i3 = 12289;
                i2 = 12;
                return c1721Ov.f(iArr, i2) + i3;
            case 28:
                i3 = 16385;
                i2 = 13;
                return c1721Ov.f(iArr, i2) + i3;
            case 29:
                i3 = 24577;
                i2 = 13;
                return c1721Ov.f(iArr, i2) + i3;
            default:
                throw new C1054Gh0(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", EW.class.getSimpleName(), Integer.valueOf(iA), Integer.valueOf(iArr[0])));
        }
    }

    public static void c(C1721Ov c1721Ov, int[] iArr, C1710Or0[] c1710Or0Arr) throws C1054Gh0 {
        int iF = c1721Ov.f(iArr, 5) + 257;
        int iF2 = c1721Ov.f(iArr, 5) + 1;
        int iF3 = c1721Ov.f(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i = 0; i < iF3; i++) {
            iArr2[a[i]] = (byte) c1721Ov.f(iArr, 3);
        }
        C1710Or0 c1710Or0 = new C1710Or0(iArr2);
        int[] iArr3 = new int[iF];
        a(c1721Ov, iArr, iArr3, c1710Or0);
        C1710Or0 c1710Or1 = new C1710Or0(iArr3);
        int[] iArr4 = new int[iF2];
        a(c1721Ov, iArr, iArr4, c1710Or0);
        C1710Or0 c1710Or2 = new C1710Or0(iArr4);
        c1710Or0Arr[0] = c1710Or1;
        c1710Or0Arr[1] = c1710Or2;
    }

    public static int d(C1721Ov c1721Ov, int[] iArr, int i) throws C1054Gh0 {
        int i2;
        int i3 = 1;
        switch (i) {
            case 257:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
                return i - 254;
            case 265:
                i2 = 11;
                return c1721Ov.f(iArr, i3) + i2;
            case 266:
                i2 = 13;
                return c1721Ov.f(iArr, i3) + i2;
            case 267:
                i2 = 15;
                return c1721Ov.f(iArr, i3) + i2;
            case 268:
                i2 = 17;
                return c1721Ov.f(iArr, i3) + i2;
            case 269:
                i2 = 19;
                i3 = 2;
                return c1721Ov.f(iArr, i3) + i2;
            case 270:
                i2 = 23;
                i3 = 2;
                return c1721Ov.f(iArr, i3) + i2;
            case 271:
                i2 = 27;
                i3 = 2;
                return c1721Ov.f(iArr, i3) + i2;
            case 272:
                i2 = 31;
                i3 = 2;
                return c1721Ov.f(iArr, i3) + i2;
            case 273:
                i2 = 35;
                i3 = 3;
                return c1721Ov.f(iArr, i3) + i2;
            case 274:
                i2 = 43;
                i3 = 3;
                return c1721Ov.f(iArr, i3) + i2;
            case 275:
                i2 = 51;
                i3 = 3;
                return c1721Ov.f(iArr, i3) + i2;
            case 276:
                i2 = 59;
                i3 = 3;
                return c1721Ov.f(iArr, i3) + i2;
            case 277:
                i2 = 67;
                i3 = 4;
                return c1721Ov.f(iArr, i3) + i2;
            case 278:
                i2 = 83;
                i3 = 4;
                return c1721Ov.f(iArr, i3) + i2;
            case 279:
                i2 = 99;
                i3 = 4;
                return c1721Ov.f(iArr, i3) + i2;
            case 280:
                i2 = 115;
                i3 = 4;
                return c1721Ov.f(iArr, i3) + i2;
            case 281:
                i2 = 131;
                i3 = 5;
                return c1721Ov.f(iArr, i3) + i2;
            case 282:
                i2 = 163;
                i3 = 5;
                return c1721Ov.f(iArr, i3) + i2;
            case 283:
                i2 = 195;
                i3 = 5;
                return c1721Ov.f(iArr, i3) + i2;
            case 284:
                i2 = 227;
                i3 = 5;
                return c1721Ov.f(iArr, i3) + i2;
            case 285:
                return 258;
            default:
                throw new C1054Gh0(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", EW.class.getSimpleName(), Integer.valueOf(i), Integer.valueOf(iArr[0])));
        }
    }
}

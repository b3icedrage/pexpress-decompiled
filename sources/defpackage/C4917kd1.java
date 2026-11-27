package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: renamed from: kd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4917kd1 extends AbstractC4707jd1 {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public C1721Ov d;

    public C4917kd1() {
        super("permessage-deflate");
        this.c = 32768;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    public static byte[] c(byte[] bArr) throws C1054Gh0 {
        boolean zC;
        boolean z;
        int i;
        int i2;
        C1721Ov c1721Ov = new C1721Ov(bArr.length + 1);
        c1721Ov.e(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            zC = c1721Ov.c(iArr[0]);
            int i3 = iArr[0];
            iArr[0] = i3 + 1;
            if (zC) {
                int i4 = i3 / 8;
                c1721Ov.a.put(i4, (byte) ((~(1 << (i3 % 8))) & c1721Ov.b(i4)));
            }
            int iF = c1721Ov.f(iArr, 2);
            if (iF == 0) {
                int i5 = ((iArr[0] + 7) & (-8)) / 8;
                int iB = ((255 & c1721Ov.b(i5 + 1)) * UserVerificationMethods.USER_VERIFY_HANDPRINT) + (c1721Ov.b(i5) & 255);
                iArr[0] = (i5 + 4 + iB) * 8;
                if (iB == 0) {
                    z = true;
                }
                i = c1721Ov.b;
                i2 = iArr[0];
                if (i <= i2 / 8) {
                    zC = true;
                }
                if (!zC && z) {
                    zArr[0] = true;
                }
            } else if (iF == 1) {
                C1827Qe0 c1827Qe0 = C1827Qe0.e;
                C1749Pe0 c1749Pe0 = C1749Pe0.e;
                while (true) {
                    int iA = c1827Qe0.a(c1721Ov, iArr);
                    if (iA == 256) {
                        break;
                    }
                    if (iA < 0 || iA > 255) {
                        EW.d(c1721Ov, iArr, iA);
                        EW.b(c1721Ov, iArr, c1749Pe0);
                    }
                }
            } else {
                if (iF != 2) {
                    throw new C1054Gh0(String.format("[%s] Bad compression type '11' at the bit index '%d'.", C4917kd1.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                C1710Or0[] c1710Or0Arr = new C1710Or0[2];
                EW.c(c1721Ov, iArr, c1710Or0Arr);
                C1710Or0 c1710Or0 = c1710Or0Arr[0];
                C1710Or0 c1710Or1 = c1710Or0Arr[1];
                while (true) {
                    int iA2 = c1710Or0.a(c1721Ov, iArr);
                    if (iA2 == 256) {
                        break;
                    }
                    if (iA2 < 0 || iA2 > 255) {
                        EW.d(c1721Ov, iArr, iA2);
                        EW.b(c1721Ov, iArr, c1710Or1);
                    }
                }
            }
            z = false;
            i = c1721Ov.b;
            i2 = iArr[0];
            if (i <= i2 / 8) {
                zC = true;
            }
            if (!zC) {
            }
        } while (!zC);
        if (zArr[0]) {
            return c1721Ov.g(0, ((i2 - 1) / 8) - 3);
        }
        int i6 = i2 % 8;
        if (i6 == 0 || i6 == 6 || i6 == 7) {
            c1721Ov.d(0);
        }
        int i7 = iArr[0];
        iArr[0] = i7 + 3;
        return c1721Ov.g(0, ((i7 + 2) / 8) + 1);
    }

    @Override // defpackage.AbstractC4707jd1
    public final byte[] a(byte[] bArr) throws C6193qg2 {
        int i = this.c;
        if (i != 32768 && bArr.length >= i) {
            return bArr;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Deflater deflater = new Deflater(-1, true);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr, 0, bArr.length);
            deflaterOutputStream.close();
            deflater.end();
            return c(byteArrayOutputStream.toByteArray());
        } catch (Exception e2) {
            throw new C6193qg2(EnumC5773og2.Q, C5491nL.c("Failed to compress the message: ", e2.getMessage()), e2);
        }
    }

    @Override // defpackage.AbstractC4707jd1
    public final byte[] b(byte[] bArr) throws C6193qg2 {
        C1721Ov c1721Ov = new C1721Ov(bArr.length + 4);
        c1721Ov.e(bArr);
        c1721Ov.e(e);
        if (this.d == null) {
            this.d = new C1721Ov(0);
        }
        C1721Ov c1721Ov2 = this.d;
        int i = c1721Ov2.b;
        try {
            DW.a(c1721Ov, c1721Ov2);
            C1721Ov c1721Ov3 = this.d;
            byte[] bArrG = c1721Ov3.g(i, c1721Ov3.b);
            C1721Ov c1721Ov4 = this.d;
            if (c1721Ov4.a.capacity() > 0) {
                int i2 = c1721Ov4.b;
                byte[] bArrG2 = c1721Ov4.g(i2, i2);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrG2);
                c1721Ov4.a = byteBufferWrap;
                byteBufferWrap.position(bArrG2.length);
                c1721Ov4.b = bArrG2.length;
            }
            return bArrG;
        } catch (Exception e2) {
            throw new C6193qg2(EnumC5773og2.R, C5491nL.c("Failed to decompress the message: ", e2.getMessage()), e2);
        }
    }
}

package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Ag2 extends BufferedOutputStream {
    public final void c(C6822tg2 c6822tg2) throws IOException {
        byte[] bArr;
        write((c6822tg2.a ? 128 : 0) | (c6822tg2.b ? 64 : 0) | (c6822tg2.c ? 32 : 0) | (c6822tg2.d ? 16 : 0) | (c6822tg2.e & 15));
        byte[] bArr2 = c6822tg2.g;
        int length = bArr2 == null ? 0 : bArr2.length;
        write(length <= 125 ? length | UserVerificationMethods.USER_VERIFY_PATTERN : length <= 65535 ? 254 : 255);
        byte[] bArr3 = c6822tg2.g;
        int length2 = bArr3 == null ? 0 : bArr3.length;
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & 255), (byte) (length2 & 255)};
            } else {
                bArr = new byte[8];
                for (int i = 7; i >= 0; i--) {
                    bArr[i] = (byte) (length2 & 255);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        C6889u01.a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = c6822tg2.g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i2 = 0; i2 < bArr5.length; i2++) {
            bArr6[i2] = (byte) ((bArr5[i2] ^ bArr4[i2 % 4]) & 255);
        }
        write(bArr6);
    }
}

package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: ug2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7032ug2 extends FilterInputStream {
    public C7032ug2(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    public final void c(int i, byte[] bArr) throws C6721tB0, IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 <= 0) {
                throw new C6721tB0(i2);
            }
            i2 += i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4 A[LOOP:0: B:51:0x00c2->B:52:0x00c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final C6822tg2 f() throws IOException, C6193qg2 {
        int i;
        byte b;
        byte[] bArr;
        byte[] bArr2;
        int i2;
        byte[] bArr3;
        byte[] bArr4 = new byte[8];
        try {
            c(2, bArr4);
            byte b2 = bArr4[0];
            boolean z = (b2 & 128) != 0;
            boolean z2 = (b2 & 64) != 0;
            boolean z3 = (b2 & 32) != 0;
            boolean z4 = (b2 & 16) != 0;
            int i3 = b2 & 15;
            byte b3 = bArr4[1];
            boolean z5 = (b3 & 128) != 0;
            long j = b3 & 127;
            if (j != 126) {
                if (j == 127) {
                    c(8, bArr4);
                    byte b4 = bArr4[0];
                    if ((b4 & 128) != 0) {
                        throw new C6193qg2(EnumC5773og2.y, "The payload length of a frame is invalid.");
                    }
                    i = ((bArr4[6] & 255) << 8) | ((bArr4[2] & 255) << 40) | ((bArr4[1] & 255) << 48) | ((b4 & 255) << 56) | ((bArr4[3] & 255) << 32) | ((bArr4[4] & 255) << 24) | ((bArr4[5] & 255) << 16);
                    b = bArr4[7];
                }
                bArr = null;
                if (z5) {
                    bArr2 = new byte[4];
                    c(4, bArr2);
                } else {
                    bArr2 = null;
                }
                if (2147483647L >= j) {
                    try {
                        skip(j);
                    } catch (IOException unused) {
                    }
                    throw new C6193qg2(EnumC5773og2.z, "The payload length of a frame exceeds the maximum array size in Java.");
                }
                if (j != 0) {
                    i2 = (int) j;
                    try {
                        bArr3 = new byte[i2];
                        c(i2, bArr3);
                        if (z5 && bArr2 != null && bArr2.length >= 4) {
                            for (int i4 = 0; i4 < i2; i4++) {
                                bArr3[i4] = (byte) (bArr3[i4] ^ bArr2[i4 % 4]);
                            }
                        }
                        bArr = bArr3;
                    } catch (OutOfMemoryError e) {
                        try {
                            skip(j);
                        } catch (IOException unused2) {
                        }
                        throw new C6193qg2(EnumC5773og2.A, "OutOfMemoryError occurred during a trial to allocate a memory area for a frame's payload: " + e.getMessage(), e);
                    }
                }
                C6822tg2 c6822tg2 = new C6822tg2();
                c6822tg2.a = z;
                c6822tg2.b = z2;
                c6822tg2.c = z3;
                c6822tg2.d = z4;
                c6822tg2.e = i3;
                c6822tg2.f = z5;
                c6822tg2.d(bArr);
                return c6822tg2;
            }
            c(2, bArr4);
            i = (bArr4[0] & 255) << 8;
            b = bArr4[1];
            j = i | (b & 255);
            bArr = null;
            if (z5) {
                bArr2 = new byte[4];
                c(4, bArr2);
            } else {
                bArr2 = null;
            }
            if (2147483647L >= j) {
                skip(j);
                throw new C6193qg2(EnumC5773og2.z, "The payload length of a frame exceeds the maximum array size in Java.");
            }
            if (j != 0) {
                i2 = (int) j;
                bArr3 = new byte[i2];
                c(i2, bArr3);
                if (z5) {
                    while (i4 < i2) {
                        bArr3[i4] = (byte) (bArr3[i4] ^ bArr2[i4 % 4]);
                    }
                }
                bArr = bArr3;
            }
            C6822tg2 c6822tg3 = new C6822tg2();
            c6822tg3.a = z;
            c6822tg3.b = z2;
            c6822tg3.c = z3;
            c6822tg3.d = z4;
            c6822tg3.e = i3;
            c6822tg3.f = z5;
            c6822tg3.d(bArr);
            return c6822tg3;
        } catch (C6721tB0 e2) {
            if (e2.e == 0) {
                throw new T41(EnumC5773og2.U, "No more WebSocket frame from the server.");
            }
            throw e2;
        }
    }
}

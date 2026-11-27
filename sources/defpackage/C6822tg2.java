package defpackage;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/* JADX INFO: renamed from: tg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6822tg2 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public byte[] g;

    public static C6822tg2 a(int i, String str) {
        C6822tg2 c6822tg2 = new C6822tg2();
        c6822tg2.a = true;
        c6822tg2.e = 8;
        byte[] bArr = {(byte) ((i >> 8) & 255), (byte) (i & 255)};
        if (str == null || str.length() == 0) {
            c6822tg2.d(bArr);
            return c6822tg2;
        }
        byte[] bArrA = C6889u01.a(str);
        byte[] bArr2 = new byte[bArrA.length + 2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(bArrA, 0, bArr2, 2, bArrA.length);
        c6822tg2.d(bArr2);
        return c6822tg2;
    }

    public final int b() {
        byte[] bArr = this.g;
        if (bArr == null || bArr.length < 2) {
            return 1005;
        }
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public final String c() {
        byte[] bArr = this.g;
        if (bArr != null && bArr.length >= 3) {
            int length = bArr.length - 2;
            SecureRandom secureRandom = C6889u01.a;
            try {
                return new String(bArr, 2, length, "UTF-8");
            } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
            }
        }
        return null;
    }

    public final void d(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.g = bArr;
    }

    public final String toString() {
        String str;
        StringBuilder sbF = C1039Gc0.f("WebSocketFrame(FIN=");
        sbF.append(this.a ? "1" : "0");
        sbF.append(",RSV1=");
        sbF.append(this.b ? "1" : "0");
        sbF.append(",RSV2=");
        sbF.append(this.c ? "1" : "0");
        sbF.append(",RSV3=");
        sbF.append(this.d ? "1" : "0");
        sbF.append(",Opcode=");
        int i = this.e;
        SecureRandom secureRandom = C6889u01.a;
        if (i == 0) {
            str = "CONTINUATION";
        } else if (i == 1) {
            str = "TEXT";
        } else if (i != 2) {
            switch (i) {
                case 8:
                    str = "CLOSE";
                    break;
                case 9:
                    str = "PING";
                    break;
                case 10:
                    str = "PONG";
                    break;
                default:
                    if (1 <= i && i <= 7) {
                        str = String.format("DATA(0x%X)", Integer.valueOf(i));
                    } else if (8 <= i && i <= 15) {
                        str = String.format("CONTROL(0x%X)", Integer.valueOf(i));
                    } else {
                        str = String.format("0x%X", Integer.valueOf(i));
                    }
                    break;
            }
        } else {
            str = "BINARY";
        }
        sbF.append(str);
        sbF.append(",Length=");
        byte[] bArr = this.g;
        int i2 = 0;
        sbF.append(bArr == null ? 0 : bArr.length);
        int i3 = this.e;
        if (i3 == 1) {
            sbF.append(",Payload=");
            if (this.g == null) {
                sbF.append("null");
            } else if (this.b) {
                sbF.append("compressed");
            } else {
                sbF.append("\"");
                byte[] bArr2 = this.g;
                String str2 = null;
                if (bArr2 != null) {
                    try {
                        str2 = new String(bArr2, 0, bArr2.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                    }
                }
                sbF.append(str2);
                sbF.append("\"");
            }
        } else if (i3 == 2) {
            sbF.append(",Payload=");
            if (this.g == null) {
                sbF.append("null");
            } else if (this.b) {
                sbF.append("compressed");
            } else {
                while (true) {
                    byte[] bArr3 = this.g;
                    if (i2 < bArr3.length) {
                        sbF.append(String.format("%02X ", Integer.valueOf(bArr3[i2] & 255)));
                        i2++;
                    } else if (bArr3.length != 0) {
                        sbF.setLength(sbF.length() - 1);
                    }
                }
            }
        } else if (i3 == 8) {
            sbF.append(",CloseCode=");
            sbF.append(b());
            sbF.append(",Reason=");
            String strC = c();
            if (strC == null) {
                sbF.append("null");
            } else {
                sbF.append("\"");
                sbF.append(strC);
                sbF.append("\"");
            }
        }
        sbF.append(")");
        return sbF.toString();
    }
}

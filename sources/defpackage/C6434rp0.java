package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6434rp0 {

    @NotNull
    public static final C6434rp0 a = new C6434rp0();

    @NotNull
    public static final C1802Pw b;

    @NotNull
    public static final String[] c;

    @NotNull
    public static final String[] d;

    @NotNull
    public static final String[] e;

    static {
        C1802Pw c1802Pw = C1802Pw.h;
        b = C1802Pw.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        d = new String[64];
        String[] strArr = new String[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i] = d.l(C6806tc2.j("%8s", binaryString), ' ', '0');
        }
        e = strArr;
        String[] strArr2 = d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = C5807oq.b(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = d;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = C5807oq.b(sb, strArr3[i4], "|PADDED");
        }
        int length = d.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = d;
            if (strArr4[i7] == null) {
                strArr4[i7] = e[i7];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    @NotNull
    public static String a(boolean z, int i, int i2, int i3, int i4) {
        String strM;
        String str;
        String[] strArr = c;
        String strJ = i3 < strArr.length ? strArr[i3] : C6806tc2.j("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strM = "";
        } else {
            String[] strArr2 = e;
            if (i3 == 2 || i3 == 3) {
                strM = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strM = strArr2[i4];
            } else {
                String[] strArr3 = d;
                if (i4 < strArr3.length) {
                    str = strArr3[i4];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = strArr2[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strM = (i3 != 0 || (i4 & 32) == 0) ? str : d.m(str, "PRIORITY", "COMPRESSED");
                } else {
                    strM = d.m(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return C6806tc2.j("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strJ, strM);
    }
}

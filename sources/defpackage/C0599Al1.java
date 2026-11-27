package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: renamed from: Al1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0599Al1 {
    public static final void a(C2291Wb1 c2291Wb1, String str, int i, int i2, int i3) {
        if (i2 == -1) {
            int iC = c(i, i3, str);
            int iB = b(iC, i3, str);
            if (iB > iC) {
                String strSubstring = str.substring(iC, iB);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                c2291Wb1.b(strSubstring, C5653o60.d);
                return;
            }
            return;
        }
        int iC2 = c(i, i2, str);
        int iB2 = b(iC2, i2, str);
        if (iB2 > iC2) {
            String strSubstring2 = str.substring(iC2, iB2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int iC3 = c(i2 + 1, i3, str);
            String strSubstring3 = str.substring(iC3, b(iC3, i3, str));
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            c2291Wb1.d(strSubstring2, strSubstring3);
        }
    }

    public static final int b(int i, int i2, String str) {
        while (i2 > i && CharsKt.c(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static final int c(int i, int i2, String str) {
        while (i < i2 && CharsKt.c(str.charAt(i))) {
            i++;
        }
        return i;
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5777oh2 {
    public static final boolean a(@Nullable String str) {
        String str2;
        if (str == null || StringsKt.I(str)) {
            return false;
        }
        if (d.j(0, 0, 3, str, "ws:", true)) {
            String strSubstring = str.substring(3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            str2 = "http:" + strSubstring;
        } else if (d.j(0, 0, 4, str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            str2 = "https:" + strSubstring2;
        } else {
            str2 = str;
        }
        Intrinsics.checkNotNullParameter(str2, "<this>");
        C1318Jr0 c1318Jr0A = null;
        try {
            Intrinsics.checkNotNullParameter(str2, "<this>");
            C1318Jr0.a aVar = new C1318Jr0.a();
            aVar.e(null, str2);
            c1318Jr0A = aVar.a();
        } catch (IllegalArgumentException unused) {
        }
        return c1318Jr0A != null;
    }
}

package defpackage;

import android.os.Build;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: b82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2884b82 {
    public static String a(String str) throws UnsupportedEncodingException {
        Charset charSet = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charSet, "charSet");
        if (Build.VERSION.SDK_INT >= 33) {
            String strEncode = URLEncoder.encode(str, charSet);
            Intrinsics.checkNotNull(strEncode);
            return strEncode;
        }
        String strEncode2 = URLEncoder.encode(str, charSet.name());
        Intrinsics.checkNotNull(strEncode2);
        return strEncode2;
    }
}

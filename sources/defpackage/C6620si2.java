package defpackage;

import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: si2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6620si2 {

    @NotNull
    public static final Set<String> a;

    @NotNull
    public static final Set<String> b;

    static {
        String[] elements = {"http", "https"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = C1526Mj.H(elements);
        String[] elements2 = {"about", "chrome", "chrome-error", "data", "blob", "filesystem", "javascript", "file", "content"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        b = C1526Mj.H(elements2);
    }

    public static boolean a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strB = b(url);
        return strB == null || a.contains(strB) || b.contains(strB);
    }

    @Nullable
    public static String b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        int iF = StringsKt.F(':', 0, 6, url);
        if (iF > 0) {
            String strSubstring = url.substring(0, iF);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            char cZ = KS1.z(strSubstring);
            if (('a' > cZ || cZ >= '{') && ('A' > cZ || cZ >= '[')) {
                return null;
            }
            for (int i = 0; i < strSubstring.length(); i++) {
                char cCharAt = strSubstring.charAt(i);
                if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || Character.isDigit(cCharAt) || StringsKt.D("+-.", cCharAt))) {
                }
            }
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        return null;
    }
}

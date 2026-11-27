package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4120h30 {

    @NotNull
    public static final Regex a;

    @NotNull
    public static final Regex b;

    @NotNull
    public static final Regex c;

    static {
        EnumC4537iq1 enumC4537iq1 = EnumC4537iq1.IGNORE_CASE;
        a = new Regex("filename\\*\\s*=\\s*([^';\\s]+)'[^']*'([^;\\s]+)", enumC4537iq1);
        b = new Regex("filename\\s*=\\s*\"([^\"]*)\"", enumC4537iq1);
        c = new Regex("filename\\s*=\\s*([^;\\s\"]+)", enumC4537iq1);
    }

    @Nullable
    public static String a(@NotNull String header) throws IOException {
        List<String> listA;
        Object objA;
        Intrinsics.checkNotNullParameter(header, "header");
        C6367rX0 match = Regex.b(a, header);
        if (match != null) {
            Intrinsics.checkNotNullParameter(match, "match");
            String str = (String) ((C6367rX0.a) match.a()).get(1);
            String str2 = (String) ((C6367rX0.a) match.a()).get(2);
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                objA = Charset.forName(str);
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            if (objA instanceof C1717Ot1.b) {
                objA = null;
            }
            Charset charset = (Charset) objA;
            byte[] bArrM = C3057c.m(str2);
            if (charset != null && bArrM != null) {
                return new String(bArrM, charset);
            }
        }
        C6367rX0 c6367rX0B = Regex.b(b, header);
        if (c6367rX0B == null) {
            c6367rX0B = Regex.b(c, header);
        }
        if (c6367rX0B == null || (listA = c6367rX0B.a()) == null) {
            return null;
        }
        return (String) ((C6367rX0.a) listA).get(1);
    }

    public static String b(String str) {
        String strW;
        String strW2;
        if (str == null || (strW = StringsKt.W('/', str, str)) == null || (strW2 = StringsKt.W('\\', strW, strW)) == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        strW2.codePoints().forEach(new IntConsumer() { // from class: g30
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                byte type = (byte) Character.getType(i);
                if (Character.isISOControl(i) || type == 16 || type == 13 || type == 14) {
                    return;
                }
                for (int i2 = 0; i2 < 7; i2++) {
                    if (":*?\"<>|".charAt(i2) == i) {
                        return;
                    }
                }
                sb.appendCodePoint(i);
            }
        });
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string == null) {
            return null;
        }
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = string.charAt(!z ? i : length);
            boolean z2 = CharsKt.c(cCharAt) || cCharAt == '.';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string2 = string.subSequence(i, length + 1).toString();
        if (string2 == null || string2.length() <= 0) {
            return null;
        }
        return string2;
    }
}

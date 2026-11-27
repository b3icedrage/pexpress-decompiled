package kotlin.text;

import defpackage.C1332Jw;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/c"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class CharsKt extends c {
    private CharsKt() {
    }

    @NotNull
    public static a b(char c) {
        a.C0432a c0432a = a.d;
        int type = Character.getType(c);
        c0432a.getClass();
        if (type >= 0 && type < 17) {
            return (a) a.g.get(type);
        }
        if (18 > type || type >= 31) {
            throw new IllegalArgumentException(C1332Jw.a(type, "Category #", " is not defined."));
        }
        return (a) a.g.get(type - 1);
    }

    public static boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class II0 {

    @NotNull
    public static final II0 a = new II0();

    @NotNull
    public static HI0 a(@NotNull String representation) {
        DI0 di0;
        Intrinsics.checkNotNullParameter(representation, "representation");
        representation.getClass();
        char cCharAt = representation.charAt(0);
        DI0[] di0ArrValues = DI0.values();
        int length = di0ArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                di0 = null;
                break;
            }
            di0 = di0ArrValues[i];
            if (di0.f().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (di0 != null) {
            return new HI0.c(di0);
        }
        if (cCharAt == 'V') {
            return new HI0.c(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return new HI0.a(a(strSubstring));
        }
        if (cCharAt == 'L') {
            Intrinsics.checkNotNullParameter(representation, "<this>");
            if (representation.length() > 0) {
                c.a(representation.charAt(StringsKt.E(representation)), ';', false);
            }
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return new HI0.b(strSubstring2);
    }

    @NotNull
    public static String c(@NotNull HI0 type) {
        String strF;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof HI0.a) {
            return "[" + c(((HI0.a) type).i);
        }
        if (type instanceof HI0.c) {
            DI0 di0 = ((HI0.c) type).i;
            return (di0 == null || (strF = di0.f()) == null) ? "V" : strF;
        }
        if (type instanceof HI0.b) {
            return C1039Gc0.e(new StringBuilder("L"), ((HI0.b) type).i, ';');
        }
        throw new C6489s51();
    }

    public final HI0.b b(String internalName) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        return new HI0.b(internalName);
    }
}

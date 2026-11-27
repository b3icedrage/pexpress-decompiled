package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: a42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2644a42 {
    public static final EnumC2644a42 g;
    public static final EnumC2644a42 h;
    public static final EnumC2644a42 i;
    public static final EnumC2644a42 j;
    public static final EnumC2644a42 k;
    public static final /* synthetic */ EnumC2644a42[] l;
    public static final /* synthetic */ C4814k70 m;
    public final int d;

    @NotNull
    public final EnumC2868b42 e;

    static {
        EnumC2868b42 enumC2868b42 = EnumC2868b42.e;
        EnumC2644a42 enumC2644a42 = new EnumC2644a42("FIXED", 0, 3, enumC2868b42);
        g = enumC2644a42;
        EnumC2644a42 enumC2644a43 = new EnumC2644a42("CONSERVATIVE", 1, 2, enumC2868b42);
        h = enumC2644a43;
        EnumC2644a42 enumC2644a44 = new EnumC2644a42("OPTIMAL", 2, 0, enumC2868b42);
        i = enumC2644a44;
        EnumC2644a42 enumC2644a45 = new EnumC2644a42("AGGRESSIVE", 3, 1, EnumC2868b42.d);
        j = enumC2644a45;
        EnumC2644a42 enumC2644a46 = new EnumC2644a42("WITHOUT", 4, 4, enumC2868b42);
        k = enumC2644a46;
        EnumC2644a42[] enumC2644a42Arr = {enumC2644a42, enumC2644a43, enumC2644a44, enumC2644a45, enumC2644a46};
        l = enumC2644a42Arr;
        m = C1952Ru.i(enumC2644a42Arr);
    }

    public EnumC2644a42(String str, int i2, int i3, EnumC2868b42 enumC2868b42) {
        super(str, i2);
        this.d = i3;
        this.e = enumC2868b42;
    }

    public static EnumC2644a42 valueOf(String str) {
        return (EnumC2644a42) Enum.valueOf(EnumC2644a42.class, str);
    }

    public static EnumC2644a42[] values() {
        return (EnumC2644a42[]) l.clone();
    }

    @NotNull
    public final String b() {
        String string = toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(lowerCase.charAt(0));
        Intrinsics.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        sb.append((Object) upperCase);
        String strSubstring = lowerCase.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }
}

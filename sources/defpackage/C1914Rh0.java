package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Rh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1914Rh0 {
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    @NotNull
    public static final C1758Ph0 a(@NotNull C1758Ph0 c1758Ph0, @NotNull C1758Ph0 packageName) {
        Intrinsics.checkNotNullParameter(c1758Ph0, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "prefix");
        Intrinsics.checkNotNullParameter(c1758Ph0, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!Intrinsics.a(c1758Ph0, packageName) && !packageName.d()) {
            String strB = c1758Ph0.b();
            Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
            String strB2 = packageName.b();
            Intrinsics.checkNotNullExpressionValue(strB2, "asString(...)");
            if (d.o(strB, strB2, false) && strB.charAt(strB2.length()) == '.') {
                if (!packageName.d()) {
                    if (c1758Ph0.equals(packageName)) {
                        C1758Ph0 ROOT = C1758Ph0.c;
                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                        return ROOT;
                    }
                    String strB3 = c1758Ph0.b();
                    Intrinsics.checkNotNullExpressionValue(strB3, "asString(...)");
                    String strSubstring = strB3.substring(packageName.b().length() + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    return new C1758Ph0(strSubstring);
                }
            }
        } else if (!packageName.d()) {
            if (c1758Ph0.equals(packageName)) {
                C1758Ph0 ROOT2 = C1758Ph0.c;
                Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
                return ROOT2;
            }
            String strB4 = c1758Ph0.b();
            Intrinsics.checkNotNullExpressionValue(strB4, "asString(...)");
            String strSubstring2 = strB4.substring(packageName.b().length() + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return new C1758Ph0(strSubstring2);
        }
        return c1758Ph0;
    }
}

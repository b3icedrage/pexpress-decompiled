package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3123cI0 {

    @NotNull
    public static final C1758Ph0 a;

    @NotNull
    public static final QC b;

    static {
        C1758Ph0 c1758Ph0 = new C1758Ph0("kotlin.jvm.JvmField");
        a = c1758Ph0;
        QC.a.b(c1758Ph0);
        QC.a.b(new C1758Ph0("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = QC.a.a("kotlin/jvm/internal/RepeatableContainer", false);
    }

    @NotNull
    public static final String a(@NotNull String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (c(propertyName)) {
            return propertyName;
        }
        return "get" + C3686f.g(propertyName);
    }

    @NotNull
    public static final String b(@NotNull String propertyName) {
        String strG;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        StringBuilder sb = new StringBuilder("set");
        if (c(propertyName)) {
            strG = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(strG, "substring(...)");
        } else {
            strG = C3686f.g(propertyName);
        }
        sb.append(strG);
        return sb.toString();
    }

    public static final boolean c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (d.o(name, "is", false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (Intrinsics.e(97, cCharAt) > 0 || Intrinsics.e(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}

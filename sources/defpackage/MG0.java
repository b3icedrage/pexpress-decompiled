package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MG0 {

    @NotNull
    public static final C6508sA0 a;

    static {
        C1173Hv.d(C4881kS1.a);
        a = C0957Fb.b(C6144qS1.a, "kotlinx.serialization.json.JsonUnquotedLiteral");
    }

    public static final int a(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            long jI = new C5304mS1(jsonPrimitive.b()).i();
            if (-2147483648L <= jI && jI <= 2147483647L) {
                return (int) jI;
            }
            throw new NumberFormatException(jsonPrimitive.b() + " is not an Int");
        } catch (IG0 e) {
            throw new NumberFormatException(e.getMessage());
        }
    }
}

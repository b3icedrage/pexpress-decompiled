package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7683xl2 {

    @NotNull
    public static final KW1 a = XO0.b(new Qh2(1));

    @Nullable
    public static InterfaceC6396rf0<? extends JsonElement> b;

    @NotNull
    public static final C4046gh2 c;

    static {
        Gson gsonA = a();
        Intrinsics.checkNotNullExpressionValue(gsonA, "<get-gson>(...)");
        c = new C4046gh2(gsonA);
    }

    public static final Gson a() {
        return (Gson) a.getValue();
    }

    @NotNull
    public static final C3735fC1 b(@Nullable String str, @NotNull TypeToken typeToken, @NotNull InterfaceC6396rf0 messages) {
        Intrinsics.checkNotNullParameter(typeToken, "typeToken");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Type type = typeToken.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        d(type);
        return new C3735fC1(new C6842tl2(new C6632sl2(new C6422rl2(new C4250hg0(new C4928kg0(null, messages, new C7473wl2(3, null)), 0), str)), null, str, typeToken));
    }

    @NotNull
    public static final C3735fC1 c(@NotNull TypeToken typeToken, @NotNull TypeToken elementTypeToken, @Nullable String str, @NotNull C3098cA messages) {
        Intrinsics.checkNotNullParameter(typeToken, "typeToken");
        Intrinsics.checkNotNullParameter(elementTypeToken, "elementTypeToken");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Type type = typeToken.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        d(type);
        return new C3735fC1(new C7262vl2(new C7052ul2(new C6422rl2(new C4250hg0(new C4928kg0(null, messages, new C7473wl2(3, null)), 0), str)), null, typeToken, elementTypeToken, str));
    }

    public static final String d(Type type) {
        String string = type.toString();
        for (int iE = StringsKt.E(string); -1 < iE; iE--) {
            if (string.charAt(iE) == '.') {
                String strSubstring = string.substring(iE + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return string;
    }
}

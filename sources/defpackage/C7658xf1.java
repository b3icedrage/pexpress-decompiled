package defpackage;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7658xf1 {
    @NotNull
    public static final String a(@NotNull AbstractC5267mG0 json, @NotNull MH1 mh1) {
        Intrinsics.checkNotNullParameter(mh1, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : mh1.k()) {
            if (annotation instanceof InterfaceC7366wG0) {
                return ((InterfaceC7366wG0) annotation).discriminator();
            }
        }
        return json.a.g;
    }

    public static final <T> T b(@NotNull GG0 gg0, @NotNull RJ0 deserializer) {
        Intrinsics.checkNotNullParameter(gg0, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof T0)) {
            return (T) deserializer.d(gg0);
        }
        C7577xG0 c7577xG0 = gg0.x().a;
        C8078zf1 c8078zf1 = (C8078zf1) deserializer;
        String discriminator = a(gg0.x(), c8078zf1.c());
        JsonElement jsonElementL = gg0.l();
        MH1 mh1C = c8078zf1.c();
        if (!(jsonElementL instanceof JsonObject)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C2251Vp1 c2251Vp1 = C2017Sp1.a;
            sb.append(c2251Vp1.b(JsonObject.class));
            sb.append(" as the serialized body of ");
            sb.append(mh1C.a());
            sb.append(", but had ");
            sb.append(c2251Vp1.b(jsonElementL.getClass()));
            throw C1874Qu.d(-1, sb.toString());
        }
        JsonObject element = (JsonObject) jsonElementL;
        JsonElement jsonElement = (JsonElement) element.get(discriminator);
        String strB = null;
        if (jsonElement != null) {
            C6508sA0 c6508sA0 = MG0.a;
            Intrinsics.checkNotNullParameter(jsonElement, "<this>");
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            if (jsonPrimitive == null) {
                throw new IllegalArgumentException("Element " + C2017Sp1.a.b(jsonElement.getClass()) + " is not a JsonPrimitive");
            }
            Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
            if (!(jsonPrimitive instanceof JsonNull)) {
                strB = jsonPrimitive.b();
            }
        }
        try {
            RJ0 deserializer2 = C3057c.d((T0) deserializer, gg0, strB);
            AbstractC5267mG0 abstractC5267mG0X = gg0.x();
            Intrinsics.checkNotNullParameter(abstractC5267mG0X, "<this>");
            Intrinsics.checkNotNullParameter(discriminator, "discriminator");
            Intrinsics.checkNotNullParameter(element, "element");
            Intrinsics.checkNotNullParameter(deserializer2, "deserializer");
            return (T) new KH0(abstractC5267mG0X, element, discriminator, deserializer2.c()).d(deserializer2);
        } catch (ZH1 e) {
            String message = e.getMessage();
            Intrinsics.checkNotNull(message);
            throw C1874Qu.e(message, element.toString(), -1);
        }
    }
}

package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ke1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1358Ke1 {

    @NotNull
    public static final Regex a = new Regex("session\\s+(?:has\\s+)?(?:timed\\s*out|expired)|(?:invalid|expired)\\s+session|session\\s+is\\s+(?:invalid|expired)|(?:log|sign)[ -]?in again", EnumC4537iq1.IGNORE_CASE);

    @Nullable
    public static final CommonError a(@NotNull String body) {
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(body, "body");
        String string = StringsKt.f0(body).toString();
        if (d.o(string, "{", false)) {
            try {
                JsonElement jsonElementZ = C4466ii.z(string);
                jsonObject = jsonElementZ instanceof JsonObject ? (JsonObject) jsonElementZ : null;
            } catch (Exception unused) {
            }
            if (jsonObject != null) {
                JsonElement jsonElementH = jsonObject.h("error");
                JsonPrimitive jsonPrimitive = jsonElementH instanceof JsonPrimitive ? (JsonPrimitive) jsonElementH : null;
                if (jsonPrimitive != null) {
                    if (!(jsonPrimitive.d instanceof Boolean)) {
                        jsonPrimitive = null;
                    }
                    if (jsonPrimitive != null && jsonPrimitive.a()) {
                        JsonElement jsonElementH2 = jsonObject.h("message");
                        JsonPrimitive jsonPrimitive2 = jsonElementH2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElementH2 : null;
                        String strF = jsonPrimitive2 != null ? jsonPrimitive2.f() : null;
                        if (strF == null) {
                            strF = "";
                        }
                        if (a.a(strF)) {
                            CommonError.Companion companion = CommonError.INSTANCE;
                            int value = CommonError.Codes.NotAuthenticated.getValue();
                            companion.getClass();
                            return CommonError.Companion.a(value, strF, "session_timeout");
                        }
                        CommonError.Companion companion2 = CommonError.INSTANCE;
                        int value2 = CommonError.Codes.UnexpectedError.getValue();
                        String strConcat = strF.length() == 0 ? "platform_json_error" : "platform_json_error:".concat(strF);
                        companion2.getClass();
                        return CommonError.Companion.a(value2, strF, strConcat);
                    }
                }
            }
        }
        return null;
    }
}

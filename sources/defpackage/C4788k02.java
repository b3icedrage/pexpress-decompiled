package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: k02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4788k02 implements InterfaceC1013Ft1 {

    @NotNull
    public final String a;

    @NotNull
    public final Set<String> b;

    @NotNull
    public final Set<String> c;

    @NotNull
    public final Set<Integer> d;

    public C4788k02(@NotNull JSONObject response) throws JSONException {
        Intrinsics.checkNotNullParameter(response, "response");
        this.a = C0957Fb.o(response);
        C6702t60 c6702t60 = C6702t60.d;
        this.b = c6702t60;
        this.c = c6702t60;
        this.d = c6702t60;
        if (response.has("exceeded_daily_quota_users")) {
            Set<String> setKeySet = response.getJSONObject("exceeded_daily_quota_users").keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "response.getJSONObject(\"…ly_quota_users\").keySet()");
            this.b = setKeySet;
        }
        if (response.has("exceeded_daily_quota_devices")) {
            Set<String> setKeySet2 = response.getJSONObject("exceeded_daily_quota_devices").keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet2, "response.getJSONObject(\"…_quota_devices\").keySet()");
            this.c = setKeySet2;
        }
        if (response.has("throttled_events")) {
            JSONArray jSONArray = response.getJSONArray("throttled_events");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "response.getJSONArray(\"throttled_events\")");
            this.d = C1526Mj.G(C0957Fb.A(jSONArray));
        }
        if (response.has("throttled_users")) {
            Intrinsics.checkNotNullExpressionValue(response.getJSONObject("throttled_users").keySet(), "response.getJSONObject(\"throttled_users\").keySet()");
        }
        if (response.has("throttled_devices")) {
            Intrinsics.checkNotNullExpressionValue(response.getJSONObject("throttled_devices").keySet(), "response.getJSONObject(\"…ottled_devices\").keySet()");
        }
    }
}

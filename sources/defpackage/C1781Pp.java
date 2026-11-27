package defpackage;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1781Pp implements InterfaceC1013Ft1 {

    @NotNull
    public final String a;

    @NotNull
    public final Set<Integer> b;

    @NotNull
    public final Set<Integer> c;

    @NotNull
    public final Set<Integer> d;

    @NotNull
    public final Set<String> e;

    public C1781Pp(@NotNull JSONObject response) throws JSONException {
        Intrinsics.checkNotNullParameter(response, "response");
        this.a = C0957Fb.o(response);
        C6702t60 c6702t60 = C6702t60.d;
        this.b = c6702t60;
        this.c = c6702t60;
        this.d = c6702t60;
        this.e = c6702t60;
        if (response.has("events_with_invalid_fields")) {
            JSONObject jSONObject = response.getJSONObject("events_with_invalid_fields");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "response.getJSONObject(\"…nts_with_invalid_fields\")");
            this.b = C0957Fb.j(jSONObject);
        }
        if (response.has("events_with_missing_fields")) {
            JSONObject jSONObject2 = response.getJSONObject("events_with_missing_fields");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "response.getJSONObject(\"…nts_with_missing_fields\")");
            this.c = C0957Fb.j(jSONObject2);
        }
        if (response.has("silenced_devices")) {
            Object jSONArray = response.getJSONArray("silenced_devices");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "response.getJSONArray(\"silenced_devices\")");
            Set<String> setH0 = CollectionsKt.h0((Iterable) jSONArray);
            Intrinsics.c(setH0, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            this.e = setH0;
        }
        if (response.has("silenced_events")) {
            JSONArray jSONArray2 = response.getJSONArray("silenced_events");
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "response.getJSONArray(\"silenced_events\")");
            this.d = C1526Mj.G(C0957Fb.A(jSONArray2));
        }
    }
}

package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: v61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lv61;", "", "Lorg/json/JSONArray;", "dataArray", "Lorg/json/JSONObject;", "jsonData", "<init>", "(Lorg/json/JSONArray;Lorg/json/JSONObject;)V", "component1", "()Lorg/json/JSONArray;", "component2", "()Lorg/json/JSONObject;", "copy", "(Lorg/json/JSONArray;Lorg/json/JSONObject;)Lv61;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/json/JSONArray;", "getDataArray", "setDataArray", "(Lorg/json/JSONArray;)V", "Lorg/json/JSONObject;", "getJsonData", "setJsonData", "(Lorg/json/JSONObject;)V", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class C7123v61 {

    @NotNull
    private JSONArray dataArray;

    @NotNull
    private JSONObject jsonData;

    public C7123v61(@NotNull JSONArray dataArray, @NotNull JSONObject jsonData) {
        Intrinsics.checkNotNullParameter(dataArray, "dataArray");
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        this.dataArray = dataArray;
        this.jsonData = jsonData;
    }

    public static /* synthetic */ C7123v61 copy$default(C7123v61 c7123v61, JSONArray jSONArray, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONArray = c7123v61.dataArray;
        }
        if ((i & 2) != 0) {
            jSONObject = c7123v61.jsonData;
        }
        return c7123v61.copy(jSONArray, jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JSONArray getDataArray() {
        return this.dataArray;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JSONObject getJsonData() {
        return this.jsonData;
    }

    @NotNull
    public final C7123v61 copy(@NotNull JSONArray dataArray, @NotNull JSONObject jsonData) {
        Intrinsics.checkNotNullParameter(dataArray, "dataArray");
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        return new C7123v61(dataArray, jsonData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C7123v61)) {
            return false;
        }
        C7123v61 c7123v61 = (C7123v61) other;
        return Intrinsics.a(this.dataArray, c7123v61.dataArray) && Intrinsics.a(this.jsonData, c7123v61.jsonData);
    }

    @NotNull
    public final JSONArray getDataArray() {
        return this.dataArray;
    }

    @NotNull
    public final JSONObject getJsonData() {
        return this.jsonData;
    }

    public int hashCode() {
        return this.jsonData.hashCode() + (this.dataArray.hashCode() * 31);
    }

    public final void setDataArray(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<set-?>");
        this.dataArray = jSONArray;
    }

    public final void setJsonData(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.jsonData = jSONObject;
    }

    @NotNull
    public String toString() {
        return "NotificationIntentExtras(dataArray=" + this.dataArray + ", jsonData=" + this.jsonData + ')';
    }
}

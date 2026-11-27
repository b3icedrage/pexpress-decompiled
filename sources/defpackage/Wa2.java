package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LWa2;", "", "LPb2;", "current", "<init>", "(LPb2;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "LPb2;", "getCurrent", "()LPb2;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Wa2 {

    @NotNull
    private final Pb2 current;

    public Wa2(@NotNull Pb2 current) {
        Intrinsics.checkNotNullParameter(current, "current");
        this.current = current;
    }

    @NotNull
    public final Pb2 getCurrent() {
        return this.current;
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("current", this.current.toJSONObject());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n           …, current.toJSONObject())");
        return jSONObjectPut;
    }
}

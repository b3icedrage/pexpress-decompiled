package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Jz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 )2\u00020\u0001:\u0001*B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0013\u0010(\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u0010¨\u0006+"}, d2 = {"LJz0;", "", "", "jsonString", "<init>", "(Ljava/lang/String;)V", "LKz0;", "influenceChannel", "LQz0;", "influenceType", "Lorg/json/JSONArray;", "ids", "(LKz0;LQz0;Lorg/json/JSONArray;)V", "copy", "()LJz0;", "toJSONString", "()Ljava/lang/String;", "toString", R51.PUSH_MINIFIED_BUTTONS_LIST, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LQz0;", "getInfluenceType", "()LQz0;", "setInfluenceType", "(LQz0;)V", "<set-?>", "LKz0;", "getInfluenceChannel", "()LKz0;", "Lorg/json/JSONArray;", "getIds", "()Lorg/json/JSONArray;", "setIds", "(Lorg/json/JSONArray;)V", "getDirectId", "directId", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1342Jz0 {

    @NotNull
    public static final String INFLUENCE_CHANNEL = "influence_channel";

    @NotNull
    public static final String INFLUENCE_IDS = "influence_ids";

    @NotNull
    public static final String INFLUENCE_TYPE = "influence_type";

    @Nullable
    private JSONArray ids;

    @NotNull
    private EnumC1420Kz0 influenceChannel;

    @NotNull
    private EnumC1890Qz0 influenceType;

    public C1342Jz0(@NotNull String jsonString) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString(INFLUENCE_CHANNEL);
        String string2 = jSONObject.getString(INFLUENCE_TYPE);
        String ids = jSONObject.getString(INFLUENCE_IDS);
        this.influenceChannel = EnumC1420Kz0.INSTANCE.fromString(string);
        this.influenceType = EnumC1890Qz0.INSTANCE.fromString(string2);
        Intrinsics.checkNotNullExpressionValue(ids, "ids");
        this.ids = ids.length() == 0 ? null : new JSONArray(ids);
    }

    @NotNull
    public final C1342Jz0 copy() {
        return new C1342Jz0(this.influenceChannel, this.influenceType, this.ids);
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && C1342Jz0.class.equals(o.getClass())) {
            C1342Jz0 c1342Jz0 = (C1342Jz0) o;
            if (this.influenceChannel == c1342Jz0.influenceChannel && this.influenceType == c1342Jz0.influenceType) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String getDirectId() {
        JSONArray jSONArray = this.ids;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        return jSONArray.getString(0);
    }

    @Nullable
    public final JSONArray getIds() {
        return this.ids;
    }

    @NotNull
    public final EnumC1420Kz0 getInfluenceChannel() {
        return this.influenceChannel;
    }

    @NotNull
    public final EnumC1890Qz0 getInfluenceType() {
        return this.influenceType;
    }

    public int hashCode() {
        return this.influenceType.hashCode() + (this.influenceChannel.hashCode() * 31);
    }

    public final void setIds(@Nullable JSONArray jSONArray) {
        this.ids = jSONArray;
    }

    public final void setInfluenceType(@NotNull EnumC1890Qz0 enumC1890Qz0) {
        Intrinsics.checkNotNullParameter(enumC1890Qz0, "<set-?>");
        this.influenceType = enumC1890Qz0;
    }

    @NotNull
    public final String toJSONString() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(INFLUENCE_CHANNEL, this.influenceChannel.toString()).put(INFLUENCE_TYPE, this.influenceType.toString());
        JSONArray jSONArray = this.ids;
        String string = jSONObjectPut.put(INFLUENCE_IDS, jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n           …)\n            .toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.influenceChannel + ", influenceType=" + this.influenceType + ", ids=" + this.ids + '}';
    }

    public C1342Jz0(@NotNull EnumC1420Kz0 influenceChannel, @NotNull EnumC1890Qz0 influenceType, @Nullable JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(influenceChannel, "influenceChannel");
        Intrinsics.checkNotNullParameter(influenceType, "influenceType");
        this.influenceChannel = influenceChannel;
        this.influenceType = influenceType;
        this.ids = jSONArray;
    }
}

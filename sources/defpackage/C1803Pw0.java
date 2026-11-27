package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Pw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001b"}, d2 = {"LPw0;", "", "Lgv0;", "_time", "Lqj1;", "_propertiesModelStore", "<init>", "(Lgv0;Lqj1;)V", "", "untaggedString", "taggedHTMLString", "(Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONArray;", "jsonArray", "", "LQw0;", "hydrateIAMMessages", "(Lorg/json/JSONArray;)Ljava/util/List;", "Lorg/json/JSONObject;", "jsonObject", "LVw0;", "hydrateIAMMessageContent", "(Lorg/json/JSONObject;)LVw0;", "Lgv0;", "Lqj1;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1803Pw0 {

    @NotNull
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";

    @NotNull
    private final C6204qj1 _propertiesModelStore;

    @NotNull
    private final InterfaceC4092gv0 _time;

    public C1803Pw0(@NotNull InterfaceC4092gv0 _time, @NotNull C6204qj1 _propertiesModelStore) {
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        this._time = _time;
        this._propertiesModelStore = _propertiesModelStore;
    }

    private final String taggedHTMLString(String untaggedString) {
        HW0<String> tags = this._propertiesModelStore.getModel().getTags();
        Intrinsics.c(tags, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        String string = new JSONObject(tags).toString();
        Intrinsics.checkNotNullExpressionValue(string, "tagsAsJson.toString()");
        StringBuilder sb = new StringBuilder();
        sb.append(untaggedString);
        String str = String.format(LIQUID_TAG_SCRIPT, Arrays.copyOf(new Object[]{string}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        sb.append(str);
        return sb.toString();
    }

    @Nullable
    public final C2271Vw0 hydrateIAMMessageContent(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        try {
            C2271Vw0 c2271Vw0 = new C2271Vw0(jsonObject);
            if (c2271Vw0.getContentHtml() == null) {
                NS0.debug$default("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent", null, 2, null);
                return null;
            }
            String contentHtml = c2271Vw0.getContentHtml();
            Intrinsics.checkNotNull(contentHtml);
            c2271Vw0.setContentHtml(taggedHTMLString(contentHtml));
            return c2271Vw0;
        } catch (JSONException e) {
            NS0.error("Error attempting to hydrate InAppMessageContent: " + jsonObject, e);
            return null;
        }
    }

    @NotNull
    public final List<C1881Qw0> hydrateIAMMessages(@NotNull JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonArray.getJSONObject(i)");
            C1881Qw0 c1881Qw0 = new C1881Qw0(jSONObject, this._time);
            if (c1881Qw0.getMessageId() != null) {
                arrayList.add(c1881Qw0);
            }
        }
        return arrayList;
    }
}

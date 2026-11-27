package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0017"}, d2 = {"LR51;", "LEt0;", "LLt0;", "_workManager", "Lgv0;", "_time", "<init>", "(LLt0;Lgv0;)V", "Landroid/os/Bundle;", "fcmBundle", "", "maximizeButtonsFromBundle", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "bundle", "LEt0$a;", "processBundleFromReceiver", "(Landroid/content/Context;Landroid/os/Bundle;)LEt0$a;", "LLt0;", "Lgv0;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class R51 implements InterfaceC0934Et0 {

    @NotNull
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";

    @NotNull
    public static final String DEFAULT_ACTION = "__DEFAULT__";

    @NotNull
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";

    @NotNull
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";

    @NotNull
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";

    @NotNull
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";

    @NotNull
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";

    @NotNull
    private final InterfaceC4092gv0 _time;

    @NotNull
    private final InterfaceC1479Lt0 _workManager;

    public R51(@NotNull InterfaceC1479Lt0 _workManager, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_workManager, "_workManager");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._workManager = _workManager;
        this._time = _time;
    }

    private final void maximizeButtonsFromBundle(Bundle fcmBundle) {
        JSONObject jSONObject;
        String string;
        if (fcmBundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                JSONObject jSONObject2 = new JSONObject(fcmBundle.getString("custom"));
                if (jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject = jSONObject2.getJSONObject(PUSH_ADDITIONAL_DATA_KEY);
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "{\n                    cu…      )\n                }");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(fcmBundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                fcmBundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string2 = jSONObject3.getString(PUSH_MINIFIED_BUTTON_TEXT);
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_TEXT);
                    if (jSONObject3.has("i")) {
                        string = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        string = string2;
                    }
                    jSONObject3.put("id", string);
                    jSONObject3.put("text", string2);
                    if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ICON)) {
                        jSONObject3.put("icon", jSONObject3.getString(PUSH_MINIFIED_BUTTON_ICON));
                        jSONObject3.remove(PUSH_MINIFIED_BUTTON_ICON);
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", DEFAULT_ACTION);
                if (!jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject2.put(PUSH_ADDITIONAL_DATA_KEY, jSONObject);
                }
                fcmBundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.InterfaceC0934Et0
    @Nullable
    public InterfaceC0934Et0.a processBundleFromReceiver(@NotNull Context context, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        InterfaceC0934Et0.a aVar = new InterfaceC0934Et0.a();
        C6074q61 c6074q61 = C6074q61.INSTANCE;
        if (!c6074q61.isOneSignalBundle(bundle)) {
            return aVar;
        }
        aVar.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        JSONObject jSONObjectBundleAsJSONObject = KD0.INSTANCE.bundleAsJSONObject(bundle);
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        boolean z = bundle.getBoolean("is_restoring", false);
        String string = bundle.getString("pri", "0");
        Intrinsics.checkNotNullExpressionValue(string, "bundle.getString(\"pri\", \"0\")");
        boolean z2 = Integer.parseInt(string) > 9;
        String oSNotificationIdFromJson = c6074q61.getOSNotificationIdFromJson(jSONObjectBundleAsJSONObject);
        int i = bundle.containsKey(ANDROID_NOTIFICATION_ID) ? bundle.getInt(ANDROID_NOTIFICATION_ID) : 0;
        InterfaceC1479Lt0 interfaceC1479Lt0 = this._workManager;
        Intrinsics.checkNotNull(oSNotificationIdFromJson);
        aVar.setWorkManagerProcessing(interfaceC1479Lt0.beginEnqueueingWork(context, oSNotificationIdFromJson, i, jSONObjectBundleAsJSONObject, currentTimeMillis, z, z2));
        return aVar;
    }
}

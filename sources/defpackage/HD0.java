package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u001b\u0010\u000b\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u000b\u0010\u0014J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u000b\u0010\u0016¨\u0006\u0017"}, d2 = {"LHD0;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "LQP;", "convertToCreateUserResponse", "(Lorg/json/JSONObject;)LQP;", "Lsj1;", "properties", "convertToJSON", "(Lsj1;)Lorg/json/JSONObject;", "Lnj1;", "propertiesDeltas", "(Lnj1;)Lorg/json/JSONObject;", "", "LDU1;", "subscriptions", "Lorg/json/JSONArray;", "(Ljava/util/List;)Lorg/json/JSONArray;", "subscription", "(LDU1;)Lorg/json/JSONObject;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HD0 {

    @NotNull
    public static final HD0 INSTANCE = new HD0();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "LDU1;", "invoke", "(Lorg/json/JSONObject;)LDU1;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<JSONObject, DU1> {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final DU1 invoke(@NotNull JSONObject it) throws JSONException {
            Intrinsics.checkNotNullParameter(it, "it");
            EU1.Companion companion = EU1.INSTANCE;
            String string = it.getString("type");
            Intrinsics.checkNotNullExpressionValue(string, "it.getString(\"type\")");
            EU1 eu1FromString = companion.fromString(string);
            if (eu1FromString != null) {
                return new DU1(it.getString("id"), eu1FromString, JD0.safeString(it, "token"), JD0.safeBool(it, "enabled"), JD0.safeInt(it, "notification_types"), JD0.safeString(it, "sdk"), JD0.safeString(it, Payload.DEVICE_MODEL), JD0.safeString(it, "device_os"), JD0.safeBool(it, "rooted"), JD0.safeInt(it, "net_type"), JD0.safeString(it, "carrier"), JD0.safeString(it, "app_version"));
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcl1;", "it", "Lorg/json/JSONObject;", "invoke", "(Lcl1;)Lorg/json/JSONObject;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends ML0 implements Function1<C3222cl1, JSONObject> {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final JSONObject invoke(@NotNull C3222cl1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new JSONObject().put("sku", it.getSku()).put("iso", it.getIso()).put("amount", it.getAmount().toString());
        }
    }

    private HD0() {
    }

    @NotNull
    public final QP convertToCreateUserResponse(@NotNull JSONObject jsonObject) {
        Map mapC;
        LinkedHashMap linkedHashMap;
        JSONObject jSONObjectSafeJSONObject;
        Map<String, Object> map;
        Map<String, Object> map2;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        JSONObject jSONObjectSafeJSONObject2 = JD0.safeJSONObject(jsonObject, "identity");
        if (jSONObjectSafeJSONObject2 == null || (map2 = JD0.toMap(jSONObjectSafeJSONObject2)) == null) {
            mapC = PW0.c();
        } else {
            mapC = new LinkedHashMap(OW0.a(map2.size()));
            Iterator<T> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                mapC.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject jSONObjectSafeJSONObject3 = JD0.safeJSONObject(jsonObject, "properties");
        if (jSONObjectSafeJSONObject3 == null || (jSONObjectSafeJSONObject = JD0.safeJSONObject(jSONObjectSafeJSONObject3, "tags")) == null || (map = JD0.toMap(jSONObjectSafeJSONObject)) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(OW0.a(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new QP(mapC, new C6623sj1(linkedHashMap, jSONObjectSafeJSONObject3 != null ? JD0.safeString(jSONObjectSafeJSONObject3, "language") : null, jSONObjectSafeJSONObject3 != null ? JD0.safeString(jSONObjectSafeJSONObject3, "timezone_id") : null, jSONObjectSafeJSONObject3 != null ? JD0.safeString(jSONObjectSafeJSONObject3, "country") : null, jSONObjectSafeJSONObject3 != null ? JD0.safeDouble(jSONObjectSafeJSONObject3, "lat") : null, jSONObjectSafeJSONObject3 != null ? JD0.safeDouble(jSONObjectSafeJSONObject3, "long") : null), JD0.expandJSONArray(jsonObject, "subscriptions", a.INSTANCE));
    }

    @NotNull
    public final JSONObject convertToJSON(@NotNull C6623sj1 properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        return JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putMap(new JSONObject(), "tags", properties.getTags()), "language", properties.getLanguage()), "timezone_id", properties.getTimezoneId()), "lat", properties.getLatitude()), "long", properties.getLongitude()), "country", properties.getCountry());
    }

    @NotNull
    public final JSONObject convertToJSON(@NotNull C5574nj1 propertiesDeltas) throws JSONException {
        Intrinsics.checkNotNullParameter(propertiesDeltas, "propertiesDeltas");
        JSONObject jSONObjectPutSafe = JD0.putSafe(JD0.putSafe(new JSONObject(), "session_time", propertiesDeltas.getSessionTime()), "session_count", propertiesDeltas.getSessionCount());
        BigDecimal amountSpent = propertiesDeltas.getAmountSpent();
        return JD0.putJSONArray(JD0.putSafe(jSONObjectPutSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", propertiesDeltas.getPurchases(), b.INSTANCE);
    }

    @NotNull
    public final JSONArray convertToJSON(@NotNull List<DU1> subscriptions) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        Iterator<DU1> it = subscriptions.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    @NotNull
    public final JSONObject convertToJSON(@NotNull DU1 subscription) throws JSONException {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        JSONObject jSONObjectPutSafe = JD0.putSafe(new JSONObject(), "id", subscription.getId());
        EU1 type = subscription.getType();
        return JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(JD0.putSafe(jSONObjectPutSafe, "type", type != null ? type.getValue() : null), "token", subscription.getToken()), "enabled", subscription.getEnabled()), "notification_types", subscription.getNotificationTypes()), "sdk", subscription.getSdk()), Payload.DEVICE_MODEL, subscription.getDeviceModel()), "device_os", subscription.getDeviceOS()), "rooted", subscription.getRooted()), "net_type", subscription.getNetType()), "carrier", subscription.getCarrier()), "app_version", subscription.getAppVersion());
    }
}

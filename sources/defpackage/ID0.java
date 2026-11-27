package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ID0 {
    public static final Object a(Object obj) {
        if (obj instanceof JSONObject) {
            return d((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof BigDecimal) {
                return Double.valueOf(((BigDecimal) obj).doubleValue());
            }
            if (Intrinsics.a(obj, JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public static final Object b(Object obj) {
        if (obj instanceof Map) {
            return c((Map) obj);
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next()));
            }
            return jSONArray;
        }
        if (!(obj instanceof Object[])) {
            return obj;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr == null) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        C6411rj c6411rjL = C6621sj.l(objArr);
        while (c6411rjL.hasNext()) {
            jSONArray2.put(b(c6411rjL.next()));
        }
        return jSONArray2;
    }

    @Nullable
    public static final JSONObject c(@Nullable Map<?, ?> map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                jSONObject.put(str, b(entry.getValue()));
            }
        }
        return jSONObject;
    }

    @NotNull
    public static final LinkedHashMap d(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            linkedHashMap.put(key, a(jSONObject.get(key)));
        }
        return linkedHashMap;
    }
}

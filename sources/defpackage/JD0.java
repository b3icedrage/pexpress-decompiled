package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class JD0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends ML0 implements Function1<JSONObject, Unit> {
        final /* synthetic */ Map<String, Object> $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(1);
            this.$map = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            invoke2(jSONObject);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull JSONObject it) throws JSONException {
            Intrinsics.checkNotNullParameter(it, "it");
            JD0.putMap(it, this.$map);
        }
    }

    @NotNull
    public static final <T> List<T> expandJSONArray(@NotNull JSONObject jSONObject, @NotNull String name, @NotNull Function1<? super JSONObject, ? extends T> into) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(into, "into");
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(name)) {
            JSONArray jSONArray = jSONObject.getJSONArray(name);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject itemJSONObject = jSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(itemJSONObject, "itemJSONObject");
                T tInvoke = into.invoke(itemJSONObject);
                if (tInvoke != null) {
                    arrayList.add(tInvoke);
                }
            }
        }
        return arrayList;
    }

    public static final void expandJSONObject(@NotNull JSONObject jSONObject, @NotNull String name, @NotNull Function1<? super JSONObject, Unit> into) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(into, "into");
        if (jSONObject.has(name)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(name);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "this.getJSONObject(name)");
            into.invoke(jSONObject2);
        }
    }

    @NotNull
    public static final <T> JSONObject putJSONArray(@NotNull JSONObject jSONObject, @NotNull String name, @Nullable List<? extends T> list, @NotNull Function1<? super T, ? extends JSONObject> create) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(create, "create");
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectInvoke = create.invoke(it.next());
                if (jSONObjectInvoke != null) {
                    jSONArray.put(jSONObjectInvoke);
                }
            }
            jSONObject.put(name, jSONArray);
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject putJSONObject(@NotNull JSONObject jSONObject, @NotNull String name, @NotNull Function1<? super JSONObject, Unit> expand) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(expand, "expand");
        JSONObject jSONObject2 = new JSONObject();
        expand.invoke(jSONObject2);
        jSONObject.put(name, jSONObject2);
        return jSONObject;
    }

    @NotNull
    public static final JSONObject putMap(@NotNull JSONObject jSONObject, @NotNull Map<String, ? extends Object> map) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject putSafe(@NotNull JSONObject jSONObject, @NotNull String name, @Nullable Object obj) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj != null) {
            jSONObject.put(name, obj);
        }
        return jSONObject;
    }

    @Nullable
    public static final Boolean safeBool(@NotNull JSONObject jSONObject, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (jSONObject.has(name)) {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        }
        return null;
    }

    @Nullable
    public static final Double safeDouble(@NotNull JSONObject jSONObject, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (jSONObject.has(name)) {
            return Double.valueOf(jSONObject.getDouble(name));
        }
        return null;
    }

    @Nullable
    public static final Integer safeInt(@NotNull JSONObject jSONObject, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (jSONObject.has(name)) {
            return Integer.valueOf(jSONObject.getInt(name));
        }
        return null;
    }

    @Nullable
    public static final JSONObject safeJSONObject(@NotNull JSONObject jSONObject, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getJSONObject(name);
        }
        return null;
    }

    @Nullable
    public static final Long safeLong(@NotNull JSONObject jSONObject, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (jSONObject.has(name)) {
            return Long.valueOf(jSONObject.getLong(name));
        }
        return null;
    }

    @Nullable
    public static final String safeString(@NotNull JSONObject jSONObject, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getString(name);
        }
        return null;
    }

    @Nullable
    public static final List<Object> toList(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (JSONObject.NULL.equals(objOpt)) {
                arrayList.add(null);
            } else if (objOpt instanceof JSONArray) {
                arrayList.add(toList((JSONArray) objOpt));
            } else if (objOpt instanceof JSONObject) {
                arrayList.add(toMap((JSONObject) objOpt));
            } else {
                arrayList.add(objOpt);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object list = jSONObject.get(key);
            Intrinsics.checkNotNullExpressionValue(key, "key");
            if (JSONObject.NULL.equals(list)) {
                list = null;
            } else if (list instanceof JSONObject) {
                list = toMap((JSONObject) list);
            } else if (list instanceof JSONArray) {
                list = toList((JSONArray) list);
            }
            map.put(key, list);
        }
        return map;
    }

    @NotNull
    public static final JSONObject putMap(@NotNull JSONObject jSONObject, @NotNull String name, @Nullable Map<String, ? extends Object> map) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (map != null) {
            putJSONObject(jSONObject, name, new a(map));
        }
        return jSONObject;
    }
}

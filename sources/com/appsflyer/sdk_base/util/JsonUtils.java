package com.appsflyer.sdk_base.util;

import defpackage.CB0;
import defpackage.FH1;
import defpackage.HK;
import defpackage.PW0;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004\u001a\u0016\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0004\u001a\u0014\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007*\u00020\bH\u0002\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002¨\u0006\u000b"}, d2 = {"toMap", "", "", "", "Lorg/json/JSONObject;", "toStringMap", "toList", "", "Lorg/json/JSONArray;", "convertJsonValue", "jsonValue", "sdk_base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonUtils {
    private static final Object convertJsonValue(Object obj) {
        if (obj instanceof JSONArray) {
            return toList((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return toMap((JSONObject) obj);
        }
        if (Intrinsics.a(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static final List<Object> toList(JSONArray jSONArray) throws JSONException {
        IntRange intRangeI = f.i(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(XE.m(intRangeI, 10));
        Iterator<Integer> it = intRangeI.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((CB0) it).b());
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            arrayList.add(convertJsonValue(obj));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        HK hkA = FH1.a(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : hkA) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            linkedHashMap.put(obj, convertJsonValue(obj2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Map<String, String> toStringMap(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (jSONObject.length() == 0) {
            return PW0.c();
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        HK hkA = FH1.a(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : hkA) {
            Object obj2 = jSONObject.get((String) obj);
            linkedHashMap.put(obj, Intrinsics.a(obj2, JSONObject.NULL) ? "null" : obj2.toString());
        }
        return linkedHashMap;
    }
}

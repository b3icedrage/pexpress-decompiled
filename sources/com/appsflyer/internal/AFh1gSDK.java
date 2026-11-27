package com.appsflyer.internal;

import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import defpackage.C1717Ot1;
import defpackage.C1795Pt1;
import defpackage.C5653o60;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1gSDK {

    @Nullable
    public AFi1zSDK AFKeystoreWrapper;

    @Nullable
    public ExceptionManagerConfiguration d;

    @Nullable
    public AFh1cSDK unregisterClient;

    public AFh1gSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.unregisterClient = d(jSONObject);
        this.d = unregisterClient(jSONObject);
        this.AFKeystoreWrapper = registerClient(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [o60] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    private static AFh1cSDK d(JSONObject jSONObject) {
        Object objA;
        ?? arrayList;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "r_debugger");
            if (jSONObjectUnregisterClient != null) {
                long j = jSONObjectUnregisterClient.getLong("ttl");
                int i = jSONObjectUnregisterClient.getInt("counter");
                String strOptString = jSONObjectUnregisterClient.optString("app_ver", "");
                String strOptString2 = jSONObjectUnregisterClient.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectUnregisterClient.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectUnregisterClient.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArrayOptJSONArray.getString(i2);
                        Intrinsics.checkNotNull(string);
                        arrayList.add(string);
                    }
                } else {
                    arrayList = C5653o60.d;
                }
                ?? r7 = arrayList;
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                objA = new AFh1cSDK(j, fOptDouble, r7, i, strOptString, strOptString2);
            } else {
                objA = null;
            }
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        C1717Ot1.a aVar3 = C1717Ot1.e;
        return (AFh1cSDK) (objA instanceof C1717Ot1.b ? null : objA);
    }

    private static AFi1zSDK registerClient(JSONObject jSONObject) {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "meta_data");
            objA = jSONObjectUnregisterClient != null ? new AFi1zSDK(jSONObjectUnregisterClient.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        return (AFi1zSDK) (objA instanceof C1717Ot1.b ? null : objA);
    }

    private static ExceptionManagerConfiguration unregisterClient(JSONObject jSONObject) {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            JSONObject jSONObjectUnregisterClient = unregisterClient(jSONObject, "exc_mngr");
            if (jSONObjectUnregisterClient != null) {
                String string = jSONObjectUnregisterClient.getString("sdk_ver");
                int iOptInt = jSONObjectUnregisterClient.optInt("min", -1);
                int iOptInt2 = jSONObjectUnregisterClient.optInt("expire", -1);
                long jOptLong = jSONObjectUnregisterClient.optLong("ttl", -1L);
                Intrinsics.checkNotNull(string);
                objA = new ExceptionManagerConfiguration(string, iOptInt, iOptInt2, jOptLong);
            } else {
                objA = null;
            }
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        return (ExceptionManagerConfiguration) (objA instanceof C1717Ot1.b ? null : objA);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1gSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "");
        AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
        return Intrinsics.a(this.d, aFh1gSDK.d) && Intrinsics.a(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.a(this.unregisterClient, aFh1gSDK.unregisterClient);
    }

    public final int hashCode() {
        ExceptionManagerConfiguration exceptionManagerConfiguration = this.d;
        int iHashCode = (exceptionManagerConfiguration != null ? exceptionManagerConfiguration.hashCode() : 0) * 31;
        AFi1zSDK aFi1zSDK = this.AFKeystoreWrapper;
        int iHashCode2 = (iHashCode + (aFi1zSDK != null ? aFi1zSDK.hashCode() : 0)) * 31;
        AFh1cSDK aFh1cSDK = this.unregisterClient;
        return iHashCode2 + (aFh1cSDK != null ? aFh1cSDK.hashCode() : 0);
    }

    private static JSONObject unregisterClient(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}

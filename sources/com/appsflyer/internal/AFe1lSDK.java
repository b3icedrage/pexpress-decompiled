package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import defpackage.PW0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1lSDK extends AFe1kSDK<String> {

    @NotNull
    private final AFf1eSDK AFLoggerLogLevel;

    @NotNull
    private final AFc1eSDK afDebugLog;

    @NotNull
    private final AFg1rSDK afInfoLog;

    @NotNull
    private final AFc1iSDK afWarnLog;

    @NotNull
    private final AFe1zSDK force;

    @NotNull
    private final Map<String, Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1lSDK(@NotNull AFe1zSDK aFe1zSDK, @NotNull AFe1zSDK[] aFe1zSDKArr, @NotNull AFc1bSDK aFc1bSDK, @Nullable String str, @NotNull Map<String, ? extends Object> map) {
        super(aFe1zSDK, aFe1zSDKArr, aFc1bSDK, null);
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        Intrinsics.checkNotNullParameter(aFe1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.force = aFe1zSDK;
        this.v = map;
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
        this.afWarnLog = aFc1iSDKAFLogger;
        AFg1rSDK aFg1rSDKForce = aFc1bSDK.force();
        Intrinsics.checkNotNullExpressionValue(aFg1rSDKForce, "");
        this.afInfoLog = aFg1rSDKForce;
        AFf1eSDK oaidData = aFc1bSDK.setOaidData();
        Intrinsics.checkNotNullExpressionValue(oaidData, "");
        this.AFLoggerLogLevel = oaidData;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.afDebugLog = androidIdData;
    }

    @Nullable
    public String AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AFd1pSDK<String> AFLogger(@NotNull String str) {
        AFd1oSDK aFd1oSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mapL = PW0.l(this.v);
        String strRegisterClient = registerClient(mapL);
        String strAFKeystoreWrapper = AFKeystoreWrapper(mapL);
        Map<String, Object> mapL2 = PW0.l(mapL);
        registerClient(mapL2, strRegisterClient);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strAFLogger = this.afWarnLog.AFLogger();
        if (strAFLogger != null && !StringsKt.I(strAFLogger)) {
            linkedHashMap.put("advertising_id", strAFLogger);
        }
        AFb1lSDK aFb1lSDKUnregisterClient = AFb1iSDK.unregisterClient(this.afWarnLog.d.d);
        String str2 = null;
        String str3 = aFb1lSDKUnregisterClient != null ? aFb1lSDKUnregisterClient.d : null;
        if (str3 != null && !StringsKt.I(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1lSDK aFb1lSDKH_ = AFb1iSDK.h_(this.afWarnLog.d.d.getContentResolver());
        String str4 = aFb1lSDKH_ != null ? aFb1lSDKH_.d : null;
        if (str4 != null && !StringsKt.I(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        AFc1eSDK aFc1eSDK = this.afDebugLog;
        if (aFc1eSDK.afInfoLog) {
            mapL2.put("deviceTrackingDisabled", "true");
        } else {
            String str5 = aFc1eSDK.AFLoggerLogLevel;
            if (str5 != null && !StringsKt.I(str5)) {
                linkedHashMap.put("imei", str5);
            }
        }
        String strAFLogger2 = AFb1jSDK.AFLogger(this.afWarnLog.AFKeystoreWrapper);
        if (strAFLogger2 == null) {
            strAFLogger2 = "";
        }
        linkedHashMap.put("appsflyer_id", strAFLogger2);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "7.0.1");
        if (strAFKeystoreWrapper != null && !StringsKt.I(strAFKeystoreWrapper)) {
            linkedHashMap.put("sdk_connector_version", strAFKeystoreWrapper);
        }
        this.afInfoLog.unregisterClient(linkedHashMap, this.force);
        mapL2.put("device_data", linkedHashMap);
        this.AFLoggerLogLevel.d(mapL2, this.force);
        this.afInfoLog.unregisterClient(mapL2);
        AFd1pSDK<String> aFd1pSDKD = d(mapL2, str);
        if (aFd1pSDKD != null && (aFd1oSDK = aFd1pSDKD.unregisterClient) != null) {
            str2 = aFd1oSDK.d;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(mapL2);
            AFg1bSDK.registerClient(this + ": preparing data: ", jSONObject);
            AFd1uSDK aFKeystoreWrapper = getAFKeystoreWrapper();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFKeystoreWrapper.AFKeystoreWrapper(str2, string);
        }
        return aFd1pSDKD;
    }

    public boolean AFLoggerLogLevel() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Nullable
    public abstract AFd1pSDK<String> d(@NotNull Map<String, Object> map, @NotNull String str);

    @Nullable
    public String registerClient(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public void registerClient(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.afWarnLog.d.d.getPackageName());
        String str2 = this.afWarnLog.registerClient.valueOf;
        if (str2 != null) {
            map.put("cuid", str2);
        }
        map.put("app_version_name", this.afWarnLog.r_().versionName);
        if (AFLoggerLogLevel()) {
            map.put("event_timestamp", Long.valueOf(this.afInfoLog.unregisterClient()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}

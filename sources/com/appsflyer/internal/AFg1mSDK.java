package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.AFInAppEventParameterName;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import defpackage.C1039Gc0;
import defpackage.C4564j;
import defpackage.C5491nL;
import defpackage.F62;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1mSDK extends AFe1kSDK<Map<String, ? extends Object>> {

    @Nullable
    private final AppsFlyerConversionListener AFLoggerLogLevel;

    @NotNull
    private final AFh1xSDK afDebugLog;

    @Nullable
    private String afInfoLog;

    @Nullable
    private Map<String, ? extends Object> afWarnLog;

    @NotNull
    private final AFc1iSDK force;

    @NotNull
    private final AFc1kSDK v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFg1mSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.GCDSDK, new AFe1zSDK[]{AFd1bSDK.RC_CDN}, aFc1bSDK, "GCD-FETCH");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
        this.force = aFc1iSDKAFLogger;
        AFc1kSDK aFc1kSDKAFKeystoreWrapper = aFc1bSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(aFc1kSDKAFKeystoreWrapper, "");
        this.v = aFc1kSDKAFKeystoreWrapper;
        AFh1xSDK aFh1xSDKE = aFc1bSDK.e();
        Intrinsics.checkNotNullExpressionValue(aFh1xSDKE, "");
        this.afDebugLog = aFh1xSDKE;
        this.AFLoggerLogLevel = aFc1bSDK.setUserFirstName();
        AFd1bSDK aFd1bSDK = AFd1bSDK.CONVERSION;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        this.AFKeystoreWrapper.add(aFd1bSDK);
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.LAUNCH;
        Intrinsics.checkNotNullParameter(aFd1bSDK2, "");
        this.AFKeystoreWrapper.add(aFd1bSDK2);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        super.force();
        Map<String, ? extends Object> map = this.afWarnLog;
        if (map != null) {
            AFg1kSDK.d(map, this.AFLoggerLogLevel);
            return;
        }
        String str = this.afInfoLog;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            str = "Unknown error";
        }
        AFg1kSDK.registerClient(str, this.AFLoggerLogLevel);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:79:0x0135 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() {
        AFd1cSDK aFd1cSDK;
        String str;
        if (getUnregisterClient().AFLogger()) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-E03] 'isStopTracking' enabled", false, 4, null);
            this.afInfoLog = "'isStopTracking' enabled";
            throw new AFe1qSDK();
        }
        int i = 0;
        while (i < 3) {
            boolean z = i == 2;
            this.afDebugLog.afDebugLog = System.currentTimeMillis();
            try {
                try {
                    super.registerClient();
                    ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        boolean z2 = statusCode == 403 || statusCode >= 500;
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Object body = responseNetwork.getBody();
                            Intrinsics.c(body, "");
                            Map<String, ? extends Object> mapC = F62.c(body);
                            if (responseNetwork.getStatusCode() == 404) {
                                mapC.remove("error_reason");
                                mapC.remove("status_code");
                                mapC.put("af_status", "Organic");
                                mapC.put("af_message", "organic install");
                            }
                            Object obj = mapC.get("iscache");
                            Boolean bool = Boolean.FALSE;
                            if (Intrinsics.a(obj, bool)) {
                                this.v.AFLogger("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (mapC.containsKey("af_siteid")) {
                                if (mapC.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    str = "[Invite] Detected App-Invite via channel: " + mapC.get(AFInAppEventParameterName.AF_CHANNEL);
                                } else {
                                    str = String.format("[CrossPromotion] App was installed via %s's Cross Promotion", Arrays.copyOf(new Object[]{mapC.get("af_siteid")}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str, "");
                                }
                                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, str, false, 4, null);
                            }
                            mapC.put("is_first_launch", bool);
                            this.v.d("attributionId", new JSONObject(mapC).toString());
                            if (!this.v.AFKeystoreWrapper("sixtyDayConversionData")) {
                                mapC.put("is_first_launch", Boolean.TRUE);
                            }
                            this.afWarnLog = mapC;
                            aFd1cSDK = AFd1cSDK.SUCCESS;
                        } else if (z || !z2) {
                            this.afInfoLog = "Error connection to server: " + statusCode;
                            aFd1cSDK = AFd1cSDK.FAILURE;
                        }
                        if (aFd1cSDK == null) {
                            this.afDebugLog.AFLogger(i);
                            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                            return aFd1cSDK;
                        }
                        this.afDebugLog.AFLogger(i);
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                        i++;
                    }
                    aFd1cSDK = null;
                    if (aFd1cSDK == null) {
                        this.afDebugLog.AFLogger(i);
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                        return aFd1cSDK;
                    }
                    this.afDebugLog.AFLogger(i);
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                    i++;
                } catch (AFe1uSDK e) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-E05] AppsFlyer dev key is missing", false, 4, null);
                    this.afInfoLog = "AppsFlyer dev key is missing";
                    throw e;
                } catch (Exception e2) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    LogTag logTag = LogTag.GCD;
                    String message = e2.getMessage();
                    if (message == null) {
                        message = "unknown error during GCD fetch";
                    }
                    AFLoggerBase.e$default(aFLogger, logTag, "[GCD] Error: " + message, e2, true, false, false, false, 64, null);
                    if (z) {
                        this.afInfoLog = e2.getMessage();
                        throw e2;
                    }
                    this.afDebugLog.AFLogger(i);
                    AFLoggerBase.d$default(aFLogger, logTag, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                }
            } catch (Throwable th) {
                this.afDebugLog.AFLogger(i);
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                throw th;
            }
        }
        return AFd1cSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<Map<String, ? extends Object>> AFLogger(@NotNull String str) {
        String strConcat = "";
        Intrinsics.checkNotNullParameter(str, "");
        AFc1kSDK aFc1kSDK = this.v;
        String strAFLogger = this.force.AFLogger("CHANNEL");
        if (strAFLogger != null && strAFLogger.equals("")) {
            strAFLogger = null;
        }
        String strD = AFa1tSDK.d(aFc1kSDK, strAFLogger);
        if (strD != null && !StringsKt.I(strD)) {
            List list = AFg1jSDK.AFKeystoreWrapper;
            Locale locale = Locale.ROOT;
            if (list.contains(C4564j.g(locale, "", strD, locale, ""))) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, C1039Gc0.d("[GCD] AF detected using redundant Google-Play channel for attribution - ", strD, ". Using without channel postfix."), false, 4, null);
            } else {
                strConcat = "-".concat(strD);
            }
        }
        AFd1pSDK<Map<String, ? extends Object>> aFd1pSDKAFKeystoreWrapper = getD().AFKeystoreWrapper(strConcat, str);
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, C5491nL.c("[GCD-B01] URL: ", aFd1pSDKAFKeystoreWrapper.unregisterClient.d), false, 4, null);
        Intrinsics.checkNotNull(aFd1pSDKAFKeystoreWrapper);
        return aFd1pSDKAFKeystoreWrapper;
    }
}

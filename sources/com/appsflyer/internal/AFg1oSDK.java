package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C1717Ot1;
import defpackage.C1795Pt1;
import defpackage.C4564j;
import defpackage.C5491nL;
import defpackage.C5886pC1;
import defpackage.InterfaceC3770fO0;
import defpackage.OW0;
import defpackage.PW0;
import defpackage.WE;
import defpackage.XO0;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1oSDK implements AFg1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AppsFlyerLib = 0;
    private static int getLevel = 1;

    @NotNull
    private final AFg1qSDK AFKeystoreWrapper;

    @NotNull
    private final Context AFLogger;

    @NotNull
    private final AFc1eSDK AFLoggerLogLevel;

    @NotNull
    private final InterfaceC3770fO0 afDebugLog;

    @NotNull
    private final AppsFlyerProperties afErrorLog;

    @NotNull
    private final AFf1bSDK afInfoLog;

    @NotNull
    private final AFd1zSDK afWarnLog;

    @NotNull
    private final AFj1cSDK d;

    @NotNull
    private final AFc1kSDK e;

    @NotNull
    private final AFi1vSDK force;

    @NotNull
    private final AFc1iSDK i;

    @NotNull
    private final AFj1ySDK registerClient;

    @NotNull
    private final AFg1wSDK unregisterClient;

    @NotNull
    private final AFh1xSDK v;

    @NotNull
    private final AFf1fSDK w;
    private static char[] valueOf = {13891, 31402, 44955, 53476, 1481, 46615, 64288, 11290, 20859, 33360, 14001, 31619, 44172, 53759, 724, 17751, 2465, 56472, 41961, 30409};
    private static long getEntries = 8025551254644932716L;

    public AFg1oSDK(@NotNull Context context, @NotNull AFj1cSDK aFj1cSDK, @NotNull AFg1wSDK aFg1wSDK, @NotNull AFj1ySDK aFj1ySDK, @NotNull AFg1qSDK aFg1qSDK, @NotNull AFh1xSDK aFh1xSDK, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFi1vSDK aFi1vSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFf1bSDK aFf1bSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFj1cSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFi1vSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1bSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFLogger = context;
        this.d = aFj1cSDK;
        this.unregisterClient = aFg1wSDK;
        this.registerClient = aFj1ySDK;
        this.AFKeystoreWrapper = aFg1qSDK;
        this.v = aFh1xSDK;
        this.e = aFc1kSDK;
        this.i = aFc1iSDK;
        this.force = aFi1vSDK;
        this.w = aFf1fSDK;
        this.afWarnLog = aFd1zSDK;
        this.afInfoLog = aFf1bSDK;
        this.AFLoggerLogLevel = aFc1eSDK;
        this.afErrorLog = appsFlyerProperties;
        this.afDebugLog = XO0.b(new C5886pC1(1));
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = aFg1oSDK.AFLoggerLogLevel.getOutOfStore;
        if (str != null) {
            map.put("net_token", str);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Network token added to event", false, 4, null);
            return null;
        }
        int i = AppsFlyerLib + 17;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final SimpleDateFormat AFLogger() {
        int i = getLevel + 121;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            throw null;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afDebugLog.getValue();
        AppsFlyerLib = (getLevel + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return simpleDateFormat;
    }

    private static void AFLoggerLogLevel(@NotNull Map<String, Object> map) {
        getLevel = (AppsFlyerLib + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 16, (char) (18880 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 5 - View.MeasureSpec.getMode(0), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i = AppsFlyerLib + 29;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void AppsFlyerLib(@NotNull Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 291205159, -291205155, System.identityHashCode(this));
    }

    private static List<AFd1bSDK> afDebugLog() {
        return (List) unregisterClient(new Object[0], 1713251753, -1713251742, (int) System.currentTimeMillis());
    }

    @SuppressLint({"HardwareIds"})
    private final String afErrorLog() {
        String strD = this.e.d("androidIdCached");
        try {
            String string = Settings.Secure.getString(this.AFLogger.getContentResolver(), "android_id");
            if (string != null) {
                return string;
            }
        } catch (Exception e) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DEVICE_DATA;
            String message = e.getMessage();
            if (message == null) {
                AppsFlyerLib = (getLevel + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
                message = "Failed to retrieve Android ID from Settings.Secure";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, e, false, false, false, false, 120, null);
            AppsFlyerLib = (getLevel + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (strD == null) {
            return null;
        }
        AppsFlyerLib = (getLevel + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, C5491nL.c("Using cached Android ID (current retrieval failed): ", strD), false, 4, null);
        return strD;
    }

    private final boolean afInfoLog() {
        if (this.AFLoggerLogLevel.afWarnLog) {
            return true;
        }
        int i = AppsFlyerLib + 21;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
            if (!AFj1qSDK.AFLogger(this.AFLogger)) {
                return true;
            }
        } else if (!AFj1qSDK.AFLogger(this.AFLogger)) {
            return true;
        }
        AppsFlyerLib = (getLevel + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return false;
    }

    private final void afWarnLog(Map<String, Object> map) {
        AppsFlyerLib = (getLevel + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        UiModeManager uiModeManager = (UiModeManager) this.AFLogger.getSystemService(UiModeManager.class);
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        int i = getLevel + 117;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            map.put("tv", Boolean.TRUE);
            int i2 = 93 / 0;
        } else {
            map.put("tv", Boolean.TRUE);
        }
        getLevel = (AppsFlyerLib + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private void e(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1xSDK aFh1xSDK = this.v;
        HashMap map2 = new HashMap(aFh1xSDK.AFLogger);
        aFh1xSDK.AFLogger.clear();
        aFh1xSDK.AFKeystoreWrapper.AFLogger("gcd");
        Intrinsics.checkNotNull(map2);
        if (map2.isEmpty()) {
            getLevel = (AppsFlyerLib + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            AppsFlyerLib = (getLevel + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFj1iSDK.AFLogger(map).put("gcd", map2);
        }
    }

    private void enableTCFDataCollection(@NotNull Map<String, Object> map) {
        AppsFlyerLib = (getLevel + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.i.AFKeystoreWrapper(this.AFLogger)));
        getLevel = (AppsFlyerLib + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static /* synthetic */ Object force(Object[] objArr) {
        AFd1nSDK aFd1nSDK;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        AFc1eSDK aFc1eSDK = aFg1oSDK.i.registerClient;
        if (aFc1eSDK.setAndroidIdData) {
            int i = getLevel + 45;
            AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 != 0) {
                Map<String, Object> map = aFh1pSDK.d;
                Intrinsics.checkNotNullExpressionValue(map, "");
                AFj1iSDK.AFLogger(map).put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
            Map<String, Object> map2 = aFh1pSDK.d;
            Intrinsics.checkNotNullExpressionValue(map2, "");
            AFj1iSDK.AFLogger(map2).put("ad_ids_disabled", Boolean.TRUE);
            getLevel = (AppsFlyerLib + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            AFh1qSDK aFh1qSDK = aFc1eSDK.updateServerUninstallToken;
            if (aFh1qSDK == null) {
                return null;
            }
            String str = aFh1qSDK.v;
            if (!(str == null || str.length() == 0)) {
                aFh1pSDK.AFKeystoreWrapper("gaidError", aFh1qSDK.v);
            }
            String str2 = aFh1qSDK.d;
            if (str2 != null) {
                getLevel = (AppsFlyerLib + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (aFh1qSDK.unregisterClient != null) {
                    aFh1pSDK.AFKeystoreWrapper("advertiserId", str2);
                    aFh1pSDK.AFKeystoreWrapper("advertiserIdEnabled", String.valueOf(aFh1qSDK.unregisterClient));
                    aFh1pSDK.AFKeystoreWrapper("isGaidWithGps", String.valueOf(aFh1qSDK.AFLogger));
                }
            }
        }
        AFh1qSDK aFh1qSDK2 = aFg1oSDK.i.registerClient.updateServerUninstallToken;
        aFh1pSDK.AFKeystoreWrapper("GAID_retry", String.valueOf(aFh1qSDK2 != null ? Intrinsics.a(aFh1qSDK2.i, Boolean.TRUE) : false));
        if (CollectionsKt.z(WE.f(AFd1bSDK.CONVERSION, AFd1bSDK.LAUNCH), aFh1pSDK.AFKeystoreWrapper()) && (aFd1nSDK = aFg1oSDK.AFLoggerLogLevel.setOaidData) != null) {
            Map<String, Object> map3 = aFh1pSDK.d;
            Intrinsics.checkNotNullExpressionValue(map3, "");
            AFj1iSDK.AFLogger(map3).put("fetchAdIdLatency", Long.valueOf(aFd1nSDK.registerClient));
        }
        return null;
    }

    private void getEntries(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j = this.v.afInfoLog;
        if (j != 0) {
            getLevel = (AppsFlyerLib + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("prev_session_dur", Long.valueOf(j));
        }
        getLevel = (AppsFlyerLib + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private void getInstance(@NotNull Map<String, Object> map) {
        int i = AppsFlyerLib + 29;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.e.registerClient("is_stop_tracking_used");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (!(!this.e.registerClient("is_stop_tracking_used"))) {
            map.put("istu", String.valueOf(this.e.AFKeystoreWrapper("is_stop_tracking_used")));
        }
        int i2 = getLevel + 19;
        AppsFlyerLib = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r0
      0x002b: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v18 java.lang.String) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    private void getLevel(@NotNull Map<String, Object> map) {
        String strAFLogger;
        boolean z;
        int i = getLevel + 39;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean z2 = false;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            strAFLogger = this.i.AFLogger("CHANNEL");
            int i2 = 94 / 0;
            if (strAFLogger != null) {
                if (strAFLogger.equals("")) {
                    AppsFlyerLib = (getLevel + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    strAFLogger = null;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            strAFLogger = this.i.AFLogger("CHANNEL");
            if (strAFLogger != null) {
                if (strAFLogger.equals("")) {
                    AppsFlyerLib = (getLevel + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    strAFLogger = null;
                }
            }
        }
        String strRegisterClient = registerClient(this.e, strAFLogger);
        if (strRegisterClient == null || strRegisterClient.equals(strAFLogger)) {
            z = false;
        } else {
            AppsFlyerLib = (getLevel + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z = true;
        }
        if (strRegisterClient == null && strAFLogger != null) {
            z2 = true;
        }
        if (z) {
            map.put("af_latestchannel", strAFLogger);
        } else {
            AppsFlyerLib = (getLevel + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (z2) {
                map.put("af_latestchannel", strAFLogger);
            }
        }
        String strForce = force();
        if (strForce != null) {
            Locale locale = Locale.ROOT;
            map.put("af_installstore", C4564j.g(locale, "", strForce, locale, ""));
        }
        String strW = w();
        if (strW != null) {
            Locale locale2 = Locale.ROOT;
            map.put("af_preinstall_name", C4564j.g(locale2, "", strW, locale2, ""));
        }
        String strE = e();
        if (strE != null) {
            Locale locale3 = Locale.ROOT;
            map.put("af_currentstore", C4564j.g(locale3, "", strE, locale3, ""));
        }
    }

    private void getSdkVersion(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFb1lSDK aFb1lSDKH_ = AFb1iSDK.h_(this.AFLogger.getContentResolver());
        if (aFb1lSDKH_ != null) {
            int i = AppsFlyerLib + 107;
            getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 == 0) {
                map.put("amazon_aid", aFb1lSDKH_.d);
                map.put("amazon_aid_limit", String.valueOf(aFb1lSDKH_.AFLogger));
                throw null;
            }
            map.put("amazon_aid", aFb1lSDKH_.d);
            map.put("amazon_aid_limit", String.valueOf(aFb1lSDKH_.AFLogger));
            int i2 = getLevel + 63;
            AppsFlyerLib = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.AFLoggerLogLevel.AppsFlyerLib;
        String string = this.afErrorLog.getString(AppsFlyerProperties.ONELINK_VERSION);
        if (str != null) {
            int i = getLevel + 91;
            AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 != 0) {
                map.put("onelink_id", str);
                int i2 = 59 / 0;
            } else {
                map.put("onelink_id", str);
            }
        }
        if (string != null) {
            getLevel = (AppsFlyerLib + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("onelink_ver", string);
            AppsFlyerLib = (getLevel + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i3 = AppsFlyerLib + 47;
        getLevel = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0054  */
    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    /* JADX WARN: Code duplicated, block: B:13:0x006c  */
    private void onPause(@NotNull Map<String, Object> map) {
        int i;
        int i2 = AppsFlyerLib + 99;
        getLevel = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            boolean zRegisterClient = AFg1vSDK.registerClient(this.AFLogger);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.UNINSTALL, "didConfigureTokenRefreshService=" + zRegisterClient, false, 4, null);
            if (!zRegisterClient) {
                i = AppsFlyerLib + 69;
                getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i % 2 == 0) {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                    int i3 = 11 / 0;
                } else {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            boolean zRegisterClient2 = AFg1vSDK.registerClient(this.AFLogger);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.UNINSTALL, "didConfigureTokenRefreshService=" + zRegisterClient2, false, 4, null);
            if (!zRegisterClient2) {
                i = AppsFlyerLib + 69;
                getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i % 2 == 0) {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                    int i4 = 11 / 0;
                } else {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                }
            }
        }
        map.put("registeredUninstall", Boolean.valueOf(this.e.AFKeystoreWrapper("sentRegisterRequestToAF")));
    }

    @NotNull
    private Long registerClient() {
        int i = AppsFlyerLib + 15;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            return Long.valueOf(this.i.r_().firstInstallTime);
        }
        int i2 = 28 / 0;
        return Long.valueOf(this.i.r_().firstInstallTime);
    }

    private void setImeiData(@NotNull Map<String, Object> map) {
        String strRegisterClient;
        Intrinsics.checkNotNullParameter(map, "");
        String strAFLogger = this.i.AFLogger("AF_COLLECT_FACEBOOK_ATTR_ID");
        if (strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : true) {
            try {
                this.AFLogger.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                strRegisterClient = this.i.registerClient(this.AFLogger);
            } catch (Throwable unused) {
                strRegisterClient = null;
            }
            if ((strRegisterClient != null ? ']' : (char) 14) != 14) {
                AppsFlyerLib = (getLevel + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
                map.put("fb", strRegisterClient);
            }
        }
        AppsFlyerLib = (getLevel + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private void setOaidData(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFf1fSDK aFf1fSDK = this.w;
        String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK));
        if (str != null && str.length() != 0) {
            int i = AppsFlyerLib + 109;
            getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 == 0) {
                map.put("appsflyerKey", str);
                throw null;
            }
            map.put("appsflyerKey", str);
        }
        getLevel = (AppsFlyerLib + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void stop(@NotNull Map<String, Object> map) {
        Locale locale;
        int i = getLevel + 35;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        String str = "";
        try {
            if (i % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                throw null;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Locale locale2 = Locale.getDefault();
            map.put("lang", locale2.getDisplayLanguage());
            locale = locale2;
            try {
                map.put("lang_code", locale.getLanguage());
            } catch (Exception e) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device language code", e, false, false, false, false, 120, null);
            }
            try {
                map.put("country", locale.getCountry());
            } catch (Exception e2) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device country code", e2, false, false, false, false, 120, null);
            }
        } catch (Exception e3) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device display language name", e3, false, false, false, false, 120, null);
            map.put("lang", "".getLanguage());
            locale = str;
        }
    }

    public static /* synthetic */ Object unregisterClient(Object[] objArr, int i, int i2, int i3) {
        long seconds;
        int i4 = ~i3;
        int i5 = ~i;
        int i6 = ~i2;
        switch ((((~(i | i6)) | (~(i2 | i5))) * 662) + (((~(i3 | i2)) | (~(i | i3))) * (-1324)) + ((i4 | (~(i5 | i6))) * 1324) + (i2 * (-661)) + (i * (-661))) {
            case 1:
                return unregisterClient(objArr);
            case 2:
                return d(objArr);
            case 3:
                return registerClient(objArr);
            case 4:
                AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
                Map map = (Map) objArr[1];
                getLevel = (AppsFlyerLib + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
                Intrinsics.checkNotNullParameter(map, "");
                long jUnregisterClient = aFg1oSDK.e.unregisterClient("AppsFlyerTimePassedSincePrevLaunch", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                aFg1oSDK.e.AFLogger("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
                if (jUnregisterClient > 0) {
                    seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - jUnregisterClient);
                    AppsFlyerLib = (getLevel + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                } else {
                    AppsFlyerLib = (getLevel + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    seconds = -1;
                }
                map.put("timepassedsincelastlaunch", String.valueOf(seconds));
                return null;
            case 5:
                return AFLogger(objArr);
            case 6:
                return force(objArr);
            case 7:
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSizeLong = statFs.getBlockSizeLong();
                long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                double dPow = Math.pow(2.0d, 20.0d);
                String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
                getLevel = (AppsFlyerLib + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return str;
            case 8:
                return v(objArr);
            case 9:
                AFg1oSDK aFg1oSDK2 = (AFg1oSDK) objArr[0];
                Map map2 = (Map) objArr[1];
                getLevel = (AppsFlyerLib + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (!(!AFg1iSDK.registerClient(aFg1oSDK2.AFLogger))) {
                    map2.put("inst_app", Boolean.TRUE);
                    getLevel = (AppsFlyerLib + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                return null;
            case 10:
                return e(objArr);
            case 11:
                AppsFlyerLib = (getLevel + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
                List listF = WE.f(AFd1bSDK.CONVERSION, AFd1bSDK.LAUNCH, AFd1bSDK.INAPP, AFd1bSDK.MANUAL_PURCHASE_VALIDATION, AFd1bSDK.ARS_VALIDATE, AFd1bSDK.PURCHASE_VALIDATE, AFd1bSDK.ADREVENUE);
                AppsFlyerLib = (getLevel + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return listF;
            default:
                return AFKeystoreWrapper(objArr);
        }
    }

    private final void v(Map<String, Object> map) {
        try {
            long jLongValue = registerClient().longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            int i = getLevel + 107;
            AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve or format app install date", e, false, false, false, false, 120, null);
        }
    }

    private void valueOf(@NotNull Map<String, Object> map) {
        Object objRegisterClient;
        String strAFLogger;
        int i = AppsFlyerLib + 75;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1uSDK aFa1uSDK = AFa1uSDK.INSTANCE;
            objRegisterClient = AFa1uSDK.registerClient(this.afErrorLog);
            strAFLogger = AFa1uSDK.AFLogger(this.afErrorLog);
            int i2 = 62 / 0;
            if (objRegisterClient == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1uSDK aFa1uSDK2 = AFa1uSDK.INSTANCE;
            objRegisterClient = AFa1uSDK.registerClient(this.afErrorLog);
            strAFLogger = AFa1uSDK.AFLogger(this.afErrorLog);
            if (objRegisterClient == null) {
                return;
            }
        }
        if (strAFLogger != null) {
            int i3 = AppsFlyerLib + 55;
            getLevel = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i3 % 2 == 0) {
                Integer.parseInt(strAFLogger);
                throw null;
            }
            if (Integer.parseInt(strAFLogger) > 0) {
                map.put("reinstallCounter", strAFLogger);
                map.put("originalAppsflyerId", objRegisterClient);
            }
        }
    }

    private void values(@NotNull Map<String, Object> map) {
        int i = getLevel + 91;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.afInfoLog.AFKeystoreWrapper());
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.afInfoLog.AFKeystoreWrapper());
            int i2 = 55 / 0;
        }
    }

    @Nullable
    private String w() {
        String string = this.afErrorLog.getString("preInstallName");
        if (string != null) {
            AppsFlyerLib = (getLevel + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return string;
        }
        String strD = this.e.d("preInstallName");
        if (strD != null) {
            this.afErrorLog.set("preInstallName", strD);
            getLevel = (AppsFlyerLib + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return strD;
        }
        String strAfWarnLog = afWarnLog();
        if (strAfWarnLog == null) {
            int i = getLevel + 15;
            AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 != 0) {
                strAfWarnLog = registerClient("AF_PRE_INSTALL_NAME");
                int i2 = 42 / 0;
            } else {
                strAfWarnLog = registerClient("AF_PRE_INSTALL_NAME");
            }
        }
        if (strAfWarnLog != null) {
            this.e.d("preInstallName", strAfWarnLog);
            this.afErrorLog.set("preInstallName", strAfWarnLog);
            getLevel = (AppsFlyerLib + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        return strAfWarnLog;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r0
      0x0025: PHI (r0v5 java.lang.Object) = (r0v4 java.lang.Object), (r0v21 java.lang.Object) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFg1rSDK
    public final void d(@NotNull Map<String, Object> map) {
        Object obj;
        Object obj2;
        int i = AppsFlyerLib + 77;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            obj = this.AFLoggerLogLevel.values;
            int i2 = 25 / 0;
            if (obj != null) {
                map.put("appid", obj);
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            obj = this.AFLoggerLogLevel.values;
            if (obj != null) {
                map.put("appid", obj);
            }
        }
        String str = this.AFLoggerLogLevel.stop;
        if (str != null) {
            if (str.length() != 3) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.GENERAL;
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(str);
                sb.append("' is not a legal value.");
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                AFLoggerBase.w$default(aFLogger, logTag, string, false, 4, null);
            }
            map.put("currency", str);
        }
        map.put("isUpdate", Boolean.valueOf(this.AFLoggerLogLevel.getEntries));
        Object obj3 = this.AFLoggerLogLevel.getSdkVersion;
        if (obj3 != null) {
            map.put("customData", obj3);
        }
        Object obj4 = this.AFLoggerLogLevel.valueOf;
        if (obj4 != null) {
            int i3 = AppsFlyerLib + 65;
            getLevel = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i3 % 2 == 0) {
                map.put("appUserId", obj4);
                throw null;
            }
            map.put("appUserId", obj4);
        }
        AFb1rSDK aFb1rSDK = this.AFLoggerLogLevel.w;
        if (aFb1rSDK != null) {
            int i4 = getLevel + 47;
            AppsFlyerLib = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                obj2 = aFb1rSDK.AFKeystoreWrapper;
                int i5 = 69 / 0;
                if (obj2 == null) {
                    return;
                }
            } else {
                obj2 = aFb1rSDK.AFKeystoreWrapper;
                if (obj2 == null) {
                    return;
                }
            }
            map.put("sharing_filter", obj2);
        }
    }

    private static void a(int i, char c, int i2, Object[] objArr) {
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        long[] jArr = new long[i2];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i3 = aFk1qSDK.unregisterClient;
            if (i3 >= i2) {
                break;
            }
            $11 = ($10 + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
            jArr[i3] = (((long) ((char) (((long) valueOf[i + i3]) ^ 7057235384081779850L))) ^ (((long) i3) * (7057235384081779850L ^ getEntries))) ^ ((long) c);
            aFk1qSDK.unregisterClient = i3 + 1;
        }
        char[] cArr = new char[i2];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i4 = aFk1qSDK.unregisterClient;
            if (i4 >= i2) {
                String str = new String(cArr);
                $11 = ($10 + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
                objArr[0] = str;
                return;
            } else {
                cArr[i4] = (char) jArr[i4];
                aFk1qSDK.unregisterClient = i4 + 1;
                $11 = ($10 + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, -1009892585, 1009892590, System.identityHashCode(this));
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AppsFlyerLib = (getLevel + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = AppsFlyerLib + 45;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            return Long.valueOf(jCurrentTimeMillis);
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFLogger(@NotNull AFh1pSDK aFh1pSDK) {
        getLevel = (AppsFlyerLib + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        v(map);
        Map<String, Object> map2 = aFh1pSDK.d;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        unregisterClient(map2, aFh1pSDK.afWarnLog);
        Map<String, Object> map3 = aFh1pSDK.d;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        getLevel(map3);
        Map<String, Object> map4 = aFh1pSDK.d;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        enableTCFDataCollection(map4);
        Map<String, Object> map5 = aFh1pSDK.d;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        setImeiData(map5);
        Map<String, Object> map6 = aFh1pSDK.d;
        Intrinsics.checkNotNullExpressionValue(map6, "");
        AFe1zSDK aFe1zSDKAFKeystoreWrapper = aFh1pSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(aFe1zSDKAFKeystoreWrapper, "");
        unregisterClient(map6, aFe1zSDKAFKeystoreWrapper);
        int i = getLevel + 63;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void registerClient(@NotNull Map<String, Object> map) {
        Object objA;
        AFLogger aFLogger;
        LogTag logTag;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        int i;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.AFLoggerLogLevel.unregisterClient;
        if (str2 != null) {
            int i2 = getLevel + 43;
            AppsFlyerLib = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i2 % 2 == 0) {
                if (map.get("af_deeplink") != null) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GENERAL, "Skipping push payload processing: deeplink already extracted from intent", false, 4, null);
                } else {
                    try {
                        C1717Ot1.a aVar = C1717Ot1.e;
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.put("isPush", "true");
                        map.put("af_deeplink", jSONObject.toString());
                        objA = Unit.a;
                    } catch (Throwable th) {
                        C1717Ot1.a aVar2 = C1717Ot1.e;
                        objA = C1795Pt1.a(th);
                    }
                    Throwable thA = C1717Ot1.a(objA);
                    if (thA != null) {
                        int i3 = AppsFlyerLib + 17;
                        getLevel = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i3 % 2 == 0) {
                            aFLogger = AFLogger.INSTANCE;
                            logTag = LogTag.GENERAL;
                            z = false;
                            z2 = true;
                            str = "Exception while trying to create JSONObject from pushPayload";
                            z3 = true;
                            z4 = false;
                            i = 27;
                        } else {
                            aFLogger = AFLogger.INSTANCE;
                            logTag = LogTag.GENERAL;
                            z = false;
                            z2 = false;
                            str = "Exception while trying to create JSONObject from pushPayload";
                            z3 = false;
                            z4 = false;
                            i = 120;
                        }
                        AFLoggerBase.e$default(aFLogger, logTag, str, thA, z3, z4, z, z2, i, null);
                    }
                }
            } else {
                map.get("af_deeplink");
                throw null;
            }
        } else {
            getLevel = (AppsFlyerLib + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        this.AFLoggerLogLevel.unregisterClient = null;
    }

    private final void afInfoLog(Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 884869374, -884869365, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFKeystoreWrapper(@NotNull AFh1pSDK aFh1pSDK) {
        boolean z;
        int i = getLevel + 95;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1pSDK, "");
            Map<String, Object> map = aFh1pSDK.d;
            Intrinsics.checkNotNull(map);
            if (aFh1pSDK.v == null) {
                getLevel = (AppsFlyerLib + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (aFh1pSDK.w == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            d(map, z);
            AFLoggerLogLevel(map);
            stop(map);
            AFLogger(map);
            registerClient(map, this.AFLoggerLogLevel.force);
            getSdkVersion(map);
            map.put("cell", PW0.e(new Pair("mcc", Integer.valueOf(this.AFLogger.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.AFLogger.getResources().getConfiguration().mnc))));
            map.put("sig", d());
            map.put("last_boot_time", Long.valueOf(AFKeystoreWrapper()));
            map.put("disk", (String) unregisterClient(new Object[0], -137455512, 137455519, (int) System.currentTimeMillis()));
            AppsFlyerLib = (getLevel + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Intrinsics.checkNotNull(aFh1pSDK.d);
        throw null;
    }

    private final String afWarnLog() {
        File fileAFKeystoreWrapper = AFKeystoreWrapper(AFLogger("ro.appsflyer.preinstall.path"));
        if (AFLogger(fileAFKeystoreWrapper)) {
            fileAFKeystoreWrapper = AFKeystoreWrapper(registerClient("AF_PRE_INSTALL_PATH"));
            getLevel = (AppsFlyerLib + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (AFLogger(fileAFKeystoreWrapper)) {
            fileAFKeystoreWrapper = AFKeystoreWrapper("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFLogger(fileAFKeystoreWrapper)) {
            fileAFKeystoreWrapper = AFKeystoreWrapper("/etc/pre_install.appsflyer");
        }
        if (AFLogger(fileAFKeystoreWrapper)) {
            AppsFlyerLib = (getLevel + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return null;
        }
        String packageName = this.AFLogger.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return (String) unregisterClient(new Object[]{fileAFKeystoreWrapper, packageName}, 238881636, -238881626, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat AFLoggerLogLevel() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        int i = getLevel + 125;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    @Nullable
    private String e() {
        int i = getLevel + 29;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            String strRegisterClient = this.AFLoggerLogLevel.getLevel;
            if (strRegisterClient == null) {
                strRegisterClient = registerClient("AF_STORE");
            }
            int i2 = AppsFlyerLib + 41;
            getLevel = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i2 % 2 == 0) {
                int i3 = 85 / 0;
            }
            return strRegisterClient;
        }
        String str = this.AFLoggerLogLevel.getLevel;
        throw null;
    }

    private static /* synthetic */ Object v(Object[] objArr) {
        String str;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = getLevel + 71;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            AFg1wSDK.AFa1vSDK aFa1vSDKRegisterClient = aFg1oSDK.unregisterClient.registerClient(aFg1oSDK.AFLogger);
            float f = aFa1vSDKRegisterClient.unregisterClient;
            str = aFa1vSDKRegisterClient.AFLogger;
            map.put("btl", String.valueOf(f));
            int i2 = 14 / 0;
            if (str == null) {
                return null;
            }
        } else {
            AFg1wSDK.AFa1vSDK aFa1vSDKRegisterClient2 = aFg1oSDK.unregisterClient.registerClient(aFg1oSDK.AFLogger);
            float f2 = aFa1vSDKRegisterClient2.unregisterClient;
            String str2 = aFa1vSDKRegisterClient2.AFLogger;
            map.put("btl", String.valueOf(f2));
            if (str2 == null) {
                return null;
            }
            str = str2;
        }
        map.put("btch", str);
        AppsFlyerLib = (getLevel + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return null;
    }

    private boolean i() {
        int i = getLevel + 93;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            return Boolean.parseBoolean(this.e.d("sentSuccessfully"));
        }
        Boolean.parseBoolean(this.e.d("sentSuccessfully"));
        throw null;
    }

    private final void w(Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 1429136643, -1429136643, System.identityHashCode(this));
    }

    private final void afErrorLog(Map<String, Object> map) {
        getLevel = (AppsFlyerLib + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
        map.put("batteryLevel", String.valueOf(this.unregisterClient.registerClient(this.AFLogger).unregisterClient));
        int i = AppsFlyerLib + 47;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        Throwable th2;
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        if (file == null) {
            int i = getLevel + 67;
            AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 != 0) {
                throw null;
            }
        } else {
            try {
                Properties properties = new Properties();
                inputStreamReader2 = new InputStreamReader(io.sentry.instrumentation.file.f.a.a(file, new FileInputStream(file)), Charset.defaultCharset());
                try {
                    properties.load(inputStreamReader2);
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    LogTag logTag = LogTag.PREINSTALL;
                    AFLoggerBase.i$default(aFLogger, logTag, "Preinstall configuration file found and loaded successfully", false, 4, null);
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader2.close();
                        return property;
                    } catch (Throwable th3) {
                        String message = th3.getMessage();
                        AFLoggerBase.e$default(aFLogger, logTag, "Error closing preinstall configuration file reader: ".concat(message != null ? message : "unknown error"), th3, false, false, false, false, 120, null);
                        return property;
                    }
                } catch (FileNotFoundException unused) {
                    try {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.PREINSTALL, "Preinstall configuration file not found at path: " + file.getAbsolutePath(), false, 4, null);
                        if (inputStreamReader2 != null) {
                            try {
                                inputStreamReader2.close();
                            } catch (Throwable th4) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                LogTag logTag2 = LogTag.PREINSTALL;
                                String message2 = th4.getMessage();
                                AFLoggerBase.e$default(aFLogger2, logTag2, "Error closing preinstall configuration file reader: ".concat(message2 != null ? message2 : "unknown error"), th4, false, false, false, false, 120, null);
                            }
                        }
                        return null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader == null) {
                            AppsFlyerLib = (getLevel + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            throw th2;
                        }
                        try {
                            inputStreamReader.close();
                            throw th2;
                        } catch (Throwable th6) {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            LogTag logTag3 = LogTag.PREINSTALL;
                            String message3 = th6.getMessage();
                            AFLoggerBase.e$default(aFLogger3, logTag3, "Error closing preinstall configuration file reader: ".concat(message3 != null ? message3 : "unknown error"), th6, false, false, false, false, 120, null);
                            throw th2;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    inputStreamReader = inputStreamReader2;
                    try {
                        AFLogger aFLogger4 = AFLogger.INSTANCE;
                        LogTag logTag4 = LogTag.PREINSTALL;
                        String message4 = th.getMessage();
                        if (message4 == null) {
                            message4 = "unknown error";
                        }
                        AFLoggerBase.e$default(aFLogger4, logTag4, "Error reading preinstall configuration file: ".concat(message4), th, false, false, false, false, 120, null);
                        if (inputStreamReader != null) {
                            int i2 = getLevel + 123;
                            AppsFlyerLib = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                            try {
                                if (i2 % 2 != 0) {
                                    inputStreamReader.close();
                                    int i3 = 60 / 0;
                                } else {
                                    inputStreamReader.close();
                                }
                            } catch (Throwable th8) {
                                AFLogger aFLogger5 = AFLogger.INSTANCE;
                                LogTag logTag5 = LogTag.PREINSTALL;
                                String message5 = th8.getMessage();
                                AFLoggerBase.e$default(aFLogger5, logTag5, "Error closing preinstall configuration file reader: ".concat(message5 != null ? message5 : "unknown error"), th8, false, false, false, false, 120, null);
                            }
                        }
                        return null;
                    } catch (Throwable th9) {
                        th2 = th9;
                        if (inputStreamReader == null) {
                            AppsFlyerLib = (getLevel + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            throw th2;
                        }
                        inputStreamReader.close();
                        throw th2;
                    }
                }
            } catch (FileNotFoundException unused2) {
                inputStreamReader2 = null;
            } catch (Throwable th10) {
                th = th10;
                inputStreamReader = null;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFLogger(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFi1ySDK aFi1ySDK = this.force.d;
        AFi1xSDK aFi1xSDKUnregisterClient = aFi1ySDK != null ? aFi1ySDK.unregisterClient() : null;
        if (aFi1xSDKUnregisterClient != null) {
            map.put("network", aFi1xSDKUnregisterClient.unregisterClient);
            map.put("ivc", Boolean.valueOf(aFi1xSDKUnregisterClient.d));
            if (this.AFLoggerLogLevel.afErrorLog) {
                return;
            }
            String str = aFi1xSDKUnregisterClient.registerClient;
            if (str != null) {
                map.put("operator", str);
            }
            String str2 = aFi1xSDKUnregisterClient.AFKeystoreWrapper;
            if (str2 != null) {
                int i = getLevel + 33;
                AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i % 2 != 0) {
                    map.put("carrier", str2);
                    int i2 = 22 / 0;
                    return;
                } else {
                    map.put("carrier", str2);
                    return;
                }
            }
            getLevel = (AppsFlyerLib + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    private void registerClient(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        AFc1eSDK aFc1eSDK = this.AFLoggerLogLevel;
        boolean z = false;
        if (aFc1eSDK.afInfoLog) {
            int i = AppsFlyerLib + 7;
            getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 != 0) {
                map.put("deviceTrackingDisabled", "true");
                return;
            } else {
                map.put("deviceTrackingDisabled", "true");
                int i2 = 41 / 0;
                return;
            }
        }
        String str2 = aFc1eSDK.AFLoggerLogLevel;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            AppsFlyerLib = (getLevel + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (!z) {
            map.put("imei", str2);
        }
        String strD = d(str);
        if (strD != null) {
            AppsFlyerLib = (getLevel + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
            this.e.d("androidIdCached", strD);
            map.put("android_id", strD);
        } else {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "Android ID collection skipped: not available or not permitted", false, 4, null);
        }
        AFb1lSDK aFb1lSDKUnregisterClient = AFb1iSDK.unregisterClient(this.AFLogger);
        if (aFb1lSDKUnregisterClient != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isManual", aFb1lSDKUnregisterClient.unregisterClient);
            linkedHashMap.put("val", aFb1lSDKUnregisterClient.d);
            Boolean bool = aFb1lSDKUnregisterClient.AFLogger;
            if (bool != null) {
                int i3 = AppsFlyerLib + 103;
                getLevel = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i3 % 2 != 0) {
                    linkedHashMap.put("isLat", bool);
                } else {
                    linkedHashMap.put("isLat", bool);
                    throw null;
                }
            }
            map.put("oaid", linkedHashMap);
            int i4 = AppsFlyerLib + 43;
            getLevel = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    @NotNull
    private static String v() {
        return (String) unregisterClient(new Object[0], -137455512, 137455519, (int) System.currentTimeMillis());
    }

    private final void unregisterClient(Map<String, Object> map, int i) {
        String string;
        Integer intOrNull;
        getLevel = (AppsFlyerLib + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (this.i.r_().versionCode > this.e.AFLogger("versionCode", 0)) {
                this.e.d("versionCode", this.i.r_().versionCode);
            }
            map.put("app_version_code", String.valueOf(this.i.r_().versionCode));
            map.put("app_version_name", this.i.r_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.i.d.d.getApplicationInfo().targetSdkVersion));
            map.put("date1", AFLogger().format(new Date(registerClient().longValue())));
            map.put("date2", AFLogger().format(new Date(this.i.r_().lastUpdateTime)));
            Object obj = map.get("counter");
            if (obj == null || (string = obj.toString()) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) {
                AppsFlyerLib = (getLevel + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                int i2 = getLevel + 9;
                AppsFlyerLib = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i2 % 2 != 0) {
                    i = intOrNull.intValue();
                    int i3 = 25 / 0;
                } else {
                    i = intOrNull.intValue();
                }
                getLevel = (AppsFlyerLib + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            Object[] objArr = new Object[1];
            a(Color.rgb(0, 0, 0) + 16777216, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15023), (ViewConfiguration.getEdgeSlop() >> 16) + 15, objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormatAFLogger = AFLogger();
            Intrinsics.checkNotNullExpressionValue(simpleDateFormatAFLogger, "");
            map.put(strIntern, AFLogger(simpleDateFormatAFLogger, i));
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to collect app version and update date information", th, false, true, false, false, 104, null);
        }
    }

    private static long AFKeystoreWrapper() {
        int i = getLevel + 99;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i2 = i % 2;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        getLevel = (AppsFlyerLib + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return jCurrentTimeMillis;
    }

    @NotNull
    private String AFLogger(@NotNull SimpleDateFormat simpleDateFormat, int i) {
        int i2 = AppsFlyerLib + 91;
        getLevel = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        String str = "";
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String strD = this.e.d("appsFlyerFirstInstall");
            if (!(!(strD == null || strD.length() == 0))) {
                if (i <= 1) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "First app launch detected, recording install timestamp", false, 4, null);
                    str = simpleDateFormat.format(new Date());
                    getLevel = (AppsFlyerLib + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
                } else {
                    AppsFlyerLib = (getLevel + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                this.e.d("appsFlyerFirstInstall", str);
                strD = str;
            }
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, C5491nL.c("AppsFlyer: first launch date: ", strD), false, 4, null);
            Intrinsics.checkNotNull(strD);
            return strD;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.e.d("appsFlyerFirstInstall");
        throw null;
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map, boolean z) {
        int i = AppsFlyerLib + 47;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.d.unregisterClient());
            int i2 = 65 / 0;
            if (!z) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.d.unregisterClient());
            if (!z) {
                return;
            }
        }
        map.put("platform_extension_v2", this.d.AFLogger());
        getLevel = (AppsFlyerLib + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Nullable
    private String force() {
        String strD = this.e.d("INSTALL_STORE");
        if (strD != null) {
            getLevel = (AppsFlyerLib + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return strD;
        }
        String strE = e();
        if (strE != null) {
            int i = AppsFlyerLib + 123;
            getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 == 0) {
                this.e.d("INSTALL_STORE", strE);
                int i2 = 97 / 0;
                return strE;
            }
            this.e.d("INSTALL_STORE", strE);
        }
        return strE;
    }

    @Nullable
    private String d() throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        int i = AppsFlyerLib + 55;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            PackageManager packageManager = this.AFLogger.getApplicationContext().getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "");
            String packageName = this.AFLogger.getApplicationContext().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AndroidExtensionsKt.signature(packageManager, packageName);
        }
        PackageManager packageManager2 = this.AFLogger.getApplicationContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager2, "");
        String packageName2 = this.AFLogger.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "");
        AndroidExtensionsKt.signature(packageManager2, packageName2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0078  */
    private void d(@NotNull Map<String, Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", AFLogger("ro.product.cpu.abi"));
        map2.put("cpu_abi2", AFLogger("ro.product.cpu.abi2"));
        map2.put("arch", AFLogger("os.arch"));
        map2.put("build_display_id", AFLogger("ro.build.display.id"));
        if (z) {
            int i = AppsFlyerLib + 5;
            getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 == 0) {
                unregisterClient(new Object[]{this, map2}, 1798824484, -1798824476, System.identityHashCode(this));
                if (this.i.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) <= 5) {
                    map2.putAll(this.registerClient.AFLogger());
                }
            } else {
                unregisterClient(new Object[]{this, map2}, 1798824484, -1798824476, System.identityHashCode(this));
                if (this.i.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) <= 2) {
                    map2.putAll(this.registerClient.AFLogger());
                }
            }
        }
        map2.put("dim", this.AFKeystoreWrapper.registerClient(this.AFLogger));
        map.put("deviceData", map2);
        int i2 = AppsFlyerLib + 35;
        getLevel = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull String str) {
        int i = AppsFlyerLib + 13;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                String strD = this.e.d("prev_event_name");
                if (strD != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", this.e.unregisterClient("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", strD);
                    map.put("prev_event", jSONObject);
                    AppsFlyerLib = (getLevel + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                this.e.d("prev_event_name", str);
                this.e.AFLogger("prev_event_timestamp", System.currentTimeMillis());
                return;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.e.d("prev_event_name");
            throw null;
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Failed to save previous event metadata to preferences", e, false, false, false, false, 120, null);
        }
    }

    private final void force(Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 1798824484, -1798824476, System.identityHashCode(this));
    }

    private static String registerClient(AFc1kSDK aFc1kSDK, String str) {
        AppsFlyerLib = (getLevel + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String strD = aFc1kSDK.d("CACHED_CHANNEL");
        if (strD != null) {
            AppsFlyerLib = (getLevel + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return strD;
        }
        aFc1kSDK.d("CACHED_CHANNEL", str);
        int i = AppsFlyerLib + 15;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
        return str;
    }

    private final String registerClient(String str) {
        AppsFlyerLib = (getLevel + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String strAFLogger = this.i.AFLogger(str);
        AppsFlyerLib = (getLevel + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return strAFLogger;
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = getLevel + 49;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(aFg1oSDK.AFLogger.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(aFg1oSDK.AFLogger.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    @Override // com.appsflyer.internal.AFg1rSDK
    public final void registerClient(@NotNull AFh1pSDK aFh1pSDK) {
        int i;
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.d;
        boolean z = false;
        if (aFh1pSDK.v == null) {
            int i2 = (getLevel + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AppsFlyerLib = i2;
            if (aFh1pSDK.w == null) {
                getLevel = (i2 + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                unregisterClient(new Object[]{this, aFh1pSDK, this.AFLoggerLogLevel.v}, -2092575724, 2092575725, System.identityHashCode(this));
                AppsFlyerLib = (getLevel + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else if (!(aFh1pSDK instanceof AFh1eSDK)) {
                i = getLevel + 1;
                AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i % 2 != 0) {
                    Intrinsics.checkNotNull(map);
                    String str = aFh1pSDK.v;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    AFKeystoreWrapper(map, str);
                    int i3 = 40 / 0;
                } else {
                    Intrinsics.checkNotNull(map);
                    String str2 = aFh1pSDK.v;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    AFKeystoreWrapper(map, str2);
                }
            }
        } else if (!(aFh1pSDK instanceof AFh1eSDK)) {
            i = getLevel + 1;
            AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 != 0) {
                Intrinsics.checkNotNull(map);
                String str3 = aFh1pSDK.v;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                AFKeystoreWrapper(map, str3);
                int i4 = 40 / 0;
            } else {
                Intrinsics.checkNotNull(map);
                String str4 = aFh1pSDK.v;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                AFKeystoreWrapper(map, str4);
            }
        }
        AFd1bSDK aFd1bSDK = AFd1bSDK.CONVERSION;
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.LAUNCH;
        if (CollectionsKt.z(WE.f(aFd1bSDK, aFd1bSDK2, AFd1bSDK.INAPP), aFh1pSDK.AFKeystoreWrapper())) {
            int i5 = AppsFlyerLib + 1;
            getLevel = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                Intrinsics.checkNotNull(map);
                unregisterClient(new Object[]{this, map}, -1009892585, 1009892590, System.identityHashCode(this));
            } else {
                Intrinsics.checkNotNull(map);
                unregisterClient(new Object[]{this, map}, -1009892585, 1009892590, System.identityHashCode(this));
                throw null;
            }
        }
        if (CollectionsKt.z(WE.f(aFd1bSDK, aFd1bSDK2, AFd1bSDK.ATTR), aFh1pSDK.AFKeystoreWrapper())) {
            Intrinsics.checkNotNull(map);
            unregisterClient(new Object[]{this, map}, 1429136643, -1429136643, System.identityHashCode(this));
        }
        Intrinsics.checkNotNull(map);
        setOaidData(map);
        valueOf(map);
        values(map);
        AFKeystoreWrapper(map);
        if (aFh1pSDK.v == null && aFh1pSDK.w == null) {
            z = true;
        }
        AFKeystoreWrapper(map, z);
        onPause(map);
        getInstance(map);
        AFLogger(map, aFh1pSDK);
        map.put("af_events_api", "1");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d A[DONT_INVERT] */
    private final String d(String str) {
        boolean z;
        int i = AppsFlyerLib + 49;
        int i2 = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        getLevel = i2;
        if (i % 2 != 0) {
            if (this.AFLoggerLogLevel.afWarnLog) {
                if (str != null) {
                    int i3 = i2 + 39;
                    AppsFlyerLib = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i3 % 2 == 0) {
                        if (str.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        str.length();
                        throw null;
                    }
                } else {
                    z = true;
                }
                if (z) {
                    int i4 = AppsFlyerLib + 79;
                    getLevel = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i4 % 2 != 0) {
                        if (afInfoLog()) {
                            str = afErrorLog();
                        } else {
                            str = null;
                        }
                    } else {
                        afInfoLog();
                        throw null;
                    }
                } else if (str == null) {
                    str = null;
                }
            } else if (str == null) {
                str = null;
            }
            AppsFlyerLib = (getLevel + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return str;
        }
        boolean z2 = this.AFLoggerLogLevel.afWarnLog;
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        String strAFLogger;
        int i = getLevel + 83;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            strAFLogger = AFb1jSDK.AFLogger(this.i.AFKeystoreWrapper);
            int i2 = 2 / 0;
            if (strAFLogger == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            strAFLogger = AFb1jSDK.AFLogger(this.i.AFKeystoreWrapper);
            if (strAFLogger == null) {
                return;
            }
        }
        map.put("uid", strAFLogger);
        if (this.i.AFKeystoreWrapper.AFKeystoreWrapper("CUSTOM_INSTALL_ID_APPLIED")) {
            map.put("custom_install_id", Boolean.TRUE);
            getLevel = (AppsFlyerLib + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.AFLoggerLogLevel.AFLogger;
        if (str != null) {
            map.put("email_hashed", str);
            getLevel = (AppsFlyerLib + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        String str2 = this.AFLoggerLogLevel.d;
        if (str2 != null) {
            map.put("phone_number_hashed", str2);
        }
        String str3 = this.AFLoggerLogLevel.registerClient;
        if (str3 != null) {
            map.put("phone_number_e164_hashed", str3);
            getLevel = (AppsFlyerLib + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        String str4 = this.AFLoggerLogLevel.AFKeystoreWrapper;
        if (str4 != null) {
            getLevel = (AppsFlyerLib + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map.put("first_name_hashed", str4);
        }
        String str5 = this.AFLoggerLogLevel.e;
        if (str5 != null) {
            int i = AppsFlyerLib + 99;
            getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 == 0) {
                map.put("last_name_hashed", str5);
                int i2 = 21 / 0;
            } else {
                map.put("last_name_hashed", str5);
            }
        }
        Long l = this.AFLoggerLogLevel.i;
        if (l != null) {
            map.put("fb_login_id", Long.valueOf(l.longValue()));
        }
    }

    @SuppressLint({"PrivateApi"})
    @Nullable
    private static String AFLogger(@Nullable String str) {
        getLevel = (AppsFlyerLib + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.c(objInvoke, "");
            return (String) objInvoke;
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DEVICE_DATA;
            String message = th.getMessage();
            if (message == null) {
                AppsFlyerLib = (getLevel + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                message = "Failed to retrieve system property via reflection";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, th, false, false, false, false, 120, null);
            return null;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.d;
        Intrinsics.checkNotNull(map);
        map.put("open_referrer", aFh1pSDK.e);
        String str = aFh1pSDK.afInfoLog;
        if (str == null) {
            return null;
        }
        AppsFlyerLib = (getLevel + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (StringsKt.I(str)) {
            return null;
        }
        int i = getLevel + 33;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            map.put("af_web_referrer", aFh1pSDK.afInfoLog);
            int i2 = 75 / 0;
            return null;
        }
        map.put("af_web_referrer", aFh1pSDK.afInfoLog);
        return null;
    }

    private static File AFKeystoreWrapper(String str) {
        if (str == null) {
            return null;
        }
        AppsFlyerLib = (getLevel + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            boolean z = false;
            if (StringsKt.d0(str).toString().length() > 0) {
                int i = AppsFlyerLib;
                int i2 = i + 55;
                getLevel = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                z = i2 % 2 != 0;
                getLevel = (i + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if (z) {
                return new File(StringsKt.d0(str).toString());
            }
            return null;
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.PREINSTALL;
            String message = th.getMessage();
            if (message == null) {
                message = "Failed to create File object from path";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, th, false, false, false, false, 120, null);
            return null;
        }
    }

    private static boolean AFLogger(File file) {
        int i = AppsFlyerLib + 29;
        int i2 = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        getLevel = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (file == null) {
            return true;
        }
        int i3 = i2 + 115;
        AppsFlyerLib = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i3 % 2 == 0) {
            return !file.exists();
        }
        file.exists();
        throw null;
    }

    private static void AFLogger(@NotNull Map<String, Object> map, @NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        String str = aFh1pSDK.v;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1pSDK.AFKeystoreWrapper;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private void AFKeystoreWrapper(@NotNull AFh1pSDK aFh1pSDK, @Nullable AFb1qSDK aFb1qSDK) {
        unregisterClient(new Object[]{this, aFh1pSDK, aFb1qSDK}, -2092575724, 2092575725, System.identityHashCode(this));
    }

    private static String d(File file, String str) {
        return (String) unregisterClient(new Object[]{file, str}, 238881636, -238881626, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void d(@NotNull AFh1pSDK aFh1pSDK) {
        unregisterClient(new Object[]{this, aFh1pSDK}, 102039780, -102039774, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull Map<String, Object> map, int i, int i2) {
        getLevel = (AppsFlyerLib + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        boolean z = false;
        if (!i()) {
            int i3 = getLevel + 27;
            AppsFlyerLib = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i3 % 2 == 0) {
                z = true;
            }
        }
        map.put("isFirstCall", String.valueOf(z));
        getLevel = (AppsFlyerLib + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        AFb1qSDK aFb1qSDK = (AFb1qSDK) objArr[2];
        int i = AppsFlyerLib + 89;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1pSDK, "");
            Map<String, Object> map = aFh1pSDK.d;
            if (aFh1pSDK.AFKeystoreWrapper() == AFd1bSDK.CONVERSION) {
                int i2 = AppsFlyerLib + 9;
                getLevel = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNull(map);
                    aFg1oSDK.afErrorLog(map);
                    aFg1oSDK.afWarnLog(map);
                    unregisterClient(new Object[]{aFg1oSDK, map}, 884869374, -884869365, System.identityHashCode(aFg1oSDK));
                    AFa1uSDK.unregisterClient(aFg1oSDK.afWarnLog, aFg1oSDK.i, aFg1oSDK.afErrorLog);
                } else {
                    Intrinsics.checkNotNull(map);
                    aFg1oSDK.afErrorLog(map);
                    aFg1oSDK.afWarnLog(map);
                    unregisterClient(new Object[]{aFg1oSDK, map}, 884869374, -884869365, System.identityHashCode(aFg1oSDK));
                    AFa1uSDK.unregisterClient(aFg1oSDK.afWarnLog, aFg1oSDK.i, aFg1oSDK.afErrorLog);
                    throw null;
                }
            }
            Intrinsics.checkNotNull(map);
            unregisterClient(new Object[]{aFg1oSDK, map}, 291205159, -291205155, System.identityHashCode(aFg1oSDK));
            aFg1oSDK.i(map);
            aFg1oSDK.e(map);
            aFg1oSDK.getEntries(map);
            if (aFb1qSDK != null) {
                AppsFlyerLib = (getLevel + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
                aFb1qSDK.AFLogger(map);
                getLevel = (AppsFlyerLib + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map2 = aFh1pSDK.d;
        aFh1pSDK.AFKeystoreWrapper();
        AFd1bSDK.Companion companion = AFd1bSDK.INSTANCE;
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull Map<String, Object> map, @NotNull AFe1zSDK aFe1zSDK) {
        getLevel = (AppsFlyerLib + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        if (CollectionsKt.z((List) unregisterClient(new Object[0], 1713251753, -1713251742, (int) System.currentTimeMillis()), aFe1zSDK)) {
            AFc1eSDK aFc1eSDK = this.AFLoggerLogLevel;
            if (aFc1eSDK.setCustomerUserId) {
                map.put("app_set_id", OW0.b(new Pair("app_set_id_disabled", Boolean.TRUE)));
                if (this.AFLoggerLogLevel.setUserEmail != null) {
                    getLevel = (AppsFlyerLib + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                    return;
                } else {
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                    return;
                }
            }
            AFc1rSDK aFc1rSDK = aFc1eSDK.setUserEmail;
            if (aFc1rSDK != null) {
                map.put("app_set_id", PW0.e(new Pair("scope", Integer.valueOf(aFc1rSDK.AFKeystoreWrapper)), new Pair("id", aFc1rSDK.unregisterClient)));
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull AFh1pSDK aFh1pSDK) {
        unregisterClient(new Object[]{this, aFh1pSDK}, 1765853168, -1765853166, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final long unregisterClient() {
        return ((Long) unregisterClient(new Object[]{this}, -2087428651, 2087428654, System.identityHashCode(this))).longValue();
    }
}

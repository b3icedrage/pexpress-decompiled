package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C1039Gc0;
import defpackage.C1526Mj;
import defpackage.C5653o60;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1tSDK implements AFf1aSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLoggerLogLevel = -1754894492;
    private static int AppsFlyerLib = 0;
    private static byte[] afDebugLog = {114, 125, -100, 112, 127, -119, 117, -124, 100, -120, 116, 113};
    private static int afErrorLog = -2119275651;
    private static int afInfoLog = -929107346;
    private static short[] afWarnLog = null;
    private static int getLevel = 1;

    @NotNull
    private final AFc1bSDK AFKeystoreWrapper;

    @NotNull
    private final AFc1iSDK AFLogger;

    @NotNull
    private final AFa1aSDK d;

    @NotNull
    private final AFf1fSDK e;

    @NotNull
    private final ScheduledExecutorService force;

    @NotNull
    private final AFg1rSDK i;

    @NotNull
    private final AFc1eSDK registerClient;

    @NotNull
    private final AFi1aSDK unregisterClient;

    @NotNull
    private final AppsFlyerProperties v;

    @NotNull
    private final AFd1zSDK w;

    public AFg1tSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull AFa1aSDK aFa1aSDK, @NotNull AFi1aSDK aFi1aSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFg1rSDK aFg1rSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFa1aSDK, "");
        Intrinsics.checkNotNullParameter(aFi1aSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        this.AFKeystoreWrapper = aFc1bSDK;
        this.d = aFa1aSDK;
        this.unregisterClient = aFi1aSDK;
        this.AFLogger = aFc1iSDK;
        this.registerClient = aFc1eSDK;
        this.w = aFd1zSDK;
        this.i = aFg1rSDK;
        this.e = aFf1fSDK;
        this.v = appsFlyerProperties;
        this.force = scheduledExecutorService;
    }

    private boolean AFKeystoreWrapper(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        if (!aFh1pSDK.AFLogger() && aFh1pSDK.v == null) {
            int i = (AppsFlyerLib + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
            getLevel = i;
            if (aFh1pSDK.w == null) {
                AppsFlyerLib = (i + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
                String strAFLogger = this.AFLogger.AFLogger("AF_LAUNCH_PROTECT_ENABLED");
                if (!(strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : true)) {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(this.registerClient.setDebugLog);
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Allowing multiple launches within a " + seconds + " second time window.", false, 4, null);
                } else if (AFKeystoreWrapper()) {
                    AppsFlyerRequestListener appsFlyerRequestListener = aFh1pSDK.AFLogger;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        getLevel = (AppsFlyerLib + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    return true;
                }
                this.registerClient.getInstance = System.currentTimeMillis();
            }
        }
        return false;
    }

    public static /* synthetic */ Object AFLogger(Object[] objArr, int i, int i2, int i3) {
        return registerClient(objArr);
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.d;
        if (!aFg1tSDK.registerClient.afWarnLog) {
            getLevel = (AppsFlyerLib + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (map.get("advertiserId") != null) {
                try {
                    String str = aFg1tSDK.registerClient.force;
                    if (str == null || str.length() == 0) {
                        if (map.remove("android_id") != null) {
                            getLevel = (AppsFlyerLib + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, "validateGaidAndAndroidId :: removing: android_id", false, 4, null);
                            return null;
                        }
                    }
                } catch (Exception e) {
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "failed to remove AndroidID key from params; ", e, false, false, false, false, 120, null);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    private static void unregisterClient(Context context) {
        String[] strArr;
        List listF;
        int i = AppsFlyerLib + 13;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i % 2 == 0) {
                strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 24626).requestedPermissions;
                if (strArr != null) {
                    listF = C1526Mj.F(strArr);
                } else {
                    listF = null;
                }
            } else {
                strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    listF = C1526Mj.F(strArr);
                } else {
                    listF = null;
                }
            }
            if (listF == null) {
                getLevel = (AppsFlyerLib + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
                listF = C5653o60.d;
            }
            if (!listF.contains("android.permission.INTERNET")) {
                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml", false, 4, null);
            }
            if (!listF.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i2 = getLevel + 31;
                AppsFlyerLib = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i2 % 2 != 0) {
                    AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml", true, 5, null);
                } else {
                    AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml", false, 4, null);
                }
            }
            if (Build.VERSION.SDK_INT <= 32 || listF.contains("com.google.android.gms.permission.AD_ID")) {
                return;
            }
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml", false, 4, null);
            int i3 = getLevel + 27;
            AppsFlyerLib = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i3 % 2 != 0) {
                int i4 = 89 / 0;
            }
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Exception while validation permissions. ", e, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFf1aSDK
    public final void d(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        if (AFKeystoreWrapper(aFh1pSDK)) {
            AppsFlyerLib = (getLevel + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.registerClient.setDebugLog);
            AFLogger.INSTANCE.d(LogTag.GENERAL, "Blocking multiple consecutive Launch events within " + seconds + " seconds time window", true);
            return;
        }
        Context context = this.w.d;
        if (context == null) {
            int i = AppsFlyerLib + 59;
            getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 == 0) {
                AFLogger.INSTANCE.d(LogTag.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", false);
                return;
            } else {
                AFLogger.INSTANCE.d(LogTag.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            }
        }
        AFf1fSDK aFf1fSDK = this.e;
        String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK));
        if (str != null && str.length() != 0) {
            AFj1iSDK.AFLogger(this.force, new p(this, aFh1pSDK, context, 0), 0L, TimeUnit.MILLISECONDS);
            return;
        }
        int i2 = (AppsFlyerLib + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
        getLevel = i2;
        AppsFlyerLib = (i2 + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.GENERAL;
        aFLogger.i(logTag, "AppsFlyer dev key is missing! AppsFlyer's SDK cannot send any events without providing the dev key.", true);
        aFLogger.i(logTag, "AppsFlyer will not track this event.", true);
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1pSDK.AFLogger;
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFLogger(AFg1tSDK aFg1tSDK, AFh1pSDK aFh1pSDK, Context context) {
        int i = getLevel + 107;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i2 = i % 2;
        aFg1tSDK.d(aFh1pSDK, context);
        if (i2 != 0) {
            int i3 = 28 / 0;
        }
        getLevel = (AppsFlyerLib + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static void a(int i, short s, byte b, int i2, int i3, Object[] objArr) {
        int i4;
        boolean z;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        StringBuilder sb = new StringBuilder();
        int i5 = i + ((int) (((long) afErrorLog) ^ (-6851507024414479503L)));
        if (i5 == -1) {
            $11 = ($10 + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i4 = 1;
        } else {
            $10 = ($11 + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i4 = 0;
        }
        if (i4 != 0) {
            byte[] bArr = afDebugLog;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 93;
                    $10 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i7 % 2 != 0) {
                        bArr2[i6] = (byte) (((long) bArr[i6]) * (-6851507024414479503L));
                    } else {
                        bArr2[i6] = (byte) (((long) bArr[i6]) ^ (-6851507024414479503L));
                        i6++;
                    }
                }
                bArr = bArr2;
            }
            i5 = bArr != null ? (byte) (((byte) (((long) afDebugLog[i3 + ((int) (((long) afInfoLog) ^ (-6851507024414479503L)))]) ^ (-6851507024414479503L))) + ((int) (((long) afErrorLog) ^ (-6851507024414479503L)))) : (short) (((short) (((long) afWarnLog[i3 + ((int) (((long) afInfoLog) ^ (-6851507024414479503L)))]) ^ (-6851507024414479503L))) + ((int) (((long) afErrorLog) ^ (-6851507024414479503L))));
        }
        if (i5 > 0) {
            aFk1rSDK.AFLogger = ((i3 + i5) - 2) + ((int) (((long) afInfoLog) ^ (-6851507024414479503L))) + i4;
            char c = (char) (((int) (((long) AFLoggerLogLevel) ^ (-6851507024414479503L))) + i2);
            aFk1rSDK.registerClient = c;
            sb.append(c);
            aFk1rSDK.AFKeystoreWrapper = aFk1rSDK.registerClient;
            byte[] bArr3 = afDebugLog;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                $11 = ($10 + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
                for (int i8 = 0; i8 < length2; i8++) {
                    bArr4[i8] = (byte) (((long) bArr3[i8]) ^ (-6851507024414479503L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                $11 = ($10 + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
                z = true;
            } else {
                z = false;
            }
            aFk1rSDK.d = 1;
            while (aFk1rSDK.d < i5) {
                if (z) {
                    byte[] bArr5 = afDebugLog;
                    int i9 = aFk1rSDK.AFLogger;
                    aFk1rSDK.AFLogger = i9 - 1;
                    aFk1rSDK.registerClient = (char) (aFk1rSDK.AFKeystoreWrapper + (((byte) (((byte) (((long) bArr5[i9]) ^ (-6851507024414479503L))) + s)) ^ b));
                } else {
                    short[] sArr = afWarnLog;
                    int i10 = aFk1rSDK.AFLogger;
                    aFk1rSDK.AFLogger = i10 - 1;
                    aFk1rSDK.registerClient = (char) (aFk1rSDK.AFKeystoreWrapper + (((short) (((short) (((long) sArr[i10]) ^ (-6851507024414479503L))) + s)) ^ b));
                }
                sb.append(aFk1rSDK.registerClient);
                aFk1rSDK.AFKeystoreWrapper = aFk1rSDK.registerClient;
                aFk1rSDK.d++;
            }
        }
        objArr[0] = sb.toString();
    }

    private void AFLogger(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        AFc1bSDK aFc1bSDK = this.AFKeystoreWrapper;
        AFh1pSDK aFh1pSDKUnregisterClient = aFh1pSDK.unregisterClient(this.AFLogger.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0));
        Intrinsics.checkNotNullExpressionValue(aFh1pSDKUnregisterClient, "");
        AFa1pSDK aFa1pSDK = new AFa1pSDK(aFc1bSDK, aFh1pSDKUnregisterClient, this.d.d());
        long j = 0;
        if (aFh1pSDK.v == null && aFh1pSDK.w == null) {
            for (Referrer referrer : (Referrer[]) this.unregisterClient.unregisterClient.toArray(new Referrer[0])) {
                AppsFlyerLib = (getLevel + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (referrer.getState() == Referrer.State.STARTED) {
                    getLevel = (AppsFlyerLib + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, C1039Gc0.d("Failed to get ", referrer.getSource(), " referrer, wait ..."), false, 4, null);
                    j = 500;
                }
            }
            if (this.d.registerClient()) {
                int i = getLevel + 15;
                AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i % 2 != 0) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, "fetching Facebook deferred AppLink data, wait ...", true, 4, null);
                } else {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, "fetching Facebook deferred AppLink data, wait ...", false, 4, null);
                }
                j = 500;
            }
            if (this.e.d()) {
                int i2 = AppsFlyerLib + 5;
                getLevel = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i2 % 2 == 0) {
                    throw null;
                }
                j = 500;
            }
        }
        AFj1iSDK.AFLogger(this.force, aFa1pSDK, j, TimeUnit.MILLISECONDS);
    }

    @NotNull
    private Map<String, Object> unregisterClient(@NotNull Context context, @NotNull AFh1pSDK aFh1pSDK) {
        String str;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        boolean z = aFh1pSDK.v == null && aFh1pSDK.w == null;
        Map<String, Object> map = aFh1pSDK.d;
        long time = new Date().getTime();
        Intrinsics.checkNotNull(map);
        Object[] objArr = new Object[1];
        a(TextUtils.getTrimmedLength(""), (short) View.MeasureSpec.getSize(0), (byte) View.resolveSize(0, 0), (-382206900) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1227921695) - TextUtils.indexOf("", "", 0, 0), objArr);
        map.put(((String) objArr[0]).intern(), String.valueOf(time));
        try {
            if (this.e.AFLogger()) {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                if (z) {
                    str = "Launch";
                } else {
                    str = aFh1pSDK.v;
                    AppsFlyerLib = (getLevel + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                AFLogger.INSTANCE.i(LogTag.GENERAL, "******* sendTrackingWithEvent: " + str, true);
            }
            unregisterClient(context);
            AFc1iSDK aFc1iSDK = this.AFLogger;
            int iAFLogger = aFc1iSDK.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0);
            if (z) {
                iAFLogger++;
                aFc1iSDK.AFKeystoreWrapper.d("appsFlyerCount", iAFLogger);
            }
            AFc1iSDK aFc1iSDK2 = this.AFLogger;
            int iAFLogger2 = aFc1iSDK2.AFKeystoreWrapper.AFLogger("appsFlyerInAppEventCount", 0);
            if (!z) {
                iAFLogger2++;
                aFc1iSDK2.AFKeystoreWrapper.d("appsFlyerInAppEventCount", iAFLogger2);
                AppsFlyerLib = (getLevel + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            this.i.unregisterClient(map, iAFLogger, iAFLogger2);
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Error while preparing to send event", th, true, true, true, false, 64, null);
        }
        int i = AppsFlyerLib + 95;
        getLevel = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
        return map;
    }

    private void d(@NotNull AFh1pSDK aFh1pSDK, @NotNull Context context) {
        getLevel = (AppsFlyerLib + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.v.saveProperties();
        if (!this.e.AFLogger()) {
            AFLogger.INSTANCE.i(LogTag.GENERAL, "sendTrackingWith with context: ".concat(context.getClass().getName()), true);
            getLevel = (AppsFlyerLib + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        aFh1pSDK.AFKeystoreWrapper(unregisterClient(context, aFh1pSDK));
        AFLogger(new Object[]{this, aFh1pSDK}, 1204709251, -1204709251, System.identityHashCode(this));
        AFLogger(aFh1pSDK);
        AppsFlyerLib = (getLevel + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private boolean AFKeystoreWrapper() {
        int i = getLevel + 43;
        AppsFlyerLib = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0 ? this.registerClient.getInstance > 0 : this.registerClient.getInstance > 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.registerClient.getInstance;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            long j = this.registerClient.getInstance;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            String str = simpleDateFormat.format(new Date(j));
            long j2 = this.registerClient.onPause;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            String str2 = simpleDateFormat.format(new Date(j2));
            if (jCurrentTimeMillis < this.registerClient.setDebugLog) {
                int i2 = getLevel + 83;
                AppsFlyerLib = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i2 % 2 == 0) {
                    if (!this.e.AFLogger()) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.SDK_LIFECYCLE;
                        String str3 = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", Arrays.copyOf(new Object[]{str, str2, Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.registerClient.setDebugLog)}, 4));
                        Intrinsics.checkNotNullExpressionValue(str3, "");
                        AFLoggerBase.i$default(aFLogger, logTag, str3, false, 4, null);
                        return true;
                    }
                } else {
                    this.e.AFLogger();
                    throw null;
                }
            }
            if (this.e.AFLogger()) {
                return false;
            }
            getLevel = (AppsFlyerLib + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            LogTag logTag2 = LogTag.SDK_LIFECYCLE;
            String str4 = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", Arrays.copyOf(new Object[]{str, str2, Long.valueOf(jCurrentTimeMillis)}, 3));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            AFLoggerBase.i$default(aFLogger2, logTag2, str4, false, 4, null);
            getLevel = (AppsFlyerLib + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        if (this.e.AFLogger()) {
            return false;
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Sending first launch for this session!", false, 4, null);
        return false;
    }

    private void unregisterClient(@NotNull AFh1pSDK aFh1pSDK) {
        AFLogger(new Object[]{this, aFh1pSDK}, 1204709251, -1204709251, System.identityHashCode(this));
    }
}

package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.C4694ja0;
import defpackage.C5491nL;
import defpackage.ID;
import defpackage.Z0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u000f*\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0013J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0013J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010#\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010%\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\nJ\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\u0013J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\u0013J\u000f\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0013J\u000f\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010\u0013J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0013J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0013J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0013J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0013J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106¨\u00068"}, d2 = {"Lcom/appsflyer/internal/util/EventUrlResolver;", "", "Lcom/appsflyer/internal/components/IdProvider;", "idProvider", "<init>", "(Lcom/appsflyer/internal/components/IdProvider;)V", "Lcom/appsflyer/internal/model/event/AFEvent;", "event", "", "getUrlForEvent", "(Lcom/appsflyer/internal/model/event/AFEvent;)Ljava/lang/String;", "devKey", "timestamp", "getUrlForDdlEvent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri$Builder;", "appendSigQueryParam", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "getUrlForViap", "()Ljava/lang/String;", "getUrlForArs", "getUrlForRegister", "getUrlForManualOneTimePurchaseValidation", "getUrlForManualSubscriptionPurchaseValidation", "getUrlForRdMonitor", "getUrlForPlayIntegrityReporting", "onelinkId", "shortLinkId", "getOnelinkUrl", "channelPostfix", "getGcdURL", "(Ljava/lang/String;)Ljava/lang/String;", "appendPackageName", "", "isAdRevenueEvent", "appendBuildNumber", "(Ljava/lang/String;Z)Ljava/lang/String;", "isRegisterEvent", "appendConfiguredChannel", "getLaunchUrl", "getReferrerTrackingUrl", "getAdRevenueUrl", "getFirstLaunchUrl", "getAppsTrackingUrl", "getEventsTrackingUrl", "getArsBilling5", "getViapBilling5", "getDdlUrl", "getManualValidateOneTimePurchaseUrl", "getManualValidateSubscriptionPurchaseUrl", "getRegisterUrl", "getPlayIntegrityUrl", "getOneLinkBaseUrl", "getGcdBaseUrl", "Lcom/appsflyer/internal/components/IdProvider;", "Companion", "sdk_main_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFj1mSDK {

    @NotNull
    public static String AFKeystoreWrapper;

    @NotNull
    public static String AFLogger;

    @NotNull
    private static final String afErrorLog;

    @NotNull
    public static String d;

    @NotNull
    public static String e;

    @NotNull
    public static String force;

    @NotNull
    public static final String i;

    @NotNull
    public static final AFa1ySDK registerClient = new AFa1ySDK(null);

    @NotNull
    public static String unregisterClient;

    @NotNull
    public static String v;

    @NotNull
    private final AFc1iSDK w;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Lcom/appsflyer/internal/AFj1mSDK$AFa1ySDK;", "", "<init>", "()V", "", "afErrorLog", "Ljava/lang/String;", "registerClient", "unregisterClient", "d", "AFLogger", "AFKeystoreWrapper", "force", "v", "e", "i", "w"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String strC = Z0.c(AFa1tSDK.registerClient, "/androidevent?app_id=");
        afErrorLog = strC;
        unregisterClient = C5491nL.c("https://%sattr.%s/api/v", strC);
        d = "https://%sadrevenue.%s/api/v2/generic/v7.0.1/android?app_id=";
        AFLogger = C5491nL.c("https://%sconversions.%s/api/v", strC);
        AFKeystoreWrapper = C5491nL.c("https://%slaunches.%s/api/v", strC);
        force = C5491nL.c("https://%sinapps.%s/api/v", strC);
        v = C5491nL.c("https://%sregister.%s/api/v", strC);
        e = "https://%smonitorsdk.%s/remote-debug/exception-manager";
        i = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    public AFj1mSDK(@NotNull AFc1iSDK aFc1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        this.w = aFc1iSDK;
    }

    public static String AFKeystoreWrapper(String str, boolean z) {
        return Z0.c(str, !z ? "&buildnumber=7.0.1" : "");
    }

    public static String afInfoLog() {
        Locale locale = Locale.US;
        String strA = C4694ja0.a("https://", AppsFlyerLib.getInstance().getHostPrefix(), "pia.", AFa1tSDK.d().getHostName(), "/api/v1.0/pia-android-event?app_id=");
        Intrinsics.checkNotNullExpressionValue(strA, "");
        return strA;
    }

    public static String e() {
        Locale locale = Locale.US;
        String strA = C4694ja0.a("https://", AppsFlyerLib.getInstance().getHostPrefix(), "validate-and-log.", AFa1tSDK.d().getHostName(), "/api/v4.0/android/one_time_purchase/validateAndLog?app_id=");
        Intrinsics.checkNotNullExpressionValue(strA, "");
        return strA;
    }

    public static String force() {
        Locale locale = Locale.US;
        String strA = C4694ja0.a("https://", AppsFlyerLib.getInstance().getHostPrefix(), "validate-and-log.", AFa1tSDK.d().getHostName(), "/api/v4.0/android/subscription/validateAndLog?app_id=");
        Intrinsics.checkNotNullExpressionValue(strA, "");
        return strA;
    }

    public static String i() {
        Locale locale = Locale.US;
        String strA = C4694ja0.a("https://", AppsFlyerLib.getInstance().getHostPrefix(), "ars.", AFa1tSDK.d().getHostName(), "/api/v2/android/validate_subscription_v2?app_id=");
        Intrinsics.checkNotNullExpressionValue(strA, "");
        return strA;
    }

    public static String v() {
        Locale locale = Locale.US;
        String strA = C4694ja0.a("https://", AppsFlyerLib.getInstance().getHostPrefix(), "viap.", AFa1tSDK.d().getHostName(), "/api/v1/android/validate_purchase_v2?app_id=");
        Intrinsics.checkNotNullExpressionValue(strA, "");
        return strA;
    }

    public static String w() {
        String str = String.format(Locale.US, v, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @NotNull
    public final String AFLogger(@Nullable String str, @Nullable String str2) {
        String packageName = this.w.d.d.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String strAFLogger = this.w.AFLogger("CHANNEL");
        if (strAFLogger != null && strAFLogger.equals("")) {
            strAFLogger = null;
        }
        if (strAFLogger != null && !StringsKt.I(strAFLogger)) {
            strAFLogger = C5491nL.c("-", StringsKt.d0(strAFLogger).toString());
        }
        if (strAFLogger == null) {
            strAFLogger = "";
        }
        String string = StringsKt.d0(strAFLogger).toString();
        Locale locale = Locale.US;
        String strA = C4694ja0.a("https://", AppsFlyerLib.getInstance().getHostPrefix(), "dlsdk.", AFa1tSDK.d().getHostName(), "/v1.0/android/");
        Intrinsics.checkNotNullExpressionValue(strA, "");
        Uri.Builder builderAppendPath = Uri.parse(strA).buildUpon().appendPath(packageName + string);
        Intrinsics.checkNotNullExpressionValue(builderAppendPath, "");
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(LogTag.GENERAL, str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")), true, false, false, true);
        } else {
            builderAppendPath.appendQueryParameter("af_sig", AFj1nSDK.d(str2.concat(str), str));
        }
        String string2 = builderAppendPath.appendQueryParameter("sdk_version", AFa1tSDK.registerClient).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final String unregisterClient(String str) {
        return Z0.c(str, this.w.d.d.getPackageName());
    }

    public static String registerClient() {
        String str = String.format(Locale.US, unregisterClient, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final String d(String str, boolean z) {
        if (z) {
            return str;
        }
        String strAFLogger = this.w.AFLogger("CHANNEL");
        if (strAFLogger != null && strAFLogger.equals("")) {
            strAFLogger = null;
        }
        String strConcat = strAFLogger != null ? "&channel=".concat(strAFLogger) : null;
        return Z0.c(str, strConcat != null ? strConcat : "");
    }

    public static String AFKeystoreWrapper() {
        String str = String.format(Locale.US, AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @NotNull
    public static String AFKeystoreWrapper(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Locale locale = Locale.US;
        String strA = C4694ja0.a("https://", AppsFlyerLib.getInstance().getHostPrefix(), "onelink.", AFa1tSDK.d().getHostName(), "/shortlink-sdk/v2");
        Intrinsics.checkNotNullExpressionValue(strA, "");
        return ID.c(strA, "/", str, str2 != null ? "?id=".concat(str2) : "");
    }

    public static String unregisterClient() {
        String str = String.format(Locale.US, AFLogger, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static String d() {
        String str = String.format(Locale.US, force, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @NotNull
    public final String AFKeystoreWrapper(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Locale locale = Locale.US;
        String strA = C4694ja0.a("https://", AppsFlyerLib.getInstance().getHostPrefix(), "gcdsdk.", AFa1tSDK.d().getHostName(), "/install_data/v5.0/");
        Intrinsics.checkNotNullExpressionValue(strA, "");
        return strA + this.w.d.d.getPackageName() + str + "?device_id=" + AFb1jSDK.AFLogger(this.w.AFKeystoreWrapper);
    }

    public static String AFLogger() {
        String str = String.format(Locale.US, d, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}

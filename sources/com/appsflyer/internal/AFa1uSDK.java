package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.C1332Jw;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFa1uSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "Lcom/appsflyer/internal/AFc1iSDK;", "p1", "Lcom/appsflyer/AppsFlyerProperties;", "p2", "", "unregisterClient", "(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/AppsFlyerProperties;)V", "", "registerClient", "(Lcom/appsflyer/AppsFlyerProperties;)Ljava/lang/String;", "AFLogger"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFa1uSDK {

    @NotNull
    public static final AFa1uSDK INSTANCE = new AFa1uSDK();

    private AFa1uSDK() {
    }

    @Nullable
    public static String AFLogger(@NotNull AppsFlyerProperties p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getString("KSAppsFlyerRICounter");
    }

    @Nullable
    public static String registerClient(@NotNull AppsFlyerProperties p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getString("KSAppsFlyerId");
    }

    public static final void unregisterClient(@NotNull AFd1zSDK p0, @NotNull AFc1iSDK p1, @NotNull AppsFlyerProperties p2) {
        int i;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (Build.BRAND.equals("OPPO")) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.ATTRIBUTION, "OPPO device found", false, 4, null);
            i = 23;
        } else {
            i = 18;
        }
        String strAFLogger = p1.AFLogger("AF_DISABLE_KEYSTORE");
        boolean z = strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < i || z) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.ATTRIBUTION, C1332Jw.a(i2, "OS SDK is=", "; no KeyStore usage"), false, 4, null);
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFLoggerBase.d$default(aFLogger, LogTag.ATTRIBUTION, C1332Jw.a(i2, "OS SDK is=", "; use KeyStore"), false, 4, null);
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.d);
        if (aFKeystoreWrapper.d()) {
            String strAFKeystoreWrapper = aFKeystoreWrapper.AFKeystoreWrapper();
            synchronized (aFKeystoreWrapper.AFLogger) {
                aFKeystoreWrapper.unregisterClient++;
                aFLogger.i(LogTag.SECURITY, "Deleting key with alias: ".concat(String.valueOf(strAFKeystoreWrapper)));
                try {
                    synchronized (aFKeystoreWrapper.AFLogger) {
                        aFKeystoreWrapper.registerClient.deleteEntry(strAFKeystoreWrapper);
                    }
                } catch (KeyStoreException e) {
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    LogTag logTag = LogTag.SECURITY;
                    StringBuilder sb = new StringBuilder("Exception occurred while deleting key: ");
                    sb.append(e.getMessage() != null ? e.getMessage() : "unknown error");
                    aFLogger2.e(logTag, sb.toString(), e);
                }
            }
            aFKeystoreWrapper.AFKeystoreWrapper(aFKeystoreWrapper.AFKeystoreWrapper());
        } else {
            aFKeystoreWrapper.d = AFb1jSDK.AFLogger(p1.AFKeystoreWrapper);
            aFKeystoreWrapper.unregisterClient = 0;
            aFKeystoreWrapper.AFKeystoreWrapper(aFKeystoreWrapper.AFKeystoreWrapper());
        }
        p2.set("KSAppsFlyerId", aFKeystoreWrapper.AFLogger());
        p2.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.registerClient()));
    }
}

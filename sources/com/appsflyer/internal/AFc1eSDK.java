package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.share.AppsFlyerConsent;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1eSDK {

    @Nullable
    public String AFKeystoreWrapper;

    @Nullable
    public String AFLogger;

    @Nullable
    public String AFLoggerLogLevel;

    @Nullable
    public String AppsFlyerLib;

    @Nullable
    public Boolean afDebugLog;
    public boolean afErrorLog;
    public boolean afInfoLog;
    public boolean afWarnLog;

    @Nullable
    public String clearUserPii;

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String force;
    public boolean getEntries;

    @Nullable
    public String getLevel;

    @Nullable
    public String getOutOfStore;

    @Nullable
    public String getSdkVersion;

    @Nullable
    public Long i;

    @Nullable
    public String registerClient;
    public boolean setAndroidIdData;
    public boolean setCustomerUserId;

    @Nullable
    public AppsFlyerConsent setImeiData;

    @Nullable
    public AFd1nSDK setOaidData;

    @Nullable
    public AFc1rSDK setUserEmail;
    public boolean setUserFirstName;

    @Nullable
    public String setUserLastName;
    public boolean setUserPhone;

    @Nullable
    public String stop;

    @Nullable
    public String unregisterClient;

    @Nullable
    public AFh1qSDK updateServerUninstallToken;

    @Nullable
    public AFb1qSDK v;

    @Nullable
    public String valueOf;

    @Nullable
    public String values;

    @Nullable
    public AFb1rSDK w;

    @NotNull
    public AFLogger.LogLevel enableTCFDataCollection = AFLogger.LogLevel.NONE;
    public long getInstance = -1;
    public long onPause = -1;
    public long setDebugLog = TimeUnit.SECONDS.toMillis(5);

    public final synchronized void registerClient(@Nullable AFd1nSDK aFd1nSDK) {
        this.setOaidData = aFd1nSDK;
    }
}

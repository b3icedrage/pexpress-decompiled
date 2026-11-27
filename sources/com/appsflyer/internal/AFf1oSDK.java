package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.gms.common.ConnectionResult;
import defpackage.C5491nL;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1oSDK extends AFe1ySDK<AFf1pSDK> {

    @NotNull
    private final AFc1iSDK AFLoggerLogLevel;

    @NotNull
    private final AFc1eSDK AppsFlyerLib;

    @NotNull
    private final AFf1jSDK afDebugLog;

    @NotNull
    private final AFd1sSDK afErrorLog;

    @NotNull
    private final AFf1fSDK afInfoLog;

    @NotNull
    private final AFf1kSDK afWarnLog;

    @Nullable
    public AFh1bSDK e;

    @Nullable
    public final AFf1mSDK force;

    @NotNull
    private final String getLevel;

    @Nullable
    public AFf1pSDK i;

    @NotNull
    private final AFf1nSDK v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1oSDK(@NotNull AFf1nSDK aFf1nSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AFf1jSDK aFf1jSDK, @NotNull AFd1sSDK aFd1sSDK, @NotNull AFf1kSDK aFf1kSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull String str, @Nullable AFf1mSDK aFf1mSDK) {
        super(AFd1bSDK.RC_CDN, new AFe1zSDK[0], "UpdateRemoteConfiguration");
        Intrinsics.checkNotNullParameter(aFf1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFf1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.v = aFf1nSDK;
        this.AFLoggerLogLevel = aFc1iSDK;
        this.afInfoLog = aFf1fSDK;
        this.afDebugLog = aFf1jSDK;
        this.afErrorLog = aFd1sSDK;
        this.afWarnLog = aFf1kSDK;
        this.AppsFlyerLib = aFc1eSDK;
        this.getLevel = str;
        this.force = aFf1mSDK;
    }

    private final void AFKeystoreWrapper(AFf1xSDK aFf1xSDK) {
        long j;
        int statusCode;
        Throwable cause;
        long j2;
        AFd1fSDK<?> aFd1fSDK = aFf1xSDK.d;
        if (aFd1fSDK != null) {
            j = aFd1fSDK.AFKeystoreWrapper.registerClient;
            statusCode = aFd1fSDK.getStatusCode();
        } else {
            j = 0;
            statusCode = 0;
        }
        int i = statusCode;
        Throwable th = aFf1xSDK.v;
        if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            cause = httpException.getCause();
            j2 = httpException.getMetrics().registerClient;
        } else {
            cause = th;
            j2 = j;
        }
        AFh1aSDK aFh1aSDK = aFf1xSDK.unregisterClient;
        this.e = new AFh1bSDK(aFh1aSDK != null ? aFh1aSDK.AFKeystoreWrapper : null, aFf1xSDK.AFLogger, j2, System.currentTimeMillis() - aFf1xSDK.registerClient, i, aFf1xSDK.AFKeystoreWrapper, aFf1xSDK.e, cause);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02a9 A[Catch: all -> 0x0122, IOException -> 0x0126, ParsingException -> 0x012c, TRY_LEAVE, TryCatch #11 {ParsingException -> 0x012c, IOException -> 0x0126, all -> 0x0122, blocks: (B:54:0x0132, B:56:0x0163, B:58:0x0183, B:61:0x018a, B:63:0x0197, B:65:0x01af, B:68:0x01b7, B:94:0x027f, B:102:0x029e, B:62:0x018f, B:104:0x02a9, B:107:0x02c0, B:41:0x0100, B:46:0x0112), top: B:126:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x030f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0312  */
    /* JADX WARN: Code duplicated, block: B:115:0x0321  */
    /* JADX WARN: Code duplicated, block: B:116:0x0324  */
    /* JADX WARN: Code duplicated, block: B:119:0x0338  */
    /* JADX WARN: Code duplicated, block: B:121:0x033b  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0163 A[Catch: all -> 0x0122, IOException -> 0x0126, ParsingException -> 0x012c, TryCatch #11 {ParsingException -> 0x012c, IOException -> 0x0126, all -> 0x0122, blocks: (B:54:0x0132, B:56:0x0163, B:58:0x0183, B:61:0x018a, B:63:0x0197, B:65:0x01af, B:68:0x01b7, B:94:0x027f, B:102:0x029e, B:62:0x018f, B:104:0x02a9, B:107:0x02c0, B:41:0x0100, B:46:0x0112), top: B:126:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x018f A[Catch: all -> 0x0122, IOException -> 0x0126, ParsingException -> 0x012c, TryCatch #11 {ParsingException -> 0x012c, IOException -> 0x0126, all -> 0x0122, blocks: (B:54:0x0132, B:56:0x0163, B:58:0x0183, B:61:0x018a, B:63:0x0197, B:65:0x01af, B:68:0x01b7, B:94:0x027f, B:102:0x029e, B:62:0x018f, B:104:0x02a9, B:107:0x02c0, B:41:0x0100, B:46:0x0112), top: B:126:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0268  */
    private final AFf1pSDK e() throws Throwable {
        long j;
        Throwable th;
        Throwable cause;
        IOException iOException;
        Throwable cause2;
        ParsingException parsingException;
        Throwable cause3;
        AFh1cSDK aFh1cSDK;
        AFLogger aFLogger;
        LogTag logTag;
        AFd1fSDK aFd1fSDKAFKeystoreWrapper;
        AFh1aSDK aFh1aSDK;
        String strAFKeystoreWrapper;
        String strAFKeystoreWrapper2;
        String strAFKeystoreWrapper3;
        String str;
        AFi1uSDK aFi1uSDKAFKeystoreWrapper;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = this.getLevel;
        AFf1fSDK aFf1fSDK = this.afInfoLog;
        String str3 = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK));
        String strD = null;
        if (str3 == null || StringsKt.I(str3)) {
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Dev key is not set, SDK is not started.", false, 4, null);
        } else if (str2 == null) {
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.", false, 4, null);
        } else {
            strD = AFj1nSDK.d(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.AFLoggerLogLevel.d.d.getPackageName()}), str3);
        }
        String str4 = strD;
        if (str4 == null) {
            AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "can't create CDN token, skipping fetch config", false, 4, null);
            return AFf1pSDK.FAILURE;
        }
        try {
            try {
                try {
                    Boolean bool = (Boolean) this.afWarnLog.AFKeystoreWrapper.getValue();
                    bool.getClass();
                    Boolean bool2 = (Boolean) this.afWarnLog.registerClient.getValue();
                    bool2.getClass();
                    AFf1kSDK aFf1kSDK = this.afWarnLog;
                    try {
                        if (aFf1kSDK.unregisterClient.getOutOfStore == null) {
                            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Cold start detected - fetching config from CDN", false, 4, null);
                        } else {
                            AFh1aSDK aFh1aSDK2 = aFf1kSDK.d.AFLogger;
                            if (aFh1aSDK2 != null) {
                                AFh1gSDK aFh1gSDK = aFh1aSDK2.registerClient;
                                boolean z = (aFh1gSDK == null || (aFh1cSDK = aFh1gSDK.unregisterClient) == null || TimeUnit.SECONDS.toMillis(aFh1cSDK.AFLogger) <= AFh1cSDK.registerClient()) ? false : true;
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                AFf1jSDK aFf1jSDK = aFf1kSDK.d;
                                j = jCurrentTimeMillis;
                                try {
                                    long j2 = jCurrentTimeMillis2 - aFf1jSDK.registerClient;
                                    long millis = TimeUnit.SECONDS.toMillis(aFf1jSDK.unregisterClient);
                                    if (!z && j2 <= millis) {
                                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Using cached config (warm start, config valid)", false, 4, null);
                                        return AFf1pSDK.USE_CACHED;
                                    }
                                    aFLogger = AFLogger.INSTANCE;
                                    logTag = LogTag.REMOTE_CONTROL;
                                    AFLoggerBase.d$default(aFLogger, logTag, "Fetching config (cold start or stale)...", false, 4, null);
                                    aFd1fSDKAFKeystoreWrapper = ((AFd1pSDK) AFd1sSDK.d(new Object[]{this.afErrorLog, bool, bool2, str4, Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)}, 1895390539, -1895390537, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).AFKeystoreWrapper();
                                    if (aFd1fSDKAFKeystoreWrapper.isSuccessful()) {
                                        Intrinsics.checkNotNull(aFd1fSDKAFKeystoreWrapper);
                                        AFKeystoreWrapper(new AFf1xSDK(str4, j, aFd1fSDKAFKeystoreWrapper, (AFh1aSDK) aFd1fSDKAFKeystoreWrapper.getBody(), null, null, null));
                                        AFLoggerBase.w$default(aFLogger, logTag, "failed to fetch remote config from CDN with status code: " + aFd1fSDKAFKeystoreWrapper.getStatusCode(), false, 4, null);
                                        return AFf1pSDK.FAILURE;
                                    }
                                    Intrinsics.checkNotNull(aFd1fSDKAFKeystoreWrapper);
                                    Object body = aFd1fSDKAFKeystoreWrapper.getBody();
                                    Intrinsics.checkNotNullExpressionValue(body, "");
                                    aFh1aSDK = (AFh1aSDK) body;
                                    strAFKeystoreWrapper = aFd1fSDKAFKeystoreWrapper.AFKeystoreWrapper("x-amz-meta-af-auth-v1");
                                    strAFKeystoreWrapper2 = aFd1fSDKAFKeystoreWrapper.AFKeystoreWrapper("CF-Cache-Status");
                                    strAFKeystoreWrapper3 = aFd1fSDKAFKeystoreWrapper.AFKeystoreWrapper("af-net-tkn");
                                    if (strAFKeystoreWrapper3 != null || strAFKeystoreWrapper3.length() == 0) {
                                        AFLoggerBase.d$default(aFLogger, logTag, "Network token header not present in the response", false, 4, null);
                                    } else {
                                        this.AppsFlyerLib.getOutOfStore = strAFKeystoreWrapper3;
                                    }
                                    AFf1fSDK aFf1fSDK2 = this.afInfoLog;
                                    str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK2}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK2));
                                    if (str != null && !StringsKt.I(str)) {
                                        aFi1uSDKAFKeystoreWrapper = this.v.AFKeystoreWrapper(aFh1aSDK, strAFKeystoreWrapper, str4, str);
                                        Intrinsics.checkNotNullExpressionValue(aFi1uSDKAFKeystoreWrapper, "");
                                        if (aFi1uSDKAFKeystoreWrapper.AFKeystoreWrapper) {
                                            AFKeystoreWrapper(new AFf1xSDK(str4, j, aFd1fSDKAFKeystoreWrapper, (AFh1aSDK) aFd1fSDKAFKeystoreWrapper.getBody(), aFi1uSDKAFKeystoreWrapper.AFLogger, strAFKeystoreWrapper2, null));
                                            AFLoggerBase.w$default(aFLogger, logTag, "fetched config is not valid (MITM?) refuse to use it.", false, 4, null);
                                            return AFf1pSDK.FAILURE;
                                        }
                                        try {
                                            long jAFKeystoreWrapper = this.afWarnLog.AFKeystoreWrapper();
                                            AFLoggerBase.v$default(aFLogger, logTag, "using max-age fallback: " + jAFKeystoreWrapper + " seconds", false, 4, null);
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            AFf1jSDK aFf1jSDK2 = this.afDebugLog;
                                            try {
                                                aFf1jSDK2.AFKeystoreWrapper.d("af_remote_config", Base64.encodeToString(aFh1aSDK.d.getBytes(Charset.defaultCharset()), 2));
                                                aFf1jSDK2.d = aFf1jSDK2.AFLogger;
                                                aFf1jSDK2.AFKeystoreWrapper.AFLogger("af_rc_timestamp", jCurrentTimeMillis3);
                                                aFf1jSDK2.AFKeystoreWrapper.AFLogger("af_rc_max_age", jAFKeystoreWrapper);
                                                aFf1jSDK2.AFLogger = aFh1aSDK;
                                                aFf1jSDK2.registerClient = jCurrentTimeMillis3;
                                                aFf1jSDK2.unregisterClient = jAFKeystoreWrapper;
                                                AFLoggerBase.d$default(aFLogger, logTag, "Config successfully updated, timeToLive: " + jAFKeystoreWrapper + " seconds", false, 4, null);
                                                str4 = str4;
                                                jCurrentTimeMillis = j;
                                                AFKeystoreWrapper(new AFf1xSDK(str4, jCurrentTimeMillis, aFd1fSDKAFKeystoreWrapper, (AFh1aSDK) aFd1fSDKAFKeystoreWrapper.getBody(), aFi1uSDKAFKeystoreWrapper.AFLogger, strAFKeystoreWrapper2, null));
                                                return AFf1pSDK.SUCCESS;
                                            } catch (ParsingException e) {
                                                e = e;
                                                str4 = str4;
                                                jCurrentTimeMillis = j;
                                                parsingException = e;
                                                d(str4, jCurrentTimeMillis, parsingException, parsingException.getRawResponse());
                                                cause3 = parsingException.getCause();
                                                if (cause3 instanceof InterruptedIOException) {
                                                    throw cause3;
                                                }
                                                return AFf1pSDK.FAILURE;
                                            } catch (IOException e2) {
                                                e = e2;
                                                str4 = str4;
                                                jCurrentTimeMillis = j;
                                                iOException = e;
                                                d(str4, jCurrentTimeMillis, iOException, null);
                                                cause2 = iOException.getCause();
                                                if (cause2 instanceof InterruptedIOException) {
                                                    throw cause2;
                                                }
                                                return AFf1pSDK.FAILURE;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str4 = str4;
                                                th = th;
                                                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, C5491nL.c("failed to update remote config: ", th.getMessage()), th, true, false, false, false, 64, null);
                                                Throwable th3 = th;
                                                AFKeystoreWrapper(new AFf1xSDK(str4, j, null, null, null, null, th3));
                                                cause = th3.getCause();
                                                if (cause instanceof InterruptedException) {
                                                    throw cause;
                                                }
                                                return AFf1pSDK.FAILURE;
                                            }
                                        } catch (ParsingException e3) {
                                            e = e3;
                                        } catch (IOException e4) {
                                            e = e4;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                    AFLoggerBase.w$default(aFLogger, logTag, "Dev key is not set, SDK is not started.", false, 4, null);
                                    return AFf1pSDK.FAILURE;
                                } catch (ParsingException e5) {
                                    parsingException = e5;
                                    jCurrentTimeMillis = j;
                                    d(str4, jCurrentTimeMillis, parsingException, parsingException.getRawResponse());
                                    cause3 = parsingException.getCause();
                                    if (cause3 instanceof InterruptedIOException) {
                                        return AFf1pSDK.FAILURE;
                                    }
                                    throw cause3;
                                } catch (IOException e6) {
                                    iOException = e6;
                                    jCurrentTimeMillis = j;
                                    d(str4, jCurrentTimeMillis, iOException, null);
                                    cause2 = iOException.getCause();
                                    if (cause2 instanceof InterruptedIOException) {
                                        return AFf1pSDK.FAILURE;
                                    }
                                    throw cause2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    th = th;
                                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, C5491nL.c("failed to update remote config: ", th.getMessage()), th, true, false, false, false, 64, null);
                                    Throwable th6 = th;
                                    AFKeystoreWrapper(new AFf1xSDK(str4, j, null, null, null, null, th6));
                                    cause = th6.getCause();
                                    if (cause instanceof InterruptedException) {
                                        return AFf1pSDK.FAILURE;
                                    }
                                    throw cause;
                                }
                            }
                            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
                        }
                        j = jCurrentTimeMillis;
                        aFLogger = AFLogger.INSTANCE;
                        logTag = LogTag.REMOTE_CONTROL;
                        AFLoggerBase.d$default(aFLogger, logTag, "Fetching config (cold start or stale)...", false, 4, null);
                        aFd1fSDKAFKeystoreWrapper = ((AFd1pSDK) AFd1sSDK.d(new Object[]{this.afErrorLog, bool, bool2, str4, Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)}, 1895390539, -1895390537, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).AFKeystoreWrapper();
                        if (aFd1fSDKAFKeystoreWrapper.isSuccessful()) {
                            Intrinsics.checkNotNull(aFd1fSDKAFKeystoreWrapper);
                            AFKeystoreWrapper(new AFf1xSDK(str4, j, aFd1fSDKAFKeystoreWrapper, (AFh1aSDK) aFd1fSDKAFKeystoreWrapper.getBody(), null, null, null));
                            AFLoggerBase.w$default(aFLogger, logTag, "failed to fetch remote config from CDN with status code: " + aFd1fSDKAFKeystoreWrapper.getStatusCode(), false, 4, null);
                            return AFf1pSDK.FAILURE;
                        }
                        Intrinsics.checkNotNull(aFd1fSDKAFKeystoreWrapper);
                        Object body2 = aFd1fSDKAFKeystoreWrapper.getBody();
                        Intrinsics.checkNotNullExpressionValue(body2, "");
                        aFh1aSDK = (AFh1aSDK) body2;
                        strAFKeystoreWrapper = aFd1fSDKAFKeystoreWrapper.AFKeystoreWrapper("x-amz-meta-af-auth-v1");
                        strAFKeystoreWrapper2 = aFd1fSDKAFKeystoreWrapper.AFKeystoreWrapper("CF-Cache-Status");
                        strAFKeystoreWrapper3 = aFd1fSDKAFKeystoreWrapper.AFKeystoreWrapper("af-net-tkn");
                        if (strAFKeystoreWrapper3 != null) {
                            AFLoggerBase.d$default(aFLogger, logTag, "Network token header not present in the response", false, 4, null);
                        } else {
                            AFLoggerBase.d$default(aFLogger, logTag, "Network token header not present in the response", false, 4, null);
                        }
                        AFf1fSDK aFf1fSDK3 = this.afInfoLog;
                        str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK3}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK3));
                        if (str != null) {
                            aFi1uSDKAFKeystoreWrapper = this.v.AFKeystoreWrapper(aFh1aSDK, strAFKeystoreWrapper, str4, str);
                            Intrinsics.checkNotNullExpressionValue(aFi1uSDKAFKeystoreWrapper, "");
                            if (aFi1uSDKAFKeystoreWrapper.AFKeystoreWrapper) {
                                AFKeystoreWrapper(new AFf1xSDK(str4, j, aFd1fSDKAFKeystoreWrapper, (AFh1aSDK) aFd1fSDKAFKeystoreWrapper.getBody(), aFi1uSDKAFKeystoreWrapper.AFLogger, strAFKeystoreWrapper2, null));
                                AFLoggerBase.w$default(aFLogger, logTag, "fetched config is not valid (MITM?) refuse to use it.", false, 4, null);
                                return AFf1pSDK.FAILURE;
                            }
                            long jAFKeystoreWrapper2 = this.afWarnLog.AFKeystoreWrapper();
                            AFLoggerBase.v$default(aFLogger, logTag, "using max-age fallback: " + jAFKeystoreWrapper2 + " seconds", false, 4, null);
                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                            AFf1jSDK aFf1jSDK3 = this.afDebugLog;
                            aFf1jSDK3.AFKeystoreWrapper.d("af_remote_config", Base64.encodeToString(aFh1aSDK.d.getBytes(Charset.defaultCharset()), 2));
                            aFf1jSDK3.d = aFf1jSDK3.AFLogger;
                            aFf1jSDK3.AFKeystoreWrapper.AFLogger("af_rc_timestamp", jCurrentTimeMillis4);
                            aFf1jSDK3.AFKeystoreWrapper.AFLogger("af_rc_max_age", jAFKeystoreWrapper2);
                            aFf1jSDK3.AFLogger = aFh1aSDK;
                            aFf1jSDK3.registerClient = jCurrentTimeMillis4;
                            aFf1jSDK3.unregisterClient = jAFKeystoreWrapper2;
                            AFLoggerBase.d$default(aFLogger, logTag, "Config successfully updated, timeToLive: " + jAFKeystoreWrapper2 + " seconds", false, 4, null);
                            str4 = str4;
                            jCurrentTimeMillis = j;
                            AFKeystoreWrapper(new AFf1xSDK(str4, jCurrentTimeMillis, aFd1fSDKAFKeystoreWrapper, (AFh1aSDK) aFd1fSDKAFKeystoreWrapper.getBody(), aFi1uSDKAFKeystoreWrapper.AFLogger, strAFKeystoreWrapper2, null));
                            return AFf1pSDK.SUCCESS;
                        }
                        AFLoggerBase.w$default(aFLogger, logTag, "Dev key is not set, SDK is not started.", false, 4, null);
                        return AFf1pSDK.FAILURE;
                    } catch (Throwable th7) {
                        th = th7;
                        j = jCurrentTimeMillis;
                        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, C5491nL.c("failed to update remote config: ", th.getMessage()), th, true, false, false, false, 64, null);
                        Throwable th8 = th;
                        AFKeystoreWrapper(new AFf1xSDK(str4, j, null, null, null, null, th8));
                        cause = th8.getCause();
                        if (cause instanceof InterruptedException) {
                            return AFf1pSDK.FAILURE;
                        }
                        throw cause;
                    }
                } catch (ParsingException e7) {
                    e = e7;
                } catch (IOException e8) {
                    e = e8;
                }
            } catch (Throwable th9) {
                th = th9;
                j = jCurrentTimeMillis;
            }
        } catch (ParsingException e9) {
            e = e9;
        } catch (IOException e10) {
            e = e10;
        }
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    public final long d() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() throws Throwable {
        try {
            AFf1pSDK aFf1pSDKE = e();
            this.i = aFf1pSDKE;
            return aFf1pSDKE == AFf1pSDK.FAILURE ? AFd1cSDK.FAILURE : AFd1cSDK.SUCCESS;
        } catch (InterruptedIOException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "RC update config failed", e, false, false, false, false, 64, null);
            this.i = AFf1pSDK.FAILURE;
            return AFd1cSDK.TIMEOUT;
        } catch (InterruptedException e2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "RC update config failed", e2, false, false, false, false, 64, null);
            this.i = AFf1pSDK.FAILURE;
            return AFd1cSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.i = AFf1pSDK.FAILURE;
            return AFd1cSDK.TIMEOUT;
        }
    }

    private final void d(String str, long j, IOException iOException, AFd1fSDK<?> aFd1fSDK) {
        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, C5491nL.c("failed to fetch remote config: ", iOException.getMessage()), iOException, true, false, false, false, 64, null);
        AFKeystoreWrapper(new AFf1xSDK(str, j, aFd1fSDK, null, null, null, iOException));
    }
}

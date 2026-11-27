package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.C4564j;
import defpackage.R40;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1ySDK {
    private static final long AFKeystoreWrapper;
    private static final int d;

    @NotNull
    private static final IntRange unregisterClient;

    static {
        kotlin.time.b.a aVar = kotlin.time.b.e;
        R40 r40 = R40.SECONDS;
        AFKeystoreWrapper = kotlin.time.b.l(kotlin.time.c.g(60, r40));
        d = (int) kotlin.time.b.l(kotlin.time.c.g(2, r40));
        unregisterClient = new IntRange(300, 305, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Object> x_(Uri uri) {
        String headerField;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.DDL;
        AFLoggerBase.d$default(aFLogger, logTag, C4564j.d(uri, "ESP deeplink resolving is started: "), false, 4, null);
        HttpURLConnection httpURLConnection = null;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
            Intrinsics.c(uRLConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnection;
            httpURLConnection2.setInstanceFollowRedirects(false);
            int i = d;
            httpURLConnection2.setReadTimeout(i);
            httpURLConnection2.setConnectTimeout(i);
            httpURLConnection2.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection2.setRequestProperty("af-esp", "7.0.1");
            try {
                int responseCode = httpURLConnection2.getResponseCode();
                linkedHashMap.put("status", Integer.valueOf(responseCode));
                IntRange intRange = unregisterClient;
                int i2 = intRange.d;
                if (responseCode <= intRange.e && i2 <= responseCode && (headerField = httpURLConnection2.getHeaderField("Location")) != null) {
                    linkedHashMap.put("res", headerField);
                }
                AFLoggerBase.d$default(aFLogger, logTag, "ESP deeplink resolving is finished", false, 4, null);
                httpURLConnection2.disconnect();
                return linkedHashMap;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                Throwable th2 = th;
                try {
                    String localizedMessage = th2.getLocalizedMessage();
                    if (localizedMessage != null) {
                        linkedHashMap.put("error", localizedMessage);
                    }
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    LogTag logTag2 = LogTag.DDL;
                    String message = th2.getMessage();
                    if (message == null) {
                        message = "Error resolving ESP deeplink";
                    }
                    AFLoggerBase.e$default(aFLogger2, logTag2, message, th2, false, false, false, false, 120, null);
                    return linkedHashMap;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

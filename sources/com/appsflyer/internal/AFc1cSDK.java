package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.C0648Bc;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000b\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u0015\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "unregisterClient", "()Z", "Ljava/net/HttpURLConnection;", "", "(Ljava/net/HttpURLConnection;J)Z", "registerClient", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "AFKeystoreWrapper", "[B", "Ljava/util/Map;", "I", "()Ljava/lang/String;", "AFLogger", "Lcom/appsflyer/internal/AFd1tSDK;", "()Lcom/appsflyer/internal/AFd1tSDK;", "Z", "i"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AFc1cSDK {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public byte[] d;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean i;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    public int AFKeystoreWrapper;

    @Nullable
    public Map<String, String> unregisterClient;

    public AFc1cSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.d = bArr;
        this.unregisterClient = map;
        this.AFKeystoreWrapper = i;
        this.i = true;
    }

    private final boolean d(HttpURLConnection httpURLConnection, long j) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb.append("\n length: ");
        sb.append(new String(this.d, Charsets.UTF_8).length());
        Map<String, String> map = this.unregisterClient;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ");
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        AFLogger.INSTANCE.v(LogTag.REMOTE_CONTROL, d("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb)), getI());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFKeystoreWrapper);
        httpURLConnection.setConnectTimeout(this.AFKeystoreWrapper);
        httpURLConnection.addRequestProperty("Content-Type", d().unregisterClient);
        Map<String, String> map2 = this.unregisterClient;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.d.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.d);
        bufferedOutputStream.close();
        String strRegisterClient = registerClient(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + strRegisterClient + "\n\ttook " + jCurrentTimeMillis + "ms";
        AFLogger.INSTANCE.v(LogTag.REMOTE_CONTROL, d("HTTP: [" + httpURLConnection.hashCode() + "] " + str), getI());
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    private static String registerClient(HttpURLConnection p0) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p0.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.HTTP_CLIENT;
            String message = th.getMessage();
            AFLoggerBase.e$default(aFLogger, logTag, message == null ? "" : message, th, false, false, false, false, 96, null);
            errorStream = p0.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String strJ = CollectionsKt.J(C0648Bc.m(bufferedReader), null, null, null, null, 63);
        bufferedReader.close();
        return strJ == null ? "" : strJ;
    }

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from getter */
    public boolean getI() {
        return this.i;
    }

    @NotNull
    public abstract AFd1tSDK d();

    @NotNull
    public abstract String d(@NotNull String str);

    @NotNull
    public abstract String registerClient();

    public final boolean unregisterClient() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String strRegisterClient = registerClient();
            Intrinsics.checkNotNullParameter(strRegisterClient, "");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(strRegisterClient).openConnection());
            Intrinsics.c(uRLConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnection;
            try {
                boolean zD = d(httpURLConnection2, jCurrentTimeMillis);
                httpURLConnection2.disconnect();
                return zD;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    AFLogger.INSTANCE.v(LogTag.REMOTE_CONTROL, d("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str), getI());
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

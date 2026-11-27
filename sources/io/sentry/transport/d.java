package io.sentry.transport;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.C1039Gc0;
import defpackage.C2688aH1;
import defpackage.C3537eG1;
import defpackage.C7705xs1;
import defpackage.EnumC5932pS;
import defpackage.NG1;
import io.sentry.util.x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final Charset e = Charset.forName("UTF-8");

    @Nullable
    public final Proxy a;

    @NotNull
    public final C7705xs1 b;

    @NotNull
    public final C2688aH1 c;

    @NotNull
    public final l d;

    public d(@NotNull C2688aH1 c2688aH1, @NotNull C7705xs1 c7705xs1, @NotNull l lVar) {
        Proxy proxy;
        String str;
        this.b = c7705xs1;
        this.c = c2688aH1;
        this.d = lVar;
        C2688aH1.m proxy2 = c2688aH1.getProxy();
        if (proxy2 == null || (str = proxy2.b) == null) {
            proxy = null;
        } else {
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.a, Integer.parseInt(str)));
            } catch (NumberFormatException e2) {
                this.c.getLogger().c(NG1.ERROR, e2, C1039Gc0.d("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
                proxy = null;
            }
        }
        this.a = proxy;
        if (proxy == null || c2688aH1.getProxy() == null) {
            return;
        }
        String str2 = c2688aH1.getProxy().c;
        String str3 = c2688aH1.getProxy().d;
        if (str2 == null || str3 == null) {
            return;
        }
        Authenticator.setDefault(new j(str2, str3));
    }

    public static void a(@NotNull HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NotNull
    public static String b(@NotNull HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th4;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    @NotNull
    public final n c(@NotNull HttpURLConnection httpURLConnection) {
        C2688aH1 c2688aH1 = this.c;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            e(httpURLConnection, responseCode);
            if (responseCode == 200) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Envelope sent successfully.", new Object[0]);
                return n.b.a;
            }
            if (responseCode == 413) {
                c2688aH1.getLogger().a(NG1.ERROR, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
            } else {
                c2688aH1.getLogger().a(NG1.ERROR, "Request failed, API returned %s", Integer.valueOf(responseCode));
            }
            if (c2688aH1.isDebug()) {
                c2688aH1.getLogger().a(NG1.ERROR, "%s", b(httpURLConnection));
            }
            return new n.a(responseCode);
        } catch (IOException e2) {
            c2688aH1.getLogger().c(NG1.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
            return new n.a(-1);
        } finally {
            a(httpURLConnection);
        }
    }

    @NotNull
    public final n d(@NotNull C3537eG1 c3537eG1) {
        C2688aH1 c2688aH1 = this.c;
        c2688aH1.getSocketTagger().b();
        C7705xs1 c7705xs1 = this.b;
        URL url = c7705xs1.a;
        Proxy proxy = this.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()) : (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy)));
        for (Map.Entry entry : c7705xs1.b.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(c2688aH1.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(c2688aH1.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = c2688aH1.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    c2688aH1.getSerializer().a(c3537eG1, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    n nVarC = c(httpURLConnection);
                    c2688aH1.getSocketTagger().a();
                    return nVarC;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c2688aH1.getLogger().c(NG1.ERROR, th5, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
                return c(httpURLConnection);
            } finally {
                c(httpURLConnection);
                c2688aH1.getSocketTagger().a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    public final void e(@NotNull HttpURLConnection httpURLConnection, int i) {
        long j;
        double d;
        long j2;
        int i2;
        String string;
        int i3 = 1;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        l lVar = this.d;
        C2688aH1 c2688aH1 = lVar.e;
        double d2 = 1000.0d;
        c cVar = lVar.d;
        if (headerField2 == null) {
            if (i == 429) {
                if (headerField != null) {
                    try {
                        j = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j = 60000;
                    }
                } else {
                    j = 60000;
                }
                cVar.getClass();
                lVar.c(EnumC5932pS.All, new Date(System.currentTimeMillis() + j));
                return;
            }
            return;
        }
        int i4 = -1;
        String[] strArrSplit = headerField2.split(",", -1);
        int length = strArrSplit.length;
        int i5 = 0;
        int i6 = 0;
        while (i6 < length) {
            String[] strArrSplit2 = strArrSplit[i6].replace(" ", "").split(":", i4);
            if (strArrSplit2.length <= 0) {
                d = d2;
            } else {
                String str = strArrSplit2[i5];
                if (str != null) {
                    try {
                        j2 = (long) (Double.parseDouble(str) * d2);
                    } catch (NumberFormatException unused2) {
                        j2 = 60000;
                    }
                } else {
                    j2 = 60000;
                }
                if (strArrSplit2.length > i3) {
                    String str2 = strArrSplit2[i3];
                    cVar.getClass();
                    Date date = new Date(System.currentTimeMillis() + j2);
                    if (str2 == null || str2.isEmpty()) {
                        i3 = i3;
                        d = d2;
                        lVar.c(EnumC5932pS.All, date);
                    } else {
                        String[] strArrSplit3 = str2.split(";", i4);
                        int length2 = strArrSplit3.length;
                        int i7 = i5;
                        while (i7 < length2) {
                            double d3 = d2;
                            String str3 = strArrSplit3[i7];
                            EnumC5932pS enumC5932pSValueOf = EnumC5932pS.Unknown;
                            try {
                                Charset charset = x.a;
                                if (str3 == null || str3.isEmpty()) {
                                    string = str3;
                                } else {
                                    String[] strArrSplit4 = x.b.split(str3, i4);
                                    StringBuilder sb = new StringBuilder();
                                    for (String str4 : strArrSplit4) {
                                        sb.append(x.b(str4));
                                    }
                                    string = sb.toString();
                                }
                                if (string != null) {
                                    enumC5932pSValueOf = EnumC5932pS.valueOf(string);
                                    i2 = i7;
                                } else {
                                    i2 = i7;
                                    try {
                                        c2688aH1.getLogger().a(NG1.ERROR, "Couldn't capitalize: %s", str3);
                                    } catch (IllegalArgumentException e2) {
                                        e = e2;
                                        c2688aH1.getLogger().c(NG1.INFO, e, "Unknown category: %s", str3);
                                    }
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                                i2 = i7;
                            }
                            if (!EnumC5932pS.Unknown.equals(enumC5932pSValueOf)) {
                                lVar.c(enumC5932pSValueOf, date);
                            }
                            i7 = i2 + 1;
                            d2 = d3;
                            i4 = -1;
                        }
                    }
                }
                d = d2;
            }
            i6++;
            i3 = i3;
            d2 = d;
            i4 = -1;
            i5 = 0;
        }
    }
}

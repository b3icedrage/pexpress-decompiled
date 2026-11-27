package defpackage;

import android.util.Log;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7890yl implements MD1, Y21.b {
    public final /* synthetic */ Object d;

    public /* synthetic */ C7890yl(Object obj) {
        this.d = obj;
    }

    public C5414mz.b a(C5414mz.a aVar) throws IOException {
        C5414mz c5414mz = (C5414mz) this.d;
        c5414mz.getClass();
        boolean zIsLoggable = Log.isLoggable(OS0.c("CctTransportBackend"), 4);
        URL url = aVar.a;
        if (zIsLoggable) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c5414mz.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    YK yk = c5414mz.a;
                    C2009Sn c2009Sn = aVar.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    DG0 dg0 = (DG0) yk.d;
                    WH0 wh0 = new WH0(bufferedWriter, dg0.a, dg0.b, dg0.c, dg0.d);
                    wh0.g(c2009Sn);
                    wh0.i();
                    wh0.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(OS0.c("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    OS0.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    OS0.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C5414mz.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C5414mz.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C5414mz.b bVar = new C5414mz.b(responseCode, null, AbstractC6143qS0.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (I60 e) {
            e = e;
            OS0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C5414mz.b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            OS0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C5414mz.b(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            OS0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C5414mz.b(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (IOException e4) {
            e = e4;
            OS0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C5414mz.b(400, null, 0L);
        }
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        C0831Dl.a aVar = (C0831Dl.a) this.d;
        scope.b("auth.flow", aVar.a);
        scope.b("auth.attempt_id", aVar.b);
    }
}

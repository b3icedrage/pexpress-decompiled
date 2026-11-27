package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: renamed from: Kr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1396Kr0 implements InterfaceC6771tS<InputStream> {
    public final C5162lm0 d;
    public final int e;
    public HttpURLConnection g;
    public InputStream h;
    public volatile boolean i;

    /* JADX INFO: renamed from: Kr0$a */
    public static class a {
    }

    public C1396Kr0(C5162lm0 c5162lm0, int i) {
        this.d = c5162lm0;
        this.e = i;
    }

    @Override // defpackage.InterfaceC6771tS
    @NonNull
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.InterfaceC6771tS
    public final void b() {
        InputStream inputStream = this.h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.g = null;
    }

    @Override // defpackage.InterfaceC6771tS
    public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super InputStream> aVar) {
        C5162lm0 c5162lm0 = this.d;
        int i = C6562sS0.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            aVar.f(d(c5162lm0.d(), 0, null, c5162lm0.b.b()));
        } catch (IOException e) {
            Log.isLoggable("HttpUrlFetcher", 3);
            aVar.d(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    @Override // defpackage.InterfaceC6771tS
    public final void cancel() {
        this.i = true;
    }

    public final InputStream d(URL url, int i, URL url2, Map<String, String> map) throws C6228qq0 {
        int responseCode;
        int responseCode2 = -1;
        if (i >= 5) {
            throw new C6228qq0("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C6228qq0("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            int i2 = this.e;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.g = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.h = this.g.getInputStream();
                if (this.i) {
                    return null;
                }
                try {
                    responseCode = this.g.getResponseCode();
                } catch (IOException unused2) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                    responseCode = -1;
                }
                int i3 = responseCode / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.g;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.h = new XL(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.h = httpURLConnection2.getInputStream();
                        }
                        return this.h;
                    } catch (IOException e) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                            Log.isLoggable("HttpUrlFetcher", 3);
                        }
                        throw new C6228qq0("Failed to obtain InputStream", responseCode2, e);
                    }
                }
                if (i3 != 3) {
                    if (responseCode == -1) {
                        throw new C6228qq0("Http request failed", responseCode, null);
                    }
                    try {
                        throw new C6228qq0(this.g.getResponseMessage(), responseCode, null);
                    } catch (IOException e2) {
                        throw new C6228qq0("Failed to get a response message", responseCode, e2);
                    }
                }
                String headerField = this.g.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C6228qq0("Received empty or null redirect url", responseCode, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return d(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C6228qq0(C5491nL.c("Bad redirect url: ", headerField), responseCode, e3);
                }
            } catch (IOException e4) {
                try {
                    responseCode2 = this.g.getResponseCode();
                } catch (IOException unused4) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                }
                throw new C6228qq0("Failed to connect or obtain data", responseCode2, e4);
            }
        } catch (IOException e5) {
            throw new C6228qq0("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.InterfaceC6771tS
    @NonNull
    public final CS e() {
        return CS.e;
    }
}

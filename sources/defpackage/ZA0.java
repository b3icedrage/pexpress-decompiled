package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ZA0 extends HttpURLConnection {
    public final C2893bB0 a;

    public ZA0(HttpURLConnection httpURLConnection, QZ1 qz1, W31 w31) {
        super(httpURLConnection.getURL());
        this.a = new C2893bB0(httpURLConnection, qz1, w31);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.a.a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        C2893bB0 c2893bB0 = this.a;
        long jA = c2893bB0.e.a();
        W31 w31 = c2893bB0.b;
        w31.i(jA);
        w31.b();
        c2893bB0.a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.a.a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.a.a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.a.a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.a.a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.a.a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.a.a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.a.a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.a.a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.a.f();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.getClass();
        try {
            return c2893bB0.a.getPermission();
        } catch (IOException e) {
            long jA = c2893bB0.e.a();
            W31 w31 = c2893bB0.b;
            w31.i(jA);
            X31.c(w31);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.a.a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.a.a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.a.a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.a.a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.a.h();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.a.a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.a.a.getUseCaches();
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.a.a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.a.a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.a.a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.a.a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.a.a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.a.a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.a.a.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.a.a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.a.a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.a.a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.a.a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            c2893bB0.b.j = str2;
        }
        c2893bB0.a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.a.a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.a.a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.a.a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.a.c(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        C2893bB0 c2893bB0 = this.a;
        c2893bB0.i();
        return c2893bB0.a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.a.a.setFixedLengthStreamingMode(j);
    }
}

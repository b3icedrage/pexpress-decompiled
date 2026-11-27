package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: bB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2893bB0 {
    public static final C6170qb f = C6170qb.d();
    public final HttpURLConnection a;
    public final W31 b;
    public long c = -1;
    public long d = -1;
    public final QZ1 e;

    public C2893bB0(HttpURLConnection httpURLConnection, QZ1 qz1, W31 w31) {
        this.a = httpURLConnection;
        this.b = w31;
        this.e = qz1;
        w31.j(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j = this.c;
        W31 w31 = this.b;
        QZ1 qz1 = this.e;
        if (j == -1) {
            qz1.c();
            long j2 = qz1.d;
            this.c = j2;
            w31.f(j2);
        }
        try {
            this.a.connect();
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    public final Object b() throws IOException {
        QZ1 qz1 = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        W31 w31 = this.b;
        w31.d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                w31.g(httpURLConnection.getContentType());
                return new XA0((InputStream) content, w31, qz1);
            }
            w31.g(httpURLConnection.getContentType());
            w31.h(httpURLConnection.getContentLength());
            w31.i(qz1.a());
            w31.b();
            return content;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        QZ1 qz1 = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        W31 w31 = this.b;
        w31.d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                w31.g(httpURLConnection.getContentType());
                return new XA0((InputStream) content, w31, qz1);
            }
            w31.g(httpURLConnection.getContentType());
            w31.h(httpURLConnection.getContentLength());
            w31.i(qz1.a());
            w31.b();
            return content;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.a;
        W31 w31 = this.b;
        i();
        try {
            w31.d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a();
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new XA0(errorStream, w31, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        QZ1 qz1 = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        W31 w31 = this.b;
        w31.d(responseCode);
        w31.g(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new XA0(inputStream, w31, qz1) : inputStream;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        QZ1 qz1 = this.e;
        W31 w31 = this.b;
        try {
            OutputStream outputStream = this.a.getOutputStream();
            return outputStream != null ? new YA0(outputStream, w31, qz1) : outputStream;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.d;
        QZ1 qz1 = this.e;
        W31 w31 = this.b;
        if (j == -1) {
            long jA = qz1.a();
            this.d = jA;
            V31.a aVar = w31.h;
            aVar.p();
            V31.D((V31) aVar.e, jA);
        }
        try {
            int responseCode = this.a.getResponseCode();
            w31.d(responseCode);
            return responseCode;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.a;
        i();
        long j = this.d;
        QZ1 qz1 = this.e;
        W31 w31 = this.b;
        if (j == -1) {
            long jA = qz1.a();
            this.d = jA;
            V31.a aVar = w31.h;
            aVar.p();
            V31.D((V31) aVar.e, jA);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            w31.d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        long j = this.c;
        W31 w31 = this.b;
        if (j == -1) {
            QZ1 qz1 = this.e;
            qz1.c();
            long j2 = qz1.d;
            this.c = j2;
            w31.f(j2);
        }
        HttpURLConnection httpURLConnection = this.a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            w31.c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            w31.c("POST");
        } else {
            w31.c("GET");
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import defpackage.C2669aB0;
import defpackage.C2872b52;
import defpackage.QZ1;
import defpackage.W31;
import defpackage.X31;
import defpackage.ZA0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        C2872b52 c2872b52 = C2872b52.w;
        QZ1 qz1 = new QZ1();
        qz1.c();
        long j = qz1.d;
        W31 w31 = new W31(c2872b52);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new C2669aB0((HttpsURLConnection) uRLConnectionOpenConnection, qz1, w31).a.b();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new ZA0((HttpURLConnection) uRLConnectionOpenConnection, qz1, w31).a.b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            w31.f(j);
            w31.i(qz1.a());
            w31.j(url.toString());
            X31.c(w31);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new C2669aB0((HttpsURLConnection) obj, new QZ1(), new W31(C2872b52.w));
        }
        return obj instanceof HttpURLConnection ? new ZA0((HttpURLConnection) obj, new QZ1(), new W31(C2872b52.w)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        C2872b52 c2872b52 = C2872b52.w;
        QZ1 qz1 = new QZ1();
        qz1.c();
        long j = qz1.d;
        W31 w31 = new W31(c2872b52);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new C2669aB0((HttpsURLConnection) uRLConnectionOpenConnection, qz1, w31).a.e();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new ZA0((HttpURLConnection) uRLConnectionOpenConnection, qz1, w31).a.e() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            w31.f(j);
            w31.i(qz1.a());
            w31.j(url.toString());
            X31.c(w31);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        C2872b52 c2872b52 = C2872b52.w;
        QZ1 qz1 = new QZ1();
        qz1.c();
        long j = qz1.d;
        W31 w31 = new W31(c2872b52);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new C2669aB0((HttpsURLConnection) uRLConnectionOpenConnection, qz1, w31).a.c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new ZA0((HttpURLConnection) uRLConnectionOpenConnection, qz1, w31).a.c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            w31.f(j);
            w31.i(qz1.a());
            w31.j(url.toString());
            X31.c(w31);
            throw e;
        }
    }
}

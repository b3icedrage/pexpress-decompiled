package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import defpackage.C1742Pc;
import defpackage.C2872b52;
import defpackage.C6092qB0;
import defpackage.QZ1;
import defpackage.W31;
import defpackage.X31;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        QZ1 qz1 = new QZ1();
        W31 w31 = new W31(C2872b52.w);
        try {
            w31.j(httpUriRequest.getURI().toString());
            w31.c(httpUriRequest.getMethod());
            Long lA = X31.a(httpUriRequest);
            if (lA != null) {
                w31.e(lA.longValue());
            }
            qz1.c();
            w31.f(qz1.d);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            w31.i(qz1.a());
            w31.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = X31.a(httpResponseExecute);
            if (lA2 != null) {
                w31.h(lA2.longValue());
            }
            String strB = X31.b(httpResponseExecute);
            if (strB != null) {
                w31.g(strB);
            }
            w31.b();
            return httpResponseExecute;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        QZ1 qz1 = new QZ1();
        W31 w31 = new W31(C2872b52.w);
        try {
            w31.j(httpUriRequest.getURI().toString());
            w31.c(httpUriRequest.getMethod());
            Long lA = X31.a(httpUriRequest);
            if (lA != null) {
                w31.e(lA.longValue());
            }
            qz1.c();
            w31.f(qz1.d);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            w31.i(qz1.a());
            w31.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = X31.a(httpResponseExecute);
            if (lA2 != null) {
                w31.h(lA2.longValue());
            }
            String strB = X31.b(httpResponseExecute);
            if (strB != null) {
                w31.g(strB);
            }
            w31.b();
            return httpResponseExecute;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        QZ1 qz1 = new QZ1();
        W31 w31 = new W31(C2872b52.w);
        try {
            w31.j(httpUriRequest.getURI().toString());
            w31.c(httpUriRequest.getMethod());
            Long lA = X31.a(httpUriRequest);
            if (lA != null) {
                w31.e(lA.longValue());
            }
            qz1.c();
            w31.f(qz1.d);
            return (T) httpClient.execute(httpUriRequest, new C6092qB0(responseHandler, qz1, w31));
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        QZ1 qz1 = new QZ1();
        W31 w31 = new W31(C2872b52.w);
        try {
            w31.j(httpUriRequest.getURI().toString());
            w31.c(httpUriRequest.getMethod());
            Long lA = X31.a(httpUriRequest);
            if (lA != null) {
                w31.e(lA.longValue());
            }
            qz1.c();
            w31.f(qz1.d);
            return (T) httpClient.execute(httpUriRequest, new C6092qB0(responseHandler, qz1, w31), httpContext);
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        QZ1 qz1 = new QZ1();
        W31 w31 = new W31(C2872b52.w);
        try {
            w31.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            w31.c(httpRequest.getRequestLine().getMethod());
            Long lA = X31.a(httpRequest);
            if (lA != null) {
                w31.e(lA.longValue());
            }
            qz1.c();
            w31.f(qz1.d);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            w31.i(qz1.a());
            w31.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = X31.a(httpResponseExecute);
            if (lA2 != null) {
                w31.h(lA2.longValue());
            }
            String strB = X31.b(httpResponseExecute);
            if (strB != null) {
                w31.g(strB);
            }
            w31.b();
            return httpResponseExecute;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        QZ1 qz1 = new QZ1();
        W31 w31 = new W31(C2872b52.w);
        try {
            w31.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            w31.c(httpRequest.getRequestLine().getMethod());
            Long lA = X31.a(httpRequest);
            if (lA != null) {
                w31.e(lA.longValue());
            }
            qz1.c();
            w31.f(qz1.d);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            w31.i(qz1.a());
            w31.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = X31.a(httpResponseExecute);
            if (lA2 != null) {
                w31.h(lA2.longValue());
            }
            String strB = X31.b(httpResponseExecute);
            if (strB != null) {
                w31.g(strB);
            }
            w31.b();
            return httpResponseExecute;
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        QZ1 qz1 = new QZ1();
        W31 w31 = new W31(C2872b52.w);
        try {
            w31.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            w31.c(httpRequest.getRequestLine().getMethod());
            Long lA = X31.a(httpRequest);
            if (lA != null) {
                w31.e(lA.longValue());
            }
            qz1.c();
            w31.f(qz1.d);
            return (T) httpClient.execute(httpHost, httpRequest, new C6092qB0(responseHandler, qz1, w31));
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        QZ1 qz1 = new QZ1();
        W31 w31 = new W31(C2872b52.w);
        try {
            w31.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            w31.c(httpRequest.getRequestLine().getMethod());
            Long lA = X31.a(httpRequest);
            if (lA != null) {
                w31.e(lA.longValue());
            }
            qz1.c();
            w31.f(qz1.d);
            return (T) httpClient.execute(httpHost, httpRequest, new C6092qB0(responseHandler, qz1, w31), httpContext);
        } catch (IOException e) {
            C1742Pc.e(qz1, w31, w31);
            throw e;
        }
    }
}

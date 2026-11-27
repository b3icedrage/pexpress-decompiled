package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: renamed from: qB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6092qB0<T> implements ResponseHandler<T> {
    public final ResponseHandler<? extends T> a;
    public final QZ1 b;
    public final W31 c;

    public C6092qB0(ResponseHandler<? extends T> responseHandler, QZ1 qz1, W31 w31) {
        this.a = responseHandler;
        this.b = qz1;
        this.c = w31;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final T handleResponse(HttpResponse httpResponse) {
        this.c.i(this.b.a());
        this.c.d(httpResponse.getStatusLine().getStatusCode());
        Long lA = X31.a(httpResponse);
        if (lA != null) {
            this.c.h(lA.longValue());
        }
        String strB = X31.b(httpResponse);
        if (strB != null) {
            this.c.g(strB);
        }
        this.c.b();
        return this.a.handleResponse(httpResponse);
    }
}

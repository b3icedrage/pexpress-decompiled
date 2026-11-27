package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0766Cp0 implements L90 {

    @NotNull
    public static final List<String> g = C6806tc2.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    @NotNull
    public static final List<String> h = C6806tc2.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    @NotNull
    public final C3442do1 a;

    @NotNull
    public final C5593no1 b;

    @NotNull
    public final C6644sp0 c;

    @Nullable
    public volatile C0922Ep0 d;

    @NotNull
    public final EnumC1298Jk1 e;
    public volatile boolean f;

    public C0766Cp0(@NotNull C6711t81 client, @NotNull C3442do1 connection, @NotNull C5593no1 chain, @NotNull C6644sp0 http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.a = connection;
        this.b = chain;
        this.c = http2Connection;
        List<EnumC1298Jk1> list = client.w;
        EnumC1298Jk1 enumC1298Jk1 = EnumC1298Jk1.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(enumC1298Jk1) ? enumC1298Jk1 : EnumC1298Jk1.HTTP_2;
    }

    @Override // defpackage.L90
    public final void a(@NotNull C4543is1 request) throws IOException {
        int i;
        C0922Ep0 c0922Ep0;
        boolean z = true;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.d != null) {
            return;
        }
        boolean z2 = request.d != null;
        Intrinsics.checkNotNullParameter(request, "request");
        C2813ao0 c2813ao0 = request.c;
        ArrayList requestHeaders = new ArrayList(c2813ao0.size() + 4);
        requestHeaders.add(new C1932Rn0(C1932Rn0.f, request.b));
        C1802Pw c1802Pw = C1932Rn0.g;
        C1318Jr0 url = request.a;
        Intrinsics.checkNotNullParameter(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        requestHeaders.add(new C1932Rn0(c1802Pw, strB));
        String strA = request.a("Host");
        if (strA != null) {
            requestHeaders.add(new C1932Rn0(C1932Rn0.i, strA));
        }
        requestHeaders.add(new C1932Rn0(C1932Rn0.h, url.a));
        int size = c2813ao0.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strC = c2813ao0.c(i2);
            Locale locale = Locale.US;
            String strG = C4564j.g(locale, "US", strC, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!g.contains(strG) || (Intrinsics.a(strG, "te") && Intrinsics.a(c2813ao0.f(i2), "trailers"))) {
                requestHeaders.add(new C1932Rn0(strG, c2813ao0.f(i2)));
            }
        }
        C6644sp0 c6644sp0 = this.c;
        c6644sp0.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z3 = !z2;
        synchronized (c6644sp0.B) {
            synchronized (c6644sp0) {
                try {
                    if (c6644sp0.i > 1073741823) {
                        c6644sp0.l(EnumC7967z70.REFUSED_STREAM);
                    }
                    if (c6644sp0.j) {
                        throw new C3757fK();
                    }
                    i = c6644sp0.i;
                    c6644sp0.i = i + 2;
                    c0922Ep0 = new C0922Ep0(i, c6644sp0, z3, false, null);
                    if (z2 && c6644sp0.y < c6644sp0.z && c0922Ep0.e < c0922Ep0.f) {
                        z = false;
                    }
                    if (c0922Ep0.h()) {
                        c6644sp0.e.put(Integer.valueOf(i), c0922Ep0);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c6644sp0.B.l(z3, i, requestHeaders);
        }
        if (z) {
            c6644sp0.B.flush();
        }
        this.d = c0922Ep0;
        if (this.f) {
            C0922Ep0 c0922Ep1 = this.d;
            Intrinsics.checkNotNull(c0922Ep1);
            c0922Ep1.e(EnumC7967z70.CANCEL);
            throw new IOException("Canceled");
        }
        C0922Ep0 c0922Ep2 = this.d;
        Intrinsics.checkNotNull(c0922Ep2);
        C0922Ep0.c cVar = c0922Ep2.k;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.g(j, timeUnit);
        C0922Ep0 c0922Ep3 = this.d;
        Intrinsics.checkNotNull(c0922Ep3);
        c0922Ep3.l.g(this.b.h, timeUnit);
    }

    @Override // defpackage.L90
    @NotNull
    public final UN1 b(@NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        C0922Ep0 c0922Ep0 = this.d;
        Intrinsics.checkNotNull(c0922Ep0);
        return c0922Ep0.i;
    }

    @Override // defpackage.L90
    public final void c() throws SocketTimeoutException {
        C0922Ep0 c0922Ep0 = this.d;
        Intrinsics.checkNotNull(c0922Ep0);
        c0922Ep0.f().close();
    }

    @Override // defpackage.L90
    public final void cancel() {
        this.f = true;
        C0922Ep0 c0922Ep0 = this.d;
        if (c0922Ep0 != null) {
            c0922Ep0.e(EnumC7967z70.CANCEL);
        }
    }

    @Override // defpackage.L90
    @NotNull
    public final KM1 d(@NotNull C4543is1 request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        C0922Ep0 c0922Ep0 = this.d;
        Intrinsics.checkNotNull(c0922Ep0);
        return c0922Ep0.f();
    }

    @Override // defpackage.L90
    @Nullable
    public final C0857Dt1.a e(boolean z) throws IOException {
        C2813ao0 headerBlock;
        C0922Ep0 c0922Ep0 = this.d;
        if (c0922Ep0 == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c0922Ep0) {
            c0922Ep0.k.i();
            while (c0922Ep0.g.isEmpty() && c0922Ep0.m == null) {
                try {
                    c0922Ep0.k();
                } catch (Throwable th) {
                    c0922Ep0.k.l();
                    throw th;
                }
            }
            c0922Ep0.k.l();
            if (c0922Ep0.g.isEmpty()) {
                IOException iOException = c0922Ep0.n;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC7967z70 enumC7967z70 = c0922Ep0.m;
                Intrinsics.checkNotNull(enumC7967z70);
                throw new C2945bS1(enumC7967z70);
            }
            C2813ao0 c2813ao0RemoveFirst = c0922Ep0.g.removeFirst();
            Intrinsics.checkNotNullExpressionValue(c2813ao0RemoveFirst, "headersQueue.removeFirst()");
            headerBlock = c2813ao0RemoveFirst;
        }
        EnumC1298Jk1 protocol = this.e;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        C2813ao0.a aVar = new C2813ao0.a();
        int size = headerBlock.size();
        ZP1 zp1A = null;
        for (int i = 0; i < size; i++) {
            String strC = headerBlock.c(i);
            String strF = headerBlock.f(i);
            if (Intrinsics.a(strC, ":status")) {
                zp1A = ZP1.a.a("HTTP/1.1 " + strF);
            } else if (!h.contains(strC)) {
                aVar.c(strC, strF);
            }
        }
        if (zp1A == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C0857Dt1.a aVar2 = new C0857Dt1.a();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        aVar2.b = protocol;
        aVar2.c = zp1A.b;
        String message = zp1A.c;
        Intrinsics.checkNotNullParameter(message, "message");
        aVar2.d = message;
        aVar2.c(aVar.d());
        if (z && aVar2.c == 100) {
            return null;
        }
        return aVar2;
    }

    @Override // defpackage.L90
    public final long f(@NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (C1081Gq0.a(response)) {
            return C6806tc2.l(response);
        }
        return 0L;
    }

    @Override // defpackage.L90
    @NotNull
    public final C3442do1 g() {
        return this.a;
    }

    @Override // defpackage.L90
    public final void h() {
        this.c.flush();
    }
}

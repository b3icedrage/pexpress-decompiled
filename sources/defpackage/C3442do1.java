package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: do1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3442do1 extends C6644sp0.b implements InterfaceC2919bK {

    @NotNull
    public final C4362iB1 b;

    @Nullable
    public Socket c;

    @Nullable
    public Socket d;

    @Nullable
    public C0916En0 e;

    @Nullable
    public EnumC1298Jk1 f;

    @Nullable
    public C6644sp0 g;

    @Nullable
    public C3024bo1 h;

    @Nullable
    public C2814ao1 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    @NotNull
    public final ArrayList p;
    public long q;

    /* JADX INFO: renamed from: do1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public C3442do1(@NotNull C4282ho1 connectionPool, @NotNull C4362iB1 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.b = route;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void e(@NotNull C6711t81 client, @NotNull C4362iB1 failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.b.type() != Proxy.Type.DIRECT) {
            C5450n8 c5450n8 = failedRoute.a;
            c5450n8.g.connectFailed(c5450n8.h.i(), failedRoute.b.address(), failure);
        }
        C4620jB1 c4620jB1 = client.F;
        synchronized (c4620jB1) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            c4620jB1.a.add(failedRoute);
        }
    }

    @Override // defpackage.InterfaceC2919bK
    @NotNull
    public final C4362iB1 a() {
        return this.b;
    }

    @Override // defpackage.C6644sp0.b
    public final synchronized void b(@NotNull C6644sp0 connection, @NotNull C6536sJ1 settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.o = (settings.a & 16) != 0 ? settings.b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // defpackage.C6644sp0.b
    public final void c(@NotNull C0922Ep0 stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(EnumC7967z70.REFUSED_STREAM, null);
    }

    public final void d(int i, int i2, int i3, int i4, boolean z, @NotNull InterfaceC1023Fx call, @NotNull AbstractC7971z80 eventListener) throws Throwable {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f != null) {
            throw new IllegalStateException("already connected");
        }
        List<C3967gK> list = this.b.a.j;
        C4177hK c4177hK = new C4177hK(list);
        C5450n8 c5450n8 = this.b.a;
        if (c5450n8.c == null) {
            if (!list.contains(C3967gK.f)) {
                throw new C4830kB1(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            C1903Rd1 c1903Rd1 = C1903Rd1.a;
            if (!C1903Rd1.a.h(str)) {
                throw new C4830kB1(new UnknownServiceException(C1039Gc0.d("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c5450n8.i.contains(EnumC1298Jk1.H2_PRIOR_KNOWLEDGE)) {
            throw new C4830kB1(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C4830kB1 c4830kB1 = null;
        while (true) {
            try {
                C4362iB1 c4362iB1 = this.b;
                if (c4362iB1.a.c != null && c4362iB1.b.type() == Proxy.Type.HTTP) {
                    g(i, i2, i3, call, eventListener);
                    if (this.c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                f(i, i2, call, eventListener);
                try {
                    h(c4177hK, i4, call, eventListener);
                    C4362iB1 c4362iB2 = this.b;
                    eventListener.h(call, c4362iB2.c, c4362iB2.b, this.f);
                    break;
                } catch (IOException e) {
                    e = e;
                    Socket socket = this.d;
                    if (socket != null) {
                        C6806tc2.e(socket);
                    }
                    Socket socket2 = this.c;
                    if (socket2 != null) {
                        C6806tc2.e(socket2);
                    }
                    this.d = null;
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.o = 1;
                    C4362iB1 c4362iB3 = this.b;
                    eventListener.i(call, c4362iB3.c, c4362iB3.b, e);
                    if (c4830kB1 == null) {
                        c4830kB1 = new C4830kB1(e);
                    } else {
                        Intrinsics.checkNotNullParameter(e, "e");
                        J90.a(c4830kB1.d, e);
                        c4830kB1.e = e;
                    }
                    if (!z) {
                        throw c4830kB1;
                    }
                    Intrinsics.checkNotNullParameter(e, "e");
                    c4177hK.d = true;
                    if (!c4177hK.c) {
                        throw c4830kB1;
                    }
                    if (e instanceof ProtocolException) {
                        throw c4830kB1;
                    }
                    if (e instanceof InterruptedIOException) {
                        throw c4830kB1;
                    }
                    if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                        throw c4830kB1;
                    }
                    if (e instanceof SSLPeerUnverifiedException) {
                        throw c4830kB1;
                    }
                    if (!(e instanceof SSLException)) {
                        throw c4830kB1;
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
        C4362iB1 c4362iB4 = this.b;
        if (c4362iB4.a.c != null && c4362iB4.b.type() == Proxy.Type.HTTP && this.c == null) {
            throw new C4830kB1(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void f(int i, int i2, InterfaceC1023Fx interfaceC1023Fx, AbstractC7971z80 abstractC7971z80) throws IOException {
        Socket socketCreateSocket;
        C4362iB1 c4362iB1 = this.b;
        Proxy proxy = c4362iB1.b;
        C5450n8 c5450n8 = c4362iB1.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : a.a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = c5450n8.b.createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.c = socketCreateSocket;
        abstractC7971z80.j(interfaceC1023Fx, this.b.c, proxy);
        socketCreateSocket.setSoTimeout(i2);
        try {
            C1903Rd1 c1903Rd1 = C1903Rd1.a;
            C1903Rd1.a.e(socketCreateSocket, this.b.c, i);
            try {
                this.h = Cm2.e(Cm2.p(socketCreateSocket));
                this.i = Cm2.c(Cm2.o(socketCreateSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void g(int i, int i2, int i3, InterfaceC1023Fx interfaceC1023Fx, AbstractC7971z80 abstractC7971z80) throws IOException {
        C4543is1.a aVar = new C4543is1.a();
        C4362iB1 c4362iB1 = this.b;
        C1318Jr0 url = c4362iB1.a.h;
        Intrinsics.checkNotNullParameter(url, "url");
        aVar.a = url;
        aVar.e("CONNECT", null);
        C5450n8 c5450n8 = c4362iB1.a;
        aVar.d("Host", C6806tc2.x(c5450n8.h, true));
        aVar.d("Proxy-Connection", "Keep-Alive");
        aVar.d("User-Agent", "okhttp/4.12.0");
        C4543is1 request = aVar.b();
        C0857Dt1.a aVar2 = new C0857Dt1.a();
        Intrinsics.checkNotNullParameter(request, "request");
        aVar2.a = request;
        EnumC1298Jk1 protocol = EnumC1298Jk1.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        aVar2.b = protocol;
        aVar2.c = 407;
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", "message");
        aVar2.d = "Preemptive Authenticate";
        aVar2.g = C6806tc2.c;
        aVar2.k = -1L;
        aVar2.l = -1L;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C2813ao0.a aVar3 = aVar2.f;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C2813ao0.b.a("Proxy-Authenticate");
        C2813ao0.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.f("Proxy-Authenticate");
        aVar3.c("Proxy-Authenticate", "OkHttp-Preemptive");
        C0857Dt1 response = aVar2.a();
        c5450n8.f.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        f(i, i2, interfaceC1023Fx, abstractC7971z80);
        String str = "CONNECT " + C6806tc2.x(request.a, true) + " HTTP/1.1";
        C3024bo1 c3024bo1 = this.h;
        Intrinsics.checkNotNull(c3024bo1);
        C2814ao1 c2814ao1 = this.i;
        Intrinsics.checkNotNull(c2814ao1);
        C6225qp0 c6225qp0 = new C6225qp0(null, this, c3024bo1, c2814ao1);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c3024bo1.d.o().g(i2, timeUnit);
        c2814ao1.d.o().g(i3, timeUnit);
        c6225qp0.k(request.c, str);
        c6225qp0.c();
        C0857Dt1.a aVarE = c6225qp0.e(false);
        Intrinsics.checkNotNull(aVarE);
        aVarE.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        aVarE.a = request;
        C0857Dt1 response2 = aVarE.a();
        Intrinsics.checkNotNullParameter(response2, "response");
        long jL = C6806tc2.l(response2);
        if (jL != -1) {
            C6225qp0.d dVarJ = c6225qp0.j(jL);
            C6806tc2.v(dVarJ, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            dVarJ.close();
        }
        int i4 = response2.h;
        if (i4 == 200) {
            if (!c3024bo1.e.t() || !c2814ao1.e.t()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i4 != 407) {
                throw new IOException(EK.e(i4, "Unexpected response code for CONNECT: "));
            }
            c5450n8.f.getClass();
            Intrinsics.checkNotNullParameter(response2, "response");
            throw new IOException("Failed to authenticate with proxy");
        }
    }

    public final void h(C4177hK c4177hK, int i, InterfaceC1023Fx interfaceC1023Fx, AbstractC7971z80 abstractC7971z80) throws Throwable {
        SSLSocket sSLSocket;
        String strF;
        int i2 = 7;
        C5450n8 c5450n8 = this.b.a;
        SSLSocketFactory sSLSocketFactory = c5450n8.c;
        EnumC1298Jk1 enumC1298Jk1A = EnumC1298Jk1.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List<EnumC1298Jk1> list = c5450n8.i;
            EnumC1298Jk1 enumC1298Jk1 = EnumC1298Jk1.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC1298Jk1)) {
                this.d = this.c;
                this.f = enumC1298Jk1A;
                return;
            } else {
                this.d = this.c;
                this.f = enumC1298Jk1;
                m(i);
                return;
            }
        }
        abstractC7971z80.C(interfaceC1023Fx);
        C5450n8 c5450n9 = this.b.a;
        SSLSocketFactory sSLSocketFactory2 = c5450n9.c;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory2);
            Socket socket = this.c;
            C1318Jr0 c1318Jr0 = c5450n9.h;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, c1318Jr0.d, c1318Jr0.e, true);
            Intrinsics.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C3967gK c3967gKA = c4177hK.a(sSLSocket2);
                if (c3967gKA.b) {
                    C1903Rd1 c1903Rd1 = C1903Rd1.a;
                    C1903Rd1.a.d(sSLSocket2, c5450n9.h.d, c5450n9.i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                C0916En0 c0916En0A = C0916En0.a.a(sslSocketSession);
                HostnameVerifier hostnameVerifier = c5450n9.d;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (hostnameVerifier.verify(c5450n9.h.d, sslSocketSession)) {
                    C6044pz c6044pz = c5450n9.e;
                    Intrinsics.checkNotNull(c6044pz);
                    this.e = new C0916En0(c0916En0A.a, c0916En0A.b, c0916En0A.c, new C3652eo1(c6044pz, c0916En0A, c5450n9));
                    c6044pz.a(c5450n9.h.d, new T2(this, i2));
                    if (c3967gKA.b) {
                        C1903Rd1 c1903Rd2 = C1903Rd1.a;
                        strF = C1903Rd1.a.f(sSLSocket2);
                    } else {
                        strF = null;
                    }
                    this.d = sSLSocket2;
                    this.h = Cm2.e(Cm2.p(sSLSocket2));
                    this.i = Cm2.c(Cm2.o(sSLSocket2));
                    if (strF != null) {
                        enumC1298Jk1A = EnumC1298Jk1.a.a(strF);
                    }
                    this.f = enumC1298Jk1A;
                    C1903Rd1 c1903Rd3 = C1903Rd1.a;
                    C1903Rd1.a.a(sSLSocket2);
                    abstractC7971z80.B(interfaceC1023Fx, this.e);
                    if (this.f == EnumC1298Jk1.HTTP_2) {
                        m(i);
                        return;
                    }
                    return;
                }
                List<Certificate> listA = c0916En0A.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c5450n9.h.d + " not verified (no certificates)");
                }
                Certificate certificate = listA.get(0);
                Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate certificate2 = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c5450n9.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                C6044pz c6044pz2 = C6044pz.c;
                sb.append(C6044pz.a.a(certificate2));
                sb.append("\n              |    DN: ");
                sb.append(certificate2.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                Intrinsics.checkNotNullParameter(certificate2, "certificate");
                sb.append(CollectionsKt.Q(C5872p81.a(certificate2, 7), C5872p81.a(certificate2, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(DS1.c(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C1903Rd1 c1903Rd4 = C1903Rd1.a;
                    C1903Rd1.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    C6806tc2.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    public final boolean i(@NotNull C5450n8 address, @Nullable ArrayList arrayList) {
        C0916En0 c0916En0;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = C6806tc2.a;
        if (this.p.size() < this.o && !this.j) {
            C4362iB1 c4362iB1 = this.b;
            if (c4362iB1.a.a(address)) {
                C1318Jr0 c1318Jr0 = address.h;
                String str = c1318Jr0.d;
                C5450n8 c5450n8 = c4362iB1.a;
                if (Intrinsics.a(str, c5450n8.h.d)) {
                    return true;
                }
                if (this.g != null && arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C4362iB1 c4362iB2 = (C4362iB1) it.next();
                        Proxy.Type type = c4362iB2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && c4362iB1.b.type() == type2) {
                            if (Intrinsics.a(c4362iB1.c, c4362iB2.c)) {
                                if (address.d != C5872p81.a) {
                                    break;
                                }
                                byte[] bArr2 = C6806tc2.a;
                                C1318Jr0 c1318Jr1 = c5450n8.h;
                                if (c1318Jr0.e != c1318Jr1.e) {
                                    break;
                                }
                                String str2 = c1318Jr1.d;
                                String hostname = c1318Jr0.d;
                                if (!Intrinsics.a(hostname, str2)) {
                                    if (!this.k && (c0916En0 = this.e) != null) {
                                        Intrinsics.checkNotNull(c0916En0);
                                        List<Certificate> listA = c0916En0.a();
                                        if (!listA.isEmpty()) {
                                            Certificate certificate = listA.get(0);
                                            Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            if (!C5872p81.c(hostname, (X509Certificate) certificate)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    C6044pz c6044pz = address.e;
                                    Intrinsics.checkNotNull(c6044pz);
                                    C0916En0 c0916En1 = this.e;
                                    Intrinsics.checkNotNull(c0916En1);
                                    List<Certificate> peerCertificates = c0916En1.a();
                                    c6044pz.getClass();
                                    Intrinsics.checkNotNullParameter(hostname, "hostname");
                                    Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                                    c6044pz.a(hostname, new C6254qz(c6044pz, peerCertificates, hostname, 0));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean j(boolean z) {
        long j;
        byte[] bArr = C6806tc2.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.d;
        Intrinsics.checkNotNull(socket2);
        C3024bo1 source = this.h;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C6644sp0 c6644sp0 = this.g;
        if (c6644sp0 != null) {
            synchronized (c6644sp0) {
                if (c6644sp0.j) {
                    return false;
                }
                return c6644sp0.s >= c6644sp0.r || jNanoTime < c6644sp0.t;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Intrinsics.checkNotNullParameter(socket2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !source.c();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @NotNull
    public final L90 k(@NotNull C6711t81 client, @NotNull C5593no1 chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.d;
        Intrinsics.checkNotNull(socket);
        C3024bo1 c3024bo1 = this.h;
        Intrinsics.checkNotNull(c3024bo1);
        C2814ao1 c2814ao1 = this.i;
        Intrinsics.checkNotNull(c2814ao1);
        C6644sp0 c6644sp0 = this.g;
        if (c6644sp0 != null) {
            return new C0766Cp0(client, this, chain, c6644sp0);
        }
        int i = chain.g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c3024bo1.d.o().g(i, timeUnit);
        c2814ao1.d.o().g(chain.h, timeUnit);
        return new C6225qp0(client, this, c3024bo1, c2814ao1);
    }

    public final synchronized void l() {
        this.j = true;
    }

    public final void m(int i) throws SocketException {
        int i2;
        Socket socket = this.d;
        Intrinsics.checkNotNull(socket);
        C3024bo1 source = this.h;
        Intrinsics.checkNotNull(source);
        C2814ao1 sink = this.i;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        C8049zX1 taskRunner = C8049zX1.h;
        C6644sp0.a aVar = new C6644sp0.a(taskRunner);
        String peerName = this.b.a.h.d;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        aVar.b = socket;
        String str = C6806tc2.g + ' ' + peerName;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        aVar.c = str;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        aVar.d = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        aVar.e = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        aVar.f = this;
        aVar.h = i;
        C6644sp0 c6644sp0 = new C6644sp0(aVar);
        this.g = c6644sp0;
        C6536sJ1 c6536sJ1 = C6644sp0.E;
        this.o = (c6536sJ1.a & 16) != 0 ? c6536sJ1.b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        C1000Fp0 c1000Fp0 = c6644sp0.B;
        synchronized (c1000Fp0) {
            try {
                if (c1000Fp0.h) {
                    throw new IOException("closed");
                }
                Logger logger = C1000Fp0.j;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C6806tc2.j(">> CONNECTION " + C6434rp0.b.i(), new Object[0]));
                }
                c1000Fp0.d.q1(C6434rp0.b);
                c1000Fp0.d.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        C1000Fp0 c1000Fp1 = c6644sp0.B;
        C6536sJ1 settings = c6644sp0.u;
        synchronized (c1000Fp1) {
            try {
                Intrinsics.checkNotNullParameter(settings, "settings");
                if (c1000Fp1.h) {
                    throw new IOException("closed");
                }
                c1000Fp1.g(0, Integer.bitCount(settings.a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    boolean z = true;
                    if (((1 << i3) & settings.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i3 != 4) {
                            i2 = i3 != 7 ? i3 : 4;
                        } else {
                            i2 = 3;
                        }
                        C2814ao1 c2814ao1 = c1000Fp1.d;
                        if (c2814ao1.g) {
                            throw new IllegalStateException("closed");
                        }
                        c2814ao1.e.u1(i2);
                        c2814ao1.c();
                        c1000Fp1.d.f(settings.b[i3]);
                    }
                    i3++;
                }
                c1000Fp1.d.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = c6644sp0.u.a();
        if (iA != 65535) {
            c6644sp0.B.t(0, iA - 65535);
        }
        taskRunner.e().c(new C7629xX1(c6644sp0.g, c6644sp0.C), 0L);
    }

    @NotNull
    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C4362iB1 c4362iB1 = this.b;
        sb.append(c4362iB1.a.h.d);
        sb.append(':');
        sb.append(c4362iB1.a.h.e);
        sb.append(", proxy=");
        sb.append(c4362iB1.b);
        sb.append(" hostAddress=");
        sb.append(c4362iB1.c);
        sb.append(" cipherSuite=");
        C0916En0 c0916En0 = this.e;
        if (c0916En0 == null || (obj = c0916En0.b) == null) {
            obj = DevicePublicKeyStringDef.NONE;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}

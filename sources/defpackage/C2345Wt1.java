package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Wt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2345Wt1 implements UB0 {

    @NotNull
    public final C6711t81 a;

    public C2345Wt1(@NotNull C6711t81 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.a = client;
    }

    public static int d(C0857Dt1 c0857Dt1, int i) {
        String strF = C0857Dt1.f(c0857Dt1, "Retry-After");
        if (strF == null) {
            return i;
        }
        if (!new Regex("\\d+").d(strF)) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Integer numValueOf = Integer.valueOf(strF);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) throws Throwable {
        boolean z;
        boolean z2;
        C0857Dt1 c0857Dt1B;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C6044pz c6044pz;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4543is1 c4543is1 = chain.e;
        C3233co1 c3233co1 = chain.a;
        List suppressed = C5653o60.d;
        C0857Dt1 c0857Dt1 = null;
        int i = 0;
        C4543is1 request = c4543is1;
        while (true) {
            boolean z3 = true;
            while (true) {
                c3233co1.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                if (c3233co1.p != null) {
                    throw new IllegalStateException("Check failed.");
                }
                synchronized (c3233co1) {
                    if (c3233co1.r) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                    if (c3233co1.q) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Unit unit = Unit.a;
                }
                if (z3) {
                    C4282ho1 c4282ho1 = c3233co1.h;
                    C1318Jr0 c1318Jr0 = request.a;
                    boolean z4 = c1318Jr0.j;
                    C6711t81 c6711t81 = c3233co1.d;
                    if (z4) {
                        SSLSocketFactory sSLSocketFactory2 = c6711t81.t;
                        if (sSLSocketFactory2 == null) {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                        HostnameVerifier hostnameVerifier2 = c6711t81.x;
                        z = true;
                        c6044pz = c6711t81.y;
                        sSLSocketFactory = sSLSocketFactory2;
                        hostnameVerifier = hostnameVerifier2;
                    } else {
                        z = true;
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        c6044pz = null;
                    }
                    c3233co1.m = new M90(c4282ho1, new C5450n8(c1318Jr0.d, c1318Jr0.e, c6711t81.p, c6711t81.s, sSLSocketFactory, hostnameVerifier, c6044pz, c6711t81.r, c6711t81.w, c6711t81.v, c6711t81.q), c3233co1, c3233co1.i);
                } else {
                    z = true;
                }
                try {
                    if (c3233co1.t) {
                        throw new IOException("Canceled");
                    }
                    try {
                        c0857Dt1B = chain.b(request);
                    } catch (IOException e) {
                        if (!c(e, c3233co1, request, !(e instanceof C3757fK))) {
                            Intrinsics.checkNotNullParameter(e, "<this>");
                            Intrinsics.checkNotNullParameter(suppressed, "suppressed");
                            Iterator it = suppressed.iterator();
                            while (it.hasNext()) {
                                J90.a(e, (Exception) it.next());
                            }
                            throw e;
                        }
                        suppressed = CollectionsKt.R(suppressed, e);
                        c3233co1.e(true);
                        z3 = false;
                    } catch (C4830kB1 e2) {
                        if (!c(e2.e, c3233co1, request, false)) {
                            IOException iOException = e2.d;
                            Intrinsics.checkNotNullParameter(iOException, "<this>");
                            Intrinsics.checkNotNullParameter(suppressed, "suppressed");
                            Iterator it2 = suppressed.iterator();
                            while (it2.hasNext()) {
                                J90.a(iOException, (Exception) it2.next());
                            }
                            throw iOException;
                        }
                        suppressed = CollectionsKt.R(suppressed, e2.d);
                        c3233co1.e(true);
                        z3 = false;
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = true;
                }
                c3233co1.e(z2);
                throw th;
            }
            if (c0857Dt1 != null) {
                try {
                    C0857Dt1.a aVarK = c0857Dt1B.k();
                    C0857Dt1.a aVarK2 = c0857Dt1.k();
                    aVarK2.g = null;
                    C0857Dt1 c0857Dt1A = aVarK2.a();
                    if (c0857Dt1A.k != null) {
                        throw new IllegalArgumentException("priorResponse.body != null");
                    }
                    aVarK.j = c0857Dt1A;
                    c0857Dt1B = aVarK.a();
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z;
                }
            }
            c0857Dt1 = c0857Dt1B;
            request = b(c0857Dt1, c3233co1.p);
            if (request == null) {
                c3233co1.e(false);
                return c0857Dt1;
            }
            AbstractC5395ms1 abstractC5395ms1 = request.d;
            if (abstractC5395ms1 != null && (abstractC5395ms1 instanceof C2721aS1)) {
                c3233co1.e(false);
                return c0857Dt1;
            }
            AbstractC1091Gt1 abstractC1091Gt1 = c0857Dt1.k;
            if (abstractC1091Gt1 != null) {
                C6806tc2.d(abstractC1091Gt1);
            }
            i++;
            if (i > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i);
            }
            c3233co1.e(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x012a  */
    public final C4543is1 b(C0857Dt1 response, K90 k90) throws ProtocolException {
        C6711t81 c6711t81;
        String link;
        C4543is1 c4543is1;
        C1318Jr0.a aVarG;
        C1318Jr0 url;
        C4543is1.a aVarB;
        boolean z;
        AbstractC5395ms1 abstractC5395ms1;
        C0857Dt1 c0857Dt1;
        C3442do1 c3442do1;
        C4362iB1 c4362iB1 = (k90 == null || (c3442do1 = k90.f) == null) ? null : c3442do1.b;
        int i = response.h;
        C4543is1 c4543is2 = response.d;
        String method = c4543is2.b;
        if (i == 307 || i == 308) {
            c6711t81 = this.a;
            if (c6711t81.l && (link = C0857Dt1.f(response, "Location")) != null) {
                c4543is1 = response.d;
                C1318Jr0 c1318Jr0 = c4543is1.a;
                c1318Jr0.getClass();
                Intrinsics.checkNotNullParameter(link, "link");
                aVarG = c1318Jr0.g(link);
                if (aVarG != null) {
                    url = aVarG.a();
                } else {
                    url = null;
                }
                if (url != null) {
                    if (!Intrinsics.a(url.a, c4543is1.a.a) || c6711t81.m) {
                        aVarB = c4543is1.b();
                        if (C3476e.r(method)) {
                            Intrinsics.checkNotNullParameter(method, "method");
                            boolean zEquals = method.equals("PROPFIND");
                            int i2 = response.h;
                            z = !zEquals || i2 == 308 || i2 == 307;
                            Intrinsics.checkNotNullParameter(method, "method");
                            if (!method.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                aVarB.e(method, z ? c4543is1.d : null);
                            } else {
                                aVarB.e("GET", null);
                            }
                            if (!z) {
                                aVarB.f("Transfer-Encoding");
                                aVarB.f("Content-Length");
                                aVarB.f("Content-Type");
                            }
                        }
                        if (!C6806tc2.a(c4543is1.a, url)) {
                            aVarB.f("Authorization");
                        }
                        Intrinsics.checkNotNullParameter(url, "url");
                        aVarB.a = url;
                        return aVarB.b();
                    }
                }
            }
        } else {
            if (i == 401) {
                this.a.k.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
            if (i == 421) {
                AbstractC5395ms1 abstractC5395ms2 = c4543is2.d;
                if ((abstractC5395ms2 == null || !(abstractC5395ms2 instanceof C2721aS1)) && k90 != null && !Intrinsics.a(k90.c.b.h.d, k90.f.b.a.h.d)) {
                    C3442do1 c3442do2 = k90.f;
                    synchronized (c3442do2) {
                        c3442do2.k = true;
                    }
                    return response.d;
                }
            } else if (i == 503) {
                C0857Dt1 c0857Dt2 = response.n;
                if ((c0857Dt2 == null || c0857Dt2.h != 503) && d(response, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                    return response.d;
                }
            } else {
                if (i == 407) {
                    Intrinsics.checkNotNull(c4362iB1);
                    if (c4362iB1.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    this.a.r.getClass();
                    Intrinsics.checkNotNullParameter(response, "response");
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            c6711t81 = this.a;
                            if (c6711t81.l) {
                                c4543is1 = response.d;
                                C1318Jr0 c1318Jr1 = c4543is1.a;
                                c1318Jr1.getClass();
                                Intrinsics.checkNotNullParameter(link, "link");
                                aVarG = c1318Jr1.g(link);
                                if (aVarG != null) {
                                    url = aVarG.a();
                                } else {
                                    url = null;
                                }
                                if (url != null) {
                                    if (!Intrinsics.a(url.a, c4543is1.a.a)) {
                                        break;
                                    }
                                    aVarB = c4543is1.b();
                                    if (C3476e.r(method)) {
                                        Intrinsics.checkNotNullParameter(method, "method");
                                        boolean zEquals2 = method.equals("PROPFIND");
                                        int i3 = response.h;
                                        if (zEquals2) {
                                        }
                                        Intrinsics.checkNotNullParameter(method, "method");
                                        if (method.equals("PROPFIND")) {
                                            aVarB.e(method, z ? c4543is1.d : null);
                                        } else {
                                            aVarB.e(method, z ? c4543is1.d : null);
                                        }
                                        if (!z) {
                                            aVarB.f("Transfer-Encoding");
                                            aVarB.f("Content-Length");
                                            aVarB.f("Content-Type");
                                        }
                                    }
                                    if (!C6806tc2.a(c4543is1.a, url)) {
                                        aVarB.f("Authorization");
                                    }
                                    Intrinsics.checkNotNullParameter(url, "url");
                                    aVarB.a = url;
                                    return aVarB.b();
                                }
                            }
                        default:
                            return null;
                    }
                } else if (this.a.j && (((abstractC5395ms1 = c4543is2.d) == null || !(abstractC5395ms1 instanceof C2721aS1)) && (((c0857Dt1 = response.n) == null || c0857Dt1.h != 408) && d(response, 0) <= 0))) {
                    return response.d;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x004f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0054  */
    /* JADX WARN: Code duplicated, block: B:42:0x0057  */
    /* JADX WARN: Code duplicated, block: B:53:0x006c A[ADDED_TO_REGION, DONT_GENERATE, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:55:0x006e A[Catch: all -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:51:0x0068, B:55:0x006e, B:59:0x0080), top: B:80:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0089  */
    /* JADX WARN: Code duplicated, block: B:67:0x008b  */
    /* JADX WARN: Code duplicated, block: B:68:0x008d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0091  */
    /* JADX WARN: Code duplicated, block: B:73:0x0098  */
    /* JADX WARN: Code duplicated, block: B:79:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean c(IOException iOException, C3233co1 c3233co1, C4543is1 c4543is1, boolean z) {
        M90 m90;
        int i;
        boolean zA;
        C4362iB1 c4362iB1;
        C5040lB1.a aVar;
        C5040lB1 c5040lB1;
        C3442do1 c3442do1;
        AbstractC5395ms1 abstractC5395ms1;
        if (!this.a.j || ((z && (((abstractC5395ms1 = c4543is1.d) != null && (abstractC5395ms1 instanceof C2721aS1)) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            m90 = c3233co1.m;
            Intrinsics.checkNotNull(m90);
            i = m90.g;
            if (i != 0) {
                if (m90.j != null) {
                    zA = true;
                } else {
                    c4362iB1 = null;
                    if (i <= 1) {
                        synchronized (c3442do1) {
                            if (c3442do1.l != 0) {
                                c4362iB1 = c3442do1.b;
                            }
                        }
                    }
                    if (c4362iB1 != null) {
                        m90.j = c4362iB1;
                    } else {
                        aVar = m90.e;
                        zA = aVar != null ? c5040lB1.a() : c5040lB1.a();
                    }
                    zA = true;
                }
            } else if (m90.j != null) {
                zA = true;
            } else {
                c4362iB1 = null;
                if (i <= 1) {
                    synchronized (c3442do1) {
                        if (c3442do1.l != 0) {
                            c4362iB1 = c3442do1.b;
                        }
                    }
                }
                if (c4362iB1 != null) {
                    m90.j = c4362iB1;
                } else {
                    aVar = m90.e;
                    if (aVar != null) {
                    }
                }
                zA = true;
            }
            if (!zA) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z) {
            m90 = c3233co1.m;
            Intrinsics.checkNotNull(m90);
            i = m90.g;
            if (i != 0 && m90.h == 0 && m90.i == 0) {
                zA = false;
            } else if (m90.j != null) {
                zA = true;
            } else {
                c4362iB1 = null;
                if (i <= 1 && m90.h <= 1 && m90.i <= 0 && (c3442do1 = m90.c.n) != null) {
                    synchronized (c3442do1) {
                        if (c3442do1.l != 0 && C6806tc2.a(c3442do1.b.a.h, m90.b.h)) {
                            c4362iB1 = c3442do1.b;
                        }
                    }
                }
                if (c4362iB1 != null) {
                    m90.j = c4362iB1;
                } else {
                    aVar = m90.e;
                    if ((aVar != null || !aVar.a()) && (c5040lB1 = m90.f) != null) {
                    }
                }
                zA = true;
            }
            if (!zA) {
                return true;
            }
        }
        return false;
    }
}

package defpackage;

import io.sentry.okhttp.d;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6711t81 implements Cloneable, InterfaceC1023Fx.a {

    @NotNull
    public static final List<EnumC1298Jk1> G = C6806tc2.m(EnumC1298Jk1.HTTP_2, EnumC1298Jk1.HTTP_1_1);

    @NotNull
    public static final List<C3967gK> H = C6806tc2.m(C3967gK.e, C3967gK.f);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final long E;

    @NotNull
    public final C4620jB1 F;

    @NotNull
    public final C5847p20 d;

    @NotNull
    public final C3547eK e;

    @NotNull
    public final List<UB0> g;

    @NotNull
    public final List<UB0> h;

    @NotNull
    public final VI1 i;
    public final boolean j;

    @NotNull
    public final C7652xe k;
    public final boolean l;
    public final boolean m;

    @NotNull
    public final N7 n;

    @Nullable
    public final C3677ex o;

    @NotNull
    public final U0 p;

    @NotNull
    public final ProxySelector q;

    @NotNull
    public final C7652xe r;

    @NotNull
    public final SocketFactory s;

    @Nullable
    public final SSLSocketFactory t;

    @Nullable
    public final X509TrustManager u;

    @NotNull
    public final List<C3967gK> v;

    @NotNull
    public final List<EnumC1298Jk1> w;

    @NotNull
    public final HostnameVerifier x;

    @NotNull
    public final C6044pz y;

    @Nullable
    public final G1 z;

    /* JADX INFO: renamed from: t81$a */
    public static final class a {
        public long A;

        @Nullable
        public C4620jB1 B;

        @NotNull
        public C5847p20 a = new C5847p20();

        @NotNull
        public C3547eK b = new C3547eK();

        @NotNull
        public final ArrayList c = new ArrayList();

        @NotNull
        public final ArrayList d = new ArrayList();

        @NotNull
        public VI1 e;
        public boolean f;

        @NotNull
        public C7652xe g;
        public boolean h;
        public boolean i;

        @NotNull
        public N7 j;

        @Nullable
        public C3677ex k;

        @NotNull
        public U0 l;

        @Nullable
        public ProxySelector m;

        @NotNull
        public C7652xe n;

        @NotNull
        public SocketFactory o;

        @Nullable
        public SSLSocketFactory p;

        @Nullable
        public X509TrustManager q;

        @NotNull
        public List<C3967gK> r;

        @NotNull
        public List<? extends EnumC1298Jk1> s;

        @NotNull
        public HostnameVerifier t;

        @NotNull
        public C6044pz u;

        @Nullable
        public G1 v;
        public int w;
        public int x;
        public int y;
        public int z;

        public a() {
            AbstractC7971z80.a aVar = AbstractC7971z80.a;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            this.e = new VI1(aVar);
            this.f = true;
            C7652xe c7652xe = InterfaceC1377Kl.a;
            this.g = c7652xe;
            this.h = true;
            this.i = true;
            this.j = N7.d;
            this.l = U0.j;
            this.n = c7652xe;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.o = socketFactory;
            this.r = C6711t81.H;
            this.s = C6711t81.G;
            this.t = C5872p81.a;
            this.u = C6044pz.c;
            this.w = 10000;
            this.x = 10000;
            this.y = 10000;
            this.A = 1024L;
        }

        @NotNull
        public final void a(@NotNull UB0 interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.c.add(interceptor);
        }

        @NotNull
        public final void b(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.a(sslSocketFactory, this.p) || !trustManager.equals(this.q)) {
                this.B = null;
            }
            this.p = sslSocketFactory;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            C1903Rd1 c1903Rd1 = C1903Rd1.a;
            this.v = C1903Rd1.a.b(trustManager);
            this.q = trustManager;
        }
    }

    public C6711t81(@NotNull a builder) throws NoSuchAlgorithmException, KeyStoreException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        VI1 originalEventListenerFactory = builder.e;
        Intrinsics.checkNotNullParameter(originalEventListenerFactory, "originalEventListenerFactory");
        Intrinsics.checkNotNullExpressionValue(SD1.a, "getInstance(...)");
        d eventListener = new d(new C0899Eh1(originalEventListenerFactory, 1));
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        byte[] bArr = C6806tc2.a;
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        builder.e = new VI1(eventListener);
        this.d = builder.a;
        this.e = builder.b;
        this.g = C6806tc2.y(builder.c);
        this.h = C6806tc2.y(builder.d);
        this.i = builder.e;
        this.j = builder.f;
        this.k = builder.g;
        this.l = builder.h;
        this.m = builder.i;
        this.n = builder.j;
        this.o = builder.k;
        this.p = builder.l;
        ProxySelector proxySelector = builder.m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.q = proxySelector == null ? C3717f71.a : proxySelector;
        this.r = builder.n;
        this.s = builder.o;
        List<C3967gK> list = builder.r;
        this.v = list;
        this.w = builder.s;
        this.x = builder.t;
        this.A = builder.w;
        this.B = builder.x;
        this.C = builder.y;
        this.D = builder.z;
        this.E = builder.A;
        C4620jB1 c4620jB1 = builder.B;
        this.F = c4620jB1 == null ? new C4620jB1() : c4620jB1;
        if (list != null && list.isEmpty()) {
            this.t = null;
            this.z = null;
            this.u = null;
            this.y = C6044pz.c;
            break;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.t = null;
                this.z = null;
                this.u = null;
                this.y = C6044pz.c;
                break;
            }
            if (((C3967gK) it.next()).a) {
                SSLSocketFactory sSLSocketFactory = builder.p;
                if (sSLSocketFactory == null) {
                    C1903Rd1 c1903Rd1 = C1903Rd1.a;
                    X509TrustManager trustManager = C1903Rd1.a.n();
                    this.u = trustManager;
                    C1903Rd1 c1903Rd2 = C1903Rd1.a;
                    Intrinsics.checkNotNull(trustManager);
                    this.t = c1903Rd2.m(trustManager);
                    Intrinsics.checkNotNull(trustManager);
                    Intrinsics.checkNotNullParameter(trustManager, "trustManager");
                    G1 certificateChainCleaner = C1903Rd1.a.b(trustManager);
                    this.z = certificateChainCleaner;
                    C6044pz c6044pz = builder.u;
                    Intrinsics.checkNotNull(certificateChainCleaner);
                    c6044pz.getClass();
                    Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                    this.y = Intrinsics.a(c6044pz.b, certificateChainCleaner) ? c6044pz : new C6044pz(c6044pz.a, certificateChainCleaner);
                    break;
                }
                this.t = sSLSocketFactory;
                G1 certificateChainCleaner2 = builder.v;
                Intrinsics.checkNotNull(certificateChainCleaner2);
                this.z = certificateChainCleaner2;
                X509TrustManager x509TrustManager = builder.q;
                Intrinsics.checkNotNull(x509TrustManager);
                this.u = x509TrustManager;
                C6044pz c6044pz2 = builder.u;
                Intrinsics.checkNotNull(certificateChainCleaner2);
                c6044pz2.getClass();
                Intrinsics.checkNotNullParameter(certificateChainCleaner2, "certificateChainCleaner");
                this.y = Intrinsics.a(c6044pz2.b, certificateChainCleaner2) ? c6044pz2 : new C6044pz(c6044pz2.a, certificateChainCleaner2);
                break;
            }
        }
        List<UB0> list2 = this.g;
        Intrinsics.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
        List<UB0> list3 = this.h;
        Intrinsics.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        X509TrustManager x509TrustManager2 = this.u;
        G1 g1 = this.z;
        SSLSocketFactory sSLSocketFactory2 = this.t;
        List<C3967gK> list4 = this.v;
        if (list4 == null || !list4.isEmpty()) {
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C3967gK) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (g1 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (g1 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.a(this.y, C6044pz.c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // defpackage.InterfaceC1023Fx.a
    @NotNull
    public final InterfaceC1023Fx a(@NotNull C4543is1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C3233co1(this, request, false);
    }

    @NotNull
    public final a b() {
        Intrinsics.checkNotNullParameter(this, "okHttpClient");
        a aVar = new a();
        aVar.a = this.d;
        aVar.b = this.e;
        C2904bF.o(aVar.c, this.g);
        C2904bF.o(aVar.d, this.h);
        aVar.e = this.i;
        aVar.f = this.j;
        aVar.g = this.k;
        aVar.h = this.l;
        aVar.i = this.m;
        aVar.j = this.n;
        aVar.k = this.o;
        aVar.l = this.p;
        aVar.m = this.q;
        aVar.n = this.r;
        aVar.o = this.s;
        aVar.p = this.t;
        aVar.q = this.u;
        aVar.r = this.v;
        aVar.s = this.w;
        aVar.t = this.x;
        aVar.u = this.y;
        aVar.v = this.z;
        aVar.w = this.A;
        aVar.x = this.B;
        aVar.y = this.C;
        aVar.z = this.D;
        aVar.A = this.E;
        aVar.B = this.F;
        return aVar;
    }

    @NotNull
    public final Object clone() {
        return super.clone();
    }

    @NotNull
    public final C7483wo1 d(@NotNull C4543is1 request, @NotNull G1 listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C7483wo1 c7483wo1 = new C7483wo1(C8049zX1.h, request, listener, new Random(), this.D, this.E);
        Intrinsics.checkNotNullParameter(this, "client");
        if (request.a("Sec-WebSocket-Extensions") != null) {
            c7483wo1.e(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return c7483wo1;
        }
        a aVarB = b();
        AbstractC7971z80.a eventListener = AbstractC7971z80.a;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        byte[] bArr = C6806tc2.a;
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        aVarB.e = new VI1(eventListener);
        List<EnumC1298Jk1> protocols = C7483wo1.w;
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayListF0 = CollectionsKt.f0(protocols);
        EnumC1298Jk1 enumC1298Jk1 = EnumC1298Jk1.H2_PRIOR_KNOWLEDGE;
        if (!arrayListF0.contains(enumC1298Jk1) && !arrayListF0.contains(EnumC1298Jk1.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListF0).toString());
        }
        if (arrayListF0.contains(enumC1298Jk1) && arrayListF0.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListF0).toString());
        }
        if (arrayListF0.contains(EnumC1298Jk1.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListF0).toString());
        }
        if (arrayListF0.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayListF0.remove(EnumC1298Jk1.SPDY_3);
        if (!arrayListF0.equals(aVarB.s)) {
            aVarB.B = null;
        }
        List<? extends EnumC1298Jk1> listUnmodifiableList = Collections.unmodifiableList(arrayListF0);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
        aVarB.s = listUnmodifiableList;
        C6711t81 c6711t81 = new C6711t81(aVarB);
        C4543is1.a aVarB2 = request.b();
        aVarB2.d("Upgrade", "websocket");
        aVarB2.d("Connection", "Upgrade");
        aVarB2.d("Sec-WebSocket-Key", c7483wo1.f);
        aVarB2.d("Sec-WebSocket-Version", "13");
        aVarB2.d("Sec-WebSocket-Extensions", "permessage-deflate");
        C4543is1 c4543is1B = aVarB2.b();
        C3233co1 c3233co1 = new C3233co1(c6711t81, c4543is1B, true);
        c7483wo1.g = c3233co1;
        Intrinsics.checkNotNull(c3233co1);
        c3233co1.Z(new C7693xo1(c7483wo1, c4543is1B));
        return c7483wo1;
    }

    public C6711t81() {
        this(new a());
    }
}

package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7430wb extends C1903Rd1 {
    public static final boolean e;

    @NotNull
    public final ArrayList c;

    @NotNull
    public final C4369iE d;

    /* JADX INFO: renamed from: wb$a */
    public static final class a implements InterfaceC6280r52 {

        @NotNull
        public final X509TrustManager a;

        @NotNull
        public final Method b;

        public a(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.a = trustManager;
            this.b = findByIssuerAndSignatureMethod;
        }

        @Override // defpackage.InterfaceC6280r52
        @Nullable
        public final X509Certificate a(@NotNull X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.b.invoke(this.a, cert);
                Intrinsics.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    static {
        boolean z = false;
        if (C1903Rd1.a.c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public C7430wb() throws NoSuchMethodException {
        C3145cP1 c3145cP1;
        Method method;
        Method method2;
        int i = C3145cP1.g;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> sslSocketFactoryClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramClass, "paramsClass");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            c3145cP1 = new C3145cP1(sslSocketClass);
        } catch (Exception e2) {
            C1903Rd1.a.getClass();
            C1903Rd1.i(5, "unable to load android socket classes", e2);
            c3145cP1 = null;
        }
        InterfaceC7809yN1[] elements = {c3145cP1, new C7834yW(C0567Ab.f), new C7834yW(C6537sK.a), new C7834yW(C7709xu.a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListO = C1526Mj.o(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListO) {
            if (((InterfaceC7809yN1) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new C4369iE(method3, method2, method);
    }

    @Override // defpackage.C1903Rd1
    @NotNull
    public final G1 b(@NotNull X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C2468Ya c2468Ya = x509TrustManagerExtensions != null ? new C2468Ya(trustManager, x509TrustManagerExtensions) : null;
        return c2468Ya != null ? c2468Ya : super.b(trustManager);
    }

    @Override // defpackage.C1903Rd1
    @NotNull
    public final InterfaceC6280r52 c(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new a(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // defpackage.C1903Rd1
    public final void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<EnumC1298Jk1> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC7809yN1) next).b(sslSocket));
        InterfaceC7809yN1 interfaceC7809yN1 = (InterfaceC7809yN1) next;
        if (interfaceC7809yN1 != null) {
            interfaceC7809yN1.d(sslSocket, str, protocols);
        }
    }

    @Override // defpackage.C1903Rd1
    public final void e(@NotNull Socket socket, @NotNull InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.C1903Rd1
    @Nullable
    public final String f(@NotNull SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC7809yN1) next).b(sslSocket));
        InterfaceC7809yN1 interfaceC7809yN1 = (InterfaceC7809yN1) next;
        if (interfaceC7809yN1 != null) {
            return interfaceC7809yN1.c(sslSocket);
        }
        return null;
    }

    @Override // defpackage.C1903Rd1
    @Nullable
    public final Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        C4369iE c4369iE = this.d;
        c4369iE.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = c4369iE.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = c4369iE.b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.C1903Rd1
    public final boolean h(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // defpackage.C1903Rd1
    public final void k(@Nullable Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C4369iE c4369iE = this.d;
        c4369iE.getClass();
        if (obj != null) {
            try {
                Method method = c4369iE.c;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        C1903Rd1.j(this, message, 4);
    }
}

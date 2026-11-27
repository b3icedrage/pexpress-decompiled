package defpackage;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1658Oa extends C1903Rd1 {
    public static final boolean d;

    @NotNull
    public final ArrayList c;

    static {
        d = C1903Rd1.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    public C1658Oa() {
        InterfaceC7809yN1[] elements = {(!C1903Rd1.a.c() || Build.VERSION.SDK_INT < 29) ? null : new C1892Ra(), new C7834yW(C0567Ab.f), new C7834yW(C6537sK.a), new C7834yW(C7709xu.a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListO = C1526Mj.o(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListO) {
            if (((InterfaceC7809yN1) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
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
    public final void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends EnumC1298Jk1> protocols) {
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
    @SuppressLint({"NewApi"})
    public final boolean h(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}

package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5450n8 {

    @NotNull
    public final U0 a;

    @NotNull
    public final SocketFactory b;

    @Nullable
    public final SSLSocketFactory c;

    @Nullable
    public final HostnameVerifier d;

    @Nullable
    public final C6044pz e;

    @NotNull
    public final C7652xe f;

    @NotNull
    public final ProxySelector g;

    @NotNull
    public final C1318Jr0 h;

    @NotNull
    public final List<EnumC1298Jk1> i;

    @NotNull
    public final List<C3967gK> j;

    public C5450n8(@NotNull String uriHost, int i, @NotNull U0 dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C6044pz c6044pz, @NotNull C7652xe proxyAuthenticator, @NotNull List protocols, @NotNull List connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.a = dns;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = c6044pz;
        this.f = proxyAuthenticator;
        this.g = proxySelector;
        C1318Jr0.a aVar = new C1318Jr0.a();
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (scheme.equalsIgnoreCase("http")) {
            aVar.a = "http";
        } else {
            if (!scheme.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
            }
            aVar.a = "https";
        }
        aVar.d(uriHost);
        aVar.f(i);
        this.h = aVar.a();
        this.i = C6806tc2.y(protocols);
        this.j = C6806tc2.y(connectionSpecs);
    }

    public final boolean a(@NotNull C5450n8 that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.a(this.a, that.a) && Intrinsics.a(this.f, that.f) && Intrinsics.a(this.i, that.i) && Intrinsics.a(this.j, that.j) && Intrinsics.a(this.g, that.g) && Intrinsics.a(this.c, that.c) && Intrinsics.a(this.d, that.d) && Intrinsics.a(this.e, that.e) && this.h.e == that.h.e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C5450n8)) {
            return false;
        }
        C5450n8 c5450n8 = (C5450n8) obj;
        return Intrinsics.a(this.h, c5450n8.h) && a(c5450n8);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + C5491nL.b(C5491nL.b((this.f.hashCode() + ((this.a.hashCode() + C1039Gc0.b(527, 31, this.h.i)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C1318Jr0 c1318Jr0 = this.h;
        sb.append(c1318Jr0.d);
        sb.append(':');
        sb.append(c1318Jr0.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}

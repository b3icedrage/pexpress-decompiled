package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4478il extends AbstractC7971z80 {

    @NotNull
    public static final C4478il b = new C4478il();

    public static C7698xq0 D(InterfaceC1023Fx interfaceC1023Fx) {
        return (C7698xq0) interfaceC1023Fx.u().c(C7698xq0.class);
    }

    @Override // defpackage.AbstractC7971z80
    public final void h(@NotNull InterfaceC1023Fx call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable EnumC1298Jk1 enumC1298Jk1) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        C7698xq0 c7698xq0D = D(call);
        if (c7698xq0D == null) {
            return;
        }
        c7698xq0D.c(PW0.e(new Pair("connect_ms", c7698xq0D.d("connect")), new Pair("protocol", enumC1298Jk1 != null ? enumC1298Jk1.d : null)));
    }

    @Override // defpackage.AbstractC7971z80
    public final void i(@NotNull InterfaceC1023Fx call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        C7698xq0 c7698xq0D = D(call);
        if (c7698xq0D == null) {
            return;
        }
        Intrinsics.checkNotNullParameter("connect_failed", "key");
        c7698xq0D.d.merge("connect_failed", 1, new C7067uq0(new C6857tq0()));
        Pair pair = new Pair("connect_failed_family", inetSocketAddress.getAddress() instanceof Inet6Address ? "ipv6" : "ipv4");
        String simpleName = ioe.getClass().getSimpleName();
        String message = ioe.getMessage();
        if (message == null) {
            message = "";
        }
        c7698xq0D.c(PW0.e(pair, new Pair("connect_error", KS1.B(HttpPlatformResponse.MAX_MESSAGE_LENGTH, simpleName + ": " + message))));
    }

    @Override // defpackage.AbstractC7971z80
    public final void j(@NotNull InterfaceC1023Fx call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        C7698xq0 c7698xq0D = D(call);
        if (c7698xq0D == null) {
            return;
        }
        Intrinsics.checkNotNullParameter("connect", AppMeasurementSdk.ConditionalUserProperty.NAME);
        c7698xq0D.e.put("connect", Long.valueOf(System.nanoTime()));
        Intrinsics.checkNotNullParameter("connect_attempts", "key");
        c7698xq0D.d.merge("connect_attempts", 1, new C7067uq0(new C6857tq0()));
    }

    @Override // defpackage.AbstractC7971z80
    public final void k(@NotNull InterfaceC1023Fx call, @NotNull InterfaceC2919bK connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        C7698xq0 c7698xq0D = D(call);
        if (c7698xq0D == null) {
            return;
        }
        Pair pair = new Pair("ip_family", connection.a().c.getAddress() instanceof Inet6Address ? "ipv6" : "ipv4");
        ConcurrentHashMap<String, Object> concurrentHashMap = c7698xq0D.d;
        Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
        c7698xq0D.c(PW0.e(pair, new Pair("connection_reused", Boolean.valueOf(new TreeMap(concurrentHashMap).get("connect_attempts") == null))));
    }

    @Override // defpackage.AbstractC7971z80
    public final void m(@NotNull InterfaceC1023Fx call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        int i;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        C7698xq0 c7698xq0D = D(call);
        if (c7698xq0D == null) {
            return;
        }
        Pair pair = new Pair("dns_ms", c7698xq0D.d("dns"));
        int i2 = 0;
        if (inetAddressList.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = inetAddressList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!(((InetAddress) it.next()) instanceof Inet6Address) && (i = i + 1) < 0) {
                    WE.k();
                    throw null;
                }
            }
        }
        Pair pair2 = new Pair("dns_ipv4", Integer.valueOf(i));
        if (!inetAddressList.isEmpty()) {
            Iterator<T> it2 = inetAddressList.iterator();
            while (it2.hasNext()) {
                if ((((InetAddress) it2.next()) instanceof Inet6Address) && (i2 = i2 + 1) < 0) {
                    WE.k();
                    throw null;
                }
            }
        }
        c7698xq0D.c(PW0.e(pair, pair2, new Pair("dns_ipv6", Integer.valueOf(i2))));
    }

    @Override // defpackage.AbstractC7971z80
    public final void n(@NotNull InterfaceC1023Fx call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        C7698xq0 c7698xq0D = D(call);
        if (c7698xq0D != null) {
            Intrinsics.checkNotNullParameter("dns", AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7698xq0D.e.put("dns", Long.valueOf(System.nanoTime()));
        }
    }
}

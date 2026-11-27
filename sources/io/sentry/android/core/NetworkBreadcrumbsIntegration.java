package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.annotation.NonNull;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C2688aH1;
import defpackage.InterfaceC3328dG1;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.SD1;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkBreadcrumbsIntegration implements OB0, Closeable {

    @NotNull
    public final Context d;

    @NotNull
    public final E e;

    @NotNull
    public final C4527a g = new C4527a();

    @Nullable
    public volatile b h;

    public static class a {
        public final int a;
        public final int b;
        public final int c;
        public final long d;
        public final boolean e;

        @NotNull
        public final String f;

        @SuppressLint({"NewApi"})
        public a(@NotNull NetworkCapabilities networkCapabilities, @NotNull E e, long j) {
            io.sentry.util.p.b(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.p.b(e, "BuildInfoProvider is required");
            this.a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.c = signalStrength > -100 ? signalStrength : 0;
            this.e = networkCapabilities.hasTransport(4);
            String strP = io.sentry.android.core.internal.util.a.p(networkCapabilities);
            this.f = strP == null ? "" : strP;
            this.d = j;
        }
    }

    public static final class b extends ConnectivityManager.NetworkCallback {

        @NotNull
        public final SD1 a;

        @NotNull
        public final E b;

        @Nullable
        public NetworkCapabilities c;
        public long d;

        @NotNull
        public final InterfaceC3328dG1 e;

        public b(@NotNull E e, @NotNull InterfaceC3328dG1 interfaceC3328dG1) {
            SD1 sd1 = SD1.a;
            this.c = null;
            this.d = 0L;
            this.a = sd1;
            io.sentry.util.p.b(e, "BuildInfoProvider is required");
            this.b = e;
            io.sentry.util.p.b(interfaceC3328dG1, "SentryDateProvider is required");
            this.e = interfaceC3328dG1;
        }

        public static C0702Bu a(String str) {
            C0702Bu c0702Bu = new C0702Bu();
            c0702Bu.i = "system";
            c0702Bu.k = "network.event";
            c0702Bu.f(str, "action");
            c0702Bu.m = NG1.INFO;
            return c0702Bu;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NonNull Network network) {
            this.a.g(a("NETWORK_AVAILABLE"));
            this.c = null;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:50:0x00de  */
        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            int i;
            a aVar;
            boolean z;
            boolean z2;
            a aVar2;
            a aVar3;
            long jI = this.e.now().i();
            NetworkCapabilities networkCapabilities2 = this.c;
            long j = this.d;
            E e = this.b;
            if (networkCapabilities2 == null) {
                aVar3 = new a(networkCapabilities, e, jI);
            } else {
                io.sentry.util.p.b(e, "BuildInfoProvider is required");
                int linkDownstreamBandwidthKbps = networkCapabilities2.getLinkDownstreamBandwidthKbps();
                int linkUpstreamBandwidthKbps = networkCapabilities2.getLinkUpstreamBandwidthKbps();
                int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities2.getSignalStrength() : 0;
                if (signalStrength <= -100) {
                    signalStrength = 0;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(4);
                String strP = io.sentry.android.core.internal.util.a.p(networkCapabilities2);
                if (strP == null) {
                    strP = "";
                }
                a aVar4 = new a(networkCapabilities, e, jI);
                int iAbs = Math.abs(signalStrength - aVar4.c);
                int iAbs2 = Math.abs(linkDownstreamBandwidthKbps - aVar4.a);
                int iAbs3 = Math.abs(linkUpstreamBandwidthKbps - aVar4.b);
                boolean z3 = ((double) Math.abs(j - aVar4.d)) / 1000000.0d < 5000.0d;
                boolean z4 = z3 || iAbs <= 5;
                if (z3) {
                    i = linkUpstreamBandwidthKbps;
                    aVar = aVar4;
                } else {
                    aVar = aVar4;
                    double d = iAbs2;
                    i = linkUpstreamBandwidthKbps;
                    if (d > Math.max(1000.0d, ((double) Math.abs(linkDownstreamBandwidthKbps)) * 0.1d)) {
                        z = false;
                    }
                    if (!z3 || iAbs3 <= Math.max(1000.0d, ((double) Math.abs(i)) * 0.1d)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aVar2 = aVar;
                    if (zHasTransport != aVar2.e && strP.equals(aVar2.f) && z4 && z && z2) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                }
                z = true;
                if (z3) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                aVar2 = aVar;
                if (zHasTransport != aVar2.e) {
                    aVar3 = aVar2;
                } else {
                    aVar3 = aVar2;
                }
            }
            if (aVar3 == null) {
                return;
            }
            this.c = networkCapabilities;
            this.d = jI;
            C0702Bu c0702BuA = a("NETWORK_CAPABILITIES_CHANGED");
            c0702BuA.f(Integer.valueOf(aVar3.a), "download_bandwidth");
            c0702BuA.f(Integer.valueOf(aVar3.b), "upload_bandwidth");
            c0702BuA.f(Boolean.valueOf(aVar3.e), "vpn_active");
            c0702BuA.f(aVar3.f, "network_type");
            int i2 = aVar3.c;
            if (i2 != 0) {
                c0702BuA.f(Integer.valueOf(i2), "signal_strength");
            }
            C0841Do0 c0841Do0 = new C0841Do0();
            c0841Do0.d(aVar3, "android:networkCapabilities");
            this.a.l(c0702BuA, c0841Do0);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NonNull Network network) {
            this.a.g(a("NETWORK_LOST"));
            this.c = null;
        }
    }

    public NetworkBreadcrumbsIntegration(@NotNull Context context, @NotNull E e) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        this.e = e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4527a.C0404a c0404aA = this.g.a();
        try {
            b bVar = this.h;
            this.h = null;
            c0404aA.close();
            if (bVar != null) {
                C4527a.C0404a c0404aA2 = io.sentry.android.core.internal.util.a.r.a();
                try {
                    io.sentry.android.core.internal.util.a.s.remove(bVar);
                    c0404aA2.close();
                } catch (Throwable th) {
                    try {
                        c0404aA2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c0404aA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        ILogger logger = c2688aH1.getLogger();
        NG1 ng1 = NG1.DEBUG;
        logger.a(ng1, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.e.getClass();
            C4527a.C0404a c0404aA = this.g.a();
            try {
                this.h = new b(this.e, c2688aH1.getDateProvider());
                if (io.sentry.android.core.internal.util.a.g(this.d, c2688aH1.getLogger(), this.e, this.h)) {
                    c2688aH1.getLogger().a(ng1, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.j.a("NetworkBreadcrumbs");
                } else {
                    c2688aH1.getLogger().a(ng1, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}

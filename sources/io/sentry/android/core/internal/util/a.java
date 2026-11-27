package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import defpackage.CF0;
import defpackage.DF0;
import defpackage.InterfaceC4761js0;
import defpackage.NG1;
import defpackage.RunnableC0909El;
import defpackage.RunnableC4727ji1;
import io.sentry.ILogger;
import io.sentry.android.core.AppState;
import io.sentry.android.core.E;
import io.sentry.android.core.F;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.C4527a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterfaceC4761js0, AppState.a {

    @Nullable
    public static volatile ConnectivityManager q;

    @NotNull
    public final Context d;

    @NotNull
    public final SentryAndroidOptions e;

    @NotNull
    public final E g;

    @NotNull
    public final b h;

    @NotNull
    public final ArrayList i;

    @NotNull
    public final C4527a j;

    @Nullable
    public volatile C0382a k;

    @Nullable
    public volatile NetworkCapabilities l;

    @Nullable
    public volatile Network m;
    public volatile long n;

    @NotNull
    public final AtomicBoolean o;

    @NotNull
    public static final C4527a p = new C4527a();

    @NotNull
    public static final C4527a r = new C4527a();

    @NotNull
    public static final ArrayList s = new ArrayList();
    public static final int[] t = {1, 0, 3, 2};
    public static final int[] u = new int[2];

    /* JADX INFO: renamed from: io.sentry.android.core.internal.util.a$a, reason: collision with other inner class name */
    public class C0382a extends ConnectivityManager.NetworkCallback {
        public C0382a() {
        }

        public final void a() {
            a.this.o.set(false);
            C4527a.C0404a c0404aA = a.this.j.a();
            try {
                a.this.l = null;
                a.this.m = null;
                a aVar = a.this;
                aVar.h.getClass();
                aVar.n = SystemClock.uptimeMillis();
                a.this.e.getLogger().a(NG1.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                Iterator it = a.this.i.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4761js0.b) it.next()).c(InterfaceC4761js0.a.DISCONNECTED);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            a.this.m = network;
            if (a.this.o.getAndSet(true)) {
                return;
            }
            C4527a.C0404a c0404aA = a.r.a();
            try {
                Iterator it = a.s.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
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

        /* JADX WARN: Code duplicated, block: B:33:0x006c A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #2 {all -> 0x0076, blocks: (B:30:0x005e, B:31:0x0066, B:33:0x006c), top: B:63:0x005e }] */
        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            InterfaceC4761js0.a aVarL;
            C4527a.C0404a c0404aA;
            Iterator it;
            if (network.equals(a.this.m)) {
                NetworkCapabilities networkCapabilities2 = a.this.l;
                int i = 0;
                if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                    a.this.A(networkCapabilities);
                    aVarL = a.this.l();
                    c0404aA = a.this.j.a();
                    it = a.this.i.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4761js0.b) it.next()).c(aVarL);
                    }
                    c0404aA.close();
                } else if (networkCapabilities2 != null || networkCapabilities != null) {
                    int[] iArr = a.u;
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            int[] iArr2 = a.t;
                            int length2 = iArr2.length;
                            while (true) {
                                if (i < length2) {
                                    int i3 = iArr2[i];
                                    if (networkCapabilities2.hasTransport(i3) == networkCapabilities.hasTransport(i3)) {
                                        i++;
                                    }
                                }
                            }
                        } else {
                            int i4 = iArr[i2];
                            if (i4 == 0 || networkCapabilities2.hasCapability(i4) == networkCapabilities.hasCapability(i4)) {
                                i2++;
                            }
                        }
                        a.this.A(networkCapabilities);
                        aVarL = a.this.l();
                        c0404aA = a.this.j.a();
                        try {
                            it = a.this.i.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC4761js0.b) it.next()).c(aVarL);
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
                C4527a.C0404a c0404aA2 = a.r.a();
                try {
                    Iterator it2 = a.s.iterator();
                    while (it2.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it2.next()).onCapabilitiesChanged(network, networkCapabilities);
                    }
                    c0404aA2.close();
                } catch (Throwable th3) {
                    try {
                        c0404aA2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            if (network.equals(a.this.m)) {
                a();
                C4527a.C0404a c0404aA = a.r.a();
                try {
                    Iterator it = a.s.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onUnavailable() {
            a();
            C4527a.C0404a c0404aA = a.r.a();
            try {
                Iterator it = a.s.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
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

    public a(@NotNull Context context, @NotNull E e, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        b bVar = b.a;
        this.j = new C4527a();
        this.n = 0L;
        this.o = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        this.e = sentryAndroidOptions;
        this.g = e;
        this.h = bVar;
        this.i = new ArrayList();
        int[] iArr = u;
        iArr[0] = 12;
        iArr[1] = 16;
        u(new RunnableC4727ji1(this, 2));
        AppState.i.c(this);
    }

    public static boolean g(@NotNull Context context, @NotNull ILogger iLogger, @NotNull E e, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        e.getClass();
        if (!m.a(context)) {
            iLogger.a(NG1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        C4527a.C0404a c0404aA = r.a();
        try {
            s.add(networkCallback);
            c0404aA.close();
            return true;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public static String p(@NotNull NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    @Nullable
    public static ConnectivityManager t(@NotNull Context context, @NotNull ILogger iLogger) {
        if (q != null) {
            return q;
        }
        C4527a.C0404a c0404aA = p.a();
        try {
            if (q != null) {
                ConnectivityManager connectivityManager = q;
                c0404aA.close();
                return connectivityManager;
            }
            q = (ConnectivityManager) context.getSystemService("connectivity");
            if (q == null) {
                iLogger.a(NG1.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = q;
            c0404aA.close();
            return connectivityManager2;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @SuppressLint({"NewApi", "MissingPermission"})
    public final void A(@Nullable NetworkCapabilities networkCapabilities) {
        C4527a.C0404a c0404aA = this.j.a();
        try {
            if (networkCapabilities != null) {
                this.l = networkCapabilities;
            } else {
                if (!m.a(this.d)) {
                    this.e.getLogger().a(NG1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.l = null;
                    this.h.getClass();
                    this.n = SystemClock.uptimeMillis();
                    c0404aA.close();
                    return;
                }
                this.g.getClass();
                ConnectivityManager connectivityManagerT = t(this.d, this.e.getLogger());
                if (connectivityManagerT != null) {
                    Network activeNetwork = connectivityManagerT.getActiveNetwork();
                    this.l = activeNetwork != null ? connectivityManagerT.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.l = null;
                }
            }
            this.h.getClass();
            this.n = SystemClock.uptimeMillis();
            this.e.getLogger().a(NG1.DEBUG, "Cache updated - Status: " + l() + ", Type: " + q(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.e.getLogger().d(NG1.WARNING, "Failed to update connection status cache", th);
                this.l = null;
                this.h.getClass();
                this.n = SystemClock.uptimeMillis();
            } catch (Throwable th2) {
                try {
                    c0404aA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        c0404aA.close();
    }

    @Override // defpackage.InterfaceC4761js0
    public final void G0(@NotNull InterfaceC4761js0.b bVar) {
        C4527a.C0404a c0404aA = this.j.a();
        try {
            this.i.remove(bVar);
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

    @Override // defpackage.InterfaceC4761js0
    @NotNull
    public final InterfaceC4761js0.a J0() {
        this.h.getClass();
        if (SystemClock.uptimeMillis() - this.n >= 120000) {
            A(null);
        }
        return l();
    }

    @Override // defpackage.InterfaceC4761js0
    @Nullable
    public final String O() {
        this.h.getClass();
        if (SystemClock.uptimeMillis() - this.n >= 120000) {
            A(null);
        }
        return q();
    }

    @Override // io.sentry.android.core.AppState.a
    public final void c() {
        if (this.k != null) {
            return;
        }
        u(new DF0(this, 4));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u(new RunnableC0909El(this, 3));
    }

    @Override // io.sentry.android.core.AppState.a
    public final void f() {
        if (this.k == null) {
            return;
        }
        u(new CF0(this, 2));
    }

    public final void k() {
        if (F.e() && this.k == null) {
            C4527a.C0404a c0404aA = this.j.a();
            try {
                if (this.k != null) {
                    c0404aA.close();
                    return;
                }
                C0382a c0382a = new C0382a();
                Context context = this.d;
                ILogger logger = this.e.getLogger();
                this.g.getClass();
                ConnectivityManager connectivityManagerT = t(context, logger);
                if (connectivityManagerT != null) {
                    if (m.a(context)) {
                        try {
                            connectivityManagerT.registerDefaultNetworkCallback(c0382a);
                            this.k = c0382a;
                            this.e.getLogger().a(NG1.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th) {
                            logger.d(NG1.WARNING, "registerDefaultNetworkCallback failed", th);
                            this.e.getLogger().a(NG1.WARNING, "Failed to register network callback", new Object[0]);
                        }
                        c0404aA.close();
                    }
                    logger.a(NG1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.e.getLogger().a(NG1.WARNING, "Failed to register network callback", new Object[0]);
                c0404aA.close();
            } catch (Throwable th2) {
                try {
                    c0404aA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @NotNull
    public final InterfaceC4761js0.a l() {
        if (this.l != null) {
            NetworkCapabilities networkCapabilities = this.l;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.g.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i : t) {
                        if (networkCapabilities.hasTransport(i)) {
                            return InterfaceC4761js0.a.CONNECTED;
                        }
                    }
                }
            }
            return InterfaceC4761js0.a.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerT = t(this.d, this.e.getLogger());
        if (connectivityManagerT == null) {
            return InterfaceC4761js0.a.UNKNOWN;
        }
        Context context = this.d;
        ILogger logger = this.e.getLogger();
        if (!m.a(context)) {
            logger.a(NG1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return InterfaceC4761js0.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerT.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? InterfaceC4761js0.a.CONNECTED : InterfaceC4761js0.a.DISCONNECTED;
            }
            logger.a(NG1.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return InterfaceC4761js0.a.DISCONNECTED;
        } catch (Throwable th) {
            logger.d(NG1.WARNING, "Could not retrieve Connection Status", th);
            return InterfaceC4761js0.a.UNKNOWN;
        }
    }

    @Override // defpackage.InterfaceC4761js0
    public final boolean o0(@NotNull InterfaceC4761js0.b bVar) {
        C4527a.C0404a c0404aA = this.j.a();
        try {
            this.i.add(bVar);
            c0404aA.close();
            k();
            return this.k != null;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public final String q() {
        NetworkCapabilities networkCapabilities = this.l;
        if (networkCapabilities != null) {
            return p(networkCapabilities);
        }
        Context context = this.d;
        ILogger logger = this.e.getLogger();
        E e = this.g;
        ConnectivityManager connectivityManagerT = t(context, logger);
        if (connectivityManagerT != null) {
            if (!m.a(context)) {
                logger.a(NG1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                e.getClass();
                Network activeNetwork = connectivityManagerT.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.a(NG1.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerT.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.a(NG1.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th) {
                logger.d(NG1.ERROR, "Failed to retrieve network info", th);
            }
        }
        return null;
    }

    public final void u(@NotNull Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.e;
        try {
            sentryAndroidOptions.getExecutorService().submit(runnable);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    public final void v(boolean z) {
        C4527a.C0404a c0404aA = this.j.a();
        if (z) {
            try {
                this.i.clear();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C0382a c0382a = this.k;
        this.k = null;
        if (c0382a != null) {
            Context context = this.d;
            ILogger logger = this.e.getLogger();
            ConnectivityManager connectivityManagerT = t(context, logger);
            if (connectivityManagerT != null) {
                try {
                    connectivityManagerT.unregisterNetworkCallback(c0382a);
                } catch (Throwable th3) {
                    logger.d(NG1.WARNING, "unregisterNetworkCallback failed", th3);
                }
            }
        }
        this.l = null;
        this.m = null;
        this.n = 0L;
        c0404aA.close();
        this.e.getLogger().a(NG1.DEBUG, "Network callback unregistered", new Object[0]);
    }
}

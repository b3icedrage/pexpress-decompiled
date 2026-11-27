package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.content.ContentProvider;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import defpackage.ApplicationC0963Fd;
import defpackage.C2647a51;
import defpackage.L02;
import defpackage.RunnableC4378iH;
import defpackage.RunnableC4408iR;
import defpackage.RunnableC6824th0;
import io.sentry.android.core.C4498i;
import io.sentry.android.core.C4511w;
import io.sentry.android.core.E;
import io.sentry.android.core.F;
import io.sentry.android.core.G;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.k;
import io.sentry.util.C4527a;
import io.sentry.util.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends io.sentry.android.core.performance.a {
    public static volatile h u;
    public static long t = SystemClock.uptimeMillis();

    @NotNull
    public static final C4527a v = new C4527a();

    @NotNull
    public d d = d.UNKNOWN;
    public final l<Boolean> e = new l<>(new a());
    public volatile long g = -1;
    public C4511w m = null;
    public C4498i n = null;
    public L02 o = null;
    public boolean p = false;
    public boolean q = true;
    public final AtomicInteger r = new AtomicInteger();
    public final AtomicBoolean s = new AtomicBoolean(false);

    @NotNull
    public final i h = new i();

    @NotNull
    public final i i = new i();

    @NotNull
    public final i j = new i();

    @NotNull
    public final HashMap k = new HashMap();

    @NotNull
    public final ArrayList l = new ArrayList();

    public class a implements l.a<Boolean> {
        @Override // io.sentry.util.l.a
        @NotNull
        public final Boolean b() {
            return Boolean.valueOf(F.e());
        }
    }

    public class b implements MessageQueue.IdleHandler {
        public b() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            h.this.g = SystemClock.uptimeMillis();
            h.a(h.this);
            return false;
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Handler d;

        public c(Handler handler) {
            this.d = handler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.g = SystemClock.uptimeMillis();
            this.d.post(new RunnableC4378iH(this, 3));
        }
    }

    public enum d {
        UNKNOWN,
        COLD,
        WARM
    }

    public static void a(h hVar) {
        if (hVar.r.get() == 0) {
            hVar.e.c(Boolean.FALSE);
            C4511w c4511w = hVar.m;
            if (c4511w != null && c4511w.m.get()) {
                hVar.m.close();
                hVar.m = null;
            }
            C4498i c4498i = hVar.n;
            if (c4498i == null || !c4498i.m) {
                return;
            }
            c4498i.a(true);
            hVar.n = null;
        }
    }

    @NotNull
    public static h c() {
        if (u == null) {
            C4527a.C0404a c0404aA = v.a();
            try {
                if (u == null) {
                    u = new h();
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
        return u;
    }

    public static void d(@NotNull ApplicationC0963Fd applicationC0963Fd) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVarC = c();
        if (hVarC.j.h == 0) {
            String strConcat = applicationC0963Fd.getClass().getName().concat(".onCreate");
            i iVar = hVarC.j;
            iVar.d = strConcat;
            iVar.h = jUptimeMillis;
        }
    }

    public static void e(@NotNull ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        i iVar = new i();
        iVar.f(jUptimeMillis);
        c().k.put(contentProvider, iVar);
    }

    public static void f(@NotNull ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        i iVar = (i) c().k.get(contentProvider);
        if (iVar == null || iVar.h != 0) {
            return;
        }
        iVar.d = contentProvider.getClass().getName().concat(".onCreate");
        iVar.h = jUptimeMillis;
    }

    @NotNull
    public final i b(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (this.d != d.UNKNOWN && this.e.a().booleanValue()) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                i iVar = this.h;
                if (iVar.e() && iVar.b() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return iVar;
                }
            }
            i iVar2 = this.i;
            if (iVar2.e() && iVar2.b() <= TimeUnit.MINUTES.toMillis(1L)) {
                return iVar2;
            }
        }
        return new i();
    }

    public final synchronized void g() {
        if (!this.s.getAndSet(true)) {
            h hVarC = c();
            i iVar = hVarC.i;
            iVar.getClass();
            iVar.h = SystemClock.uptimeMillis();
            i iVar2 = hVarC.h;
            iVar2.getClass();
            iVar2.h = SystemClock.uptimeMillis();
        }
    }

    public final void h(@NotNull Application application) {
        if (this.p) {
            return;
        }
        this.p = true;
        this.e.b();
        application.registerActivityLifecycleCallbacks(u);
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null && Build.VERSION.SDK_INT >= 35) {
            List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
            if (!historicalProcessStartReasons.isEmpty()) {
                ApplicationStartInfo applicationStartInfoA = e.a(historicalProcessStartReasons.get(0));
                if (applicationStartInfoA.getStartupState() == 0) {
                    if (applicationStartInfoA.getStartType() == 1) {
                        this.d = d.COLD;
                    } else {
                        this.d = d.WARM;
                    }
                }
            }
        }
        d dVar = this.d;
        d dVar2 = d.UNKNOWN;
        if (dVar == dVar2) {
            Looper.getMainLooper().getQueue().addIdleHandler(new b());
        } else if (dVar == dVar2) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new c(handler));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        G.b.a(activity);
        if (this.r.incrementAndGet() == 1 && !this.s.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.h.g;
            if (!this.e.a().booleanValue() || jUptimeMillis2 > TimeUnit.MINUTES.toMillis(1L)) {
                this.d = d.WARM;
                this.q = true;
                i iVar = this.h;
                iVar.d = null;
                iVar.g = 0L;
                iVar.h = 0L;
                iVar.e = 0L;
                iVar.f(jUptimeMillis);
                t = jUptimeMillis;
                this.k.clear();
                i iVar2 = this.j;
                iVar2.d = null;
                iVar2.g = 0L;
                iVar2.h = 0L;
                iVar2.e = 0L;
            } else if (this.d == d.UNKNOWN) {
                if (bundle != null) {
                    this.d = d.WARM;
                } else if (this.g == -1 || jUptimeMillis <= this.g) {
                    this.d = d.COLD;
                } else {
                    this.d = d.WARM;
                }
            }
        }
        this.e.c(Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        G g = G.b;
        WeakReference<Activity> weakReference = g.a;
        if (weakReference == null || weakReference.get() == activity) {
            g.a = null;
        }
        if (this.r.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.d = d.WARM;
        this.e.c(Boolean.TRUE);
        this.q = true;
        this.s.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
        G g = G.b;
        WeakReference<Activity> weakReference = g.a;
        if (weakReference == null || weakReference.get() == activity) {
            g.a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        G.b.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        G.b.a(activity);
        if (this.s.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            k.a(activity, new RunnableC6824th0(this, 4), new E(C2647a51.a));
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC4408iR(this, 3));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        G g = G.b;
        WeakReference<Activity> weakReference = g.a;
        if (weakReference == null || weakReference.get() == activity) {
            g.a = null;
        }
    }
}

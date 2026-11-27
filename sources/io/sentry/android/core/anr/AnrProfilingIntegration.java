package io.sentry.android.core.anr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.C2647a51;
import defpackage.C2688aH1;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.RunnableC4140h80;
import defpackage.RunnableC7146vD;
import io.sentry.ILogger;
import io.sentry.android.core.AppState;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.C4527a;
import io.sentry.util.j;
import io.sentry.util.p;
import io.sentry.util.v;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class AnrProfilingIntegration implements OB0, Closeable, AppState.a, Runnable {

    @Nullable
    public volatile e l;

    @Nullable
    public volatile SentryAndroidOptions n;

    @Nullable
    public volatile Handler r;

    @Nullable
    public volatile Thread s;
    public final AtomicBoolean d = new AtomicBoolean(true);
    public final RunnableC7146vD e = new RunnableC7146vD(this, 4);

    @NotNull
    public final C4527a g = new C4527a();

    @NotNull
    public final C4527a h = new C4527a();
    public volatile long i = SystemClock.uptimeMillis();
    public final AtomicInteger j = new AtomicInteger();
    public volatile a k = a.IDLE;

    @NotNull
    public volatile ILogger m = C2647a51.a;

    @Nullable
    public volatile Thread o = null;
    public volatile boolean p = false;
    public volatile boolean q = false;

    public enum a {
        IDLE,
        SUSPICIOUS,
        ANR_DETECTED
    }

    @Override // io.sentry.android.core.AppState.a
    public final void c() {
        if (this.d.get()) {
            C4527a.C0404a c0404aA = this.g.a();
            try {
                if (this.q) {
                    c0404aA.close();
                    return;
                }
                this.q = true;
                this.e.run();
                Thread thread = this.o;
                if (thread != null && thread.isAlive()) {
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (thread == null || !thread.isAlive()) {
                    Thread thread2 = new Thread(this, "AnrProfilingIntegration");
                    thread2.setDaemon(true);
                    thread2.start();
                    this.o = thread2;
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.set(false);
        AppState.i.k(this);
        Handler handler = this.r;
        if (handler != null) {
            handler.removeCallbacks(this.e);
        }
        Thread thread = this.o;
        if (thread != null) {
            synchronized (this) {
                notifyAll();
            }
            thread.interrupt();
        }
        SentryAndroidOptions sentryAndroidOptions = this.n;
        C4527a.C0404a c0404aA = this.h.a();
        try {
            e eVar = this.l;
            this.l = null;
            c0404aA.close();
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new RunnableC4140h80(3, this, eVar));
                } catch (Throwable unused) {
                    this.m.a(NG1.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.AppState.a
    public final void f() {
        if (this.d.get()) {
            C4527a.C0404a c0404aA = this.g.a();
            try {
                this.q = false;
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

    public final void g(@NotNull Thread thread) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.i;
        if (jUptimeMillis < 1000) {
            this.k = a.IDLE;
            this.p = false;
        }
        if (this.k == a.IDLE && jUptimeMillis > 1000) {
            ILogger iLogger = this.m;
            NG1 ng1 = NG1.DEBUG;
            if (iLogger.b(ng1)) {
                this.m.a(ng1, "ANR: main thread is suspicious", new Object[0]);
            }
            this.k = a.SUSPICIOUS;
            SentryAndroidOptions sentryAndroidOptions = this.n;
            Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
            if (anrProfilingSampleRate != null && v.a().c() < anrProfilingSampleRate.doubleValue()) {
                this.p = true;
            }
            if (this.p) {
                this.j.set(0);
                k().d.clear();
            }
        }
        if (this.p && (this.k == a.SUSPICIOUS || this.k == a.ANR_DETECTED)) {
            if (this.j.get() < 151) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                g gVar = new g(System.currentTimeMillis(), thread.getStackTrace());
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                ILogger iLogger2 = this.m;
                NG1 ng2 = NG1.DEBUG;
                if (iLogger2.b(ng2)) {
                    this.m.a(ng2, "AnrWatchdog: capturing main thread stacktrace took " + jUptimeMillis3 + "ms", new Object[0]);
                }
                if (this.d.get()) {
                    this.j.incrementAndGet();
                    k().d.c(gVar);
                }
            } else {
                ILogger iLogger3 = this.m;
                NG1 ng3 = NG1.DEBUG;
                if (iLogger3.b(ng3)) {
                    this.m.a(ng3, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                }
            }
        }
        if (this.k != a.SUSPICIOUS || jUptimeMillis <= 4000) {
            return;
        }
        ILogger iLogger4 = this.m;
        NG1 ng4 = NG1.DEBUG;
        if (iLogger4.b(ng4)) {
            this.m.a(ng4, "ANR: main thread ANR threshold reached", new Object[0]);
        }
        this.k = a.ANR_DETECTED;
    }

    @NotNull
    public final e k() {
        C4527a.C0404a c0404aA = this.h.a();
        try {
            if (this.l == null) {
                SentryAndroidOptions sentryAndroidOptions = this.n;
                p.b(sentryAndroidOptions, "Options can't be null");
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath == null) {
                    throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                }
                File file = new File(cacheDirPath);
                f.b(file);
                this.l = new e(sentryAndroidOptions, new File(file, "anr_profile"));
            }
            e eVar = this.l;
            c0404aA.close();
            return eVar;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.r;
        Thread thread = this.s;
        if (handler == null || thread == null) {
            return;
        }
        while (this.d.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (this.q) {
                        g(thread);
                        handler.removeCallbacks(this.e);
                        handler.post(this.e);
                        Thread.sleep(66L);
                    } else {
                        synchronized (this) {
                            while (!this.q && this.d.get()) {
                                try {
                                    wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        this.e.run();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th2) {
                this.m.d(NG1.WARNING, "Failed to execute AnrStacktraceIntegration", th2);
                return;
            }
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.n = sentryAndroidOptions;
        this.m = c2688aH1.getLogger();
        if (this.n.isAnrProfilingEnabled()) {
            if (this.n.getCacheDirPath() == null) {
                this.m.a(NG1.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            this.s = mainLooper.getThread();
            this.r = new Handler(mainLooper);
            j.a("AnrProfiling");
            AppState.i.c(this);
        }
    }
}

package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import defpackage.C0681Bn;
import defpackage.C1332Jw;
import defpackage.C5491nL;
import defpackage.EG1;
import defpackage.NG1;
import defpackage.QF1;
import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.android.core.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4491b extends Thread {
    public final boolean d;
    public final C4513y e;
    public final Q g;
    public final C1332Jw h;
    public final long i;
    public final long j;

    @NotNull
    public final ILogger k;
    public volatile long l;
    public final AtomicBoolean m;

    @NotNull
    public final Context n;
    public final RunnableC4490a o;

    public C4491b(long j, boolean z, @NotNull C4513y c4513y, @NotNull ILogger iLogger, @NotNull Context context) {
        C1332Jw c1332Jw = new C1332Jw();
        Q q = new Q();
        super("|ANR-WatchDog|");
        this.l = 0L;
        this.m = new AtomicBoolean(false);
        this.h = c1332Jw;
        this.j = j;
        this.i = 500L;
        this.d = z;
        this.e = c4513y;
        this.k = iLogger;
        this.g = q;
        this.n = context;
        this.o = new RunnableC4490a(this, c1332Jw);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.o.run();
        while (!isInterrupted()) {
            this.g.a.post(this.o);
            try {
                Thread.sleep(this.i);
                this.h.getClass();
                if (SystemClock.uptimeMillis() - this.l > this.j) {
                    if (this.d || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.n.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.k.d(NG1.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (this.m.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(C0681Bn.c(new StringBuilder("Application Not Responding for at least "), this.j, " ms."), this.g.a.getLooper().getThread());
                            C4513y c4513y = this.e;
                            AnrIntegration anrIntegration = c4513y.a;
                            SentryAndroidOptions sentryAndroidOptions = c4513y.b;
                            C4491b c4491b = AnrIntegration.i;
                            anrIntegration.getClass();
                            sentryAndroidOptions.getLogger().a(NG1.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(AppState.i.h);
                            String strC = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strC = C5491nL.c("Background ", strC);
                            }
                            Thread thread = applicationNotResponding.d;
                            ApplicationNotResponding applicationNotResponding2 = thread == null ? new ApplicationNotResponding(strC) : new ApplicationNotResponding(strC, thread);
                            io.sentry.protocol.l lVar = new io.sentry.protocol.l();
                            lVar.d = "ANR";
                            EG1 eg1 = new EG1(new io.sentry.exception.a(lVar, applicationNotResponding2, thread, true));
                            eg1.y = NG1.ERROR;
                            QF1.e().w(eg1, io.sentry.util.g.a(new AnrIntegration.a(zEquals)));
                        }
                    } else {
                        this.k.a(NG1.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.m.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.k.a(NG1.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.k.a(NG1.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}

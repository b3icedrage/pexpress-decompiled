package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.C0841Do0;
import defpackage.C4722jh0;
import defpackage.EG1;
import defpackage.NG1;
import defpackage.SD1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements Runnable {
    public static final long j = TimeUnit.DAYS.toMillis(91);

    @NotNull
    public final Context d;

    @NotNull
    public final SD1 e;

    @NotNull
    public final SentryAndroidOptions g;

    @NotNull
    public final a h;
    public final long i;

    public interface a {
        @NotNull
        String a();

        int b();

        @Nullable
        Long c();

        boolean d();

        @Nullable
        b e(@NotNull ApplicationExitInfo applicationExitInfo, boolean z);
    }

    public static final class b {

        @NotNull
        public final EG1 a;

        @NotNull
        public final C0841Do0 b;

        @Nullable
        public final io.sentry.hints.d c;

        public b(@NotNull EG1 eg1, @NotNull C0841Do0 c0841Do0, @Nullable io.sentry.hints.d dVar) {
            this.a = eg1;
            this.b = c0841Do0;
            this.c = dVar;
        }
    }

    public D(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull io.sentry.transport.c cVar, @NotNull a aVar) {
        SD1 sd1 = SD1.a;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        this.e = sd1;
        this.g = sentryAndroidOptions;
        this.h = aVar;
        cVar.getClass();
        this.i = System.currentTimeMillis() - j;
    }

    public final void a(@NotNull ApplicationExitInfo applicationExitInfo, boolean z) {
        a aVar = this.h;
        b bVarE = aVar.e(applicationExitInfo, z);
        if (bVarE == null) {
            return;
        }
        EG1 eg1 = bVarE.a;
        if (this.e.w(eg1, bVarE.b).equals(io.sentry.protocol.u.e) || bVarE.c.e()) {
            return;
        }
        this.g.getLogger().a(NG1.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", aVar.a(), eg1.d);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApplicationExitInfo applicationExitInfoA;
        ActivityManager activityManager = (ActivityManager) this.d.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.g;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().a(NG1.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.f envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.e) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.e eVar = (io.sentry.cache.e) envelopeDiskCache;
            if (!eVar.h()) {
                sentryAndroidOptions.getLogger().a(NG1.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                eVar.j.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        a aVar = this.h;
        Long lC = aVar.c();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                applicationExitInfoA = null;
                break;
            }
            applicationExitInfoA = C4722jh0.a(it.next());
            if (applicationExitInfoA.getReason() == aVar.b()) {
                it.remove();
                break;
            }
        }
        if (applicationExitInfoA == null) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "No %ss have been found in the historical exit reasons list.", aVar.a());
            return;
        }
        long timestamp = applicationExitInfoA.getTimestamp();
        long j2 = this.i;
        if (timestamp < j2) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Latest %s happened too long ago, returning early.", aVar.a());
            return;
        }
        if (lC != null && applicationExitInfoA.getTimestamp() <= lC.longValue()) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Latest %s has already been reported, returning early.", aVar.a());
            return;
        }
        if (aVar.d()) {
            Collections.reverse(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ApplicationExitInfo applicationExitInfoA2 = C4722jh0.a(it2.next());
                if (applicationExitInfoA2.getReason() == aVar.b()) {
                    if (applicationExitInfoA2.getTimestamp() < j2) {
                        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "%s happened too long ago %s.", aVar.a(), applicationExitInfoA2);
                    } else if (lC == null || applicationExitInfoA2.getTimestamp() > lC.longValue()) {
                        a(applicationExitInfoA2, false);
                    } else {
                        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "%s has already been reported %s.", aVar.a(), applicationExitInfoA2);
                    }
                }
            }
        }
        a(applicationExitInfoA, true);
    }
}

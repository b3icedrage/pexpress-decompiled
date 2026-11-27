package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import defpackage.C0841Do0;
import defpackage.C1742Pc;
import defpackage.C2912bH1;
import defpackage.EG1;
import defpackage.ID;
import defpackage.N7;
import defpackage.N80;
import defpackage.NG1;
import defpackage.PG1;
import defpackage.QG1;
import defpackage.TF1;
import defpackage.TG1;
import defpackage.VF1;
import io.sentry.protocol.C4519a;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.C4523e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements N80 {
    public final Context d;

    @NotNull
    public final E e;

    @NotNull
    public final SentryAndroidOptions g;

    @Nullable
    public final Future<J> h;

    @NotNull
    public final io.sentry.util.l<String> i = new io.sentry.util.l<>(new ID());

    public I(@NotNull Context context, @NotNull E e, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        Future<J> futureSubmit;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        this.e = e;
        io.sentry.util.p.b(sentryAndroidOptions, "The options object is required.");
        this.g = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.H
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return J.c(this.d.d, sentryAndroidOptions);
                }
            });
        } catch (RejectedExecutionException e2) {
            sentryAndroidOptions.getLogger().d(NG1.WARNING, "Device info caching task rejected.", e2);
            futureSubmit = null;
        }
        this.h = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v5, types: [io.sentry.ILogger] */
    /* JADX WARN: Type inference failed for: r1v6, types: [io.sentry.ILogger] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.content.pm.PackageInfo] */
    public final void a(@NotNull VF1 vf1, @NotNull C0841Do0 c0841Do0) throws ExecutionException, InterruptedException {
        Boolean bool;
        C4519a c4519aD = vf1.e.d();
        if (c4519aD == null) {
            c4519aD = new C4519a();
        }
        c4519aD.i = F.c.a(this.d);
        io.sentry.android.core.performance.i iVarB = io.sentry.android.core.performance.h.c().b(this.g);
        J j = null;
        if (iVarB.e()) {
            TG1 tg1 = iVarB.e() ? new TG1(iVarB.e * 1000000) : null;
            c4519aD.e = tg1 == null ? null : N7.i(Double.valueOf(tg1.d / 1000000.0d).longValue());
        }
        if (!io.sentry.util.g.c(c0841Do0) && c4519aD.o == null && (bool = AppState.i.h) != null) {
            c4519aD.o = Boolean.valueOf(!bool.booleanValue());
        }
        SentryAndroidOptions sentryAndroidOptions = this.g;
        ?? logger = sentryAndroidOptions.getLogger();
        E e = this.e;
        try {
            e.getClass();
            int i = Build.VERSION.SDK_INT;
            Context context = this.d;
            logger = i >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (Throwable th) {
            logger.d(NG1.ERROR, "Error getting package info.", th);
            logger = 0;
        }
        if (logger != 0) {
            String strD = F.d(logger, e);
            if (vf1.p == null) {
                vf1.p = strD;
            }
            Future<J> future = this.h;
            if (future != null) {
                try {
                    j = future.get();
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().a(NG1.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            c4519aD.d = ((PackageInfo) logger).packageName;
            c4519aD.j = ((PackageInfo) logger).versionName;
            c4519aD.k = F.d(logger, e);
            HashMap map = new HashMap();
            String[] strArr = ((PackageInfo) logger).requestedPermissions;
            int[] iArr = ((PackageInfo) logger).requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    String str = strArr[i2];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i2] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            c4519aD.l = map;
            if (j != null) {
                try {
                    F.b bVar = j.f;
                    if (bVar != null) {
                        c4519aD.p = Boolean.valueOf(bVar.a);
                        String[] strArr2 = bVar.b;
                        if (strArr2 != null) {
                            c4519aD.q = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        vf1.e.o(c4519aD);
    }

    public final void b(@NotNull VF1 vf1, boolean z, boolean z2) {
        io.sentry.protocol.F f = vf1.m;
        if (f == null) {
            f = new io.sentry.protocol.F();
            vf1.m = f;
        }
        if (f.e == null) {
            f.e = N.a(this.d);
        }
        String str = f.h;
        SentryAndroidOptions sentryAndroidOptions = this.g;
        if (str == null && sentryAndroidOptions.isSendDefaultPii()) {
            f.h = "{{auto}}";
        }
        C4521c c4521c = vf1.e;
        C4523e c4523eE = c4521c.e();
        Future<J> future = this.h;
        if (c4523eE == null) {
            if (future != null) {
                try {
                    c4521c.q(future.get().a(z, z2));
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().a(NG1.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.n nVarG = c4521c.g();
            if (future != null) {
                try {
                    c4521c.t(future.get().g);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to retrieve os system", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().a(NG1.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (nVarG != null) {
                String str2 = nVarG.d;
                c4521c.l((str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT), nVarG);
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().a(NG1.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            F.a aVar = future.get().e;
            if (aVar != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(aVar.a));
                String str3 = aVar.b;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    vf1.b((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Error getting side loaded info.", th3);
        }
    }

    @Override // defpackage.N80
    @NotNull
    public final C2912bH1 c(@NotNull C2912bH1 c2912bH1, @NotNull C0841Do0 c0841Do0) throws ExecutionException, InterruptedException {
        boolean zD = d(c2912bH1, c0841Do0);
        if (zD) {
            a(c2912bH1, c0841Do0);
        }
        b(c2912bH1, false, zD);
        return c2912bH1;
    }

    public final boolean d(@NotNull VF1 vf1, @NotNull C0841Do0 c0841Do0) {
        if (io.sentry.util.g.d(c0841Do0)) {
            return true;
        }
        this.g.getLogger().a(NG1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", vf1.d);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    @Override // defpackage.N80
    @NotNull
    public final EG1 f(@NotNull EG1 eg1, @NotNull C0841Do0 c0841Do0) throws ExecutionException, InterruptedException {
        io.sentry.protocol.z zVar;
        List<io.sentry.protocol.y> list;
        boolean z;
        boolean zD = d(eg1, c0841Do0);
        if (zD) {
            a(eg1, c0841Do0);
            if (eg1.d() != null) {
                boolean zC = io.sentry.util.g.c(c0841Do0);
                for (io.sentry.protocol.A a : eg1.d()) {
                    io.sentry.android.core.internal.util.e.a.getClass();
                    Long l = a.d;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        Thread thread = Looper.getMainLooper().getThread();
                        if ((Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId()) == jLongValue) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (a.j == null) {
                        a.j = Boolean.valueOf(z);
                    }
                    if (!zC && a.l == null) {
                        a.l = Boolean.valueOf(z);
                    }
                }
            }
        }
        b(eg1, true, zD);
        ArrayList arrayListC = eg1.c();
        if (arrayListC != null && arrayListC.size() > 1) {
            io.sentry.protocol.s sVar = (io.sentry.protocol.s) C1742Pc.c(1, arrayListC);
            if ("java.lang".equals(sVar.g) && (zVar = sVar.i) != null && (list = zVar.d) != null) {
                Iterator<io.sentry.protocol.y> it = list.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it.next().j)) {
                        Collections.reverse(arrayListC);
                        break;
                    }
                }
            }
        }
        return eg1;
    }

    @Override // defpackage.N80
    @NotNull
    public final io.sentry.protocol.B g(@NotNull io.sentry.protocol.B b, @NotNull C0841Do0 c0841Do0) throws ExecutionException, InterruptedException {
        boolean zD = d(b, c0841Do0);
        if (zD) {
            a(b, c0841Do0);
        }
        b(b, false, zD);
        return b;
    }

    @Override // defpackage.N80
    @Nullable
    public final PG1 k(@NotNull PG1 pg1) {
        SentryAndroidOptions sentryAndroidOptions = this.g;
        try {
            TF1 tf1 = TF1.STRING;
            pg1.a("device.brand", new QG1(tf1, Build.BRAND));
            pg1.a("device.model", new QG1(tf1.apiName(), Build.MODEL));
            pg1.a("device.family", new QG1(tf1.apiName(), this.i.a()));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to retrieve device info", th);
        }
        try {
            TF1 tf2 = TF1.STRING;
            pg1.a("os.name", new QG1(tf2, "Android"));
            pg1.a("os.version", new QG1(tf2.apiName(), Build.VERSION.RELEASE));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to retrieve os system", th2);
        }
        return pg1;
    }
}

package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import defpackage.AbstractC3118cG1;
import defpackage.C0663Bh;
import defpackage.C2688aH1;
import defpackage.C4659jO1;
import defpackage.C4804k42;
import defpackage.C5437n42;
import defpackage.C5440n51;
import defpackage.C5479nH;
import defpackage.C6203qj0;
import defpackage.C6763tP0;
import defpackage.C6798ta2;
import defpackage.C8100zl;
import defpackage.EnumC4869kO1;
import defpackage.EnumC6511sB0;
import defpackage.InterfaceC2347Wu0;
import defpackage.InterfaceC4010gY0;
import defpackage.InterfaceC4302hv0;
import defpackage.InterfaceC5014l42;
import defpackage.L02;
import defpackage.MK;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.RunnableC1212Ii;
import defpackage.RunnableC6824th0;
import defpackage.SD1;
import defpackage.TG1;
import defpackage.WG1;
import io.sentry.util.C4527a;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLifecycleIntegration implements OB0, Closeable, Application.ActivityLifecycleCallbacks {

    @NotNull
    public final Application d;

    @NotNull
    public final E e;

    @Nullable
    public SD1 g;

    @Nullable
    public SentryAndroidOptions h;
    public final boolean k;

    @Nullable
    public InterfaceC2347Wu0 n;

    @NotNull
    public final C4494e u;
    public boolean i = false;
    public boolean j = false;
    public boolean l = false;

    @Nullable
    public C6203qj0 m = null;

    @NotNull
    public final WeakHashMap<Activity, InterfaceC2347Wu0> o = new WeakHashMap<>();

    @NotNull
    public final WeakHashMap<Activity, InterfaceC2347Wu0> p = new WeakHashMap<>();

    @NotNull
    public final WeakHashMap<Activity, io.sentry.android.core.performance.b> q = new WeakHashMap<>();

    @NotNull
    public AbstractC3118cG1 r = new WG1(new Date(0), 0);

    @Nullable
    public Future<?> s = null;

    @NotNull
    public final WeakHashMap<Activity, InterfaceC4302hv0> t = new WeakHashMap<>();

    @NotNull
    public final C4527a v = new C4527a();

    @NotNull
    public final C4527a w = new C4527a();

    public ActivityLifecycleIntegration(@NotNull Application application, @NotNull E e, @NotNull C4494e c4494e) {
        this.d = application;
        this.e = e;
        this.u = c4494e;
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = true;
        }
    }

    public static void f(@Nullable InterfaceC2347Wu0 interfaceC2347Wu0, @Nullable InterfaceC2347Wu0 interfaceC2347Wu1) {
        if (interfaceC2347Wu0 == null || interfaceC2347Wu0.e()) {
            return;
        }
        String description = interfaceC2347Wu0.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = interfaceC2347Wu0.getDescription() + " - Deadline Exceeded";
        }
        interfaceC2347Wu0.q(description);
        AbstractC3118cG1 abstractC3118cG1X = interfaceC2347Wu1 != null ? interfaceC2347Wu1.x() : null;
        if (abstractC3118cG1X == null) {
            abstractC3118cG1X = interfaceC2347Wu0.B();
        }
        g(interfaceC2347Wu0, abstractC3118cG1X, EnumC4869kO1.DEADLINE_EXCEEDED);
    }

    public static void g(@Nullable InterfaceC2347Wu0 interfaceC2347Wu0, @NotNull AbstractC3118cG1 abstractC3118cG1, @Nullable EnumC4869kO1 enumC4869kO1) {
        if (interfaceC2347Wu0 == null || interfaceC2347Wu0.e()) {
            return;
        }
        if (enumC4869kO1 == null) {
            enumC4869kO1 = interfaceC2347Wu0.getStatus() != null ? interfaceC2347Wu0.getStatus() : EnumC4869kO1.OK;
        }
        interfaceC2347Wu0.r(enumC4869kO1, abstractC3118cG1);
    }

    public final void c() {
        TG1 tg1;
        io.sentry.android.core.performance.i iVarB = io.sentry.android.core.performance.h.c().b(this.h);
        if (iVarB.h != 0) {
            tg1 = new TG1((iVarB.e() ? iVarB.e + iVarB.b() : 0L) * 1000000);
        } else {
            tg1 = null;
        }
        if (!this.i || tg1 == null) {
            return;
        }
        g(this.n, tg1, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.h;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        C4494e c4494e = this.u;
        C4527a.C0404a c0404aA = c4494e.f.a();
        try {
            if (c4494e.c()) {
                c4494e.d(new RunnableC6824th0(c4494e, 3), "FrameMetricsAggregator.stop");
                FrameMetricsAggregator.a aVar = c4494e.a.a().a;
                SparseIntArray[] sparseIntArrayArr = aVar.b;
                aVar.b = new SparseIntArray[9];
            }
            c4494e.c.clear();
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

    public final void k(@Nullable InterfaceC4302hv0 interfaceC4302hv0, @Nullable InterfaceC2347Wu0 interfaceC2347Wu0, @Nullable InterfaceC2347Wu0 interfaceC2347Wu1) {
        if (interfaceC4302hv0 == null || interfaceC4302hv0.e()) {
            return;
        }
        EnumC4869kO1 enumC4869kO1 = EnumC4869kO1.DEADLINE_EXCEEDED;
        if (interfaceC2347Wu0 != null && !interfaceC2347Wu0.e()) {
            interfaceC2347Wu0.A(enumC4869kO1);
        }
        f(interfaceC2347Wu1, interfaceC2347Wu0);
        Future<?> future = this.s;
        if (future != null) {
            future.cancel(false);
            this.s = null;
        }
        EnumC4869kO1 status = interfaceC4302hv0.getStatus();
        if (status == null) {
            status = EnumC4869kO1.OK;
        }
        interfaceC4302hv0.A(status);
        SD1 sd1 = this.g;
        if (sd1 != null) {
            sd1.A(null, new C6763tP0(this, interfaceC4302hv0));
        }
    }

    public final void l(@Nullable InterfaceC2347Wu0 interfaceC2347Wu0, @Nullable InterfaceC2347Wu0 interfaceC2347Wu1) {
        io.sentry.android.core.performance.h hVarC = io.sentry.android.core.performance.h.c();
        io.sentry.android.core.performance.i iVar = hVarC.h;
        if (iVar.e() && iVar.h == 0) {
            iVar.h = SystemClock.uptimeMillis();
        }
        io.sentry.android.core.performance.i iVar2 = hVarC.i;
        if (iVar2.e() && iVar2.h == 0) {
            iVar2.h = SystemClock.uptimeMillis();
        }
        c();
        C4527a.C0404a c0404aA = this.w.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.h;
            if (sentryAndroidOptions != null && interfaceC2347Wu1 != null) {
                AbstractC3118cG1 abstractC3118cG1Now = sentryAndroidOptions.getDateProvider().now();
                interfaceC2347Wu1.g("time_to_initial_display", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(abstractC3118cG1Now.e(interfaceC2347Wu1.B()))), InterfaceC4010gY0.a.MILLISECOND);
                g(interfaceC2347Wu1, abstractC3118cG1Now, null);
            } else if (interfaceC2347Wu1 != null && !interfaceC2347Wu1.e()) {
                interfaceC2347Wu1.l();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        C6203qj0 c6203qj0;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.k) {
            onActivityPreCreated(activity, bundle);
        }
        C4527a.C0404a c0404aA = this.v.a();
        try {
            if (this.g != null && (sentryAndroidOptions = this.h) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.g.A(null, new C8100zl(io.sentry.android.core.internal.util.f.a(activity), 2));
            }
            p(activity);
            InterfaceC2347Wu0 interfaceC2347Wu0 = this.o.get(activity);
            InterfaceC2347Wu0 interfaceC2347Wu1 = this.p.get(activity);
            this.l = true;
            if (this.i && interfaceC2347Wu0 != null && interfaceC2347Wu1 != null && (c6203qj0 = this.m) != null) {
                c6203qj0.a.add(new C5479nH(interfaceC2347Wu0, interfaceC2347Wu1));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        C4527a.C0404a c0404aA = this.v.a();
        WeakHashMap<Activity, io.sentry.android.core.performance.b> weakHashMap = this.q;
        try {
            io.sentry.android.core.performance.b bVarRemove = weakHashMap.remove(activity);
            if (bVarRemove != null) {
                InterfaceC2347Wu0 interfaceC2347Wu0 = bVarRemove.d;
                if (interfaceC2347Wu0 != null && !interfaceC2347Wu0.e()) {
                    bVarRemove.d.A(EnumC4869kO1.CANCELLED);
                }
                bVarRemove.d = null;
                InterfaceC2347Wu0 interfaceC2347Wu1 = bVarRemove.e;
                if (interfaceC2347Wu1 != null && !interfaceC2347Wu1.e()) {
                    bVarRemove.e.A(EnumC4869kO1.CANCELLED);
                }
                bVarRemove.e = null;
            }
            boolean z = this.i;
            WeakHashMap<Activity, InterfaceC4302hv0> weakHashMap2 = this.t;
            if (z) {
                InterfaceC2347Wu0 interfaceC2347Wu2 = this.n;
                EnumC4869kO1 enumC4869kO1 = EnumC4869kO1.CANCELLED;
                if (interfaceC2347Wu2 != null && !interfaceC2347Wu2.e()) {
                    interfaceC2347Wu2.A(enumC4869kO1);
                }
                WeakHashMap<Activity, InterfaceC2347Wu0> weakHashMap3 = this.o;
                InterfaceC2347Wu0 interfaceC2347Wu3 = weakHashMap3.get(activity);
                WeakHashMap<Activity, InterfaceC2347Wu0> weakHashMap4 = this.p;
                InterfaceC2347Wu0 interfaceC2347Wu4 = weakHashMap4.get(activity);
                EnumC4869kO1 enumC4869kO2 = EnumC4869kO1.DEADLINE_EXCEEDED;
                if (interfaceC2347Wu3 != null && !interfaceC2347Wu3.e()) {
                    interfaceC2347Wu3.A(enumC4869kO2);
                }
                f(interfaceC2347Wu4, interfaceC2347Wu3);
                Future<?> future = this.s;
                if (future != null) {
                    future.cancel(false);
                    this.s = null;
                }
                if (this.i) {
                    k(weakHashMap2.get(activity), null, null);
                }
                this.n = null;
                weakHashMap3.remove(activity);
                weakHashMap4.remove(activity);
            }
            weakHashMap2.remove(activity);
            if (weakHashMap2.isEmpty() && !activity.isChangingConfigurations()) {
                this.l = false;
                this.r = new WG1(new Date(0L), 0L);
                weakHashMap.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        C4527a.C0404a c0404aA = this.v.a();
        try {
            if (!this.k) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        io.sentry.android.core.performance.b bVar = this.q.get(activity);
        if (bVar != null) {
            InterfaceC4302hv0 interfaceC4302hv0 = this.n;
            if (interfaceC4302hv0 == null) {
                interfaceC4302hv0 = this.t.get(activity);
            }
            if (bVar.b == null || interfaceC4302hv0 == null) {
                return;
            }
            InterfaceC2347Wu0 interfaceC2347Wu0A = io.sentry.android.core.performance.b.a(interfaceC4302hv0, bVar.a.concat(".onCreate"), bVar.b);
            bVar.d = interfaceC2347Wu0A;
            interfaceC2347Wu0A.l();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(@NotNull Activity activity) {
        io.sentry.android.core.performance.b bVar = this.q.get(activity);
        if (bVar != null) {
            InterfaceC4302hv0 interfaceC4302hv0 = this.n;
            if (interfaceC4302hv0 == null) {
                interfaceC4302hv0 = this.t.get(activity);
            }
            if (bVar.c != null && interfaceC4302hv0 != null) {
                InterfaceC2347Wu0 interfaceC2347Wu0A = io.sentry.android.core.performance.b.a(interfaceC4302hv0, bVar.a.concat(".onStart"), bVar.c);
                bVar.e = interfaceC2347Wu0A;
                interfaceC2347Wu0A.l();
            }
            InterfaceC2347Wu0 interfaceC2347Wu0 = bVar.d;
            if (interfaceC2347Wu0 == null || bVar.e == null) {
                return;
            }
            AbstractC3118cG1 abstractC3118cG1X = interfaceC2347Wu0.x();
            AbstractC3118cG1 abstractC3118cG1X2 = bVar.e.x();
            if (abstractC3118cG1X == null || abstractC3118cG1X2 == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            C4500k.a.getClass();
            WG1 wg1 = new WG1();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long millis = timeUnit.toMillis(wg1.e(bVar.d.B()));
            long millis2 = timeUnit.toMillis(wg1.e(abstractC3118cG1X));
            long millis3 = timeUnit.toMillis(wg1.e(bVar.e.B()));
            long millis4 = timeUnit.toMillis(wg1.e(abstractC3118cG1X2));
            io.sentry.android.core.performance.c cVar = new io.sentry.android.core.performance.c();
            String description = bVar.d.getDescription();
            long millis5 = timeUnit.toMillis(bVar.d.B().i());
            io.sentry.android.core.performance.i iVar = cVar.d;
            iVar.d = description;
            iVar.e = millis5;
            iVar.g = jUptimeMillis - millis;
            iVar.h = jUptimeMillis - millis2;
            String description2 = bVar.e.getDescription();
            long millis6 = timeUnit.toMillis(bVar.e.B().i());
            io.sentry.android.core.performance.i iVar2 = cVar.e;
            iVar2.d = description2;
            iVar2.e = millis6;
            iVar2.g = jUptimeMillis - millis3;
            iVar2.h = jUptimeMillis - millis4;
            io.sentry.android.core.performance.h.c().l.add(cVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        AbstractC3118cG1 wg1;
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.q.put(activity, bVar);
        if (this.l) {
            return;
        }
        SD1 sd1 = this.g;
        if (sd1 != null) {
            wg1 = sd1.p().getDateProvider().now();
        } else {
            C4500k.a.getClass();
            wg1 = new WG1();
        }
        this.r = wg1;
        bVar.b = wg1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(@NotNull Activity activity) {
        AbstractC3118cG1 wg1;
        this.l = true;
        SD1 sd1 = this.g;
        if (sd1 != null) {
            wg1 = sd1.p().getDateProvider().now();
        } else {
            C4500k.a.getClass();
            wg1 = new WG1();
        }
        this.r = wg1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(@NotNull Activity activity) {
        AbstractC3118cG1 wg1;
        io.sentry.android.core.performance.b bVar = this.q.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.h;
            if (sentryAndroidOptions != null) {
                wg1 = sentryAndroidOptions.getDateProvider().now();
            } else {
                C4500k.a.getClass();
                wg1 = new WG1();
            }
            bVar.c = wg1;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        C4527a.C0404a c0404aA = this.v.a();
        try {
            if (!this.k) {
                onActivityPostStarted(activity);
            }
            if (this.i) {
                InterfaceC2347Wu0 interfaceC2347Wu0 = this.o.get(activity);
                InterfaceC2347Wu0 interfaceC2347Wu1 = this.p.get(activity);
                if (activity.getWindow() != null) {
                    io.sentry.android.core.internal.util.k.a(activity, new com.appsflyer.internal.p(this, interfaceC2347Wu1, interfaceC2347Wu0, 1), this.e);
                } else {
                    new Handler(Looper.getMainLooper()).post(new com.appsflyer.internal.q(this, interfaceC2347Wu1, interfaceC2347Wu0, 1));
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        C4527a.C0404a c0404aA = this.v.a();
        try {
            if (!this.k) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.i) {
                this.u.a(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
    }

    public final void p(@NotNull Activity activity) {
        WeakHashMap<Activity, InterfaceC2347Wu0> weakHashMap;
        WeakHashMap<Activity, InterfaceC2347Wu0> weakHashMap2;
        Boolean boolValueOf;
        TG1 tg1;
        AbstractC3118cG1 abstractC3118cG1;
        L02 l02;
        C4659jO1 c4659jO1;
        InterfaceC4302hv0 interfaceC4302hv0;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.g != null) {
            WeakHashMap<Activity, InterfaceC4302hv0> weakHashMap3 = this.t;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.i) {
                weakHashMap3.put(activity, C5440n51.a);
                if (this.h.isEnableAutoTraceIdGeneration()) {
                    this.g.A(null, new C0663Bh());
                    return;
                }
                return;
            }
            Iterator<Map.Entry<Activity, InterfaceC4302hv0>> it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.p;
                weakHashMap2 = this.o;
                if (!zHasNext) {
                    break;
                }
                Map.Entry<Activity, InterfaceC4302hv0> next = it.next();
                k(next.getValue(), weakHashMap2.get(next.getKey()), weakHashMap.get(next.getKey()));
            }
            final String simpleName = activity.getClass().getSimpleName();
            io.sentry.android.core.performance.i iVarB = io.sentry.android.core.performance.h.c().b(this.h);
            if (F.e() && iVarB.e()) {
                TG1 tg2 = iVarB.e() ? new TG1(iVarB.e * 1000000) : null;
                boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.h.c().d == io.sentry.android.core.performance.h.d.COLD);
                tg1 = tg2;
            } else {
                boolValueOf = null;
                tg1 = null;
            }
            C5437n42 c5437n42 = new C5437n42();
            long deadlineTimeout = this.h.getDeadlineTimeout();
            c5437n42.h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.h.isEnableActivityLifecycleTracingAutoFinish()) {
                c5437n42.g = this.h.getIdleTimeout();
                c5437n42.c = true;
            }
            c5437n42.f = true;
            c5437n42.i = new InterfaceC5014l42() { // from class: io.sentry.android.core.g
                @Override // defpackage.InterfaceC5014l42
                public final void a(InterfaceC4302hv0 interfaceC4302hv1) {
                    C4494e.a aVarB;
                    ActivityLifecycleIntegration activityLifecycleIntegration = this.d;
                    activityLifecycleIntegration.getClass();
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 == null) {
                        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.h;
                        if (sentryAndroidOptions != null) {
                            sentryAndroidOptions.getLogger().a(NG1.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", simpleName);
                            return;
                        }
                        return;
                    }
                    io.sentry.protocol.u uVarS = interfaceC4302hv1.s();
                    C4494e c4494e = activityLifecycleIntegration.u;
                    C4527a.C0404a c0404aA = c4494e.f.a();
                    try {
                        if (!c4494e.c()) {
                            c0404aA.close();
                            return;
                        }
                        C4494e.a aVar = null;
                        c4494e.d(new MK(3, c4494e, activity2), null);
                        C4494e.a aVar2 = (C4494e.a) c4494e.d.remove(activity2);
                        if (aVar2 != null && (aVarB = c4494e.b()) != null) {
                            aVar = new C4494e.a(aVarB.a - aVar2.a, aVarB.b - aVar2.b, aVarB.c - aVar2.c);
                        }
                        if (aVar != null) {
                            int i = aVar.a;
                            int i2 = aVar.c;
                            int i3 = aVar.b;
                            if (i != 0 || i3 != 0 || i2 != 0) {
                                io.sentry.protocol.k kVar = new io.sentry.protocol.k(Integer.valueOf(i), DevicePublicKeyStringDef.NONE);
                                io.sentry.protocol.k kVar2 = new io.sentry.protocol.k(Integer.valueOf(i3), DevicePublicKeyStringDef.NONE);
                                io.sentry.protocol.k kVar3 = new io.sentry.protocol.k(Integer.valueOf(i2), DevicePublicKeyStringDef.NONE);
                                HashMap map = new HashMap();
                                map.put("frames_total", kVar);
                                map.put("frames_slow", kVar2);
                                map.put("frames_frozen", kVar3);
                                c4494e.c.put(uVarS, map);
                                c0404aA.close();
                                return;
                            }
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
            };
            if (this.l || tg1 == null || boolValueOf == null) {
                abstractC3118cG1 = this.r;
                l02 = null;
            } else {
                L02 l03 = io.sentry.android.core.performance.h.c().o;
                io.sentry.android.core.performance.h.c().o = null;
                l02 = l03;
                abstractC3118cG1 = tg1;
            }
            c5437n42.a = abstractC3118cG1;
            c5437n42.e = l02 != null;
            c5437n42.d = "auto.ui.activity";
            InterfaceC4302hv0 interfaceC4302hv0B = this.g.B(new C4804k42(simpleName, io.sentry.protocol.E.COMPONENT, "ui.load", l02), c5437n42);
            C4659jO1 c4659jO2 = new C4659jO1();
            c4659jO2.d = "auto.ui.activity";
            if (this.l || tg1 == null || boolValueOf == null) {
                c4659jO1 = c4659jO2;
            } else {
                InterfaceC2347Wu0 interfaceC2347Wu0Z = interfaceC4302hv0B.z(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", tg1, EnumC6511sB0.SENTRY, c4659jO2);
                interfaceC4302hv0B = interfaceC4302hv0B;
                c4659jO1 = c4659jO2;
                this.n = interfaceC2347Wu0Z;
                c();
            }
            String strConcat = simpleName.concat(" initial display");
            EnumC6511sB0 enumC6511sB0 = EnumC6511sB0.SENTRY;
            AbstractC3118cG1 abstractC3118cG2 = abstractC3118cG1;
            InterfaceC2347Wu0 interfaceC2347Wu0Z2 = interfaceC4302hv0B.z("ui.load.initial_display", strConcat, abstractC3118cG2, enumC6511sB0, c4659jO1);
            weakHashMap2.put(activity, interfaceC2347Wu0Z2);
            if (!this.j || this.m == null || this.h == null) {
                interfaceC4302hv0 = interfaceC4302hv0B;
            } else {
                InterfaceC2347Wu0 interfaceC2347Wu0Z3 = interfaceC4302hv0B.z("ui.load.full_display", simpleName.concat(" full display"), abstractC3118cG2, enumC6511sB0, c4659jO1);
                interfaceC4302hv0 = interfaceC4302hv0B;
                try {
                    weakHashMap.put(activity, interfaceC2347Wu0Z3);
                    this.s = this.h.getExecutorService().c(new RunnableC1212Ii(this, interfaceC2347Wu0Z3, interfaceC2347Wu0Z2, 2), 25000L);
                } catch (RejectedExecutionException e) {
                    this.h.getLogger().d(NG1.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
                }
            }
            this.g.A(null, new C6798ta2(this, interfaceC4302hv0));
            weakHashMap3.put(activity, interfaceC4302hv0);
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        SD1 sd1 = SD1.a;
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.h = sentryAndroidOptions;
        this.g = sd1;
        this.i = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.m = this.h.getFullyDisplayedReporter();
        this.j = this.h.isEnableTimeToFullDisplayTracing();
        this.d.registerActivityLifecycleCallbacks(this);
        this.h.getLogger().a(NG1.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.j.a("ActivityLifecycle");
    }
}

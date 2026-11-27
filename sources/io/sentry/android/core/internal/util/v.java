package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import defpackage.NG1;
import defpackage.P;
import defpackage.RunnableC4003gW;
import defpackage.W10;
import io.sentry.android.core.C4502m;
import io.sentry.android.core.E;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Application.ActivityLifecycleCallbacks {
    public static final long r = TimeUnit.SECONDS.toNanos(1);
    public static final long s = TimeUnit.MILLISECONDS.toNanos(700);
    public static final /* synthetic */ int t = 0;

    @NotNull
    public final E d;

    @NotNull
    public final CopyOnWriteArraySet e;

    @NotNull
    public final C4502m g;

    @Nullable
    public final Handler h;

    @Nullable
    public WeakReference<Window> i;

    @NotNull
    public final ConcurrentHashMap j;
    public final boolean k;
    public final u l;

    @Nullable
    public final t m;

    @Nullable
    public Choreographer n;

    @Nullable
    public final Field o;
    public long p;
    public long q;

    public interface a {
        void d(long j, long j2, long j3, long j4, boolean z, boolean z2, float f);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.t] */
    @SuppressLint({"NewApi"})
    public v(@NotNull Context context, @NotNull final C4502m c4502m, @NotNull final E e) {
        u uVar = new u();
        this.e = new CopyOnWriteArraySet();
        this.j = new ConcurrentHashMap();
        this.k = false;
        this.p = 0L;
        this.q = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        io.sentry.util.p.b(c4502m, "Logger is required");
        this.g = c4502m;
        io.sentry.util.p.b(e, "BuildInfoProvider is required");
        this.d = e;
        this.l = uVar;
        if (context instanceof Application) {
            this.k = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.s
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    c4502m.d(NG1.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.h = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new P(4, this, c4502m));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                c4502m.d(NG1.ERROR, "Unable to get the frame timestamp from the choreographer: ", e2);
            }
            this.m = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.t
                /* JADX WARN: Code duplicated, block: B:18:0x008a  */
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    long jLongValue;
                    Field field;
                    v vVar = this.a;
                    vVar.getClass();
                    long jNanoTime = System.nanoTime();
                    e.getClass();
                    int i2 = Build.VERSION.SDK_INT;
                    float refreshRate = i2 >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
                    float f = v.r;
                    long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
                    long jMax = Math.max(0L, metric - ((long) (f / refreshRate)));
                    vVar.d.getClass();
                    if (i2 >= 26) {
                        jLongValue = frameMetrics.getMetric(10);
                    } else {
                        Choreographer choreographer = vVar.n;
                        if (choreographer == null || (field = vVar.o) == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l = (Long) field.get(choreographer);
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                    }
                    if (jLongValue < 0) {
                        jLongValue = jNanoTime - metric;
                    }
                    long jMax2 = Math.max(jLongValue, vVar.q);
                    if (jMax2 == vVar.p) {
                        return;
                    }
                    vVar.p = jMax2;
                    vVar.q = jMax2 + metric;
                    boolean z = metric > ((long) (f / (refreshRate - 1.0f)));
                    boolean z2 = z && metric > v.s;
                    Iterator it = vVar.j.values().iterator();
                    while (it.hasNext()) {
                        long j = metric;
                        long j2 = jMax;
                        ((v.a) it.next()).d(jMax2, vVar.q, j, j2, z, z2, refreshRate);
                        jMax = j2;
                        metric = j;
                    }
                }
            };
        }
    }

    public final void a(@Nullable String str) {
        if (this.k) {
            ConcurrentHashMap concurrentHashMap = this.j;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference<Window> weakReference = this.i;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new W10(4, this, window));
        }
    }

    @SuppressLint({"NewApi"})
    public final void b() {
        WeakReference<Window> weakReference = this.i;
        Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.k || this.j.isEmpty() || this.h == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC4003gW(1, this, window));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Window window = activity.getWindow();
        WeakReference<Window> weakReference = this.i;
        if (weakReference == null || weakReference.get() != window) {
            this.i = new WeakReference<>(window);
            b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        new Handler(Looper.getMainLooper()).post(new W10(4, this, activity.getWindow()));
        WeakReference<Window> weakReference = this.i;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.i = null;
    }
}

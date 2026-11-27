package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import com.google.firebase.perf.session.SessionManager;
import defpackage.AP1;
import defpackage.C1198Id0;
import defpackage.C2872b52;
import defpackage.C5207m;
import defpackage.C5760od1;
import defpackage.C6170qb;
import defpackage.C8002zI;
import defpackage.EP0;
import defpackage.I02;
import defpackage.P;
import defpackage.QZ1;
import defpackage.RunnableC2411Xh;
import defpackage.RunnableC2477Yd;
import defpackage.RunnableC2489Yh;
import defpackage.RunnableC2555Zd;
import defpackage.ViewOnAttachStateChangeListenerC0733Ce0;
import defpackage.ViewTreeObserverOnDrawListenerC0811De0;
import defpackage.ViewTreeObserverOnPreDrawListenerC2221Vf1;
import defpackage.Z0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, EP0 {
    public static volatile AppStartTrace B;
    public static ThreadPoolExecutor C;
    public final C2872b52 e;
    public final C8002zI g;
    public final I02.a h;
    public Application i;
    public final QZ1 k;
    public final QZ1 l;
    public C5760od1 u;

    @NonNull
    public static final QZ1 z = new QZ1();
    public static final long A = TimeUnit.MINUTES.toMicros(1);
    public boolean d = false;
    public boolean j = false;
    public QZ1 m = null;
    public QZ1 n = null;
    public QZ1 o = null;
    public QZ1 p = null;
    public QZ1 q = null;
    public QZ1 r = null;
    public QZ1 s = null;
    public QZ1 t = null;
    public boolean v = false;
    public int w = 0;
    public final a x = new a();
    public boolean y = false;

    public final class a implements ViewTreeObserver.OnDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.this.w++;
        }
    }

    public static class b implements Runnable {
        public final AppStartTrace d;

        public b(AppStartTrace appStartTrace) {
            this.d = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppStartTrace appStartTrace = this.d;
            if (appStartTrace.m == null) {
                appStartTrace.v = true;
            }
        }
    }

    public AppStartTrace(@NonNull C2872b52 c2872b52, @NonNull C5207m c5207m, @NonNull C8002zI c8002zI, @NonNull ThreadPoolExecutor threadPoolExecutor) {
        QZ1 qz1 = null;
        this.e = c2872b52;
        this.g = c8002zI;
        C = threadPoolExecutor;
        I02.a aVarP = I02.P();
        aVarP.x("_experiment_app_start_ttid");
        this.h = aVarP;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        long micros2 = timeUnit.toMicros(System.currentTimeMillis());
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.k = new QZ1((micros - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + micros2, micros);
        AP1 ap1 = (AP1) C1198Id0.c().b(AP1.class);
        if (ap1 != null) {
            long micros3 = timeUnit.toMicros(ap1.a());
            qz1 = new QZ1((micros3 - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros3);
        }
        this.l = qz1;
    }

    public static boolean d(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strC = Z0.c(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strC))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @NonNull
    public final QZ1 a() {
        QZ1 qz1 = this.l;
        return qz1 != null ? qz1 : z;
    }

    @NonNull
    public final QZ1 c() {
        QZ1 qz1 = this.k;
        return qz1 != null ? qz1 : a();
    }

    public final void e(I02.a aVar) {
        if (this.r == null || this.s == null || this.t == null) {
            return;
        }
        C.execute(new P(1, this, aVar));
        f();
    }

    public final synchronized void f() {
        if (this.d) {
            ProcessLifecycleOwner.m.j.c(this);
            this.i.unregisterActivityLifecycleCallbacks(this);
            this.d = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.v && this.m == null) {
                this.y = this.y || d(this.i);
                new WeakReference(activity);
                this.m = new QZ1();
                if (c().b(this.m) > A) {
                    this.j = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.v || this.j || !this.g.f()) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.x);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.v && !this.j) {
                boolean zF = this.g.f();
                if (zF) {
                    View viewFindViewById = activity.findViewById(R.id.content);
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.x);
                    ViewTreeObserverOnDrawListenerC0811De0 viewTreeObserverOnDrawListenerC0811De0 = new ViewTreeObserverOnDrawListenerC0811De0(viewFindViewById, new RunnableC2477Yd(this, 1));
                    if (Build.VERSION.SDK_INT >= 26 || (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow())) {
                        viewFindViewById.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0811De0);
                    } else {
                        viewFindViewById.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0733Ce0(viewTreeObserverOnDrawListenerC0811De0));
                    }
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2221Vf1(viewFindViewById, new RunnableC2555Zd(this, 1), new RunnableC2411Xh(this, 0)));
                }
                if (this.o != null) {
                    return;
                }
                new WeakReference(activity);
                this.o = new QZ1();
                this.u = SessionManager.getInstance().perfSession();
                C6170qb c6170qbD = C6170qb.d();
                activity.getClass();
                a().b(this.o);
                c6170qbD.a();
                C.execute(new RunnableC2489Yh(this, 0));
                if (!zF) {
                    f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.v && this.n == null && !this.j) {
            this.n = new QZ1();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @m(g.a.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.v || this.j || this.q != null) {
            return;
        }
        this.q = new QZ1();
        I02.a aVarP = I02.P();
        aVarP.x("_experiment_firstBackgrounding");
        aVarP.v(c().d);
        aVarP.w(c().b(this.q));
        this.h.s(aVarP.n());
    }

    @m(g.a.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.v || this.j || this.p != null) {
            return;
        }
        this.p = new QZ1();
        I02.a aVarP = I02.P();
        aVarP.x("_experiment_firstForegrounding");
        aVarP.v(c().d);
        aVarP.w(c().b(this.p));
        this.h.s(aVarP.n());
    }
}

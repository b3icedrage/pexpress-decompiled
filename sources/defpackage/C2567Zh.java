package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.g;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2567Zh implements Application.ActivityLifecycleCallbacks {
    public static final C6170qb v = C6170qb.d();
    public static volatile C2567Zh w;
    public final WeakHashMap<Activity, Boolean> d;
    public final WeakHashMap<Activity, C2571Zi0> e;
    public final WeakHashMap<Activity, C0979Fi0> g;
    public final WeakHashMap<Activity, Trace> h;
    public final HashMap i;
    public final HashSet j;
    public final HashSet k;
    public final AtomicInteger l;
    public final C2872b52 m;
    public final C8002zI n;
    public final C5207m o;
    public final boolean p;
    public QZ1 q;
    public QZ1 r;
    public EnumC1134Hi s;
    public boolean t;
    public boolean u;

    /* JADX INFO: renamed from: Zh$a */
    public interface a {
        void a();
    }

    /* JADX INFO: renamed from: Zh$b */
    public interface b {
        void onUpdateAppState(EnumC1134Hi enumC1134Hi);
    }

    public C2567Zh(C2872b52 c2872b52, C5207m c5207m) {
        C8002zI c8002zIE = C8002zI.e();
        C6170qb c6170qb = C2571Zi0.e;
        this.d = new WeakHashMap<>();
        this.e = new WeakHashMap<>();
        this.g = new WeakHashMap<>();
        this.h = new WeakHashMap<>();
        this.i = new HashMap();
        this.j = new HashSet();
        this.k = new HashSet();
        this.l = new AtomicInteger(0);
        this.s = EnumC1134Hi.BACKGROUND;
        this.t = false;
        this.u = true;
        this.m = c2872b52;
        this.o = c5207m;
        this.n = c8002zIE;
        this.p = true;
    }

    public static C2567Zh a() {
        if (w == null) {
            synchronized (C2567Zh.class) {
                try {
                    if (w == null) {
                        w = new C2567Zh(C2872b52.w, new C5207m());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return w;
    }

    public final void b(@NonNull String str) {
        synchronized (this.i) {
            try {
                Long l = (Long) this.i.get(str);
                if (l == null) {
                    this.i.put(str, 1L);
                } else {
                    this.i.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Activity activity) {
        C2745aa1<C2493Yi0> c2745aa1;
        WeakHashMap<Activity, Trace> weakHashMap = this.h;
        Trace trace = weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        C2571Zi0 c2571Zi0 = this.e.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = c2571Zi0.b;
        boolean z = c2571Zi0.d;
        C6170qb c6170qb = C2571Zi0.e;
        if (z) {
            HashMap map = c2571Zi0.c;
            if (!map.isEmpty()) {
                c6170qb.a();
                map.clear();
            }
            C2745aa1<C2493Yi0> c2745aa1A = c2571Zi0.a();
            try {
                frameMetricsAggregator.b(c2571Zi0.a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                c6170qb.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                c2745aa1A = new C2745aa1<>();
            }
            FrameMetricsAggregator.a aVar = frameMetricsAggregator.a;
            SparseIntArray[] sparseIntArrayArr = aVar.b;
            aVar.b = new SparseIntArray[9];
            c2571Zi0.d = false;
            c2745aa1 = c2745aa1A;
        } else {
            c6170qb.a();
            c2745aa1 = new C2745aa1<>();
        }
        if (c2745aa1.b()) {
            C3531eE1.a(trace, c2745aa1.a());
            trace.stop();
        } else {
            v.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void d(String str, QZ1 qz1, QZ1 qz2) {
        if (this.n.o()) {
            I02.a aVarP = I02.P();
            aVarP.x(str);
            aVarP.v(qz1.d);
            aVarP.w(qz1.b(qz2));
            C5970pd1 c5970pd1A = SessionManager.getInstance().perfSession().a();
            aVarP.p();
            I02.B((I02) aVarP.e, c5970pd1A);
            int andSet = this.l.getAndSet(0);
            synchronized (this.i) {
                try {
                    HashMap map = this.i;
                    aVarP.p();
                    I02.x((I02) aVarP.e).putAll(map);
                    if (andSet != 0) {
                        aVarP.t("_tsns", andSet);
                    }
                    this.i.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.m.c(aVarP.n(), EnumC1134Hi.FOREGROUND_BACKGROUND);
        }
    }

    public final void e(Activity activity) {
        if (this.p && this.n.o()) {
            C2571Zi0 c2571Zi0 = new C2571Zi0(activity);
            this.e.put(activity, c2571Zi0);
            if (activity instanceof g) {
                C0979Fi0 c0979Fi0 = new C0979Fi0(this.o, this.m, this, c2571Zi0);
                this.g.put(activity, c0979Fi0);
                ((g) activity).getSupportFragmentManager().R(c0979Fi0, true);
            }
        }
    }

    public final void f(EnumC1134Hi enumC1134Hi) {
        this.s = enumC1134Hi;
        synchronized (this.j) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.s);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.e.remove(activity);
        WeakHashMap<Activity, C0979Fi0> weakHashMap = this.g;
        if (weakHashMap.containsKey(activity)) {
            ((g) activity).getSupportFragmentManager().d0(weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.d.isEmpty()) {
            this.o.getClass();
            this.q = new QZ1();
            this.d.put(activity, Boolean.TRUE);
            if (this.u) {
                f(EnumC1134Hi.FOREGROUND);
                synchronized (this.k) {
                    try {
                        for (a aVar : this.k) {
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.u = false;
            } else {
                d("_bs", this.r, this.q);
                f(EnumC1134Hi.FOREGROUND);
            }
        } else {
            this.d.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.p && this.n.o()) {
                if (!this.e.containsKey(activity)) {
                    e(activity);
                }
                C2571Zi0 c2571Zi0 = this.e.get(activity);
                boolean z = c2571Zi0.d;
                Activity activity2 = c2571Zi0.a;
                if (z) {
                    C2571Zi0.e.b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    c2571Zi0.b.a(activity2);
                    c2571Zi0.d = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.m, this.o, this);
                trace.start();
                this.h.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.p) {
                c(activity);
            }
            if (this.d.containsKey(activity)) {
                this.d.remove(activity);
                if (this.d.isEmpty()) {
                    this.o.getClass();
                    QZ1 qz1 = new QZ1();
                    this.r = qz1;
                    d("_fs", this.q, qz1);
                    f(EnumC1134Hi.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

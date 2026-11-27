package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C2688aH1;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.SD1;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBreadcrumbsIntegration implements OB0, Closeable, Application.ActivityLifecycleCallbacks {

    @NotNull
    public final Application d;

    @Nullable
    public SD1 e;
    public boolean g;

    @NotNull
    public final C4527a h = new C4527a();

    public ActivityBreadcrumbsIntegration(@NotNull Application application) {
        this.d = application;
    }

    public final void c(@NotNull Activity activity, @NotNull String str) {
        if (this.e == null) {
            return;
        }
        C0702Bu c0702Bu = new C0702Bu();
        c0702Bu.i = "navigation";
        c0702Bu.f(str, "state");
        c0702Bu.f(activity.getClass().getSimpleName(), "screen");
        c0702Bu.k = "ui.lifecycle";
        c0702Bu.m = NG1.INFO;
        C0841Do0 c0841Do0 = new C0841Do0();
        c0841Do0.d(activity, "android:activity");
        this.e.l(c0702Bu, c0841Do0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            this.d.unregisterActivityLifecycleCallbacks(this);
            SD1 sd1 = this.e;
            if (sd1 != null) {
                sd1.p().getLogger().a(NG1.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        C4527a.C0404a c0404aA = this.h.a();
        try {
            c(activity, "created");
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
        C4527a.C0404a c0404aA = this.h.a();
        try {
            c(activity, "destroyed");
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
        C4527a.C0404a c0404aA = this.h.a();
        try {
            c(activity, "paused");
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
    public final void onActivityResumed(@NotNull Activity activity) {
        C4527a.C0404a c0404aA = this.h.a();
        try {
            c(activity, "resumed");
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
        C4527a.C0404a c0404aA = this.h.a();
        try {
            c(activity, "saveInstanceState");
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
    public final void onActivityStarted(@NotNull Activity activity) {
        C4527a.C0404a c0404aA = this.h.a();
        try {
            c(activity, "started");
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
        C4527a.C0404a c0404aA = this.h.a();
        try {
            c(activity, "stopped");
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

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        SD1 sd1 = SD1.a;
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.e = sd1;
        this.g = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = c2688aH1.getLogger();
        NG1 ng1 = NG1.DEBUG;
        logger.a(ng1, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.g));
        if (this.g) {
            this.d.registerActivityLifecycleCallbacks(this);
            c2688aH1.getLogger().a(ng1, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.j.a("ActivityBreadcrumbs");
        }
    }
}

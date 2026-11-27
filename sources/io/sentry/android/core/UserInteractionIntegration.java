package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import defpackage.C2688aH1;
import defpackage.EnumC4869kO1;
import defpackage.FP0;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.SD1;
import io.sentry.ILogger;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInteractionIntegration implements OB0, Closeable, Application.ActivityLifecycleCallbacks {

    @NotNull
    public final Application d;

    @Nullable
    public SD1 e;

    @Nullable
    public SentryAndroidOptions g;
    public final boolean h = io.sentry.util.m.a(this.g, "androidx.core.view.GestureDetectorCompat");
    public final boolean i = io.sentry.util.m.a(this.g, "androidx.lifecycle.Lifecycle");

    public UserInteractionIntegration(@NotNull Application application, @NotNull io.sentry.util.m mVar) {
        this.d = application;
    }

    public final void c(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.g;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(NG1.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.e == null || this.g == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.g(callback, activity, new io.sentry.android.core.internal.gestures.e(activity, this.e, this.g), this.g));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.g;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.g;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(NG1.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            io.sentry.android.core.internal.gestures.g gVar = (io.sentry.android.core.internal.gestures.g) callback;
            gVar.g.d(EnumC4869kO1.CANCELLED);
            Window.Callback callback2 = gVar.e;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        SD1 sd1 = SD1.a;
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.g = sentryAndroidOptions;
        this.e = sd1;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.g.isEnableUserInteractionTracing();
        ILogger logger = this.g.getLogger();
        NG1 ng1 = NG1.DEBUG;
        logger.a(ng1, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            if (!this.h) {
                c2688aH1.getLogger().a(NG1.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.d.registerActivityLifecycleCallbacks(this);
            this.g.getLogger().a(ng1, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.j.a("UserInteraction");
            if (this.i) {
                WeakReference<Activity> weakReference = G.b.a;
                Activity activity = weakReference != null ? weakReference.get() : null;
                if ((activity instanceof FP0) && ((FP0) activity).getLifecycle().b() == androidx.lifecycle.g.b.i) {
                    c(activity);
                }
            }
        }
    }
}

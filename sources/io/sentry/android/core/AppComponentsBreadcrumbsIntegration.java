package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C2688aH1;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.SD1;
import io.sentry.ILogger;
import io.sentry.protocol.C4523e;
import java.io.Closeable;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppComponentsBreadcrumbsIntegration implements OB0, Closeable, ComponentCallbacks2 {

    @NotNull
    public static final C0841Do0 i = new C0841Do0();

    @NotNull
    public final Context d;

    @Nullable
    public SD1 e;

    @Nullable
    public SentryAndroidOptions g;

    @NotNull
    public final io.sentry.android.core.internal.util.i h = new io.sentry.android.core.internal.util.i(0, 60000);

    public AppComponentsBreadcrumbsIntegration(@NotNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
    }

    public final void c(@NotNull Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.g;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.g.getLogger().c(NG1.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.d.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.g;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(NG1.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.g;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().a(NG1.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull final Configuration configuration) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        c(new Runnable() { // from class: io.sentry.android.core.z
            @Override // java.lang.Runnable
            public final void run() {
                C4523e.b bVar;
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.d;
                if (appComponentsBreadcrumbsIntegration.e != null) {
                    int i2 = appComponentsBreadcrumbsIntegration.d.getResources().getConfiguration().orientation;
                    if (i2 != 1) {
                        bVar = i2 != 2 ? null : C4523e.b.LANDSCAPE;
                    } else {
                        bVar = C4523e.b.PORTRAIT;
                    }
                    String lowerCase = bVar != null ? bVar.name().toLowerCase(Locale.ROOT) : "undefined";
                    C0702Bu c0702Bu = new C0702Bu(jCurrentTimeMillis);
                    c0702Bu.i = "navigation";
                    c0702Bu.k = "device.orientation";
                    c0702Bu.f(lowerCase, "position");
                    c0702Bu.m = NG1.INFO;
                    C0841Do0 c0841Do0 = new C0841Do0();
                    c0841Do0.d(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.e.l(c0702Bu, c0841Do0);
                }
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i2) {
        if (i2 >= 40 && !this.h.a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            c(new Runnable() { // from class: io.sentry.android.core.A
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.d;
                    if (appComponentsBreadcrumbsIntegration.e != null) {
                        C0702Bu c0702Bu = new C0702Bu(jCurrentTimeMillis);
                        c0702Bu.i = "system";
                        c0702Bu.k = "device.event";
                        c0702Bu.h = "Low memory";
                        c0702Bu.f("LOW_MEMORY", "action");
                        c0702Bu.f(Integer.valueOf(i2), "level");
                        c0702Bu.m = NG1.WARNING;
                        appComponentsBreadcrumbsIntegration.e.l(c0702Bu, AppComponentsBreadcrumbsIntegration.i);
                    }
                }
            });
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        this.e = SD1.a;
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.g = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        NG1 ng1 = NG1.DEBUG;
        logger.a(ng1, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.g.isEnableAppComponentBreadcrumbs()));
        if (this.g.isEnableAppComponentBreadcrumbs()) {
            try {
                this.d.registerComponentCallbacks(this);
                c2688aH1.getLogger().a(ng1, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.j.a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.g.setEnableAppComponentBreadcrumbs(false);
                c2688aH1.getLogger().c(NG1.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }
}

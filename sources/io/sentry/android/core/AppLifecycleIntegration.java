package io.sentry.android.core;

import defpackage.C2688aH1;
import defpackage.NG1;
import defpackage.OB0;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLifecycleIntegration implements OB0, Closeable {

    @NotNull
    public final C4527a d = new C4527a();

    @Nullable
    public volatile P e;

    @Nullable
    public SentryAndroidOptions g;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4527a.C0404a c0404aA = this.d.a();
        try {
            P p = this.e;
            this.e = null;
            c0404aA.close();
            if (p != null) {
                AppState.i.k(p);
                SentryAndroidOptions sentryAndroidOptions = this.g;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().a(NG1.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            AppState.i.l();
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
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.g = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        NG1 ng1 = NG1.DEBUG;
        logger.a(ng1, "enableSessionTracking enabled: %s", Boolean.valueOf(this.g.isEnableAutoSessionTracking()));
        this.g.getLogger().a(ng1, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.g.isEnableAppLifecycleBreadcrumbs()));
        if (this.g.isEnableAutoSessionTracking() || this.g.isEnableAppLifecycleBreadcrumbs()) {
            C4527a.C0404a c0404aA = this.d.a();
            try {
                if (this.e != null) {
                    c0404aA.close();
                    return;
                }
                this.e = new P(this.g.isEnableAutoSessionTracking(), this.g.isEnableAppLifecycleBreadcrumbs(), this.g.getSessionTrackingIntervalMillis());
                AppState.i.c(this.e);
                c0404aA.close();
                c2688aH1.getLogger().a(ng1, "AppLifecycleIntegration installed.", new Object[0]);
                io.sentry.util.j.a("AppLifecycle");
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}

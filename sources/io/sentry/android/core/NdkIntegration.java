package io.sentry.android.core;

import defpackage.C2688aH1;
import defpackage.NG1;
import defpackage.OB0;
import io.sentry.ILogger;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class NdkIntegration implements OB0, Closeable {

    @Nullable
    public final Class<?> d;

    @Nullable
    public SentryAndroidOptions e;

    public NdkIntegration(@Nullable Class<?> cls) {
        this.d = cls;
    }

    public static void c(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.e;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.d;
        try {
            if (cls != null) {
                try {
                    cls.getMethod("close", new Class[0]).invoke(null, new Object[0]);
                    this.e.getLogger().a(NG1.DEBUG, "NdkIntegration removed.", new Object[0]);
                    c(this.e);
                } catch (NoSuchMethodException e) {
                    this.e.getLogger().d(NG1.ERROR, "Failed to invoke the SentryNdk.close method.", e);
                    c(this.e);
                } catch (Throwable th) {
                    this.e.getLogger().d(NG1.ERROR, "Failed to close SentryNdk.", th);
                    c(this.e);
                }
            }
        } catch (Throwable th2) {
            c(this.e);
            throw th2;
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        Class<?> cls;
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.e = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.e.getLogger();
        NG1 ng1 = NG1.DEBUG;
        logger.a(ng1, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.d) == null) {
            c(this.e);
            return;
        }
        if (this.e.getCacheDirPath() == null) {
            this.e.getLogger().a(NG1.ERROR, "No cache dir path is defined in options.", new Object[0]);
            c(this.e);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.e);
            this.e.getLogger().a(ng1, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.j.a("Ndk");
        } catch (NoSuchMethodException e) {
            c(this.e);
            this.e.getLogger().d(NG1.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            c(this.e);
            this.e.getLogger().d(NG1.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}

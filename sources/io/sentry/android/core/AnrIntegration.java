package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import defpackage.C2688aH1;
import defpackage.NG1;
import defpackage.OB0;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnrIntegration implements OB0, Closeable {

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static C4491b i;

    @NotNull
    public static final C4527a j = new C4527a();

    @NotNull
    public final Context d;
    public boolean e = false;

    @NotNull
    public final C4527a g = new C4527a();

    @Nullable
    public C2688aH1 h;

    public static final class a implements io.sentry.hints.a, io.sentry.hints.r {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // io.sentry.hints.a
        @Nullable
        public final Long a() {
            return null;
        }

        @Override // io.sentry.hints.a
        public final boolean d() {
            return true;
        }

        @Override // io.sentry.hints.a
        public final String g() {
            return this.a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(@NotNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
    }

    public final void c(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        C4527a.C0404a c0404aA = j.a();
        try {
            if (i == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                NG1 ng1 = NG1.DEBUG;
                logger.a(ng1, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                C4491b c4491b = new C4491b(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C4513y(this, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.d);
                i = c4491b;
                c4491b.start();
                sentryAndroidOptions.getLogger().a(ng1, "AnrIntegration installed.", new Object[0]);
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4527a.C0404a c0404aA = this.g.a();
        try {
            this.e = true;
            c0404aA.close();
            C4527a.C0404a c0404aA2 = j.a();
            try {
                C4491b c4491b = i;
                if (c4491b != null) {
                    c4491b.interrupt();
                    i = null;
                    C2688aH1 c2688aH1 = this.h;
                    if (c2688aH1 != null) {
                        c2688aH1.getLogger().a(NG1.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                c0404aA2.close();
            } catch (Throwable th) {
                try {
                    c0404aA2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c0404aA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        this.h = c2688aH1;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c2688aH1;
        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.j.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new com.appsflyer.internal.m(1, this, sentryAndroidOptions));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(NG1.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }
}

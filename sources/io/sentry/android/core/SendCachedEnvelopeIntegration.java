package io.sentry.android.core;

import defpackage.C2688aH1;
import defpackage.C6944uF1;
import defpackage.EnumC5932pS;
import defpackage.InterfaceC4761js0;
import defpackage.InterfaceC7154vF1;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.SD1;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class SendCachedEnvelopeIntegration implements OB0, InterfaceC4761js0.b, Closeable {

    @NotNull
    public final InterfaceC7154vF1 d;

    @NotNull
    public final io.sentry.util.l<Boolean> e;

    @Nullable
    public InterfaceC4761js0 h;

    @Nullable
    public SD1 i;

    @Nullable
    public SentryAndroidOptions j;

    @Nullable
    public C6944uF1 k;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean m = new AtomicBoolean(false);

    @NotNull
    public final C4527a n = new C4527a();

    public SendCachedEnvelopeIntegration(@NotNull InterfaceC7154vF1 interfaceC7154vF1, @NotNull io.sentry.util.l<Boolean> lVar) {
        this.d = interfaceC7154vF1;
        this.e = lVar;
    }

    @Override // defpackage.InterfaceC4761js0.b
    public final void c(@NotNull InterfaceC4761js0.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        SD1 sd1 = this.i;
        if (sd1 == null || (sentryAndroidOptions = this.j) == null || aVar == InterfaceC4761js0.a.DISCONNECTED) {
            return;
        }
        f(sd1, sentryAndroidOptions);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.set(true);
        InterfaceC4761js0 interfaceC4761js0 = this.h;
        if (interfaceC4761js0 != null) {
            interfaceC4761js0.G0(this);
        }
    }

    public final void f(@NotNull final SD1 sd1, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        try {
            C4527a.C0404a c0404aA = this.n.a();
            try {
                Future<?> futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        SentryAndroidOptions sentryAndroidOptions2 = sentryAndroidOptions;
                        SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = this.d;
                        sendCachedEnvelopeIntegration.getClass();
                        try {
                            if (sendCachedEnvelopeIntegration.m.get()) {
                                sentryAndroidOptions2.getLogger().a(NG1.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                                return;
                            }
                            boolean andSet = sendCachedEnvelopeIntegration.l.getAndSet(true);
                            SD1 sd2 = sd1;
                            if (!andSet) {
                                InterfaceC4761js0 connectionStatusProvider = sentryAndroidOptions2.getConnectionStatusProvider();
                                sendCachedEnvelopeIntegration.h = connectionStatusProvider;
                                connectionStatusProvider.o0(sendCachedEnvelopeIntegration);
                                sendCachedEnvelopeIntegration.k = sendCachedEnvelopeIntegration.d.a(sd2, sentryAndroidOptions2);
                            }
                            InterfaceC4761js0 interfaceC4761js0 = sendCachedEnvelopeIntegration.h;
                            if (interfaceC4761js0 != null && interfaceC4761js0.J0() == InterfaceC4761js0.a.DISCONNECTED) {
                                sentryAndroidOptions2.getLogger().a(NG1.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                                return;
                            }
                            io.sentry.transport.l lVarH = sd2.h();
                            if (lVarH != null && lVarH.f(EnumC5932pS.All)) {
                                sentryAndroidOptions2.getLogger().a(NG1.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                                return;
                            }
                            C6944uF1 c6944uF1 = sendCachedEnvelopeIntegration.k;
                            if (c6944uF1 == null) {
                                sentryAndroidOptions2.getLogger().a(NG1.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                            } else {
                                c6944uF1.a();
                            }
                        } catch (Throwable th) {
                            sentryAndroidOptions2.getLogger().d(NG1.ERROR, "Failed trying to send cached events.", th);
                        }
                    }
                });
                if (this.e.a().booleanValue() && this.g.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().a(NG1.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
        }
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 c2688aH1) {
        SD1 sd1 = SD1.a;
        this.i = sd1;
        SentryAndroidOptions sentryAndroidOptions = c2688aH1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2688aH1 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.j = sentryAndroidOptions;
        String cacheDirPath = c2688aH1.getCacheDirPath();
        ILogger logger = c2688aH1.getLogger();
        this.d.getClass();
        if (!InterfaceC7154vF1.b(cacheDirPath, logger)) {
            c2688aH1.getLogger().a(NG1.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.j.a("SendCachedEnvelope");
            f(sd1, this.j);
        }
    }
}

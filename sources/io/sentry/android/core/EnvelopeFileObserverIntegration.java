package io.sentry.android.core;

import defpackage.C2688aH1;
import defpackage.C7638xa1;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.RunnableC1212Ii;
import defpackage.SD1;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EnvelopeFileObserverIntegration implements OB0, Closeable {

    @Nullable
    public L d;

    @Nullable
    public ILogger e;
    public boolean g = false;

    @NotNull
    public final C4527a h = new C4527a();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i) {
            this();
        }
    }

    public final void c(@NotNull C2688aH1 c2688aH1, @NotNull String str) {
        L l = new L(str, new C7638xa1(SD1.a, c2688aH1.getEnvelopeReader(), c2688aH1.getSerializer(), c2688aH1.getLogger(), c2688aH1.getFlushTimeoutMillis(), c2688aH1.getMaxQueueSize()), c2688aH1.getLogger(), c2688aH1.getFlushTimeoutMillis());
        this.d = l;
        try {
            l.startWatching();
            c2688aH1.getLogger().a(NG1.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.j.a("EnvelopeFileObserver");
        } catch (Throwable th) {
            c2688aH1.getLogger().d(NG1.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4527a.C0404a c0404aA = this.h.a();
        try {
            this.g = true;
            c0404aA.close();
            L l = this.d;
            if (l != null) {
                l.stopWatching();
                ILogger iLogger = this.e;
                if (iLogger != null) {
                    iLogger.a(NG1.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
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
        this.e = c2688aH1.getLogger();
        String outboxPath = c2688aH1.getOutboxPath();
        if (outboxPath == null) {
            this.e.a(NG1.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.e.a(NG1.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            c2688aH1.getExecutorService().submit(new RunnableC1212Ii(this, c2688aH1, outboxPath, 3));
        } catch (Throwable th) {
            this.e.d(NG1.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }
}

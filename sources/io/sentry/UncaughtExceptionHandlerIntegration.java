package io.sentry;

import defpackage.C0841Do0;
import defpackage.C2688aH1;
import defpackage.EG1;
import defpackage.InterfaceC1249Iu0;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.QF1;
import defpackage.SD1;
import io.sentry.hints.d;
import io.sentry.hints.h;
import io.sentry.hints.m;
import io.sentry.hints.r;
import io.sentry.protocol.l;
import io.sentry.protocol.u;
import io.sentry.util.C4527a;
import io.sentry.util.g;
import io.sentry.util.j;
import java.io.Closeable;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UncaughtExceptionHandlerIntegration implements OB0, Thread.UncaughtExceptionHandler, Closeable {

    @NotNull
    public static final C4527a i = new C4527a();

    @Nullable
    public Thread.UncaughtExceptionHandler d;

    @Nullable
    public SD1 e;

    @Nullable
    public C2688aH1 g;
    public boolean h = false;

    public static class a extends d implements m, r {
        public final AtomicReference<u> d;

        public a(long j, @NotNull ILogger iLogger) {
            super(j, iLogger);
            this.d = new AtomicReference<>();
        }

        @Override // io.sentry.hints.f
        public final boolean f(@Nullable u uVar) {
            u uVar2 = this.d.get();
            return uVar2 != null && uVar2.equals(uVar);
        }

        @Override // io.sentry.hints.f
        public final void h(@NotNull u uVar) {
            this.d.set(uVar);
        }
    }

    public final void c(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NotNull HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            C2688aH1 c2688aH1 = this.g;
            if (c2688aH1 != null) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            C2688aH1 c2688aH2 = this.g;
            if (c2688aH2 != null) {
                c2688aH2.getLogger().a(NG1.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.d;
            if (this != uncaughtExceptionHandler2) {
                c(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.d = this.d;
            C2688aH1 c2688aH3 = this.g;
            if (c2688aH3 != null) {
                c2688aH3.getLogger().a(NG1.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4527a.C0404a c0404aA = i.a();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.d);
                C2688aH1 c2688aH1 = this.g;
                if (c2688aH1 != null) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                c(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
            }
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
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        SD1 sd1;
        SD1 sd2 = SD1.a;
        if (this.h) {
            c2688aH1.getLogger().a(NG1.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.h = true;
        this.e = sd2;
        this.g = c2688aH1;
        ILogger logger = c2688aH1.getLogger();
        NG1 ng1 = NG1.DEBUG;
        logger.a(ng1, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.g.isEnableUncaughtExceptionHandler()));
        if (this.g.isEnableUncaughtExceptionHandler()) {
            C4527a.C0404a c0404aA = i.a();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.g.getLogger().a(ng1, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (!(defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) || (sd1 = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).e) == null) {
                        this.d = defaultUncaughtExceptionHandler;
                    } else {
                        InterfaceC1249Iu0 interfaceC1249Iu0 = QF1.a;
                        sd1.getClass();
                        this.d = uncaughtExceptionHandlerIntegration.d;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                c0404aA.close();
                this.g.getLogger().a(ng1, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                j.a("UncaughtExceptionHandler");
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        u uVar;
        C2688aH1 c2688aH1 = this.g;
        if (c2688aH1 == null || this.e == null) {
            return;
        }
        c2688aH1.getLogger().a(NG1.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.g.getFlushTimeoutMillis(), this.g.getLogger());
            l lVar = new l();
            lVar.h = Boolean.FALSE;
            lVar.d = "UncaughtExceptionHandler";
            EG1 eg1 = new EG1(new io.sentry.exception.a(lVar, th, thread, false));
            eg1.y = NG1.FATAL;
            if (this.e.r() == null && (uVar = eg1.d) != null) {
                aVar.h(uVar);
            }
            C0841Do0 c0841Do0A = g.a(aVar);
            boolean zEquals = this.e.w(eg1, c0841Do0A).equals(u.e);
            h hVar = (h) c0841Do0A.c(h.class, "sentry:eventDropReason");
            if ((!zEquals || h.MULTITHREADED_DEDUPLICATION.equals(hVar)) && !aVar.e()) {
                this.g.getLogger().a(NG1.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", eg1.d);
            }
        } catch (Throwable th2) {
            this.g.getLogger().d(NG1.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.d != null) {
            this.g.getLogger().a(NG1.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.d.uncaughtException(thread, th);
        } else if (this.g.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}

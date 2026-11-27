package io.sentry.transport;

import defpackage.AbstractC3118cG1;
import defpackage.C0841Do0;
import defpackage.C2688aH1;
import defpackage.C3537eG1;
import defpackage.C7705xs1;
import defpackage.CG1;
import defpackage.EnumC5932pS;
import defpackage.InterfaceC3328dG1;
import defpackage.N7;
import defpackage.NG1;
import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.q;
import io.sentry.util.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    @NotNull
    public final k d;

    @NotNull
    public final io.sentry.cache.f e;

    @NotNull
    public final C2688aH1 g;

    @NotNull
    public final l h;

    @NotNull
    public final f i;

    @NotNull
    public final d j;

    @Nullable
    public volatile RunnableC0403b k;

    public static final class a implements ThreadFactory {
        public int d;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb = new StringBuilder("SentryAsyncConnection-");
            int i = this.d;
            this.d = i + 1;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: io.sentry.transport.b$b, reason: collision with other inner class name */
    public final class RunnableC0403b implements Runnable {

        @NotNull
        public final C3537eG1 d;

        @NotNull
        public final C0841Do0 e;

        @NotNull
        public final io.sentry.cache.f g;
        public final n.a h = new n.a(-1);

        public RunnableC0403b(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0, io.sentry.cache.f fVar) {
            p.b(c3537eG1, "Envelope is required.");
            this.d = c3537eG1;
            this.e = c0841Do0;
            p.b(fVar, "EnvelopeCache is required.");
            this.g = fVar;
        }

        public static /* synthetic */ void a(RunnableC0403b runnableC0403b, n nVar, q qVar) {
            b.this.g.getLogger().a(NG1.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(nVar.b()));
            qVar.b(nVar.b());
        }

        @NotNull
        public final n b() {
            C3537eG1 c3537eG1 = this.d;
            c3537eG1.a.h = null;
            io.sentry.cache.f fVar = this.g;
            C0841Do0 c0841Do0 = this.e;
            boolean zW = fVar.W(c3537eG1, c0841Do0);
            Object objB = c0841Do0.b("sentry:typeCheckHint");
            boolean zIsInstance = io.sentry.hints.f.class.isInstance(c0841Do0.b("sentry:typeCheckHint"));
            b bVar = b.this;
            if (zIsInstance && objB != null) {
                io.sentry.hints.f fVar2 = (io.sentry.hints.f) objB;
                if (fVar2.f(c3537eG1.a.d)) {
                    fVar2.c();
                    bVar.g.getLogger().a(NG1.DEBUG, "Disk flush envelope fired", new Object[0]);
                } else {
                    bVar.g.getLogger().a(NG1.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
                }
            }
            boolean zIsConnected = bVar.i.isConnected();
            C2688aH1 c2688aH1 = bVar.g;
            if (!zIsConnected) {
                Object objB2 = c0841Do0.b("sentry:typeCheckHint");
                boolean zIsInstance2 = io.sentry.hints.l.class.isInstance(c0841Do0.b("sentry:typeCheckHint"));
                n.a aVar = this.h;
                if (zIsInstance2 && objB2 != null) {
                    ((io.sentry.hints.l) objB2).c(true);
                    return aVar;
                }
                if (!zW) {
                    io.sentry.util.n.a(io.sentry.hints.l.class, objB2, c2688aH1.getLogger());
                    c2688aH1.getClientReportRecorder().b(io.sentry.clientreport.e.NETWORK_ERROR, c3537eG1);
                }
                return aVar;
            }
            C3537eG1 c3537eG1C = c2688aH1.getClientReportRecorder().c(c3537eG1);
            try {
                try {
                    c3537eG1C.a.h = N7.i(Double.valueOf(c2688aH1.getDateProvider().now().i() / 1000000.0d).longValue());
                    n nVarD = bVar.j.d(c3537eG1C);
                    if (nVarD.b()) {
                        fVar.Y0(c3537eG1);
                        return nVarD;
                    }
                    String str = "The transport failed to send the envelope with response code " + nVarD.a();
                    c2688aH1.getLogger().a(NG1.ERROR, str, new Object[0]);
                    if (nVarD.a() >= 400) {
                        fVar.Y0(c3537eG1);
                        if (nVarD.a() != 429) {
                            c2688aH1.getClientReportRecorder().b(io.sentry.clientreport.e.SEND_ERROR, c3537eG1C);
                        }
                    }
                    throw new IllegalStateException(str);
                } catch (IOException e) {
                    e = e;
                    Object objB3 = c0841Do0.b("sentry:typeCheckHint");
                    if (io.sentry.hints.l.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && objB3 != null) {
                        ((io.sentry.hints.l) objB3).c(true);
                    } else if (!zW) {
                        io.sentry.util.n.a(io.sentry.hints.l.class, objB3, c2688aH1.getLogger());
                        c2688aH1.getClientReportRecorder().b(io.sentry.clientreport.e.NETWORK_ERROR, c3537eG1C);
                    }
                    throw new IllegalStateException("Sending the event failed.", e);
                }
            } catch (IOException e2) {
                e = e2;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.k = this;
            n nVarB = this.h;
            try {
                nVarB = b();
                b.this.g.getLogger().a(NG1.DEBUG, "Envelope flushed", new Object[0]);
                C0841Do0 c0841Do0 = this.e;
                Object objB = c0841Do0.b("sentry:typeCheckHint");
                if (q.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && objB != null) {
                    a(this, nVarB, (q) objB);
                }
                b.this.k = null;
            } catch (Throwable th) {
                try {
                    b.this.g.getLogger().c(NG1.ERROR, th, "Envelope submission failed", new Object[0]);
                    throw th;
                } catch (Throwable th2) {
                    C0841Do0 c0841Do1 = this.e;
                    Object objB2 = c0841Do1.b("sentry:typeCheckHint");
                    if (q.class.isInstance(c0841Do1.b("sentry:typeCheckHint")) && objB2 != null) {
                        a(this, nVarB, (q) objB2);
                    }
                    b.this.k = null;
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public b(@NotNull C2688aH1 c2688aH1, @NotNull l lVar, @NotNull f fVar, @NotNull C7705xs1 c7705xs1) {
        int maxQueueSize = c2688aH1.getMaxQueueSize();
        final io.sentry.cache.f envelopeDiskCache = c2688aH1.getEnvelopeDiskCache();
        final ILogger logger = c2688aH1.getLogger();
        InterfaceC3328dG1 dateProvider = c2688aH1.getDateProvider();
        k kVar = new k(maxQueueSize, new a(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b.RunnableC0403b) {
                    b.RunnableC0403b runnableC0403b = (b.RunnableC0403b) runnable;
                    boolean zB = io.sentry.util.g.b(runnableC0403b.e, io.sentry.hints.e.class);
                    C0841Do0 c0841Do0 = runnableC0403b.e;
                    if (!zB) {
                        envelopeDiskCache.W(runnableC0403b.d, c0841Do0);
                    }
                    Object objB = c0841Do0.b("sentry:typeCheckHint");
                    if (q.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && objB != null) {
                        ((q) objB).b(false);
                    }
                    Object objB2 = c0841Do0.b("sentry:typeCheckHint");
                    if (io.sentry.hints.l.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && objB2 != null) {
                        ((io.sentry.hints.l) objB2).c(true);
                    }
                    logger.a(NG1.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        d dVar = new d(c2688aH1, c7705xs1, lVar);
        this.k = null;
        this.d = kVar;
        io.sentry.cache.f envelopeDiskCache2 = c2688aH1.getEnvelopeDiskCache();
        p.b(envelopeDiskCache2, "envelopeCache is required");
        this.e = envelopeDiskCache2;
        this.g = c2688aH1;
        this.h = lVar;
        p.b(fVar, "transportGate is required");
        this.i = fVar;
        this.j = dVar;
    }

    @Override // io.sentry.transport.e
    public final void I0(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0) {
        io.sentry.cache.f fVar;
        boolean z;
        C3537eG1 c3537eG1C;
        List listSingletonList;
        boolean zB = io.sentry.util.g.b(c0841Do0, io.sentry.hints.e.class);
        C2688aH1 c2688aH1 = this.g;
        io.sentry.cache.f fVar2 = this.e;
        if (zB) {
            fVar = g.d;
            c2688aH1.getLogger().a(NG1.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        } else {
            fVar = fVar2;
            z = false;
        }
        l lVar = this.h;
        lVar.getClass();
        List<CG1> list = c3537eG1.b;
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            C2688aH1 c2688aH2 = lVar.e;
            if (!zHasNext) {
                if (arrayList != null) {
                    c2688aH2.getLogger().a(NG1.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
                    ArrayList arrayList2 = new ArrayList();
                    for (CG1 cg1 : list) {
                        if (!arrayList.contains(cg1)) {
                            arrayList2.add(cg1);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        c2688aH2.getLogger().a(NG1.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                        Object objB = c0841Do0.b("sentry:typeCheckHint");
                        if (q.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && objB != null) {
                            ((q) objB).b(false);
                        }
                        Object objB2 = c0841Do0.b("sentry:typeCheckHint");
                        if (io.sentry.hints.l.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && objB2 != null) {
                            ((io.sentry.hints.l) objB2).c(false);
                        }
                        Object objB3 = c0841Do0.b("sentry:typeCheckHint");
                        if (io.sentry.hints.f.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) && objB3 != null) {
                            ((io.sentry.hints.f) objB3).c();
                            c2688aH2.getLogger().a(NG1.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                        }
                        c3537eG1C = null;
                    } else {
                        c3537eG1C = new C3537eG1(c3537eG1.a, arrayList2);
                    }
                } else {
                    c3537eG1C = c3537eG1;
                }
                if (c3537eG1C == null) {
                    if (z) {
                        fVar2.Y0(c3537eG1);
                        return;
                    }
                    return;
                }
                if (UncaughtExceptionHandlerIntegration.a.class.isInstance(c0841Do0.b("sentry:typeCheckHint"))) {
                    c3537eG1C = c2688aH1.getClientReportRecorder().c(c3537eG1C);
                }
                Future<?> futureSubmit = this.d.submit(new RunnableC0403b(c3537eG1C, c0841Do0, fVar));
                if (futureSubmit != null && futureSubmit.isCancelled()) {
                    c2688aH1.getClientReportRecorder().b(io.sentry.clientreport.e.QUEUE_OVERFLOW, c3537eG1C);
                    return;
                }
                Object objB4 = c0841Do0.b("sentry:typeCheckHint");
                if (!io.sentry.hints.g.class.isInstance(c0841Do0.b("sentry:typeCheckHint")) || objB4 == null) {
                    return;
                }
                ((io.sentry.hints.g) objB4).d();
                c2688aH1.getLogger().a(NG1.DEBUG, "Envelope enqueued", new Object[0]);
                return;
            }
            CG1 cg2 = (CG1) it.next();
            String itemType = cg2.a.i.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    listSingletonList = Collections.singletonList(EnumC5932pS.Attachment);
                    break;
                case "replay_video":
                    listSingletonList = Collections.singletonList(EnumC5932pS.Replay);
                    break;
                case "profile_chunk":
                    listSingletonList = Arrays.asList(EnumC5932pS.ProfileChunkUi, EnumC5932pS.ProfileChunk);
                    break;
                case "profile":
                    listSingletonList = Collections.singletonList(EnumC5932pS.Profile);
                    break;
                case "feedback":
                    listSingletonList = Collections.singletonList(EnumC5932pS.Feedback);
                    break;
                case "log":
                    listSingletonList = Collections.singletonList(EnumC5932pS.LogItem);
                    break;
                case "span":
                    listSingletonList = Collections.singletonList(EnumC5932pS.Span);
                    break;
                case "event":
                    listSingletonList = Collections.singletonList(EnumC5932pS.Error);
                    break;
                case "trace_metric":
                    listSingletonList = Collections.singletonList(EnumC5932pS.TraceMetric);
                    break;
                case "check_in":
                    listSingletonList = Collections.singletonList(EnumC5932pS.Monitor);
                    break;
                case "session":
                    listSingletonList = Collections.singletonList(EnumC5932pS.Session);
                    break;
                case "transaction":
                    listSingletonList = Collections.singletonList(EnumC5932pS.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(EnumC5932pS.Unknown);
                    break;
            }
            Iterator it2 = listSingletonList.iterator();
            while (it2.hasNext()) {
                if (lVar.f((EnumC5932pS) it2.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cg2);
                    c2688aH2.getClientReportRecorder().d(io.sentry.clientreport.e.RATELIMIT_BACKOFF, cg2);
                    break;
                }
            }
        }
    }

    @Override // io.sentry.transport.e
    public final void a(boolean z) {
        this.h.close();
        this.d.shutdown();
        this.g.getLogger().a(NG1.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            return;
        }
        try {
            long flushTimeoutMillis = this.g.getFlushTimeoutMillis();
            if (this.d.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.g.getLogger().a(NG1.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.d.shutdownNow();
            if (this.k != null) {
                this.d.getRejectedExecutionHandler().rejectedExecution(this.k, this.d);
            }
        } catch (InterruptedException unused) {
            this.g.getLogger().a(NG1.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(false);
    }

    @Override // io.sentry.transport.e
    public final void d(long j) {
        k kVar = this.d;
        kVar.getClass();
        try {
            m mVar = kVar.i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            mVar.getClass();
            mVar.a.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            kVar.g.d(NG1.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.e
    @NotNull
    public final l h() {
        return this.h;
    }

    @Override // io.sentry.transport.e
    public final boolean i() {
        boolean z;
        l lVar = this.h;
        lVar.getClass();
        lVar.d.getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = lVar.g;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((EnumC5932pS) it.next());
            if (date2 != null && !date.after(date2)) {
                z = true;
                break;
            }
        }
        k kVar = this.d;
        AbstractC3118cG1 abstractC3118cG1 = kVar.e;
        return (z || (abstractC3118cG1 != null && (kVar.h.now().e(abstractC3118cG1) > 2000000000L ? 1 : (kVar.h.now().e(abstractC3118cG1) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }
}

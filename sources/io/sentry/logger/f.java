package io.sentry.logger;

import defpackage.C2688aH1;
import defpackage.EnumC5932pS;
import defpackage.HG1;
import defpackage.NG1;
import defpackage.PF1;
import defpackage.PG1;
import defpackage.RG1;
import defpackage.YF1;
import io.sentry.transport.m;
import io.sentry.util.C4527a;
import io.sentry.util.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class f implements c {

    @NotNull
    public final C2688aH1 d;

    @NotNull
    public final YF1 e;

    @NotNull
    public final ConcurrentLinkedQueue g;

    @NotNull
    public final HG1 h;

    @Nullable
    public volatile Future<?> i;

    @NotNull
    public final C4527a j;
    public volatile boolean k;
    public volatile boolean l;

    @NotNull
    public final m m;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            do {
                fVar.e();
            } while (fVar.g.size() >= 100);
            C4527a.C0404a c0404aA = fVar.j.a();
            try {
                if (fVar.g.isEmpty()) {
                    fVar.k = false;
                } else {
                    fVar.g(true, false);
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
    }

    public f(@NotNull C2688aH1 c2688aH1, @NotNull YF1 yf1) {
        HG1 hg1 = new HG1(c2688aH1);
        this.j = new C4527a();
        this.k = false;
        this.l = false;
        this.m = new m();
        this.d = c2688aH1;
        this.e = yf1;
        this.g = new ConcurrentLinkedQueue();
        this.h = hg1;
    }

    @Override // io.sentry.logger.c
    public void a(boolean z) {
        this.l = true;
        if (z) {
            g(true, true);
            this.h.submit(new PF1(this, 3));
        } else {
            this.h.a(this.d.getShutdownTimeoutMillis());
            while (!this.g.isEmpty()) {
                e();
            }
        }
    }

    @Override // io.sentry.logger.c
    public final void b(@NotNull PG1 pg1) {
        if (this.l) {
            return;
        }
        if (m.a.a(this.m.a) < 1000) {
            m.a.b(this.m.a);
            this.g.offer(pg1);
            g(false, false);
        } else {
            io.sentry.clientreport.g clientReportRecorder = this.d.getClientReportRecorder();
            io.sentry.clientreport.e eVar = io.sentry.clientreport.e.QUEUE_OVERFLOW;
            clientReportRecorder.a(eVar, EnumC5932pS.LogItem);
            this.d.getClientReportRecorder().e(eVar, EnumC5932pS.LogByte, k.a(this.d.getSerializer(), this.d.getLogger(), pg1));
        }
    }

    @Override // io.sentry.logger.c
    public final void d(long j) {
        g(true, true);
        try {
            m mVar = this.m;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            mVar.getClass();
            mVar.a.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            this.d.getLogger().d(NG1.ERROR, "Failed to flush log events", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.g;
            PG1 pg1 = (PG1) concurrentLinkedQueue.poll();
            if (pg1 != null) {
                arrayList.add(pg1);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        RG1 rg1 = new RG1(arrayList);
        YF1 yf1 = this.e;
        yf1.getClass();
        try {
            yf1.v(yf1.n(rg1), null);
        } catch (IOException e) {
            yf1.b.getLogger().c(NG1.WARNING, e, "Capturing logs failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m mVar = this.m;
            mVar.getClass();
            int i2 = m.a.d;
            mVar.a.releaseShared(1);
        }
    }

    public final void g(boolean z, boolean z2) {
        if (!this.k || z) {
            C4527a.C0404a c0404aA = this.j.a();
            try {
                Future<?> future = this.i;
                if (z || future == null || future.isDone() || future.isCancelled()) {
                    this.k = true;
                    try {
                        this.i = this.h.c(new a(), z2 ? 0 : 5000);
                    } catch (RejectedExecutionException e) {
                        this.k = false;
                        this.d.getLogger().d(NG1.WARNING, "Logs batch processor flush task rejected", e);
                    }
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
    }
}

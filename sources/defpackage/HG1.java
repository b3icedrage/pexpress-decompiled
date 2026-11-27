package defpackage;

import io.sentry.util.C4527a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class HG1 implements InterfaceC1405Ku0 {

    @NotNull
    public final ScheduledThreadPoolExecutor a;

    @NotNull
    public final C4527a b;

    @NotNull
    public final GG1 c;

    @Nullable
    public final C2688aH1 d;

    public static final class a<T> implements Future<T> {
        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final T get(long j, @NotNull TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public static final class b implements ThreadFactory {
        public int d;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb = new StringBuilder("SentryExecutorServiceThreadFactory-");
            int i = this.d;
            this.d = i + 1;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public HG1(@NotNull ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, @Nullable C2688aH1 c2688aH1) {
        this.b = new C4527a();
        this.c = new GG1();
        this.a = scheduledThreadPoolExecutor;
        this.d = c2688aH1;
    }

    @Override // defpackage.InterfaceC1405Ku0
    public final void a(long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        C4527a.C0404a c0404aA = this.b.a();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
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

    @Override // defpackage.InterfaceC1405Ku0
    public final void b() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        try {
            scheduledThreadPoolExecutor.submit(new RunnableC2555Zd(this, 6));
        } catch (RejectedExecutionException e) {
            C2688aH1 c2688aH1 = this.d;
            if (c2688aH1 != null) {
                c2688aH1.getLogger().d(NG1.WARNING, "Prewarm task rejected from " + scheduledThreadPoolExecutor, e);
            }
        }
    }

    @Override // defpackage.InterfaceC1405Ku0
    @NotNull
    public final Future<?> c(@NotNull Runnable runnable, long j) {
        return this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.InterfaceC1405Ku0
    public final boolean isClosed() {
        C4527a.C0404a c0404aA = this.b.a();
        try {
            boolean zIsShutdown = this.a.isShutdown();
            c0404aA.close();
            return zIsShutdown;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1405Ku0
    @NotNull
    public final Future<?> submit(@NotNull Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        C2688aH1 c2688aH1 = this.d;
        if (c2688aH1 != null) {
            c2688aH1.getLogger().a(NG1.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new a();
    }

    public HG1(@Nullable C2688aH1 c2688aH1) {
        this(new ScheduledThreadPoolExecutor(1, new b()), c2688aH1);
    }

    public HG1() {
        this(new ScheduledThreadPoolExecutor(1, new b()), null);
    }
}

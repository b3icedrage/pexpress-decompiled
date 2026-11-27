package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: fX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledExecutorServiceC3796fX implements ScheduledExecutorService {
    public final ExecutorService d;
    public final ScheduledExecutorService e;

    public ScheduledExecutorServiceC3796fX(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.d = executorService;
        this.e = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.d.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.d.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new ScheduledFutureC4006gX(new ScheduledFutureC4006gX.b() { // from class: VW
            @Override // defpackage.ScheduledFutureC4006gX.b
            public final ScheduledFuture a(ScheduledFutureC4006gX.a aVar) {
                ScheduledExecutorServiceC3796fX scheduledExecutorServiceC3796fX = this.d;
                return scheduledExecutorServiceC3796fX.e.schedule(new RunnableC1212Ii((Object) scheduledExecutorServiceC3796fX, runnable, (Object) aVar, 1), j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC4006gX(new ScheduledFutureC4006gX.b() { // from class: XW
            @Override // defpackage.ScheduledFutureC4006gX.b
            public final ScheduledFuture a(final ScheduledFutureC4006gX.a aVar) {
                final ScheduledExecutorServiceC3796fX scheduledExecutorServiceC3796fX = this.d;
                final Runnable runnable2 = runnable;
                return scheduledExecutorServiceC3796fX.e.scheduleAtFixedRate(new Runnable() { // from class: aX
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScheduledExecutorServiceC3796fX scheduledExecutorServiceC3796fX2 = scheduledExecutorServiceC3796fX;
                        int i = 1;
                        scheduledExecutorServiceC3796fX2.d.execute(new QK(i, runnable2, aVar));
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC4006gX(new ScheduledFutureC4006gX.b() { // from class: YW
            @Override // defpackage.ScheduledFutureC4006gX.b
            public final ScheduledFuture a(ScheduledFutureC4006gX.a aVar) {
                ScheduledExecutorServiceC3796fX scheduledExecutorServiceC3796fX = this.d;
                return scheduledExecutorServiceC3796fX.e.scheduleWithFixedDelay(new RunnableC3167cX(scheduledExecutorServiceC3796fX, runnable, aVar, 0), j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.d.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.d.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return new ScheduledFutureC4006gX(new ZW(this, callable, j, timeUnit));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.d.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.d.submit(runnable);
    }
}

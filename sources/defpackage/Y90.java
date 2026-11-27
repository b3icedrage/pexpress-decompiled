package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Y90 extends X90 implements GW {

    @NotNull
    public final Executor g;

    public Y90(@NotNull Executor executor) {
        Method method;
        this.g = executor;
        Method method2 = WH.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = WH.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.GW
    public final void D(long j, @NotNull C6251qy c6251qy) {
        Executor executor = this.g;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC2029St1(this, c6251qy), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ED.d(c6251qy.i, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            c6251qy.v(new C4558iy(scheduledFutureSchedule));
        } else {
            RunnableC4420iV.n.D(j, c6251qy);
        }
    }

    @Override // defpackage.GW
    @NotNull
    public final A20 G(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        Executor executor = this.g;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ED.d(coroutineContext, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new C7947z20(scheduledFutureSchedule) : RunnableC4420iV.n.G(j, runnable, coroutineContext);
    }

    @Override // defpackage.DN
    public final void c1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            this.g.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ED.d(coroutineContext, cancellationException);
            C6266r20.c.c1(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.g;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof Y90) && ((Y90) obj).g == this.g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.g);
    }

    @Override // defpackage.DN
    @NotNull
    public final String toString() {
        return this.g.toString();
    }
}

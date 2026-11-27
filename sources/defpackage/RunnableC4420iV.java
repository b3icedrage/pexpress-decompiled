package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4420iV extends B80 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    @NotNull
    public static final RunnableC4420iV n;
    public static final long o;

    static {
        Long l;
        RunnableC4420iV runnableC4420iV = new RunnableC4420iV();
        n = runnableC4420iV;
        runnableC4420iV.u1(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        o = timeUnit.toNanos(l.longValue());
    }

    public final synchronized void D1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            B80.k.set(this, null);
            B80.l.set(this, null);
            notifyAll();
        }
    }

    @Override // defpackage.B80, defpackage.GW
    @NotNull
    public final A20 G(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return C7960z51.d;
        }
        long jNanoTime = System.nanoTime();
        B80.b bVar = new B80.b(runnable, j2 + jNanoTime);
        C1(jNanoTime, bVar);
        return bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EY1.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    D1();
                    if (B1()) {
                        return;
                    }
                    x1();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jV1 = v1();
                    if (jV1 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = o + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            D1();
                            if (B1()) {
                                return;
                            }
                            x1();
                            return;
                        }
                        if (jV1 > j2) {
                            jV1 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jV1 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            D1();
                            if (B1()) {
                                return;
                            }
                            x1();
                            return;
                        }
                        LockSupport.parkNanos(this, jV1);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            D1();
            if (!B1()) {
                x1();
            }
            throw th;
        }
    }

    @Override // defpackage.B80, defpackage.A80
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.C80
    @NotNull
    public final Thread x1() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(RunnableC4420iV.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.C80
    public final void y1(long j, @NotNull B80.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.B80
    public final void z1(@NotNull Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.z1(runnable);
    }
}

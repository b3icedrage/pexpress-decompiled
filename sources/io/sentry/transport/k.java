package io.sentry.transport;

import defpackage.AbstractC3118cG1;
import defpackage.InterfaceC3328dG1;
import defpackage.NG1;
import io.sentry.ILogger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends ThreadPoolExecutor {
    public final int d;

    @Nullable
    public AbstractC3118cG1 e;

    @NotNull
    public final ILogger g;

    @NotNull
    public final InterfaceC3328dG1 h;

    @NotNull
    public final m i;

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

    public k(int i, @NotNull b.a aVar, @NotNull io.sentry.transport.a aVar2, @NotNull ILogger iLogger, @NotNull InterfaceC3328dG1 interfaceC3328dG1) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), aVar, aVar2);
        this.e = null;
        this.i = new m();
        this.d = i;
        this.g = iLogger;
        this.h = interfaceC3328dG1;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(@NotNull Runnable runnable, @Nullable Throwable th) {
        m mVar = this.i;
        try {
            super.afterExecute(runnable, th);
        } finally {
            mVar.getClass();
            int i = m.a.d;
            mVar.a.releaseShared(1);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(@NotNull Runnable runnable) {
        m mVar = this.i;
        int iA = m.a.a(mVar.a);
        int i = this.d;
        ILogger iLogger = this.g;
        InterfaceC3328dG1 interfaceC3328dG1 = this.h;
        if (iA >= i) {
            this.e = interfaceC3328dG1.now();
            iLogger.a(NG1.WARNING, "Submit cancelled", new Object[0]);
            return new a();
        }
        m.a aVar = mVar.a;
        m.a.b(aVar);
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e) {
            aVar.releaseShared(1);
            this.e = interfaceC3328dG1.now();
            iLogger.d(NG1.WARNING, "Submit rejected by thread pool executor", e);
            return new a();
        }
    }
}

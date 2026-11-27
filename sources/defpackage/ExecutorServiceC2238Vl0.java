package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Vl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorServiceC2238Vl0 implements ExecutorService {
    public static final long e = TimeUnit.SECONDS.toMillis(10);
    public static volatile int g;
    public final ThreadPoolExecutor d;

    /* JADX INFO: renamed from: Vl0$a */
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: Vl0$a$a, reason: collision with other inner class name */
        public class C0166a extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new C0166a(runnable);
        }
    }

    /* JADX INFO: renamed from: Vl0$b */
    public static final class b implements ThreadFactory {
        public final a d;
        public final String e;
        public final c.a g;
        public final boolean h;
        public final AtomicInteger i;

        /* JADX INFO: renamed from: Vl0$b$a */
        public class a implements Runnable {
            public final /* synthetic */ Runnable d;

            public a(Runnable runnable) {
                this.d = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.h) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.d.run();
                } catch (Throwable th) {
                    bVar.g.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        b0.d("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        public b(a aVar, String str, boolean z) {
            c.a aVar2 = c.a;
            this.i = new AtomicInteger();
            this.d = aVar;
            this.e = str;
            this.g = aVar2;
            this.h = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            a aVar = new a(runnable);
            this.d.getClass();
            a.C0166a c0166a = new a.C0166a(aVar);
            c0166a.setName("glide-" + this.e + "-thread-" + this.i.getAndIncrement());
            return c0166a;
        }
    }

    /* JADX INFO: renamed from: Vl0$c */
    public interface c {
        public static final a a = new a();

        /* JADX INFO: renamed from: Vl0$c$a */
        public class a implements c {
        }
    }

    public ExecutorServiceC2238Vl0(ThreadPoolExecutor threadPoolExecutor) {
        this.d = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) {
        return this.d.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) {
        return this.d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) {
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

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        return this.d.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final Future<?> submit(@NonNull Runnable runnable) {
        return this.d.submit(runnable);
    }

    public final String toString() {
        return this.d.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) {
        return this.d.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) {
        return (T) this.d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.d.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.d.submit(callable);
    }
}

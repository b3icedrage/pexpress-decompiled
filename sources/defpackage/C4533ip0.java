package defpackage;

import io.sentry.util.C4527a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ip0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4533ip0 {

    @Nullable
    public static volatile C4533ip0 i;
    public final long a;

    @Nullable
    public volatile String b;
    public volatile long c;

    @NotNull
    public final AtomicBoolean d;

    @NotNull
    public final CallableC4074gp0 e;

    @NotNull
    public final ExecutorService f;
    public static final long g = TimeUnit.HOURS.toMillis(5);
    public static final long h = TimeUnit.SECONDS.toMillis(1);

    @NotNull
    public static final C4527a j = new C4527a();

    /* JADX INFO: renamed from: ip0$a */
    public static final class a implements ThreadFactory {
        public int d;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb = new StringBuilder("SentryHostnameCache-");
            int i = this.d;
            this.d = i + 1;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public C4533ip0() {
        CallableC4074gp0 callableC4074gp0 = new CallableC4074gp0();
        this.d = new AtomicBoolean(false);
        this.f = Executors.newSingleThreadExecutor(new a());
        this.a = g;
        this.e = callableC4074gp0;
        b();
    }

    @NotNull
    public static C4533ip0 a() {
        if (i == null) {
            C4527a.C0404a c0404aA = j.a();
            try {
                if (i == null) {
                    i = new C4533ip0();
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
        return i;
    }

    public final void b() {
        try {
            this.f.submit(new CallableC4284hp0(this, 0)).get(h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}

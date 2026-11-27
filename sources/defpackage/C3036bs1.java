package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: bs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3036bs1 {
    public final double a;
    public final double b;
    public final long c;
    public final int d;
    public final ArrayBlockingQueue e;
    public final ThreadPoolExecutor f;
    public final T42<AbstractC5713oP> g;
    public final X81 h;
    public int i;
    public long j;

    /* JADX INFO: renamed from: bs1$a */
    public final class a implements Runnable {
        public final AbstractC7603xP d;
        public final TaskCompletionSource<AbstractC7603xP> e;
        public final /* synthetic */ C3036bs1 g;

        public a(AbstractC7603xP abstractC7603xP, C3036bs1 c3036bs1, TaskCompletionSource taskCompletionSource) {
            this.g = c3036bs1;
            this.d = abstractC7603xP;
            this.e = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC7603xP abstractC7603xP = this.d;
            TaskCompletionSource<AbstractC7603xP> taskCompletionSource = this.e;
            C3036bs1 c3036bs1 = this.g;
            c3036bs1.b(abstractC7603xP, taskCompletionSource);
            ((AtomicInteger) c3036bs1.h.b).set(0);
            double dMin = Math.min(3600000.0d, Math.pow(c3036bs1.b, c3036bs1.a()) * (60000.0d / c3036bs1.a));
            String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d));
            Log.isLoggable("FirebaseCrashlytics", 3);
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public C3036bs1(T42<AbstractC5713oP> t42, C6326rJ1 c6326rJ1, X81 x81) {
        double d = c6326rJ1.d;
        long j = ((long) c6326rJ1.f) * 1000;
        this.a = d;
        this.b = c6326rJ1.e;
        this.c = j;
        this.g = t42;
        this.h = x81;
        int i = (int) d;
        this.d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.e = arrayBlockingQueue;
        this.f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.i = 0;
        this.j = 0L;
    }

    public final int a() {
        if (this.j == 0) {
            this.j = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.j) / this.c);
        int iMin = this.e.size() == this.d ? Math.min(100, this.i + iCurrentTimeMillis) : Math.max(0, this.i - iCurrentTimeMillis);
        if (this.i != iMin) {
            this.i = iMin;
            this.j = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final AbstractC7603xP abstractC7603xP, final TaskCompletionSource<AbstractC7603xP> taskCompletionSource) {
        abstractC7603xP.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        ((Y42) this.g).a(new C6850to(abstractC7603xP.a(), EnumC6825th1.g), new InterfaceC3710f52() { // from class: as1
            @Override // defpackage.InterfaceC3710f52
            public final void a(Exception exc) throws Throwable {
                C3036bs1 c3036bs1 = this;
                c3036bs1.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                boolean z = true;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                new Thread(new MK(2, c3036bs1, countDownLatch)).start();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                ExecutorService executorService = Ac2.a;
                boolean z2 = false;
                try {
                    long nanos = timeUnit.toNanos(2L);
                    long jNanoTime = System.nanoTime() + nanos;
                    while (true) {
                        try {
                            try {
                                countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                break;
                            } catch (Throwable th) {
                                th = th;
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        } catch (InterruptedException unused) {
                            nanos = jNanoTime - System.nanoTime();
                            z2 = true;
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    taskCompletionSource2.trySetResult(abstractC7603xP);
                } catch (Throwable th2) {
                    th = th2;
                    z = z2;
                }
            }
        });
    }
}

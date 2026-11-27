package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: bD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2899bD0 extends AbstractC4836kD1 {
    public static final FB1 b;
    public static final FB1 c;
    public static final TimeUnit d = TimeUnit.SECONDS;
    public static final c e;
    public static final a f;
    public final AtomicReference<a> a;

    /* JADX INFO: renamed from: bD0$a */
    public static final class a implements Runnable {
        public final long d;
        public final ConcurrentLinkedQueue<c> e;
        public final FH g;
        public final ScheduledExecutorService h;
        public final ScheduledFuture i;
        public final FB1 j;

        public a(long j, TimeUnit timeUnit, FB1 fb1) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.d = nanos;
            this.e = new ConcurrentLinkedQueue<>();
            this.g = new FH();
            this.j = fb1;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, C2899bD0.c);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.h = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.i = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.e;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (c cVar : concurrentLinkedQueue) {
                if (cVar.g > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(cVar)) {
                    this.g.d(cVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: bD0$b */
    public static final class b extends AbstractC4836kD1.b {
        public final a e;
        public final c g;
        public final AtomicBoolean h = new AtomicBoolean();
        public final FH d = new FH();

        public b(a aVar) {
            c cVar;
            c cVar2;
            this.e = aVar;
            if (aVar.g.e) {
                cVar2 = C2899bD0.e;
            } else {
                do {
                    if (aVar.e.isEmpty()) {
                        cVar = new c(aVar.j);
                        aVar.g.c(cVar);
                        break;
                    }
                    cVar = aVar.e.poll();
                } while (cVar == null);
                cVar2 = cVar;
            }
            this.g = cVar2;
        }

        @Override // defpackage.AbstractC4836kD1.b
        public final InterfaceC7316w20 a(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.d.e ? EnumC4810k60.d : this.g.d(runnable, j, timeUnit, this.d);
        }

        @Override // defpackage.InterfaceC7316w20
        public final void b() {
            if (this.h.compareAndSet(false, true)) {
                this.d.b();
                a aVar = this.e;
                aVar.getClass();
                long jNanoTime = System.nanoTime() + aVar.d;
                c cVar = this.g;
                cVar.g = jNanoTime;
                aVar.e.offer(cVar);
            }
        }
    }

    /* JADX INFO: renamed from: bD0$c */
    public static final class c extends A41 {
        public long g;

        public c(FB1 fb1) {
            super(fb1);
            this.g = 0L;
        }
    }

    static {
        c cVar = new c(new FB1("RxCachedThreadSchedulerShutdown"));
        e = cVar;
        cVar.b();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        FB1 fb1 = new FB1("RxCachedThreadScheduler", iMax, false);
        b = fb1;
        c = new FB1("RxCachedWorkerPoolEvictor", iMax, false);
        a aVar = new a(0L, null, fb1);
        f = aVar;
        aVar.g.b();
        ScheduledFuture scheduledFuture = aVar.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.h;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C2899bD0() {
        AtomicReference<a> atomicReference;
        FB1 fb1 = b;
        a aVar = f;
        this.a = new AtomicReference<>(aVar);
        a aVar2 = new a(60L, d, fb1);
        do {
            atomicReference = this.a;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                return;
            }
        } while (atomicReference.get() == aVar);
        aVar2.g.b();
        ScheduledFuture scheduledFuture = aVar2.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar2.h;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // defpackage.AbstractC4836kD1
    public final AbstractC4836kD1.b a() {
        return new b(this.a.get());
    }
}

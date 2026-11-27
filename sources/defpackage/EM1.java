package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class EM1 extends AbstractC4836kD1 {
    public static final FB1 b;
    public final AtomicReference<ScheduledExecutorService> a;

    public static final class a extends AbstractC4836kD1.b {
        public final ScheduledExecutorService d;
        public final FH e = new FH();
        public volatile boolean g;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.d = scheduledExecutorService;
        }

        @Override // defpackage.AbstractC4836kD1.b
        public final InterfaceC7316w20 a(Runnable runnable, long j, TimeUnit timeUnit) {
            boolean z = this.g;
            EnumC4810k60 enumC4810k60 = EnumC4810k60.d;
            if (z) {
                return enumC4810k60;
            }
            RunnableC4368iD1 runnableC4368iD1 = new RunnableC4368iD1(runnable, this.e);
            this.e.c(runnableC4368iD1);
            try {
                runnableC4368iD1.a(j <= 0 ? this.d.submit((Callable) runnableC4368iD1) : this.d.schedule((Callable) runnableC4368iD1, j, timeUnit));
                return runnableC4368iD1;
            } catch (RejectedExecutionException e) {
                b();
                EB1.b(e);
                return enumC4810k60;
            }
        }

        @Override // defpackage.InterfaceC7316w20
        public final void b() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.e.b();
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        b = new FB1("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public EM1() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.a = atomicReference;
        boolean z = C5679oD1.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, b);
        if (C5679oD1.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C5679oD1.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // defpackage.AbstractC4836kD1
    public final AbstractC4836kD1.b a() {
        return new a(this.a.get());
    }

    @Override // defpackage.AbstractC4836kD1
    public final InterfaceC7316w20 b(C1599Ng0.a aVar, long j, TimeUnit timeUnit) {
        CallableC4158hD1 callableC4158hD1 = new CallableC4158hD1(aVar);
        AtomicReference<ScheduledExecutorService> atomicReference = this.a;
        try {
            callableC4158hD1.a(j <= 0 ? atomicReference.get().submit(callableC4158hD1) : atomicReference.get().schedule(callableC4158hD1, j, timeUnit));
            return callableC4158hD1;
        } catch (RejectedExecutionException e) {
            EB1.b(e);
            return EnumC4810k60.d;
        }
    }
}

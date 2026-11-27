package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class A41 extends AbstractC4836kD1.b {
    public final ScheduledExecutorService d;
    public volatile boolean e;

    public A41(FB1 fb1) {
        boolean z = C5679oD1.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, fb1);
        if (C5679oD1.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C5679oD1.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.d = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // defpackage.AbstractC4836kD1.b
    public final InterfaceC7316w20 a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.e ? EnumC4810k60.d : d(runnable, j, timeUnit, null);
    }

    @Override // defpackage.InterfaceC7316w20
    public final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d.shutdownNow();
    }

    @Override // defpackage.AbstractC4836kD1.b
    public final void c(C1129Hg0.a aVar) {
        a(aVar, 0L, null);
    }

    public final RunnableC4368iD1 d(Runnable runnable, long j, TimeUnit timeUnit, InterfaceC7737y20 interfaceC7737y20) {
        RunnableC4368iD1 runnableC4368iD1 = new RunnableC4368iD1(runnable, interfaceC7737y20);
        if (interfaceC7737y20 == null || interfaceC7737y20.c(runnableC4368iD1)) {
            ScheduledExecutorService scheduledExecutorService = this.d;
            try {
                runnableC4368iD1.a(j <= 0 ? scheduledExecutorService.submit((Callable) runnableC4368iD1) : scheduledExecutorService.schedule((Callable) runnableC4368iD1, j, timeUnit));
                return runnableC4368iD1;
            } catch (RejectedExecutionException e) {
                if (interfaceC7737y20 != null) {
                    interfaceC7737y20.d(runnableC4368iD1);
                }
                EB1.b(e);
            }
        }
        return runnableC4368iD1;
    }
}

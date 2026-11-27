package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class OH extends AbstractC4836kD1 {
    public static final b b;
    public static final FB1 c;
    public static final int d;
    public static final c e;
    public final AtomicReference<b> a;

    public static final class a extends AbstractC4836kD1.b {
        public final DQ0 d;
        public final FH e;
        public final DQ0 g;
        public final c h;
        public volatile boolean i;

        public a(c cVar) {
            this.h = cVar;
            DQ0 dq0 = new DQ0();
            this.d = dq0;
            FH fh = new FH();
            this.e = fh;
            DQ0 dq1 = new DQ0();
            this.g = dq1;
            dq1.c(dq0);
            dq1.c(fh);
        }

        @Override // defpackage.AbstractC4836kD1.b
        public final InterfaceC7316w20 a(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.i ? EnumC4810k60.d : this.h.d(runnable, j, timeUnit, this.e);
        }

        @Override // defpackage.InterfaceC7316w20
        public final void b() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.g.b();
        }

        @Override // defpackage.AbstractC4836kD1.b
        public final void c(C1129Hg0.a aVar) {
            if (this.i) {
                return;
            }
            this.h.d(aVar, 0L, TimeUnit.MILLISECONDS, this.d);
        }
    }

    public static final class b {
        public final int a;
        public final c[] b;
        public long c;

        public b(int i, FB1 fb1) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(fb1);
            }
        }
    }

    public static final class c extends A41 {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        d = iAvailableProcessors;
        c cVar = new c(new FB1("RxComputationShutdown"));
        e = cVar;
        cVar.b();
        FB1 fb1 = new FB1("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        c = fb1;
        b bVar = new b(0, fb1);
        b = bVar;
        for (c cVar2 : bVar.b) {
            cVar2.b();
        }
    }

    public OH() {
        AtomicReference<b> atomicReference;
        FB1 fb1 = c;
        b bVar = b;
        this.a = new AtomicReference<>(bVar);
        b bVar2 = new b(d, fb1);
        do {
            atomicReference = this.a;
            if (atomicReference.compareAndSet(bVar, bVar2)) {
                return;
            }
        } while (atomicReference.get() == bVar);
        for (c cVar : bVar2.b) {
            cVar.b();
        }
    }

    @Override // defpackage.AbstractC4836kD1
    public final AbstractC4836kD1.b a() {
        c cVar;
        b bVar = this.a.get();
        int i = bVar.a;
        if (i == 0) {
            cVar = e;
        } else {
            long j = bVar.c;
            bVar.c = 1 + j;
            cVar = bVar.b[(int) (j % ((long) i))];
        }
        return new a(cVar);
    }

    @Override // defpackage.AbstractC4836kD1
    public final InterfaceC7316w20 b(C1599Ng0.a aVar, long j, TimeUnit timeUnit) {
        c cVar;
        b bVar = this.a.get();
        int i = bVar.a;
        if (i == 0) {
            cVar = e;
        } else {
            long j2 = bVar.c;
            bVar.c = 1 + j2;
            cVar = bVar.b[(int) (j2 % ((long) i))];
        }
        cVar.getClass();
        CallableC4158hD1 callableC4158hD1 = new CallableC4158hD1(aVar);
        ScheduledExecutorService scheduledExecutorService = cVar.d;
        try {
            callableC4158hD1.a(j <= 0 ? scheduledExecutorService.submit(callableC4158hD1) : scheduledExecutorService.schedule(callableC4158hD1, j, timeUnit));
            return callableC4158hD1;
        } catch (RejectedExecutionException e2) {
            EB1.b(e2);
            return EnumC4810k60.d;
        }
    }
}

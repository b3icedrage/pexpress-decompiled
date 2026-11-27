package defpackage;

import android.annotation.SuppressLint;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ZY0 {
    public static final C6170qb f = C6170qb.d();
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue<C6589sb> b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;

    @SuppressLint({"ThreadPoolCreation"})
    public ZY0() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue<>();
        this.c = runtime;
    }

    public final synchronized void a(long j, QZ1 qz1) {
        this.e = j;
        try {
            this.d = this.a.scheduleAtFixedRate(new P8(2, this, qz1), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f.f("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public final C6589sb b(QZ1 qz1) {
        if (qz1 == null) {
            return null;
        }
        long jA = qz1.a() + qz1.d;
        C6589sb.a aVarY = C6589sb.y();
        aVarY.p();
        C6589sb.w((C6589sb) aVarY.e, jA);
        Runtime runtime = this.c;
        int iB = Cc2.b((runtime.totalMemory() - runtime.freeMemory()) / 1024);
        aVarY.p();
        C6589sb.x((C6589sb) aVarY.e, iB);
        return aVarY.n();
    }
}

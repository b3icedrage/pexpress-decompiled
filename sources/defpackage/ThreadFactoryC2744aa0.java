package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: aa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2744aa0 implements ThreadFactory {
    public final /* synthetic */ String d;
    public final /* synthetic */ AtomicLong e;

    /* JADX INFO: renamed from: aa0$a */
    public class a extends AbstractRunnableC1467Lp {
        public final /* synthetic */ Runnable d;

        public a(Runnable runnable) {
            this.d = runnable;
        }

        @Override // defpackage.AbstractRunnableC1467Lp
        public final void a() {
            this.d.run();
        }
    }

    public ThreadFactoryC2744aa0(String str, AtomicLong atomicLong) {
        this.d = str;
        this.e = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        threadNewThread.setName(this.d + this.e.getAndIncrement());
        return threadNewThread;
    }
}

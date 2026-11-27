package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class Z90 {
    public static final a a = new a();

    public static class a implements ThreadFactory {
        public final ThreadFactory d = Executors.defaultThreadFactory();
        public final AtomicInteger e = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.d.newThread(runnable);
            if (!threadNewThread.isDaemon()) {
                threadNewThread.setDaemon(true);
            }
            threadNewThread.setName("logback-" + this.e.getAndIncrement());
            return threadNewThread;
        }
    }
}

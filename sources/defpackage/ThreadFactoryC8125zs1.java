package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: zs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC8125zs1 implements ThreadFactory {

    /* JADX INFO: renamed from: zs1$a */
    public static class a extends Thread {
        public final int d;

        public a(Runnable runnable) {
            super(runnable, "fonts-androidx");
            this.d = 10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.d);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}

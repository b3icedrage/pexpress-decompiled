package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class KI implements ThreadFactory {
    public final AtomicInteger d = new AtomicInteger(0);
    public final /* synthetic */ boolean e;

    public KI(boolean z) {
        this.e = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbF = C1039Gc0.f(this.e ? "WM.task-" : "androidx.work-");
        sbF.append(this.d.incrementAndGet());
        return new Thread(runnable, sbF.toString());
    }
}

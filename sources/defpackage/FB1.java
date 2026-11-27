package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class FB1 extends AtomicLong implements ThreadFactory {
    public final String d;
    public final int e;
    public final boolean g;

    public static final class a extends Thread {
    }

    public FB1(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.d + '-' + incrementAndGet();
        Thread aVar = this.g ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.e);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return C5807oq.b(new StringBuilder("RxThreadFactory["), this.d, "]");
    }

    public FB1(String str, int i, boolean z) {
        this.d = str;
        this.e = i;
        this.g = z;
    }
}

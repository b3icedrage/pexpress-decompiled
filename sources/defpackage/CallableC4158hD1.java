package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: hD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC4158hD1 extends AtomicReference<Future<?>> implements Callable<Void>, InterfaceC7316w20 {
    public static final FutureTask<Void> g;
    public static final FutureTask<Void> h;
    public final C1599Ng0.a d;
    public Thread e;

    static {
        C3636ek0.e eVar = C3636ek0.b;
        g = new FutureTask<>(eVar, null);
        h = new FutureTask<>(eVar, null);
    }

    public CallableC4158hD1(C1599Ng0.a aVar) {
        this.d = aVar;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == g) {
                return;
            }
            if (future2 == h) {
                future.cancel(this.e != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.InterfaceC7316w20
    public final void b() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == g || future == (futureTask = h) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.e != Thread.currentThread());
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask<Void> futureTask = g;
        this.e = Thread.currentThread();
        try {
            this.d.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.e = null;
        }
    }
}

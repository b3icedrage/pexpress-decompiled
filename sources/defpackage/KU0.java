package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class KU0<T> {
    public static final ExecutorService e = Executors.newCachedThreadPool();
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;
    public volatile JU0<T> d;

    public class a extends FutureTask<JU0<T>> {
        public a(Callable<JU0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            KU0 ku0 = KU0.this;
            if (isCancelled()) {
                return;
            }
            try {
                ku0.c(get());
            } catch (InterruptedException | ExecutionException e) {
                ku0.c(new JU0<>(e));
            }
        }
    }

    public KU0() {
        throw null;
    }

    public KU0(Callable<JU0<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (!z) {
            e.execute(new a(callable));
            return;
        }
        try {
            c(callable.call());
        } catch (Throwable th) {
            c(new JU0<>(th));
        }
    }

    public final synchronized void a(GU0 gu0) {
        Throwable th;
        try {
            JU0<T> ju0 = this.d;
            if (ju0 != null && (th = ju0.b) != null) {
                gu0.a(th);
            }
            this.b.add(gu0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(GU0 gu0) {
        T t;
        try {
            JU0<T> ju0 = this.d;
            if (ju0 != null && (t = ju0.a) != null) {
                gu0.a(t);
            }
            this.a.add(gu0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(JU0<T> ju0) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = ju0;
        this.c.post(new RunnableC6824th0(this, 1));
    }
}

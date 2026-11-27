package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class TH1 implements Executor {
    public final ExecutorService e;
    public Runnable g;
    public final ArrayDeque<a> d = new ArrayDeque<>();
    public final Object h = new Object();

    public static class a implements Runnable {
        public final TH1 d;
        public final Runnable e;

        public a(@NonNull TH1 th1, @NonNull Runnable runnable) {
            this.d = th1;
            this.e = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.e.run();
                synchronized (this.d.h) {
                    this.d.a();
                }
            } catch (Throwable th) {
                synchronized (this.d.h) {
                    this.d.a();
                    throw th;
                }
            }
        }
    }

    public TH1(@NonNull ExecutorService executorService) {
        this.e = executorService;
    }

    public final void a() {
        a aVarPoll = this.d.poll();
        this.g = aVarPoll;
        if (aVarPoll != null) {
            this.e.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        synchronized (this.h) {
            try {
                this.d.add(new a(this, runnable));
                if (this.g == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

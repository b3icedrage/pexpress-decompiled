package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.C5565nh0;
import defpackage.C6117qJ1;
import defpackage.PQ0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends c {
    public C6117qJ1<c.a> d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.d.j(worker.a());
            } catch (Throwable th) {
                worker.d.k(th);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ C6117qJ1 d;

        public b(C6117qJ1 c6117qJ1) {
            this.d = c6117qJ1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Worker.this.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
            } catch (Throwable th) {
                this.d.k(th);
            }
        }
    }

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public abstract c.a.C0243c a();

    @Override // androidx.work.c
    @NonNull
    public final PQ0<C5565nh0> getForegroundInfoAsync() {
        C6117qJ1 c6117qJ1 = new C6117qJ1();
        getBackgroundExecutor().execute(new b(c6117qJ1));
        return c6117qJ1;
    }

    @Override // androidx.work.c
    @NonNull
    public final PQ0<c.a> startWork() {
        this.d = new C6117qJ1<>();
        getBackgroundExecutor().execute(new a());
        return this.d;
    }
}

package defpackage;

import android.util.SparseArray;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class RO {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;

    public RO() {
        this.a = new C8092zj();
        this.b = new SparseArray();
        this.c = new HT0();
        this.d = new C8092zj();
    }

    public Task a(Callable callable) {
        Task taskContinueWith;
        synchronized (this.c) {
            taskContinueWith = ((Task) this.b).continueWith((ExecutorService) this.a, new PO(callable));
            this.b = taskContinueWith.continueWith((ExecutorService) this.a, new QO(0));
        }
        return taskContinueWith;
    }

    public Task b(Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.c) {
            taskContinueWithTask = ((Task) this.b).continueWithTask((ExecutorService) this.a, new PO(callable));
            this.b = taskContinueWithTask.continueWith((ExecutorService) this.a, new QO(0));
        }
        return taskContinueWithTask;
    }

    public RO(ExecutorService executorService) {
        this.b = Tasks.forResult(null);
        this.c = new Object();
        this.d = new ThreadLocal();
        this.a = executorService;
        executorService.execute(new OO(this));
    }
}

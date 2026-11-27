package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class on2 extends hn2 {
    public final /* synthetic */ TaskCompletionSource e;
    public final /* synthetic */ hn2 g;
    public final /* synthetic */ yn2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on2(yn2 yn2Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, hn2 hn2Var) {
        super(taskCompletionSource);
        this.h = yn2Var;
        this.e = taskCompletionSource2;
        this.g = hn2Var;
    }

    @Override // defpackage.hn2
    public final void a() {
        synchronized (this.h.f) {
            try {
                final yn2 yn2Var = this.h;
                final TaskCompletionSource taskCompletionSource = this.e;
                yn2Var.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: jn2
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        yn2 yn2Var2 = yn2Var;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (yn2Var2.f) {
                            yn2Var2.e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.h.k.getAndIncrement() > 0) {
                    this.h.b.c("Already connected to the service.", new Object[0]);
                }
                yn2.b(this.h, this.g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

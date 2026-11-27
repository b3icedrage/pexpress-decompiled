package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class hn2 implements Runnable {
    public final TaskCompletionSource d;

    public hn2() {
        this.d = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.d;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public hn2(TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
    }
}

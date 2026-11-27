package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: wm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC7477wm2 implements Runnable {
    public final TaskCompletionSource d;

    public AbstractRunnableC7477wm2() {
        this.d = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.d;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public AbstractRunnableC7477wm2(TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
    }
}

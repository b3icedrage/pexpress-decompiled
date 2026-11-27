package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: zm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8107zm2 extends AbstractRunnableC7477wm2 {
    public final /* synthetic */ TaskCompletionSource e;
    public final /* synthetic */ Zl2 g;
    public final /* synthetic */ Xl2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8107zm2(Xl2 xl2, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Zl2 zl2) {
        super(taskCompletionSource);
        this.h = xl2;
        this.e = taskCompletionSource2;
        this.g = zl2;
    }

    @Override // defpackage.AbstractRunnableC7477wm2
    public final void b() {
        synchronized (this.h.f) {
            try {
                final Xl2 xl2 = this.h;
                final TaskCompletionSource taskCompletionSource = this.e;
                xl2.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: ym2
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        Xl2 xl3 = xl2;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (xl3.f) {
                            xl3.e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.h.l.getAndIncrement() > 0) {
                    this.h.b.a("Already connected to the service.", new Object[0]);
                }
                Xl2.b(this.h, this.g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

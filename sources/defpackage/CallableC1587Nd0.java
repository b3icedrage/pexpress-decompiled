package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: Nd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1587Nd0 implements Callable<Void> {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C4192hP e;
    public final /* synthetic */ C7587xJ1 g;

    public CallableC1587Nd0(boolean z, C4192hP c4192hP, C7587xJ1 c7587xJ1) {
        this.d = z;
        this.e = c4192hP;
        this.g = c7587xJ1;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        if (!this.d) {
            return null;
        }
        C4192hP c4192hP = this.e;
        CallableC3353dP callableC3353dP = new CallableC3353dP(c4192hP, this.g);
        ExecutorService executorService = Ac2.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c4192hP.l.execute(new RunnableC7647xc2(callableC3353dP, taskCompletionSource));
        taskCompletionSource.getTask();
        return null;
    }
}

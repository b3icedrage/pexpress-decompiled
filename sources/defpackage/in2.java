package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class in2 extends hn2 {
    public final /* synthetic */ TaskCompletionSource e;
    public final /* synthetic */ String g;
    public final /* synthetic */ rn2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in2(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str, rn2 rn2Var) {
        super(taskCompletionSource);
        this.h = rn2Var;
        this.e = taskCompletionSource2;
        this.g = str;
    }

    @Override // defpackage.hn2
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.e;
        rn2 rn2Var = this.h;
        try {
            rn2Var.a.m.e(rn2Var.b, rn2.b(), new nn2(rn2Var, new fn2("OnCompleteUpdateCallback"), taskCompletionSource));
        } catch (RemoteException e) {
            rn2.e.b(e, "completeUpdate(%s)", this.g);
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}

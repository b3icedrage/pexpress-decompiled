package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class gn2 extends hn2 {
    public final /* synthetic */ String e;
    public final /* synthetic */ TaskCompletionSource g;
    public final /* synthetic */ rn2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn2(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str, rn2 rn2Var) {
        super(taskCompletionSource);
        this.h = rn2Var;
        this.e = str;
        this.g = taskCompletionSource2;
    }

    @Override // defpackage.hn2
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.g;
        rn2 rn2Var = this.h;
        String str = this.e;
        try {
            rn2Var.a.m.h(rn2Var.b, rn2.a(rn2Var, str), new pn2(rn2Var, taskCompletionSource, str));
        } catch (RemoteException e) {
            rn2.e.b(e, "requestUpdateInfo(%s)", str);
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}

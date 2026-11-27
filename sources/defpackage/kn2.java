package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public class kn2 extends Ym2 {
    public final fn2 b;
    public final TaskCompletionSource c;
    public final /* synthetic */ rn2 d;

    public kn2(rn2 rn2Var, fn2 fn2Var, TaskCompletionSource taskCompletionSource) {
        this.d = rn2Var;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.b = fn2Var;
        this.c = taskCompletionSource;
    }

    @Override // defpackage.bn2
    public void g(Bundle bundle) {
        this.d.a.c(this.c);
        this.b.c("onRequestInfo", new Object[0]);
    }

    @Override // defpackage.bn2
    public void i(Bundle bundle) {
        this.d.a.c(this.c);
        this.b.c("onCompleteUpdate", new Object[0]);
    }
}

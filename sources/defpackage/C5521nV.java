package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: nV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5521nV implements InterfaceC5056lH, Continuation {
    public final /* synthetic */ Object d;

    public /* synthetic */ C5521nV(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return new C5941pV((Context) c1480Lt1.a(Context.class), ((C1198Id0) c1480Lt1.a(C1198Id0.class)).d(), c1480Lt1.b(C7892yl1.a(InterfaceC4749jo0.class)), c1480Lt1.c(Ta2.class), (Executor) c1480Lt1.g((C7892yl1) this.d));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.d).countDown();
        return null;
    }
}

package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: loaded from: classes.dex */
public final class Zl2 extends AbstractRunnableC7477wm2 {
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Long g;
    public final /* synthetic */ TaskCompletionSource h;
    public final /* synthetic */ IntegrityTokenRequest i;
    public final /* synthetic */ C3437dm2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zl2(C3437dm2 c3437dm2, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.j = c3437dm2;
        this.e = bArr;
        this.g = l;
        this.h = taskCompletionSource2;
        this.i = integrityTokenRequest;
    }

    @Override // defpackage.AbstractRunnableC7477wm2
    public final void a(Exception exc) {
        if (exc instanceof Yl2) {
            super.a(new PB0(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.AbstractRunnableC7477wm2
    public final void b() {
        TaskCompletionSource taskCompletionSource = this.h;
        C3437dm2 c3437dm2 = this.j;
        try {
            c3437dm2.d.n.d(C3437dm2.a(c3437dm2, this.e, this.g), new BinderC3018bm2(c3437dm2, taskCompletionSource));
        } catch (RemoteException e) {
            C7266vm2 c7266vm2 = c3437dm2.a;
            Object[] objArr = {this.i};
            c7266vm2.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", C7266vm2.b(c7266vm2.a, "requestIntegrityToken(%s)", objArr), e);
            }
            taskCompletionSource.trySetException(new PB0(-100, e));
        }
    }
}

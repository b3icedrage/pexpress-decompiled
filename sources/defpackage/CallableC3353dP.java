package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: dP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3353dP implements Callable<Task<Void>> {
    public final /* synthetic */ EJ1 d;
    public final /* synthetic */ C4192hP e;

    public CallableC3353dP(C4192hP c4192hP, EJ1 ej1) {
        this.e = c4192hP;
        this.d = ej1;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        return C4192hP.a(this.e, this.d);
    }
}

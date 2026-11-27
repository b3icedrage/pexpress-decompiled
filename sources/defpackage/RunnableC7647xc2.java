package defpackage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: xc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7647xc2 implements Runnable {
    public final /* synthetic */ CallableC3353dP d;
    public final /* synthetic */ TaskCompletionSource e;

    /* JADX INFO: renamed from: xc2$a */
    public class a implements Continuation<Object, Void> {
        public a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public final Void then(@NonNull Task<Object> task) {
            boolean zIsSuccessful = task.isSuccessful();
            RunnableC7647xc2 runnableC7647xc2 = RunnableC7647xc2.this;
            if (zIsSuccessful) {
                runnableC7647xc2.e.setResult(task.getResult());
                return null;
            }
            runnableC7647xc2.e.setException(task.getException());
            return null;
        }
    }

    public RunnableC7647xc2(CallableC3353dP callableC3353dP, TaskCompletionSource taskCompletionSource) {
        this.d = callableC3353dP;
        this.e = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"TaskMainThread"})
    public final void run() {
        try {
            this.d.call().continueWith(new a());
        } catch (Exception e) {
            this.e.setException(e);
        }
    }
}

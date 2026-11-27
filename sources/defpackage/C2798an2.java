package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;

/* JADX INFO: renamed from: an2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2798an2 implements InterfaceC3208ci {
    public final rn2 a;
    public final Qm2 b;
    public final Context c;

    public C2798an2(rn2 rn2Var, Qm2 qm2, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = rn2Var;
        this.b = qm2;
        this.c = context;
    }

    @Override // defpackage.InterfaceC3208ci
    public final boolean a(C2999bi c2999bi, Activity activity) throws IntentSender.SendIntentException {
        byte b = (byte) (((byte) 1) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" appUpdateType");
            }
            if ((b & 2) == 0) {
                sb.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        new zn2();
        if (activity == null || c2999bi == null) {
            return false;
        }
        PendingIntent pendingIntent = c2999bi.c;
        if ((pendingIntent != null ? pendingIntent : null) == null || c2999bi.d) {
            return false;
        }
        c2999bi.d = true;
        activity.startIntentSenderForResult((pendingIntent != null ? pendingIntent : null).getIntentSender(), 1234, null, 0, 0, 0, null);
        return true;
    }

    @Override // defpackage.InterfaceC3208ci
    public final Task<Void> b() {
        String packageName = this.c.getPackageName();
        rn2 rn2Var = this.a;
        yn2 yn2Var = rn2Var.a;
        if (yn2Var == null) {
            Object[] objArr = {-9};
            fn2 fn2Var = rn2.e;
            fn2Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                b0.c("PlayCore", fn2.d(fn2Var.a, "onError(%d)", objArr));
            }
            return Tasks.forException(new NA0(-9));
        }
        rn2.e.c("completeUpdate(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        yn2Var.a().post(new on2(yn2Var, taskCompletionSource, taskCompletionSource, new in2(taskCompletionSource, taskCompletionSource, packageName, rn2Var)));
        return taskCompletionSource.getTask();
    }

    @Override // defpackage.InterfaceC3208ci
    public final Task<C2999bi> c() {
        String packageName = this.c.getPackageName();
        rn2 rn2Var = this.a;
        yn2 yn2Var = rn2Var.a;
        if (yn2Var == null) {
            Object[] objArr = {-9};
            fn2 fn2Var = rn2.e;
            fn2Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                b0.c("PlayCore", fn2.d(fn2Var.a, "onError(%d)", objArr));
            }
            return Tasks.forException(new NA0(-9));
        }
        rn2.e.c("requestUpdateInfo(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        yn2Var.a().post(new on2(yn2Var, taskCompletionSource, taskCompletionSource, new gn2(taskCompletionSource, taskCompletionSource, packageName, rn2Var)));
        return taskCompletionSource.getTask();
    }

    @Override // defpackage.InterfaceC3208ci
    public final synchronized void d(PA0 pa0) {
        Qm2 qm2 = this.b;
        synchronized (qm2) {
            qm2.a.c("registerListener", new Object[0]);
            qm2.d.add(pa0);
            qm2.a();
        }
    }

    @Override // defpackage.InterfaceC3208ci
    public final synchronized void e(PA0 pa0) {
        Qm2 qm2 = this.b;
        synchronized (qm2) {
            qm2.a.c("unregisterListener", new Object[0]);
            if (pa0 == null) {
                throw new NullPointerException("Unregistered Play Core listener should not be null.");
            }
            qm2.d.remove(pa0);
            qm2.a();
        }
    }
}

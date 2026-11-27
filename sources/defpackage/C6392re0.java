package defpackage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b0;
import io.sentry.util.l;
import io.sentry.util.m;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: re0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6392re0 implements SuccessContinuation, l.a {
    public final /* synthetic */ Object d;

    public /* synthetic */ C6392re0(C7022ue0 c7022ue0) {
        this.d = c7022ue0;
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        return Boolean.valueOf(m.a((SentryAndroidOptions) this.d, "androidx.core.view.ScrollingView"));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        final C7022ue0 c7022ue0 = (C7022ue0) this.d;
        final Task<C5272mI> taskB = c7022ue0.c.b();
        final Task<C5272mI> taskB2 = c7022ue0.d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(c7022ue0.b, new Continuation() { // from class: se0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                C5272mI c5272mI;
                final C7022ue0 c7022ue1 = c7022ue0;
                c7022ue1.getClass();
                Task task2 = taskB;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                C5272mI c5272mI2 = (C5272mI) task2.getResult();
                Task task3 = taskB2;
                if (task3.isSuccessful() && (c5272mI = (C5272mI) task3.getResult()) != null && c5272mI2.c.equals(c5272mI.c)) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                C5059lI c5059lI = c7022ue1.d;
                c5059lI.getClass();
                CallableC4639jI callableC4639jI = new CallableC4639jI(c5059lI, c5272mI2);
                Executor executor = c5059lI.a;
                return Tasks.call(executor, callableC4639jI).onSuccessTask(executor, new C4849kI(c5059lI, c5272mI2)).continueWith(c7022ue1.b, new Continuation() { // from class: te0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task4) {
                        boolean z;
                        C7022ue0 c7022ue2 = c7022ue1;
                        c7022ue2.getClass();
                        if (task4.isSuccessful()) {
                            C5059lI c5059lI2 = c7022ue2.c;
                            synchronized (c5059lI2) {
                                c5059lI2.c = Tasks.forResult(null);
                            }
                            AI ai = c5059lI2.b;
                            synchronized (ai) {
                                ai.a.deleteFile(ai.b);
                            }
                            if (task4.getResult() != null) {
                                JSONArray jSONArray = ((C5272mI) task4.getResult()).d;
                                C0574Ad0 c0574Ad0 = c7022ue2.a;
                                if (c0574Ad0 != null) {
                                    try {
                                        c0574Ad0.a(C7022ue0.b(jSONArray));
                                    } catch (I1 e) {
                                        b0.f("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                                    } catch (JSONException e2) {
                                        b0.d("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                                    }
                                }
                            } else {
                                b0.c("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                });
            }
        });
    }
}

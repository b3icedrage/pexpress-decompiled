package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class Xk2 {
    public static final String a = AS0.d("WorkerFactory");

    public abstract c a(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters);

    public final c b(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = a;
        c cVarA = a(context, str, workerParameters);
        if (cVarA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(c.class);
            } catch (Throwable th) {
                AS0.c().b(str2, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    cVarA = (c) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    AS0.c().b(str2, "Could not instantiate " + str, th2);
                }
            }
        }
        if (cVarA == null || !cVarA.isUsed()) {
            return cVarA;
        }
        throw new IllegalStateException(C4694ja0.a("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class B02 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final ZZ0 b;
    public final C6844tm0 c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final C7941z02 h;
    public final C8092zj e = new C8092zj();
    public boolean g = false;

    public B02(FirebaseMessaging firebaseMessaging, ZZ0 zz0, C7941z02 c7941z02, C6844tm0 c6844tm0, Context context, @NonNull ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = zz0;
        this.h = c7941z02;
        this.c = c6844tm0;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static <T> void a(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        C6844tm0 c6844tm0 = this.c;
        c6844tm0.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(c6844tm0.a(c6844tm0.c(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        C6844tm0 c6844tm0 = this.c;
        c6844tm0.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(c6844tm0.a(c6844tm0.c(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    public final boolean e() throws IOException {
        C7731y02 c7731y02A;
        byte b;
        while (true) {
            synchronized (this) {
                try {
                    c7731y02A = this.h.a();
                    if (c7731y02A == null) {
                        Log.isLoggable("FirebaseMessaging", 3);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = c7731y02A.b;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("S")) {
                    b = 0;
                } else {
                    b = -1;
                }
                String str2 = c7731y02A.a;
                if (b == 0) {
                    b(str2);
                    Log.isLoggable("FirebaseMessaging", 3);
                } else if (b != 1) {
                    Log.isLoggable("FirebaseMessaging", 3);
                } else {
                    c(str2);
                    Log.isLoggable("FirebaseMessaging", 3);
                }
                C7941z02 c7941z02 = this.h;
                synchronized (c7941z02) {
                    AK1 ak1 = c7941z02.a;
                    String str3 = c7731y02A.c;
                    synchronized (ak1.d) {
                        if (ak1.d.remove(str3)) {
                            ak1.e.execute(new RunnableC1290Ji(ak1, 2));
                        }
                    }
                }
                synchronized (this.e) {
                    try {
                        String str4 = c7731y02A.c;
                        if (this.e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.e.getOrDefault(str4, null);
                            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                            if (taskCompletionSource != null) {
                                taskCompletionSource.setResult(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.e.remove(str4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    b0.c("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    b0.c("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
    }

    public final void f(long j2) {
        this.f.schedule(new C02(this, this.a, this.b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        d(true);
    }
}

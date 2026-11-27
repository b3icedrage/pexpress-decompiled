package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.sentry.android.core.b0;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Rj2 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public Qj2 e;
    public boolean f;

    public static class a {
        public final Intent a;
        public final TaskCompletionSource<Void> b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public Rj2(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.d.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                Qj2 qj2 = this.e;
                if (qj2 == null || !qj2.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.f) {
                        this.f = true;
                        try {
                            if (!ConnectionTracker.getInstance().bindService(this.a, this.b, this, 65)) {
                                b0.c("FirebaseMessaging", "binding to the service failed");
                                this.f = false;
                                while (true) {
                                    ArrayDeque arrayDeque = this.d;
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                    } else {
                                        ((a) arrayDeque.poll()).b.trySetResult(null);
                                    }
                                }
                            }
                        } catch (SecurityException e) {
                            b0.d("FirebaseMessaging", "Exception while binding the service", e);
                        }
                    }
                    return;
                }
                Log.isLoggable("FirebaseMessaging", 3);
                this.e.a((a) this.d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Task<Void> b(Intent intent) {
        a aVar;
        Log.isLoggable("FirebaseMessaging", 3);
        aVar = new a(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        aVar.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new C0753Cl(scheduledThreadPoolExecutor.schedule(new RunnableC0675Bl(aVar, 1), (aVar.a.getFlags() & 268435456) != 0 ? Af2.a : 9000L, TimeUnit.MILLISECONDS), 2));
        this.d.add(aVar);
        a();
        return aVar.b.getTask();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f = false;
            if (iBinder instanceof Qj2) {
                this.e = (Qj2) iBinder;
                a();
                return;
            }
            b0.c("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((a) arrayDeque.poll()).b.trySetResult(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}

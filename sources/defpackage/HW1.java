package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class HW1 implements Runnable {
    public final long d;
    public final PowerManager.WakeLock e;
    public final FirebaseMessaging g;

    @VisibleForTesting
    @SuppressLint({"ThreadPoolCreation"})
    public final ThreadPoolExecutor h = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    @VisibleForTesting
    public static class a extends BroadcastReceiver {
        public HW1 a;

        public final void a() {
            Log.isLoggable("FirebaseMessaging", 3);
            this.a.g.d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            HW1 hw1 = this.a;
            if (hw1 != null && hw1.a()) {
                Log.isLoggable("FirebaseMessaging", 3);
                HW1 hw2 = this.a;
                hw2.g.getClass();
                FirebaseMessaging.b(hw2, 0L);
                this.a.g.d.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public HW1(FirebaseMessaging firebaseMessaging, long j) {
        this.g = firebaseMessaging;
        this.d = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.g.d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public final boolean b() throws IOException {
        try {
            if (this.g.a() == null) {
                b0.c("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                b0.e("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            b0.e("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            b0.e("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        C7794yI1 c7794yI1A = C7794yI1.a();
        FirebaseMessaging firebaseMessaging = this.g;
        boolean zC = c7794yI1A.c(firebaseMessaging.d);
        PowerManager.WakeLock wakeLock = this.e;
        if (zC) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.l = true;
                }
                if (!firebaseMessaging.k.d()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.l = false;
                    }
                    if (C7794yI1.a().c(firebaseMessaging.d)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (C7794yI1.a().b(firebaseMessaging.d) && !a()) {
                    a aVar = new a();
                    aVar.a = this;
                    aVar.a();
                    if (C7794yI1.a().c(firebaseMessaging.d)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.l = false;
                    }
                } else {
                    firebaseMessaging.f(this.d);
                }
                if (C7794yI1.a().c(firebaseMessaging.d)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                b0.c("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.l = false;
                    if (C7794yI1.a().c(firebaseMessaging.d)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (C7794yI1.a().c(firebaseMessaging.d)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}

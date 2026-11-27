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
import io.sentry.android.core.b0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class C02 implements Runnable {
    public static final Object j = new Object();
    public static Boolean k;
    public static Boolean l;
    public final Context d;
    public final ZZ0 e;
    public final PowerManager.WakeLock g;
    public final B02 h;
    public final long i;

    public class a extends BroadcastReceiver {
        public C02 a;

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            C02 c02 = this.a;
            if (c02 == null) {
                return;
            }
            if (c02.c()) {
                Log.isLoggable("FirebaseMessaging", 3);
                C02 c03 = this.a;
                c03.h.f.schedule(c03, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    public C02(B02 b02, Context context, ZZ0 zz0, long j2) {
        this.h = b02;
        this.d = context;
        this.i = j2;
        this.e = zz0;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (j) {
            try {
                Boolean bool = l;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                l = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (j) {
            try {
                Boolean bool = k;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                k = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.d.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        B02 b02 = this.h;
        Context context = this.d;
        boolean zB = b(context);
        PowerManager.WakeLock wakeLock = this.g;
        if (zB) {
            wakeLock.acquire(GK.a);
        }
        try {
            try {
                try {
                    b02.d(true);
                    if (!this.e.d()) {
                        b02.d(false);
                        if (!b(context)) {
                            return;
                        }
                    } else if (!a(context) || c()) {
                        if (b02.e()) {
                            b02.d(false);
                        } else {
                            b02.f(this.i);
                        }
                        if (!b(context)) {
                            return;
                        }
                    } else {
                        a aVar = new a();
                        aVar.a = this;
                        Log.isLoggable("FirebaseMessaging", 3);
                        context.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!b(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (IOException e) {
                    b0.c("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    b02.d(false);
                    if (b(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (b(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused2) {
        }
    }
}

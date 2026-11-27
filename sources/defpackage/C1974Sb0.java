package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Sb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class C1974Sb0 {
    public static final Object c = new Object();
    public static Rj2 d;
    public final Context a;
    public final ExecutorC4468ii1 b = new ExecutorC4468ii1();

    public C1974Sb0(Context context) {
        this.a = context;
    }

    public static Task<Integer> a(Context context, Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        if (C7794yI1.a().c(context)) {
            Rj2 rj2B = b(context);
            synchronized (Af2.b) {
                try {
                    if (Af2.c == null) {
                        WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                        Af2.c = wakeLock;
                        wakeLock.setReferenceCounted(true);
                    }
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        Af2.c.acquire(Af2.a);
                    }
                    rj2B.b(intent).addOnCompleteListener(new C6629sl(intent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            b(context).b(intent);
        }
        return Tasks.forResult(-1);
    }

    public static Rj2 b(Context context) {
        Rj2 rj2;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new Rj2(context);
                }
                rj2 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rj2;
    }

    @KeepForSdk
    public final Task<Integer> c(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zIsAtLeastO = PlatformVersion.isAtLeastO();
        final Context context = this.a;
        boolean z = zIsAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return a(context, intent);
        }
        ExecutorC4468ii1 executorC4468ii1 = this.b;
        return Tasks.call(executorC4468ii1, new Callable() { // from class: Qb0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                Context context2 = context;
                Intent intent2 = intent;
                C7794yI1 c7794yI1A = C7794yI1.a();
                c7794yI1A.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                c7794yI1A.d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (c7794yI1A) {
                    try {
                        str = c7794yI1A.a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                b0.c("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                b0.c("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    c7794yI1A.a = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    c7794yI1A.a = serviceInfo.name;
                                }
                                str = c7794yI1A.a;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if ((c7794yI1A.c(context2) ? Af2.b(context2, intent3) : context2.startService(intent3)) == null) {
                        b0.c("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    b0.c("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    b0.d("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).continueWithTask(executorC4468ii1, new C1896Rb0(context, intent));
    }
}

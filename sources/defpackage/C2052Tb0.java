package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.AppMeasurement;
import io.sentry.android.core.b0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Tb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2052Tb0 implements Application.ActivityLifecycleCallbacks {
    public final Set<Intent> d = Collections.newSetFromMap(new WeakHashMap());

    public static void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            b0.f("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    InterfaceC5746oa interfaceC5746oa = (InterfaceC5746oa) C1198Id0.c().b(InterfaceC5746oa.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (interfaceC5746oa != null) {
                        String string = bundle.getString("google.c.a.c_id");
                        interfaceC5746oa.h(string);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Payload.SOURCE, "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string);
                        interfaceC5746oa.e(AppMeasurement.FCM_ORIGIN, "_cmp", bundle2);
                    } else {
                        b0.e("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            UZ0.a("_no", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !this.d.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new RunnableC3446dq(this, intent));
        } else {
            a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.d.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
